package net.lena.hscalculator.ui.skills;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SkillsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


    public SkillsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the skills fragment");

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
         * * Edit Tier Red1
         */
    }

    public LiveData<String> getText() {
        return mText;
    }
}