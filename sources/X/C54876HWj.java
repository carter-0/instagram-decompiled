package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HWj  reason: case insensitive filesystem */
public abstract class C54876HWj {
    public static final void A00(C286575Wy r16, C337197fs r17, C333777a7 r18, C335847dd r19, AnonymousClass571 r20, C62320sa r21, int i, boolean z) {
        C286625Xd ASQ;
        JA0 ja0;
        int i2;
        C335847dd r2 = r19;
        C62320sa r12 = r21;
        DbW.A1N(r2, 0, r12);
        C286575Wy r8 = r16;
        if (C51967G9n.A1T(r8, 424844371)) {
            0fL.A01(-927087978, "com.instagram.comments.mvvm.view.compose.CommentLikeToolTip (CommentLikeTooltip.kt:24)");
        }
        UserSession A0h = C51968G9o.A0h(r8);
        C337197fs r4 = r17;
        C333777a7 r3 = r18;
        AnonymousClass571 r1 = r20;
        int i3 = i;
        boolean z2 = z;
        if (I2W.A02(A0h)) {
            i2 = 2131961008;
            I2W.A00(A0h);
        } else if (I2W.A01(r4, r3, r2, A0h, r1)) {
            i2 = 2131956397;
            0qQ.A0B(A0h, 0);
            AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(A0h), "seen_share_comment_nux_count").apply();
        } else {
            r12.invoke();
            if (0fL.A02()) {
                0fL.A00(1608636933);
            }
            ASQ = r8.ASQ();
            if (ASQ != null) {
                ja0 = new JA0(r2, r1, r18, r4, r12, i3, 0, z);
                ASQ.A06 = ja0;
            }
            return;
        }
        C56617I4s.A03(r8, HMB.DOWN_CENTER, (HLY) null, C288035bG.A00(r8, i2), r12, ((i >> 9) & 112) | 384 | ((i >> 6) & 7168), 2032, 0, z2);
        if (0fL.A02()) {
            0fL.A00(-1127198510);
        }
        ASQ = r8.ASQ();
        if (ASQ != null) {
            ja0 = new JA0(r2, r1, r18, r4, r12, i3, 1, z);
            ASQ.A06 = ja0;
        }
    }
}
