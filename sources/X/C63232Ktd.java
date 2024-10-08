package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ktd  reason: case insensitive filesystem */
public abstract class C63232Ktd {
    public static final void A00(Fragment fragment, C61084JwM jwM) {
        boolean A1Z = AnonymousClass7TG.A1Z(fragment, jwM);
        C310336ap A0a = DbS.A0a();
        Resources A0R = JTR.A0R(fragment);
        C266444Yx r0 = (C266444Yx) jwM.A02;
        0qQ.A0B(r0, A1Z ? 1 : 0);
        A0a.A0D = r0.A00(A0R);
        C266444Yx r1 = (C266444Yx) jwM.A01;
        if (r1 != null) {
            A0a.A0I = r1.A00(JTR.A0R(fragment)).toString();
        }
        Number number = (Number) jwM.A00;
        if (number != null) {
            A0a.A02();
            A0a.A07(number.intValue());
        }
        C249463jp requireActivity = fragment.requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.igds.components.snackbar.IgSnackBarProvider");
        requireActivity.Bx5().A0A(A0a.A00());
    }
}
