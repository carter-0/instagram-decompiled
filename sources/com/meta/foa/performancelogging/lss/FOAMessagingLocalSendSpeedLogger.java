package com.meta.foa.performancelogging.lss;

import X.2Hj;
import X.C21941XmW;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

public interface FOAMessagingLocalSendSpeedLogger extends FOAMessagingPerformanceLogger {
    public static final C21941XmW Companion = C21941XmW.A00;
    public static final 2Hj FOA_MARKER = new 2Hj(668675774, "LOCAL_SEND_SPEED");

    void annotateIsBundledWithMediaSend(boolean z);

    void annotateIsEncrypted(boolean z);

    void annotateIsGroup(boolean z);

    void annotateLocalDataId(String str);

    void annotateMediaSource(String str);

    void annotateMessageType(LocalSendSpeedMessageTypes localSendSpeedMessageTypes);

    void annotateSendSurface(String str);

    void annotateTransportType(String str);

    void onEndFlowSucceed();

    void onLogDataProcessingEnd();

    void onLogDataProcessingStart();

    void onLogRenderEnd();

    void onLogRenderStart();

    void onLogRenderWillDisplay();

    void onStartFlow(boolean z);
}
