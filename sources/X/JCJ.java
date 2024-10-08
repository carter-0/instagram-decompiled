package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

public final class JCJ extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A01 = i3;
        this.A04 = obj;
        this.A09 = obj2;
        this.A0A = obj3;
        this.A06 = obj4;
        this.A0B = z;
        this.A00 = f;
        this.A08 = obj5;
        this.A07 = obj6;
        this.A0C = z2;
        this.A05 = obj7;
        this.A03 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.A0A;
            C304836Fk r3 = (C304836Fk) this.A06;
            boolean z = this.A0B;
            float f = this.A00;
            C287295Zu r2 = (C287295Zu) this.A08;
            C56165Htu.A00((AnonymousClass6HS) this.A07, r2, r3, lazyStaggeredGridState, (JLF) this.A04, A0R, (Modifier) this.A09, (0sP) this.A05, f, C51966G9m.A01(this.A03), this.A02, z, this.A0C);
        } else {
            LazyStaggeredGridState lazyStaggeredGridState2 = (LazyStaggeredGridState) this.A09;
            C304836Fk r32 = (C304836Fk) this.A05;
            boolean z2 = this.A0B;
            C287325Zx r22 = (C287325Zx) this.A0A;
            float f2 = this.A00;
            C56165Htu.A01((AnonymousClass6HS) this.A06, r22, r32, lazyStaggeredGridState2, (JLF) this.A08, A0R, (Modifier) this.A07, (0sP) this.A04, f2, C51966G9m.A01(this.A03), this.A02, z2, this.A0C);
        }
        return C60340gF.A00;
    }
}
