package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.HashMap;

/* renamed from: X.5aa  reason: invalid class name and case insensitive filesystem */
public abstract class C287675aa {
    public static final AnonymousClass5RD A00 = new C287685ab(C287215Zl.A0E, false);
    public static final AnonymousClass5RD A01 = C287695ac.A00;
    public static final HashMap A02 = A01(true);
    public static final HashMap A03 = A01(false);

    public static final AnonymousClass5RD A00(Alignment alignment, boolean z) {
        HashMap hashMap;
        if (z) {
            hashMap = A02;
        } else {
            hashMap = A03;
        }
        AnonymousClass5RD r0 = (AnonymousClass5RD) hashMap.get(alignment);
        if (r0 == null) {
            return new C287685ab(alignment, z);
        }
        return r0;
    }

    public static final HashMap A01(boolean z) {
        HashMap hashMap = new HashMap(9);
        Alignment alignment = C287215Zl.A0E;
        hashMap.put(alignment, new C287685ab(alignment, z));
        Alignment alignment2 = C287215Zl.A0C;
        hashMap.put(alignment2, new C287685ab(alignment2, z));
        Alignment alignment3 = C287215Zl.A0D;
        hashMap.put(alignment3, new C287685ab(alignment3, z));
        Alignment alignment4 = C287215Zl.A0B;
        hashMap.put(alignment4, new C287685ab(alignment4, z));
        Alignment alignment5 = C287215Zl.A09;
        hashMap.put(alignment5, new C287685ab(alignment5, z));
        Alignment alignment6 = C287215Zl.A0A;
        hashMap.put(alignment6, new C287685ab(alignment6, z));
        Alignment alignment7 = C287215Zl.A08;
        hashMap.put(alignment7, new C287685ab(alignment7, z));
        Alignment alignment8 = C287215Zl.A06;
        hashMap.put(alignment8, new C287685ab(alignment8, z));
        Alignment alignment9 = C287215Zl.A07;
        hashMap.put(alignment9, new C287685ab(alignment9, z));
        return hashMap;
    }

    public static final void A02(C286575Wy r7, Modifier modifier, int i) {
        int i2;
        r7.ExV(-211209833);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r7.AGu(modifier)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2041674866, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            AnonymousClass5RD r6 = A01;
            int A002 = C287425a7.A00(r7);
            Modifier A012 = C287435a8.A01(r7, modifier);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            C62320sa r1 = C287485aD.A00;
            r7.ExX();
            if (r3.A0K) {
                r7.AMT(r1);
            } else {
                r7.FMk();
            }
            C287595aO.A00(r7, r6, C287485aD.A03);
            C287595aO.A00(r7, A04, C287485aD.A05);
            C287595aO.A00(r7, A012, C287485aD.A04);
            0sL r2 = C287485aD.A02;
            if (r3.A0K || !0qQ.A0K(r7.ECw(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                r7.FLL(valueOf);
                r7.ABr(valueOf, r2);
            }
            C286565Wx.A0L(r3, true);
            if (0fL.A02()) {
                0fL.A00(-1687392504);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGC(modifier, i, 1);
        }
    }

    public static final void A03(Alignment alignment, C268074ci r7, C268104cl r8, C267974cY r9, AnonymousClass5Q8 r10, int i, int i2) {
        Alignment alignment2;
        C289105d1 r1;
        Object BaX = r7.BaX();
        if (!(BaX instanceof C289105d1) || (r1 = (C289105d1) BaX) == null || (alignment2 = r1.A00) == null) {
            alignment2 = alignment;
        }
        r8.A06(r9, 0.0f, alignment2.AB3(r10, C289155d7.A00(r9.A01, r9.A00), C289155d7.A00(i, i2)));
    }
}
