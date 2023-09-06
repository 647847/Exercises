function fetchMessages() {
    const response =  fetch("https://localhost:8080/getAllMessages");
    response.then(async(e)=>{
        let res=await e.json()
        console.log(res)
    })
}
async function send_data(data){
    const response=await fetch("https://localhost:8080/saveAMessage",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(data)
    })
    if(response.status==200){
        console.log("data saved")
    }
}
send_data({messageId:"1",sender:"John",receiver:"Tom",messageText:"Hello"})