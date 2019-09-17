const imgDiv = document.getElementById("img");
var xmlhttp = new XMLHttpRequest();
var url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2000&page=1&api_key=e6qeMVwVAobScq3QGBBCsWdk4haOxrTmcBfB3RPI";
var data;
var i = 0;
var elem = document.createElement("img");

xmlhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
       data = JSON.parse(this.responseText);
       //console.log(data);
  }
};
xmlhttp.open("GET", url, true);
xmlhttp.send();

function getImages() {
  // TODO make me get some images!
  //console.log(data);
  for(; i< data.photos.length;){
    elem.src = data.photos[i].img_src;
    i++;
    break;
    //console.log(data.photos[i].img_src);
  }
   displayImages();
}

function displayImages() {
  // TODO make this display image(s) instead!
  elem.style.width="300px";
  elem.style.height="300px";
     //console.log(data.photos[i].img_src);
   console.log(i);
  imgDiv.appendChild(elem);
}
