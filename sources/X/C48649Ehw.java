package X;

import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ehw  reason: case insensitive filesystem */
public abstract class C48649Ehw {
    public static final Object A00(C307896Rx r30, AnonymousClass6Tm r31) {
        EWJ ewj;
        AnonymousClass6Tm r3 = r31;
        String str = (String) DbW.A0g(r3, 1);
        int A04 = DbW.A04(r3.A00(), "null cannot be cast to non-null type kotlin.Number");
        Object A0p = DbT.A0p(r3, 3);
        0qQ.A0C(A0p, "null cannot be cast to non-null type kotlin.Number");
        ((Number) A0p).intValue();
        0lg A0B = C308206Td.A0B(r30);
        UserSession A0Z = DbT.A0Z(r30);
        Fragment A02 = C308206Td.A02(r30);
        FragmentActivity A042 = C308206Td.A04(r30);
        FragmentActivity A043 = C308206Td.A04(r30);
        1We r32 = 1We.A02;
        long A05 = DbW.A05(A0Z);
        BitmapDrawable A00 = F62.A00(A042, R.drawable.instagram_clock_dotted_pano_outline_24);
        EWJ[] values = EWJ.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ewj = EWJ.IG_TS_SIMILAR_POSTS_NUDGE;
                break;
            }
            ewj = values[i];
            if (0qQ.A0K(ewj.name(), AnonymousClass7TF.A0k(str))) {
                break;
            }
            i++;
        }
        if (r32 == null) {
            return null;
        }
        if (A04 == 0) {
            C331157Pu A002 = FG5.A00(A042, A0Z, r32, (C49431EvX) null);
            1We.A00(r32);
            A002.A03(A042, new C48026ERp());
            2Ci.A05(A0Z, ewj, "daily_limit", AnonymousClass3FV.A00(), Dba.A01(A0Z));
            return null;
        } else if (A04 != 1) {
            0f9 AEf = 0wj.A01.AEf("IGBloksActionNavigationOpenTimeReminderSettingV2Impl_evaluate(): Invalid reminder type", 817892914);
            AEf.ABO("reminder type", A04);
            AEf.report();
            return null;
        } else {
            1We.A00(r32);
            C48032ERv eRv = new C48032ERv();
            0qQ.A0C(eRv, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
            0qQ.A0B(A0B, 0);
            AnonymousClass7TF.A1B(A0Z, 1, A042);
            AnonymousClass7TF.A1G(A043, 4, str);
            1We.A00(r32).A02(A042, A02, A043, A0Z, new FmE(A042, A00, A02, A043, A0B, A0Z, (C49431EvX) null, str, A05, true), eRv).A03(A042, eRv);
            2Ci.A05(A0Z, ewj, "take_break", AnonymousClass3FV.A00(), Dba.A01(A0Z));
            return null;
        }
    }
}
