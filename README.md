# Bus-Management-Project-In-Java-Using GUI

# Project Description

The Bus Reservation System is a comprehensive application designed to facilitate the management of bus reservations. This system utilizes object-oriented programming (OOP) principles to create a robust and scalable solution, incorporating a graphical user interface (GUI) to enhance user experience. Developed in Java, the system enables users to book bus seats, manage user data, and handle reservations efficiently through an intuitive interface.

# Key Features

1. User Management: 
   - Admins can add, update, delete, and save user information.
   - User details include first name, last name, gender, seat class, departure date, departure point, destination, bus timings, and total seats.

2. Reservation Management:
   - Real-time seat booking with fare calculation based on seat class and the number of seats.
   - Data persistence using file storage to keep track of user reservations.

3. Graphical User Interface:
   - Developed using Swing, providing a responsive and user-friendly interface.
   - Separate windows for admin portal and login functionalities.

4. Data Storage:
   - User records are stored in a text file for simplicity and ease of access.

# Implementation Details

# AdminPortal Class

The `AdminPortal` class is a JFrame that provides functionalities for admins to manage user reservations. The interface includes various components like text fields, combo boxes, radio buttons, and buttons for CRUD operations.

Components:
  - JLabels for displaying text.
  - JTextFields for inputting user data.
  - JButtons for actions (Add, Save, Delete, Update).
  - JRadioButtons for selecting gender.
  - JComboBoxes for selecting seat class, departure date, departure point, destination, and bus timings.
  - JTable for displaying user records.

Actions:
  - Add: Adds a new user record to the table and calculates the fare based on seat class.
  - Save: Saves the current table data to a file.
  - Delete: Deletes a selected user record from the table.
  - Update: Updates an existing user record in the table.

# LoginFrame Class

The `LoginFrame` class provides a login interface for users to access the admin portal. It includes components for username and password input and buttons for login and clear actions.

Components:
  - JLabels for displaying text.
  - JTextField for username input.
  - JPasswordField for password input.
  - JButtons for actions (Login, Clear).
  - ImageIcon for displaying an image.

Actions:
  - Login: Validates the username and password to grant access to the admin portal.
  - Clear: Clears the input fields.

# Conclusion

The Bus Reservation System in Java exemplifies the use of OOP principles to create a maintainable and efficient application. The integration of a GUI enhances the user experience, making the system accessible and easy to use. This project serves as a comprehensive solution for bus reservation management, providing both administrative and user-facing functionalities.
