package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HVi  reason: case insensitive filesystem */
public abstract class C54851HVi {
    public static final void A00(C286575Wy r14, C62320sa r15, C62320sa r16, int i) {
        int i2;
        C62320sa r9 = r15;
        C62320sa r4 = r16;
        AnonymousClass7TF.A1H(r15, r4);
        C286575Wy r6 = r14;
        r14.ExV(-373350513);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r4);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2098835991, "com.instagram.barcelonaig.permalink.ui.BarcelonaIgPermalinkNavigationBar (BarcelonaIgPermalinkNavigationBar.kt:22)");
            }
            AnonymousClass6C6.A00(r6, C51966G9m.A0T(Modifier.A00), AnonymousClass6C4.Up, r9, AnonymousClass5PI.A01(r14, new C59111J6t(r4, 32), 2059953229), (0sL) null, AnonymousClass5PI.A01(r14, new C59111J6t(r4, 33), -1586421297), 0, ((i2 << 3) & 112) | 200070, 464, false, false);
            if (0fL.A02()) {
                0fL.A00(-807447029);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r9, r4, i3, 25);
        }
    }
}
