//CRUD Operations

//Create
let obj = {
    name:"suryansh",
    age:20,
    designation:"student",
    amount:2000
}
//Read
console.log(obj);

//Update
obj.amount = 34000;
obj.age = 21;
console.log(obj);

// Delete

delete obj.designation
console.log(obj);

// To access all the keys of an object
console.log(Object.keys(obj));
console.log(Object.values(obj));

// if we want both things but as single array element 
console.log(Object.entries(obj))

// Looping in objects

for(let num in obj){
    console.log(num, obj[num]);
}

