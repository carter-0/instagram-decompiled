package X;

import android.view.View;

public final class WBE implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WBE(X9V x9v, WSZ wsz, int i) {
        this.A00 = i;
        if (31 - i != 0) {
            this.A01 = x9v;
            this.A02 = wsz;
        } else {
            this.A02 = wsz;
            this.A01 = x9v;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new WBE(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0783, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0786, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x079c, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x079f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x046a, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x046d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0656;
                case 1: goto L_0x061f;
                case 2: goto L_0x0608;
                case 3: goto L_0x05f1;
                case 4: goto L_0x06c1;
                case 5: goto L_0x05ba;
                case 6: goto L_0x0583;
                case 7: goto L_0x055e;
                case 8: goto L_0x0539;
                case 9: goto L_0x051e;
                case 10: goto L_0x0501;
                case 11: goto L_0x04e4;
                case 12: goto L_0x04c7;
                case 13: goto L_0x04a9;
                case 14: goto L_0x048d;
                case 15: goto L_0x0448;
                case 16: goto L_0x0424;
                case 17: goto L_0x0400;
                case 18: goto L_0x03d2;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0387;
                case 21: goto L_0x036a;
                case 22: goto L_0x034d;
                case 23: goto L_0x0336;
                case 24: goto L_0x031f;
                case 25: goto L_0x0792;
                case 26: goto L_0x030c;
                case 27: goto L_0x02b2;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x029b;
                case 31: goto L_0x0270;
                case 32: goto L_0x0254;
                case 33: goto L_0x0235;
                case 34: goto L_0x0214;
                case 35: goto L_0x01f3;
                case 36: goto L_0x01d8;
                case 37: goto L_0x0787;
                case 38: goto L_0x01bf;
                case 39: goto L_0x01a6;
                case 40: goto L_0x016b;
                case 41: goto L_0x0134;
                case 42: goto L_0x0118;
                case 43: goto L_0x00fc;
                case 44: goto L_0x00e0;
                case 45: goto L_0x00c4;
                case 46: goto L_0x0061;
                case 47: goto L_0x0055;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r12.A01
            com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView r1 = (com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView) r1
            java.lang.Object r0 = r12.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.X5D r4 = r1.A08
            r4.getClass()
            java.lang.String r3 = r0.getId()
            r0.getUsername()
            X.WJp r4 = (X.WJp) r4
            r0 = 1
            r4.A0A = r0
            com.instagram.common.session.UserSession r7 = r4.A0G
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            X.1a1 r2 = X.C46447Df9.A02()
            X.0iw r0 = r4.A0E
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "nametag_view_profile_button"
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r7, r3, r0, r1)
            android.os.Bundle r6 = r2.A01(r7, r0)
            android.app.Activity r5 = r4.A0C
            java.lang.String r9 = "profile"
            X.6W8 r4 = new X.6W8
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r0 = new int[]{r3, r2, r1, r0}
            r4.A0J = r0
            r4.A0C(r5)
            return
        L_0x0055:
            java.lang.Object r1 = r12.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r1
            java.lang.Object r0 = r12.A02
            X.3uh r0 = (X.C255773uh) r0
            r1.A0J(r0)
            return
        L_0x0061:
            r0 = 43603943(0x29957e7, float:2.2531783E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r12.A01
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            if (r10 == 0) goto L_0x00bf
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton"
            X.0qQ.A0C(r13, r0)
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r13 = (com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton) r13
            java.lang.Object r1 = r12.A02
            X.ToW r1 = (X.C14030ToW) r1
            com.instagram.common.session.UserSession r9 = r1.A04
            r0 = 2
            X.Uti r8 = new X.Uti
            r8.<init>(r0)
            X.WZW r7 = new X.WZW
            r7.<init>(r1)
            X.1Xj r6 = r1.A00
            java.lang.String r5 = r1.A08
            r4 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312488198997126(0x81020400030486, double:3.0275019834748786E-306)
            boolean r2 = X.182.A06(r2, r9, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r13.A08 = r10
            r13.A03 = r9
            r13.A07 = r8
            r13.A06 = r7
            r13.A04 = r6
            r13.A09 = r5
            r13.A0A = r4
            r13.A05 = r4
            r0 = 1
            r13.A0B = r0
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton.A03(r13)
            if (r2 == 0) goto L_0x00b5
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton.A02(r13)
        L_0x00b5:
            X.Wnb r2 = new X.Wnb
            r2.<init>(r13, r1)
            r0 = 1500(0x5dc, double:7.41E-321)
            r13.postDelayed(r2, r0)
        L_0x00bf:
            r0 = -1367814990(0xffffffffae78ccb2, float:-5.6570477E-11)
            goto L_0x046a
        L_0x00c4:
            r0 = 1280236267(0x4c4edaeb, float:5.4225836E7)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.Tot r3 = (X.C14049Tot) r3
            X.UwG r2 = X.C16512UwG.PHOTO
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.C14049Tot.A00(r0, r2, r3)
            r0 = -1493170244(0xffffffffa70007bc, float:-1.7767761E-15)
            goto L_0x079c
        L_0x00e0:
            r0 = 810843500(0x30547d6c, float:7.7303386E-10)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.Tot r3 = (X.C14049Tot) r3
            X.UwG r2 = X.C16512UwG.STORY_SHARE
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.C14049Tot.A00(r0, r2, r3)
            r0 = 1616325116(0x605729fc, float:6.20168E19)
            goto L_0x079c
        L_0x00fc:
            r0 = -930309358(0xffffffffc88c9b12, float:-287960.56)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.Tot r3 = (X.C14049Tot) r3
            X.UwG r2 = X.C16512UwG.TEXT
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.C14049Tot.A00(r0, r2, r3)
            r0 = -478409300(0xffffffffe37c0dac, float:-4.6495647E21)
            goto L_0x079c
        L_0x0118:
            r0 = -1107373042(0xffffffffbdfed40e, float:-0.1244279)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.Tot r3 = (X.C14049Tot) r3
            X.UwG r2 = X.C16512UwG.CLIP
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.C14049Tot.A00(r0, r2, r3)
            r0 = -168524858(0xfffffffff5f483c6, float:-6.199185E32)
            goto L_0x079c
        L_0x0134:
            r0 = 948398155(0x3887684b, float:6.456728E-5)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.W1B r2 = (X.W1B) r2
            r0 = 691(0x2b3, float:9.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r2, r0)
            X.W1B.A00(r2)
            com.instagram.common.session.UserSession r6 = r2.A00
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.lang.Object r4 = r12.A01
            android.os.Bundle r4 = (android.os.Bundle) r4
            X.E6c r3 = r2.A04
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r0 = 2114(0x842, float:2.962E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbV.A0Y(r2, r4, r6, r5, r0)
            X.DbT.A1M(r3, r0)
            r0 = 1744548911(0x67fbb42f, float:2.3772756E24)
            goto L_0x079c
        L_0x016b:
            r0 = 426763821(0x196fe62d, float:1.2402494E-23)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r12.A02
            X.W1B r6 = (X.W1B) r6
            java.lang.String r0 = "media_comment_audience_controls"
            X.W1B.A02(r6, r0)
            X.W1B.A00(r6)
            java.lang.Object r2 = r12.A01
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r0 = "com.instagram.settings.privacy.comments.allow_comments_from"
            X.DiU r5 = X.C46649DiU.A04(r0, r2)
            X.E6c r4 = r6.A04
            android.content.Context r3 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r6.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r0)
            r0 = 2131976114(0x7f135fb2, float:1.958934E38)
            java.lang.String r0 = r4.getString(r0)
            r2.A0U = r0
            r5.A0D(r3, r2)
            r0 = 1105703034(0x41e7b07a, float:28.96117)
            goto L_0x079c
        L_0x01a6:
            r0 = -639995668(0xffffffffd9da70ec, float:-7.685713E15)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.VgM r0 = (X.C17809VgM) r0
            X.X8f r2 = r0.A01
            java.lang.Object r0 = r12.A01
            X.3gp r0 = (X.C247733gp) r0
            r2.D8C(r0)
            r0 = 719846994(0x2ae7fe52, float:4.1210313E-13)
            goto L_0x079c
        L_0x01bf:
            r0 = 454074499(0x1b10a083, float:1.1963265E-22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.VgM r0 = (X.C17809VgM) r0
            X.X8f r2 = r0.A01
            java.lang.Object r0 = r12.A01
            X.3gp r0 = (X.C247733gp) r0
            r2.Cvp(r0)
            r0 = -1954942838(0xffffffff8b79f08a, float:-4.8136617E-32)
            goto L_0x079c
        L_0x01d8:
            r0 = 273732556(0x1050d3cc, float:4.118393E-29)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.UiV r0 = (X.C15786UiV) r0
            X.Kcx r2 = r0.A02
            java.lang.Object r0 = r12.A01
            X.UDw r0 = (X.C14894UDw) r0
            com.instagram.common.ui.base.IgEditText r0 = r0.A02
            r2.A0G(r0)
            r0 = 1162336500(0x4547d8f4, float:3197.5596)
            goto L_0x079c
        L_0x01f3:
            r0 = 1159125106(0x4516d872, float:2413.5278)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.UiV r0 = (X.C15786UiV) r0
            X.Kcx r5 = r0.A02
            java.lang.Object r0 = r12.A01
            X.UDw r0 = (X.C14894UDw) r0
            com.instagram.igds.components.button.IgdsButton r4 = r0.A03
            android.view.View r3 = r0.A00
            com.instagram.common.ui.base.IgEditText r2 = r0.A02
            com.instagram.igds.components.button.IgdsButton r0 = r0.A04
            r5.A0F(r4, r3, r2, r0)
            r0 = 1920450044(0x7277bdfc, float:4.9070384E30)
            goto L_0x079c
        L_0x0214:
            r0 = -2059313902(0xffffffff85415d12, float:-9.091911E-36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.UiV r0 = (X.C15786UiV) r0
            X.Kcx r5 = r0.A02
            java.lang.Object r0 = r12.A01
            X.UDw r0 = (X.C14894UDw) r0
            com.instagram.igds.components.button.IgdsButton r4 = r0.A03
            android.view.View r3 = r0.A00
            com.instagram.common.ui.base.IgEditText r2 = r0.A02
            com.instagram.igds.components.button.IgdsButton r0 = r0.A04
            r5.A0F(r4, r3, r2, r0)
            r0 = -1134871552(0xffffffffbc5b3c00, float:-0.013381004)
            goto L_0x079c
        L_0x0235:
            r0 = 828429409(0x3160d461, float:3.2717014E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A01
            X.X9V r1 = (X.X9V) r1
            if (r1 == 0) goto L_0x024f
            java.lang.Object r0 = r12.A02
            X.WSZ r0 = (X.WSZ) r0
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r0 = r0.getId()
            r1.Dw8(r0)
        L_0x024f:
            r0 = 254654477(0xf2db80d, float:8.5650054E-30)
            goto L_0x046a
        L_0x0254:
            r0 = 37110551(0x2364317, float:1.3390502E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A01
            X.X9V r2 = (X.X9V) r2
            if (r2 == 0) goto L_0x026b
            java.lang.Object r0 = r12.A02
            X.WSZ r0 = (X.WSZ) r0
            com.instagram.user.model.User r1 = r0.A01
            r0 = 0
            r2.DSL(r0, r1)
        L_0x026b:
            r0 = 1416865079(0x5473a537, float:4.18579559E12)
            goto L_0x046a
        L_0x0270:
            r0 = -1564722355(0xffffffffa2bc3b4d, float:-5.102029E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            X.WSZ r1 = (X.WSZ) r1
            java.lang.Integer r3 = r1.A00
            int r2 = r3.intValue()
            r1 = 1
            if (r2 == r1) goto L_0x0291
            r1 = 4
            if (r2 == r1) goto L_0x0291
            java.lang.String r1 = "Illegal participant role: "
            X.C13991Tnr.A1G(r3, r1)
        L_0x028c:
            r1 = 2080989412(0x7c0960e4, float:2.8532394E36)
            goto L_0x0783
        L_0x0291:
            java.lang.Object r1 = r12.A01
            X.X9V r1 = (X.X9V) r1
            if (r1 == 0) goto L_0x028c
            r1.DNI()
            goto L_0x028c
        L_0x029b:
            r0 = -2004303197(0xffffffff8888c2a3, float:-8.230961E-34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A01
            X.X8z r2 = (X.C21002X8z) r2
            java.lang.Object r0 = r12.A02
            X.GmF r0 = (X.C53329GmF) r0
            r2.Ct2(r0)
            r0 = 2088010380(0x7c74828c, float:5.078273E36)
            goto L_0x079c
        L_0x02b2:
            java.lang.Object r1 = r12.A01
            com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView r1 = (com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView) r1
            java.lang.Object r0 = r12.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.X5D r5 = r1.A08
            r5.getClass()
            java.lang.String r7 = r0.getId()
            java.lang.String r6 = r0.getUsername()
            X.WJp r5 = (X.WJp) r5
            r0 = 1
            r5.A08 = r0
            X.V3f r0 = r5.A02
            if (r0 == 0) goto L_0x0308
            X.VRL r0 = r0.A01
            if (r0 == 0) goto L_0x0308
            X.VM8 r4 = r5.A0D
            java.lang.String r3 = r0.A00
            r0 = 2
            X.0qQ.A0B(r3, r0)
            r0 = 4890(0x131a, float:6.852E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1Q9 r1 = X.1Q9.A01(r0)
            java.lang.String r0 = "ig_nametag_get_effect_deeplink_button_tapped"
            X.0xI r2 = r1.A04(r0)
            java.lang.String r0 = "user_id"
            r2.A0C(r0, r7)
            java.lang.String r0 = X.Dbe.A01()
            r2.A0C(r0, r6)
            r1 = 0
            java.lang.String r0 = "origin"
            r2.A0C(r0, r1)
            java.lang.String r0 = "effect_id"
            r2.A0C(r0, r3)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.DbU.A1R(r2, r0)
        L_0x0308:
            r5.A01()
            return
        L_0x030c:
            r0 = 731032125(0x2b92aa3d, float:1.0421175E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.3AB r0 = (X.AnonymousClass3AB) r0
            r0.Dcp()
            r0 = 1058319701(0x3f14ad55, float:0.58076984)
            goto L_0x079c
        L_0x031f:
            r0 = 661429820(0x276c9e3c, float:3.2837358E-15)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A01
            X.X81 r2 = (X.X81) r2
            java.lang.Object r0 = r12.A02
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            r2.D87(r0)
            r0 = 1457783158(0x56e40176, float:1.25347463E14)
            goto L_0x079c
        L_0x0336:
            r0 = -1109512807(0xffffffffbdde2d99, float:-0.10848541)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A01
            X.X81 r2 = (X.X81) r2
            java.lang.Object r0 = r12.A02
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            r2.Cu2(r0)
            r0 = 599648956(0x23bdeabc, float:2.0590835E-17)
            goto L_0x079c
        L_0x034d:
            r0 = 1003961805(0x3bd73dcd, float:0.0065686465)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            com.instagram.user.model.Product r1 = r0.A02()
            if (r1 == 0) goto L_0x0365
            java.lang.Object r0 = r12.A01
            X.X9a r0 = (X.C21003X9a) r0
            r0.DZo(r1)
        L_0x0365:
            r0 = 1809562286(0x6bdbbaae, float:5.3127265E26)
            goto L_0x046a
        L_0x036a:
            r0 = 728569109(0x2b6d1515, float:8.422857E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            com.instagram.user.model.Product r1 = r0.A02()
            if (r1 == 0) goto L_0x0382
            java.lang.Object r0 = r12.A01
            X.X9a r0 = (X.C21003X9a) r0
            r0.DZm(r1)
        L_0x0382:
            r0 = -758913516(0xffffffffd2c3e614, float:-4.20689347E11)
            goto L_0x046a
        L_0x0387:
            r0 = 1424320793(0x54e56919, float:7.8824861E12)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            com.instagram.user.model.Product r1 = r0.A02()
            if (r1 == 0) goto L_0x039f
            java.lang.Object r0 = r12.A01
            X.X9a r0 = (X.C21003X9a) r0
            r0.DZl(r1)
        L_0x039f:
            r0 = 953698862(0x38d84a2e, float:1.03135E-4)
            goto L_0x046a
        L_0x03a4:
            r0 = 816186681(0x30a60539, float:1.2079574E-9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.WSj r0 = (X.C19276WSj) r0
            X.VcX r0 = r0.A01
            X.0sL r3 = r0.A08
            java.lang.String r2 = "product"
            java.lang.String r0 = "relevant"
            r3.invoke(r2, r0)
            java.lang.Object r3 = r12.A01
            X.VX3 r3 = (X.VX3) r3
            com.instagram.igds.components.button.IgdsButton r2 = r3.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            com.instagram.igds.components.button.IgdsButton r2 = r3.A01
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r2.setAlpha(r0)
            r0 = -1187859542(0xffffffffb932b3aa, float:-1.7042333E-4)
            goto L_0x079c
        L_0x03d2:
            r0 = 2133676410(0x7f2d517a, float:2.303795E38)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.WSj r0 = (X.C19276WSj) r0
            X.VcX r0 = r0.A01
            X.0sL r3 = r0.A08
            java.lang.String r2 = "product"
            java.lang.String r0 = "irrelevant"
            r3.invoke(r2, r0)
            java.lang.Object r3 = r12.A01
            X.VX3 r3 = (X.VX3) r3
            com.instagram.igds.components.button.IgdsButton r2 = r3.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            com.instagram.igds.components.button.IgdsButton r2 = r3.A02
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r2.setAlpha(r0)
            r0 = 627836194(0x256c0522, float:2.0471476E-16)
            goto L_0x079c
        L_0x0400:
            r0 = -690710958(0xffffffffd6d49652, float:-1.16871043E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A01
            X.VZv r0 = (X.C17542VZv) r0
            X.Vj5 r0 = r0.A00
            if (r0 == 0) goto L_0x0412
            r0.A00()
        L_0x0412:
            java.lang.Object r0 = r12.A02
            X.WSj r0 = (X.C19276WSj) r0
            X.VcX r0 = r0.A01
            X.0sP r0 = r0.A06
            X.0qQ.A0A(r13)
            r0.invoke(r13)
            r0 = -1266545908(0xffffffffb4820b0c, float:-2.4222425E-7)
            goto L_0x046a
        L_0x0424:
            r0 = 1079832673(0x405cf061, float:3.4521716)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A01
            X.VZt r0 = (X.C17540VZt) r0
            X.Vj5 r0 = r0.A00
            if (r0 == 0) goto L_0x0436
            r0.A00()
        L_0x0436:
            java.lang.Object r0 = r12.A02
            X.WSP r0 = (X.WSP) r0
            X.VX1 r0 = r0.A01
            X.0sP r0 = r0.A02
            X.0qQ.A0A(r13)
            r0.invoke(r13)
            r0 = -1318767408(0xffffffffb16534d0, float:-3.3353906E-9)
            goto L_0x046a
        L_0x0448:
            r0 = -314565548(0xffffffffed401c54, float:-3.7159605E27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.4dH r2 = (X.C268374dH) r2
            boolean r0 = r2 instanceof X.C268364dG
            if (r0 == 0) goto L_0x046e
            r0 = r2
            X.4dG r0 = (X.C268364dG) r0
            X.UxV r1 = r0.A02
            X.UxV r0 = X.C16576UxV.RECONSIDERATION_PRODUCTS
            if (r1 != r0) goto L_0x046e
            java.lang.Object r0 = r12.A01
            X.2ql r0 = (X.C231032ql) r0
            r0.DzN(r2)
        L_0x0467:
            r0 = -1608062929(0xffffffffa026e82f, float:-1.413757E-19)
        L_0x046a:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x046e:
            java.lang.Object r1 = r12.A01
            X.2ql r1 = (X.C231032ql) r1
            X.X9B r0 = r2.Aif()
            if (r0 == 0) goto L_0x0482
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0482
            r1.DzI(r2, r0)
            goto L_0x0467
        L_0x0482:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 1204358199(0x47c90c37, float:102936.43)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r2
        L_0x048d:
            r0 = -448769616(0xffffffffe54051b0, float:-5.6762577E22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.X7y r2 = (X.C20983X7y) r2
            java.lang.Object r0 = r12.A01
            X.V3k r0 = (X.C16727V3k) r0
            com.instagram.user.model.User r0 = r0.A00
            X.0qQ.A07(r0)
            r2.D6L(r0)
            r0 = 873701984(0x3413a260, float:1.3749514E-7)
            goto L_0x079c
        L_0x04a9:
            r0 = 962740806(0x39624246, float:2.1577728E-4)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.UeL r0 = (X.C15532UeL) r0
            X.X7y r2 = r0.A00
            java.lang.Object r0 = r12.A01
            X.V3k r0 = (X.C16727V3k) r0
            com.instagram.user.model.User r0 = r0.A00
            X.0qQ.A07(r0)
            r2.D6L(r0)
            r0 = 48550728(0x2e4d348, float:3.3622858E-37)
            goto L_0x079c
        L_0x04c7:
            r0 = 1855742721(0x6e9c6301, float:2.4199675E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r2 = r1.A02()
            if (r2 == 0) goto L_0x04df
            java.lang.Object r1 = r12.A01
            X.X9a r1 = (X.C21003X9a) r1
            r1.DZo(r2)
        L_0x04df:
            r1 = 390189129(0x1741d049, float:6.2624556E-25)
            goto L_0x0783
        L_0x04e4:
            r0 = -616705687(0xffffffffdb3dd169, float:-5.342902E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r2 = r1.A02()
            if (r2 == 0) goto L_0x04fc
            java.lang.Object r1 = r12.A01
            X.X9a r1 = (X.C21003X9a) r1
            r1.DZm(r2)
        L_0x04fc:
            r1 = 410793397(0x187c35b5, float:3.2597352E-24)
            goto L_0x0783
        L_0x0501:
            r0 = -2060652769(0xffffffff852cef1f, float:-8.131321E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r2 = r1.A02()
            if (r2 == 0) goto L_0x0519
            java.lang.Object r1 = r12.A01
            X.X9a r1 = (X.C21003X9a) r1
            r1.DZl(r2)
        L_0x0519:
            r1 = 1463230987(0x5737220b, float:2.01356841E14)
            goto L_0x0783
        L_0x051e:
            r0 = 223358299(0xd502d5b, float:6.4149543E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A01
            X.X9a r2 = (X.C21003X9a) r2
            java.lang.Object r0 = r12.A02
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.getId()
            r2.DZn(r0)
            r0 = -1862536604(0xffffffff90fbf264, float:-9.9375505E-29)
            goto L_0x079c
        L_0x0539:
            r0 = 1418578475(0x548dca2b, float:4.8718576E12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.VYd r0 = (X.C17500VYd) r0
            X.Uqw r2 = r0.A03
            java.lang.Object r0 = r12.A01
            X.UrR r0 = (X.C16264UrR) r0
            java.lang.String r6 = r0.A02
            X.0qQ.A07(r6)
            java.lang.String r7 = r0.A03
            java.lang.Integer r5 = r0.A02
            X.UXi r4 = r0.A01
            r3 = 0
            r2.A00(r3, r4, r5, r6, r7)
            r0 = 912285485(0x36605f2d, float:3.3434E-6)
            goto L_0x079c
        L_0x055e:
            r0 = 17547526(0x10bc106, float:2.5668755E-38)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r12.A02
            X.VYd r0 = (X.C17500VYd) r0
            X.Uqw r2 = r0.A03
            java.lang.Object r0 = r12.A01
            X.UrR r0 = (X.C16264UrR) r0
            java.lang.String r6 = r0.A02
            X.0qQ.A07(r6)
            java.lang.String r7 = r0.A03
            java.lang.Integer r5 = r0.A02
            X.1XO r3 = r0.A00
            r4 = 0
            r2.A00(r3, r4, r5, r6, r7)
            r0 = -189377901(0xfffffffff4b65293, float:-1.1556065E32)
            goto L_0x079c
        L_0x0583:
            r0 = -693956837(0xffffffffd6a30f1b, float:-8.9642636E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.3kF r2 = X.C249713kF.A00
            java.lang.Object r1 = r12.A02
            X.Uaj r1 = (X.C15334Uaj) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r1 = r1.A0G
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = X.AnonymousClass7TF.A0b()
            X.EWE r1 = X.EWE.STORE_FRONT_MENU_MANAGE_PRODUCTS
            java.lang.String r6 = r1.toString()
            java.lang.Object r1 = r12.A01
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r8 = r1.A0H
            if (r8 != 0) goto L_0x05ae
            java.lang.String r8 = ""
        L_0x05ae:
            r7 = 0
            r9 = 0
            r10 = r9
            r11 = r9
            r2.A1D(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1600669796(0xffffffffa097b79c, float:-2.5701897E-19)
            goto L_0x0783
        L_0x05ba:
            r0 = 31127709(0x1daf89d, float:8.0437295E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.3kF r2 = X.C249713kF.A00
            java.lang.Object r1 = r12.A02
            X.Uaj r1 = (X.C15334Uaj) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r1 = r1.A0G
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = X.AnonymousClass7TF.A0b()
            X.EWE r1 = X.EWE.PRODUCT_DETAILS_PAGE
            java.lang.String r6 = r1.toString()
            java.lang.Object r1 = r12.A01
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r8 = r1.A0H
            if (r8 != 0) goto L_0x05e5
            java.lang.String r8 = ""
        L_0x05e5:
            r7 = 0
            r9 = 0
            r10 = 1
            r11 = r9
            r2.A1D(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 243503178(0xe83904a, float:3.243294E-30)
            goto L_0x0783
        L_0x05f1:
            r0 = -1590473522(0xffffffffa1334cce, float:-6.074921E-19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.VtB r2 = (X.C18512VtB) r2
            java.lang.Object r0 = r12.A01
            X.UxW r0 = (X.C16577UxW) r0
            X.C18512VtB.A00(r0, r2)
            r0 = 88985718(0x54dd076, float:9.677342E-36)
            goto L_0x079c
        L_0x0608:
            r0 = 1616171564(0x6054d22c, float:6.1341472E19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.VtB r2 = (X.C18512VtB) r2
            java.lang.Object r0 = r12.A01
            X.UxW r0 = (X.C16577UxW) r0
            X.C18512VtB.A00(r0, r2)
            r0 = -1521911589(0xffffffffa54978db, float:-1.7474918E-16)
            goto L_0x079c
        L_0x061f:
            r0 = 1125052511(0x430ef05f, float:142.93895)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.3kF r4 = X.C249713kF.A00
            java.lang.Object r0 = r12.A02
            X.VwI r0 = (X.C18661VwI) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            androidx.fragment.app.Fragment r0 = r0.A02
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            java.lang.Object r0 = r12.A01
            com.instagram.model.shopping.productfeed.ProductTile r0 = (com.instagram.model.shopping.productfeed.ProductTile) r0
            com.instagram.user.model.Product r0 = r0.A07
            if (r0 == 0) goto L_0x0648
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x0648
            r4.A17(r2, r3, r0)
            r0 = -1271621535(0xffffffffb4349861, float:-1.6819241E-7)
            goto L_0x079c
        L_0x0648:
            java.lang.String r0 = "tile product debugInfo must not be null"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            r0 = 407315358(0x1847239e, float:2.573813E-24)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0656:
            r0 = -1635939392(0xffffffff9e7d8bc0, float:-1.3422608E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.VwI r3 = (X.C18661VwI) r3
            androidx.fragment.app.Fragment r1 = r3.A02
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1 = 2131969822(0x7f13471e, float:1.9576578E38)
            r7 = 0
            X.C59689JTv.A07(r2, r1)
            X.2qt r2 = r3.A07
            java.lang.Object r3 = r12.A01
            com.instagram.model.shopping.productfeed.ProductTile r3 = (com.instagram.model.shopping.productfeed.ProductTile) r3
            X.1Xj r1 = r3.A05
            if (r1 == 0) goto L_0x06b4
            java.lang.String r6 = r2.A0D
            if (r6 == 0) goto L_0x06b4
            X.0wc r2 = r2.A01
            com.instagram.user.model.Product r5 = r3.A07
            if (r5 == 0) goto L_0x06b9
            java.lang.String r4 = r1.getId()
            X.0qQ.A0B(r2, r7)
            com.instagram.user.model.User r1 = r5.A0B
            if (r1 == 0) goto L_0x06b4
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r1)
            if (r3 == 0) goto L_0x06b4
            if (r4 == 0) goto L_0x06b4
            java.lang.String r1 = "instagram_shopping_product_report_thumbnail_relevancy"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x06b4
            java.lang.String r1 = r5.A0H
            X.C13991Tnr.A17(r2, r1)
            X.C13988Tno.A1A(r2, r3)
            java.lang.String r1 = "displayed_m_pk"
            r2.AAJ(r1, r4)
            X.C13988Tno.A1D(r2, r6)
            r2.Cgf()
        L_0x06b4:
            r1 = 1912169577(0x71f96469, float:2.469861E30)
            goto L_0x0783
        L_0x06b9:
            java.lang.String r0 = "product expected"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x06c1:
            r0 = 407094141(0x1843c37d, float:2.5301856E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.Object r6 = r12.A02
            X.Ubt r6 = (X.C15390Ubt) r6
            X.UdS r1 = r6.A02
            java.lang.String r11 = "adapter"
            r7 = 0
            if (r1 == 0) goto L_0x0762
            X.V3W r1 = r1.A03
            java.lang.String r1 = r1.A01
            java.lang.String r10 = "catalog_id"
            r8.put(r10, r1)
            android.os.Bundle r3 = r6.requireArguments()
            java.lang.String r2 = "waterfall_id"
            java.lang.String r1 = r3.getString(r2)
            r8.put(r2, r1)
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = r3.getString(r2)
            r8.put(r2, r1)
            java.lang.String r1 = "prior_module_name"
            java.lang.String r2 = r3.getString(r1)
            java.lang.String r1 = "prior_module"
            r8.put(r1, r2)
            X.UdS r1 = r6.A02
            if (r1 == 0) goto L_0x0762
            X.V3W r1 = r1.A03
            java.lang.String r1 = r1.A01
            r8.put(r10, r1)
            java.lang.String r2 = "presentation_style"
            java.lang.String r1 = r3.getString(r2)
            r8.put(r2, r1)
            X.0eM r9 = r6.A0K
            X.0lg r1 = X.DbT.A0X(r9)
            X.2nI r5 = X.C229382nI.A03(r6, r1, r7)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r6.A01
            if (r2 == 0) goto L_0x0728
            r1 = 0
            r2.setPrimaryButtonEnabled(r1)
        L_0x0728:
            X.W35 r4 = r6.A03
            java.lang.String r3 = "logger"
            if (r4 == 0) goto L_0x076a
            X.UdS r1 = r6.A02
            if (r1 == 0) goto L_0x0762
            X.V3W r1 = r1.A03
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "onboarding_navigation_button_clicked"
            X.0xI r1 = X.W35.A00(r4, r1)
            r1.A0C(r10, r2)
            X.W35.A05(r1, r4)
            X.W35 r4 = r6.A03
            if (r4 == 0) goto L_0x076a
            java.lang.String r1 = "onboarding_navigation_request_started"
            X.0xI r3 = X.W35.A00(r4, r1)
            java.lang.Long r2 = X.C51968G9o.A0u()
            java.lang.String r1 = "network_start_time"
            r3.A0B(r1, r2)
            X.W35.A05(r3, r4)
            X.0lg r2 = X.DbT.A0X(r9)
            java.lang.String r1 = r6.A07
            if (r1 != 0) goto L_0x076e
            java.lang.String r11 = "inAppSignUpFlowBottomButtonRoute"
        L_0x0762:
            X.0qQ.A0F(r11)
        L_0x0765:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x076a:
            X.0qQ.A0F(r3)
            goto L_0x0765
        L_0x076e:
            X.8ey r4 = X.C359988do.A02(r7, r2, r1, r8)
            java.lang.Object r3 = r12.A01
            r2 = 1
            X.UcM r1 = new X.UcM
            r1.<init>(r2, r3, r5, r6)
            r4.A00(r1)
            r6.schedule(r4)
            r1 = -551221933(0xffffffffdf250553, float:-1.1891002E19)
        L_0x0783:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0787:
            r0 = 1448509455(0x5656800f, float:5.8961374E13)
            int r1 = X.AnonymousClass0fD.A05(r0)
            r0 = -114725101(0xfffffffff9296f13, float:-5.498444E34)
            goto L_0x079c
        L_0x0792:
            r0 = 1011256697(0x3c468d79, float:0.012118691)
            int r1 = X.AnonymousClass0fD.A05(r0)
            r0 = 1600543784(0x5f665c28, float:1.6599186E19)
        L_0x079c:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBE.onClick(android.view.View):void");
    }

    public WBE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
