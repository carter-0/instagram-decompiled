package X;

import android.content.Context;

/* renamed from: X.Lgx  reason: case insensitive filesystem */
public final class C64720Lgx implements AnonymousClass4DR {
    public boolean A00;
    public final C66517MUv A01;
    public final Context A02;

    public final boolean onBackPressed() {
        C66517MUv mUv = this.A01;
        if (mUv.BCK() && !this.A00) {
            C358248ab A0Y = DbS.A0Y(this.A02);
            A0Y.A09(2131975992);
            A0Y.A08(2131975991);
            A0Y.A0K(LV2.A00(this, 25), 2131960798);
            DbX.A16(LV2.A00(this, 26), A0Y);
            return true;
        } else if (this.A00) {
            return false;
        } else {
            mUv.Cxb();
            return false;
        }
    }

    public C64720Lgx(Context context, C66517MUv mUv) {
        this.A02 = context;
        this.A01 = mUv;
    }
}
