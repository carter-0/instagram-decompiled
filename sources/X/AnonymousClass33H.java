package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.33H  reason: invalid class name */
public final class AnonymousClass33H extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass310 A02;
    public final /* synthetic */ AnonymousClass334 A03;
    public final /* synthetic */ 0Pl A04;
    public final /* synthetic */ AnonymousClass2xS A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33H(Context context, UserSession userSession, AnonymousClass310 r4, AnonymousClass334 r5, 0Pl r6, AnonymousClass2xS r7, boolean z) {
        super(0);
        this.A03 = r5;
        this.A05 = r7;
        this.A02 = r4;
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = z;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass334 r2 = this.A03;
        AnonymousClass4DU r8 = r2.A04;
        AnonymousClass2xS r13 = this.A05;
        C232722uK r15 = r13.A0G;
        AnonymousClass335 r10 = r2.A05;
        AnonymousClass310 r0 = this.A02;
        C243033Xd BRM = r0.BRM();
        AnonymousClass339 r11 = r2.A06;
        C229382nI r4 = r2.A01;
        AnonymousClass3TA Aly = r0.Aly();
        AnonymousClass3WV BRO = r0.BRO();
        AnonymousClass07Z r3 = r2.A00;
        AnonymousClass4DV BqC = r0.BqC();
        return new C54481HFj(this.A00, r3, r4, this.A01, Aly, BRO, r8, BRM, r10, r11, this.A04, r13, r13, r15, BqC, this.A06);
    }
}
