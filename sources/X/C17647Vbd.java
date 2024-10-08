package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vbd  reason: case insensitive filesystem */
public final class C17647Vbd {
    public final VX7 A00;
    public final VX8 A01;
    public final L5C A02;
    public final L8S A03 = new L8S();
    public final C17970Vj6 A04;
    public final L5D A05;
    public final C17274VPb A06;

    public C17647Vbd(UserSession userSession, C311716d8 r5) {
        VX8 vx8 = new VX8();
        this.A01 = vx8;
        String str = r5.A00.A00;
        this.A00 = new VX7(vx8, str == null ? "" : str);
        this.A04 = new C17970Vj6();
        this.A06 = new C17274VPb(userSession);
        this.A05 = new L5D();
        this.A02 = new L5C();
    }
}
