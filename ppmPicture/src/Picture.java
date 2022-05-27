public class Picture {
    private String name;
    private String p3 = "P3";
    private int width, height;
    private int maxSetColor;

    String SourcePath = "../";


    public Picture(String name, int width, int height ){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName(){
        return name;
    }
    public String getExtension(){
        return ".ppm";
    }

    public String getFilename(){
        return getName() + getExtension();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getMaxSetColor(){
        return maxSetColor;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setMaxSetColor(){
        this.maxSetColor = maxSetColor;
    }

}
