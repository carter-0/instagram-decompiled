package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Hw3  reason: case insensitive filesystem */
public abstract class C56290Hw3 {
    public static final void A00(C286575Wy r17, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        int i2;
        AnonymousClass2DN A00;
        C286575Wy r6 = r17;
        r6.ExV(-1802307194);
        int i3 = i;
        ImageUrl imageUrl3 = imageUrl;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, imageUrl3) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl4 = imageUrl2;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r6, imageUrl4);
        }
        if ((i2 & 19) != 18 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-763218061, "com.instagram.direct.fragment.managefolders.AvatarPile (DirectManageFoldersCreateFolderFragment.kt:259)");
            }
            AnonymousClass2DN A01 = 1zC.A01(r6, imageUrl3, i2 & 14);
            r6.ExS(438899677);
            if (imageUrl2 == null) {
                A00 = null;
            } else {
                A00 = 1zC.A00(r6, imageUrl4);
            }
            C51965G9l.A1X(r6, false);
            GSL.A01(r6, (Modifier) null, A01, A00, 45.0f, 0.0f, 0.0f, 6, 1012, 0, 0, false, false);
            if (0fL.A02()) {
                0fL.A00(1962534020);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, imageUrl3, imageUrl4, i3, 0);
        }
    }

    public static final void A01(C286575Wy r20, C62320sa r21, AnonymousClass62P r22, int i) {
        int i2;
        C286575Wy r9 = r20;
        r9.ExV(-125343657);
        int i3 = i;
        AnonymousClass62P<2Er> r5 = r22;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, r5) | i;
        } else {
            i2 = i3;
        }
        C62320sa r6 = r21;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r6);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-38633152, "com.instagram.direct.fragment.managefolders.AddChats (DirectManageFoldersCreateFolderFragment.kt:226)");
            }
            C285245Qk r7 = Modifier.A00;
            boolean A1O = C51973G9u.A1O(r9, 351969151, i2);
            Object ECw = r9.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C46570DhC(r6, 44);
                r9.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r9, false);
            Modifier A06 = C287635aW.A06(r7, (C62320sa) ECw);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r9, A06);
            C51973G9u.A0y(r9, A0H);
            C51971G9r.A12(r9, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r1, A00);
            }
            C51965G9l.A18(r9, A01);
            if (r5.isEmpty()) {
                r9.ExS(-145523328);
                C52636GaA.A0P(r9, C57124IPn.A00, C288035bG.A00(r9, 2131959674));
            } else {
                r9.ExS(-145313954);
                String A002 = C288035bG.A00(r9, 2131959678);
                Context A0I = C51968G9o.A0I(r9);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (2Er BZK : r5) {
                    User BZK2 = BZK.BZK();
                    if (BZK2 != null) {
                        A1C.add(BZK2);
                    }
                }
                GS8.A02(r9, (Modifier) null, (C59641JRj) null, (GS7) null, A002, AnonymousClass50n.A00(A0I, C51968G9o.A0h(r9), A1C), (String) null, (C62320sa) null, AnonymousClass5PI.A01(r9, JJR.A00(r5, 13), 912262612), C55331Hfz.A00, 6, 6, 1012, false, false);
            }
            if (C51971G9r.A1S(r9, A0H, false)) {
                0fL.A00(-248083828);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r5, r6, i3, 49);
        }
    }
}
