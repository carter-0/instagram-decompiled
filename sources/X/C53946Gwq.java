package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gwq  reason: case insensitive filesystem */
public final class C53946Gwq extends C243963aQ {
    public final C54216H3l A00;
    public final C333777a7 A01;
    public final C52971GgO A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public final C244523bK A0X(C244463bE r7) {
        int i;
        0qQ.A0B(r7, 0);
        Object obj = new Object();
        C54216H3l h3l = this.A00;
        List C48 = h3l.A00.C48();
        if (C48 != null) {
            i = C48.size();
        } else {
            i = 4;
        }
        return C51965G9l.A0W(2WX.A02, new IKK(i, h3l.A01, h3l.A03, h3l.A02), C51969G9p.A0f(r7, G9t.A16(IJG.A00), C58303Ipk.A00, new J6W(10, obj, r7, this)));
    }

    public C53946Gwq(C54216H3l h3l, C333777a7 r2, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r5) {
        C51974G9v.A1L(userSession, h3l, ggO);
        this.A03 = userSession;
        this.A00 = h3l;
        this.A01 = r2;
        this.A02 = ggO;
        this.A04 = r5;
    }
}
