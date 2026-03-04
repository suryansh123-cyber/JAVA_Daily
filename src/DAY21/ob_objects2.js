// Destructuring of an object 
let user = {
  name: "Aarav",
  age: 21,
  gender: "Male",
  city: "Delhi",
  email: "aarav@example.com"
};

// let a = user.name;
// let b = user.age;

// const {name,age} = user;
// console.log(name,age);

for(let values of Object.entries(user)){
    console.log(values);
}