package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2rx  reason: invalid class name and case insensitive filesystem */
public final class C231612rx implements C249453jo {
    public final Fragment A00;
    public final FragmentActivity A01;

    public C231612rx(Fragment fragment, FragmentActivity fragmentActivity) {
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(fragment, 2);
        this.A01 = fragmentActivity;
        this.A00 = fragment;
    }

    public final 2dZ AYJ() {
        C249453jo r1 = this.A01;
        if (r1 instanceof C249453jo) {
            return r1.AYJ();
        }
        return 2dZ.A0t.A05(this.A00);
    }
}
