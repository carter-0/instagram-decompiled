package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ehx  reason: case insensitive filesystem */
public abstract class C48650Ehx {
    public static final Object A00(C307896Rx r29, AnonymousClass6Tm r30) {
        int i;
        String str;
        EWJ ewj;
        C331157Pu A02;
        AnonymousClass6Tm r4 = r30;
        String str2 = (String) DbW.A0g(r4, 1);
        int A04 = DbW.A04(r4.A03(2), "null cannot be cast to non-null type kotlin.Number");
        C307896Rx r5 = r29;
        C58716IwP iwP = new C58716IwP(32, (Object) r4, (Object) r5);
        UserSession A0Y = DbT.A0Y(r5);
        FragmentActivity A042 = C308206Td.A04(r5);
        Fragment A022 = C308206Td.A02(r5);
        0qQ.A0B(A0Y, 0);
        AnonymousClass7TF.A1C(A042, 1, str2);
        1We r8 = 1We.A02;
        if (r8 == null) {
            return null;
        }
        C49431EvX evX = new C49431EvX(iwP);
        Integer[] A00 = AnonymousClass05K.A00(2);
        int length = A00.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Integer num = A00[i3];
            if (1 - num.intValue() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == A04) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        1We.A00(r8);
                        C48032ERv eRv = new C48032ERv();
                        0qQ.A0C(eRv, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
                        if (str2.equals("ig_ts_entry_point_similar_posts_nudge") || str2.equals("ig_ts_entry_point_profile_qp")) {
                            long A05 = DbW.A05(A0Y);
                            UserSession userSession = A0Y;
                            A02 = 1We.A00(r8).A02(A042, A022, A042, A0Y, new FmE(A042, F62.A00(A042, R.drawable.instagram_clock_dotted_pano_outline_24), A022, A042, userSession, A0Y, evX, str2, A05, true), eRv);
                        } else {
                            A02 = 1We.A00(r8).A02(A042, A022, A042, A0Y, new FmA(6, evX, A0Y), eRv);
                        }
                        A02.A02(A042, eRv);
                    }
                } else if (182.A06(0Tu.A05, A0Y, 2342161703641160074L)) {
                    C309516Yo A0Q = DbU.A0Q(A042, A0Y);
                    A0Q.A0B((Bundle) null, Eq6.A00(C21251XQw.DAILY_LIMIT, (String) null));
                    A0Q.A04();
                } else {
                    C331157Pu A002 = FG5.A00(A042, A0Y, r8, evX);
                    1We.A00(r8);
                    A002.A02(A042, new C48026ERp());
                }
                long A003 = AnonymousClass3FV.A00();
                if (intValue != 0) {
                    str = "take_break";
                } else {
                    str = "daily_limit";
                }
                EWJ[] values = EWJ.values();
                int length2 = values.length;
                while (true) {
                    if (i2 >= length2) {
                        ewj = EWJ.UNKNOWN;
                        break;
                    }
                    ewj = values[i2];
                    if (0qQ.A0K(ewj.name(), AnonymousClass7TF.A0k(str2))) {
                        break;
                    }
                    i2++;
                }
                2Ci.A05(A0Y, ewj, str, A003, Dba.A01(A0Y));
                return null;
            }
            i3++;
        }
        throw AnonymousClass7TE.A0w("Invalid reminder type");
    }
}
