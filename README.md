
Built by https://www.blackbox.ai

---

```markdown
# Gestion de Collection

## Project Overview
Gestion de Collection is a web application designed to help users manage their personal collections of games, books, and DVDs. The application provides an intuitive interface for adding and editing items in your collection while allowing users to track and display their recent additions.

## Installation
To run this project locally, follow these steps:
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd gestion-de-collection
   ```
3. Open the `index.html` file in your web browser to start using the application.

## Usage
Once the application is loaded, you can:
- Navigate between different sections for managing games, books, and DVDs.
- Add new items to your collection by filling in the respective forms.
- View the total count of items in each category on the dashboard.
- The most recent items added to your collection will also be displayed on the dashboard.

## Features
- **Dashboard**: Overview of the total items in each category (Games, Books, DVDs).
- **CRUD Operations**: Create, Read, Update, Delete functionalities for managing your collection.
- **Dynamic Forms**: Forms for adding items with validation and user feedback notifications.
- **Persistent Storage**: Using `localStorage` to store user data, ensuring that your collection is saved across sessions.
- **Responsive Design**: Utilizes Tailwind CSS for a modern and responsive user interface.

## Dependencies
This project includes the following external libraries:
- [Tailwind CSS](https://tailwindcss.com/) - for styling.
- [Font Awesome](https://fontawesome.com/) - for icons.

## Project Structure
Here’s an overview of the project files and their purposes:

- `index.html`: The main dashboard page displaying the collection overview.
- `common.js`: Contains utility functions for handling localStorage and form validations.
- `games.html`: Page for managing the video game collection.
- `books.html`: Page for managing the book collection.
- `dvds.html`: Page for managing the DVD collection.
- `config.js`: Handles the platform configurations and saves them to localStorage.
- `platforms.html`: Page for managing available platforms for games.

### Folder Structure
```
.
├── index.html
├── common.js
├── config.js
├── games.html
├── books.html
├── dvds.html
└── platforms.html
```

## Contributing
Contributions are welcome! Feel free to submit a pull request or create an issue to discuss further enhancements or bug fixes.

## License
This project is licensed under the MIT License.

## Acknowledgements
- Thanks to Tailwind CSS for providing a fantastic UI framework.
- Thanks to Font Awesome for their vast collection of icons.
```