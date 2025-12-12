fetch("http://localhost:5000/api/intern").then(Response => Response.json())
.then(data => {
    document.getElementById("referral").innerText = data.referralCode;
    document.getElementById("donationAmount").innerText = data.donationRaised;
    document.getElementById("name").innerText = data.name;
}).catch(error => console.error("Error fetching data: " , error));
document.getElementById("email").textContent = localStorage.getItem("email");

    function copyReferral(){
        const referralCode= document.getElementById("referral").textContent;
        navigator.clipboard.writeText(referralCode).then(()=>{
        alert("Referral code copied to clipboard!");
        }).catch(err => {
            alert("Failed to copy: "+ err);
        });
    }
