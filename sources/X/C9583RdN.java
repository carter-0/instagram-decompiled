package X;

import com.facebook.smartcapture.flow.IdCaptureConfig;

/* renamed from: X.RdN  reason: case insensitive filesystem */
public abstract class C9583RdN {
    public static final String A00(C8878RDv rDv, IdCaptureConfig idCaptureConfig) {
        String str;
        if (rDv != null) {
            int ordinal = rDv.ordinal();
            if (ordinal == 0) {
                str = idCaptureConfig.A0C;
            } else if (ordinal == 1) {
                str = idCaptureConfig.A0B;
            }
            if (str != null) {
                return str;
            }
            throw AnonymousClass7TE.A0z("Required path not passed to IdCaptureConfig");
        }
        throw AnonymousClass7TE.A1B("Unsupported CaptureStage");
    }
}
