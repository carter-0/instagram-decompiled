package X;

import android.os.Handler;

/* renamed from: X.Fhc  reason: case insensitive filesystem */
public final class C50737Fhc implements C71202bS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50737Fhc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void AHF() {
        Handler handler;
        Runnable frK;
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
                ((OH3) obj).A00 = null;
                C71153OeR.A0K(((C70495O8u) this.A01).A00);
                return;
            case 1:
                E5X e5x = (E5X) obj;
                if (e5x.isVisible() && !e5x.A04) {
                    handler = (Handler) this.A01;
                    frK = new C51265FrK(e5x);
                    break;
                } else {
                    return;
                }
                break;
            default:
                C47489E4t e4t = (C47489E4t) obj;
                if (e4t.isVisible() && !e4t.A03) {
                    handler = (Handler) this.A01;
                    frK = new C51267FrM(e4t);
                    break;
                } else {
                    e4t.A04 = true;
                    return;
                }
        }
        handler.post(frK);
    }
}
