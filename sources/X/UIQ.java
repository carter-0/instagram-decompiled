package X;

import java.util.Map;

public final class UIQ extends 1TY implements C320986tO {
    public final /* bridge */ /* synthetic */ Object A02() {
        C249903kY r0;
        synchronized (this) {
            C249903kY r02 = (C249903kY) UIQ.super.A02();
            if (r02 != null) {
                r0 = r02.A04();
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final void DH4(X9T x9t, String str, String str2) {
        0qQ.A0B(x9t, 1);
        C15006UJg uJg = new C15006UJg(x9t);
        A09(C249903kY.A00(C249903kY.A05, C249903kY.A06, uJg), (Map) null, true);
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj) {
        C249903kY.A01((C249903kY) obj);
    }

    public final void DaG(String str, float f) {
        A05(f / 100.0f);
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        String A0R = 002.A0R("Failed to load GIF image ", str);
        0qQ.A0B(A0R, 1);
        A0A(new Exception(A0R));
    }
}
