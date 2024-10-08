package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.P7l  reason: case insensitive filesystem */
public final class C72476P7l implements C328347El {
    public final AnonymousClass9HO A00;

    /* renamed from: A00 */
    public final N67 AWb(Context context, UserSession userSession, AnonymousClass9HC r17, AnonymousClass7LQ r18, AnonymousClass7L2 r19, 17i r20, boolean z) {
        AnonymousClass5FY r0;
        N4R n4r;
        String str;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        AnonymousClass7LQ r10 = r18;
        AnonymousClass7L2 r11 = r19;
        17i r3 = r20;
        C51974G9v.A1P(userSession2, r3, r11, r10);
        AnonymousClass9HC r9 = r17;
        0qQ.A0B(r9, 5);
        AnonymousClass79c A06 = AnonymousClass79S.A06(context, userSession2, this.A00, r9, r10, r11, r10.A0U, r10.A0V);
        boolean A002 = AnonymousClass760.A00(userSession2, z);
        C254703su r1 = r10.A0e;
        String A0t = C66582MXn.A0t(r1, A002 ? 1 : 0);
        0qQ.A0A(A0t);
        synchronized (r1) {
            r0 = r1.A0V;
        }
        if (r0 == null || (str = r0.A01) == null) {
            n4r = null;
        } else {
            n4r = new N4R(r1.A0G(), (ImageUrl) DbS.A0V(str));
        }
        return new N67(new NYH(n4r, A06), AnonymousClass7FX.A03(context, userSession2, r9, r10, r11, r3), A0t);
    }

    public C72476P7l(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
