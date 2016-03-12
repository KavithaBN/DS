function constructQuery(questionNo){
	var answer;
	var valArray = getQueryString(document.location.href);
	var url;
	switch(questionNo)
	{
		case 1:
			answer = getAnswer();
			if(answer  != 0)
			{
				if(answer == document.getElementById('correct').getAttribute("data-correct"))	valArray[2]++;
				valArray[1]++;
			}
			url='Question2.html?name='+valArray[0]+'&qa='+valArray[1]+'&qc='+valArray[2]+'&ra='+valArray[3]+'&rc='+valArray[4]+'&va='+valArray[5]+'&vc='+valArray[6];
			break;
			
		case 2:
			answer = getAnswer();
			if(answer  != 0)
			{
				if(answer == 1)	valArray[2]++;
				valArray[1]++;
			}
			url='Question3.html?name='+valArray[0]+'&qa='+valArray[1]+'&qc='+valArray[2]+'&ra='+valArray[3]+'&rc='+valArray[4]+'&va='+valArray[5]+'&vc='+valArray[6];
			break;
			
		case 3:	
			answer1 = getAnswer1();
			if(answer1 != 0)
			{
				if(answer1 == document.getElementById('correct1').getAttribute("data-correct1"))	valArray[4]++;
				valArray[3]++;
			}
			answer2 = getAnswer2();
			if(answer2 != 0)
			{
				if(answer2 == document.getElementById('correct2').getAttribute("data-correct2"))	valArray[4]++;
				valArray[3]++;
			}
			url='Question4.html?name='+valArray[0]+'&qa='+valArray[1]+'&qc='+valArray[2]+'&ra='+valArray[3]+'&rc='+valArray[4]+'&va='+valArray[5]+'&vc='+valArray[6];
			break;
			
		case 4:	
			answer = getAnswer();
			if(answer  != 0)
			{
				if(answer == document.getElementById('correct').getAttribute("data-correct"))	valArray[6]++;
				valArray[5]++;
			}
			url='Survey.html?name='+valArray[0]+'&qa='+valArray[1]+'&qc='+valArray[2]+'&ra='+valArray[3]+'&rc='+valArray[4]+'&va='+valArray[5]+'&vc='+valArray[6];
			break;
		case 5:
			url='Result.html?name='+valArray[0]+'&qa='+valArray[1]+'&qc='+valArray[2]+'&ra='+valArray[3]+'&rc='+valArray[4]+'&va='+valArray[5]+'&vc='+valArray[6];
			break;
	}
	document.location.href = url;
}
function getAnswer(){
	var radioArray = document.getElementsByName('radioGroup');
	for(var i=0; i< radioArray.length; i++){
		if(radioArray[i].checked){
			return i+1
		}			
	}
	return 0;
}

function getAnswer1(){
	var radioArray = document.form1.option1;
	for(var i=0; i< radioArray.length; i++){
		if(radioArray[i].checked){
			return i+1
		}			
	}
	return 0;
}

function getAnswer2(){
	var radioArray = document.form1.option2;
	for(var i=0; i< radioArray.length; i++){
		if(radioArray[i].checked){
			return i+1
		}			
	}
	return 0;
}

function getQueryString(loc){
	var locArr = loc.split('?'), temp=[];
	var strArr = locArr[1].split('&');
	var valArray = [];
	for(var j=0; j<strArr.length; j++)
	{
		temp = strArr[j].split('=');
		valArray[j] = temp[1]; 
	}
	return valArray;
}

function displayOption1(){
	var radios = document.getElementsByClassName('option1');
	for(var i=0;i<radios.length;i++){
		radios[i].style.visibility = "visible";
	}
}
function displayOption2(){
	var radios = document.getElementsByClassName('option2');
	for(var i=0;i<radios.length;i++){
		radios[i].style.visibility = "visible";
	}
}
function populate1(){
	var radios1 = document.form1.option1;
	for(var i=0;i<radios1.length;i++){
		if(radios1[i].checked){
			document.getElementById('blank1').innerHTML = radios1[i].value;
		}
	}
}
function populate2(){
	var radios2 = document.form1.option2;
	for(var i=0;i<radios2.length;i++){
		if(radios2[i].checked){
			document.getElementById('blank2').innerHTML = radios2[i].value;
		}
	}
}
function populate(){
	var quantScore=0,readScore=0,videoScore=0;
	var valArray = getQueryString(document.location.href);
	document.getElementById('qa').innerHTML = valArray[1];
	document.getElementById('qc').innerHTML = valArray[2];
	document.getElementById('ra').innerHTML = valArray[3];
	document.getElementById('rc').innerHTML = valArray[4];
	document.getElementById('va').innerHTML = valArray[5];
	document.getElementById('vc').innerHTML = valArray[6];
	if(valArray[1]!=0 && valArray[3]!=0 && valArray[5]!=0) {
		quantScore = valArray[2]*100/valArray[1];
		readScore = valArray[4]*100/valArray[3];
		videoScore = valArray[6]*100/valArray[5];
	}
	document.getElementById('qs').innerHTML = quantScore;
	document.getElementById('rs').innerHTML = readScore;
	document.getElementById('vs').innerHTML = videoScore;
}