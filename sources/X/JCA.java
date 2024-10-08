package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

public final class JCA extends 0Yg implements 0sL {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCA(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A0B = z;
        this.A07 = obj5;
        this.A08 = obj6;
        this.A0A = z2;
        this.A03 = obj7;
        this.A02 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                LazyListState lazyListState = (LazyListState) this.A08;
                C304836Fk r3 = (C304836Fk) this.A04;
                boolean z = this.A0A;
                C287325Zx r2 = (C287325Zx) this.A09;
                C287265Zr r6 = (C287265Zr) this.A06;
                AnonymousClass6HY.A01((AnonymousClass6HS) this.A05, r2, r3, lazyListState, C51966G9m.A0R(obj, obj2), r6, (Modifier) this.A07, (0sP) this.A03, C51966G9m.A01(this.A02), this.A01, z, this.A0B);
                break;
            case 1:
                LazyListState lazyListState2 = (LazyListState) this.A08;
                C304836Fk r32 = (C304836Fk) this.A04;
                boolean z2 = this.A0A;
                C287295Zu r22 = (C287295Zu) this.A06;
                C287245Zp r62 = (C287245Zp) this.A09;
                AnonymousClass6HY.A00((AnonymousClass6HS) this.A05, r22, r32, lazyListState2, C51966G9m.A0R(obj, obj2), r62, (Modifier) this.A07, (0sP) this.A03, C51966G9m.A01(this.A02), this.A01, z2, this.A0B);
                break;
            default:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                boolean z3 = this.A0B;
                C56275Hvj.A00((C289525dk) this.A09, A0R, (Modifier) this.A08, (C3018260f) this.A04, (C3018260f) this.A05, (C55638Hkx) this.A06, (Integer) this.A07, (Integer) this.A03, C51966G9m.A01(this.A02), this.A01, z3, this.A0A);
                break;
        }
        return C60340gF.A00;
    }
}
