package X;

import android.app.Dialog;

/* renamed from: X.7Ns  reason: invalid class name and case insensitive filesystem */
public final class C330667Ns implements 1wn {
    public final /* synthetic */ C330637Np A00;

    public C330667Ns(C330637Np r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1427238027);
        C330937Ov r6 = (C330937Ov) obj;
        int A032 = AnonymousClass0fD.A03(-1354223548);
        0qQ.A0B(r6, 0);
        int intValue = r6.A01.intValue();
        if (intValue == 0) {
            AnonymousClass0fN.A00((Dialog) this.A00.A04.getValue());
        } else if (intValue == 1) {
            C330637Np r0 = this.A00;
            r0.A00();
            r0.A02.A0o(0);
        } else if (intValue != 2) {
            ((Dialog) this.A00.A04.getValue()).dismiss();
        }
        AnonymousClass0fD.A0A(-2132811208, A032);
        AnonymousClass0fD.A0A(-1514985605, A03);
    }
}
