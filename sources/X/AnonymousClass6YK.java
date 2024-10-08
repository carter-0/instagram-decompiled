package X;

import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6YK  reason: invalid class name */
public final class AnonymousClass6YK {
    public static final AnonymousClass6YK A00 = new Object();

    public static final boolean A01(TextView textView, String str) {
        0qQ.A0B(textView, 1);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        int measureText = (int) textPaint.measureText(str);
        CharSequence text = textView.getText();
        0qQ.A07(text);
        if (text.length() == 0 || textView.getWidth() == 0 || textView.getWidth() > measureText) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, C255773uh r6, C250973mM r7) {
        Boolean CUe;
        1Xj r2 = r6.A0b;
        if (!(r2 == null || r6.A0i == null || !A02(userSession, r6, r7))) {
            Reel reel = r7.A0H;
            if (!reel.A0b() && !reel.A0i() && r2.A1t() == AnonymousClass3QO.DEFAULT && (((CUe = AnonymousClass0t1.A01.A01(userSession).A03.CUe()) == null || !CUe.booleanValue()) && !C379209Sy.A00(userSession, r2.A2y()) && !r6.A1e() && !r6.A1t(AnonymousClass3WT.SECRET_STICKER))) {
                if (r6.A16()) {
                    C270184gK r0 = r6.A0d;
                    r0.getClass();
                    if (r0.A00.A0n()) {
                        return false;
                    }
                }
                return !r6.A1N() && !182.A06(0Tu.A05, userSession, 36325759647888586L);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.A5Z() != true) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.common.session.UserSession r6, X.C255773uh r7, X.C250973mM r8, com.instagram.model.reels.ReelViewerConfig r9, X.AnonymousClass3BQ r10) {
        /*
            r5 = 1
            com.instagram.model.effect.AttributedAREffect r1 = r7.A05
            boolean r0 = r7.A12()
            r4 = 1
            if (r0 == 0) goto L_0x0015
            if (r1 == 0) goto L_0x0015
            com.instagram.model.shopping.ProductAREffectContainer r1 = r1.A04
            r0 = 0
            if (r1 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            r4 = r0 ^ 1
        L_0x0014:
            return r4
        L_0x0015:
            boolean r3 = r7.CWu()
            if (r3 == 0) goto L_0x0026
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A5Z()
            r2 = 1
            if (r0 == r5) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x004f
            boolean r0 = r7.A1e()
            if (r0 != 0) goto L_0x004f
            X.3WT r0 = X.AnonymousClass3WT.SECRET_STICKER
            boolean r0 = r7.A1t(r0)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r7.A0f()
            if (r0 == 0) goto L_0x004f
            boolean r0 = r7.A1D()
            if (r0 == 0) goto L_0x0051
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A5Z()
            if (r0 == 0) goto L_0x0051
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            X.3BQ r0 = X.AnonymousClass3BQ.ARCHIVE
            if (r10 == r0) goto L_0x004f
            X.3BQ r0 = X.AnonymousClass3BQ.CALENDAR
            if (r10 == r0) goto L_0x004f
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_ARCHIVE_GRID_SUBTAB
            if (r10 == r0) goto L_0x004f
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 == r0) goto L_0x004f
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 == r0) goto L_0x004f
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 == r0) goto L_0x004f
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 == r0) goto L_0x004f
            if (r3 == 0) goto L_0x004f
            if (r2 != 0) goto L_0x004f
            com.instagram.model.reels.Reel r2 = r8.A0H
            com.instagram.model.reels.ReelType r1 = r2.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0n
            if (r1 == r0) goto L_0x009b
            boolean r0 = r2.A0i()
            if (r0 != 0) goto L_0x009b
            X.1Ns r0 = r2.A0W
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r1 = r0.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x004f
        L_0x009b:
            boolean r0 = A02(r6, r7, r8)
            if (r0 == 0) goto L_0x0014
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = X.2Ek.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.C59806JZa.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A05(com.instagram.common.session.UserSession, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.3BQ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0.A00.A0n() != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r4, com.instagram.common.session.UserSession r5, X.C255773uh r6, com.instagram.model.reels.ReelViewerConfig r7, boolean r8) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318943534848774(0x8107e300031b06, double:3.031584363861012E-306)
            boolean r3 = X.182.A06(r2, r5, r0)
            X.1Xj r0 = r6.A0b
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.A53()
            if (r0 != r2) goto L_0x001c
            boolean r0 = X.C305756Jk.A00(r4)
            return r0
        L_0x001c:
            com.instagram.user.model.User r0 = r6.A0i
            if (r0 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0036
            boolean r0 = r6.A16()
            if (r0 == 0) goto L_0x0036
            X.4gK r0 = r6.A0d
            r0.getClass()
            X.3Q2 r0 = r0.A00
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            return r1
        L_0x0036:
            boolean r0 = r6.A1N()
            if (r0 != 0) goto L_0x0035
            if (r8 == 0) goto L_0x0043
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x0043
            return r1
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A00(android.content.Context, com.instagram.common.session.UserSession, X.3uh, com.instagram.model.reels.ReelViewerConfig, boolean):boolean");
    }

    public static final boolean A02(UserSession userSession, C255773uh r4, C250973mM r5) {
        if (1AW.A06(0Tu.A05, 18311885124286123L)) {
            return 0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r4.A0i);
        }
        if (r5.A0H.A1a || 0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r4.A0i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A06(android.content.res.Resources r4, com.instagram.common.session.UserSession r5, com.instagram.model.direct.DirectShareTarget r6, X.C255773uh r7, X.AnonymousClass3BQ r8, boolean r9) {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x000f
            X.1as r0 = X.1as.A04
            boolean r0 = r0.A0H(r5, r6)
            if (r0 == 0) goto L_0x000f
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r1 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0023
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r0 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r0 == 0) goto L_0x0068
            r0 = 2131960939(0x7f13246b, float:1.955856E38)
        L_0x001b:
            java.lang.String r0 = r4.getString(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0023:
            if (r7 == 0) goto L_0x004a
            com.instagram.user.model.User r1 = r7.A0i
            if (r1 == 0) goto L_0x004a
            java.lang.String r0 = r1.getUsername()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004a
            X.3BQ r0 = X.AnonymousClass3BQ.DIRECT
            if (r8 != r0) goto L_0x004a
            java.lang.String r0 = r1.getUsername()
            r1 = 2131971563(0x7f134deb, float:1.9580109E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r1, r0)
        L_0x0046:
            X.0qQ.A0A(r0)
            return r0
        L_0x004a:
            if (r9 == 0) goto L_0x0050
            r0 = 2131971564(0x7f134dec, float:1.958011E38)
            goto L_0x001b
        L_0x0050:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320725946082081(0x81098200002321, double:3.032711567902149E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 2131971560(0x7f134de8, float:1.9580103E38)
            if (r1 == 0) goto L_0x0063
            r0 = 2131971562(0x7f134dea, float:1.9580107E38)
        L_0x0063:
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0046
        L_0x0068:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YK.A06(android.content.res.Resources, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectShareTarget, X.3uh, X.3BQ, boolean):java.lang.String");
    }

    public static final boolean A03(UserSession userSession, C255773uh r2, C250973mM r3) {
        1Xj r0;
        if (AnonymousClass4EQ.A0G(r2) || A02(userSession, r2, r3)) {
            return false;
        }
        if ((r2.A1h() && ((r0 = r2.A0b) == null || !r0.A5j())) || r2.A1E() || !r3.A0H.A1B) {
            return false;
        }
        1Xj r02 = r2.A0b;
        if (r02 == null) {
            return true;
        }
        Boolean AkR = r02.A0C.AkR();
        if (AkR == null || !AkR.booleanValue()) {
            return false;
        }
        return true;
    }
}
