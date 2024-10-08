package X;

import android.view.View;

/* renamed from: X.NEz  reason: case insensitive filesystem */
public final class C68392NEz extends V4O {
    public float A00;
    public int A01 = 4;
    public final /* synthetic */ PMP A02;

    public C68392NEz(PMP pmp) {
        this.A02 = pmp;
    }

    public final void A01(View view, float f) {
        float f2 = this.A00;
        if (f2 > 0.0f && f < f2) {
            C70514O9n o9n = this.A02.A01;
            if (o9n != null) {
                C69107Nem nem = o9n.A00;
                if (nem.A07) {
                    View view2 = nem.A0A.A03;
                    view2.clearFocus();
                    0nA.A0N(view2);
                }
            }
            0qQ.A0F("listener");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = f;
        C70514O9n o9n2 = this.A02.A01;
        if (o9n2 != null) {
            o9n2.A00.A09.A05(new PN3(f));
            return;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02(View view, int i) {
        int i2 = this.A01;
        if (i2 == 4 && i == 1) {
            this.A02.A07.A0W(i2);
            i = this.A01;
        }
        if (i == 4 || i == 5) {
            C70514O9n o9n = this.A02.A01;
            if (o9n != null) {
                C69107Nem nem = o9n.A00;
                C69107Nem.A00(nem);
                if (nem.A07) {
                    View view2 = nem.A0A.A03;
                    view2.clearFocus();
                    0nA.A0N(view2);
                }
                C70587OCk oCk = (C70587OCk) 00k.A0L(nem.A02.A00);
                if (oCk != null) {
                    nem.A09.A05(new PN2(oCk.A00));
                }
            } else {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        this.A01 = i;
    }
}
