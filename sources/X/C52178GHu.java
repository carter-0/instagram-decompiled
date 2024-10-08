package X;

import android.view.View;

/* renamed from: X.GHu  reason: case insensitive filesystem */
public final class C52178GHu implements C265754Wd {
    public boolean A00;
    public final /* synthetic */ C52177GHt A01;
    public final /* synthetic */ JTB A02;

    public final void Dtu(View view, AnonymousClass4WK r3, C249693kD r4) {
        0qQ.A0B(view, 0);
        this.A02.Dtu(view, r3, r4);
    }

    public final void Dtv(AnonymousClass4WK r5, C249693kD r6) {
        AnonymousClass7TF.A1H(r6, r5);
        GIE gie = this.A01.A00;
        gie.A04.FLi(r5.CcZ(), false);
        gie.A03.FLi(r5.CcZ(), false);
        this.A02.Dtv(r5, r6);
    }

    public C52178GHu(C52177GHt gHt, JTB jtb) {
        this.A02 = jtb;
        this.A01 = gHt;
    }

    public final void DL5(AnonymousClass4WK r3, C249693kD r4) {
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r3);
        if (!this.A00) {
            this.A00 = A1Z;
            this.A02.DL5(r3, r4);
        }
    }
}
