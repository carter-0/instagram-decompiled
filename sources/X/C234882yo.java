package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yo  reason: invalid class name and case insensitive filesystem */
public final class C234882yo extends C234532y8 {
    public final C250603lj A00;
    public final AnonymousClass4DU A01;
    public final 1Ua A02;
    public final UserSession A03;
    public final C250603lj A04;
    public final C232852uY A05;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.2yt] */
    public C234882yo(UserSession userSession, C232852uY r26, AnonymousClass4DU r27, 1sy r28, C228182kv r29, C249763kK r30, 1Ua r31) {
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        AnonymousClass4DU r5 = r27;
        this.A01 = r5;
        C232852uY r0 = r26;
        this.A05 = r0;
        1Ua r1 = r31;
        this.A02 = r1;
        C234892yp r16 = new C234892yp(userSession2, r0, r5, r28, r29, r30, r1);
        C234912yr r7 = new C234912yr(userSession2, r5);
        C234922ys r02 = new C234922ys(userSession2, r1);
        C229842oQ A002 = AnonymousClass2oO.A00(userSession2);
        0sL r9 = C234942yu.A00;
        this.A00 = new C234962yw(userSession2, r5, A002, r7, new Object(), r9, true, false);
        this.A04 = new C234962yw(userSession2, r5, A002, r16, r02, r9, false, true);
    }

    public final void Csj(C2354830a r3, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        AnonymousClass4DU r1 = this.A01;
        if (!AnonymousClass3WX.A02(r4, r1) && AnonymousClass3WX.A01(r4, r1)) {
            r3.A00(this.A04);
        }
    }
}
