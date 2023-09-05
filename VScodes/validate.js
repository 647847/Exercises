function formvalidation(){
    var username=document.getElementById("username").value
    var email=document.getElementById("email").value
    var password=document.getElementById("password").value
    if(username.trim().length==0||email.trim().length==0||password.trim().length==0){
        document.getElementById("errmsg").innerHTML="fields cannot be blank"
    }
}