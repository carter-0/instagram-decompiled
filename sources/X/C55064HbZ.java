package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HbZ  reason: case insensitive filesystem */
public abstract class C55064HbZ {
    public static final void A00(String str, String str2, C286575Wy r19, int i) {
        int i2;
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TF.A1H(str3, str4);
        C286575Wy r10 = r19;
        r10.ExV(-486015089);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, str3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r10, str4);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1075770847, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsEmpty (FollowRequestsEmpty.kt:19)");
            }
            C285245Qk r4 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r4, 32.0f, 32.0f, 32.0f, 64.0f);
            AnonymousClass5RD A0X = C51968G9o.A0X(r10);
            int A00 = C287425a7.A00(r10);
            C286565Wx r6 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r10, A0B);
            C51973G9u.A0y(r10, r6);
            C51971G9r.A12(r10, A0X, A04);
            0sL r3 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r3, A00);
            }
            C51965G9l.A18(r10, A01);
            C286575Wy r13 = r10;
            C288165bT.A00(r13, C287205Zk.A0C(C287195Zj.A0B(r4, 0.0f, 0.0f, 0.0f, 16.0f), 96.0f), C287975bA.A00(r10, R.drawable.empty_state_follow, 0), 432, 24, 0);
            C286575Wy r14 = r10;
            String str5 = str3;
            AnonymousClass5ZZ.A0O(r14, C287195Zj.A0B(r4, 0.0f, 0.0f, 0.0f, 14.0f), C51966G9m.A0e(r10), str5, (i2 & 14) | 48, C51966G9m.A0H(r10));
            AnonymousClass5ZZ.A0l(r10, C51966G9m.A0c(r10), str4, 3, (i2 >> 3) & 14, 16250, C51966G9m.A0M(r10));
            if (C51967G9n.A1R(r10)) {
                0fL.A00(413917883);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7S(str3, str4, i3, 2);
        }
    }
}
