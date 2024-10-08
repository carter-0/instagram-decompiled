package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JBo  reason: case insensitive filesystem */
public final class C59236JBo extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59236JBo(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A09 = z;
        this.A05 = obj2;
        this.A08 = z2;
        this.A07 = str;
        this.A0A = z3;
        this.A04 = obj3;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            Modifier modifier = (Modifier) this.A06;
            boolean z = this.A0A;
            I3E.A00(A0R, (C284945Oz) this.A04, modifier, (1Xj) this.A05, this.A07, this.A03, C51966G9m.A01(this.A01), this.A02, z, this.A08, this.A09);
        } else {
            boolean z2 = this.A09;
            boolean z3 = this.A08;
            C54783HSq.A00(A0R, (C66378MPk) this.A06, this.A07, (C62320sa) this.A05, (C62320sa) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02, z2, z3, this.A0A);
        }
        return C60340gF.A00;
    }
}
