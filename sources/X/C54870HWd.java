package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;

/* renamed from: X.HWd  reason: case insensitive filesystem */
public abstract class C54870HWd {
    public static final void A00(C286575Wy r13, MediaType mediaType, String str, C62320sa r16, int i, int i2) {
        int i3;
        AnonymousClass2DO A0W;
        String str2 = str;
        C62320sa r9 = r16;
        AnonymousClass7TF.A1C(str, 0, r9);
        C286575Wy r2 = r13;
        r13.ExV(-139339070);
        int i4 = i2;
        if ((i2 & 14) == 0) {
            i3 = G9t.A0O(r13, str) | i2;
        } else {
            i3 = i4;
        }
        MediaType mediaType2 = mediaType;
        if ((i2 & 112) == 0) {
            i3 |= G9t.A0P(r13, mediaType);
        }
        int i5 = i;
        if ((i4 & 896) == 0) {
            i3 |= G9t.A07(r13, i5);
        }
        if ((i4 & 7168) == 0) {
            i3 |= G9t.A0H(r13, r9);
        }
        if ((i3 & 5851) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1257222552, "com.instagram.comments.mvvm.view.compose.AvatarSticker (AvatarSticker.kt:29)");
            }
            Context A0I = C51968G9o.A0I(r13);
            if (mediaType == MediaType.ANIMATION) {
                r2.ExS(-795732587);
                UserSession A0h = C51968G9o.A0h(r2);
                A0W = C287995bC.A00(C320996tP.A02(A0I, A0h, str, C61380mr.A01(A0I, i5), C61380mr.A01(A0I, i5), C63282KuR.A00(A0h)), r2);
            } else {
                r2.ExS(-795431143);
                A0W = C51975G9x.A0W(r2, str);
            }
            C51965G9l.A1X(r2, false);
            C285245Qk r7 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(r7, (float) i5);
            0lg A0j = C51969G9p.A0j(r2);
            if (182.A06(DbS.A0J(A0j, 0), A0j, 36320356579090780L)) {
                A0C = A0C.Ezh(C287635aW.A06(r7, r9));
            }
            AnonymousClass6G3.A0B(r2, A0C, A0W, C288035bG.A00(r2, 2131953506), 8);
            if (0fL.A02()) {
                0fL.A00(1489718233);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Y(mediaType2, r9, str2, i5, i4, 2);
        }
    }
}
