package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieCapturePermissionsActivity;

/* renamed from: X.RdO  reason: case insensitive filesystem */
public abstract class C9584RdO {
    public static final Intent A00(Context context, SelfieCaptureConfig selfieCaptureConfig, SelfieCaptureStep selfieCaptureStep) {
        if (02K.A00(context, C9952Rk7.A00[0]) != 0) {
            Intent A0A = C66580MXl.A0A(context, SelfieCapturePermissionsActivity.class);
            A0A.putExtra("selfie_capture_config", selfieCaptureConfig);
            A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
            return A0A;
        }
        Intent A0A2 = C66580MXl.A0A(context, SelfieCaptureActivity.class);
        A0A2.putExtra("selfie_capture_config", selfieCaptureConfig);
        A0A2.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
        return A0A2;
    }
}
