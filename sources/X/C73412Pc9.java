package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Pc9  reason: case insensitive filesystem */
public final class C73412Pc9 implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ N89 A02;
    public final /* synthetic */ C69226Nhg A03;
    public final /* synthetic */ AnonymousClass7GR A04;
    public final /* synthetic */ AnonymousClass3WR A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C73412Pc9(AnonymousClass0iw r1, UserSession userSession, N89 n89, C69226Nhg nhg, AnonymousClass7GR r5, AnonymousClass3WR r6, String str, boolean z) {
        this.A03 = nhg;
        this.A01 = userSession;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = str;
        this.A05 = r6;
        this.A02 = n89;
        this.A07 = z;
    }

    public final void run() {
        C69226Nhg nhg = this.A03;
        UserSession userSession = this.A01;
        AnonymousClass0iw r1 = this.A00;
        C14044Tol A002 = C69226Nhg.A00(r1, userSession, nhg, this.A04);
        String str = this.A06;
        AnonymousClass3WR r4 = this.A05;
        C263754Nf r5 = new C263754Nf((Object) this.A02, 0);
        r5.A00 = true;
        A002.A09((C242423Ua) nhg.A0F.getView(), r4, r5, str, r1.getModuleName(), 1.0f, -1, 0, true, this.A07);
    }
}
