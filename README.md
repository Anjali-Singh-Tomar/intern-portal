##  Intern Portal – Full Stack Project

This is a simple full stack *Intern Portal* project developed with:

* Frontend using HTML, CSS, and JavaScript
* Backend powered by Spring Boot (Java)

---

##  Features

###  Frontend (Located in frontend/)

*  *Login Page* (login.html) – Basic login layout (no real authentication)
*  *Dashboard Page* (dashboard.html) – Displays:

  * Intern Name
  * Referral Code
  * Total Donations Raised
  * Rewards (static data)
*  *Leaderboard Page* (leaderboard.html) – Displays ranked donation data

*Styling and Scripts:*

* stylefordashboard.css, styleforlogin.css, styleforlb.css
* scriptdb.js, scriptlogin.js, scriptlb.js


###  Backend (Located in backend/)

Built using *Spring Boot*:

* Provides mock/dummy REST APIs for:

  * Intern data (JSON)
  * Leaderboard entries

*Backend Structure:*

* src/ – Java source code
* pom.xml – Maven dependencies
* .gitignore, .project, etc. – Project config files


##  Tech Stack

| Layer           | Technology            |
| --------------- | --------------------- |
| Frontend        | HTML, CSS, JavaScript |
| Backend         | Java, Spring Boot     |
| Data            | Dummy JSON            |


##  Project Structure (Simplified)


internPortal/
├── frontend/
│   ├── dashboard.html
│   ├── leaderboard.html
│   ├── login.html
│   ├── script*.js
│   └── style*.css
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── other config files
└── README.md


---

##  Author

*  Anjali Singh
