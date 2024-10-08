package X;

import com.instagram.common.session.UserSession;

public final class J83 extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sL A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J83(UserSession userSession, String str, 0sL r4, int i, int i2, boolean z) {
        super(2);
        this.A03 = str;
        this.A02 = userSession;
        this.A05 = z;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A03;
        GZU.A00(A0R, this.A02, str, this.A04, C51966G9m.A01(this.A00), this.A01, this.A05);
        return C60340gF.A00;
    }
}
