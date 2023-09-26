# Animal Adoption Center Management System

## Project Overview

The Animal Adoption Center Management System is a Java-based console application designed to streamline the process of adopting animals from an adoption center. This project provides a user-friendly interface for adopting various types of animals, such as dogs, cats, birds, reptiles, and more. Additionally, it includes a volunteer application system to onboard potential volunteers.

## Features

- **User-Friendly Interface**: The application offers an easy-to-navigate console interface, making it accessible to a wide range of users.

- **Animal Adoption**: Users can browse through different animal categories, select specific breeds, and submit adoption requests, facilitating the adoption process.

- **Volunteer Application**: Aspiring volunteers can apply to join the adoption center's team by providing their personal details, qualifications, and preferences.

- **Data Persistence**: Animal breed information and volunteer applications are stored in separate text files, ensuring data persistence across sessions.

- **Input Validation**: The system incorporates input validation to handle user errors gracefully and provide a smooth user experience.

## File Structure

- `AnimalAdoption.java`: The main program that manages the adoption process and volunteer applications.

- `VolunteerApplication.java`: Handles the volunteer application system.

- `SelectionAdopt.java`: Manages animal category selection and adoption procedures.

- `Makefile`: Includes clean and run commands for easy project management.

- `*.txt` Files: Text files containing animal breed information (e.g., `DogBreeds.txt`, `CatBreeds.txt`) and volunteer applications (`Volunteers.txt`).

## Getting Started

1. Clone this repository to your local machine.
   
2. Open a terminal and navigate to the project directory.

3. Run the following command to compile and execute the program:

   ```shell
   make run
