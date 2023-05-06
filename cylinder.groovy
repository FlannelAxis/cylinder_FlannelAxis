CSG simpleSyntax =new Cylinder(10,50).toCSG() // a one line Cylinder

//create a Cylinder
CSG myCylinder = new Cylinder(10, // Radius at the bottom
                      		20, // Radius at the top
                      		40, // Height
                      		(int)9 //resolution
                      		).toCSG()//convert to CSG to display                    			         ).toCSG()//convert to CSG to display 
                      		.movey(50)
  //create a Cylinder
CSG pyramid = new Cylinder(	20, // Radius at the bottom
                      		5, // Radius at the top
                      		40, // Height
                      		(int)8 //resolution
                      		).toCSG()//convert to CSG to display                    			 
                      		.movex(50)
   //create a Cylinder
CSG hex = new Hexagon(	25, // Flat to flat radius
                      		40 // Height
                      		).toCSG()//convert to CSG to display                    			 
                      		.movex(50)
                      		.movey(50)
 return [simpleSyntax,myCylinder ,pyramid,hex]