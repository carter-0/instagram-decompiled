package X;

import android.content.Context;

/* renamed from: X.Uu8  reason: case insensitive filesystem */
public final class C16390Uu8 extends C51086FoG {
    public final int A00;
    public final Object A01;

    public C16390Uu8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void De7() {
        Context activity;
        String A002;
        if (3 - this.A00 != 0) {
            activity = (Context) this.A01;
            A002 = C66579MXk.A00(70);
        } else {
            activity = ((C18661VwI) this.A01).A02.getActivity();
            A002 = AnonymousClass000.A00(3789);
        }
        C59689JTv.A0D(activity, A002);
    }

    public final void Do1(String str) {
        if (3 - this.A00 != 0) {
            super.Do1(str);
            return;
        }
        C18661VwI vwI = (C18661VwI) this.A01;
        1sd.A00(vwI.A03).A04(0sr.A1N(vwI.A0D));
    }
}
