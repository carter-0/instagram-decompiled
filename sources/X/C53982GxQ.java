package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GxQ  reason: case insensitive filesystem */
public final class C53982GxQ extends C243963aQ {
    public static final 2WU A08;
    public static final 2WU A09;
    public final int A00;
    public final ImageUrl A01;
    public final AnonymousClass4DU A02;
    public final JTB A03;
    public final GFO A04;
    public final 2WX A05;
    public final UserSession A06;
    public final boolean A07;

    public final C244523bK A0X(C244463bE r16) {
        2WU r6;
        long A0D;
        C244463bE r1 = r16;
        0qQ.A0B(r1, 0);
        GFO gfo = this.A04;
        if (gfo.A0D()) {
            r6 = A08;
        } else {
            r6 = A09;
        }
        UserSession userSession = this.A06;
        AnonymousClass4DU r11 = this.A02;
        C52046GCs gCs = new C52046GCs(userSession, r11);
        IK9 ik9 = new IK9(r6);
        AnonymousClass2WG A0f = C51969G9p.A0f(r1, r6, C58603Iua.A00, J6E.A00(this, 39));
        AnonymousClass3XV r7 = 2WX.A02;
        2WX A002 = r7.A00(this.A05);
        if (!this.A07 || this.A00 != 0) {
            A0D = C51969G9p.A0D();
        } else {
            A0D = C244013aV.A03(r1);
        }
        return C51965G9l.A0W(A002.A00(C51972G9s.A0S((2WX) null, 0, A0D)).A00(C51973G9u.A0Z(GFM.A00(C238863Ds.THUMBNAIL_LINK, r7, (C59543JNp) null, gfo.A0D, userSession, r11, Integer.valueOf(this.A00), false, false), J6R.A00(this, gCs, 21))), ik9, A0f);
    }

    static {
        C52675Gan gan = C52675Gan.A00;
        C243983aS r4 = C243983aS.A00;
        A08 = new 2WU(r4, gan, 3, false);
        A09 = new 2WU(r4, C56973IJr.A00, 3, false);
    }

    public C53982GxQ(2WX r1, UserSession userSession, ImageUrl imageUrl, AnonymousClass4DU r4, JTB jtb, GFO gfo, int i, boolean z) {
        this.A06 = userSession;
        this.A01 = imageUrl;
        this.A00 = i;
        this.A04 = gfo;
        this.A02 = r4;
        this.A03 = jtb;
        this.A07 = z;
        this.A05 = r1;
    }
}
