package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class OHJ {
    public AnonymousClass2t9 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final P3E A03;
    public final C69319NjK A04;
    public final DirectThreadKey A05;
    public final String A06;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.2tF, java.lang.Object] */
    public OHJ(Context context, AnonymousClass0iw r14, UserSession userSession, P3E p3e, C69319NjK njK, DirectThreadKey directThreadKey, String str) {
        String str2;
        this.A02 = userSession;
        this.A01 = r14;
        this.A03 = p3e;
        this.A04 = njK;
        this.A06 = str;
        this.A05 = directThreadKey;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C68586NOi(new C70427O6e(this)));
        A002.A01(new C68575NNw(new C70430O6h(this)));
        UserSession userSession2 = this.A02;
        A002.A01(new C68587NOj(userSession2, new C59110J6s(this, 25), new C59110J6s(this, 26), new JJR(this, 14)));
        AnonymousClass0iw r7 = this.A01;
        C70431O6i o6i = new C70431O6i(this);
        String str3 = this.A06;
        A002.A01(new NOV(r7, userSession2, o6i, str3));
        A002.A01(new NOP(r7, userSession2, new C72329P1u(this)));
        A002.A01(new Object());
        A002.A01(new C68742NVc(r7, userSession2, new C70432O6j(this)));
        DirectThreadKey directThreadKey2 = this.A05;
        C72324P1p p1p = new C72324P1p(this);
        if (directThreadKey2 != null) {
            str2 = directThreadKey2.A00;
        } else {
            str2 = null;
        }
        A002.A01(new NPW(new C72321P1m(userSession2, str2), p1p));
        A002.A01(new C385749jT(userSession2, new C70423O6a(this)));
        A002.A01(new NQF(C69447Nlr.STICKER, r7, userSession2, new C72327P1s(this), this.A04, str3));
        A002.A01(new KG9((Integer) null, 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(C69300Nj1.AI_TRY_AGAIN, new C73923Pm3(this, 10)), AnonymousClass7TE.A1L(C69300Nj1.CUTOUT_STICKER_SEE_MORE, new C73923Pm3(this, 11)), AnonymousClass7TE.A1L(C69300Nj1.GIPHY_STICKER_SEE_MORE, new C73923Pm3(this, 12)), AnonymousClass7TE.A1L(C69300Nj1.FAVORITE_STICKER_SEE_MORE, new C73923Pm3(this, 13)), AnonymousClass7TE.A1L(C69300Nj1.RECENT_STICKER_SEE_MORE, new C73923Pm3(this, 14))})));
        A002.A01(new NNy(new C70424O6b(this)));
        A002.A01(new NO1(new C70425O6c(this)));
        A002.A01(new C68577NNz(new C70426O6d(this)));
        A002.A01(new NO0(new C70428O6f(this)));
        this.A00 = DbU.A0U(A002, new C68576NNx(new C70429O6g(this)));
    }
}
