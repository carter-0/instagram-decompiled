package X;

import android.content.Context;

/* renamed from: X.FnO  reason: case insensitive filesystem */
public final class C51032FnO implements G81 {
    public final int A00;
    public final Object A01;

    public C51032FnO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D5S() {
        if (this.A00 != 0) {
            FV7 fv7 = (FV7) this.A01;
            DbZ.A1S(fv7.A06, "remove_follower_dialog_confirmed", fv7.A0C.getId());
        }
    }

    public final void DED() {
    }

    public final void onCancel() {
        if (this.A00 != 0) {
            FV7 fv7 = (FV7) this.A01;
            DbZ.A1S(fv7.A06, "remove_follower_dialog_cancelled", fv7.A0C.getId());
        }
    }

    public final void onSuccess() {
        if (this.A00 != 0) {
            FV7 fv7 = (FV7) this.A01;
            C59689JTv.A07(fv7.A00, 2131972137);
            C49170Eqb.A00(fv7.A07, fv7.A0C);
            return;
        }
        C59689JTv.A07((Context) this.A01, 2131972137);
    }
}
