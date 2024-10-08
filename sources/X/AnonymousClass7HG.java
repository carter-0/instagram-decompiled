package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7HG  reason: invalid class name */
public final class AnonymousClass7HG implements AnonymousClass03Q {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public AnonymousClass7HG(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final 04k Cvn(View view, 04k r6) {
        ViewGroup viewGroup;
        0qQ.A0B(r6, 1);
        04h r1 = r6.A00;
        int i = r1.A05(7).A03;
        int i2 = r1.A05(7).A00;
        AnonymousClass7H6 r2 = this.A00;
        if (!(r2.A04 == i && r2.A02 == i2)) {
            r2.A04 = i;
            r2.A02 = i2;
            if (!r2.A0h && (viewGroup = r2.A08) != null) {
                0nA.A0e(viewGroup, i);
                0nA.A0T(viewGroup, r2.A02);
            }
        }
        return r6;
    }
}
