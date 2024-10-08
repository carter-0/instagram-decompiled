package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.Hxc  reason: case insensitive filesystem */
public abstract class C56383Hxc {
    public static final IGW A00;

    static {
        IGU igu = new IGU(0);
        0sn r5 = 0sn.A00;
        A00 = new IGW(AnonymousClass6Gj.Vertical, (C55990Hqw) null, igu, new AnonymousClass5Q7(1.0f, 1.0f), r5, C58873Iyy.A00, 19E.A02(19B.A00), 0.0f, 0, 0, 0, 0, 0, 0, 0, false, false);
    }

    public static final LazyGridState A00(C286575Wy r8) {
        boolean z = false;
        if (0fL.A02()) {
            0fL.A01(-358002254, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        C286015Tp r4 = LazyGridState.A0L;
        C286575Wy r3 = r8;
        boolean A1U = C51970G9q.A1U(r8.AGs(0) ? 1 : 0);
        if (r8.AGs(0)) {
            z = true;
        }
        boolean z2 = A1U | z;
        Object ECw = r8.ECw();
        if (z2 || ECw == AnonymousClass5XT.A00) {
            ECw = new C58172Inc(0);
            r8.FLL(ECw);
        }
        LazyGridState lazyGridState = (LazyGridState) C305136Gr.A00(r3, r4, (C62320sa) ECw, objArr, 0, 4);
        if (0fL.A02()) {
            0fL.A00(-1183934452);
        }
        return lazyGridState;
    }
}
