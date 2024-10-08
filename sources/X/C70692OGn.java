package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OGn  reason: case insensitive filesystem */
public final class C70692OGn {
    public AnonymousClass2t9 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C71083Ob6 A03;
    public final C69319NjK A04;
    public final String A05;

    public C70692OGn(Context context, AnonymousClass0iw r12, UserSession userSession, C71083Ob6 ob6, C69319NjK njK, String str) {
        this.A02 = userSession;
        this.A01 = r12;
        this.A03 = ob6;
        this.A04 = njK;
        this.A05 = str;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        UserSession userSession2 = this.A02;
        A002.A01(new NQF(C69447Nlr.AI_STICKER, this.A01, userSession2, new C72326P1r(this), this.A04, this.A05));
        A002.A01(new KGV(new C73923Pm3(this, 9)));
        this.A00 = DbU.A0U(A002, new C61667KGr(true));
    }
}
