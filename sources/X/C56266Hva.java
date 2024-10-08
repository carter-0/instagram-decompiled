package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hva  reason: case insensitive filesystem */
public abstract class C56266Hva {
    public static final void A00(Activity activity, Context context, UserSession userSession, String str) {
        boolean z;
        AnonymousClass5DY r0;
        Boolean valueOf;
        UserSession userSession2 = userSession;
        String str2 = str;
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U != null) {
            Context context2 = context;
            H3S h3s = (H3S) 00k.A0J(H3S.A08.A00(context, userSession, A0U, false));
            if (h3s == null || (r0 = h3s.A00) == null || (valueOf = Boolean.valueOf(r0.CbA())) == null) {
                z = false;
            } else {
                z = valueOf.booleanValue();
            }
            0Tu r5 = 0Tu.A05;
            boolean A06 = 182.A06(r5, userSession, 36323805437898263L);
            1Av A00 = 1Au.A00(userSession);
            Activity activity2 = activity;
            if (AnonymousClass7TG.A1a(A00, A00.A32, 1Av.A8a, 328) || !182.A06(r5, userSession, 36323083883129677L) || (z && A06)) {
                H1T A002 = C54901HXj.A00(userSession, str2, false);
                C331127Pr A0e = DbX.A0e(userSession, false);
                DbZ.A0z(context, A0e, 2131957288);
                if (A06) {
                    A0e.A0g = context.getString(2131955343);
                    A0e.A1J = true;
                    A0e.A0K = new ICC(activity2, context2, userSession2, str2, 0);
                }
                DbU.A0y(activity, A002, A0e);
                return;
            }
            H0C.A03.A00(activity2, context2, userSession2, str2, false);
        }
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, 0hq r13, AnonymousClass07Z r14, AnonymousClass07i r15, AnonymousClass0iw r16, UserSession userSession, 1Xj r18) {
        Integer num;
        1Xj r8 = r18;
        if (r8.A5p()) {
            num = AnonymousClass05K.A0C;
        } else if (r8.CeS()) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A02;
        }
        UserSession userSession2 = userSession;
        C290815g0 A00 = C59730JVo.A00(context, userSession2, r8, AnonymousClass000.A00(4041));
        A00.A00 = new C61674KGy(context, fragmentActivity, r13, r14, r16, userSession2, r8, DbV.A0h(context), num);
        1ES.A00(fragmentActivity, r15, A00);
    }
}
