package X;

import com.google.common.collect.ImmutableList;

public final class JAX extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAX(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, C62320sa r6, C62320sa r7, 0sP r8, 0sP r9, int i) {
        super(2);
        this.A05 = r6;
        this.A08 = r8;
        this.A06 = r7;
        this.A07 = r9;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        C62320sa r6 = this.A05;
        0sP r8 = this.A08;
        I3A.A00(A0R, this.A01, this.A02, this.A04, this.A03, r6, this.A06, r8, this.A07, C51966G9m.A01(this.A00));
        return C60340gF.A00;
    }
}
