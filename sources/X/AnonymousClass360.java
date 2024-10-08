package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.360  reason: invalid class name */
public final class AnonymousClass360 implements 1wn {
    public final /* synthetic */ AnonymousClass35W A00;

    public AnonymousClass360(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        FragmentActivity activity;
        int A03 = AnonymousClass0fD.A03(-1619317533);
        AnonymousClass3DU r8 = (AnonymousClass3DU) obj;
        int A032 = AnonymousClass0fD.A03(167090113);
        0qQ.A0B(r8, 0);
        if (r8.A01) {
            1Xj r3 = r8.A00;
            if (r3.A58()) {
                AnonymousClass35W r2 = this.A00;
                Fragment fragment = (Fragment) r2.A0b.get();
                if (fragment == null || (activity = fragment.getActivity()) == null) {
                    i = -1124072785;
                    AnonymousClass0fD.A0A(i, A032);
                    AnonymousClass0fD.A0A(-1247527177, A03);
                }
                JZV.A08(activity, r2.A0T, r3, 0);
            }
        }
        i = 1193865808;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1247527177, A03);
    }
}
