package com.lab.java;

public abstract class BaseApp {
    public String title;
    public String OSversion;
    public String dbCredentials;
    public abstract String getTitle();
    public abstract String getOSversion();
    public abstract void run();
    public abstract void someParticularLogic();
    public abstract void runTests();
    public abstract void dbConnect();
    public abstract String getAuthToken();
}
