package practical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StudentRegistrationForm extends JFrame implements ActionListener {
    // Components
    private JLabel nameLabel, ageLabel, courseLabel;
    private JTextField nameTextField, ageTextField;
    private JComboBox<String> courseComboBox;
    private JButton submitButton;
    // Constructor
    public StudentRegistrationForm(){
// Frame Setup
        setTitle("Student Registration form ");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
// Initialize components
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        courseLabel = new JLabel("Course:");
        nameTextField = new JTextField();
        ageTextField = new JTextField();
        String[] courses = {"Select Course", "Computer Science", "BCA", "BBA", "B.VOC", "B.Sci",
                "B.Arch"};
        courseComboBox = new JComboBox<>(courses);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
// Add components to the frame
        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(courseLabel);
        add(courseComboBox);
        add(new JLabel()); // Empty label for layout purposes
        add(submitButton);
// Display the frame
        setVisible(true);
    }
    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submitButton){
// Handle submit button click
            String name = nameTextField.getText(), age = ageTextField.getText(), course = (String)
                    courseComboBox.getSelectedItem();
// Validating and displaying information
            if (name.isEmpty() || age.isEmpty() || course.equals("Select Course")){
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String message = "Registration Successful!\nName: " + name + "\nAge: " + age + "\nCourse: " + course;
                JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistrationForm());
    }
}
