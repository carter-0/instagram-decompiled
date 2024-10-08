package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Has  reason: case insensitive filesystem */
public abstract class C55021Has {
    public static final void A00(C286575Wy r30, C62320sa r31, AnonymousClass62P r32, int i) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        Object[] objArr;
        Object obj3;
        Object obj4;
        Object obj5;
        String A01;
        Object obj6;
        Object obj7;
        C62320sa r14 = r31;
        AnonymousClass62P r1 = r32;
        int A1U = AnonymousClass7TF.A1U(0, r1, r14);
        C286575Wy r0 = r30;
        r0.ExV(-211158828);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, r1) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r0, r14);
        }
        if ((i2 & 19) != 18 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1115963257, "com.instagram.friendmap.view.compose.FriendMapNotesNux (FriendMapNotesNux.kt:28)");
            }
            C285245Qk r20 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r20);
            AnonymousClass5RD A0X = C51968G9o.A0X(r0);
            int A00 = C287425a7.A00(r0);
            C286565Wx r3 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r0, A0T);
            C51973G9u.A0y(r0, r3);
            C51971G9r.A12(r0, A0X, A04);
            0sL r6 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r6, A00);
            }
            C51965G9l.A18(r0, A012);
            AnonymousClass6G3.A05(r0, A0T, C287975bA.A00(r0, R.drawable.friend_map_notes_illo_friend_map_notes, 0));
            String A002 = C304346Dc.A00(r0, 2131962745);
            C285245Qk r62 = r20;
            C286575Wy r21 = r0;
            AnonymousClass5ZZ.A0X(r21, C287195Zj.A0B(r62, C287645aX.A01(r0, R.dimen.action_button_min_width), C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material), C287645aX.A01(r0, R.dimen.action_button_min_width), 0.0f), I5Q.A00(r0), A002, C51966G9m.A0H(r0));
            if (0fL.A02()) {
                0fL.A01(1479705564, "com.instagram.friendmap.view.compose.subtitle (FriendMapNotesNux.kt:68)");
            }
            C303876Bd A0b = C51969G9p.A0b();
            int size = r1.size();
            String A003 = C304346Dc.A00(r0, 2131962744);
            String str = "";
            if (size <= A1U) {
                r0.ExS(1336018075);
                C286565Wx.A0L(r3, false);
                A01 = str;
            } else {
                if (size == 2) {
                    r0.ExS(-233995686);
                    i3 = 2131962748;
                    if (r1.size() > 0) {
                        obj6 = r1.get(0);
                    } else {
                        obj6 = str;
                    }
                    if (A1U < r1.size()) {
                        obj7 = r1.get(A1U);
                    } else {
                        obj7 = str;
                    }
                    objArr = new Object[]{obj6, obj7};
                } else if (size == 3) {
                    r0.ExS(-233987396);
                    i3 = 2131962747;
                    if (r1.size() > 0) {
                        obj3 = r1.get(0);
                    } else {
                        obj3 = str;
                    }
                    if (A1U < r1.size()) {
                        obj4 = r1.get(A1U);
                    } else {
                        obj4 = str;
                    }
                    if (2 < r1.size()) {
                        obj5 = r1.get(2);
                    } else {
                        obj5 = str;
                    }
                    objArr = new Object[]{obj3, obj4, obj5};
                } else {
                    r0.ExS(-233977232);
                    i3 = 2131962746;
                    if (r1.size() > 0) {
                        obj = r1.get(0);
                    } else {
                        obj = str;
                    }
                    if (A1U < r1.size()) {
                        obj2 = r1.get(A1U);
                    } else {
                        obj2 = str;
                    }
                    objArr = new Object[]{obj, obj2, Integer.valueOf(DbT.A02(r1, 2))};
                }
                A01 = C304346Dc.A01(r0, objArr, i3);
                C286565Wx.A0L(r3, false);
            }
            int length = A01.length();
            if (AnonymousClass7TF.A1R(length)) {
                str = " ";
            }
            String A0g = 002.A0g(A003, str, A01);
            A0b.A09(A0g);
            if (length > 0) {
                if (size > 3) {
                    size = 2;
                }
                List A0d = 00k.A0d(r1, size);
                ArrayList<0eP> A1C = AnonymousClass7TE.A1C();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    int A08 = 00l.A08(A0g, A18, 0, false);
                    int A05 = C51966G9m.A05(A18, A08);
                    0eP A0x = AnonymousClass7TF.A0x(Integer.valueOf(A08), A05);
                    if (A08 >= 0) {
                        StringBuilder sb = A0b.A00;
                        if (A08 <= sb.length() && A08 <= A05 && A05 <= sb.length()) {
                            A1C.add(A0x);
                        }
                    }
                }
                for (0eP r5 : A1C) {
                    A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65531, 0, 0, 0), C51970G9q.A0B(r5), C51969G9p.A0A(r5));
                }
            }
            C286025Tq A02 = A0b.A02();
            if (0fL.A02()) {
                0fL.A00(834836124);
            }
            C285245Qk r52 = r20;
            C286575Wy r19 = r0;
            IgClickableTextKt.A04(r19, C287195Zj.A09(C287195Zj.A09(r52, C287645aX.A01(r0, R.dimen.abc_star_medium), C287645aX.A00(r0)), C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material), 0.0f), A02, C51966G9m.A0b(r0), J3V.A00, 3, 24576, C51966G9m.A0M(r0));
            r0.ASN();
            C60340gF r7 = C60340gF.A00;
            boolean A1Y = C51974G9v.A1Y(r0, 974385206, i2);
            Object ECw = r0.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new C66181MGs(r14, (AnonymousClass4D7) null, 36);
                r0.FLL(ECw);
            }
            if (C51972G9s.A1S(r0, r3, ECw, r7)) {
                0fL.A00(-392427026);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r14, r1, i4, 23);
        }
    }
}
