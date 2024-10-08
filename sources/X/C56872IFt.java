package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

/* renamed from: X.IFt  reason: case insensitive filesystem */
public final class C56872IFt implements AnonymousClass5QQ, Modifier, C288895cf {
    public final int A00;
    public final Object A01;

    public C56872IFt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dd9(AnonymousClass5R7 r3) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C286015Tp r0 = LazyGridState.A0L;
                ((LazyGridState) obj).A01 = r3;
                return;
            case 1:
                C286015Tp r02 = LazyStaggeredGridState.A0M;
                ((LazyStaggeredGridState) obj).A02 = r3;
                return;
            default:
                C286015Tp r03 = GZF.A0b;
                ((GZF) obj).A0W.Epw(r3);
                return;
        }
    }

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }
}
