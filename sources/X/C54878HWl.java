package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.HWl  reason: case insensitive filesystem */
public abstract class C54878HWl {
    public static final void A00(C286575Wy r19, C54216H3l h3l, C333777a7 r21, 0sP r22, 0sK r23, 0sK r24, 0sJ r25, 0sJ r26, 0sI r27, int i) {
        int i2;
        C54216H3l h3l2 = h3l;
        0qQ.A0B(h3l2, 0);
        0sK r7 = r23;
        0sJ r5 = r25;
        AnonymousClass7TF.A1C(r5, 2, r7);
        0sP r8 = r22;
        0qQ.A0B(r8, 4);
        0sK r6 = r24;
        0sJ r4 = r26;
        0sI r3 = r27;
        C51974G9v.A1N(r3, r6, r4);
        C286575Wy r10 = r19;
        r10.ExV(786209455);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r10, h3l2) | i;
        } else {
            i2 = i3;
        }
        C333777a7 r11 = r21;
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r10, r11);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r10, r5);
        }
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0H(r10, r7);
        }
        if ((57344 & i) == 0) {
            i2 |= G9t.A0I(r10, r8);
        }
        if ((458752 & i) == 0) {
            i2 |= G9t.A0J(r10, r3);
        }
        if ((3670016 & i) == 0) {
            i2 |= G9t.A0K(r10, r6);
        }
        if ((29360128 & i) == 0) {
            i2 |= G9t.A0L(r10, r4);
        }
        if ((23967451 & i2) != 4793490 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(964080306, "com.instagram.comments.mvvm.view.compose.CommentPollResults (CommentPollResults.kt:68)");
            }
            Context A0N = C51970G9q.A0N(r10);
            UserSession A0f = C51970G9q.A0f(r10);
            boolean z = h3l2.A03;
            C54216H3l h3l3 = h3l2;
            AnonymousClass4DU r20 = (AnonymousClass4DU) r10.AJO(C286935Yj.A00);
            IPS ips = new IPS(A0N, h3l3, A0f, r20, r8, r7, r6, r5, r4, r3, z, h3l2.A02);
            if (r11 != null) {
                HXF.A00(r10, (Modifier) null, ips, r11, i2 & 112, 4);
            }
            if (0fL.A02()) {
                0fL.A00(-878272684);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(h3l2, r11, r8, r5, r6, r7, r4, r3, i3, 2);
        }
    }
}
