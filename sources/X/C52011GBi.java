package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.GBi  reason: case insensitive filesystem */
public final class C52011GBi {
    public final JRO A00;
    public final GD6 A01;

    public static final int A00(C52011GBi gBi, Integer num, int i) {
        IntentAwareAdsInfoIntf A002;
        for (int i2 = i - 1; -1 < i2; i2--) {
            C267324bN A0E = gBi.A01.A0A.A0E(i2);
            if (A0E.A0F() && (A002 = A0E.A00()) != null) {
                Integer BUY = A002.BUY();
                int A003 = AnonymousClass59V.A00(num);
                if (BUY != null && BUY.intValue() == A003) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public C52011GBi(JRO jro, GD6 gd6) {
        this.A01 = gd6;
        this.A00 = jro;
    }
}
