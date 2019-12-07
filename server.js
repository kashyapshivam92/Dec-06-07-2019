const app = require("express")();
const axios = require("axios");


app.get("/", (req, res) => {
	axios.get("http://localhost:8080/hello")
	     .then(output => {
		res.end(output.data);	
	      });		
	//res.end("Hello World in Node JS");
});

app.listen(8000);
console.log("Server running in 8000");