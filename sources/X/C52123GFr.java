package X;

import java.util.List;

/* renamed from: X.GFr  reason: case insensitive filesystem */
public final class C52123GFr implements AnonymousClass2xU {
    public final /* synthetic */ 2V5 A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ 2Wa A03;
    public final /* synthetic */ 2Wa A04;
    public final /* synthetic */ GFJ A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ boolean A07;

    public C52123GFr(2V5 r1, 2Wa r2, 2Wa r3, 2Wa r4, 2Wa r5, GFJ gfj, C62320sa r7, boolean z) {
        this.A00 = r1;
        this.A03 = r2;
        this.A05 = gfj;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A07 = z;
        this.A06 = r7;
    }

    public final void DQp(AnonymousClass3W1 r7, int i) {
        Long l;
        1Xj r0;
        0qQ.A0B(r7, 0);
        if (i == 7) {
            this.A00.A00(Integer.valueOf(r7.A03));
            2Wa r2 = this.A03;
            GFJ gfj = this.A05;
            List list = gfj.A06.A0R;
            if (list == null || (r0 = (1Xj) 00k.A0O(list, r7.A03)) == null) {
                l = null;
            } else {
                l = Long.valueOf(r0.A1B());
            }
            r2.A01(l);
            2Wa r4 = this.A02;
            r4.A03(new J6Q(22, r7, gfj));
            this.A04.A03(new GN2(33, gfj, r4, this.A07));
            this.A01.A03(new J6P(this.A06, 39));
        }
    }
}
