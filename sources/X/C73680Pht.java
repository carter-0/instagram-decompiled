package X;

import android.content.Context;

/* renamed from: X.Pht  reason: case insensitive filesystem */
public final class C73680Pht extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C328497Fa A03;
    public final /* synthetic */ C272074k3 A04;
    public final /* synthetic */ 2FW A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73680Pht(Context context, C328497Fa r3, C272074k3 r4, 2FW r5, Integer num, Long l, int i, long j, boolean z, boolean z2) {
        super(0);
        this.A02 = context;
        this.A01 = j;
        this.A07 = l;
        this.A03 = r3;
        this.A09 = z;
        this.A08 = z2;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = num;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A02;
        long j = this.A01;
        Long l = this.A07;
        C328497Fa r2 = this.A03;
        boolean z = this.A09;
        boolean z2 = this.A08;
        return C70027Nw5.A00(context, r2, this.A04, this.A05, this.A06, l, (Long) null, (Long) null, j, z, z2, AnonymousClass7TF.A1R(this.A00));
    }
}
