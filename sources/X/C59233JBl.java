package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.JBl  reason: case insensitive filesystem */
public final class C59233JBl extends 0Yg implements 0sL {
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
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59233JBl(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A0A = obj2;
        this.A06 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A08 = obj6;
        this.A07 = obj7;
        this.A03 = obj8;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                Modifier modifier = (Modifier) this.A06;
                C56663I6s.A03((C56151Htd) this.A04, (C56152Hte) this.A05, (C56606I4f) this.A09, A0R, modifier, (0sP) this.A0A, (0sL) this.A08, (0sK) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                Modifier modifier2 = (Modifier) this.A05;
                C54630HLn hLn = (C54630HLn) this.A0A;
                0sP r5 = (0sP) this.A06;
                0sP r6 = (0sP) this.A07;
                C56633I5n.A02((LazyListState) this.A04, C51966G9m.A0R(obj, obj2), modifier2, hLn, r5, r6, (AnonymousClass62P) this.A08, (YCQ) this.A09, (C262224Cq) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                C56651I6g.A06(C51966G9m.A0R(obj, obj2), (C53386GnI) this.A0A, (C62320sa) this.A08, (C62320sa) this.A04, (C62320sa) this.A05, (0sP) this.A09, (0sP) this.A06, (0sP) this.A03, (0sP) this.A07, C51966G9m.A01(this.A01), this.A02);
                break;
        }
        return C60340gF.A00;
    }
}
