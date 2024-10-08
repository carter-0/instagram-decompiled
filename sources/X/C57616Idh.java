package X;

import android.view.View;

/* renamed from: X.Idh  reason: case insensitive filesystem */
public final class C57616Idh implements C59586JPg {
    public final /* synthetic */ H1I A00;

    public C57616Idh(H1I h1i) {
        this.A00 = h1i;
    }

    public final boolean CbM(View view) {
        View view2;
        C249703kE r0 = (C249703kE) C51969G9p.A0o(this.A00).A07.getValue();
        if (r0 != null) {
            view2 = r0.itemView;
        } else {
            view2 = null;
        }
        return view.equals(view2);
    }

    public final void DHD(C53152GjO gjO) {
        ((C52967GgK) this.A00.A0K.getValue()).A0H(gjO);
    }
}
