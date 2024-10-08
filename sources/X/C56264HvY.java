package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import com.instagram.android.R;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.HvY  reason: case insensitive filesystem */
public abstract class C56264HvY {
    @Deprecated(message = "This component is deprecated. Use FacePile instead.", replaceWith = @ReplaceWith(expression = "FacePile", imports = {"com.instagram.compose.ui.facepile"}))
    public static final void A01(C286575Wy r20, List list, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        0qQ.A0B(list, 0);
        C286575Wy r9 = r20;
        r9.ExV(2070366453);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, list) | i;
        } else {
            i2 = i4;
        }
        if ((i2 & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(152393839, "com.instagram.compose.ui.facepiledeprecated.FacePileDeprecated (FacePileDeprecated.kt:42)");
            }
            if (list.size() != 2) {
                if (0fL.A02()) {
                    0fL.A00(1004397817);
                }
                ASQ = r9.ASQ();
                if (ASQ != null) {
                    i3 = 36;
                    JGC.A01(ASQ, list, i4, i3);
                }
                return;
            }
            long A00 = C289505di.A00(r9, 2Yu.A02(C51968G9o.A0I(r9)));
            C285245Qk r12 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51966G9m.A0X(r12, A00), 1.0f);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r9);
            C286565Wx r10 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r10);
            Modifier A01 = C287435a8.A01(r9, A07);
            C62320sa r6 = C287485aD.A00;
            C51973G9u.A0z(r9, r10, r6);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r9, A002, A04, r5);
            0sL r4 = C287485aD.A02;
            if (r10.A0K || !C51972G9s.A1Q(r9, A003)) {
                C51971G9r.A13(r9, r4, A003);
            }
            0sL r3 = C287485aD.A04;
            C287595aO.A00(r9, A01, r3);
            C289515dj r13 = C289515dj.A00;
            Modifier Ezh = r12.Ezh(new ZIndexElement(1.0f));
            AnonymousClass5RD A004 = C287675aa.A00(alignment, false);
            int A005 = C287425a7.A00(r9);
            AnonymousClass5RM A042 = C286565Wx.A04(r10);
            Modifier A012 = C287435a8.A01(r9, Ezh);
            C51973G9u.A0z(r9, r10, r6);
            C287595aO.A00(r9, A004, r5);
            0sL r15 = A0w;
            if (C51965G9l.A1Y(r9, r10, A042, r15) || !C51972G9s.A1Q(r9, A005)) {
                C51971G9r.A13(r9, r4, A005);
            }
            C287595aO.A00(r9, A012, r3);
            A00(r9, C51965G9l.A0L(r13, r12), (HPI) 00k.A0J(list), 0, 0);
            AnonymousClass6G3.A03(r9, r13.AAz(C287215Zl.A0B, C51971G9r.A0Q(r12, 104.0f)), new C52928Gf2(A00));
            r9.ASN();
            Modifier AAz = r13.AAz(C287215Zl.A0A, C287195Zj.A0B(r12, 90.0f, 0.0f, 0.0f, 0.0f));
            AnonymousClass5RD A006 = C287675aa.A00(alignment, false);
            int A007 = C287425a7.A00(r9);
            AnonymousClass5RM A043 = C286565Wx.A04(r10);
            Modifier A013 = C287435a8.A01(r9, AAz);
            C51973G9u.A0z(r9, r10, r6);
            C287595aO.A00(r9, A006, r5);
            if (C51965G9l.A1Y(r9, r10, A043, r15) || !C51972G9s.A1Q(r9, A007)) {
                C51971G9r.A13(r9, r4, A007);
            }
            C287595aO.A00(r9, A013, r3);
            A00(r9, (Modifier) null, (HPI) 00k.A0L(list), 0, 2);
            if (C51971G9r.A1R(r9)) {
                0fL.A00(-1225864789);
            }
        } else {
            r9.Evl();
        }
        ASQ = r9.ASQ();
        if (ASQ != null) {
            i3 = 37;
            JGC.A01(ASQ, list, i4, i3);
        }
    }

    public static final void A00(C286575Wy r4, Modifier modifier, HPI hpi, int i, int i2) {
        int i3;
        C286625Xd ASQ;
        int i4;
        r4.ExV(-772165944);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, hpi) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r4, modifier);
        }
        if ((i3 & 19) != 18 || !r4.Bwn()) {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1158068328, "com.instagram.compose.ui.facepiledeprecated.RenderProfileImage (FacePileDeprecated.kt:67)");
            }
            if (hpi == null) {
                if (0fL.A02()) {
                    0fL.A00(-39798052);
                }
                ASQ = r4.ASQ();
                if (ASQ != null) {
                    i4 = 24;
                    ASQ.A06 = GSJ.A01(hpi, modifier, i2, i, i4);
                }
                return;
            }
            C304806Fh A00 = AnonymousClass6C9.A00(1.0f, C289505di.A00(r4, 2Yu.A0H(C51968G9o.A0I(r4), R.attr.igds_color_photo_border)));
            if (hpi instanceof C54342H8o) {
                AnonymousClass2DO r2 = ((C54342H8o) hpi).A00;
                Modifier A0C = C287205Zk.A0C(modifier.Ezh(new ZIndexElement(2.0f)), 96.0f);
                AnonymousClass5ZQ r1 = AnonymousClass5ZN.A00;
                AnonymousClass6G3.A03(r4, C304816Fi.A01(A00, AnonymousClass6FZ.A01(A0C, r1), r1), r2);
                if (0fL.A02()) {
                    0fL.A00(681640734);
                }
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            r4.Evl();
        }
        ASQ = r4.ASQ();
        if (ASQ != null) {
            i4 = 25;
            ASQ.A06 = GSJ.A01(hpi, modifier, i2, i, i4);
        }
    }
}
