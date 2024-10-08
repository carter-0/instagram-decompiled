package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.Map;

/* renamed from: X.JCu  reason: case insensitive filesystem */
public final class C59268JCu extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59268JCu(Alignment alignment, Modifier modifier, C288095bM r4, S7N s7n, C8874RDq rDq, Map map, C62320sa r8, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A04 = s7n;
        this.A08 = r8;
        this.A07 = modifier;
        this.A0C = z;
        this.A0D = z2;
        this.A0A = z3;
        this.A09 = rDq;
        this.A0B = z4;
        this.A03 = alignment;
        this.A05 = r4;
        this.A0E = z5;
        this.A06 = map;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Modifier modifier = (Modifier) this.A07;
        boolean z = this.A0C;
        boolean z2 = this.A0D;
        boolean z3 = this.A0A;
        C8874RDq rDq = (C8874RDq) this.A09;
        boolean z4 = this.A0B;
        Alignment alignment = (Alignment) this.A03;
        C288095bM r10 = (C288095bM) this.A05;
        boolean z5 = this.A0E;
        Map map = (Map) this.A06;
        int i = this.A00 | 1;
        boolean z6 = z;
        boolean z7 = z2;
        int i2 = this.A01;
        int i3 = this.A02;
        C56175Hu4.A01(A0R, alignment, modifier, r10, (S7N) this.A04, rDq, map, (C62320sa) this.A08, i, i2, i3, z6, z7, z3, z4, z5);
        return C60340gF.A00;
    }
}
