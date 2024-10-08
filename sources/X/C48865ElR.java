package X;

import com.instagram.direct.model.DirectForwardingParams;

/* renamed from: X.ElR  reason: case insensitive filesystem */
public abstract class C48865ElR {
    public static final Integer A00(DirectForwardingParams directForwardingParams, C254783t2 r1) {
        if (directForwardingParams.A0A) {
            if (r1 instanceof C254773t1) {
                return AnonymousClass05K.A0C;
            }
            if (r1 instanceof AnonymousClass9HR) {
                return AnonymousClass05K.A0N;
            }
        } else if (r1 instanceof AnonymousClass9HR) {
            return AnonymousClass05K.A01;
        } else {
            if (r1 instanceof C254773t1) {
                return AnonymousClass05K.A00;
            }
        }
        throw AnonymousClass7TE.A0z("Unknown forward type!");
    }
}
