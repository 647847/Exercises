/*async function getMessage(){
    return "Hello world"
}
var res1=getMessage()
res1.then((e)=>console.log(e))*/

async function checkage(age){
    if(age>=18){
        return "candidate can vote"
    }
    else{
        throw new Error()
    }
}
var res=checkage(20)
res.then((e)=>console.log(e))
.catch((e)=>console.log(e))
