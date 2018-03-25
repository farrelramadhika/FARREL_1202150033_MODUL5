package com.example.android.farrel_1202150033_modul5;

/**
 * Created by TOSHIBA on 3/25/2018.
 */

public class AddData {
    String todo, desc, prior;

    public AddData(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    public String getTodo() {
        return todo;
    }
    public void setTodo(String todo) {
        this.todo = todo;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getPrior() {
        return prior;
    }
    public void setPrior(String prior) {
        this.prior = prior;
    }
}
