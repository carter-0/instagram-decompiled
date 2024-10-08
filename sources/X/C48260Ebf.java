package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Ebf  reason: case insensitive filesystem */
public final class C48260Ebf {
    public Fragment A00;
    public R8F A01;
    public boolean A02;

    public final void A00() {
        0SM r2 = this.A01;
        0hq r1 = r2.mFragmentManager;
        if (r1 != null) {
            0SM A0R = r1.A0R("ProgressDialog");
            if (A0R == null) {
                if (r2.isAdded()) {
                    A0R = r2;
                }
                this.A02 = false;
            }
            A0R.A08();
            this.A02 = false;
        }
    }

    public final void A01() {
        Fragment fragment = this.A00;
        if (fragment.getChildFragmentManager().A0R("ProgressDialog") == null) {
            R8F r8f = this.A01;
            if (!r8f.isAdded()) {
                r8f.A0G(DbW.A0C(fragment), "ProgressDialog", true);
                this.A02 = true;
            }
        }
    }
}
