package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.litho.ComponentTree;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.GTj  reason: case insensitive filesystem */
public final class C52457GTj extends C243963aQ {
    public final C55589Hk9 A00;
    public final AnonymousClass6Q5 A01;
    public final C229382nI A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final AnonymousClass3OA A05;
    public final JQM A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;

    public C52457GTj(C55589Hk9 hk9, AnonymousClass6Q5 r3, C229382nI r4, UserSession userSession, 1Xj r6, AnonymousClass3OA r7, JQM jqm, String str, Map map, boolean z, boolean z2) {
        DbW.A1N(r4, 2, map);
        this.A03 = userSession;
        this.A02 = r4;
        this.A05 = r7;
        this.A07 = str;
        this.A08 = map;
        this.A06 = jqm;
        this.A00 = hk9;
        this.A0A = z;
        this.A01 = r3;
        this.A09 = z2;
        this.A04 = r6;
    }

    public final C244523bK A0X(C244463bE r12) {
        2WU A0e;
        0qQ.A0B(r12, 0);
        2Wa A002 = C243643Zq.A00(r12, C52666Gae.A00);
        2Wa A003 = C243643Zq.A00(r12, C52667Gaf.A00);
        2Wa A004 = C243643Zq.A00(r12, C52669Gah.A00);
        C243773a4.A00(r12, new C58218IoM(41, A003, A004, this, r12, A002), C51966G9m.A1b());
        if (182.A06(0Tu.A05, this.A03, 36326107540108809L)) {
            A0e = new 2WU(C243983aS.A00, GYF.A00, 0, false);
        } else {
            A0e = C51971G9r.A0e(C56968IJm.A00, false);
        }
        return C51974G9v.A07(r12, A0e, new C52467GTt((ComponentTree) A002.A03, this.A05, (C54705HPk) A003.A03), C52459GTl.A00, new C58750Iwx(0, r12, this, A004));
    }

    public static final Activity A00(Context context, C52457GTj gTj) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        0qQ.A07(baseContext);
        return A00(baseContext, gTj);
    }
}
