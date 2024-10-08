package X;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieReviewActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class S4B {
    public final /* synthetic */ S3Y A00;
    public final /* synthetic */ C12061Slo A01;

    public final void A00(SelfieEvidence selfieEvidence) {
        BigDecimal scale;
        0qQ.A0B(selfieEvidence, 0);
        C12061Slo slo = this.A01;
        Integer num = slo.A0A;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
            this.A00.A00();
            return;
        }
        slo.A0F = false;
        Float f = selfieEvidence.A01;
        InMemoryLogger.LogEntryBuilder addEntry = slo.A0K.addEntry("VIDEO_RECORDED");
        if (f == null) {
            scale = null;
        } else {
            scale = BigDecimal.valueOf((double) f.floatValue()).setScale(2, RoundingMode.HALF_UP);
            0qQ.A07(scale);
        }
        addEntry.put(TraceFieldType.Duration, (Object) scale);
        addEntry.put("size", (Object) selfieEvidence.A05);
        addEntry.put(IgReactMediaPickerNativeModule.WIDTH, (Object) selfieEvidence.A04);
        addEntry.put(IgReactMediaPickerNativeModule.HEIGHT, (Object) selfieEvidence.A03);
        addEntry.put(TraceFieldType.Bitrate, (Object) selfieEvidence.A02);
        addEntry.submit();
        ComponentActivity componentActivity = (C13580Td6) slo.A0P.get();
        if (componentActivity != null) {
            ComponentActivity componentActivity2 = (BaseSelfieCaptureActivity) componentActivity;
            if (componentActivity2.A02().A06 == REX.NONE) {
                componentActivity2.A04(selfieEvidence, (String) null);
                return;
            }
            SelfieCaptureConfig A02 = componentActivity2.A02();
            SelfieCaptureStep selfieCaptureStep = SelfieCaptureStep.CAPTURE;
            Intent A0A = C66580MXl.A0A(componentActivity2, SelfieReviewActivity.class);
            A0A.putExtra("selfie_capture_config", A02);
            A0A.putExtra("selfie_evidence", selfieEvidence);
            A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
            BaseSelfieCaptureActivity.A00(componentActivity2).nextStep = SelfieCaptureStep.CONFIRMATION;
            componentActivity2.startActivityForResult(A0A, 1);
        }
    }

    public S4B(S3Y s3y, C12061Slo slo) {
        this.A01 = slo;
        this.A00 = s3y;
    }

    public final void A01(Exception exc) {
        C12061Slo slo = this.A01;
        slo.A0F = false;
        slo.A0A = AnonymousClass05K.A0j;
        slo.A0L.logError("Selfie presenter: capture fail", exc);
        androidx.core.app.ComponentActivity componentActivity = (C13580Td6) slo.A0P.get();
        if (componentActivity != null) {
            androidx.core.app.ComponentActivity componentActivity2 = (BaseSelfieCaptureActivity) componentActivity;
            if (componentActivity2.getLifecycle().A07() == 07U.A04) {
                componentActivity2.finish();
            } else {
                componentActivity2.A05("Capture failed after onPause", (Throwable) null);
            }
        }
    }
}
