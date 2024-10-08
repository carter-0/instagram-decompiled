package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4bG  reason: invalid class name and case insensitive filesystem */
public final class C267254bG extends 0Yg implements 0sP {
    public final /* synthetic */ C244463bE A00;
    public final /* synthetic */ C246953fX A01;
    public final /* synthetic */ C267214b9 A02;
    public final /* synthetic */ C246993fb A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C267254bG(C244463bE r2, C246953fX r3, C267214b9 r4, C246993fb r5, C62320sa r6, boolean z, boolean z2) {
        super(1);
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = z;
        this.A01 = r3;
        this.A06 = z2;
        this.A04 = r6;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        2WE r12 = (2WE) obj;
        0qQ.A0B(r12, 0);
        C267214b9 r9 = this.A02;
        C246953fX r7 = this.A01;
        boolean z = this.A06;
        C62320sa r8 = this.A04;
        try {
            r12.A00 = 00R.A03("image", 127);
            UserSession userSession = r9.A01;
            AnonymousClass4DU r1 = r9.A02;
            C246613et r3 = r9.A03;
            r12.A02(new AnonymousClass9MO(2, r7, r8, r9, z), new Object[]{userSession, r1, r7, Float.valueOf(r3.A00)});
            r12.A00 = null;
            C247013fd.A07(r12, this.A03, C267214b9.A08, r3.A0E, new XD4(r9));
            C247013fd.A00(C243803a8.A00(this.A00), r12, r3, new XD2(r9), this.A05);
            C247013fd.A08(r12, r9.A06, new XD3(r9));
            return C60340gF.A00;
        } catch (Throwable th) {
            r12.A00 = null;
            throw th;
        }
    }
}
