package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Epv  reason: case insensitive filesystem */
public abstract class C49132Epv {
    public static final void A00(Context context, AnonymousClass0iw r12, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        1P0 edt;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        String str = AnonymousClass1CT.A00(userSession).A04;
        Context context2 = context;
        if (context != null) {
            Boolean valueOf = Boolean.valueOf(z2);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            DbZ.A0y(context, A0a, C46325Dbt.A00(0, 9, 17), DbT.A0t(context, A0a, "accounts/fetch_onetap/"));
            A0a.A0E("is_app_level_spi", valueOf);
            A0a.A0E("is_removal_only", Boolean.valueOf(z3));
            DbW.A1A(19f.A28, A0a, DbT.A0P(userSession));
            1OC A0L = DbW.A0L(A0a, C47362Dvw.class, F6P.class, true);
            if (z3) {
                edt = new EBX(userSession);
            } else {
                edt = new EDT(context2, r12, userSession2, str, z4, z);
            }
            A0L.A00 = edt;
            1ES.A03(A0L);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
