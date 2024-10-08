package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.F9s  reason: case insensitive filesystem */
public abstract class C49853F9s {
    public static final 0xG A00 = DbS.A0O("aymh");
    public static final C50615FfW A01 = new C50615FfW(new C50616FfX(new MEQ(21, (AnonymousClass4D7) null)));
    public static final C50615FfW A02 = C51646Fy5.A02(12);
    public static final C50615FfW A03 = C51646Fy5.A02(13);
    public static final C50615FfW A04 = C51646Fy5.A02(14);
    public static final C50615FfW A05 = C51646Fy5.A02(15);
    public static final C50615FfW A06 = C51646Fy5.A02(16);
    public static final C50615FfW A07 = C51646Fy5.A02(17);
    public static final C50615FfW A08 = C51646Fy5.A02(18);
    public static final C50615FfW A09 = C51646Fy5.A02(19);
    public static final C50615FfW A0A = C51646Fy5.A02(20);

    public static final AnonymousClass4DH A00(FragmentActivity fragmentActivity) {
        List A042 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        0qQ.A07(A042);
        int size = A042.size() - 1;
        AnonymousClass4DH r2 = null;
        while (size >= 0) {
            Fragment fragment = (Fragment) A042.get(size);
            if (fragment instanceof AnonymousClass4DH) {
                r2 = (AnonymousClass4DH) fragment;
            }
            size--;
            if (r2 != null) {
                break;
            }
        }
        return r2;
    }
}
