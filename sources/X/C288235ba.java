package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5ba  reason: invalid class name and case insensitive filesystem */
public abstract class C288235ba {
    public static final Modifier A00(C287605aT r8, Modifier modifier, C287625aV r10, C62320sa r11, C62320sa r12, boolean z) {
        0qQ.A0B(modifier, 0);
        C287605aT r1 = r8;
        0qQ.A0B(r8, 1);
        0qQ.A0B(r12, 8);
        return C288255bc.A00(r1, C288245bb.A00(r1, modifier, 0.3f, z), r10, (String) null, r11, (C62320sa) null, r12, z);
    }

    public static final Modifier A01(C286575Wy r11, Modifier modifier, C287625aV r13, String str, C62320sa r15, int i, boolean z) {
        C287625aV r5 = r13;
        String str2 = str;
        boolean z2 = z;
        0qQ.A0B(modifier, 0);
        C62320sa r9 = r15;
        0qQ.A0B(r15, 4);
        r11.ExS(-1688117308);
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            r5 = null;
        }
        if (0fL.A02()) {
            0fL.A01(2034249971, "com.instagram.compose.igds.core.igdsAlphaClickable (IgdsAlphaClickable.kt:39)");
        }
        r11.ExS(-1572225781);
        Object ECw = r11.ECw();
        if (ECw == AnonymousClass5XT.A00) {
            ECw = new AnonymousClass5aS();
            ((C286565Wx) r11).A0Q(ECw);
        }
        C287605aT r3 = (C287605aT) ECw;
        C286565Wx r112 = (C286565Wx) r11;
        C286565Wx.A0L(r112, false);
        0qQ.A0B(r3, 1);
        Modifier A00 = C288255bc.A00(r3, C288245bb.A00(r3, modifier, 0.3f, z2), r5, str2, (C62320sa) null, (C62320sa) null, r9, z2);
        if (0fL.A02()) {
            0fL.A00(933887876);
        }
        C286565Wx.A0L(r112, false);
        return A00;
    }

    public static final Modifier A02(C286575Wy r7, Modifier modifier, C287625aV r9, C62320sa r10) {
        return A01(r7, modifier, r9, (String) null, r10, 3, false);
    }

    public static final Modifier A03(C286575Wy r7, Modifier modifier, String str, C62320sa r10) {
        return A01(r7, modifier, (C287625aV) null, str, r10, 5, false);
    }

    public static final Modifier A04(C286575Wy r7, Modifier modifier, C62320sa r9) {
        return A01(r7, modifier, (C287625aV) null, (String) null, r9, 7, false);
    }
}
