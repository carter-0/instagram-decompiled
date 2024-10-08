package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

public final class JCM extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ AnonymousClass6HS A05;
    public final /* synthetic */ AnonymousClass6Gj A06;
    public final /* synthetic */ C304836Fk A07;
    public final /* synthetic */ JLC A08;
    public final /* synthetic */ LazyStaggeredGridState A09;
    public final /* synthetic */ Modifier A0A;
    public final /* synthetic */ 0sP A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCM(AnonymousClass6HS r2, AnonymousClass6Gj r3, C304836Fk r4, JLC jlc, LazyStaggeredGridState lazyStaggeredGridState, Modifier modifier, 0sP r8, float f, float f2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A09 = lazyStaggeredGridState;
        this.A06 = r3;
        this.A08 = jlc;
        this.A0A = modifier;
        this.A07 = r4;
        this.A0C = z;
        this.A05 = r2;
        this.A0D = z2;
        this.A01 = f;
        this.A00 = f2;
        this.A0B = r8;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        LazyStaggeredGridState lazyStaggeredGridState = this.A09;
        AnonymousClass6Gj r5 = this.A06;
        JLC jlc = this.A08;
        Modifier modifier = this.A0A;
        C304836Fk r6 = this.A07;
        boolean z = this.A0C;
        AnonymousClass6HS r4 = this.A05;
        boolean z2 = this.A0D;
        float f = this.A01;
        float f2 = this.A00;
        int i = this.A04;
        HR1.A00(r4, r5, r6, jlc, lazyStaggeredGridState, A0R, modifier, this.A0B, f, f2, C51966G9m.A01(this.A02), C301445zH.A00(this.A03), i, z, z2);
        return C60340gF.A00;
    }
}
