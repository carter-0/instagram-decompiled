package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ud5  reason: case insensitive filesystem */
public final class C15454Ud5 extends C331047Ph {
    public Reel A00;
    public C255773uh A01;
    public final List A02 = new ArrayList();
    public final AnonymousClass2s2 A03;
    public final C251033mS A04;
    public final C250993mO A05;
    public final C14632Tze A06;
    public final C229122ms A07;
    public final C231762sK A08;
    public final boolean A09;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s2, java.lang.Object] */
    public C15454Ud5(Context context, AnonymousClass0iw r6, UserSession userSession, X9R x9r, C229122ms r9) {
        C14632Tze tze = new C14632Tze(context, r6, userSession, x9r);
        this.A06 = tze;
        C231762sK r2 = new C231762sK(context);
        this.A08 = r2;
        ? obj = new Object();
        this.A03 = obj;
        this.A07 = r9;
        this.A09 = DbV.A1Y(userSession);
        this.A04 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A05 = A012;
        C13990Tnq.A1I(this, tze, r2, obj, JTR.A05(context));
    }

    public static final void A00(C15454Ud5 ud5) {
        ud5.A06();
        AnonymousClass2s2 r6 = ud5.A03;
        ud5.A08(r6, (Object) null);
        Iterator it = ud5.A02.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                C42135BIq bIq = (C42135BIq) it.next();
                User user = bIq.A00;
                Reel reel = ud5.A00;
                C255773uh r2 = ud5.A01;
                if (ud5.A09) {
                    C250993mO r1 = ud5.A05;
                    C251033mS r0 = ud5.A04;
                    if (user == null) {
                        throw AnonymousClass7TE.A0y();
                    } else if (r1.A0C(r0, user)) {
                        C14631Tzd tzd = new C14631Tzd(reel, r2, user, z);
                        tzd.A05 = bIq.A02;
                        ud5.A08(ud5.A06, tzd);
                    }
                }
                z = false;
                C14631Tzd tzd2 = new C14631Tzd(reel, r2, user, z);
                tzd2.A05 = bIq.A02;
                ud5.A08(ud5.A06, tzd2);
            } else {
                C229122ms r12 = ud5.A07;
                if (r12 != null && r12.CKB()) {
                    ud5.A08(ud5.A08, r12);
                }
                ud5.A08(r6, (Object) null);
                ud5.A07();
                return;
            }
        }
    }
}
