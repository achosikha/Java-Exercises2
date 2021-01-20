public class ProgramCaller implements Obstacles {

    // Arrays of Human
    public static Human myHumans [] = new Human[5];

    // Arrays of Tracks and Walls
    public static Track myTracks [] = new Track[5];
    public static Wall myWalls [] = new Wall[5];

    ProgramCaller()
    {
        // 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        // Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о
        // действии в консоль).

        // 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        // участники должны выполнять соответствующие действия (бежать или прыгать),
        // результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        // Human
        Human();
        Cat();
        Robot();

        //Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
        // этот набор препятствий.
        startMarathon();
    }

    void Human()
    {
        // Create Human 1 - Josh with parameters
        Data human1 = new Human();
        human1.setData ("Josh",100, 2);

        Data human2 = new Human();
        human2.setData ("Noah",100, 2);

        // Get name of the human
        System.out.println ("Human: " + human1.getMyName());

        // Human Josh runs and jumps
        human1.runs();
        human1.jumps();

        // Human Josh tries to run the track and get over the wall
        System.out.println (human1.runTheTrack(new Track(70)));
        System.out.println (human1.getOverWall(new Wall(3)));
        System.out.println();
    }

    void Cat ()
    {
        // Create Cat 1 = Persian with parameters
        Data cat1 = new Cat();
        cat1.setData("Persian", 200, 4);

        // Get name of the cat
        System.out.println("Cat: " + cat1.getMyName());

        // Cat Persian runs and jumps
        cat1.runs();
        cat1.jumps();

        // Cat Persian tries to run the track and get over the wall
        System.out.println (cat1.runTheTrack(new Track(201)));
        System.out.println (cat1.getOverWall(new Wall(2)));
        System.out.println();
    }

    void Robot ()
    {
        // Create Robot 1 = T-800 with parameters
        Data robot1 = new Robot();
        robot1.setData("T-800", 500, 6);

        // Get name of the robot
        System.out.println("Robot: " + robot1.getMyName());

        // Robot T-800 runs and jumps
        robot1.runs();
        robot1.jumps();

        // Robot T-800 tries to run the track and get over the wall
        System.out.println (robot1.runTheTrack(new Track(480)));
        System.out.println (robot1.getOverWall(new Wall(6)));
        System.out.println();
    }

    // Participants going through an obstacles
    void startMarathon ()
    {
        Participants();
        Obstacles();

        marathon();
    }

    // setting up participants
    void Participants ()
    {
        createMyHumans();
    }

    // setting up obstacles
    void Obstacles ()
    {
        createMyTracks();
        createMyWalls();
    }

    public void marathon ()
    {
        for (int sizeOut = 0; sizeOut < 5; sizeOut++)
        {
            System.out.print (myHumans[sizeOut].getMyName());
            System.out.print(" runs: " + myHumans[sizeOut].getMaxRun());
            System.out.println (" jumps: " + myHumans[sizeOut].getMaxJump());
            for (int sizeInn = 0; sizeInn < 5; sizeInn++)
            {
                if (myHumans[sizeOut].getMaxRun() < myTracks[sizeInn].getTrackDistance())
                {
                    System.out.println (" will not run the track: " + myTracks[sizeInn].getTrackDistance());
                }
                else
                {
                    System.out.println (" will run the track: " + myTracks[sizeInn].getTrackDistance());
                }
                if (myHumans[sizeOut].getMaxJump() < myWalls[sizeInn].getWallHeight())
                {
                    System.out.println (" will not jump over the wall: " + myWalls[sizeInn].getWallHeight());
                }
                else
                {
                    System.out.println (" will jump over the wall: " + myWalls[sizeInn].getWallHeight());
                }
            }
            System.out.println();
        }
    }

    // Create massive of five Humans with different parameters
    void createMyHumans ()
    {
        myHumans[0] = new Human ("David", 150, 3);
        myHumans[1] = new Human ("Alex",200, 5);
        myHumans[2] = new Human ("Jonathan",100, 2);
        myHumans[3] = new Human ("Vladimir", 60, 1);
        myHumans[4] = new Human ("Ivan",250, 6);
    }

    // Create massive of five tracks with different parameters
    void createMyTracks()
    {
        myTracks[0] = new Track(50);
        myTracks[1] = new Track(100);
        myTracks[2] = new Track(150);
        myTracks[3] = new Track(221);
        myTracks[4] = new Track(480);
    }

    // Create massive of five walls with different parameters
    void createMyWalls()
    {
        myWalls[0] = new Wall(1);
        myWalls[1] = new Wall(2);
        myWalls[2] = new Wall(3);
        myWalls[3] = new Wall(8);
        myWalls[4] = new Wall(10);
    }
}
