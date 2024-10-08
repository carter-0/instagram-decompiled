package X;

import java.util.List;

/* renamed from: X.AyH  reason: case insensitive filesystem */
public final class C41665AyH extends 0Yg implements 0sP {
    public final /* synthetic */ C287685ab A00;
    public final /* synthetic */ C268004cb A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ 0rk A03;
    public final /* synthetic */ 0rk A04;
    public final /* synthetic */ C267974cY[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41665AyH(C287685ab r2, C268004cb r3, List list, 0rk r5, 0rk r6, C267974cY[] r7) {
        super(1);
        this.A05 = r7;
        this.A02 = list;
        this.A01 = r3;
        this.A04 = r5;
        this.A03 = r6;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C268104cl r12 = (C268104cl) obj;
        C267974cY[] r8 = this.A05;
        List list = this.A02;
        C268004cb r6 = this.A01;
        0rk r5 = this.A04;
        0rk r4 = this.A03;
        C287685ab r3 = this.A00;
        int length = r8.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C267974cY r13 = r8[i];
            int i3 = i2 + 1;
            0qQ.A0C(r13, AnonymousClass000.A00(3646));
            AnonymousClass5Q8 layoutDirection = r6.getLayoutDirection();
            int i4 = r5.A00;
            int i5 = r4.A00;
            C287675aa.A03(r3.A00, (C268074ci) list.get(i2), r12, r13, layoutDirection, i4, i5);
            i++;
            i2 = i3;
        }
        return C60340gF.A00;
    }
}
