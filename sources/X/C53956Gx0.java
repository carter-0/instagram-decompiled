package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gx0  reason: case insensitive filesystem */
public final class C53956Gx0 extends C243963aQ {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final C54588HJx A03;
    public final C52129GFx A04;
    public final Integer A05;
    public final String A06;

    public final C244523bK A0X(C244463bE r8) {
        0qQ.A0B(r8, 0);
        0sn r0 = (List) C52149GGr.A00(r8, this.A03.A03);
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        int size = r0.size();
        2WO r5 = new 2WO(0, 0);
        AnonymousClass2WG A0f = C51969G9p.A0f(r8, C51971G9r.A0e(C56974IJs.A00, false), C58635Iv6.A00, new J6V(size, 15, (Object) r8, (Object) this));
        AnonymousClass3XV r02 = 2WX.A02;
        return C51965G9l.A0W(G9t.A10(C51974G9v.A0L((2WX) null, AnonymousClass05K.A01), AnonymousClass05K.A04, J6J.A00(this, 9)), r5, A0f);
    }

    public C53956Gx0(C267324bN r1, C52058GDe gDe, UserSession userSession, C54588HJx hJx, C52129GFx gFx, Integer num, String str) {
        C51972G9s.A1C(str, gFx);
        this.A02 = userSession;
        this.A06 = str;
        this.A03 = hJx;
        this.A04 = gFx;
        this.A00 = r1;
        this.A01 = gDe;
        this.A05 = num;
    }
}
