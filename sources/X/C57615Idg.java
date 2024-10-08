package X;

import android.view.View;

/* renamed from: X.Idg  reason: case insensitive filesystem */
public final class C57615Idg implements C59586JPg {
    public final /* synthetic */ H18 A00;

    public C57615Idg(H18 h18) {
        this.A00 = h18;
    }

    public final boolean CbM(View view) {
        View view2;
        C249703kE r0 = (C249703kE) C51968G9o.A0q(this.A00).A08.getValue();
        if (r0 != null) {
            view2 = r0.itemView;
        } else {
            view2 = null;
        }
        return view.equals(view2);
    }

    public final void DHD(C53152GjO gjO) {
        H18 h18 = this.A00;
        if (AnonymousClass7TF.A1Z(h18.A0H)) {
            H18.A00(h18);
        }
        ((C52967GgK) h18.A0D.getValue()).A0H(gjO);
    }
}
