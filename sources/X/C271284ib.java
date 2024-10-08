package X;

import android.content.Context;

/* renamed from: X.4ib  reason: invalid class name and case insensitive filesystem */
public abstract class C271284ib {
    public static final void A00(C247273g4 r7, C258433z0 r8, AnonymousClass3W1 r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        0qQ.A0B(r7, 2);
        C258423yz r5 = r8.A00;
        if (r5 != null) {
            Context context = r8.A01.getContext();
            if (r7.A04) {
                0qQ.A0A(context);
                r5.CMg(new C58179Inj(r9, 16), (0sP) r7.A02.A00, (int) 0nA.A04(context, r7.A01), (int) 0nA.A04(context, r7.A00));
                r5.setBufferEnabled(true);
                r9.A0L(r8.A02, (Integer) null, false);
                return;
            }
            r5.setBufferEnabled(false);
            r9.A0M(r8.A02, (Integer) null, false);
        }
    }
}
