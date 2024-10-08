package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ErZ  reason: case insensitive filesystem */
public abstract class C49230ErZ {
    public static final void A00(UserSession userSession, String str, C62320sa r9) {
        Long A0n;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "igwb_screenshot_capture");
        Object invoke = r9.invoke();
        if (invoke != null) {
            C48083EVb eVb = C48083EVb.DIRECT_MESSAGE;
            0Tu r2 = 0Tu.A05;
            if (invoke == eVb) {
                if (!182.A06(r2, userSession, 36323101063129948L)) {
                    return;
                }
            } else if (!182.A06(r2, userSession, 36323101062998874L)) {
                return;
            }
            long j = 0;
            A0e.A9F("user_igid", Long.valueOf(DbY.A04(00y.A0n(10, userSession.A06))));
            if (!(str == null || (A0n = 00y.A0n(10, str)) == null)) {
                j = A0n.longValue();
            }
            A0e.A9F("account_viewed_igid", Long.valueOf(j));
            DbS.A1M(A0e, AnonymousClass7TF.A0j(invoke.toString()));
            A0e.Cgf();
        }
    }
}
