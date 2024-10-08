package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiR  reason: case insensitive filesystem */
public abstract class C48680EiR {
    public static final Object A00(C307896Rx r34, AnonymousClass6Tm r35) {
        EWJ ewj;
        long j;
        long j2;
        2Ay r0;
        AnonymousClass6Tm r2 = r35;
        String str = (String) DbW.A0g(r2, 1);
        int A04 = DbW.A04(r2.A00(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(DbU.A0j(r2), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0Z = DbT.A0Z(r34);
        FragmentActivity A043 = C308206Td.A04(r34);
        FragmentActivity A044 = C308206Td.A04(r34);
        0lg A0B = C308206Td.A0B(r34);
        Fragment A0H = DbU.A0H(r34);
        EWJ[] values = EWJ.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ewj = EWJ.UNKNOWN;
                break;
            }
            ewj = values[i];
            if (ewj.name().equals(AnonymousClass7TF.A0k(str))) {
                break;
            }
            i++;
        }
        if (182.A06(DbS.A0J(A0Z, 0), A0Z, 36313725149448399L)) {
            j = 1;
        } else {
            j = 60;
        }
        long j3 = ((long) A042) / 60;
        long j4 = j3 * j;
        if (A04 != 0) {
            if (A04 == 1) {
                long A05 = DbW.A05(A0Z);
                boolean A0K = 0qQ.A0K(str, "ig_setting_shortcuts");
                j2 = 0;
                if (A05 <= 0 || A0K) {
                    new 2Cd(A0Z).A03(A0H, j4);
                    long A052 = DbW.A05(A0Z);
                    2Aq.A03(A0Z).A0R();
                    if (!A0K) {
                        FragmentActivity fragmentActivity = A043;
                        FragmentActivity fragmentActivity2 = A044;
                        FG5.A03(fragmentActivity, fragmentActivity2, A0B, A0Z, str, (A052 / j) * 60);
                    }
                    r0 = 2Ay.A0B;
                } else {
                    Drawable drawable = A043.getDrawable(R.drawable.instagram_clock_dotted_pano_outline_24);
                    C310336ap A0a = DbS.A0a();
                    DbS.A19(A043, A0a, 2131975007);
                    A0a.A09(DbT.A0K(A044).A0Q());
                    DbW.A0q(A043, A0a, 2131961425);
                    A0a.A0A(new FdA(0, A044, A0B, A0Z));
                    if (drawable != null) {
                        A0a.A08(drawable, A043.getColor(2Yu.A05(A043)));
                    }
                    A0a.A02();
                    A0a.A0L = true;
                    A0a.A06();
                    Dbb.A1Q(A0a);
                    2Ci.A07(A0Z, AnonymousClass05K.A0D, Long.valueOf(Dba.A01(A0Z)));
                }
            }
            return null;
        }
        new 2Cd(A0Z).A02(A0H, j4);
        C310336ap A0a2 = DbS.A0a();
        A0a2.A0D = DbW.A0h(A043, C49927FFd.A02(AnonymousClass7TF.A0A(A043), j4), 2131957342);
        A0a2.A09(DbT.A0K(A044).A0Q());
        A0a2.A06();
        Dbb.A1Q(A0a2);
        j3 = AnonymousClass3FV.A00();
        j2 = 0;
        r0 = 2Ay.A03;
        2Ci.A06(A0Z, ewj, r0.A00, j3, j2, Dba.A01(A0Z));
        return null;
    }
}
