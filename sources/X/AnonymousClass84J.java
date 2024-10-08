package X;

import android.content.Context;

/* renamed from: X.84J  reason: invalid class name */
public final class AnonymousClass84J {
    public long A00;
    public boolean A01;
    public final Context A02;

    public AnonymousClass84J(Context context) {
        0qQ.A0B(context, 1);
        this.A02 = context;
    }

    public final void A00(String str, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        if (!this.A01 && System.currentTimeMillis() - this.A00 >= 1500) {
            C358248ab r2 = new C358248ab(this.A02);
            r2.A09(2131971013);
            r2.A0q(str);
            int i = 2131971015;
            if (z) {
                i = 2131971014;
            }
            r2.A0I(new C39940AKg(this, str, z, z2), i);
            r2.A0G(C39953AKt.A00, 2131954722);
            r2.A0f(new AL1(this));
            r2.A0r(true);
            r2.A0s(true);
            AnonymousClass0fN.A00(r2.A02());
            this.A01 = true;
        }
    }
}
