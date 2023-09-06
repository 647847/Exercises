



let numarray=[12,10,25,14,16]
let newarray=numarray.map((e)=>e*=e)
console.log(newarray)

let devices=["teleprinter","modem","router","swtich"]
let newarray1=devices.map((e)=>`<li>${e}</li>`)
document.write("<ul>")
for(x of newarray1){
    document.write(x)
}
document.write("</ul>")

let numbers=[12,23,11,19,55,27,100]
let filter_number=numbers.filter((e)=>e%2==0)
console.log(filter_number)

numbers.forEach((e)=>console.log(e))

let n=numbers.find((e)=>e>20)
console.log("found" +n)