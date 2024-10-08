package X;

import android.view.View;

public final class FO6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FO6(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0238: MOVE  (r1v54 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v53 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0611;
                case 1: goto L_0x05cf;
                case 2: goto L_0x0590;
                case 3: goto L_0x0547;
                case 4: goto L_0x050c;
                case 5: goto L_0x04c8;
                case 6: goto L_0x0465;
                case 7: goto L_0x043f;
                case 8: goto L_0x037a;
                case 9: goto L_0x035b;
                case 10: goto L_0x0312;
                case 11: goto L_0x02f9;
                case 12: goto L_0x0288;
                case 13: goto L_0x0223;
                case 14: goto L_0x03bc;
                case 15: goto L_0x01cc;
                case 16: goto L_0x0197;
                case 17: goto L_0x016c;
                case 18: goto L_0x013b;
                case 19: goto L_0x00c7;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -2092361869(0xffffffff83491773, float:-5.909551E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r13.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.FAV r7 = new X.FAV
            r7.<init>(r1, r0, r3)
            java.lang.Object r8 = r13.A03
            X.9m3 r8 = (X.C387339m3) r8
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r8.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003e
            com.instagram.user.model.User r1 = X.DbT.A0k(r3)
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((com.instagram.user.model.User) r1)
            r4.add(r0)
            goto L_0x002b
        L_0x003e:
            X.2Dm r5 = r7.A04
            java.util.ArrayList r0 = X.FFJ.A01(r4)
            X.3U9 r0 = r5.B35(r0)
            if (r0 != 0) goto L_0x006f
            com.instagram.common.session.UserSession r6 = r7.A02
            java.lang.String r3 = X.DbV.A0s()
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r8.A00
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = ""
        L_0x0058:
            java.lang.String r1 = X.FAV.A00(r0, r4)
            java.util.ArrayList r0 = X.FFJ.A02(r4)
            X.1OC r3 = com.instagram.direct.request.DirectThreadApi.A0D(r6, r3, r1, r0)
            r1 = 6
            X.Dwh r0 = new X.Dwh
            r0.<init>(r6, r7, r1)
            r3.A00 = r0
            X.1ES.A03(r3)
        L_0x006f:
            X.Mi7 r1 = r7.A03
            r0 = 0
            r1.A09 = r4
            r1.A08 = r0
            java.util.ArrayList r0 = X.FFJ.A01(r4)
            X.3U9 r0 = r5.B35(r0)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.C6C()
            if (r0 == 0) goto L_0x00bd
            X.3t0 r8 = new X.3t0
            r8.<init>(r0)
        L_0x008b:
            java.lang.String r0 = ""
            java.lang.String r6 = X.FAV.A00(r0, r4)
            android.app.Activity r5 = r7.A00
            com.instagram.common.session.UserSession r4 = r7.A02
            androidx.fragment.app.Fragment r3 = r7.A01
            r0 = 3
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r3, r0)
            r1 = r3
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r0 = "inbox_new_message"
            X.1pE r1 = X.1pE.A01(r5, r1, r4, r0)
            r1.A0B = r8
            r0 = 1
            r1.A0q = r0
            r1.A01 = r3
            r1.A0v = r0
            r1.A0j = r6
            r0 = 9
            X.C50399Fb7.A00(r1, r7, r0)
            r0 = -1250151441(0xffffffffb57c33ef, float:-9.395289E-7)
            goto L_0x060d
        L_0x00bd:
            java.util.ArrayList r0 = X.FFJ.A01(r4)
            X.5gg r8 = new X.5gg
            r8.<init>(r0)
            goto L_0x008b
        L_0x00c7:
            r0 = 399795402(0x17d464ca, float:1.3725622E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r13.A02
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r13.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r11 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r11
            com.instagram.common.session.UserSession r0 = r11.A01
            X.Dg1 r9 = new X.Dg1
            r9.<init>(r10, r0)
            com.instagram.common.session.UserSession r4 = r11.A01
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36888696716329775(0x830e130001032f, double:3.391898570041512E-306)
            java.lang.String r1 = X.182.A04(r3, r4, r0)
            java.lang.String r0 = ","
            java.lang.String[] r12 = r1.split(r0)
            int r8 = r12.length
            r7 = 0
        L_0x00f4:
            if (r7 >= r8) goto L_0x012e
            r0 = r12[r7]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r3 = r0.longValue()
            r5 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            android.content.res.Resources r6 = X.DbV.A05(r11)
            if (r0 != 0) goto L_0x011e
            r0 = 2131963244(0x7f132d6c, float:1.9563236E38)
            java.lang.String r5 = r6.getString(r0)
        L_0x0112:
            r1 = 1
            X.FNG r0 = new X.FNG
            r0.<init>(r13, r3, r1)
            r9.A0C(r5, r0)
            int r7 = r7 + 1
            goto L_0x00f4
        L_0x011e:
            r5 = 2131963245(0x7f132d6d, float:1.9563238E38)
            r0 = 60
            long r0 = r3 / r0
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r5 = X.AnonymousClass7TF.A0e(r6, r0, r5)
            goto L_0x0112
        L_0x012e:
            X.FFy r0 = new X.FFy
            r0.<init>(r9)
            r0.A05(r10)
            r0 = 1409324413(0x5400957d, float:2.20905524E12)
            goto L_0x060d
        L_0x013b:
            r0 = -920628430(0xffffffffc9205332, float:-656691.1)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r13.A03
            X.EWJ r1 = (X.EWJ) r1
            long r3 = X.Dba.A01(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0R
            X.Dbb.A1P(r5, r1, r0, r3)
            java.lang.Object r0 = r13.A01
            X.7Pr r0 = (X.C331127Pr) r0
            X.7Pu r3 = r0.A00()
            java.lang.Object r1 = r13.A02
            android.content.Context r1 = (android.content.Context) r1
            X.ERd r0 = new X.ERd
            r0.<init>()
            r3.A03(r1, r0)
            r0 = -1614510697(0xffffffff9fc48597, float:-8.3230235E-20)
            goto L_0x060d
        L_0x016c:
            r0 = 1677726852(0x64001484, float:9.450646E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r4 = r13.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r13.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.String r0 = "message_button"
            X.1pE r1 = X.1pE.A01(r1, r3, r4, r0)
            java.lang.Object r0 = r13.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.Dbc.A0x(r1, r0)
            r1.A06()
            X.F8H.A00(r3, r4, r0)
            r0 = -1500795479(0xffffffffa68bada9, float:-9.692133E-16)
            goto L_0x060d
        L_0x0197:
            r0 = -1463775179(0xffffffffa8c09035, float:-2.1378822E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.EEF r0 = (X.EEF) r0
            X.0iw r3 = r0.A03
            com.instagram.common.session.UserSession r1 = r0.A04
            X.6cm r0 = new X.6cm
            r0.<init>(r3, r1)
            X.0wc r1 = r0.A02
            r0 = 3353(0xd19, float:4.699E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dba.A1I(r1, r0)
            java.lang.Object r4 = r13.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r13.A02
            X.F0n r3 = (X.C49656F0n) r3
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r3.A03
            java.lang.Object r0 = r13.A03
            X.F2L r0 = (X.F2L) r0
            X.FRQ.A00(r4, r1, r3, r0)
            r0 = -1916988357(0xffffffff8dbd143b, float:-1.1652895E-30)
            goto L_0x060d
        L_0x01cc:
            r0 = 1458523780(0x56ef4e84, float:1.31560251E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r13.A01
            android.content.Context r7 = (android.content.Context) r7
            X.0qQ.A0A(r7)
            java.lang.Object r6 = r13.A03
            com.instagram.model.fbusertag.FBUserTag r6 = (com.instagram.model.fbusertag.FBUserTag) r6
            java.lang.Object r5 = r13.A02
            X.G7m r5 = (X.C51918G7m) r5
            java.lang.Object r4 = r13.A04
            X.0lg r4 = (X.0lg) r4
            androidx.fragment.app.FragmentActivity r8 = r5.B7r()
            X.FEf r0 = X.C49907FEf.A00
            boolean r0 = r0.A01(r7)
            if (r0 != 0) goto L_0x0219
            if (r8 == 0) goto L_0x0219
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325420345471947(0x810dc7000233cb, double:3.0356803249791296E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0219
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r6.A02
            java.lang.String r3 = r0.A02
            r1 = 18
            X.Wvv r0 = new X.Wvv
            r0.<init>(r1, r7, r6)
            X.C48917EmH.A00(r8, r4, r3, r0)
        L_0x0211:
            r5.DDy(r6)
            r0 = 805656759(0x300558b7, float:4.851119E-10)
            goto L_0x060d
        L_0x0219:
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r6.A02
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A04
            X.C49907FEf.A00(r7, r1, r0)
            goto L_0x0211
        L_0x0223:
            r0 = 2085596295(0x7c4fac87, float:4.313219E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r3 = r0.requireContext()
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0283
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0283
            X.7Pu r5 = r1.A02
            if (r5 == 0) goto L_0x0283
            java.lang.Object r0 = r13.A04
            X.0lg r0 = (X.0lg) r0
            X.7Pr r4 = X.DbS.A0W(r0)
            r0 = 2131972428(0x7f13514c, float:1.9581863E38)
            X.DbZ.A0z(r3, r4, r0)
            r7 = 0
            r10 = 0
            java.lang.String r9 = ""
            X.7Ps r6 = new X.7Ps
            r8 = r7
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 2131238082(0x7f081cc2, float:1.8092433E38)
            r6.A02 = r0
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131953555(0x7f130793, float:1.9543584E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r6.A07 = r0
            java.lang.Object r3 = r13.A01
            r1 = 22
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r3, (int) r1)
            r6.A05 = r0
            X.7Pt r0 = r6.A00()
            r4.A0Q = r0
            java.lang.Object r0 = r13.A03
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r5.A0F(r0, r4)
        L_0x0283:
            r0 = 317276593(0x12e941b1, float:1.4720561E-27)
            goto L_0x060d
        L_0x0288:
            r0 = -242913283(0xfffffffff1856ffd, float:-1.3215005E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.6pK r0 = (X.C318666pK) r0
            int r0 = r0.ordinal()
            java.lang.String r4 = "cta"
            switch(r0) {
                case 0: goto L_0x02a1;
                case 1: goto L_0x02ad;
                case 2: goto L_0x02b9;
                case 3: goto L_0x029c;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02d5;
                case 6: goto L_0x02e1;
                case 7: goto L_0x02ed;
                default: goto L_0x029c;
            }
        L_0x029c:
            r0 = -1839883783(0xffffffff925599f9, float:-6.7400735E-28)
            goto L_0x060d
        L_0x02a1:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzQ(r0, r4)
            goto L_0x029c
        L_0x02ad:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzR(r0, r4)
            goto L_0x029c
        L_0x02b9:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzO(r0, r4)
            goto L_0x029c
        L_0x02c5:
            java.lang.Object r3 = r13.A03
            X.6rM r3 = (X.C319866rM) r3
            java.lang.Object r1 = r13.A04
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r13.A02
            android.content.Context r0 = (android.content.Context) r0
            r3.CzN(r0, r1, r4)
            goto L_0x029c
        L_0x02d5:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzK(r0, r4)
            goto L_0x029c
        L_0x02e1:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.Czd(r0, r4)
            goto L_0x029c
        L_0x02ed:
            java.lang.Object r1 = r13.A03
            X.6rM r1 = (X.C319866rM) r1
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CzX(r0, r4)
            goto L_0x029c
        L_0x02f9:
            java.lang.Object r4 = r13.A01
            X.G9f r4 = (X.C51959G9f) r4
            java.lang.Object r3 = r13.A02
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            java.lang.Object r2 = r13.A03
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            java.lang.Object r1 = r13.A04
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r1
            X.Fke r0 = new X.Fke
            r0.<init>(r2, r1)
            r4.D2x(r3, r0)
            return
        L_0x0312:
            r0 = 2071192054(0x7b73e1f6, float:1.2663112E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A04
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r1 = (com.instagram.igds.components.peoplecell.IgdsPeopleCell) r1
            java.lang.String r0 = r1.A01
            X.32A r5 = r1.A00
            if (r5 == 0) goto L_0x0356
            if (r0 == 0) goto L_0x0356
            r5.A0C = r0
            android.content.Context r4 = r1.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r4, r0)
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r8 = r13.A01
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r8
            android.graphics.RectF r3 = r8.getAvatarBounds()
            r0 = 5
            X.FkY r1 = new X.FkY
            r1.<init>(r0)
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r4, (android.graphics.RectF) r3, (X.C230222pE) r1)
            r5.A05 = r0
            java.lang.Object r6 = r13.A02
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6
            java.lang.Object r9 = r13.A03
            java.util.List r9 = (java.util.List) r9
            X.3BQ r7 = X.AnonymousClass3BQ.UNKNOWN
            r10 = r9
            r11 = r9
            r5.A09(r6, r7, r8, r9, r10, r11)
        L_0x0356:
            r0 = -1313173505(0xffffffffb1ba8fff, float:-5.429683E-9)
            goto L_0x060d
        L_0x035b:
            r0 = -1728625332(0xffffffff98f7454c, float:-6.3917975E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A02
            X.G5m r4 = (X.C51875G5m) r4
            java.lang.Object r3 = r13.A04
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            java.lang.Object r1 = r13.A03
            X.Fkg r1 = (X.C50901Fkg) r1
            java.lang.Object r0 = r13.A01
            java.util.List r0 = (java.util.List) r0
            r4.DcR(r1, r3, r0)
            r0 = -1792546137(0xffffffff9527eaa7, float:-3.391049E-26)
            goto L_0x060d
        L_0x037a:
            r0 = -1621271693(0xffffffff9f5d5b73, float:-4.6874215E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r13.A04
            X.0lg r5 = (X.0lg) r5
            java.lang.String r0 = "Required value was null."
            if (r5 == 0) goto L_0x03b1
            r0 = 35
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r7 = X.SQU.A02(r3, r0)
            X.0qQ.A07(r7)
            r0 = 2131975072(0x7f135ba0, float:1.9587226E38)
            java.lang.String r8 = r3.getString(r0)
            java.lang.Object r4 = r13.A03
            X.0iw r4 = (X.AnonymousClass0iw) r4
            java.lang.Object r6 = r13.A02
            X.G5l r6 = (X.C51874G5l) r6
            X.FFM.A02(r3, r4, r5, r6, r7, r8)
            r0 = -1353994865(0xffffffffaf4bad8f, float:-1.8524403E-10)
            goto L_0x060d
        L_0x03b1:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -546787226(0xffffffffdf68b066, float:-1.6767014E19)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x03bc:
            r0 = -39811594(0xfffffffffda085f6, float:-2.6671506E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A04
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r0.getId()
            java.lang.Object r3 = r13.A02
            X.E5e r3 = (X.C47499E5e) r3
            X.E6J r2 = new X.E6J
            r2.<init>()
            java.lang.String r6 = r0.getUsername()
            java.lang.String r5 = r0.getId()
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent r1 = new com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent
            r1.<init>(r0, r6, r5)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "content"
            r5.putParcelable(r0, r1)
            java.lang.String r1 = r3.A06
            if (r1 != 0) goto L_0x03fb
            java.lang.String r0 = "baseReelId"
        L_0x03f3:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x03fb:
            r0 = 154(0x9a, float:2.16E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A07
            if (r1 != 0) goto L_0x040b
            java.lang.String r0 = "baseReelItemId"
            goto L_0x03f3
        L_0x040b:
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putString(r0, r1)
            com.instagram.user.model.User r1 = r3.A05
            if (r1 != 0) goto L_0x041b
            java.lang.String r0 = "baseReelOwner"
            goto L_0x03f3
        L_0x041b:
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putParcelable(r0, r1)
            r2.setArguments(r5)
            X.37D r0 = X.DbX.A0i(r3)
            X.7Pu r1 = X.C48943Emh.A00(r0)
            X.0eM r0 = r3.A0D
            X.7Pr r0 = X.DbX.A0f(r0)
            if (r1 == 0) goto L_0x043a
            r1.A0F(r2, r0)
        L_0x043a:
            r0 = -599898492(0xffffffffdc3e4684, float:-2.14231113E17)
            goto L_0x0632
        L_0x043f:
            r0 = 1705663512(0x65aa5c18, float:1.0056264E23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A04
            X.Dnt r1 = (X.C46939Dnt) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.F1k r3 = r1.A00
            java.lang.Object r2 = r13.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.Object r1 = r13.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r0.requireActivity()
            r3.A00(r1, r2)
            r0 = 735196167(0x2bd23407, float:1.4935838E-12)
            goto L_0x0632
        L_0x0465:
            r0 = 999934486(0x3b99ca16, float:0.00469328)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r13.A02
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r6 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r6
            java.lang.Object r7 = r13.A04
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.lang.Object r5 = r13.A03
            X.4os r5 = (X.C274674os) r5
            X.W3Q r4 = X.Dba.A0F(r6)
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = r6.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r6.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_order"
            X.DbZ.A1a(r1, r4, r3, r0)
            java.lang.String r5 = r5.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x04c3
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.4Cl r0 = r7.A03
            com.instagram.api.schemas.SMBPartnerType r1 = r0.AyL()
            r0 = 0
            boolean r0 = X.C324066yY.A04(r3, r0, r1, r5)
            if (r0 != 0) goto L_0x04c3
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            com.instagram.common.session.UserSession r3 = r6.A07()
            X.2EG r0 = X.2EG.A3U
            X.SUL r1 = new X.SUL
            r1.<init>(r4, r3, r0, r5)
            com.instagram.common.session.UserSession r0 = r6.A07()
            java.lang.String r0 = r0.A06
            r1.A0E(r0)
            r0 = 2288(0x8f0, float:3.206E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A0S = r0
            r1.A0A()
        L_0x04c3:
            r0 = 539550609(0x2028e391, float:1.4305449E-19)
            goto L_0x060d
        L_0x04c8:
            java.lang.Object r7 = r13.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r6 = r13.A03
            X.Gn4 r6 = (X.C53374Gn4) r6
            java.lang.Object r5 = r13.A04
            X.MVT r5 = (X.MVT) r5
            r0 = 0
            boolean r0 = X.C53374Gn4.A00(r0, r6)
            if (r0 == 0) goto L_0x0610
            X.1Av r1 = X.1Au.A00(r7)
            java.lang.String r0 = "contacts_in_sharesheet_access_map"
            java.util.HashMap r4 = X.1Av.A02(r1, r0)
            java.lang.String r3 = X.AnonymousClass7TF.A0h(r6)
            r1 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            java.lang.Object r0 = r4.getOrDefault(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x04fb
            double r1 = r0.doubleValue()
        L_0x04fb:
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            X.Dbc.A0v(r7, r0, r3, r4)
            X.FbQ r5 = (X.C50417FbQ) r5
            X.EIn r0 = r5.A00
            X.G9Z r0 = r0.A0B
            r0.DWu(r6)
            return
        L_0x050c:
            r0 = -1560405343(0xffffffffa2fe1aa1, float:-6.8875032E-18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.37E r0 = X.AnonymousClass37D.A00
            java.lang.Object r6 = r13.A01
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            X.DbX.A10(r6, r0)
            java.lang.Object r5 = r13.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r13.A03
            X.2Er r4 = (X.2Er) r4
            java.lang.Object r3 = r13.A02
            X.0iw r3 = (X.AnonymousClass0iw) r3
            X.1Yi r1 = X.C48732EjH.A00()
            r0 = 32
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.A01(r6, r5, r0)
            java.lang.String r1 = r4.C6C()
            r0 = 1165(0x48d, float:1.633E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C48805EkT.A00(r3, r5, r0, r1)
            r0 = 179461347(0xab25ce3, float:1.7175717E-32)
            goto L_0x060d
        L_0x0547:
            r0 = -1803543175(0xffffffff94801d79, float:-1.2936322E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r13.A04
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r6 = r13.A01
            X.Gn4 r6 = (X.C53374Gn4) r6
            java.lang.Object r5 = r13.A03
            X.G4t r5 = (X.G4t) r5
            r0 = 0
            boolean r0 = X.C53374Gn4.A00(r0, r6)
            if (r0 == 0) goto L_0x058c
            X.1Av r1 = X.1Au.A00(r7)
            java.lang.String r0 = "contacts_in_sharesheet_access_map"
            java.util.HashMap r4 = X.1Av.A02(r1, r0)
            java.lang.String r3 = X.AnonymousClass7TF.A0h(r6)
            java.lang.Object r0 = r4.get(r3)
            if (r0 != 0) goto L_0x057e
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.put(r3, r0)
        L_0x057e:
            java.lang.Number r0 = (java.lang.Number) r0
            X.Dbc.A0v(r7, r0, r3, r4)
            X.Faz r5 = (X.C50396Faz) r5
            X.EIn r0 = r5.A00
            X.G9Z r0 = r0.A0B
            r0.DWu(r6)
        L_0x058c:
            r0 = -1715970202(0xffffffff99b85f66, float:-1.9063685E-23)
            goto L_0x060d
        L_0x0590:
            r0 = -673839719(0xffffffffd7d60599, float:-4.7063906E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r13.A04
            X.8Wh r8 = (X.C357058Wh) r8
            r7 = 1
            r8.A00 = r7
            com.instagram.common.session.UserSession r6 = r8.A04
            java.lang.Object r1 = r13.A01
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r5 = r13.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r13.A03
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            java.lang.String r4 = r0.A32
            X.8Wg r0 = r8.A03
            java.lang.String r3 = r0.A00
            X.AnonymousClass7TF.A1B(r1, r7, r5)
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r6)
            java.lang.String r0 = "instagram_bc_ads_ppl_boost_eligibility_error"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "instagram_bc_ad_ppl_boost_eligibility_error_surface_share_anyway"
            X.Dbc.A0f(r1, r0, r4, r3, r5)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r8.A02
            X.DbX.A10(r0, r1)
            r0 = -494522950(0xffffffffe2862dba, float:-1.2375793E21)
            goto L_0x060d
        L_0x05cf:
            r0 = 360917193(0x158328c9, float:5.2974826E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r13.A04
            X.8Wh r7 = (X.C357058Wh) r7
            r0 = 0
            r7.A00 = r0
            com.instagram.common.session.UserSession r6 = r7.A04
            java.lang.Object r1 = r13.A01
            X.4DH r1 = (X.AnonymousClass4DH) r1
            java.lang.Object r5 = r13.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r13.A03
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            java.lang.String r4 = r0.A32
            X.8Wg r0 = r7.A03
            java.lang.String r3 = r0.A00
            X.AnonymousClass7TG.A1O(r1, r5)
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r6)
            java.lang.String r0 = "instagram_bc_ads_ppl_boost_eligibility_error"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "instagram_bc_ad_ppl_boost_eligibility_error_surface_edit"
            X.Dbc.A0f(r1, r0, r4, r3, r5)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r7.A02
            X.DbX.A10(r0, r1)
            r0 = -1252064642(0xffffffffb55f027e, float:-8.30776E-7)
        L_0x060d:
            X.AnonymousClass0fD.A0C(r0, r2)
        L_0x0610:
            return
        L_0x0611:
            r0 = 1238730281(0x49d58629, float:1749189.1)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A03
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r13.A04
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r0 = X.DbS.A0P()
            X.6Tm r1 = r0.A00()
            java.lang.Object r0 = r13.A02
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
            r0 = -1819016504(0xffffffff939402c8, float:-3.7363195E-27)
        L_0x0632:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FO6.onClick(android.view.View):void");
    }
}
