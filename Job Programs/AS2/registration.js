		function initRegObj()
{
	RegObj.username 		=  document.form1.first.value + document.form1.last.value;
	RegObj.email 			=  document.form1.email.value;
	RegObj.password 		=  document.form1.password.value;
	RegObj.dob 				=  document.form1.dob.value;
	RegObj.dob_time  		=  document.form1.dob_time.value;
	RegObj.dob_time_local 	=  document.form1.dob_time_local.value;
	RegObj.ssn 				=  document.form1.ssn.value;
	RegObj.phone_no 		=  document.form1.phone_no.value;
	RegObj.card_no 			=  document.form1.card_no.value;
	
	saveToSessionStorage();
}

function validatePassword(){

	var password = document.getElementById("pwd");
	var	confirm_password = document.getElementById("cpwd");
	var message = document.getElementById('confirmMessage');
	message.style.visibility = "visibility";
	  if(password.value == confirm_password.value) {
		message.innerHTML = "Passwords  Match!"
		}
	  else{
		message.innerHTML = "Passwords do not Match!"
		cpwd.focus();
	  }	 
	  
	password.onChange = validatePassword;
	confirm_password.onKeyup = validatePassword;
}

if (!Modernizr.localstorage) {
		alert('This Browser Doesn\'t Support Local Storage.');
}

function checkPwdStrength(obj) {
	var strengthObj = document.getElementById("pwdStrength");
	strengthObj.style.visibility = "visible";
	var pwdVal = obj.value;
	var normalPattern = /(?=(.*[A-Z]){3,})(?=(.*[a-z]){2,})(?=(.*[@#$%]){2,})/;
	var mediumPattern = /(?=(.*[A-Z]){3,})(?=(.*[a-z]){2,})(?=(.*[@#$%]){3,5})/;
	var strongPattern = /(?=(.*[A-Z]){3,})(?=(.*[a-z]){2,})(?=(.*[@#$%]){6,})/;
	if(strongPattern.test(pwdVal)) {
		strengthObj.value = 100;
	} else if (mediumPattern.test(pwdVal)) {
		strengthObj.value = 50;
	} else if (normalPattern.test(pwdVal)) {
		strengthObj.value = 20;
	} else {
		strengthObj.style.visibility = "hidden";
		strengthObj.value = 0;
	}
}
