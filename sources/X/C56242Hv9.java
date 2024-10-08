package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hv9  reason: case insensitive filesystem */
public abstract class C56242Hv9 {
    public static final void A00(Activity activity, AnonymousClass0iw r12, UserSession userSession, String str, 0sP r15, 0sL r16, boolean z) {
        UserSession userSession2 = userSession;
        C56160Hto hto = new C56160Hto(userSession);
        Activity activity2 = activity;
        String str2 = str;
        if (z) {
            hto.A01(activity, new C56762IBl(r16, userSession, str, 0), AnonymousClass7TE.A16(activity, 2131968504), R.drawable.instagram_eye_off_pano_outline_24);
        }
        hto.A00(activity2, new ICS(activity2, r12, userSession2, r15, str2, 1), AnonymousClass7TE.A16(activity, 2131972171), R.drawable.instagram_report_pano_outline_24);
        new C17897Vho(hto).A00(activity2);
    }

    public static final void A01(UserSession userSession, String str, boolean z) {
        Integer num;
        boolean A1X = DbW.A1X(str);
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            1sd.A00(userSession).A03(A0U, z, A1X);
            AnonymousClass942 A00 = AnonymousClass941.A00(userSession);
            if (z) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0N;
            }
            A00.A00(A0U, num);
            C274354oA A0x = C51966G9m.A0x(A0U);
            if (A0x != null) {
                C21494Xcl AKa = A0x.AKa();
                AKa.A0L = Boolean.valueOf(z);
                A0U.A0C.EoH(AKa.A00());
                A0U.AE7(userSession);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0z("Could not find media with this ID");
    }
}
