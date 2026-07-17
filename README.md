# 🛍️ The Little Bag Shop

Welcome to **The Little Bag Shop**, a custom-built Java desktop application designed to streamline inventory tracking and user management for retail bag stores[cite: 1]. 

## ✨ Key Features & User Roles

### 👨‍💼 Manager Dashboard
* The Manager logs into the system[cite: 2] and completes secure verification[cite: 2].
* Once verified[cite: 2], the Manager accesses the central Manager Page[cite: 2].
* From this dashboard[cite: 2], the Manager has the authority to create new Cashier accounts[cite: 2, 4].
* The Manager can seamlessly add new bag details to the store's inventory[cite: 2, 4].
* The Manager can search for specific bags by category[cite: 4] and view comprehensive bag details[cite: 2, 4].
* The workflow concludes with a standard logout process[cite: 2].

### 🛒 Cashier Dashboard
* The Cashier logs into the application[cite: 3] and undergoes credential verification[cite: 3].
* Upon successful login[cite: 3], the Cashier is directed to the dedicated Cashier Page[cite: 3].
* The Cashier is equipped to view bag details[cite: 4] and add new bag entries[cite: 3, 4].
* The Cashier can efficiently search the bag inventory to assist customers[cite: 3, 4].
* The session concludes with a secure logout process[cite: 3].

## 🏗️ Technical Architecture

### Core Object Classes
* The `Bag` class maintains critical inventory data[cite: 4], including `Bag_Id`[cite: 4], `Bag_name`[cite: 4], `category`[cite: 4], `price`[cite: 4], and `stockQuantity`[cite: 4].
* The `Bag` class provides functional methods such as `viewDetails()`[cite: 4], `addBag()`[cite: 4], and `searchByCategory()`[cite: 4].
* The `User` class stores profile configurations including `Frist_Name`[cite: 4], `Last_Name`[cite: 4], `User_ID`[cite: 4], `User_Name`[cite: 4], and `Password`[cite: 4], supported by a `Register()` method[cite: 4].
* The `Manager` and `Casher` classes execute role-specific application logic[cite: 4], like `Login()`[cite: 4], `viewBagDetails()`[cite: 4], `addBagDetails()`[cite: 4], and `searchBags()`[cite: 4].

### Data Persistence & UI Assets
* Application data is reliably saved locally using standard `.txt` files[cite: 1].
* Store inventory records are managed and stored within `Item.txt`[cite: 1].
* User account details and credentials are saved in `User.txt`[cite: 1].
* The graphical interface utilizes custom visual assets stored in the `/Image` directory[cite: 1], including elements like `Logo.png`[cite: 1], `Catagary.png`[cite: 1], `Serach.png`[cite: 1], `Exit.png`[cite: 1], and `User.png`[cite: 1].

## 📊 Project Diagrams
For a deep dive into the system's software engineering design, please refer to the following architectural diagrams included in this repository:
* **System Use Cases:** See Untitled Diagram (5).jpg and Untitled Diagram (6).jpg to review the actor scopes.
* **Class Structure:** See Untitled Diagram (7).jpg to review the object-oriented design mapping.
* **Application Flow:** See Untitled Diagram (8).jpg for the Manager's sequence logic and Untitled Diagram (9).jpg for the Cashier's sequence logic.

---
*Developed by Dula | Software Engineering Undergraduate*
