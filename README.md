# 🛒 Amazon Test Automation

This project automates end-to-end test scenarios for an e-commerce website (using [Amazon.in](https://www.amazon.in) as a real-world example). It demonstrates functional UI testing, API testing, data-driven testing, and automation best practices using Selenium, TestNG, and Maven.

---

## 📌 Project Structure

amazon-automation/
├── pom.xml 
|── testng.xml 
|── src/ │ 
├── main/java/pages/ #Page Object Model classes 
├── main/java/utils/ # Utility classes (JSON reader, etc.) │
|─ test/java/tests/ # TestNG test cases (UI)  
├── test/java/apitests/ # API test cases (Rest Assured)  
|── test/resources/testdata/ # JSON Test Data



---

## 🧪 Test Scenarios Covered

### ✅ Authentication (Mock)
- Login with valid credentials
- Login with invalid credentials
- Logout functionality *(to be added)*

### ✅ Product Search & Filters
- Search by product name
- Apply category filter (e.g., Electronics)
- Validate sorting options (Price: Low to High)

### ✅ Product Page (Can be extended)
- Product title, image, description verification
- Ratings and review section

### ✅ Cart & Checkout *(To be added)*
- Add/Remove items from cart
- Checkout flow simulation

### ✅ API Testing
- Order status API using **REST Assured**

### ✅ Data-Driven Testing
- Reads product search keywords from JSON file (`searchProducts.json`)
- Easily extendable for Excel-based testing

---

## ⚙️ Technologies Used

| Component         | Tool / Library         |
|------------------|------------------------|
| Language          | Java                   |
| Automation        | Selenium WebDriver     |
| Test Framework    | TestNG                 |
| API Testing       | Rest Assured           |
| Data Management   | JSON                   |
| Build Tool        | Maven                  |
| Reporting         | Allure (integrated)    |
| Version Control   | Git / GitHub           |

---

## 📂 How to Run the Tests

### 🔧 Pre-requisites
- Java 11+
- Maven
- Chrome Browser + ChromeDriver
- Internet connection (for Amazon tests)

### 🏃‍♂️ Run Tests via Maven
```bash
mvn clean test
🔍 Run Specific Suite
bash
Copy
Edit
mvn test -DsuiteXmlFile=testng.xml
📈 Reports
Allure Reporting (optional, requires plugin setup):

bash
Copy
Edit
allure serve target/allure-results
📊 Sample Test Data (JSON)
src/test/resources/testdata/searchProducts.json

json
Copy
Edit
[
  { "keyword": "laptop" },
  { "keyword": "bluetooth speaker" },
  { "keyword": "fitness tracker" }
]
🧰 To Do / Future Enhancements
Real login/logout simulation (OTP/captcha handling)

Add-to-cart & order placement flow

Email confirmation check via Mail API

Jenkins CI/CD integration

Excel-based data-driven testing

Dockerize test environment

📸 Demo
Include a screen recording/gif of test execution here (recommended)

👨‍💻 Author
Umesh Pathak
QA Automation | Selenium | Java | TestNG | API | Product Enthusiast

