package X;

import android.content.res.Resources;

/* renamed from: X.Hrc  reason: case insensitive filesystem */
public final class C56030Hrc {
    public final Resources A00;
    public final C333827aD A01;
    public final C52971GgO A02;

    public C56030Hrc(Resources resources, C333827aD r3, C52971GgO ggO) {
        0qQ.A0B(ggO, 3);
        this.A00 = resources;
        this.A01 = r3;
        this.A02 = ggO;
    }

    public final void A00(String str) {
        C333827aD r2 = this.A01;
        if (r2 instanceof C335907dj) {
            C335907dj r3 = (C335907dj) r2;
            if (!r3.A0W) {
                this.A02.A0W(r3.A0C, str, r3.A0k);
                return;
            }
        }
        if (r2 instanceof C385149iT) {
            this.A02.A0W(((C385149iT) r2).A02, str, false);
        }
    }

    public final void A01(String str, String str2, boolean z) {
        this.A02.A0g(str, str2, z);
    }
}
