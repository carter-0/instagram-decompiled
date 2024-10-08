package X;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.5Zg  reason: invalid class name and case insensitive filesystem */
public abstract class C287165Zg {
    public static final void A00(C286575Wy r25, C247453gM r26, C248733iV r27, int i, boolean z) {
        int i2;
        C376459Ib r15;
        0sP r20;
        C61084JwM jwM;
        0sP r10;
        0sP r17;
        0sP r18;
        0sP r19;
        0sP r7;
        0sP r0;
        AnonymousClass5RW r8;
        AnonymousClass5RW r13;
        C286575Wy r5 = r25;
        r5.ExV(1003865434);
        int i3 = i;
        C247453gM r4 = r26;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r5.AGw(r4)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        int i5 = i & 48;
        boolean z2 = z;
        if (i5 == 0) {
            int i6 = 16;
            if (r5.AGv(z2)) {
                i6 = 32;
            }
            i2 |= i6;
        }
        C248733iV r29 = r27;
        if ((i3 & 384) == 0) {
            int i7 = 128;
            if (r5.AGu(r29)) {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i2 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1160823382, "com.instagram.feed.adapter.row.ufi.Ufi (MediaUfiComposeBinder.kt:217)");
            }
            C286565Wx r6 = (C286565Wx) r5;
            Object A01 = C286615Xc.A01(AndroidCompositionLocals_androidKt.A03, C286565Wx.A04(r6));
            Object A012 = C286615Xc.A01(C286955Yl.A00, C286565Wx.A04(r6));
            r5.ExS(-1743565483);
            C247113fn r132 = r4.A05;
            C62320sa r102 = null;
            if (r132.A07) {
                int i8 = r132.A00;
                AnonymousClass3ZG r14 = r4.A07.A00;
                String id = r14.getId();
                r5.ExS(-1743559906);
                boolean AGu = r5.AGu(id);
                Object ECw = r5.ECw();
                if (AGu || ECw == AnonymousClass5XT.A00) {
                    int i9 = r4.A09.A02;
                    int min = Math.min(i8 - 1, 4);
                    C289485df r82 = new C289485df(i9, i8, min, min);
                    C284885Or r1 = C284885Or.A00;
                    0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                    AnonymousClass0eM r02 = C284905Ot.A01;
                    ECw = new ParcelableSnapshotMutableState(r1, r82);
                    r6.A0Q(ECw);
                }
                C284945Oz r9 = (C284945Oz) ECw;
                C286565Wx.A0L(r6, false);
                String id2 = r14.getId();
                r5.ExS(-1743539116);
                boolean AGu2 = r5.AGu(r9) | r5.AGw(r4);
                Object ECw2 = r5.ECw();
                if (AGu2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new AnonymousClass9M5(40, r4, r9);
                    r5.FLL(ECw2);
                }
                C286565Wx.A0L(r6, false);
                C286645Xf.A03(r5, id2, (0sP) ECw2);
                C289485df r92 = (C289485df) r9.getValue();
                Integer num = r132.A02.A00;
                r5.ExS(-1743516343);
                if (num == null) {
                    r8 = null;
                } else {
                    r8 = new AnonymousClass5RW(C289505di.A00(r5, num.intValue()));
                }
                C286565Wx.A0L(r6, false);
                Integer num2 = r132.A03.A00;
                if (num2 == null) {
                    r13 = null;
                } else {
                    r13 = new AnonymousClass5RW(C289505di.A00(r5, num2.intValue()));
                }
                r15 = new C376459Ib(r8, r13, r92);
            } else {
                r15 = null;
            }
            C286565Wx.A0L(r6, false);
            C284945Oz A00 = C287175Zh.A00(r5, r4.A00);
            r5.ExS(-1743502733);
            boolean z3 = r4.A0M;
            if (!z3 || r4.A03 != C247003fc.SHARE_BUTTON) {
                r20 = null;
                jwM = null;
            } else {
                Activity A002 = C61270mF.A00((Context) C286615Xc.A01(AndroidCompositionLocals_androidKt.A01, C286565Wx.A04(r6)));
                Object A013 = C286615Xc.A01(C286935Yj.A00, C286565Wx.A04(r6));
                String id3 = r4.A07.A00.getId();
                r5.ExS(-1743492950);
                if (id3 != null) {
                    r5.ExS(-241962559);
                    boolean AGw = r5.AGw(A012) | r5.AGw(A013) | r5.AGu(id3);
                    Object ECw3 = r5.ECw();
                    if (AGw || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = new C73673Phm(A013, A012, id3, 15);
                        r5.FLL(ECw3);
                    }
                    r102 = (C62320sa) ECw3;
                    C286565Wx.A0L(r6, false);
                }
                C286565Wx.A0L(r6, false);
                r20 = null;
                AnonymousClass2DN A003 = 1zC.A00(r5, r4.A02);
                r5.ExS(-1743482523);
                boolean AGu3 = r5.AGu(A00) | r5.AGw(A002);
                Object ECw4 = r5.ECw();
                if (AGu3 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = new C58187Inr(48, A002, A00);
                    r5.FLL(ECw4);
                }
                C286565Wx.A0L(r6, false);
                jwM = new C61084JwM((AnonymousClass2DO) A003, (C62320sa) ECw4, r102);
            }
            C286565Wx.A0L(r6, false);
            boolean z4 = r4.A0G;
            if (r4.A0R) {
                r10 = r4.A0C;
            } else {
                r10 = r20;
            }
            C62320sa r12 = (C62320sa) ((AnonymousClass9IT) A00.getValue()).A0G;
            r5.ExS(-1743473600);
            boolean AGu4 = r5.AGu(A00) | r5.AGw(A01);
            Object ECw5 = r5.ECw();
            if (AGu4 || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = new AnonymousClass9M5(35, A01, A00);
                r5.FLL(ECw5);
            }
            C286565Wx.A0L(r6, false);
            0sP r22 = r20;
            AnonymousClass9J5 r16 = new AnonymousClass9J5(r10, r12, (0sP) ECw5, r20, r20, r22, 28, z4);
            r5.ExS(-1743460457);
            if (r4.A0F) {
                r5.ExS(-1743458102);
                boolean AGu5 = r5.AGu(A00);
                Object ECw6 = r5.ECw();
                if (AGu5 || ECw6 == AnonymousClass5XT.A00) {
                    ECw6 = new C377259Ld(A00, 6);
                    r5.FLL(ECw6);
                }
                0sP r103 = (0sP) ECw6;
                C286565Wx.A0L(r6, false);
                r5.ExS(-1743455819);
                boolean AGu6 = r5.AGu(A00) | r5.AGw(A01);
                Object ECw7 = r5.ECw();
                if (AGu6 || ECw7 == AnonymousClass5XT.A00) {
                    ECw7 = new AnonymousClass9M5(36, A01, A00);
                    r5.FLL(ECw7);
                }
                0sP r110 = (0sP) ECw7;
                C286565Wx.A0L(r6, false);
                if (r4.A0Q) {
                    r0 = r4.A0B;
                } else {
                    r0 = r20;
                }
                r17 = new AnonymousClass9J5(r0, r20, r103, r22, r20, r110, 78, false);
            } else {
                r17 = r20;
            }
            C286565Wx.A0L(r6, false);
            r5.ExS(-1743441907);
            if (z3) {
                r5.ExS(-1743439856);
                boolean AGw2 = r5.AGw(r4) | r5.AGu(A00);
                Object ECw8 = r5.ECw();
                if (AGw2 || ECw8 == AnonymousClass5XT.A00) {
                    ECw8 = new AnonymousClass9M5(37, r4, A00);
                    r5.FLL(ECw8);
                }
                0sP r104 = (0sP) ECw8;
                C286565Wx.A0L(r6, false);
                r5.ExS(-1743430454);
                boolean AGu7 = r5.AGu(A00);
                Object ECw9 = r5.ECw();
                if (AGu7 || ECw9 == AnonymousClass5XT.A00) {
                    ECw9 = new C377259Ld(A00, 7);
                    r5.FLL(ECw9);
                }
                0sP r93 = (0sP) ECw9;
                C286565Wx.A0L(r6, false);
                r5.ExS(-1743428200);
                boolean AGu8 = r5.AGu(A00) | r5.AGw(A01);
                Object ECw10 = r5.ECw();
                if (AGu8 || ECw10 == AnonymousClass5XT.A00) {
                    ECw10 = new AnonymousClass9M5(38, A01, A00);
                    r5.FLL(ECw10);
                }
                0sP r111 = (0sP) ECw10;
                C286565Wx.A0L(r6, false);
                r5.ExS(-1743423501);
                boolean AGu9 = r5.AGu(A00) | r5.AGw(A01);
                Object ECw11 = r5.ECw();
                if (AGu9 || ECw11 == AnonymousClass5XT.A00) {
                    ECw11 = new AnonymousClass9M5(39, A01, A00);
                    r5.FLL(ECw11);
                }
                0sP r03 = (0sP) ECw11;
                C286565Wx.A0L(r6, false);
                if (r4.A0S) {
                    r7 = r4.A0D;
                } else {
                    r7 = r20;
                }
                r18 = new AnonymousClass9J5(r7, r20, r104, r93, r111, r03, 66, false);
            } else {
                r18 = r20;
            }
            C286565Wx.A0L(r6, false);
            r5.ExS(-1743410506);
            if (r4.A0K) {
                boolean z5 = r4.A0L;
                r5.ExS(-1743406489);
                boolean AGu10 = r5.AGu(A00);
                Object ECw12 = r5.ECw();
                if (AGu10 || ECw12 == AnonymousClass5XT.A00) {
                    ECw12 = new C377259Ld(A00, 8);
                    r5.FLL(ECw12);
                }
                0sP r112 = (0sP) ECw12;
                C286565Wx.A0L(r6, false);
                r5.ExS(-1743404405);
                boolean AGu11 = r5.AGu(A00);
                Object ECw13 = r5.ECw();
                if (AGu11 || ECw13 == AnonymousClass5XT.A00) {
                    ECw13 = new C377259Ld(A00, 9);
                    r5.FLL(ECw13);
                }
                C286565Wx.A0L(r6, false);
                r19 = new AnonymousClass9J5(r20, r20, r112, r20, (0sP) ECw13, r20, 116, z5);
            } else {
                r19 = r20;
            }
            C286565Wx.A0L(r6, false);
            C287185Zi.A02(r5, r15, r16, r17, r18, r19, jwM, r29, (57344 & (i2 << 6)) | ((i2 << 18) & 29360128), 0, z2);
            if (0fL.A02()) {
                0fL.A00(-695014902);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C288365bn(r4, r29, i3, z2);
        }
    }
}
