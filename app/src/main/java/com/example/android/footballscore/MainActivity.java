package com.example.android.footballscore;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int dynamoGol = 0;
    int interGol = 0;
    int shotsDynamo = 0;
    int penaltyDynamo = 0;
    int freeKickDynamo = 0;
    int shotsInter = 0;
    int penaltyInter = 0;
    int freeKickInter = 0;

    public void resetAll(View view) {
        dynamoGol = 0;
        interGol = 0;
        shotsDynamo = 0;
        penaltyDynamo = 0;
        freeKickDynamo = 0;
        shotsInter = 0;
        penaltyInter = 0;
        freeKickInter = 0;
        displayDynamoGol(dynamoGol);
        displayInterGol(interGol);
        displayShotsDynamo(shotsDynamo);
        displayPenaltyDynamo(penaltyDynamo);
        displayFreeKickDynamo(freeKickDynamo);
        displayShotsInter(shotsInter);
        displayPenaltyInter(penaltyInter);
        displayFreeKickInter(freeKickInter);
    }


    public void addFreeKickInter(View view) {
        freeKickInter = freeKickInter + 1;
        displayFreeKickInter(freeKickInter);
    }

    public void displayFreeKickInter(int freeKickInter) {
        TextView scoreView = (TextView) findViewById(R.id.free_kick_inter);
        scoreView.setText(String.valueOf(freeKickInter));
    }

    public void addPenaltyInter(View view) {
        penaltyInter = penaltyInter + 1;
        displayPenaltyInter(penaltyInter);
    }

    public void displayPenaltyInter(int penaltyInter) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_inter);
        scoreView.setText(String.valueOf(penaltyInter));
    }

    public void addShotsToInter(View view) {
        shotsInter = shotsInter + 1;
        displayShotsInter(shotsInter);
    }

    public void displayShotsInter(int shotsInter) {
        TextView scoreView = (TextView) findViewById(R.id.inter_shots);
        scoreView.setText(String.valueOf(shotsInter));
    }

    public void addFreeKickDynamo(View view) {
        freeKickDynamo = freeKickDynamo + 1;
        displayFreeKickDynamo(freeKickDynamo);
    }

    public void displayFreeKickDynamo(int freeKickDynamo) {
        TextView scoreView = (TextView) findViewById(R.id.free_kick_dynamo);
        scoreView.setText(String.valueOf(freeKickDynamo));
    }

    public void add1ToDynamo(View view) {
        dynamoGol = dynamoGol + 1;
        displayDynamoGol(dynamoGol);
    }

    public void displayDynamoGol(int dynamoGol) {
        TextView scoreView = (TextView) findViewById(R.id.dynamo_score);
        scoreView.setText(String.valueOf(dynamoGol));
    }

    public void addPenaltyDynamo(View view) {
        penaltyDynamo = penaltyDynamo + 1;
        displayPenaltyDynamo(penaltyDynamo);
    }

    public void displayPenaltyDynamo(int penaltyDynamo) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_dynamo);
        scoreView.setText(String.valueOf(penaltyDynamo));
    }

    public void displayInterGol(int interGol) {
        TextView scoreView = (TextView) findViewById(R.id.inter_score);
        scoreView.setText(String.valueOf(interGol));
    }

    public void add1ToInter(View view) {
        interGol = interGol + 1;
        displayInterGol(interGol);
    }

    public void addShotsToDynamo(View view) {
        shotsDynamo = shotsDynamo + 1;
        displayShotsDynamo(shotsDynamo);
    }

    public void displayShotsDynamo(int shotsDynamo) {
        TextView scoreView = (TextView) findViewById(R.id.dynamo_shots);
        scoreView.setText(String.valueOf(shotsDynamo));
    }
}
