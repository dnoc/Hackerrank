"use strict"
for (let s of my_array) {
    if (s === reverse(s)) {
        console.log(s);
    }
}

function reverse(str) {
    return str.split("").reverse().join("");
}