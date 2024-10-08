package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.NoSuchElementException;

/* renamed from: X.HWn  reason: case insensitive filesystem */
public abstract class C54880HWn {
    public static final void A00(C286575Wy r15, C54213H3i h3i, C62320sa r17, int i) {
        int i2;
        Object obj;
        int i3;
        C54213H3i h3i2 = h3i;
        C62320sa r2 = r17;
        boolean A1U = AnonymousClass7TF.A1U(0, h3i2, r2);
        C286575Wy r12 = r15;
        r15.ExV(-341474060);
        int i4 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r15, h3i2) | i;
        } else {
            i2 = i4;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r15, r2);
        }
        if ((i2 & 91) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(157277975, "com.instagram.comments.mvvm.view.compose.CommentSortAndFilterRow (CommentSortAndFilterRow.kt:28)");
            }
            Context A0I = C51968G9o.A0I(r15);
            Object A0m = C51967G9n.A0m(r15, 727091219);
            Object obj2 = AnonymousClass5XT.A00;
            if (A0m == obj2) {
                C333797aA r10 = h3i2.A01;
                Integer A0l = C51967G9n.A0l(h3i2.A00);
                Resources A0A = AnonymousClass7TF.A0A(A0I);
                if (r10 == C333797aA.SUBSCRIBERS_ONLY) {
                    i3 = 2131956365;
                } else {
                    if (A0l == AnonymousClass05K.A01) {
                        Object[] stringArray = A0A.getStringArray(R.array.comments_sorting_options);
                        0qQ.A07(stringArray);
                        int length = stringArray.length;
                        if (length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        obj = stringArray[length - 1];
                    } else if (A0l == AnonymousClass05K.A00) {
                        String[] stringArray2 = A0A.getStringArray(R.array.comments_sorting_options);
                        0qQ.A07(stringArray2);
                        obj = 03t.A05(stringArray2);
                    } else {
                        i3 = 2131956363;
                    }
                    0qQ.A07(obj);
                    A0m = (String) obj;
                    r12.FLL(A0m);
                }
                A0m = AnonymousClass7TF.A0d(A0A, i3);
                r12.FLL(A0m);
            }
            String str = (String) A0m;
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            C285245Qk r5 = Modifier.A00;
            boolean A1O = C51973G9u.A1O(r12, 727097019, i2);
            Object ECw = r12.ECw();
            if (A1O || ECw == obj2) {
                ECw = new C58680Ivp(r2, 6);
                r12.FLL(ECw);
            }
            Modifier A05 = C287635aW.A05(r5, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw, false), A1U);
            AnonymousClass5RD A0V = C51968G9o.A0V(r12);
            int A00 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r12, A05);
            C51973G9u.A0y(r12, A0H);
            C51971G9r.A12(r12, A0V, A04);
            0sL r4 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r4, A00);
            }
            C51965G9l.A18(r12, A01);
            long A0H2 = C51966G9m.A0H(r12);
            AnonymousClass5ZZ.A0R(r12, C287195Zj.A0B(r5, 16.0f, 16.0f, 0.0f, 0.0f), C51966G9m.A0h(r12), str, A0H2);
            C288165bT.A07(r12, C287195Zj.A0B(C287205Zk.A0I(r5, 24.0f, Float.NaN, Float.NaN, Float.NaN), 0.0f, 16.0f, 16.0f, 16.0f), C287975bA.A00(r12, R.drawable.instagram_sliders_pano_outline_24, 0), C288035bG.A00(r12, 2131956364), 8, C51966G9m.A0G(r12));
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1982570187);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, h3i2, r2, i4, 27);
        }
    }
}
