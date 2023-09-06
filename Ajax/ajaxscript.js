function getdata(){
    var xhtp=new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200){
            console.log("status ready")
            var res=this.responseXML
            console.log(res)
          var itemlist=res.getElementsByTagName("itemname")
            console.log(itemlist)
        }
        
    }
    xhtp.open("GET","item.xml",true)
        xhtp.send()
}