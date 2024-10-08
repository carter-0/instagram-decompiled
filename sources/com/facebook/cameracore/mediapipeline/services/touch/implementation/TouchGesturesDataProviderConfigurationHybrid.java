package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.C372008zW;
import X.C372018zX;
import X.C372028zY;
import X.C381019b2;
import X.C392859vU;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import java.util.List;

public final class TouchGesturesDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C392859vU Companion = new Object();
    public final C372008zW configuration;
    public final TouchGesturesDelegateWrapper delegate;

    public static final native HybridData initHybrid(TouchGesturesDelegateWrapper touchGesturesDelegateWrapper);

    public TouchGesturesDataProviderConfigurationHybrid(C372008zW r4) {
        List list;
        this.configuration = r4;
        TouchGesturesDelegateWrapper touchGesturesDelegateWrapper = new TouchGesturesDelegateWrapper();
        this.delegate = touchGesturesDelegateWrapper;
        C372028zY r1 = r4.A00;
        if (r1 instanceof C372018zX) {
            list = ((C372018zX) r1).A03;
        } else {
            list = ((C381019b2) r1).A01;
        }
        list.add(touchGesturesDelegateWrapper);
        this.mHybridData = initHybrid(touchGesturesDelegateWrapper);
    }
}
