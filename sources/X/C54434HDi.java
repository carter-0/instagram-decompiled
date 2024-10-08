package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Map;

/* renamed from: X.HDi  reason: case insensitive filesystem */
public final class C54434HDi extends C252733pa {
    public final AnonymousClass4HW A00 = C335967dq.A00(AnonymousClass4HU.A00);
    public final UserSession A01;
    public final L29 A02;
    public final Map A03 = AnonymousClass7TE.A1E();
    public final Map A04 = AnonymousClass7TE.A1E();

    public final void A00(Context context, AnonymousClass0iw r19, C243363Yl r20, String str) {
        C243363Yl r1 = r20;
        0qQ.A0B(r1, 3);
        UserSession userSession = this.A01;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            C243363Yl r3 = C243363Yl.LIKED;
            if (r1 == r3) {
                r3 = C243363Yl.NOT_LIKED;
            }
            AnonymousClass0iw r7 = r19;
            0q2.A00(userSession).A0M(r7, r3, A0U, C61970qY.A07(), (Map) null, false);
            0qQ.A0B(userSession, 4);
            C54994HaR.A00(userSession, 0q2.A00(userSession).A0L(A0U), r3, A0U);
            String moduleName = r7.getModuleName();
            Integer A0j = C51967G9n.A0j();
            1OC A002 = C56622I4z.A00(context, userSession, r3, A0U, (SearchContext) null, (Integer) null, (Integer) null, A0j, A0j, (Long) null, (String) null, moduleName, (String) null, (Map) null, false, false);
            A002.A00 = new H4N(2, (Object) null, A0U, userSession, (Object) null);
            1ES.A03(A002);
        }
    }

    public final void A01(String str, 0sP r9, boolean z) {
        String str2 = str;
        0sP r2 = r9;
        if (z) {
            Map map = this.A04;
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                if (obj != null) {
                    r9.invoke(obj);
                    return;
                }
                return;
            }
        }
        AnonymousClass7TE.A1Z(new C66173MGk(r2, this, str2, (AnonymousClass4D7) null, 3), this.A01);
    }

    public C54434HDi(UserSession userSession, L29 l29) {
        super("Chains", AnonymousClass43D.A00(274450118));
        this.A02 = l29;
        this.A01 = userSession;
    }
}
