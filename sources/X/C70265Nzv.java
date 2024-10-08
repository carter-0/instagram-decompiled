package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.Nzv  reason: case insensitive filesystem */
public abstract class C70265Nzv {
    public static final int A00(TransportPayload transportPayload) {
        Integer num;
        int i = transportPayload.transportPayloadCase_;
        if (i == 0) {
            num = AnonymousClass05K.A0N;
        } else if (i == 1) {
            num = AnonymousClass05K.A00;
        } else if (i == 2) {
            num = AnonymousClass05K.A01;
        } else if (i != 3) {
            num = null;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 2;
        }
        if (intValue == 2) {
            return 1;
        }
        if (intValue != 3) {
            throw AnonymousClass7TE.A1K();
        }
        throw AnonymousClass7TE.A0w("Invalid Transport payload");
    }
}
