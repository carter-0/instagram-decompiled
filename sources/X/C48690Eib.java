package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Eib  reason: case insensitive filesystem */
public abstract class C48690Eib {
    public static final Object A00(AnonymousClass6Tm r4) {
        0SM r0;
        String A0g = DbY.A0g(r4);
        Object A00 = r4.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        FragmentActivity A03 = C308206Td.A03((C307786Rm) A00);
        AnonymousClass7TG.A1N(A03, A0g);
        C49954FGj fGj = C49954FGj.A00;
        List A032 = C46604Dhk.A03(C46604Dhk.A00(A03));
        if (A032 == null || A032.isEmpty()) {
            r0 = null;
        } else {
            r0 = C49954FGj.A00(fGj, A0g, A032);
        }
        G9A g9a = (G9A) r0;
        if (g9a == null) {
            1Kn.A02("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
            return null;
        }
        g9a.ED4(A0g);
        return null;
    }
}
