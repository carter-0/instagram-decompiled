package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import com.instagram.common.session.UserSession;

public abstract class OPR {
    public static final 2EM A00(N4G n4g) {
        int i = n4g.A00;
        if (i == 0) {
            return AnonymousClass2EU.A00;
        }
        if (i == 1) {
            return AnonymousClass2EL.A00;
        }
        if (i == 7) {
            String str = n4g.A01;
            if (str != null) {
                return new 2Ej(str);
            }
            throw AnonymousClass7TE.A0y();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Unsupported folder to move to: ");
        A1A.append(n4g);
        throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l(".threadFolder", A1A));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    public static final void A01(Context context, N4G n4g, UserSession userSession, String str, int i, boolean z) {
        int i2;
        String[] strArr;
        ? A1Z = AnonymousClass7TG.A1Z(context, userSession);
        0qQ.A0B(n4g, 2);
        if (2El.A0C(userSession) && n4g.A00 != -1) {
            2EM A00 = A00(n4g);
            if (str == null) {
                str = C66786McX.A00(context, userSession, A00);
            }
            if (2El.A08(userSession)) {
                Resources resources = context.getResources();
                if (i > A1Z) {
                    i2 = 2131964261;
                    strArr = new String[]{String.valueOf(i), str};
                } else {
                    i2 = 2131964262;
                    strArr = new String[]{str};
                }
                Spanned A01 = 0bC.A01(resources, strArr, i2);
                0qQ.A0A(A01);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = A01;
                DbW.A0q(context, A0a, 2131964263);
                A0a.A0A(new C72729PHj(2, A00, userSession));
                if (z) {
                    A0a.A0L = A1Z;
                }
                Dbb.A1Q(A0a);
                return;
            }
            C59689JTv.A09(context, DbW.A0h(context, str, 2131964260));
        }
    }
}
