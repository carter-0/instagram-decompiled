package com.facebook.cameracore.ardelivery.xplat.models;

public abstract class XplatModelManagerCompletionCallback {
    public abstract void onFail(String str);

    public abstract void onSuccess(XplatModelPaths xplatModelPaths);
}
