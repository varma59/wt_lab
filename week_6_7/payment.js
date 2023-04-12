function validateForm() {
    var cardNum = document.forms["myForm"]["cardnum"].value;
    var cardName = document.forms["myForm"]["cardname"].value;
    var expMonth = document.forms["myForm"]["expmonth"].value;
    var expYear = document.forms["myForm"]["expyear"].value;
    var cvv = document.forms["myForm"]["cvv"].value;
  
    if (cardNum == "") {
      alert("Please enter your card number");
      return false;
    }
    if (isNaN(cardNum)) {
      alert("Card number must be numeric");
      return false;
    }
    if (cardName == "") {
      alert("Please enter your name as it appears on your card");
      return false;
    }
    if (expMonth == "" || expYear == "") {
      alert("Please enter the expiration date");
      return false;
    }
    if (isNaN(expMonth) || isNaN(expYear)) {
      alert("Expiration date must be numeric");
      return false;
    }
    if (cvv == "") {
      alert("Please enter the CVV number");
      return false;
    }
    if (isNaN(cvv)) {
      alert("CVV must be numeric");
      return false;
    }
    alert("Payment successful!");
    return true;
  }
  