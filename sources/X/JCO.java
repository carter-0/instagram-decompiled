package X;

import java.util.List;
import java.util.Map;

public final class JCO extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C66499MUd A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCO(C66499MUd mUd, Integer num, String str, List list, Map map, C62320sa r7, C62320sa r8, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A08 = map;
        this.A06 = str;
        this.A05 = num;
        this.A02 = i;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A03 = i2;
        this.A07 = list;
        this.A04 = mUd;
        this.A09 = r7;
        this.A0A = r8;
        this.A00 = i3;
        this.A01 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Map map = this.A08;
        String str = this.A06;
        Integer num = this.A05;
        int i = this.A02;
        boolean z = this.A0C;
        boolean z2 = this.A0B;
        boolean z3 = this.A0D;
        int i2 = this.A03;
        boolean z4 = z;
        C56196HuP.A01(A0R, this.A04, num, str, this.A07, map, this.A09, this.A0A, i, i2, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), z4, z2, z3);
        return C60340gF.A00;
    }
}
