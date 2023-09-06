var calculateSimpleInterest = (principal, rate, time) => (principal * rate * time) / 100;


var principalAmount = 1000; 
var interestRate = 5; 
var timePeriod = 2; 

var simpleInterest = calculateSimpleInterest(principalAmount, interestRate, timePeriod);
console.log(`Simple Interest: ${simpleInterest}`);