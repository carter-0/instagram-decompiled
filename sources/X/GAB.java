package X;

import java.util.Timer;

public final class GAB extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C243673Zt A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ AnonymousClass56Q A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GAB(C243673Zt r2, 2Wa r3, AnonymousClass56Q r4, long j) {
        super(1);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = j;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C243673Zt r3 = this.A01;
        AnonymousClass56Q r2 = this.A03;
        AnonymousClass4Ew r0 = AnonymousClass56Q.A04;
        String A0R = 002.A0R("CyclicSubtitleComponent_", r2.A03.A09.A00.getId());
        long j = this.A00;
        2Wa r02 = this.A02;
        Timer A0c = C51974G9v.A0c(A0R);
        A0c.scheduleAtFixedRate(new C2813256v(r02, r2), j, j);
        r3.A00(A0c);
        return C60340gF.A00;
    }
}
