package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.65R  reason: invalid class name */
public final class AnonymousClass65R {
    public final AnonymousClass67N A00;
    public final UserSession A01;
    public final C3027265a A02;
    public final AnonymousClass65Z A03;
    public final AnonymousClass6EB A04;
    public final C3027365b A05;
    public final C304016Bt A06;
    public final AnonymousClass65S A07;
    public final Executor A08;

    public AnonymousClass65R(AnonymousClass65N r15, AnonymousClass67N r16, UserSession userSession) {
        0nQ r8 = new 0nQ(0nY.A00(), 874464186, 2, false, true);
        UserSession userSession2 = userSession;
        AnonymousClass6EB r6 = new AnonymousClass6EB(userSession2);
        AnonymousClass65S A002 = AnonymousClass6ED.A00(userSession2);
        AnonymousClass65Z r4 = new AnonymousClass65Z(userSession2, new AnonymousClass65X(r15));
        C3027265a r3 = new C3027265a(userSession2, new AnonymousClass65X(r15));
        C304016Bt A003 = C304006Bs.A00(userSession2);
        C3027365b r1 = (C3027365b) userSession2.A01(C3027365b.class, new C73911Plm(userSession2, 33));
        0qQ.A0B(A002, 5);
        0qQ.A0B(r1, 9);
        this.A01 = userSession2;
        this.A00 = r16;
        this.A08 = r8;
        this.A04 = r6;
        this.A07 = A002;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = A003;
        this.A05 = r1;
    }
}
