package X;

import android.app.Activity;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public final class C227132ih implements 1wn {
    public boolean A00;
    public final /* synthetic */ C227112if A01;

    public C227132ih(C227112if r1) {
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1430342134);
        0KP r9 = (0KP) obj;
        int A032 = AnonymousClass0fD.A03(-889260425);
        0qQ.A0B(r9, 0);
        if (r9.A04) {
            C227112if r7 = this.A01;
            Activity activity = r7.A00;
            if (!activity.isFinishing()) {
                if (this.A00) {
                    i = -1314200045;
                    AnonymousClass0fD.A0A(i, A032);
                    AnonymousClass0fD.A0A(152084340, A03);
                }
                C358248ab r4 = new C358248ab(activity);
                r4.A09(2131961740);
                r4.A0r(false);
                r4.A0q(activity.getResources().getString(2131962641, new Object[]{r9.A03}));
                r4.A0I(new FIN(this, r7, r9), 2131968772);
                AnonymousClass0fN.A00(r4.A02());
                this.A00 = true;
                i = -149819249;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(152084340, A03);
            }
        }
        C227112if.A00(this.A01, r9, false);
        i = -149819249;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(152084340, A03);
    }
}
