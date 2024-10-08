package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

public abstract class HZ3 {
    public static final void A00(C286575Wy r21, Modifier modifier, 0sP r23, AnonymousClass62P r24, int i, int i2, int i3) {
        Modifier modifier2 = modifier;
        0sP r14 = r23;
        0qQ.A0B(r14, 2);
        C286575Wy r6 = r21;
        r6.ExV(-1562950837);
        int i4 = i3;
        if ((i3 & 8) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(-1860223639, "com.instagram.creator.achievements.modules.views.ProgressMediaListV2 (ProgressMediaListV2.kt:43)");
        }
        AnonymousClass62P r16 = r24;
        int i5 = i;
        if (r24 != null && !r16.isEmpty()) {
            AnonymousClass6HY.A01((AnonymousClass6HS) null, C287275Zs.A01(16.0f), (C304836Fk) null, (LazyListState) null, r6, (C287265Zr) null, C51967G9n.A0C(C287205Zk.A00(C287215Zl.A02, C51966G9m.A0V(modifier2)), 16.0f), new C59093J6a(i5, 6, (Object) modifier2, (Object) r14, (Object) r16), 12607488, 110, false, true);
        }
        if (0fL.A02()) {
            0fL.A00(830862173);
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9D(r14, modifier2, r16, i5, i2, i4, 1);
        }
    }
}
