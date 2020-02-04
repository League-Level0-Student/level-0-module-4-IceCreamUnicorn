void setup(){
        size(600,600);  
    PImage catMEME = loadImage("catMEME.jpeg");
     catMEME.resize(600,600);
    background(catMEME);
    
    }

    void draw(){
  fill(#FFFFFF);
  ellipse(225,225,75,75);
  ellipse(375,225,75,75);
  fill(#000000);
  ellipse(mouseX,mouseY,30,30);
  ellipse(mouseX+150,mouseY,30,30);
  

    }
