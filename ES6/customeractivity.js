var customer = {
    customerName: "Erric Sans",
    age: "23",
    address: "23 Old Baker Street",
    available_for_call: true,
  };
  
  var { customerName, age, address, available_for_call } = customer;
  
  console.log(`Destructured Customer Details:
  Customer Name: ${customerName}
  Age: ${age}
  Address: ${address}
  Available for Call: ${available_for_call}`);

  var numbers = [12, 23, 11, 19, 55];
var [num1, num2, num3, num4, num5] = numbers;

console.log(`Destructured Numbers: ${num1}, ${num2}, ${num3}, ${num4}, ${num5}`);