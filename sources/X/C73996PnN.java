package X;

import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;

/* renamed from: X.PnN  reason: case insensitive filesystem */
public final class C73996PnN extends 0Yg implements 0sP {
    public static final C73996PnN A00 = new C73996PnN();

    public C73996PnN() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        long A0R = AnonymousClass7TE.A0R(obj);
        synchronized (PregenerateSdpWrapper.A01) {
            z = PregenerateSdpWrapper.A02;
        }
        int i = 4;
        if (z) {
            i = 5;
        }
        return new PregenerateSdpWrapper(i, A0R);
    }
}
