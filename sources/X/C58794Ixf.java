package X;

import java.util.List;

/* renamed from: X.Ixf  reason: case insensitive filesystem */
public final class C58794Ixf extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass6IL A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ 0sP A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58794Ixf(AnonymousClass6IL r2, List list, List list2, 0sP r5, int i, int i2, int i3) {
        super(1);
        this.A04 = list;
        this.A03 = r2;
        this.A02 = i;
        this.A06 = r5;
        this.A05 = list2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C268104cl r9 = (C268104cl) obj;
        0qQ.A0B(r9, 0);
        List list = this.A04;
        int i = this.A02;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            r9.A07((C267974cY) next, i2 * i, 0);
            i2 = i3;
        }
        List<C268074ci> Eyi = this.A03.Eyi(HL8.INDICATOR, AnonymousClass5PI.A03(new JG1(25, this.A06, this.A05), -1188583079));
        int i4 = this.A01;
        int i5 = this.A00;
        for (C268074ci Cnz : Eyi) {
            r9.A07(Cnz.Cnz(C288985co.A02(i4, i5)), 0, 0);
        }
        return C60340gF.A00;
    }
}
