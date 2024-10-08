package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;

public abstract class I63 {
    public static final 0sP A00 = C58916Izf.A00;

    public static final C52849Gdi A00(AnonymousClass5R6 r0) {
        C52849Gdi gdi = r0.A0E;
        if (gdi != null) {
            return gdi;
        }
        I2E.A02("Required value was null.");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C286575Wy r13, Modifier modifier, 0sP r15, 0sP r16, int i, int i2) {
        int i3;
        0sP r10 = r16;
        Modifier modifier2 = modifier;
        C286575Wy r5 = r13;
        r13.ExV(-1783766393);
        int i4 = i2;
        0sP r7 = r15;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r5, r15) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r5, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r5, r10);
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r10 = A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1899856989, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            A03(r5, modifier2, r7, (0sP) null, A00, r10, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (0fL.A02()) {
                0fL.A00(-2003013371);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 4, r7, r10, modifier2);
        }
    }

    public static final void A03(C286575Wy r18, Modifier modifier, 0sP r20, 0sP r21, 0sP r22, 0sP r23, int i, int i2) {
        int i3;
        0sL r0;
        0sP r12 = r23;
        0sP r15 = r22;
        0sP r13 = r21;
        Modifier modifier2 = modifier;
        C286575Wy r14 = r18;
        r14.ExV(-180024211);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r14, r20) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r14, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r14, r13);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r14, r15);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r14, r12);
        }
        if ((i3 & 9363) != 9362 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r13 = null;
            }
            if (i8 != 0) {
                r15 = A00;
            }
            if (i9 != 0) {
                r12 = A00;
            }
            if (0fL.A02()) {
                0fL.A01(326578787, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:211)");
            }
            int A002 = C287425a7.A00(r14);
            Modifier Ezh = modifier2.Ezh(FocusGroupPropertiesElement.A00);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = FocusTargetNode$FocusTargetElement.A00;
            Modifier A01 = C287435a8.A01(r14, Ezh.Ezh(focusTargetNode$FocusTargetElement).Ezh(FocusTargetPropertiesElement.A00).Ezh(focusTargetNode$FocusTargetElement));
            C268024cd A0a = C51970G9q.A0a(r14);
            AnonymousClass5Q8 r7 = (AnonymousClass5Q8) C51966G9m.A15(r14);
            C286565Wx r6 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            AnonymousClass07Z r4 = (AnonymousClass07Z) r14.AJO(AnonymousClass5YV.A00);
            AnonymousClass0g9 r3 = (AnonymousClass0g9) r14.AJO(AndroidCompositionLocals_androidKt.A02);
            if (r13 != null) {
                r14.ExS(607871394);
                C51973G9u.A0z(r14, r6, A01(r14, r20, i3 & 14));
                C287595aO.A00(r14, A04, C287485aD.A05);
                C287595aO.A00(r14, A01, JEL.A00);
                C287595aO.A00(r14, A0a, JEM.A00);
                C287595aO.A00(r14, r4, JEN.A00);
                C287595aO.A00(r14, r3, JEO.A00);
                C287595aO.A00(r14, r7, JEP.A00);
                0sL r1 = C287485aD.A02;
                if (r6.A0K || !C51972G9s.A1Q(r14, A002)) {
                    C51971G9r.A13(r14, r1, A002);
                }
                C287595aO.A00(r14, r13, JEG.A00);
                C287595aO.A00(r14, r12, JEH.A00);
                r0 = JEI.A00;
            } else {
                r14.ExS(608726777);
                C62320sa A012 = A01(r14, r20, i3 & 14);
                C286565Wx.A0K(r6, (Object) null, (Object) null, 125, 1);
                r6.A0M = true;
                if (r6.A0K) {
                    r14.AMT(A012);
                } else {
                    r14.FMk();
                }
                C287595aO.A00(r14, A04, C287485aD.A05);
                C287595aO.A00(r14, A01, JEL.A00);
                C287595aO.A00(r14, A0a, JEM.A00);
                C287595aO.A00(r14, r4, JEN.A00);
                C287595aO.A00(r14, r3, JEO.A00);
                C287595aO.A00(r14, r7, JEP.A00);
                0sL r16 = C287485aD.A02;
                if (r6.A0K || !C51972G9s.A1Q(r14, A002)) {
                    C51971G9r.A13(r14, r16, A002);
                }
                C287595aO.A00(r14, r12, JEJ.A00);
                r0 = JEK.A00;
            }
            C287595aO.A00(r14, r15, r0);
            r14.ASN();
            if (C51967G9n.A1a(r6)) {
                0fL.A00(-386046034);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r12, r13, r20, r15, modifier2, i5, i4, 2);
        }
    }

    public static final C62320sa A01(C286575Wy r10, 0sP r11, int i) {
        if (0fL.A02()) {
            0fL.A01(-313264809, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)");
        }
        boolean z = false;
        int A002 = C287425a7.A00(r10);
        Context A0N = C51970G9q.A0N(r10);
        AnonymousClass5Q1 A01 = C287425a7.A01(r10);
        AnonymousClass5Y2 r7 = (AnonymousClass5Y2) r10.AJO(AnonymousClass5YX.A00);
        View view = (View) r10.AJO(AndroidCompositionLocals_androidKt.A03);
        boolean AGw = r10.AGw(A0N);
        0sP r8 = r11;
        if ((((i & 14) ^ 6) > 4 && r10.AGu(r11)) || (i & 6) == 4) {
            z = true;
        }
        boolean A1T = C51968G9o.A1T(r10, view, C51973G9u.A1T(r10, A01, r7, AGw, z), r10.AGs(A002));
        Object ECw = r10.ECw();
        if (A1T || ECw == AnonymousClass5XT.A00) {
            ECw = new C58211IoF(A0N, view, A01, r7, r8, A002);
            r10.FLL(ECw);
        }
        C62320sa r3 = (C62320sa) ECw;
        if (0fL.A02()) {
            0fL.A00(1975130329);
        }
        return r3;
    }
}
