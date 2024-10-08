package X;

import android.app.Dialog;
import android.content.ClipData;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EfJ  reason: case insensitive filesystem */
public abstract class C48486EfJ {
    public static Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        C276544tV A0M = DbW.A0M(r15, 0);
        if (A0M == null) {
            1Kn.A02(C273654mx.A00(571), "Received null config model");
            return null;
        }
        String str = "";
        String A0J = A0M.A0J();
        if (A0J != null) {
            str = A0J;
        }
        String A11 = DbV.A11(A0M, "", 46);
        String A112 = DbV.A11(A0M, "", 44);
        String A113 = DbV.A11(A0M, "", 45);
        String A114 = DbV.A11(A0M, "", 48);
        FragmentActivity A04 = C308206Td.A04(r14);
        UserSession A0Z = DbT.A0Z(r14);
        ClipData newPlainText = ClipData.newPlainText((CharSequence) null, 002.A0g(A11, 002.A0R(", ", A112), 002.A0R(", ", A113)));
        Object A0e = DbZ.A0e(A04);
        C49993FIc fIc = new C49993FIc(A04, str, A11, A112, A113);
        C50025FJk A00 = C50025FJk.A00(A0e, newPlainText, 5);
        W5S w5s = new W5S(r14, A0Z, A114);
        C358248ab A0Y = DbS.A0Y(A04);
        if (!0mp.A0B(A114) && !A114.trim().equals("0")) {
            A0Y.A0Q(w5s, C358278ae.DEFAULT, 2131973134);
        }
        A0Y.A0G(fIc, 2131973133);
        A0Y.A0H(A00, 2131956744);
        A0Y.A0r(true);
        Dialog A02 = A0Y.A02();
        A02.setCanceledOnTouchOutside(true);
        AnonymousClass0fN.A00(A02);
        return null;
    }
}
