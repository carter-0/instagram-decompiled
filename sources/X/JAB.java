package X;

import com.google.common.collect.ImmutableList;

public final class JAB extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAB(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A07;
                String str2 = this.A06;
                0sP r6 = (0sP) this.A03;
                C56256HvQ.A01(A0R, (C337207ft) this.A02, (C337217fu) this.A05, str, str2, r6, (0sI) this.A04, C51966G9m.A01(this.A01));
                break;
            case 1:
                C56289Hw2.A00(A0R, this.A06, this.A07, (C62320sa) this.A02, (C62320sa) this.A03, (C62320sa) this.A04, (C62320sa) this.A05, C51966G9m.A01(this.A01));
                break;
            default:
                C62320sa r5 = (C62320sa) this.A02;
                I3A.A01(A0R, (ImmutableList) this.A05, this.A07, this.A06, r5, (0sP) this.A04, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
