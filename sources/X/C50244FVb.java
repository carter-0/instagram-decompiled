package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.FVb  reason: case insensitive filesystem */
public final class C50244FVb implements AnonymousClass3OS {
    public final /* synthetic */ ExtendedImageUrl A00;
    public final /* synthetic */ Dc6 A01;
    public final /* synthetic */ String A02;

    public C50244FVb(ExtendedImageUrl extendedImageUrl, Dc6 dc6, String str) {
        this.A01 = dc6;
        this.A00 = extendedImageUrl;
        this.A02 = str;
    }

    public final void DJs(1NK r6) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A01.A0A;
        0Tu A0J = DbS.A0J(userSession, 0);
        boolean A06 = 182.A06(A0J, userSession, 36320008688115582L);
        boolean A062 = 182.A06(A0J, userSession, 36320008688181119L);
        1OO A0J2 = r6.A0J(this.A00, this.A02);
        A0J2.A0I = A06;
        A0J2.A0G = A062;
        A0J2.A01();
    }
}
