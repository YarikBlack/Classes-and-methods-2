public class Box {
    int width;
    int height;
    int depth;

    // Object Box with three parameters
    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    // Object Box when we don't recive arguments
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Construction using when we create Cube
    Box(int len){
        width = depth = height = len;
    }

    double volume(){
        return width * height * depth;
    }
}
