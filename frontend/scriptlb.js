fetch("http://localhost:5000/api/intern/leaderboard")
    .then((Response) => Response.json())
    .then((data) => {
        const tableBody = document.getElementById("leaderboardBody");
        data.forEach((intern) => {
            const row = document.createElement("tr");
            row.innerHTML = 
                           `<td>${intern.name}</td>
                            <td>${intern.referralCode}</td>
                            <td>${intern.donationRaised}</td>`
                            ;
            tableBody.appendChild(row);
        });
    })
    .catch((error) => {
        console.error("Error fetching leaderboard data: ",error);
    });