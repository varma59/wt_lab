function validateForm() {
    var name = document.forms["myForm"]["name"].value;
    if (name == "") {
      alert("Name must be filled out");
      return false;
    }
    var email = document.forms["myForm"]["email"].value;
    if (email == "") {
      alert("Email must be filled out");
      return false;
    }
    var password = document.forms["myForm"]["password"].value;
    if (password == "") {
      alert("Password must be filled out");
      return false;
    }
    var confirm_password = document.forms["myForm"]["confirm_password"].value;
   
}  