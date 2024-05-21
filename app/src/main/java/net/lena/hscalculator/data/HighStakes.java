package net.lena.hscalculator.data;

import java.util.ArrayList;
import java.util.Objects;

public class HighStakes{
    int MaxRings;
    Alliance TopRing;
    ArrayList<Alliance> Scored;
    String Status;

    Alliance alliance = Alliance.DEFAULT;
    int red1;
    int red2;
    int blu1;
    int blu2;
    int skills;






    public HighStakes(int MaxRigns){
        this.MaxRings = MaxRigns; //Trust that the super is called in extended classes
    }
    public HighStakes(int MaxRigns, Alliance alliance){
        this.MaxRings = MaxRigns; //Trust that the super is called in extended classes
        this.alliance = alliance;
    }

    public HighStakes(int MaxRigns, String mode){
        this.MaxRings = MaxRigns; //Trust that the super is called in extended classes
        if (Objects.equals(mode, "match")){
            int red1 = 0;
            int red2 = 0;
            int blu1 = 0;
            int blu2 = 0;
        }
        else if (Objects.equals(mode, "skills")){
            int skills = 0;
        }
    }

    public void ScoreRing(Alliance Color) {
        if (this.alliance == Color || this.alliance == Alliance.DEFAULT){
        if (Scored.size() != MaxRings) {
            Scored.add(Color);
            this.TopRing = Scored.get(-1);
        }
    }
    }

    public Alliance GetTopRing(){
        return this.TopRing;
    }
    public ArrayList<Alliance> getScored(){return this.Scored;}
    public void SetStaus(String Status){
        this.Status = Status;
    }
    public String getStatus(){return this.Status; }

    public void IncreaseTier(String robot) {
        if (Objects.equals(robot, "red1")){
            if (this.red1 != 3){
                this.red1++;
            }
        }

        if (Objects.equals(robot, "red2")){
            if (this.red2 != 3){
                this.red2++;
            }
        }


        if (Objects.equals(robot, "blu1")){
            if (this.blu1 != 3){
                this.blu1++;
            }
        }

        if (Objects.equals(robot, "blu2")){
            if (this.blu2 != 3){
                this.blu2++;
            }
        }
        if (Objects.equals(robot, "skills")){
            if (this.red1 != 3){
                this.red1++;
            }
        }
    }
    public int ScoreLadder(String robot){
        int r = 0;
        if (Objects.equals(robot, "red1")){
           r = this.red1;
        }

        else if (Objects.equals(robot, "red2")){
            r = this.red2;

        }


        else if (Objects.equals(robot, "blu1")){
            r = this.blu1;

        }

        else if (Objects.equals(robot, "blu2")){
            r = this.blu2;

        }
        else if (Objects.equals(robot, "skills")){
            r = this.skills;

        }
        if (r == 1){
            return 3;
        }
        else if (r == 2){
            return 6;
        }
        else if (r == 3){
            return 12;
        }
        else { return 0; }
    }




    }
