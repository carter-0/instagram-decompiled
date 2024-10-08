package X;

import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Vp2  reason: case insensitive filesystem */
public abstract class C18282Vp2 {
    public static final C255473uB A01(Object obj, Encoder encoder, C2590540f r3) {
        0qQ.A0B(r3, 0);
        C255473uB A03 = r3.A03(obj, encoder);
        if (A03 != null) {
            return A03;
        }
        0Yh A0x = C51969G9p.A0x(obj);
        C62230ry A01 = r3.A01();
        0qQ.A0B(A01, 1);
        String A012 = 0q1.A01(A0x.A00);
        if (A012 == null) {
            A012 = String.valueOf(A0x);
        }
        VJ5.A00(A012, A01);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C255483uC A00(String str, C2590240b r2, C2590540f r3) {
        C255483uC A02 = r3.A02(str, r2);
        if (A02 != null) {
            return A02;
        }
        VJ5.A00(str, r3.A01());
        throw AnonymousClass00P.createAndThrow();
    }
}
