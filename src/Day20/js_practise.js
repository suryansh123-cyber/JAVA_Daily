// arrays practise 

let numbers = [1,2,3,4,5,6,7];

numbers[7] = 8;
console.log(numbers);

//to push any number at the end
numbers.push(9);
console.log(numbers);
//to push any number at the start
numbers.unshift(0);
console.log(numbers);
//to delete any number at the end
numbers.pop();
console.log(numbers);
//to delete any number at the start
numbers.shift();
console.log(numbers);
// to delete any number from middle
numbers.splice(4,2); // here 4 is the index and 2 is the number of element we want to delete
console.log(numbers);