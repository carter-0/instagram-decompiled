package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

public final class LTD {
    public static 1wn A00;
    public static final CallerContext A01 = CallerContext.A01("ReelsShareToFbRowViewBinder");
    public static final LTD A02 = new Object();

    public static final void A00(Context context, AnonymousClass4DH r6, UserSession userSession, C61149Jy0 jy0, L2V l2v, C63882LAl lAl, C47522E6i e6i) {
        boolean z;
        Integer num = jy0.A00;
        if (num != null) {
            int intValue = num.intValue();
            L2V l2v2 = l2v;
            C63882LAl lAl2 = lAl;
            C47522E6i e6i2 = e6i;
            if (intValue == 0) {
                C367288qV.A01.A0C(userSession, "reels_row_share", true, true);
                z = true;
            } else if (intValue == 1) {
                z = false;
            } else if (intValue == 2) {
                IgdsButton igdsButton = lAl2.A06;
                igdsButton.setLoading(false);
                igdsButton.setEnabled(true);
                C363388je.A00(userSession).A01(A01, (C363658k8) null, "reels_row_share");
                A01(context, r6, userSession, new L56(l2v2.A00, false), lAl2, e6i2);
                return;
            } else {
                return;
            }
            C246353eS.A00.A0C(context, C246353eS.A00(AnonymousClass818.IG_SELF_REEL_LIKES_SHEET, new C64550Ldr(context, r6, userSession, l2v2, lAl2, e6i2, z), userSession, l2v2.A00, AnonymousClass05K.A15), userSession, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.LXf] */
    /* JADX WARNING: type inference failed for: r0v64, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        if (r8 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        if (r0.length() != 0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (r10.length() == 0) goto L_0x015e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r11, X.AnonymousClass4DH r12, com.instagram.common.session.UserSession r13, X.L56 r14, X.C63882LAl r15, X.C47522E6i r16) {
        /*
            X.8je r0 = X.C363378jd.A08
            com.facebook.common.callercontext.CallerContext r6 = A01
            r0.A04(r6, r13)
            boolean r0 = X.C367288qV.A06(r13)
            r14.A00 = r0
            X.1Xj r4 = r14.A01
            X.3YP r0 = r4.A1k()
            X.3YP r3 = X.AnonymousClass3YP.NOT_SHARED
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r3)
            r5 = r11
            r11 = r15
            if (r0 != 0) goto L_0x014b
            X.3YP r1 = r4.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 == r0) goto L_0x014b
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r15.A07
            r2 = 8
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r15.A04
            r0.setVisibility(r2)
        L_0x0031:
            X.3YP r0 = r4.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r3)
            if (r0 != 0) goto L_0x013d
            X.3YP r1 = r4.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 == r0) goto L_0x013d
            com.instagram.common.ui.base.IgTextView r0 = r15.A03
            r0.setVisibility(r2)
        L_0x0048:
            X.3YP r0 = r4.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r3)
            if (r0 != 0) goto L_0x00c0
            X.3YP r1 = r4.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 == r0) goto L_0x00c0
            com.instagram.common.ui.base.IgTextView r0 = r15.A02
            r0.setVisibility(r2)
        L_0x005f:
            X.3YP r0 = r4.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r3)
            if (r0 == 0) goto L_0x0073
            X.8sM r5 = X.C368278sM.VIEW
            java.lang.String r1 = r4.getId()
            r0 = 0
            A04(r5, r13, r1, r0)
        L_0x0073:
            boolean r1 = r14.A00
            X.3YP r0 = r4.A1k()
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r3)
            r10 = r16
            r3 = 0
            if (r1 == 0) goto L_0x009e
            if (r0 == 0) goto L_0x01a8
            com.instagram.igds.components.button.IgdsButton r0 = r15.A05
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r1 = r15.A06
            r1.setVisibility(r3)
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r1.setText((int) r0)
            r9 = 6
            X.LXf r8 = new X.LXf
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x009a:
            X.AnonymousClass0fU.A00(r8, r1)
            return
        L_0x009e:
            if (r0 == 0) goto L_0x01c4
            com.instagram.igds.components.button.IgdsButton r0 = r15.A06
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r2 = r15.A05
            r2.setVisibility(r3)
            r1 = 2131238090(0x7f081cca, float:1.8092449E38)
            X.4lx r0 = X.C273084lx.END
            r2.A02(r0, r1)
            android.widget.LinearLayout r1 = r15.A00
            r3 = 5
            X.LXb r8 = new X.LXb
            r2 = r8
            r4 = r12
            r5 = r15
            r6 = r14
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x009a
        L_0x00c0:
            com.instagram.common.ui.base.IgTextView r7 = r15.A02
            r0 = 0
            r7.setVisibility(r0)
            X.Ju9 r8 = X.C367288qV.A01(r6, r13)
            X.8jd r0 = X.C363388je.A00(r13)
            X.5wF r0 = r0.A00(r6)
            boolean r0 = X.C363388je.A02(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0133
            X.0Tu r9 = X.0Tu.A05
            r0 = 36330703155118818(0x811295000042e2, double:3.039021195071978E-306)
            boolean r0 = X.182.A06(r9, r13, r0)
            if (r0 == 0) goto L_0x0133
            r0 = 2131973567(0x7f1355bf, float:1.9584173E38)
            java.lang.String r6 = r5.getString(r0)
            if (r8 == 0) goto L_0x00f9
        L_0x00ef:
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0104
        L_0x00f9:
            X.8sM r9 = X.C368278sM.SUPPRESS
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "empty_name"
            A04(r9, r13, r1, r0)
        L_0x0104:
            if (r6 == 0) goto L_0x010c
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0117
        L_0x010c:
            X.8sM r9 = X.C368278sM.SUPPRESS
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "empty_audience"
            A04(r9, r13, r1, r0)
        L_0x0117:
            if (r8 == 0) goto L_0x0138
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x0138
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0138
            if (r6 == 0) goto L_0x0138
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0138
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            X.JTR.A18(r5, r7, r1, r6, r0)
            goto L_0x005f
        L_0x0133:
            if (r8 == 0) goto L_0x00f9
            java.lang.String r6 = r8.A02
            goto L_0x00ef
        L_0x0138:
            r7.setVisibility(r2)
            goto L_0x005f
        L_0x013d:
            com.instagram.common.ui.base.IgTextView r1 = r15.A03
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131971832(0x7f134ef8, float:1.9580654E38)
            r1.setText(r0)
            goto L_0x0048
        L_0x014b:
            X.Ju9 r0 = X.C367288qV.A01(r6, r13)
            r9 = 0
            if (r0 == 0) goto L_0x019a
            java.lang.String r10 = r0.A05
        L_0x0154:
            r8 = 0
            if (r10 == 0) goto L_0x015e
            int r1 = r10.length()
            r0 = 0
            if (r1 != 0) goto L_0x015f
        L_0x015e:
            r0 = 1
        L_0x015f:
            r2 = 8
            if (r0 != 0) goto L_0x019c
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r15.A04
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r15.A07
            r7.setVisibility(r8)
            r7.A04()
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r10)
            r7.A0F(r9, r12, r0)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329865636495720(0x8111d200004168, double:3.038491544922314E-306)
            boolean r0 = X.182.A06(r8, r13, r0)
            if (r0 == 0) goto L_0x0187
            r7.A05()
        L_0x0187:
            r0 = 2131230991(0x7f08010f, float:1.807805E38)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r7.setBottomBadgeDrawable(r0)
            r0 = 3
            float r0 = X.0nA.A04(r5, r0)
            r7.A01 = r0
            goto L_0x0031
        L_0x019a:
            r10 = r9
            goto L_0x0154
        L_0x019c:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r15.A07
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r15.A04
            r0.setVisibility(r8)
            goto L_0x0031
        L_0x01a8:
            X.3YP r1 = r4.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 != r0) goto L_0x01c1
            com.instagram.igds.components.button.IgdsButton r0 = r15.A05
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r2 = r15.A06
            r2.setVisibility(r3)
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r2.setText((int) r0)
            goto L_0x01e3
        L_0x01c1:
            com.instagram.igds.components.button.IgdsButton r0 = r15.A06
            goto L_0x01e9
        L_0x01c4:
            X.3YP r1 = r4.A1k()
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 != r0) goto L_0x01e7
            android.widget.LinearLayout r0 = r15.A00
            r0.setEnabled(r3)
            com.instagram.igds.components.button.IgdsButton r0 = r15.A06
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r2 = r15.A05
            r2.setVisibility(r3)
            r1 = 2131238090(0x7f081cca, float:1.8092449E38)
            X.4lx r0 = X.C273084lx.END
            r2.A02(r0, r1)
        L_0x01e3:
            X.JTQ.A1I(r2)
            return
        L_0x01e7:
            com.instagram.igds.components.button.IgdsButton r0 = r15.A05
        L_0x01e9:
            r0.setVisibility(r2)
            r10.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTD.A01(android.content.Context, X.4DH, com.instagram.common.session.UserSession, X.L56, X.LAl, X.E6i):void");
    }

    public static final void A02(C368278sM r4, UserSession userSession, String str) {
        AnonymousClass818 r3 = AnonymousClass818.IG_SELF_REEL_LIKES_SHEET;
        AnonymousClass819 r2 = AnonymousClass819.ROWSHARE_SINGLE_XAR_REEL;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A06("ig_media_id", str);
        C368288sN.A00(r3, r4, r2, A0O, userSession);
        A03(r4, userSession, str);
    }

    public static final void A03(C368278sM r4, UserSession userSession, String str) {
        AnonymousClass818 r42;
        JZY jzy;
        if (r4 == C368278sM.VIEW) {
            r42 = AnonymousClass818.IG_SELF_REEL_LIKES_SHEET;
            jzy = JZY.VIEW;
        } else if (r4 == C368278sM.ACCEPT) {
            r42 = AnonymousClass818.IG_SELF_REEL_LIKES_SHEET;
            jzy = JZY.SHARE_CLICK;
        } else {
            return;
        }
        JZZ jzz = JZZ.REELS;
        0bb r1 = new 0bb();
        r1.A06("media_id", str);
        JZX.A00(jzy, jzz, r42, r1, userSession);
    }

    public static final void A04(C368278sM r4, UserSession userSession, String str, String str2) {
        AnonymousClass818 r3 = AnonymousClass818.IG_SELF_REEL_LIKES_SHEET;
        AnonymousClass819 r2 = AnonymousClass819.ROWSHARE_SINGLE_CCP_REEL;
        AnonymousClass81A A0O = JTO.A0O();
        JTQ.A19(A0O, "ig_media_id", str, str2);
        C368288sN.A00(r3, r4, r2, A0O, userSession);
        A03(r4, userSession, str);
    }
}
