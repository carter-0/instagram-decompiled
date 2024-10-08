package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class OWT {
    public static final AnonymousClass59G A05 = new AnonymousClass59G("", (Object) null, (Object) null);
    public static final byte[] A06 = {0};
    public final LruCache A00 = new LruCache(16);
    public final AnonymousClass2FF A01 = AnonymousClass2FF.A0A();
    public final UserSession A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A04;

    public final N2L A00(String str) {
        String A012;
        0qQ.A0B(str, 0);
        this.A04.getValue();
        AnonymousClass0HM.A00();
        C11199SEz sEz = C70954OTb.A04;
        String A002 = OYV.A00(str);
        if (A002 == null || (A012 = OYV.A01(A002, OYV.A02)) == null) {
            return null;
        }
        return (N2L) this.A00.get(A012);
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        0nY.A00().ATE(new C68666NRy(this, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r1 == 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0eM r0 = r2.A04
            r0.getValue()
            X.AnonymousClass0HM.A00()
            X.SEz r0 = X.C70954OTb.A04
            java.lang.String r1 = X.OYV.A00(r3)
            if (r1 == 0) goto L_0x0023
            java.lang.String[] r0 = X.OYV.A02
            java.lang.String r0 = X.OYV.A01(r1, r0)
            if (r0 == 0) goto L_0x0023
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWT.A02(java.lang.String):boolean");
    }

    public OWT(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = userSession;
        this.A04 = AnonymousClass0eN.A01(new C73667Phg(25, context, this));
    }
}
