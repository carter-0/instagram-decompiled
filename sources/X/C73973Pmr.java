package X;

import android.content.Context;

/* renamed from: X.Pmr  reason: case insensitive filesystem */
public final class C73973Pmr extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ OT8 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73973Pmr(Context context, 1a8 r3, OT8 ot8, Integer num, Integer num2, 0sP r7, int i, boolean z) {
        super(1);
        this.A03 = ot8;
        this.A00 = i;
        this.A05 = num;
        this.A04 = num2;
        this.A01 = context;
        this.A02 = r3;
        this.A07 = z;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        OT8 ot8 = this.A03;
        ot8.A00.add(obj);
        int i = this.A00 + 1;
        Integer num = this.A05;
        Integer num2 = this.A04;
        OT8.A00(this.A01, this.A02, ot8, num, num2, this.A06, i, this.A07);
        return C60340gF.A00;
    }
}
