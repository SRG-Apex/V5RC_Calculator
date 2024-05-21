package net.lena.hscalculator.ui.match;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import net.lena.hscalculator.data.Game;

public class MatchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<MobileGoal> Mogo1Data;
    private final MutableLiveData<MobileGoal> Mogo2Data;
    private final MutableLiveData<MobileGoal> Mogo3Data;
    private final MutableLiveData<MobileGoal> Mogo4Data;
    private final MutableLiveData<MobileGoal> Mogo5Data;
    private final MutableLiveData<MobileGoal> WallStake1;
    private final MutableLiveData<MobileGoal> WallStake2;
    private final MutableLiveData<MobileGoal> RedWallStake;
    private final MutableLiveData<MobileGoal> BlueWallStake;

    private final MutableLiveData<Integer> Red1RobotTier;
    private final MutableLiveData<Integer> Red2RobotTier;
    private final MutableLiveData<Integer> Blue1RobotTier;
    private final MutableLiveData<Integer> Blue2RobotTier;
    private final MutableLiveData<Character[]> LadderStake;


    public Game MatchData = new Game("match");

    public MatchViewModel() {
        mText = new MutableLiveData<>();
        Mogo1Data = new MutableLiveData<>();
        Mogo2Data = new MutableLiveData<>();
        Mogo3Data = new MutableLiveData<>();
        Mogo4Data = new MutableLiveData<>();
        Mogo5Data = new MutableLiveData<>();
        WallStake1 = new MutableLiveData<>();
        WallStake2 = new MutableLiveData<>();
        RedWallStake = new MutableLiveData<>();
        BlueWallStake = new MutableLiveData<>();
        Red1RobotTier = new MutableLiveData<>();
        Red2RobotTier = new MutableLiveData<>();
        Blue1RobotTier = new MutableLiveData<>();
        Blue2RobotTier = new MutableLiveData<>();
        LadderStake = new MutableLiveData<>();


        mText.setValue("This is the match fragment");

        /** Required Elements
         * 5 Mogos
         * * 3 Main Functions (Add Blue, Add Red, Delete)
         * * Top Ring Check
         * * Zone Check
         *
         * 2 Wall Stakes
         * * Top Ring Check
         * * Add Red, Add Blue, Delete
         *
         * Alliance Stakes
         * * Add Alliance Ring, Delete
         * * Top Ring Check
         *
         * Ladder
         * * Change Ring Red, Change Ring Blue, Delete
         * * Edit Tier Red1 Red2 Red3 Red4
         */
    }

    public LiveData<String> getText() {
        return mText;
    }
}