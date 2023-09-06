function loadData()
{
 var xhtp=new XMLHttpRequest()
 xhtp.onreadystatechange=function(){
 if(this.readyState==4 && this.status==200)
        {
 console.log("status ready")
 console.log(this.responseText)
 var rest=this.responseText
 var data=JSON.parse(rest)
 for(d of data){
    console.log(d)
    document.getElementById("items").innerHTML+=d.userId+" "+d.userName+" "+d.emailId+" "+d.address+" "+d.prefferedPaymentMode+" "+d.mobile+"</br>"
 }
        }
    }
 xhtp.open("GET","http://localhost:8080/getallusers",true)
 xhtp.getResponseHeader("Content-Type","application/json")
 xhtp.send()
}


function savedata()
{

 var userId=document.getElementById("userid").value
 var userName=document.getElementById("username").value
 var emailId=document.getElementById("emailid").value
 var address=document.getElementById("address").value
 var prefferedPaymentMode=document.getElementById("prefferedpaymentmode").value
 var mobile=document.getElementById("mobile").value
 
 var itemobj={
    userId:"userId",
    userName:"userName",
    emailId:"emailId",
    address:"address",
   prefferedPaymentMode:"prefferedPaymentMode",
    mobile:"mobile"
    }

 var xhtp=new XMLHttpRequest();
 xhtp.onreadystatechange=function(){
 if(this.readyState==4 && this.status==201)
        {
 console.log(this.responseText)
        }
     }
 xhtp.open("POST","http://localhost:8080/getallusers")
 xhtp.setRequestHeader("Content-Type","application/json")
 xhtp.send(JSON.stringify(itemobj))

}