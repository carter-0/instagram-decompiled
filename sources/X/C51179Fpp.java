package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.SupportLinksFragment;

/* renamed from: X.Fpp  reason: case insensitive filesystem */
public final class C51179Fpp implements Runnable {
    public final /* synthetic */ EDV A00;

    public C51179Fpp(EDV edv) {
        this.A00 = edv;
    }

    public final void run() {
        Fragment fragment = (Fragment) this.A00.A01;
        String string = fragment.requireContext().getString(2131971978);
        if (!TextUtils.isEmpty(string)) {
            C59689JTv.A09(fragment.requireContext(), string);
        }
        0hq r2 = fragment.mFragmentManager;
        if (r2 != null) {
            r2.A0y(SupportLinksFragment.A06, 1);
        }
    }
}
