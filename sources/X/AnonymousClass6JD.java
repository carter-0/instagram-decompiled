package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.6JD  reason: invalid class name */
public abstract class AnonymousClass6JD {
    /* JADX INFO: finally extract failed */
    public static final void A00(AnonymousClass6HC r10, C286575Wy r11, Object obj, 0sL r13, int i, int i2) {
        int i3;
        0sP r7;
        C286575Wy r2 = r11;
        r11.ExV(-2079116560);
        if ((i2 & 6) == 0) {
            int i4 = 2;
            if (r11.AGw(obj)) {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = 16;
            if (r11.AGs(i)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        AnonymousClass6HC r112 = r10;
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if (r2.AGw(r10)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            int i7 = 1024;
            if (r2.AGw(r13)) {
                i7 = C249703kE.FLAG_MOVED;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1576709928, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean AGu = r2.AGu(obj) | r2.AGu(r10);
            Object ECw = r2.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = new AnonymousClass6JE(r10, obj);
                ((C286565Wx) r2).A0Q(ECw);
            }
            AnonymousClass6JE r6 = (AnonymousClass6JE) ECw;
            r6.A00.EZz(i);
            C267314bM r4 = AnonymousClass6JI.A00;
            AnonymousClass6JG r102 = (AnonymousClass6JG) C286615Xc.A01(r4, C286565Wx.A04((C286565Wx) r2));
            Snapshot A02 = AnonymousClass5PH.A02();
            AnonymousClass6JE r8 = null;
            if (A02 != null) {
                r7 = A02.A05();
            } else {
                r7 = null;
            }
            Snapshot A03 = AnonymousClass5PH.A03(A02);
            try {
                C284945Oz r1 = r6.A02;
                if (r102 != ((AnonymousClass6JG) r1.getValue())) {
                    r1.Epw(r102);
                    if (r6.A01.BI6() > 0) {
                        C284945Oz r12 = r6.A03;
                        AnonymousClass6JF r0 = (AnonymousClass6JF) r12.getValue();
                        if (r0 != null) {
                            r0.release();
                        }
                        if (r102 != null) {
                            r8 = r102.E2i();
                        }
                        r12.Epw(r8);
                    }
                }
                AnonymousClass5PH.A06(A02, A03, r7);
                boolean AGu2 = r2.AGu(r6);
                Object ECw2 = r2.ECw();
                if (AGu2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new AnonymousClass9L6(r6, 20);
                    r2.FLL(ECw2);
                }
                C286645Xf.A03(r2, r6, (0sP) ECw2);
                C286715Xm.A00(r2, r4.A02(r6), r13, ((i3 >> 6) & 112) | 8);
                if (0fL.A02()) {
                    0fL.A00(-206744414);
                }
            } catch (Throwable th) {
                AnonymousClass5PH.A06(A02, A03, r7);
                throw th;
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7T(r112, obj, r13, i, i2);
        }
    }
}
