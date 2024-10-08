package X;

import com.facebook.smartcapture.flow.SelfieCaptureConfig;

/* renamed from: X.RdH  reason: case insensitive filesystem */
public abstract class C9577RdH {
    public static final boolean A00(SelfieCaptureConfig selfieCaptureConfig, C10242Rp2 rp2) {
        0qQ.A0B(rp2, 1);
        Integer num = selfieCaptureConfig.A0K;
        if (num == null) {
            num = AnonymousClass05K.A01;
        }
        if (selfieCaptureConfig.A07 != null) {
            num = AnonymousClass05K.A00;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0 || !rp2.A00.getBoolean("onboarding_has_seen", false)) {
            return true;
        }
        return false;
    }
}
