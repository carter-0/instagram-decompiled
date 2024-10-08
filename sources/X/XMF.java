package X;

import java.util.ArrayList;

public final class XMF extends C2811456b {
    public AnonymousClass4FJ A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C2811456b A03;
    public final int A04;

    public final void A08() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = null;
            C2811456b r1 = this.A03;
            if (r1.A0B()) {
                r1.A08();
            }
        }
    }

    public final void A09(AnonymousClass4FJ r5) {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = r5;
            if (!A06()) {
                A02();
                return;
            }
            A05();
            this.A01 = true;
            C2811456b r0 = this.A03;
            r0.A07();
            r0.A01.add(new C22226Xxg(this));
            C2811656e.A00().A02(new XMH(this), (long) this.A04);
            return;
        }
        throw new RuntimeException(C273654mx.A00(1388));
    }

    public final void A0A(ArrayList arrayList) {
        this.A03.A0A(arrayList);
    }

    public XMF(C2811456b r2, int i) {
        this.A04 = i;
        this.A03 = r2;
    }

    public final void A07() {
        A04();
        this.A03.A07();
    }

    public final boolean A0B() {
        return this.A01;
    }
}
