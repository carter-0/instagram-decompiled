package com.facebook.smartcapture.logging;

import X.0qQ;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SelfieCaptureLogger extends BaseLogger {
    public static final String ARG_PREVIOUS_STEP = "previous_step";
    public static final String ARG_STEP_CHANGE_LOGGED = "step_change_logged";
    public static final Companion Companion = new Object();
    public final SelfieCaptureStep currentStep;
    public SelfieCaptureStep nextStep;
    public SelfieCaptureStep previousStep = SelfieCaptureStep.INITIAL;
    public boolean stepChangeLogged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelfieCaptureLogger(SmartCaptureLogger smartCaptureLogger, SelfieCaptureStep selfieCaptureStep) {
        super(smartCaptureLogger);
        0qQ.A0B(selfieCaptureStep, 2);
        this.currentStep = selfieCaptureStep;
        setCurrentScreen(selfieCaptureStep.getText());
    }

    public static final void setIntentPreviousStep(Intent intent, SelfieCaptureStep selfieCaptureStep) {
        Companion.setIntentPreviousStep(intent, selfieCaptureStep);
    }

    public final void onActivityResult(int i) {
        if (i == 0) {
            this.stepChangeLogged = false;
        }
        if (this.currentStep == SelfieCaptureStep.CAPTURE && i == -1) {
            logFlowEnd();
        }
    }

    public final void onBackPressed() {
        if (this.currentStep != SelfieCaptureStep.CONFIRMATION) {
            logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        }
    }

    public final void onCreate(Intent intent, Bundle bundle) {
        boolean z;
        SelfieCaptureStep selfieCaptureStep;
        if (!(intent == null || (selfieCaptureStep = (SelfieCaptureStep) intent.getSerializableExtra(ARG_PREVIOUS_STEP)) == null)) {
            this.previousStep = selfieCaptureStep;
        }
        if (bundle != null) {
            z = bundle.getBoolean(ARG_STEP_CHANGE_LOGGED);
        } else {
            z = false;
        }
        this.stepChangeLogged = z;
        if (this.previousStep == SelfieCaptureStep.INITIAL && this.currentStep != SelfieCaptureStep.CONFIRMATION) {
            logFlowStart();
        }
        if (this.currentStep == SelfieCaptureStep.PERMISSIONS) {
            logPermissionExplain();
        }
    }

    public final void onResume() {
        if (!this.stepChangeLogged) {
            this.stepChangeLogged = true;
            SelfieCaptureStep selfieCaptureStep = this.nextStep;
            if (selfieCaptureStep != null) {
                logStepChange(selfieCaptureStep, this.currentStep);
                this.nextStep = null;
                return;
            }
            logStepChange(this.previousStep, this.currentStep);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean(ARG_STEP_CHANGE_LOGGED, this.stepChangeLogged);
        }
    }

    public final void setNextStep(SelfieCaptureStep selfieCaptureStep) {
        this.nextStep = selfieCaptureStep;
    }

    private final void logStepChange(SelfieCaptureStep selfieCaptureStep, SelfieCaptureStep selfieCaptureStep2) {
        setCurrentScreen(selfieCaptureStep2.getText());
        logEvent("step_change", BaseLogger.Companion.buildMap("previous", selfieCaptureStep.getText(), "next", selfieCaptureStep2.getText()));
    }

    public final class Companion {
        public final void setIntentPreviousStep(Intent intent, SelfieCaptureStep selfieCaptureStep) {
            0qQ.A0B(intent, 0);
            intent.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
