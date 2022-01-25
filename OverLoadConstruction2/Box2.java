public class Box2 {
  double width;
  double height;
  double depth;

  // installation object with Object
  Box2(Box2 ob){
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
  // installation object with recived arguments
  Box2(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }
  // installation object when we does'nt recive arguments
  Box2(){
    width = -1;
    height = -1;
    depth = -1;
  }
  // installation Cube
  Box2(double len){
    width = depth = height = len;
  }
  // function that return Area of object
  double vol(){
    return width * height * depth;
  }
}
