package com.facebook.smartcapture.logging;

import X.0qQ;

public final class IdCaptureLogger extends BaseLogger {
    public final void logButtonClick(IdCaptureButton idCaptureButton) {
        0qQ.A0B(idCaptureButton, 0);
        logButtonClick(idCaptureButton.getText());
    }

    public final void logStepChange(IdCaptureStep idCaptureStep, IdCaptureStep idCaptureStep2) {
        0qQ.A0B(idCaptureStep, 0);
        0qQ.A0B(idCaptureStep2, 1);
        setCurrentScreen(idCaptureStep2.getText());
        logEvent("step_change", BaseLogger.Companion.buildMap("previous", idCaptureStep.getText(), "next", idCaptureStep2.getText()));
    }

    public IdCaptureLogger(SmartCaptureLogger smartCaptureLogger) {
        super(smartCaptureLogger);
    }
}
