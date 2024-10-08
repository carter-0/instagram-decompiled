package X;

import android.view.View;

/* renamed from: X.7oQ  reason: invalid class name and case insensitive filesystem */
public final class C342337oQ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass86m A00;

    public C342337oQ(AnonymousClass86m r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        AnonymousClass87G r1;
        int i;
        int A05 = AnonymousClass0fD.A05(125140091);
        AnonymousClass86m r2 = this.A00;
        C347487wt r0 = r2.A0A;
        if (r0 == null) {
            i = 686446446;
        } else {
            if (r0.A01) {
                AnonymousClass86m.A06(r2);
            } else {
                AnonymousClass876 r02 = r2.A08;
                if (r02 != null) {
                    r1 = r02.A01();
                } else {
                    r1 = null;
                }
                AnonymousClass871 r03 = r2.A09;
                if (!(r03 == null || r1 == null)) {
                    r03.DBh(r1);
                }
            }
            i = -2132599850;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
