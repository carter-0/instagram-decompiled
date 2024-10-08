package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import java.util.List;

public final class JA2 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JA2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A07 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                Modifier modifier = (Modifier) this.A05;
                C56663I6s.A04((C56151Htd) this.A03, (C56152Hte) this.A04, (C56606I4f) this.A06, A0R, modifier, (0sP) this.A07, (0sK) this.A02, C51966G9m.A01(this.A01));
                break;
            case 1:
                ((AnonymousClass5PJ) this.A07).A05(C51966G9m.A0R(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, C301445zH.A00(this.A01) | 1);
                break;
            case 2:
                C286575Wy A0R2 = C51966G9m.A0R(obj, obj2);
                JNR jnr = (JNR) this.A02;
                C287325Zx r2 = (C287325Zx) this.A07;
                I7C.A02((C287295Zu) this.A04, r2, jnr, (LazyGridState) this.A06, A0R2, (Modifier) this.A05, (0sP) this.A03, C51966G9m.A01(this.A01));
                break;
            case 3:
                C54929HYl.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, (C53360Gmk) this.A02, (0sP) this.A05, (0sP) this.A06, (0sP) this.A04, (0sP) this.A07, C51966G9m.A01(this.A01));
                break;
            case 4:
                C62320sa r4 = (C62320sa) this.A03;
                C56580I2k.A02(C51966G9m.A0R(obj, obj2), (C54617HLa) this.A02, (List) this.A07, r4, (0sP) this.A06, (0sP) this.A04, (0sP) this.A05, C51966G9m.A01(this.A01));
                break;
            case 5:
                C56285Hvt.A01(C51966G9m.A0R(obj, obj2), (C53392GnP) this.A07, (C62320sa) this.A04, (0sP) this.A05, (0sP) this.A06, (0sP) this.A02, (0sL) this.A03, C51966G9m.A01(this.A01));
                break;
            case 6:
                C56285Hvt.A00(C51966G9m.A0R(obj, obj2), (Modifier) this.A02, (C53392GnP) this.A07, (0sP) this.A05, (0sP) this.A06, (0sP) this.A03, (0sL) this.A04, C51966G9m.A01(this.A01));
                break;
            default:
                C56621I4x.A00(C51966G9m.A0R(obj, obj2), (C56547I1b) this.A05, (C68175N3q) this.A06, (C62320sa) this.A03, (C62320sa) this.A04, (C62320sa) this.A02, (0sP) this.A07, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
