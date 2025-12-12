// function handleLogin(event){
//     event.preventDefault();

//     const username= document.getElementById("username").value;
//     localStorage.setItem("internName",username);

//     window.location.href = "dashboard.html";
// }
document.getElementById("login").addEventListener("submit", function(e){
    e.preventDefault();
    const email= document.getElementById("email").value;
    const name= document.getElementById("name").value;
    localStorage.setItem("name",name);
    localStorage.setItem("email",email);
    window.location.href="dashboard.html";
});