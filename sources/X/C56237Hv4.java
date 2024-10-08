package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.barcelona.permalink.ui.component.PermalinkContentKt$PermalinkContent$6;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.Hv4  reason: case insensitive filesystem */
public abstract class C56237Hv4 {
    public static final void A01(C286575Wy r16, Modifier modifier, C62320sa r18, AnonymousClass62P r19, int i, int i2, boolean z) {
        int i3;
        C62320sa r4 = r18;
        AnonymousClass62P r3 = r19;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1O(r3, r4);
        C286575Wy r12 = r16;
        r12.ExV(-1556800617);
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0Y(r12, z2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r12, r3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0G(r12, r4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0R(r12, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r12.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1405587187, "com.instagram.barcelona.permalink.ui.component.TopThreadContinuation (PermalinkContent.kt:444)");
            }
            GQC A00 = GQC.A00(CameraCapturer.OPEN_CAMERA_DELAY_MS, 0);
            long j = C285605Ry.A01;
            C56663I6s.A07(I74.A01(A00, 0.0f, j), I74.A05(C51972G9s.A0K((Object) null), 0.0f, j), r12, modifier2, (String) null, JJU.A00(r12, r4, r3, 23, -1477199249), 200064 | (i3 & 14) | ((i3 >> 6) & 112), 16, z2);
            if (0fL.A02()) {
                0fL.A00(199953609);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9E(r3, r4, modifier2, i5, i4, 4, z2);
        }
    }

    public static final void A00(C286575Wy r72, Modifier modifier, C55932Hpu hpu, C299635va r75, C53334GmK gmK, C53008Ggz ggz, String str, String str2, String str3, String str4, C62320sa r82, C62320sa r83, C62320sa r84, C62320sa r85, C62320sa r86, C62320sa r87, C62320sa r88, 0sP r89, 0sP r90, 0sP r91, AnonymousClass62P r92, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        C60340gF r9;
        0sL A10;
        String str5 = str4;
        Modifier modifier2 = modifier;
        String str6 = str3;
        C55932Hpu hpu2 = hpu;
        C53334GmK gmK2 = gmK;
        boolean A1U = AnonymousClass7TF.A1U(0, gmK2, hpu2);
        C53008Ggz ggz2 = ggz;
        C299635va r70 = r75;
        AnonymousClass7TF.A1C(ggz2, 2, r70);
        C62320sa r23 = r83;
        0sP r27 = r89;
        AnonymousClass62P r30 = r92;
        C51973G9u.A0t(5, r30, r27, r23);
        C286575Wy r5 = r72;
        r5.ExV(597581875);
        int i5 = i4;
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            modifier2 = Modifier.A00;
        }
        if ((i4 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            str6 = null;
        }
        if ((i4 & 2097152) != 0) {
            str5 = null;
        }
        boolean A1Q = C51966G9m.A1Q(i4 & 4194304, z2);
        boolean A1Q2 = C51966G9m.A1Q(i4 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, z3);
        boolean A1Q3 = C51966G9m.A1Q(i4 & 16777216, z4);
        if (0fL.A02()) {
            0fL.A01(1672304267, "com.instagram.barcelona.permalink.ui.component.PermalinkContent (PermalinkContent.kt:104)");
        }
        Object ECw = r5.ECw();
        Object obj = AnonymousClass5XT.A00;
        C262224Cq r13 = ((AnonymousClass6FV) C51974G9v.A0Y(r5, ECw, obj)).A00;
        Object A0m = C51967G9n.A0m(r5, 896007460);
        if (A0m == obj) {
            A0m = new C55600HkK(hpu2, r13);
            r5.FLL(A0m);
        }
        C55600HkK hkK = (C55600HkK) A0m;
        C286565Wx A0H = C51965G9l.A0H(r5, false);
        C55798Hne A00 = C54828HUk.A00(r5, hpu2);
        Context A0N = C51970G9q.A0N(r5);
        0rm A11 = C51965G9l.A11();
        A11.A00 = gmK2.A0K;
        List list = gmK2.A0H;
        UserSession A0h = C51968G9o.A0h(r5);
        if (gmK2.A0f && AnonymousClass7TE.A1b(list) && gmK2.A0Q) {
            Collection collection = (Collection) A11.A00;
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                C51971G9r.A1O(((C299575vQ) next).BK1(), next, A1F, A1C);
            }
            A11.A00 = AnonymousClass62Q.A00(00k.A0S(A1C, collection));
        }
        String str7 = str;
        String str8 = str2;
        C62320sa r20 = r82;
        C62320sa r22 = r84;
        C62320sa r12 = r85;
        C62320sa r11 = r86;
        C62320sa r25 = r87;
        C62320sa r26 = r88;
        0sP r28 = r90;
        0sP r29 = r91;
        float f2 = f;
        int i6 = i2;
        boolean z5 = z;
        if (!((Collection) A11.A00).isEmpty()) {
            r5.ExS(2007340033);
            C56599I3p.A01(r5, (C61068Jw6) null, AnonymousClass5PI.A01(r5, new C59290JDq(A0N, modifier2, r70, A00, hkK, gmK2, ggz2, A0h, str7, str6, str5, str8, list, r20, r23, r25, r26, r29, r27, r28, A11, r30, r13, f2, z5, A1Q, A1Q2, A1Q3), -1700674346), 48, A1U ? 1 : 0);
            Integer num = gmK2.A05;
            if (num == AnonymousClass05K.A0C) {
                r5.ExS(2019702616);
                r9 = C60340gF.A00;
                r5.ExS(896436583);
                boolean z6 = false;
                if ((((i6 & 7168) ^ 3072) > 2048 && r5.AGu(r12)) || (i6 & 3072) == 2048) {
                    z6 = true;
                }
                Object ECw2 = r5.ECw();
                if (z6 || ECw2 == obj) {
                    ECw2 = new JVD(r12, (AnonymousClass4D7) null, 29);
                    r5.FLL(ECw2);
                }
                A10 = C51965G9l.A10(A0H, ECw2);
            } else {
                boolean z7 = false;
                if (num == AnonymousClass05K.A0N) {
                    r5.ExS(2019812728);
                    r9 = C60340gF.A00;
                    r5.ExS(896440135);
                    if ((((57344 & i2) ^ 24576) > 16384 && r5.AGu(r11)) || (i6 & 24576) == 16384) {
                        z7 = true;
                    }
                    Object ECw3 = r5.ECw();
                    if (z7 || ECw3 == obj) {
                        ECw3 = new JVD(r11, (AnonymousClass4D7) null, 30);
                        r5.FLL(ECw3);
                    }
                    A10 = C51965G9l.A10(A0H, ECw3);
                } else {
                    r5.ExS(2019874232);
                    C286565Wx.A0L(A0H, false);
                }
            }
            C286645Xf.A04(r5, r9, A10);
            C286565Wx.A0L(A0H, false);
        } else {
            Integer num2 = gmK2.A05;
            if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A01) {
                r5.ExS(2019976501);
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A002 = C287425a7.A00(r5);
                AnonymousClass5RM A04 = C286565Wx.A04(A0H);
                Modifier A01 = C287435a8.A01(r5, modifier2);
                C51973G9u.A0y(r5, A0H);
                C51971G9r.A12(r5, A0a, A04);
                0sL r2 = C287485aD.A02;
                if (A0H.A0K || !C51972G9s.A1Q(r5, A002)) {
                    C51971G9r.A13(r5, r2, A002);
                }
                C51965G9l.A18(r5, A01);
                HUY.A00(r5, C51965G9l.A0L(C289515dj.A00, Modifier.A00), (C52424GSc) null, 0, 2);
                r5.ASN();
            } else if (num2 != AnonymousClass05K.A0N || !gmK2.A0U || !gmK2.A0P) {
                r5.ExS(2020953249);
                r11.invoke();
                HUW.A00(r5, modifier2, new C58132Imy(ggz2, 6), (i2 >> 18) & 112, 0);
            } else {
                r5.ExS(2020217061);
                C286645Xf.A04(r5, C60340gF.A00, new PermalinkContentKt$PermalinkContent$6(A0N, A0h, str7, C288035bG.A00(r5, 2131953671), (AnonymousClass4D7) null, r22, r12));
            }
        }
        if (C51967G9n.A1b(A0H, false)) {
            0fL.A00(179544113);
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            Modifier modifier3 = modifier2;
            C55932Hpu hpu3 = hpu2;
            C299635va r132 = r70;
            C53334GmK gmK3 = gmK2;
            C53008Ggz ggz3 = ggz2;
            ASQ.A06 = new C59292JDs(modifier3, hpu3, r132, gmK3, ggz3, str7, str8, str6, str5, r20, r23, r22, r12, r11, r25, r26, r27, r28, r29, r30, f2, i, i6, i3, i5, z5, A1Q, A1Q2, A1Q3);
        }
    }
}
