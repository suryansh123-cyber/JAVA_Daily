// let arr = [1,2,5,8,2,4,6,9,20,10,11];
// arr.sort((a,b)=>a-b);
// console.log(arr);

let people = [{name:"Suryansh", age:20, gpa:6.73},
              {name:"aryan",age:21, gpa:6.02},
              {name:"kartikey",age:19, gpa:6.79}];

people.sort((a,b)=>a.age-b.age);

console.log(people);
