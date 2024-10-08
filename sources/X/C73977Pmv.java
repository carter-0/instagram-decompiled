package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Pmv  reason: case insensitive filesystem */
public final class C73977Pmv extends 0Yg implements 0sP {
    public final /* synthetic */ C317966o8 A00;
    public final /* synthetic */ C254933tI A01;
    public final /* synthetic */ C66665MaY A02;
    public final /* synthetic */ C333557Zk A03;
    public final /* synthetic */ C70722OHr A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73977Pmv(C317966o8 r2, C254933tI r3, C66665MaY maY, C333557Zk r5, C70722OHr oHr, DirectThreadKey directThreadKey, boolean z, boolean z2) {
        super(1);
        this.A02 = maY;
        this.A05 = directThreadKey;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = r3;
        this.A04 = oHr;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        C293135kC r2;
        C300925yB r7 = (C300925yB) obj;
        C66665MaY maY = this.A02;
        DirectThreadKey directThreadKey = this.A05;
        C317966o8 r4 = this.A00;
        C333557Zk r0 = this.A03;
        UserSession userSession = r0.A01;
        Long A012 = OQO.A01(userSession, directThreadKey);
        long A0H = AnonymousClass7TG.A0H();
        boolean z = this.A07;
        C254933tI r5 = this.A01;
        AnonymousClass27E r22 = r0.A00.A01;
        Integer num2 = null;
        if ((r22 instanceof C293135kC) && (r2 = (C293135kC) r22) != null) {
            num2 = r2.A00.A00;
        }
        if (num2 == AnonymousClass05K.A0C) {
            num = C66580MXl.A0q();
        } else {
            num = null;
        }
        1jN r23 = new 1jN(userSession, r4, r5, maY, r7, directThreadKey, num, A012, A0H, z);
        C70722OHr oHr = this.A04;
        UserSession userSession2 = oHr.A00;
        C66580MXl.A1P(userSession2, r23);
        C333537Zi r6 = oHr.A02;
        String str = oHr.A05;
        String A062 = r23.A06();
        DirectThreadKey directThreadKey2 = oHr.A03;
        C333537Zi.A0B(r6, str, A062, directThreadKey2.A00, 14, oHr.A07, oHr.A06);
        C313756gx A002 = C313746gw.A00(userSession2);
        String str2 = directThreadKey2.A00;
        A002.A0H(2FW.A0O, oHr.A04, str2, AnonymousClass7TF.A1V(oHr.A01));
        return C60340gF.A00;
    }
}
