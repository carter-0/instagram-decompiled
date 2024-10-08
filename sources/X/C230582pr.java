package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pr  reason: invalid class name and case insensitive filesystem */
public final class C230582pr {
    public final 2el A00;
    public final C230602pt A01;
    public final C230602pt A02;
    public final C230642px A03;
    public final C230652py A04;
    public final C230612pu A05;
    public final C230612pu A06 = new C230622pv(0, 0.5f);

    public static final String A00(JSs jSs) {
        StringBuilder sb = new StringBuilder();
        sb.append("afi_");
        sb.append(jSs.B5J());
        sb.append('_');
        sb.append(jSs.getId());
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.2n2] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2pt, X.2pW] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.2pu, X.2pv] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.2n2] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2px, X.2pW] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.2py, X.2pv] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.2n2] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.2pt, X.2pW] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.2pu, X.2pv] */
    public C230582pr(UserSession userSession, 2el r8) {
        this.A00 = r8;
        1Bk r2 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r2);
        this.A01 = new C230372pW(r2, new Object());
        1Bk r4 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r4);
        this.A03 = new C230372pW(r4, new Object());
        this.A04 = new C230622pv(0, 0.5f);
        1Bk r42 = C229232n3.A00(userSession).A00.A00;
        0qQ.A07(r42);
        this.A02 = new C230372pW(r42, new Object());
        this.A05 = new C230622pv(0, 0.5f);
    }
}
