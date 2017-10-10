function SumFromAttribute(evt)
{
console.log("hello1");
var evts=evt.getSource();
console.log("hello2");
var sum=  document.getElementById('it3::content'); 
console.log("hello3");
var it1=evts.getProperty("x"); 
console.log("hello4");
var it2=evts.getProperty("y"); 
console.log("hello5");
var it3=it1+it2;
console.log("hello6");
sum.value=it3; 
console.log("hello7");
} 