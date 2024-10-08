package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ud6  reason: case insensitive filesystem */
public final class C15455Ud6 extends C331047Ph {
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
    public C15455Ud6(Context context, AnonymousClass0iw r6, UserSession userSession, X9R x9r, C229122ms r9) {
        AnonymousClass7TG.A1U(context, userSession, r9);
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

    public static final void A00(C15455Ud6 ud6) {
        ud6.A06();
        AnonymousClass2s2 r7 = ud6.A03;
        ud6.A08(r7, (Object) null);
        Iterator it = ud6.A02.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            User A0k = DbT.A0k(it);
            Reel reel = ud6.A00;
            C255773uh r2 = ud6.A01;
            if (!ud6.A09 || !ud6.A05.A0C(ud6.A04, A0k)) {
                z = false;
            }
            ud6.A08(ud6.A06, new C14631Tzd(reel, r2, A0k, z));
        }
        C229122ms r1 = ud6.A07;
        if (r1 != null && r1.CKB()) {
            ud6.A08(ud6.A08, r1);
        }
        ud6.A08(r7, (Object) null);
        ud6.A07();
    }
}
