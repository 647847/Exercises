fs=require("fs")

function printMessage(){
    console.log("Hello world")
}

console.log("queue processing strated")
fs.readFile("myfile.txt",()=>{
    console.log("file read")
})

setTimeout(()=>{
    console.log("timer executed")
},4000)

setImmediate(()=>{
    console.log("Immediate")
})

const readable=fs.createReadStream("myfile.txt")
readable.on("close",()=>{
    console.log("readable stream closed")
})
readable.close()
/*setInterval(()=>{
    console.log("after every 2 secs")
},2000)*/
console.log("queue processing ended")
printMessage()