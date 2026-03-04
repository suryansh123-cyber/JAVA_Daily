let arr = [1,3,6,8,3,1,3,5,5,756,756,86767];
// for(let i = 0; i<arr.length; i++){
//     console.log(arr[i]);
// // }

//for each loop helps in adding any function to an array
arr.forEach((elements)=>{
    console.log(elements*elements);
})


//Array from helps in creating a array from any object
let str = "Suryansh";
let arr2 = Array.from(str);
console.log(arr2);


//for of loop helps in printing all the elements of an array
// for(let i of arr){
//     console.log(i);
// }


// for in loop is used to print key of every array element

for (let i in arr){
    console.log(i); 
}                                         
