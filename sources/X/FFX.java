package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.user.follow.FollowButton;

public abstract class FFX {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.follow_list_row, false);
        A0A.setTag(new F1C(A0A));
        return A0A;
    }

    public static FollowButton A01(ViewStub viewStub) {
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, C273654mx.A00(50));
        FollowButton followButton = (FollowButton) inflate;
        followButton.setVisibility(0);
        return followButton;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r1.equals("potential_spam") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (X.182.A06(X.0Tu.A06, r5, 36327335900756311L) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.Context r6, com.instagram.user.model.User r7, X.C51960G9g r8, X.F1C r9, X.C46432Det r10, boolean r11) {
        /*
            float r0 = X.DbX.A00(r6)
            int r3 = (int) r0
            android.os.Bundle r1 = r10.A02
            java.lang.String r0 = "FollowListFragment.ShouldHideMoreOptionsMenu"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0036
            X.Df5 r1 = r10.A04
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            if (r1 != r0) goto L_0x0049
            com.instagram.common.session.UserSession r5 = r10.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324668726063318(0x810d18000030d6, double:3.035204997838584E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 != 0) goto L_0x0036
            X.0Tu r4 = X.0Tu.A06
            r0 = 36327335900756311(0x810f8500003957, double:3.0368917298542834E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0036:
            android.widget.ImageView r1 = r9.A01
            if (r1 == 0) goto L_0x0043
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x0043:
            android.view.ViewGroup r0 = r9.A06
            X.0nA.A0a(r0, r3)
            return
        L_0x0049:
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r1 == r0) goto L_0x0061
            X.Df5 r0 = X.C46443Df5.GROUP_FOLLOWING
            if (r1 == r0) goto L_0x0061
            X.Df5 r0 = X.C46443Df5.GROUP_FOLLOWERS
            if (r1 != r0) goto L_0x0036
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = "potential_spam"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
        L_0x0061:
            android.widget.ImageView r3 = r9.A01
            if (r3 != 0) goto L_0x0080
            android.view.ViewStub r0 = r9.A0C
            if (r0 == 0) goto L_0x008f
            android.view.View r3 = r0.inflate()
            r0 = 86
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131963756(0x7f132f6c, float:1.9564274E38)
            X.DbU.A12(r6, r3, r0)
            r9.A01 = r3
        L_0x0080:
            r3.setVisibility(r2)
            r1 = 9
            X.FNl r0 = new X.FNl
            r0.<init>(r1, r8, r7, r11)
            X.AnonymousClass0fU.A00(r0, r3)
            r3 = 0
            goto L_0x0043
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFX.A03(android.content.Context, com.instagram.user.model.User, X.G9g, X.F1C, X.Det, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.FP7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: X.FO6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.FO6} */
    /* JADX WARNING: type inference failed for: r10v11, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cd, code lost:
        if (r6.A04 == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0308, code lost:
        if (r34 == null) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030a, code lost:
        r11 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030c, code lost:
        if (r11 != null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030e, code lost:
        r11 = A01(r3.A09);
        r3.A04 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0316, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0317, code lost:
        if (r11 == null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031b, code lost:
        if (r11.A0J == null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031d, code lost:
        r8 = X.DbV.A0i(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0323, code lost:
        if (r8 != com.instagram.user.model.FollowStatus.A05) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0325, code lost:
        if (r45 == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0327, code lost:
        r11.setText(2131959811);
        r17 = new X.FO6(17, r21, r32, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033e, code lost:
        X.AnonymousClass0fU.A00(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0341, code lost:
        X.0nA.A0a(r3.A06, (int) X.DbX.A00(r33));
        r7 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034f, code lost:
        if (r7 == null) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0351, code lost:
        X.1QE.A0H(r7, r7);
        r8 = r4.B6o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0358, code lost:
        if (r41 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035c, code lost:
        if (r6.A00 != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035e, code lost:
        r10 = r8.ordinal();
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0364, code lost:
        if (r10 == 3) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0367, code lost:
        if (r10 == 5) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036a, code lost:
        if (r10 != 4) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036d, code lost:
        r6.A01 = r8;
        r6.A00 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0375, code lost:
        if (r6.A01 == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0379, code lost:
        if (r3.A03 != null) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x037b, code lost:
        r0 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x037d, code lost:
        if (r0 == null) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037f, code lost:
        r3.A03 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0385, code lost:
        r7 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0387, code lost:
        if (r7 == null) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0389, code lost:
        r7.setText(" • ");
        r7.setVisibility(0);
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0393, code lost:
        if (r0 == null) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0395, code lost:
        r0.setPadding(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0398, code lost:
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039a, code lost:
        if (r0 == null) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039c, code lost:
        r7 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x039e, code lost:
        if (r7 == null) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a0, code lost:
        r7.A0K = r9;
        r7.A03(r32, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a7, code lost:
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a9, code lost:
        if (r0 == null) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ab, code lost:
        X.DbT.A1G(r0, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ae, code lost:
        A03(r33, r4, r31, r3, r2, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03bd, code lost:
        r7 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03bf, code lost:
        if (r7 == null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c1, code lost:
        r7.setVisibility(8);
        r7 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03c6, code lost:
        if (r7 == null) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03c8, code lost:
        r7.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03cc, code lost:
        r11.setText(2131971974);
        r10 = new X.FP7(22, (java.lang.Object) r31, (java.lang.Object) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03dd, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ff, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A03, 36327443274938815L) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x040b, code lost:
        if (X.0qQ.A0K(r2.A05, "least_interacted_with_followers") != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04dc, code lost:
        if (X.182.A06(X.0Tu.A06, r2.A03, 36327335900756311L) != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04de, code lost:
        r2 = null;
        r7 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04e1, code lost:
        if (r7 != null) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e3, code lost:
        r0 = r3.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e5, code lost:
        if (r0 == null) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04e7, code lost:
        r2 = r0.inflate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04eb, code lost:
        r3.A00 = r2;
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ee, code lost:
        if (r7 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f0, code lost:
        r7.setVisibility(0);
        X.FP7.A00(r7, 20, r31, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x051e, code lost:
        if (X.182.A06(X.0Tu.A06, r2.A03, 36327443274938815L) != false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x058d, code lost:
        if (X.182.A06(r10, r11, 36323066703522631L) == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05fd, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0602, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0607, code lost:
        throw X.AnonymousClass7TE.A0y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x060c, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0611, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0616, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x061b, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0620, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        if (X.182.A06(r10, r11, 36323066703522631L) == false) goto L_0x0571;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f9, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A03, 36327335900756311L) != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fb, code lost:
        if (r47 == false) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fd, code lost:
        r9 = r32.getModuleName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0205, code lost:
        if (X.C46432Det.A00(r2) != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020b, code lost:
        if (r2.A04() == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020d, code lost:
        r11 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021a, code lost:
        if (X.182.A06(X.0Tu.A06, r11, 36315645000093127L) == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0227, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36327443274938815L) != false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022b, code lost:
        if (r3.A02 != null) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022d, code lost:
        r3.A02 = A01(r3.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0235, code lost:
        X.0nA.A0a(r3.A06, (int) X.DbX.A00(r33));
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0241, code lost:
        if (r8 == null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0243, code lost:
        r8.getLayoutParams().width = X.DbS.A03(r33.getResources(), com.instagram.android.R.dimen.avatar_size_ridiculously_xlarge);
        r2 = r8.A0J;
        r2.A0K = r9;
        r2.A03(r32, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025d, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025f, code lost:
        if (r0 == null) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        X.DbT.A1G(r0, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0268, code lost:
        if (r3.A04 != null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026a, code lost:
        r0 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026c, code lost:
        if (r0 == null) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026e, code lost:
        r3.A04 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0274, code lost:
        r2 = r3.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0276, code lost:
        if (r2 == null) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0278, code lost:
        r2.setText(" • ");
        r2.setVisibility(0);
        r7 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0282, code lost:
        if (r7 == null) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0284, code lost:
        r7.setPadding(0, 0, 0, 0);
        r7.setText(2131971974);
        X.DbT.A17(r33, r7, X.1QE.A01(r33));
        X.FP7.A00(r7, 21, r31, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.app.Activity r34, android.content.Context r35, X.AnonymousClass0iw r36, com.instagram.common.session.UserSession r37, com.instagram.model.reels.Reel r38, com.instagram.user.model.User r39, X.C46443Df5 r40, X.FAU r41, X.C51960G9g r42, X.F1C r43, X.C46432Det r44, boolean r45, boolean r46, boolean r47, boolean r48) {
        /*
            r1 = 0
            r5 = r37
            r3 = r43
            boolean r16 = X.AnonymousClass7TF.A1U(r1, r3, r5)
            r12 = 2
            r4 = r39
            r31 = r42
            r0 = r31
            X.AnonymousClass7TF.A1C(r4, r12, r0)
            r33 = r35
            r32 = r36
            r2 = r33
            r0 = r32
            X.AnonymousClass7TG.A1S(r2, r0)
            r0 = 15
            r2 = r44
            X.0qQ.A0B(r2, r0)
            android.view.View r6 = r3.A05
            r0 = 8
            r6.setVisibility(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r3.A0N
            r30 = r6
            com.instagram.common.typedurl.ImageUrl r9 = r4.Bh3()
            r18 = 0
            r8 = r18
            r7 = r32
            r6.A0F(r8, r7, r9)
            android.widget.TextView r13 = r3.A0J
            X.DbU.A1H(r13, r4)
            r19 = r48
            if (r48 == 0) goto L_0x0051
            android.view.ViewGroup r8 = r3.A06
            int r7 = X.2Yu.A02(r33)
            r6 = r33
            X.DbT.A16(r6, r8, r7)
        L_0x0051:
            boolean r6 = r4.isVerified()
            X.C244273av.A0B(r13, r6)
            X.3oV r7 = r3.A0M
            boolean r6 = X.C308436Ug.A02(r4)
            if (r6 == 0) goto L_0x05f4
            r7.setVisibility(r1)
            android.view.View r7 = r7.getView()
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6 = 2131964443(0x7f13321b, float:1.9565668E38)
            r7.setText(r6)
        L_0x006f:
            X.4Cl r6 = r4.A03
            java.lang.String r6 = r6.B3O()
            if (r6 == 0) goto L_0x05ee
            int r6 = r6.length()
            if (r6 == 0) goto L_0x05ee
            X.4Cl r6 = r4.A03
            java.lang.String r8 = r6.B3O()
        L_0x0083:
            if (r8 == 0) goto L_0x05e7
            int r6 = r8.length()
            if (r6 == 0) goto L_0x05e7
            android.widget.TextView r11 = r3.A0I
            r11.setText(r8)
            r11.setVisibility(r1)
        L_0x0093:
            boolean r6 = r2.A04()
            if (r6 == 0) goto L_0x00b9
            android.view.ViewGroup r6 = r3.A07
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.content.res.Resources r6 = r33.getResources()
            r9 = 2131165204(0x7f070014, float:1.7944619E38)
            int r6 = X.DbS.A03(r6, r9)
            r7.height = r6
            android.view.ViewGroup$LayoutParams r7 = r11.getLayoutParams()
            r6 = r33
            float r6 = X.DbU.A00(r6, r9)
            int r6 = (int) r6
            r7.height = r6
        L_0x00b9:
            android.widget.LinearLayout r6 = r3.A0F
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            java.lang.String r17 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r6 = r17
            X.0qQ.A0C(r9, r6)
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            boolean r7 = r2.A03()
            r6 = r41
            if (r7 == 0) goto L_0x05c7
            X.Df5 r7 = X.C46443Df5.FOLLOWERS
            r10 = r40
            if (r10 == r7) goto L_0x05aa
            X.Df5 r7 = X.C46443Df5.FOLLOWING
            if (r10 == r7) goto L_0x05aa
            android.view.ViewGroup r10 = r3.A06
            android.content.res.Resources r9 = r33.getResources()
            r7 = 2131165319(0x7f070087, float:1.7944852E38)
            int r7 = X.DbS.A03(r9, r7)
            r10.setMinimumHeight(r7)
            float r7 = X.DbX.A00(r33)
            int r15 = (int) r7
            android.content.res.Resources r7 = r33.getResources()
            r9 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r14 = X.DbS.A03(r7, r9)
            r7 = r33
            float r7 = X.DbU.A00(r7, r9)
            int r7 = (int) r7
            r10.setPadding(r15, r14, r1, r7)
        L_0x0104:
            java.lang.String r7 = "Required value was null."
            if (r41 == 0) goto L_0x063a
            android.widget.TextView r9 = r3.A0H
            java.lang.String r7 = r6.A03
            if (r7 == 0) goto L_0x05a5
            int r10 = r7.length()
            if (r10 == 0) goto L_0x05a5
            r9.setText(r7)
            r9.setVisibility(r1)
        L_0x011a:
            boolean r10 = r2.A02()
            if (r10 == 0) goto L_0x059e
            r11.setVisibility(r0)
            if (r8 == 0) goto L_0x012e
            int r10 = r8.length()
            if (r10 == 0) goto L_0x012e
            r13.setText(r8)
        L_0x012e:
            if (r7 == 0) goto L_0x0598
            int r7 = r7.length()
            if (r7 == 0) goto L_0x0598
            com.google.common.collect.ImmutableList r8 = r6.A02
            if (r8 == 0) goto L_0x017e
            int r7 = r8.size()
            if (r7 <= r12) goto L_0x0147
            com.google.common.collect.ImmutableList r8 = r8.subList((int) r1, (int) r12)
            X.0qQ.A07(r8)
        L_0x0147:
            android.widget.ImageView r7 = r3.A0D
            java.lang.String r23 = r32.getModuleName()
            android.content.res.Resources r10 = r33.getResources()
            r9 = 2131165285(0x7f070065, float:1.7944783E38)
            int r25 = r10.getDimensionPixelSize(r9)
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            X.0Tu r11 = X.0Tu.A05
            r9 = 36325501949719552(0x810dda00003400, double:3.035731931833909E-306)
            boolean r26 = X.182.A06(r11, r5, r9)
            r9 = 1059816735(0x3f2b851f, float:0.67)
            java.lang.Float r21 = java.lang.Float.valueOf(r9)
            r20 = r33
            r24 = r8
            r27 = r1
            r28 = r16
            android.graphics.drawable.Drawable r8 = X.C244283aw.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7.setImageDrawable(r8)
            r7.setVisibility(r1)
        L_0x017e:
            X.Df5 r9 = r2.A04
            X.Df5 r14 = X.C46443Df5.FOLLOWERS
            if (r9 != r14) goto L_0x0571
            com.instagram.common.session.UserSession r11 = r2.A03
            X.0Tu r10 = X.0Tu.A05
            r7 = 36323066703326020(0x810ba300012b44, double:3.034191872208689E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 != 0) goto L_0x019e
            r7 = 36323066703522631(0x810ba300042b47, double:3.034191872333027E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 == 0) goto L_0x0571
        L_0x019e:
            java.lang.String r7 = r4.A0O()
            if (r7 == 0) goto L_0x0591
            int r7 = r7.length()
            if (r7 == 0) goto L_0x0591
            int r7 = r4.A06()
            if (r7 != 0) goto L_0x0591
            X.3oV r7 = r3.A0K
            r7.setVisibility(r1)
            android.view.View r8 = r7.getView()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r7 = r4.A0O()
            r8.setText(r7)
        L_0x01c2:
            X.3oV r7 = r3.A0L
            r7.setVisibility(r0)
            android.os.Bundle r10 = r2.A02
            java.lang.String r7 = "FollowListFragment.HideRemoveButton"
            boolean r7 = r10.getBoolean(r7)
            r21 = r34
            r29 = r45
            if (r7 != 0) goto L_0x040f
            boolean r7 = r2.A06
            if (r7 == 0) goto L_0x040f
            r7 = 7
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r7)
            java.lang.String r7 = "FollowListFragment.EntryType"
            int r7 = r10.getInt(r7)
            r11 = r8[r7]
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            if (r11 != r7) goto L_0x03e0
            if (r9 != r14) goto L_0x03e0
            com.instagram.common.session.UserSession r12 = r2.A03
            X.0Tu r10 = X.0Tu.A05
            r7 = 36327335900756311(0x810f8500003957, double:3.0368917298542834E-306)
            boolean r7 = X.182.A06(r10, r12, r7)
            if (r7 != 0) goto L_0x03e0
        L_0x01fb:
            if (r47 == 0) goto L_0x03dd
            java.lang.String r9 = r32.getModuleName()
        L_0x0201:
            boolean r7 = X.C46432Det.A00(r2)
            if (r7 != 0) goto L_0x0229
            boolean r7 = r2.A04()
            if (r7 == 0) goto L_0x0308
            com.instagram.common.session.UserSession r11 = r2.A03
            X.0Tu r10 = X.0Tu.A06
            r7 = 36315645000093127(0x8104e300050dc7, double:3.0294983571994074E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 == 0) goto L_0x0308
            X.0Tu r10 = X.0Tu.A05
            r7 = 36327443274938815(0x810f9e000039bf, double:3.03695963371966E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 != 0) goto L_0x0308
        L_0x0229:
            com.instagram.user.follow.FollowButton r0 = r3.A02
            if (r0 != 0) goto L_0x0235
            android.view.ViewStub r0 = r3.A09
            com.instagram.user.follow.FollowButton r0 = A01(r0)
            r3.A02 = r0
        L_0x0235:
            android.view.ViewGroup r2 = r3.A06
            float r0 = X.DbX.A00(r33)
            int r0 = (int) r0
            X.0nA.A0a(r2, r0)
            com.instagram.user.follow.FollowButton r8 = r3.A02
            if (r8 == 0) goto L_0x025d
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            android.content.res.Resources r2 = r33.getResources()
            r0 = 2131165319(0x7f070087, float:1.7944852E38)
            int r0 = X.DbS.A03(r2, r0)
            r7.width = r0
            X.4at r2 = r8.A0J
            r2.A0K = r9
            r0 = r32
            r2.A03(r0, r5, r4)
        L_0x025d:
            com.instagram.user.follow.FollowButton r0 = r3.A02
            if (r0 == 0) goto L_0x0603
            X.DbT.A1G(r0, r5, r4)
            com.instagram.user.follow.FollowButton r0 = r3.A04
            java.lang.String r7 = "Required value was null."
            if (r0 != 0) goto L_0x0274
            android.view.ViewStub r0 = r3.A0B
            if (r0 == 0) goto L_0x05fe
            com.instagram.user.follow.FollowButton r0 = A01(r0)
            r3.A04 = r0
        L_0x0274:
            android.widget.TextView r2 = r3.A0G
            if (r2 == 0) goto L_0x05f9
            java.lang.String r0 = " • "
            r2.setText(r0)
            r2.setVisibility(r1)
            com.instagram.user.follow.FollowButton r7 = r3.A04
            if (r7 == 0) goto L_0x029d
            r7.setPadding(r1, r1, r1, r1)
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            r7.setText(r0)
            int r2 = X.1QE.A01(r33)
            r0 = r33
            X.DbT.A17(r0, r7, r2)
            r2 = 21
            r0 = r31
            X.FP7.A00(r7, r2, r0, r4)
        L_0x029d:
            r2 = 19
            X.FP7 r7 = new X.FP7
            r0 = r31
            r7.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r4)
            android.view.ViewGroup r2 = r3.A06
            X.AnonymousClass0fU.A00(r7, r2)
            r8 = r38
            if (r38 == 0) goto L_0x02ff
            r1 = r16
            r0 = r30
            r0.setGradientSpinnerVisible(r1)
            boolean r0 = r8.A16(r5)
            r1 = r0 ^ 1
            r0 = r30
            r0.setGradientSpinnerActivated(r1)
            r4 = 66
            r1 = r31
            X.FPH.A00(r0, r1, r8, r3, r4)
        L_0x02c8:
            if (r41 == 0) goto L_0x02cf
            boolean r0 = r6.A04
            r1 = 0
            if (r0 != 0) goto L_0x02d0
        L_0x02cf:
            r1 = 1
        L_0x02d0:
            r2.setEnabled(r1)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L_0x02da
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x02da:
            r2.setAlpha(r0)
            r0 = r30
            r0.setEnabled(r1)
            com.instagram.user.follow.FollowButton r0 = r3.A02
            if (r0 == 0) goto L_0x02e9
            r0.setEnabled(r1)
        L_0x02e9:
            com.instagram.user.follow.FollowButton r0 = r3.A03
            if (r0 == 0) goto L_0x02f0
            r0.setEnabled(r1)
        L_0x02f0:
            com.instagram.user.follow.FollowButton r0 = r3.A04
            if (r0 == 0) goto L_0x02f7
            r0.setEnabled(r1)
        L_0x02f7:
            android.widget.ImageView r0 = r3.A01
            if (r0 == 0) goto L_0x02fe
            r0.setEnabled(r1)
        L_0x02fe:
            return
        L_0x02ff:
            r0 = r30
            r0.setGradientSpinnerVisible(r1)
            X.AnonymousClass0fU.A00(r7, r0)
            goto L_0x02c8
        L_0x0308:
            if (r34 == 0) goto L_0x029d
            com.instagram.user.follow.FollowButton r11 = r3.A04
            if (r11 != 0) goto L_0x0316
            android.view.ViewStub r7 = r3.A09
            com.instagram.user.follow.FollowButton r11 = A01(r7)
            r3.A04 = r11
        L_0x0316:
            r8 = 0
            if (r11 == 0) goto L_0x0341
            X.4at r7 = r11.A0J
            if (r7 == 0) goto L_0x0321
            com.instagram.user.model.FollowStatus r8 = X.DbV.A0i(r5, r4)
        L_0x0321:
            com.instagram.user.model.FollowStatus r7 = com.instagram.user.model.FollowStatus.A05
            if (r8 != r7) goto L_0x03cc
            if (r45 == 0) goto L_0x03cc
            r7 = 2131959811(0x7f132003, float:1.9556273E38)
            r11.setText(r7)
            r18 = 17
            X.FO6 r10 = new X.FO6
            r17 = r10
            r19 = r21
            r20 = r32
            r21 = r5
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x033e:
            X.AnonymousClass0fU.A00(r10, r11)
        L_0x0341:
            android.view.ViewGroup r8 = r3.A06
            float r7 = X.DbX.A00(r33)
            int r7 = (int) r7
            X.0nA.A0a(r8, r7)
            com.instagram.user.follow.FollowButton r7 = r3.A04
            java.lang.String r11 = "Required value was null."
            if (r7 == 0) goto L_0x061c
            X.1QE.A0H(r7, r7)
            com.instagram.user.model.FollowStatus r8 = r4.B6o()
            if (r41 == 0) goto L_0x03bd
            boolean r7 = r6.A00
            if (r7 != 0) goto L_0x0373
            int r10 = r8.ordinal()
            r8 = 1
            r7 = 3
            if (r10 == r7) goto L_0x036d
            r7 = 5
            if (r10 == r7) goto L_0x036d
            r7 = 4
            if (r10 != r7) goto L_0x0373
            r8 = 0
        L_0x036d:
            r6.A01 = r8
            r7 = r16
            r6.A00 = r7
        L_0x0373:
            boolean r7 = r6.A01
            if (r7 == 0) goto L_0x03bd
            com.instagram.user.follow.FollowButton r0 = r3.A03
            if (r0 != 0) goto L_0x0385
            android.view.ViewStub r0 = r3.A0B
            if (r0 == 0) goto L_0x0612
            com.instagram.user.follow.FollowButton r0 = A01(r0)
            r3.A03 = r0
        L_0x0385:
            android.widget.TextView r7 = r3.A0G
            if (r7 == 0) goto L_0x060d
            java.lang.String r0 = " • "
            r7.setText(r0)
            r7.setVisibility(r1)
            com.instagram.user.follow.FollowButton r0 = r3.A03
            if (r0 == 0) goto L_0x0398
            r0.setPadding(r1, r1, r1, r1)
        L_0x0398:
            com.instagram.user.follow.FollowButton r0 = r3.A03
            if (r0 == 0) goto L_0x03a7
            X.4at r7 = r0.A0J
            if (r7 == 0) goto L_0x03a7
            r7.A0K = r9
            r0 = r32
            r7.A03(r0, r5, r4)
        L_0x03a7:
            com.instagram.user.follow.FollowButton r0 = r3.A03
            if (r0 == 0) goto L_0x0608
            X.DbT.A1G(r0, r5, r4)
        L_0x03ae:
            r24 = r33
            r25 = r4
            r26 = r31
            r27 = r3
            r28 = r2
            A03(r24, r25, r26, r27, r28, r29)
            goto L_0x029d
        L_0x03bd:
            com.instagram.user.follow.FollowButton r7 = r3.A03
            if (r7 == 0) goto L_0x03ae
            r7.setVisibility(r0)
            android.widget.TextView r7 = r3.A0G
            if (r7 == 0) goto L_0x0617
            r7.setVisibility(r0)
            goto L_0x03ae
        L_0x03cc:
            r7 = 2131971974(0x7f134f86, float:1.9580942E38)
            r11.setText(r7)
            r8 = 22
            X.FP7 r10 = new X.FP7
            r7 = r31
            r10.<init>((int) r8, (java.lang.Object) r7, (java.lang.Object) r4)
            goto L_0x033e
        L_0x03dd:
            r9 = 0
            goto L_0x0201
        L_0x03e0:
            java.lang.Integer r7 = X.AnonymousClass05K.A0j
            if (r11 != r7) goto L_0x040f
            X.Df5 r7 = X.C46443Df5.GROUP_FOLLOWERS
            if (r9 != r7) goto L_0x0403
            java.lang.String r8 = r2.A05
            java.lang.String r7 = "non_recip_followers"
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 == 0) goto L_0x0403
            com.instagram.common.session.UserSession r11 = r2.A03
            X.0Tu r10 = X.0Tu.A05
            r7 = 36327443274938815(0x810f9e000039bf, double:3.03695963371966E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 != 0) goto L_0x0403
            goto L_0x01fb
        L_0x0403:
            java.lang.String r8 = r2.A05
            java.lang.String r7 = "least_interacted_with_followers"
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 == 0) goto L_0x040f
            goto L_0x01fb
        L_0x040f:
            com.instagram.user.follow.FollowButton r7 = r3.A02
            java.lang.String r15 = "Required value was null."
            if (r7 != 0) goto L_0x041f
            android.view.ViewStub r7 = r3.A08
            if (r7 == 0) goto L_0x0635
            com.instagram.user.follow.FollowButton r7 = A01(r7)
            r3.A02 = r7
        L_0x041f:
            boolean r7 = X.2R8.A04(r5, r4)
            com.instagram.user.follow.FollowButton r11 = r3.A02
            if (r7 == 0) goto L_0x042e
            if (r11 == 0) goto L_0x029d
            r11.setVisibility(r0)
            goto L_0x029d
        L_0x042e:
            if (r11 == 0) goto L_0x0455
            com.instagram.common.session.UserSession r10 = r2.A03
            X.0Tu r12 = X.0Tu.A05
            r7 = 36326923583895636(0x810f2500003854, double:3.036630979011326E-306)
            boolean r8 = X.182.A06(r12, r10, r7)
            r7 = 1
            if (r8 != 0) goto L_0x0453
            boolean r8 = r2.A06
            if (r8 == 0) goto L_0x056e
            if (r9 != r14) goto L_0x0551
            X.0Tu r8 = X.0Tu.A06
            r12 = 36327335900756311(0x810f8500003957, double:3.0368917298542834E-306)
            boolean r8 = X.182.A06(r8, r10, r12)
            if (r8 == 0) goto L_0x0551
        L_0x0453:
            r11.A0A = r7
        L_0x0455:
            com.instagram.user.follow.FollowButton r8 = r3.A02
            if (r8 == 0) goto L_0x045e
            r7 = r19
            r8.setIsElevated(r7)
        L_0x045e:
            r10 = 0
            com.instagram.user.follow.FollowButton r8 = r3.A02
            if (r45 == 0) goto L_0x0544
            if (r8 == 0) goto L_0x046a
            X.3aK r7 = X.C243923aK.MESSAGE_OPTION
            r8.setBaseStyle(r7)
        L_0x046a:
            com.instagram.user.follow.FollowButton r8 = r3.A02
            if (r8 == 0) goto L_0x0630
            X.4at r11 = r8.A0J
            r20 = 3
            X.WAH r7 = new X.WAH
            r22 = r33
            r23 = r32
            r24 = r5
            r25 = r8
            r26 = r31
            r27 = r11
            r28 = r4
            r19 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11.A00 = r7
        L_0x0489:
            com.instagram.user.follow.FollowButton r7 = r3.A02
            if (r7 == 0) goto L_0x0541
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
        L_0x0491:
            r7 = r17
            X.0qQ.A0C(r8, r7)
            if (r46 == 0) goto L_0x052e
            r7 = -2
            r8.width = r7
            com.instagram.user.follow.FollowButton r8 = r3.A02
            if (r8 == 0) goto L_0x04a4
            r7 = 50
            r8.setPadding(r7, r1, r7, r1)
        L_0x04a4:
            if (r47 == 0) goto L_0x04aa
            java.lang.String r10 = r32.getModuleName()
        L_0x04aa:
            com.instagram.user.follow.FollowButton r7 = r3.A02
            if (r7 == 0) goto L_0x0626
            X.4at r8 = r7.A0J
            r7 = r31
            r8.A07(r7)
            r8.A0K = r10
            r7 = r32
            r8.A03(r7, r5, r4)
            r24 = r33
            r25 = r4
            r26 = r31
            r27 = r3
            r28 = r2
            A03(r24, r25, r26, r27, r28, r29)
            boolean r7 = r2.A06
            if (r7 == 0) goto L_0x0521
            if (r9 != r14) goto L_0x0503
            com.instagram.common.session.UserSession r11 = r2.A03
            X.0Tu r10 = X.0Tu.A06
            r7 = 36327335900756311(0x810f8500003957, double:3.0368917298542834E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 == 0) goto L_0x0503
        L_0x04de:
            r2 = 0
            android.view.View r7 = r3.A00
            if (r7 != 0) goto L_0x04ee
            android.view.ViewStub r0 = r3.A0A
            if (r0 == 0) goto L_0x04eb
            android.view.View r2 = r0.inflate()
        L_0x04eb:
            r3.A00 = r2
            r7 = r2
        L_0x04ee:
            if (r7 == 0) goto L_0x04fa
            r7.setVisibility(r1)
            r2 = 20
            r0 = r31
            X.FP7.A00(r7, r2, r0, r4)
        L_0x04fa:
            com.instagram.user.follow.FollowButton r0 = r3.A02
            if (r0 == 0) goto L_0x0621
            X.DbT.A1G(r0, r5, r4)
            goto L_0x029d
        L_0x0503:
            X.Df5 r7 = X.C46443Df5.GROUP_FOLLOWERS
            if (r9 != r7) goto L_0x0521
            java.lang.String r8 = r2.A05
            java.lang.String r7 = "non_recip_followers"
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 == 0) goto L_0x0521
            com.instagram.common.session.UserSession r9 = r2.A03
            X.0Tu r2 = X.0Tu.A06
            r7 = 36327443274938815(0x810f9e000039bf, double:3.03695963371966E-306)
            boolean r2 = X.182.A06(r2, r9, r7)
            if (r2 == 0) goto L_0x0521
            goto L_0x04de
        L_0x0521:
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x04fa
            r2.setVisibility(r0)
            r0 = r18
            r2.setOnClickListener(r0)
            goto L_0x04fa
        L_0x052e:
            com.instagram.user.follow.FollowButton r7 = r3.A02
            if (r7 == 0) goto L_0x062b
            android.content.res.Resources r11 = X.DbU.A05(r7)
            r7 = 2131165320(0x7f070088, float:1.7944854E38)
            int r7 = r11.getDimensionPixelSize(r7)
            r8.width = r7
            goto L_0x04a4
        L_0x0541:
            r8 = r10
            goto L_0x0491
        L_0x0544:
            if (r8 == 0) goto L_0x0489
            X.4at r11 = r8.A0J
            r11.A00 = r10
            X.3aK r7 = X.C243923aK.LARGE
            r8.setBaseStyle(r7)
            goto L_0x0489
        L_0x0551:
            X.Df5 r8 = X.C46443Df5.GROUP_FOLLOWERS
            if (r9 != r8) goto L_0x056e
            java.lang.String r12 = r2.A05
            java.lang.String r8 = "non_recip_followers"
            boolean r8 = X.0qQ.A0K(r12, r8)
            if (r8 == 0) goto L_0x056e
            X.0Tu r8 = X.0Tu.A06
            r12 = 36327443274938815(0x810f9e000039bf, double:3.03695963371966E-306)
            boolean r8 = X.182.A06(r8, r10, r12)
            if (r8 == 0) goto L_0x056e
            goto L_0x0453
        L_0x056e:
            r7 = 0
            goto L_0x0453
        L_0x0571:
            X.Df5 r7 = X.C46443Df5.FOLLOWING
            if (r9 != r7) goto L_0x0591
            com.instagram.common.session.UserSession r11 = r2.A03
            X.0Tu r10 = X.0Tu.A05
            r7 = 36323066703391557(0x810ba300022b45, double:3.034191872250135E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 != 0) goto L_0x019e
            r7 = 36323066703522631(0x810ba300042b47, double:3.034191872333027E-306)
            boolean r7 = X.182.A06(r10, r11, r7)
            if (r7 == 0) goto L_0x0591
            goto L_0x019e
        L_0x0591:
            X.3oV r7 = r3.A0K
            r7.setVisibility(r0)
            goto L_0x01c2
        L_0x0598:
            X.DbU.A1H(r9, r4)
            r9.setVisibility(r1)
        L_0x059e:
            android.widget.ImageView r7 = r3.A0D
            r7.setVisibility(r0)
            goto L_0x017e
        L_0x05a5:
            r9.setVisibility(r0)
            goto L_0x011a
        L_0x05aa:
            int r7 = X.AnonymousClass7TG.A04(r33)
            r9.setMargins(r1, r7, r1, r1)
            android.widget.LinearLayout r14 = r3.A0E
            int r10 = r14.getPaddingLeft()
            android.content.res.Resources r9 = r33.getResources()
            r7 = 2131165207(0x7f070017, float:1.7944625E38)
            int r7 = r9.getDimensionPixelSize(r7)
            r14.setPadding(r10, r1, r7, r1)
            goto L_0x0104
        L_0x05c7:
            android.widget.TextView r7 = r3.A0H
            r7.setVisibility(r0)
            android.widget.ImageView r7 = r3.A0D
            r7.setVisibility(r0)
            android.widget.LinearLayout r10 = r3.A0E
            int r8 = r10.getPaddingLeft()
            int r7 = r10.getPaddingLeft()
            r10.setPadding(r8, r1, r7, r1)
            int r7 = X.AnonymousClass7TG.A03(r33)
            r9.setMargins(r1, r7, r1, r1)
            goto L_0x017e
        L_0x05e7:
            android.widget.TextView r11 = r3.A0I
            r11.setVisibility(r0)
            goto L_0x0093
        L_0x05ee:
            java.lang.String r8 = r4.getFullName()
            goto L_0x0083
        L_0x05f4:
            r7.setVisibility(r0)
            goto L_0x006f
        L_0x05f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x05fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0603:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0608:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x060d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0612:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0617:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x061c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0621:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0626:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x062b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0630:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0635:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x063a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFX.A02(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, com.instagram.user.model.User, X.Df5, X.FAU, X.G9g, X.F1C, X.Det, boolean, boolean, boolean, boolean):void");
    }
}
