package X;

import android.view.View;

/* renamed from: X.3aW  reason: invalid class name and case insensitive filesystem */
public final class C244023aW implements View.OnClickListener {
    public final 0lg A00;
    public final String A01;
    public final C62320sa A02;
    public final 0sP A03;
    public final boolean A04;

    public C244023aW(0lg r2, String str, C62320sa r4, 0sP r5, boolean z) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A04 = z;
        this.A01 = str;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void onClick(View view) {
        C238873Dt r2;
        int A05 = AnonymousClass0fD.A05(1813543926);
        0qQ.A0B(view, 0);
        if (this.A04) {
            0lg r4 = this.A00;
            C238833Dp A002 = C238833Dp.A00(r4);
            0qQ.A07(A002);
            C62320sa r0 = this.A02;
            if (r0 == null || (r2 = (C238873Dt) r0.invoke()) == null) {
                C238833Dp.A00(r4).A0B(view, this.A01);
            } else {
                A002.A09(view, r2, new String[]{this.A01}, 1);
            }
        }
        this.A03.invoke(view);
        AnonymousClass0fD.A0C(1514888217, A05);
    }
}
