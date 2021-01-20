public class Robot implements Data {
    int maxRun;
    int maxJump;
    String name;

    Robot ()
    {

    }

    @Override
    public void setData (String name, int run, int jump) { this.name = name; maxRun = run; maxJump = jump; }

    @Override
    public int runs () { System.out.println (getMyName() + " runs: " + maxRun); return maxRun; }

    @Override
    public int jumps () { System.out.println (getMyName() + " jumps: " + maxJump); return maxJump; }

    @Override
    public String runTheTrack(Track getTrack)
    {
        if (maxRun < getTrack.getTrackDistance())
        {
            return getMyName() + " will not run the " + getTrack.getTrackDistance() + " meters track.";
        }
        return getMyName() + " will run the " + getTrack.getTrackDistance() + " meters track.";
    }

    @Override
    public String getOverWall (Wall getWall)
    {
        if (maxJump < getWall.getWallHeight())
        {
            return getMyName() + " will not jump over the " + getWall.getWallHeight() + " meters wall.";
        }
        return getMyName() + " will jump over the " + getWall.getWallHeight() + " meters wall.";
    }

    @Override
    public String getMyName() { return name; }
}
