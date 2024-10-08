package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.P1l  reason: case insensitive filesystem */
public final class C72320P1l implements C20948X6b {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72320P1l(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Dgj(N41 n41) {
        C61077JwF jwF;
        C68137N2b n2b;
        if (this.A00 == 0) {
            C68469NJh nJh = (C68469NJh) this.A02;
            UserSession A0l = AnonymousClass7TE.A0l(nJh.A04);
            String A012 = n41.A01();
            C71044OaM.A00((Context) this.A01, nJh.A02, A0l, (AnonymousClass4D6) null, (GifUrlImpl) null, AnonymousClass05K.A0C, AnonymousClass05K.A0j, A012, (String) null, nJh.A03, C73915Plq.A00(nJh, n41, 41), C73745Pj6.A00);
        } else if (N41.A00(2, n41) && (jwF = (C61077JwF) n41.A01) != null && (n2b = (C68137N2b) jwF.A00) != null) {
            C71020OYv oYv = (C71020OYv) this.A02;
            C71151OeJ.A0D(new NMH(2, n2b, oYv), oYv.A06, (AnonymousClass4D6) this.A01, n2b);
        }
    }

    public final void Dv8(N41 n41) {
        C61077JwF jwF;
        C68137N2b n2b;
        if (this.A00 == 0) {
            C68469NJh nJh = (C68469NJh) this.A02;
            UserSession A0l = AnonymousClass7TE.A0l(nJh.A04);
            String A012 = n41.A01();
            C71044OaM.A02(nJh.A02, A0l, (AnonymousClass4D6) null, (GifUrlImpl) null, AnonymousClass05K.A0j, A012, (String) null, nJh.A03, C73915Plq.A00(nJh, n41, 42));
        } else if (N41.A00(2, n41) && (jwF = (C61077JwF) n41.A01) != null && (n2b = (C68137N2b) jwF.A00) != null) {
            C71020OYv oYv = (C71020OYv) this.A02;
            C71151OeJ.A0E(new NMH(3, n2b, oYv), oYv.A06, (AnonymousClass4D6) this.A01, n2b);
        }
    }
}
