package com.example.testapp;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;

public class BusITWeekDatabaseHelper extends StoryLineDatabaseHelper {

    public BusITWeekDatabaseHelper() {
        super(11);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {

        builder.addGPSTask("1")
                .location(49.211986, 16.616678)
                .radius(100)
                .victoryPoints(10)
                .hint("Hint")
                .simplePuzzle()
                .question("What is the best Bus IT Week?")
                .answer("Brno")
                .hint("Question hint")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("2")
                .location(49.211986,16.616678)
                .radius(100000)
                .choicePuzzle()
                .addChoice("bfngfnfgn",false)
                .addChoice("fdafefewf",true)
                .addChoice("ffewyejdfr", false)
                .addChoice("efefk[ef[e", false)
                .question("Really?")
                .puzzleDone()
                .taskDone();

        builder.addBeaconTask("3")
                .beacon(29028,54274)
                .imageSelectPuzzle()
                .addImage(R.drawable.abdel,false)
                .addImage(R.drawable.dago, false)
                .addImage(R.drawable.firatnose, true)
                .addImage(R.drawable.sokka, false)
                .question("Who is mentally retarded?")
                .puzzleDone()
                .location(49.211986,16.616678)
                .taskDone();

        builder.addGPSTask("4")
                .location(49.211986, 16.616678)
                .radius(50)
                .victoryPoints(10)
                .hint("Hint")
                .simplePuzzle()
                .question("This is a test?")
                .answer("yes")
                .hint("Question hint")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();

        builder.addBeaconTask("5")
                .beacon(29028,54274)
                .simplePuzzle()
                .question("This is another test?")
                .answer("yes")
                .hint("Question hint")
                .puzzleTime(30000)
                .puzzleDone()
                .location(49.211986,16.616678)
                .taskDone();

        builder.addCodeTask("6")
                .location(49.211986,16.616678)
                .qr("something")
                .simplePuzzle()
                .question("This is a third test?")
                .answer("yes")
                .hint("Question hint")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();
    }
}
