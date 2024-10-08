package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HrQ  reason: case insensitive filesystem */
public final class C56018HrQ {
    public final AnonymousClass6HD A00 = new AnonymousClass6HD();

    public final void A01(Modifier modifier, C62320sa r11, 0sL r12, boolean z) {
        this.A00.add(AnonymousClass5PI.A03(new JH6(0, (Object) null, r11, modifier, r12, z), 262103052));
    }

    public final void A00(C56127HtF htF, C286575Wy r8, int i) {
        int i2;
        r8.ExV(1320309496);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, htF) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r8, this);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2081936689, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            AnonymousClass6HD r4 = this.A00;
            int size = r4.size();
            for (int i3 = 0; i3 < size; i3++) {
                C51967G9n.A1M(htF, r8, (0sK) r4.get(i3), i2 & 14);
            }
            if (0fL.A02()) {
                0fL.A00(-2040328977);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, this, htF, i, 2);
        }
    }
}
