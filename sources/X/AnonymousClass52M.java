package X;

import android.text.method.TransformationMethod;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.52M  reason: invalid class name */
public abstract class AnonymousClass52M {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.C271174i4.A02(r3) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C243993aT r1, X.0xF r2, com.instagram.common.session.UserSession r3, X.1Xj r4, com.instagram.search.common.analytics.SearchContext r5, X.C243923aK r6, X.C243873aF r7, X.C243853aD r8, X.C243913aJ r9, X.C243893aH r10, X.C243943aO r11, X.C267064at r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r12.A0H = r14
            r12.A0C = r11
            r12.A04 = r4
            r12.A03 = r2
            r12.A07 = r5
            r12.A07(r8)
            r12.A08 = r7
            r12.A0B = r10
            r12.A0A = r9
            r12.A02 = r1
            r2 = 1
            if (r16 == 0) goto L_0x001f
            boolean r1 = X.C271174i4.A02(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r12.A0P = r0
            r0 = r17
            r12.A0M = r0
            r0 = r18
            r12.A0O = r0
            r0 = r19
            r12.A0N = r0
            X.3aK r0 = X.C243923aK.COLLABORATOR_TEXT
            if (r6 != r0) goto L_0x003f
            boolean r0 = X.C271174i4.A02(r3)
            if (r0 == 0) goto L_0x003f
        L_0x0038:
            r12.A0Q = r2
            r12.A0F = r13
            r12.A0G = r15
            return
        L_0x003f:
            r2 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52M.A00(X.3aT, X.0xF, com.instagram.common.session.UserSession, X.1Xj, com.instagram.search.common.analytics.SearchContext, X.3aK, X.3aF, X.3aD, X.3aJ, X.3aH, X.3aO, X.4at, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    public static final void A01(UserSession userSession, C243923aK r3, FollowButton followButton, Integer num, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C243923aK r0;
        int i3;
        if (z5) {
            0qQ.A0B(followButton, 0);
            followButton.setTextAppearance(R.style.igds_emphasized_body_1);
        }
        followButton.A05 = z6;
        followButton.A0C = z3;
        if (r3 == null) {
            r0 = C243923aK.MEDIUM;
        } else {
            r0 = r3;
        }
        followButton.setBaseStyle(r0);
        followButton.setTransformationMethod((TransformationMethod) null);
        followButton.setDisableImmersivePadding(z2);
        if (r3 == C243923aK.COLLABORATOR_TEXT && C271174i4.A02(userSession)) {
            followButton.A02 = true;
            followButton.A00 = true;
        }
        followButton.setId(R.id.inline_follow_button);
        if (z4) {
            followButton.A04(2Yu.A0H(followButton.getContext(), R.attr.igds_color_stroke), false);
        } else if (z) {
            followButton.A02();
        } else if (followButton.A02 != null && !followButton.A07()) {
            followButton.A02 = null;
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = R.color.design_dark_default_color_on_background;
        }
        followButton.setCustomForegroundColor(i3);
        followButton.A00 = f;
        followButton.A02 = i;
        followButton.A01 = f2;
        followButton.A03 = i2;
    }
}
