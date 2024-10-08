package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

public abstract class HR2 {
    public static final LazyStaggeredGridState A00(C286575Wy r8) {
        boolean z = false;
        if (0fL.A02()) {
            0fL.A01(199409511, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:73)");
        }
        Object[] objArr = new Object[0];
        C286015Tp r4 = LazyStaggeredGridState.A0M;
        C286575Wy r3 = r8;
        boolean A1U = C51970G9q.A1U(r8.AGs(0) ? 1 : 0);
        if (r8.AGs(0)) {
            z = true;
        }
        boolean z2 = A1U | z;
        Object ECw = r8.ECw();
        if (z2 || ECw == AnonymousClass5XT.A00) {
            ECw = new C58172Inc(1);
            r8.FLL(ECw);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) C305136Gr.A00(r3, r4, (C62320sa) ECw, objArr, 0, 4);
        if (0fL.A02()) {
            0fL.A00(1974391397);
        }
        return lazyStaggeredGridState;
    }
}
