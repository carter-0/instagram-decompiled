package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.Ixu  reason: case insensitive filesystem */
public final class C58809Ixu extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58809Ixu(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A07 = z;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        if (this.A00 != 0) {
            boolean A1a = AnonymousClass7TE.A1a(obj);
            Dialog dialog = (Dialog) this.A04;
            if (dialog != null) {
                dialog.dismiss();
            }
            C52033GCf gCf = (C52033GCf) this.A06;
            if (gCf.A07.mView != null) {
                C52033GCf.A00((View) this.A05, (C267324bN) this.A01, (C52058GDe) this.A02, (1Xj) this.A03, gCf, this.A07, A1a);
            }
        } else {
            C305006Gb r12 = (C305006Gb) obj;
            0qQ.A0B(r12, 0);
            C61060Jvy jvy = (C61060Jvy) this.A06;
            if (!jvy.A03 || !(z = this.A07)) {
                z = this.A07;
                C51967G9n.A10(r12, new C59353JGf(1, this.A03, z), -1132185594);
                C51967G9n.A10(r12, new JGW(z, 0), -5994947);
            } else {
                r12.Cf4((Object) null, C55306HfZ.A00);
            }
            C51967G9n.A10(r12, new JHH(0, this.A02, this.A05, this.A01, jvy, this.A04, z), -348014750);
        }
        return C60340gF.A00;
    }
}
