package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IyH  reason: case insensitive filesystem */
public final class C58832IyH extends 0Yg implements 0sP {
    public final /* synthetic */ AnonymousClass9IB A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C246953fX A02;
    public final /* synthetic */ C53992Gxa A03;
    public final /* synthetic */ C246993fb A04;
    public final /* synthetic */ C231502rm A05;
    public final /* synthetic */ AnonymousClass9NR A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58832IyH(AnonymousClass9IB r2, 1Xj r3, C246953fX r4, C53992Gxa gxa, C246993fb r6, C231502rm r7, AnonymousClass9NR r8, C62320sa r9, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A03 = gxa;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = r6;
        this.A06 = r8;
        this.A0A = z3;
        this.A02 = r4;
        this.A00 = r2;
        this.A0B = z4;
        this.A07 = r9;
        this.A05 = r7;
        this.A01 = r3;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        2WE r13 = (2WE) obj;
        0qQ.A0B(r13, 0);
        C53992Gxa gxa = this.A03;
        C246953fX r8 = this.A02;
        AnonymousClass9IB r6 = this.A00;
        boolean z = this.A0B;
        C62320sa r11 = this.A07;
        C231502rm r10 = this.A05;
        1Xj r7 = this.A01;
        try {
            r13.A00 = 00R.A03("image_and_video", 127);
            UserSession userSession = gxa.A00;
            AnonymousClass4DU r1 = gxa.A02;
            if (gxa.A08) {
                i = Float.valueOf(gxa.A03.A00);
            } else {
                i = 0;
            }
            r13.A02(new C59190J9u(1, r6, r7, r8, gxa, r10, r11, z), new Object[]{userSession, r1, r8, r6, i});
            r13.A00 = null;
            C246613et r72 = gxa.A03;
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            C247013fd.A05(r13, gxa.A01, r72, new C58142In8(gxa, 66), z2, z3);
            C247013fd.A06(r13, r72, gxa.A05, new C58142In8(gxa, 67));
            C246773fD r5 = C53992Gxa.A0C;
            C246993fb r4 = this.A04;
            AnonymousClass3W1 r15 = r72.A0E;
            C247013fd.A07(r13, r4, r5, r15, new C58142In8(gxa, 68));
            C247013fd.A08(r13, gxa.A07, new C58142In8(gxa, 69));
            AnonymousClass9NR r42 = this.A06;
            boolean z4 = this.A0A;
            String moduleName = r1.getModuleName();
            C247013fd.A04(r13, userSession, r15, gxa.A06, r42, moduleName, new C58142In8(gxa, 70), z4);
            return C60340gF.A00;
        } catch (Throwable th) {
            r13.A00 = null;
            throw th;
        }
    }
}
