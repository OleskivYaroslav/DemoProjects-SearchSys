function sumFromAtribute(evt){

    var evts=evt.getSource();
    var sum = document.getElementById('it3::content');
    
    var it1=evts.getProperty("x"); 
    var it2=evts.getProperty("y");
    console.log(it1 + " hello3 " + it2);
    var it3=it1+it2;    
    console.log("hello4 "+ it3);
    sum.value=5; 
    console.log("hello5");
}