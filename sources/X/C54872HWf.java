package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HWf  reason: case insensitive filesystem */
public abstract class C54872HWf {
    public static final void A00(C286575Wy r9, C336617eu r10, C56030Hrc hrc, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        boolean A1U = AnonymousClass7TF.A1U(0, r10, hrc);
        r9.ExV(640381991);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r9, r10) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r9, hrc);
        }
        if ((i2 & 91) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1060363348, "com.instagram.comments.mvvm.view.compose.ChildCommentLoadRow (ChildCommentLoadRow.kt:34)");
            }
            int intValue = r10.A02.intValue();
            if (intValue == A1U) {
                r9.ExS(-32402512);
                str = C288035bG.A00(r9, 2131963387);
            } else if (intValue == 0 || intValue == 2) {
                r9.ExS(-1004328140);
                int intValue2 = r10.A04.intValue();
                if (intValue2 == 0) {
                    r9.ExS(-32395520);
                    Context A0I = C51968G9o.A0I(r9);
                    0qQ.A0B(A0I, 0);
                    int intValue3 = r10.A03.intValue();
                    Resources A0A = AnonymousClass7TF.A0A(A0I);
                    int i5 = r10.A00;
                    if (intValue3 != 0) {
                        i3 = R.plurals.view_x_previous_replies;
                        i4 = 2131976656;
                    } else {
                        i3 = R.plurals.view_x_more_replies;
                        i4 = 2131976645;
                    }
                    if (i5 > 0) {
                        try {
                            str = A0A.getQuantityString(i3, i5, new Object[]{Integer.valueOf(i5)});
                        } catch (Resources.NotFoundException unused) {
                            str = A0A.getString(i4);
                        }
                    } else {
                        str = A0A.getString(i4);
                    }
                    0qQ.A0A(str);
                } else if (intValue2 == A1U) {
                    r9.ExS(-32392589);
                    str = C288035bG.A00(r9, 2131965495);
                } else {
                    throw C51973G9u.A0n(r9, -32397320);
                }
                C51965G9l.A1X(r9, false);
            } else {
                throw C51973G9u.A0n(r9, -32404432);
            }
            C286565Wx A0H = C51965G9l.A0H(r9, false);
            C285245Qk r7 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(C287195Zj.A0B(C51966G9m.A0T(r7), 54.0f, 0.0f, 12.0f, 0.0f), 0.0f, 6.0f);
            boolean A1L = C51972G9s.A1L(i2) | C51973G9u.A1N(r9, -32378738, i2);
            Object ECw = r9.ECw();
            if (A1L || ECw == AnonymousClass5XT.A00) {
                ECw = new C58188Ins(12, r10, hrc);
                r9.FLL(ECw);
            }
            Modifier A0V = C51969G9p.A0V(A0H, A09, ECw);
            AnonymousClass5RD A0W = C51968G9o.A0W(r9);
            int A00 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r9, A0V);
            C51973G9u.A0y(r9, A0H);
            C51971G9r.A12(r9, A0W, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r1, A00);
            }
            C51965G9l.A18(r9, A01);
            C51969G9p.A14(r9, C287195Zj.A0B(C287205Zk.A0D(C287205Zk.A08(r7, 1.0f), 22.0f), 0.0f, 0.0f, 9.0f, 0.0f), C51965G9l.A0A(r9));
            C54877HWk.A00(str, r9, 0);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(1930664534);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, hrc, r10, i, 26);
        }
    }
}
