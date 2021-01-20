public interface Data {

    void setData (String name, int run, int jump);
    String getMyName();
    int runs();
    int jumps();
    String runTheTrack(Track getTrack);
    String getOverWall(Wall getWall);
}