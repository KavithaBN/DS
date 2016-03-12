/**
 * 
 */
(function(window) {
	'use strict';
	
	if(typeof(RegObj) === 'undefined'){
		window.RegObj = {};
	} else {
        console.log("RegObj already defined.");
    }
	
	RegObj.username 		= "";
	RegObj.email 			= "";
	RegObj.password 		= "";
	RegObj.dob 				= "";
	RegObj.dob_time  		= "";
	RegObj.dob_time_local 	= "";
	RegObj.ssn 				= "";
	RegObj.phone_no 		= "";
	RegObj.card_no 			= "";
	
	RegObj.toJSONString = function() {
		var regJSON  = JSON.stringify(RegObj);
		return regJSON;
	};
		
	RegObj.readFromJSONString = function(obj) {
		var RegObj = JSON.parse(obj);
		return RegObj;
	};
	
	RegObj.isPhoneNumberFormatValid = function() {
		var num = this.phone_no;
		var phoneRe = /\d{3}[\-]\d{3}[\-]\d{4}$/;
		   if(!num.match(phoneRe))
			   alert("Phone Number Format is not valid");
	};

	RegObj.isValidEmail = function() {
		var email  = this.email;
		var pattern= /[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/;
		if(!email.match(pattern))
			alert("Email Format is not valid");
	};
	
})(window);

	function saveToLocalStorage()
	{ 
		localStorage.setItem("regObjJSON",RegObj.toJSONString());
		readFromSessionStorage();
	}
	
	function saveToSessionStorage()
	{ 
		sessionStorage.setItem("regObjJSON",RegObj.toJSONString());
		saveToLocalStorage();
	}
	
	function readFromLocalStorage()
	{ 
		var regObjJSON = localStorage.getItem("regObjJSON");
		alert("Local Storage Values " + regObjJSON );
	}
	function readFromSessionStorage()
	{
		var regObjJSON = sessionStorage.getItem("regObjJSON");
		alert("Session Storage Values " + regObjJSON );
	}
	
	
	//Online offline events
	var isOnline = function () {
		alert("Welcome back online");
	};
	
	var isOffline = function () {
		saveToLocalStorage();
		alert("Sorry!! It seems you have gone offline. Don't worry your data is saved in Local Storage ");			
	};
	
	if (window.addEventListener) {
		window.addEventListener("online", isOnline, false);
		window.addEventListener("offline", isOffline, false);
	}
	else {
		document.body.ononline = isOnline;
		document.body.onoffline = isOffline;
	}	