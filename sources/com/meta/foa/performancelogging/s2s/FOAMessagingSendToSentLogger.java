package com.meta.foa.performancelogging.s2s;

import X.2Hj;
import X.C21943XmY;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

public interface FOAMessagingSendToSentLogger extends FOAMessagingPerformanceLogger {
    public static final C21943XmY Companion = C21943XmY.A00;
    public static final 2Hj FOA_MARKER = new 2Hj(668676445, "MESSAGE_SEND_TO_SENT");

    void onEndFlowSucceed();

    void onEndFlowSucceed(String str);

    void onStartFlow();
}
