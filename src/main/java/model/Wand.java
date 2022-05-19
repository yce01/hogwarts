package model;

public class Wand {
    int id;
    String wood;    //37개
    String core;    //18개
    int length;     //9~15inch
    String flexibility;

    public Wand(){}

    public Wand(int id, String wood, String core, int length, String flexibility){
        this.id = id;
        this.wood = wood;
        this.core = core;
        this.length = length;
        this.flexibility = flexibility;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWood() {
        return wood;
    }
    public void setWood(String wood) {
        this.wood = wood;
    }
    public String getCore() {
        return core;
    }
    public void setCore(String core) {
        this.core = core;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getFlexibility() {
        return flexibility;
    }
    public void setFlexibility(String flexibility) {
        this.flexibility = flexibility;
    }

    @Override
    public String toString() {
//        return toJsonString();
    return toJsonStringBuilder();
    }

    public String toJsonString() {
        return "Wand{" +
                "id=" + id +
                ", wood='" + wood + '\'' +
                ", core='" + core + '\'' +
                ", length=" + length +
                ", flexibility='" + flexibility + '\'' +
                '}';
    }

    public String toJsonStringBuilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\":").append(id).append(",");
        sb.append("\"wood\":\"").append(wood).append("\"").append(",");
        sb.append("\"core\":\"").append(core).append("\"").append(",");
        sb.append("\"length\":").append(length).append(",");
        sb.append("\"flexibility\":\"").append(flexibility);
        sb.append("}");
        return sb.toString();
    }
}
