import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.*;
import java.util.regex.*;

public class WalmartMatch extends JFrame {

    private JPanel mainPanel;
    private JTextField walmartProduct;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel imageLabel; // Declare imageLabel as a class member
    private BufferedImage image; // Store the original image
    private JButton submitButton; // Declare the submit button
    private JTextArea newTextArea; // Declare the new JTextArea

    public WalmartMatch() {
        // Initialize components and layout here
        mainPanel = new JPanel(new BorderLayout());
        walmartProduct = new JTextField();
        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        String placeholder = "Enter the Product You want to price match/special order";
        walmartProduct.setText(placeholder);

        walmartProduct.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (walmartProduct.getText().equals(placeholder)) {
                    walmartProduct.setText("");
                    walmartProduct.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (walmartProduct.getText().isEmpty()) {
                    walmartProduct.setText(placeholder);
                    walmartProduct.setForeground(Color.GRAY);
                }
            }
        });

        // Load the image
        try {
            image = ImageIO.read(new File("C:\\Users\\test\\Downloads\\walmartbanner.png"));
            imageLabel = new JLabel(new ImageIcon(image));
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel = new JLabel("Image not found");
        }

        // Initialize and configure the submit button
        submitButton = new JButton("Compare Product");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputFilePath = "C:\\Users\\test\\OneDrive\\Desktop\\Grocery Store\\output.txt";
                String outputFilePath = "C:\\Users\\test\\OneDrive\\Desktop\\Grocery Store\\filtered_output.txt";

                try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                     BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

                    // Patterns to match "name" and "linePrice" key-value pairs
                    Pattern namePattern = Pattern.compile("\"name\"\\s*:\\s*\"[^\"]*\"");
                    Pattern linePricePattern = Pattern.compile("\"linePrice\"\\s*:\\s*\"[^\"]*\"");

                    String line;
                    while ((line = reader.readLine()) != null) {
                        Matcher nameMatcher = namePattern.matcher(line);
                        Matcher linePriceMatcher = linePricePattern.matcher(line);

                        // Check if the line contains "name" and "milk"
                        if (nameMatcher.find() && line.toLowerCase().contains("milk")) {
                            writer.write(nameMatcher.group());
                            writer.newLine();
                        }

                        // Check if the line contains "linePrice"
                        if (linePriceMatcher.find()) {
                            writer.write(linePriceMatcher.group());
                            writer.newLine();
                        }
                    }
                    writer.flush(); // Ensure all data is written before continuing
                    System.out.println("Filtering complete. Check the filtered_output.txt file for results.");

                } catch (IOException i) {
                    i.printStackTrace();
                }

                // Then, update the GUI
                displayTextArea();

            }
        });

        // Add components to the panel
        mainPanel.add(walmartProduct, BorderLayout.NORTH);
        mainPanel.add(imageLabel, BorderLayout.CENTER); // Add the image
        mainPanel.add(submitButton, BorderLayout.SOUTH); // Add the button

        setContentPane(mainPanel);
        setTitle("Price Match Guarantee!");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Resize the image to match the width of the panel when the window is resized
        mainPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int width = mainPanel.getWidth();
                int height = (int) ((double) width / image.getWidth() * image.getHeight()); // Maintain aspect ratio
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(scaledImage));
            }
        });
    }

    private void displayTextArea() {
        if (newTextArea == null) {
            // Create and configure the new JTextArea
            newTextArea = new JTextArea();
            newTextArea.setEditable(false); // Make it non-editable if desired
            JScrollPane newScrollPane = new JScrollPane(newTextArea);

            // Load the content from the filtered_output.txt file
            String outputFilePath = "C:\\Users\\test\\OneDrive\\Desktop\\Grocery Store\\filtered_output.txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(outputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    newTextArea.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Remove the imageLabel and add the new JTextArea
            mainPanel.remove(imageLabel);
            mainPanel.add(newScrollPane, BorderLayout.CENTER);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WalmartMatch().setVisible(true);
            }
        });
    }
}