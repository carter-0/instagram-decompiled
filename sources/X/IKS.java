package X;

import android.view.View;

public final class IKS implements AnonymousClass2WK {
    public static final IKS A00 = new Object();

    public final 2WL Cfk(2WI r5, long j) {
        0qQ.A0B(r5, 0);
        View A0N = C51969G9p.A0N(r5, C53969GxD.A04);
        C258253yi r1 = (C258253yi) A0N.getTag();
        if (r1 == null) {
            r1 = new C258253yi(A0N);
            A0N.setTag(r1);
        }
        DbW.A1R(r1.A05, 0);
        DbW.A1R(r1.A06, 0);
        C51972G9s.A0y(A0N, j);
        return C51972G9s.A0X(A0N.getMeasuredWidth(), Math.max(A0N.getMinimumHeight(), A0N.getMeasuredHeight()));
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
