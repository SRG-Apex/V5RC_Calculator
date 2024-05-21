package net.lena.hscalculator.data;

import java.util.Objects;

public class Game {
    private String mode;
    int RedPoints;
    int BluePoints;
    int SkillsPoints;
    HighStakes ladder;
    HighStakes mogo1;
    HighStakes mogo2;
    HighStakes mogo3;
    HighStakes mogo4;
    HighStakes mogo5;
    HighStakes wallStake1;
    HighStakes wallStake2;
    HighStakes allianceStakeBlue;
    HighStakes allianceStakeRed;

    public Game(String mode) {
        this.mode = mode;
        this.ladder = new HighStakes(1, mode);
        this.mogo1 = new HighStakes(6);
        this.mogo2 = new HighStakes(6);
        this.mogo3 = new HighStakes(6);
        this.mogo4 = new HighStakes(6);
        this.mogo5 = new HighStakes(6);
        this.wallStake1 = new HighStakes(6);
        this.wallStake2 = new HighStakes(6);
        this.allianceStakeBlue = new HighStakes(2, Alliance.BLUE);
        this.allianceStakeRed = new HighStakes(2, Alliance.RED);
    }

    public void ScorePoints(String mode) {
        if (Objects.equals(mode, "match")) {
            HighStakes[] Stakes = {this.mogo1, this.mogo2, this.mogo3, this.mogo4, this.mogo5, this.ladder, this.wallStake1, this.wallStake2, this.allianceStakeBlue, this.allianceStakeRed};
            for (HighStakes stake : Stakes) {
                int BItterator = 0;
                int RItterator = 0;

                for (Alliance ring : stake.getScored()) {
                    if (ring == Alliance.BLUE) {
                        BItterator++;
                    } else if (ring == Alliance.RED) {
                        RItterator++;
                    }

                    if (stake.GetTopRing() == Alliance.BLUE) {
                        BItterator += 2;
                    } else if (stake.GetTopRing() == Alliance.RED) {
                        RItterator += 2;
                    }


                }
                if (Objects.equals(stake.getStatus(), "multiplied")) {
                    BItterator *= 2;
                    RItterator *= 2;
                } else if (Objects.equals(stake.getStatus(), "negated")) {
                    BItterator *= -1;
                    RItterator *= -1;

                }


                BluePoints += BItterator;
                RedPoints += RItterator;


            }
            RedPoints += ladder.ScoreLadder("red1") + ladder.ScoreLadder("red2");
            BluePoints += ladder.ScoreLadder("blu1") + ladder.ScoreLadder("blu2");


        } else if (Objects.equals(mode, "skills")) {
            HighStakes[] Stakes = {this.mogo1, this.mogo2, this.mogo3, this.mogo4, this.mogo5, this.ladder, this.wallStake1, this.wallStake2, this.allianceStakeBlue, this.allianceStakeRed};
            for (HighStakes stake : Stakes) {
                int RItterator = 0;
                int BlueRingCount = 0;
                int RedRingCount = 0;
                boolean violatesRSCrules = false;


                for (Alliance ring : stake.getScored()) {
                    // CHECKS
                    /**
                     * Wipe Score of a stake under the following conditions
                     * Violates RSC4 Conditions
                     * - all 24 red rings scored
                     * - 1 Red ring below blue ring
                     * - Only One Blue Ring on a stake
                     *
                     * Violates RSC5 Conditions
                     * - No Red Rings Scored above a blue Ring
                     */

                }
                if (Objects.equals(stake.getStatus(), "corner")) {
                    RItterator += 5;
                }
                if (!violatesRSCrules) { //check if any rules of a stake are violated
                    RedPoints += RItterator;
                }

            }
            RedPoints += ladder.ScoreLadder("skills");



        }
    }
}

