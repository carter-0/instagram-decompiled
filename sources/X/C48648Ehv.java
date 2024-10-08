package X;

import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ehv  reason: case insensitive filesystem */
public abstract class C48648Ehv {
    public static final Object A00(C307896Rx r20, AnonymousClass6Tm r21) {
        int i = 1;
        AnonymousClass6Tm r0 = r21;
        String str = (String) DbW.A0d(r0);
        Object A0p = DbT.A0p(r0, 2);
        if (A0p != null) {
            i = AnonymousClass7TE.A0M(A0p);
        }
        0lg A0B = C308206Td.A0B(r20);
        UserSession A0Z = DbT.A0Z(r20);
        Fragment A02 = C308206Td.A02(r20);
        FragmentActivity A04 = C308206Td.A04(r20);
        1We r2 = 1We.A02;
        if (r2 != null) {
            if (i == 0) {
                C331157Pu A00 = FG5.A00(A04, A0Z, r2, (C49431EvX) null);
                1We.A00(r2);
                A00.A02(A04, new C48026ERp());
            } else {
                long A05 = DbW.A05(A0Z);
                1We.A00(r2);
                C48032ERv eRv = new C48032ERv();
                0qQ.A0C(eRv, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
                BitmapDrawable A002 = F62.A00(A04, R.drawable.instagram_clock_dotted_pano_outline_24);
                AnonymousClass7TF.A1H(A0B, A0Z);
                0qQ.A0B(A04, 2);
                AnonymousClass7TF.A1G(A04, 4, str);
                1We.A00(r2).A02(A04, A02, A04, A0Z, new FmE(A04, A002, A02, A04, A0B, A0Z, (C49431EvX) null, str, A05, false), eRv).A02(A04, eRv);
            }
            if (A02 instanceof C52477GUf) {
                long A003 = AnonymousClass3FV.A00();
                EWJ ewj = EWJ.IG_TS_SIMILAR_POSTS_NUDGE;
                long A01 = Dba.A01(A0Z);
                0qQ.A0B(A0Z, 0);
                2Ci.A02(A0Z, ewj, AnonymousClass05K.A1F, (Long) null, Long.valueOf(A003), Long.valueOf(A01), (String) null, (Map) null);
            }
        }
        return null;
    }
}
