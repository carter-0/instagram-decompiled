package com.meta.foa.instagram.performancelogging.lss;

import X.0Yt;
import X.0qQ;
import X.2Hl;
import X.C331107Po;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;

public final class IGFOAMessagingLocalSendSpeedLoggingController extends 2Hl {
    public static final C331107Po Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGFOAMessagingLocalSendSpeedLoggingController(UserSession userSession) {
        super(true, userSession);
        0qQ.A0B(userSession, 1);
    }

    public static final IGFOAMessagingLocalSendSpeedLoggingController getInstance(UserSession userSession) {
        return C331107Po.A00(userSession);
    }

    public final void onExitThreadView() {
        for (Map.Entry entry : 0Yt.A0B(this.activeLoggers).entrySet()) {
            ((Number) entry.getKey()).intValue();
            ((FOAMessagingPerformanceLogger) entry.getValue()).onEndFlowCancel("User exited the thread view.");
        }
        this.activeLoggers.clear();
    }

    public final void onLogGenerateMessageListViewModelsEnd(int i) {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            0qQ.A0C(iGFOAMessagingLocalSendSpeedLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger2 = iGFOAMessagingLocalSendSpeedLogger;
            iGFOAMessagingLocalSendSpeedLogger2.onLogGenerateMessageListViewModelsEnd();
            iGFOAMessagingLocalSendSpeedLogger2.annotateNumViewModelsToGenerate(i);
        }
    }

    public final void onLogGenerateMessageListViewModelsStart(int i) {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            0qQ.A0C(iGFOAMessagingLocalSendSpeedLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger2 = iGFOAMessagingLocalSendSpeedLogger;
            iGFOAMessagingLocalSendSpeedLogger2.onLogGenerateMessageListViewModelsStart();
            iGFOAMessagingLocalSendSpeedLogger2.annotateNumViewModelsToGenerate(i);
        }
    }

    public IGFOAMessagingLocalSendSpeedLogger getLogger(Integer num) {
        return IGFOAMessagingLocalSendSpeedLoggingController.super.getLogger(num);
    }
}
