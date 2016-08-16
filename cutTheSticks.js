"use strict"
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// default HR input handling ////////////////////

function main() {
    var n = parseInt(readLine());
    var arr = readLine().split(' ');
    arr = arr.map(Number);
    
    while (arr.length > 0) {
        console.log(arr.length);
        arr = cut(arr);        
    }
}

function cut(arr) {
    var smallestStick = findMin(arr);
    for (var i = arr.length - 1; i >= 0; i--) {
        if (arr[i] === smallestStick) {
            arr.splice(i, 1);
        } else {
            arr[i] -= smallestStick;
        }
    }
    return arr;
}

function findMin(arr) {
    var smallestStick = 1000;
    for (let stickLength of arr) {
        if (stickLength < smallestStick) {
            smallestStick = stickLength;
        }
    }
    return smallestStick;
}
