package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FoT  reason: case insensitive filesystem */
public final class C51099FoT implements C51889G6e {
    public final int A00;
    public final Object A01;

    public C51099FoT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DwT(String str) {
        switch (this.A00) {
            case 0:
                C51028FnK fnK = (C51028FnK) this.A01;
                C49239Eri.A00(fnK.A00, fnK.A01, fnK.A02, fnK.A05.getUsername());
                return;
            case 1:
                C49863FAf fAf = (C49863FAf) this.A01;
                FragmentActivity fragmentActivity = fAf.A02;
                C49239Eri.A00(fragmentActivity, fragmentActivity, fAf.A06, fAf.A09.getUsername());
                return;
            default:
                Fragment fragment = (Fragment) this.A01;
                if (fragment.isResumed()) {
                    C59689JTv.A07(fragment.getContext(), 2131952092);
                    return;
                }
                return;
        }
    }
}
