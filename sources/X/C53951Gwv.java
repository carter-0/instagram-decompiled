package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gwv  reason: case insensitive filesystem */
public final class C53951Gwv extends C243963aQ {
    public final int A00;
    public final MediaType A01;
    public final C52971GgO A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final String A05;

    public C53951Gwv(MediaType mediaType, C52971GgO ggO, AnonymousClass0iw r4, UserSession userSession, String str, int i) {
        DbW.A1N(userSession, 1, r4);
        this.A04 = userSession;
        this.A05 = str;
        this.A01 = mediaType;
        this.A00 = i;
        this.A03 = r4;
        this.A02 = ggO;
    }

    public final C244523bK A0X(C244463bE r9) {
        0qQ.A0B(r9, 0);
        Object A002 = AnonymousClass3Zw.A00(r9, new C58188Ins(39, r9, this), new Object[]{this.A04, this.A05, this.A01});
        long A07 = C51965G9l.A07(this.A00);
        return C51965G9l.A0W((2WX) null, new 2WP(A07, A07), C51969G9p.A0f(r9, C51971G9r.A0d(IJE.A00, 3), C58301Ipi.A00, new C59101J6j(30, (Object) this, A002)));
    }
}
