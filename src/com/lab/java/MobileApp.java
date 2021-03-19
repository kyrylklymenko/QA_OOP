package com.lab.java;

public class MobileApp extends BaseApp{

    public String distributionPlatform;
    public boolean isOnline;
    public String connectionType; // WI-FI, mobile

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getOSversion() {
        return null;
    }

    @Override
    public void run() {

    }

    @Override
    public void someParticularLogic() {

    }

    @Override
    public void runTests() {

    }

    @Override
    public void dbConnect() {

    }

    @Override
    public String getAuthToken() {
        return null;
    }

    public void checkUpdates(){
        System.out.println(String.format("App %s be updated online via", isOnline?"can":"can't", connectionType));
    }
}
