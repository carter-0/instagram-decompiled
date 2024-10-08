package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.70L  reason: invalid class name */
public abstract class AnonymousClass70L {
    public static void A01(Activity activity, AnonymousClass0iw r8, UserSession userSession, C321016tR r10, AnonymousClass70F r11, C323286xF r12, C319896rP r13, User user) {
        C71662eb r2 = r11.A0R;
        if (((ProfileCoinFlipView) r2.A01()).A01 == C320946tJ.PROFILE_PICTURE) {
            r12.D2v((RectF) null, r11, r13, user);
            return;
        }
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) r2.A01();
        if (!2R8.A04(userSession, user)) {
            r12.D2G();
        } else if (DcE.A04(userSession)) {
            r12.D2F(profileCoinFlipView);
        } else {
            C331157Pu A00 = new C331127Pr(userSession).A00();
            String moduleName = r8.getModuleName();
            String str = r10.A0l;
            float f = r10.A01;
            0qQ.A0B(moduleName, 0);
            0qQ.A0B(str, 1);
            E1S e1s = new E1S();
            e1s.setArguments(Q21.A00(new 0eP("args_previous_module_name", moduleName), new 0eP("args_avatar_sticker_url", str), new 0eP("args_top_margin_ratio", Float.valueOf(f))));
            A00.A02(activity, e1s);
        }
    }

    public static C321006tQ A00(Context context, AvatarCoinFlipSticker avatarCoinFlipSticker, UserSession userSession) {
        int i;
        Context context2 = context;
        int color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_progress_bar_on_media));
        Resources resources = context2.getResources();
        0Tu r4 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r4, userSession2, 36327795462781643L);
        int i2 = R.dimen.profile_header_avatar_size_new;
        if (A06) {
            i2 = R.dimen.appreciation_reels_grid_item_width;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        AvatarCoinFlipSticker avatarCoinFlipSticker2 = avatarCoinFlipSticker;
        String str = avatarCoinFlipSticker2.A03;
        if (DcE.A01(userSession2)) {
            i = (int) (((double) dimensionPixelSize) * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        C321006tQ r42 = (C321006tQ) C320996tP.A01(context2, userSession2, new C320976tN(userSession2), str, "ig_profile", (String) null, (String) null, i, dimensionPixelSize, false, true, false, true, 182.A06(r4, userSession2, 36325343036126090L));
        r42.A0a.A01(color, color);
        r42.A01 = ((float) avatarCoinFlipSticker2.A02) / ((float) avatarCoinFlipSticker2.A01);
        return r42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(com.instagram.common.session.UserSession r4, com.instagram.user.model.User r5, boolean r6, boolean r7) {
        /*
            boolean r0 = X.2R8.A04(r4, r5)
            r3 = 0
            if (r0 == 0) goto L_0x0017
            if (r6 == 0) goto L_0x0017
            if (r7 != 0) goto L_0x0018
            boolean r0 = r5.A1n()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5.A1a()
        L_0x0015:
            if (r0 != 0) goto L_0x0024
        L_0x0017:
            return r3
        L_0x0018:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322083155748793(0x810abe000027b9, double:3.0335698727604226E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            goto L_0x0015
        L_0x0024:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322083155748793(0x810abe000027b9, double:3.0335698727604226E-306)
            boolean r3 = X.182.A06(r2, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70L.A03(com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v175, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v179, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v181, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r4v255, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v34, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v35, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v36, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c0, code lost:
        if (r0.A0C == null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d1, code lost:
        if (r21 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x032b, code lost:
        if (r14.A00 == null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032f, code lost:
        if (r14 != null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0331, code lost:
        r13 = r14.A01;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0334, code lost:
        if (r13 != null) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0336, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0337, code lost:
        r13 = r15.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0339, code lost:
        if (r13 == null) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x033f, code lost:
        if (r13.B9E() == null) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0341, code lost:
        if (r9 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0343, code lost:
        r9.setVisibility(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x034c, code lost:
        if (r17 != false) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x034e, code lost:
        if (r14 == false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0354, code lost:
        if (X.182.A06(r5, r1, 36322207710062595L) == false) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r3.A1Y() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0406, code lost:
        if (X.0mp.A00(r3) > 3) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x044a, code lost:
        if (X.C378179Ou.A02(r1, r21) != false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r12 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x069f, code lost:
        if (X.182.A06(r5, r1, 36328461182319981L) == false) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06bd, code lost:
        if (X.C378179Ou.A02(r1, r21) != false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08a3, code lost:
        if (r51 != null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08e0, code lost:
        if (r6.A01() != null) goto L_0x08e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x08fe, code lost:
        if (r0.A0I == false) goto L_0x08e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a65, code lost:
        if (X.182.A06(r11, r1, 36325343035995016L) == false) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0dbb, code lost:
        if (r8.A0x(r1) != false) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d4, code lost:
        if (r2.A05(r1) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x09a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(androidx.fragment.app.Fragment r44, X.C279864zZ r45, com.instagram.avatars.coinflip.AvatarCoinFlipConfig r46, X.AnonymousClass0iw r47, com.instagram.common.session.UserSession r48, X.AnonymousClass70F r49, X.C323286xF r50, X.C319896rP r51, X.2bv r52, X.C230882qT r53, com.instagram.user.model.User r54, boolean r55, boolean r56, boolean r57) {
        /*
            r7 = r46
            r1 = r48
            r0 = r49
            r3 = r54
            if (r46 == 0) goto L_0x0024
            boolean r2 = X.2R8.A04(r1, r3)
            boolean r2 = X.DcE.A06(r1, r2)
            if (r2 == 0) goto L_0x0024
            boolean r2 = r7.A08
            if (r2 == 0) goto L_0x0024
            r2 = r44
            X.0h9 r4 = r2.mLifecycleRegistry
            X.6tK r2 = new X.6tK
            r2.<init>(r1, r0)
            r4.A09(r2)
        L_0x0024:
            r2 = r57
            r0.A0I = r2
            X.70M r6 = X.AnonymousClass70M.A06
            r0.A0D = r6
            r10 = 1
            r16 = r45
            r43 = r47
            r42 = r50
            if (r54 == 0) goto L_0x0e4d
            r2 = r51
            if (r56 != 0) goto L_0x0e49
            java.lang.String r4 = r3.getId()
            boolean r4 = X.2R8.A05(r1, r4)
            if (r51 == 0) goto L_0x0df3
            if (r4 != 0) goto L_0x004c
            boolean r4 = r3.A1Y()
            r12 = 1
            if (r4 != 0) goto L_0x004d
        L_0x004c:
            r12 = 0
        L_0x004d:
            boolean r4 = r2.A05(r1)
            if (r4 == 0) goto L_0x0d6d
            if (r12 == 0) goto L_0x0057
        L_0x0055:
            X.70M r6 = X.AnonymousClass70M.A07
        L_0x0057:
            r0.A0D = r6
            androidx.fragment.app.FragmentActivity r13 = r44.requireActivity()
            android.content.Context r6 = r44.requireContext()
            r12 = 1
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r5 = r4.A02
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            r41 = r55
            r4 = r18
            if (r5 != r4) goto L_0x09a4
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            if (r4 != 0) goto L_0x00b2
            android.view.ViewStub r4 = r0.A0L
            android.view.View r4 = r4.inflate()
            com.instagram.ui.widget.emitter.PulseEmitter r4 = (com.instagram.ui.widget.emitter.PulseEmitter) r4
            r0.A0E = r4
            android.view.ViewStub r4 = r0.A0M
            android.view.View r4 = r4.inflate()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r4 = (com.instagram.ui.widget.imageview.PulsingMultiImageView) r4
            r0.A0F = r4
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            android.content.res.Resources r8 = r4.getResources()
            X.0Tu r7 = X.0Tu.A05
            r4 = 36327795462781643(0x810ff000083acb, double:3.037182358729611E-306)
            boolean r5 = X.182.A06(r7, r1, r4)
            r4 = 2131165702(0x7f070206, float:1.7945629E38)
            if (r5 == 0) goto L_0x00aa
            r4 = 2131165281(0x7f070061, float:1.7944775E38)
        L_0x00aa:
            int r4 = r8.getDimensionPixelSize(r4)
            r9.height = r4
            r9.width = r4
        L_0x00b2:
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            r4.getClass()
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            r5 = 0
            r4.setVisibility(r5)
            com.instagram.ui.widget.emitter.PulseEmitter r4 = r0.A0E
            r4.A01()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r4 = r0.A0F
            r4.getClass()
            r4.setVisibility(r5)
            r3.Bh3()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r7 = r0.A0F
            r7.getClass()
            com.instagram.common.typedurl.ImageUrl r5 = r3.Bh3()
            r4 = r43
            r7.setAnimatingImageUrl(r5, r4)
            com.instagram.ui.widget.imageview.PulsingMultiImageView r7 = r0.A0F
            r7.getClass()
            X.FNv r5 = new X.FNv
            r4 = r42
            r5.<init>(r0, r4, r2, r3)
            X.AnonymousClass0fU.A00(r5, r7)
            com.instagram.ui.widget.imageview.PulsingMultiImageView r7 = r0.A0F
            r7.getClass()
            X.FPW r5 = new X.FPW
            r5.<init>(r4, r2, r3)
            r7.setOnLongClickListener(r5)
            com.instagram.ui.widget.imageview.PulsingMultiImageView r7 = r0.A0F
            r7.getClass()
            r5 = 2131970055(0x7f134807, float:1.957705E38)
            java.lang.String r4 = r3.getUsername()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r6.getString(r5, r4)
            r7.setContentDescription(r4)
        L_0x010e:
            r4 = r42
            r4.DaA(r12)
        L_0x0113:
            android.content.Context r7 = r44.requireContext()
            r0.A02()
            r5 = 0
            if (r51 == 0) goto L_0x08c4
            com.instagram.model.reels.Reel r4 = r2.A00()
            X.3ID r4 = r4.A0C(r1)
            if (r4 == 0) goto L_0x08c4
            X.2eb r4 = r0.A0P
            r4.A03(r5)
            android.view.View r6 = r4.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            com.instagram.model.reels.Reel r4 = r2.A00()
            X.3ID r4 = r4.A0C(r1)
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.C49100EpP.A00(r7, r4)
            r4 = r43
            r6.setUrl(r5, r4)
        L_0x0143:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r0.A0V
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r4 = r4.A01
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            r5 = 0
            if (r4 == r8) goto L_0x0152
            r5 = 1
        L_0x0152:
            r6 = 0
            r4 = 4
            if (r5 == 0) goto L_0x0157
            r4 = 0
        L_0x0157:
            r7.setVisibility(r4)
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r4 = r4.A01
            int r5 = r4.intValue()
            if (r5 == r6) goto L_0x08bf
            if (r5 == r12) goto L_0x08bf
            r4 = 2
            if (r5 == r4) goto L_0x08bf
            r4 = 3
            if (r5 == r4) goto L_0x08bf
            r7.A04()
        L_0x0172:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r4 = r4.A01
            int r5 = r4.intValue()
            if (r5 == r6) goto L_0x08a7
            if (r5 == r12) goto L_0x08a7
            r4 = 2
            if (r5 == r4) goto L_0x08a7
            r4 = 3
            if (r5 == r4) goto L_0x08a7
        L_0x0187:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r5 = r4.A01
            r4 = r18
            if (r5 != r4) goto L_0x0890
            r4 = 0
            r7.setRotation(r4)
            if (r51 == 0) goto L_0x01d6
            boolean r4 = r2.A04()
            if (r4 == 0) goto L_0x01cc
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.3NV r5 = r4.A0E()
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            if (r4 == 0) goto L_0x01c9
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            X.4w0 r4 = r4.A02
            if (r4 == 0) goto L_0x01c9
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            X.4w0 r4 = r4.A02
            X.4vt r4 = r4.A0A
            boolean r4 = r4.CVs()
            if (r4 == 0) goto L_0x01c9
            r6 = 1
        L_0x01c9:
            X.AnonymousClass3NW.A03(r7, r5, r6)
        L_0x01cc:
            r42.DaC()
            boolean r4 = r2.A05(r1)
            r6 = 1
            if (r4 == 0) goto L_0x01d7
        L_0x01d6:
            r6 = 0
        L_0x01d7:
            boolean r4 = X.AnonymousClass4AJ.A02(r1)
            if (r4 == 0) goto L_0x0854
            X.4Cl r4 = r3.A03
            com.instagram.api.schemas.BirthdayVisibilityForViewer r5 = r4.Afu()
            com.instagram.api.schemas.BirthdayVisibilityForViewer r4 = com.instagram.api.schemas.BirthdayVisibilityForViewer.VISIBLE_WITH_EFFECTS
            if (r5 == r4) goto L_0x01f1
            X.4Cl r4 = r3.A03
            com.instagram.api.schemas.BirthdayVisibilityForViewer r5 = r4.Afu()
            com.instagram.api.schemas.BirthdayVisibilityForViewer r4 = com.instagram.api.schemas.BirthdayVisibilityForViewer.VISIBLE_WITHOUT_EFFECTS
            if (r5 != r4) goto L_0x0854
        L_0x01f1:
            android.content.Context r5 = r44.requireContext()
            r4 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r4)
            X.2eb r7 = r0.A0O
            android.view.View r5 = r7.A01()
            r4 = 2131439408(0x7f0b2f30, float:1.850077E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4.setImageDrawable(r8)
            r4 = 0
            r7.A03(r4)
            android.view.View r8 = r7.A01()
            X.Oj6 r7 = new X.Oj6
            r5 = r16
            r4 = r42
            r7.<init>(r5, r1, r4, r3)
        L_0x021f:
            X.AnonymousClass0fU.A00(r7, r8)
            r7 = 8
        L_0x0224:
            if (r6 == 0) goto L_0x023d
            r2.getClass()
            boolean r4 = r2.A00
            if (r4 == 0) goto L_0x023d
            r4 = 0
            r2.A00 = r4
            java.util.ArrayList r5 = r2.A02(r1)
            com.instagram.model.reels.Reel r4 = r2.A00()
            r2 = r42
            r2.DN4(r4, r0, r5)
        L_0x023d:
            r6 = 0
            r5 = r52
            if (r52 == 0) goto L_0x0256
            r4 = r53
            if (r53 == 0) goto L_0x0256
            X.70Q r2 = new X.70Q
            r2.<init>(r0, r5, r4)
            r0.A0G = r2
            android.view.View r4 = r0.AeY()
            java.lang.Runnable r2 = r0.A0G
            r4.post(r2)
        L_0x0256:
            r2 = r43
            r0.Eu3(r2)
            android.content.Context r8 = r44.requireContext()
            if (r54 == 0) goto L_0x034b
            boolean r2 = X.C240943Ng.A02(r1, r3)
            if (r2 == 0) goto L_0x02af
            X.0Tu r2 = X.0Tu.A05
            r4 = 36319510470663628(0x81086700051dcc, double:3.031942896353193E-306)
            boolean r2 = X.182.A06(r2, r1, r4)
            if (r2 == 0) goto L_0x02af
            android.view.ViewStub r4 = r0.A0K
            if (r4 == 0) goto L_0x0284
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            if (r2 != 0) goto L_0x0284
            android.view.View r2 = r4.inflate()
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            r0.A06 = r2
        L_0x0284:
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            if (r2 == 0) goto L_0x02af
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.View r2 = r0.AeY()
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r2 = r4.width
            r5.width = r2
            int r2 = r4.height
            r5.height = r2
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            r2.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            X.C240943Ng.A00(r8, r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            X.C240943Ng.A01(r2)
        L_0x02af:
            java.lang.String r4 = r1.A06
            java.lang.String r2 = r3.getId()
            boolean r21 = r4.equals(r2)
            androidx.constraintlayout.widget.ConstraintLayout r11 = r0.A01
            if (r11 == 0) goto L_0x02c2
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = r0.A0C
            r4 = 1
            if (r2 != 0) goto L_0x02c3
        L_0x02c2:
            r4 = 0
        L_0x02c3:
            X.0Tu r5 = X.0Tu.A05
            r2 = 36322207709865984(0x810adb00012800, double:3.0336486412856733E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x02d3
            r3 = 1
            if (r21 != 0) goto L_0x02d4
        L_0x02d3:
            r3 = 0
        L_0x02d4:
            boolean r2 = X.C322606w6.A01(r1)
            if (r3 != 0) goto L_0x02dc
            if (r2 == 0) goto L_0x02e4
        L_0x02dc:
            X.70M r2 = r0.A0D
            java.lang.Integer r3 = r2.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x02e5
        L_0x02e4:
            r12 = 0
        L_0x02e5:
            r2 = 36322207710062595(0x810adb00042803, double:3.033648641410011E-306)
            boolean r23 = X.182.A06(r5, r1, r2)
            if (r12 == 0) goto L_0x0346
            if (r4 == 0) goto L_0x0346
            if (r11 == 0) goto L_0x02f7
            r11.setVisibility(r6)
        L_0x02f7:
            android.view.ViewGroup r12 = r0.A0J
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r9 = r0.A0C
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r0.A07
            X.2eb r4 = r0.A0B
            r10 = r44
            X.0h9 r10 = r10.mLifecycleRegistry
            r24 = r10
            com.instagram.common.ui.base.IgSimpleImageView r10 = r0.A04
            r22 = 1
            r0 = r22
            X.0qQ.A0B(r12, r0)
            r0 = r24
            X.0qQ.A0B(r0, r7)
            r13 = 10
            r0 = r42
            X.0qQ.A0B(r0, r13)
            r0 = 0
            if (r45 == 0) goto L_0x0356
            r13 = r16
            X.5y2 r15 = r13.A0A
            if (r15 == 0) goto L_0x0356
            X.60C r14 = r15.A09
            if (r14 == 0) goto L_0x032d
            com.instagram.api.schemas.NotePogImageDict r13 = r14.A00
            r17 = 1
            if (r13 != 0) goto L_0x0331
        L_0x032d:
            r17 = 0
            if (r14 == 0) goto L_0x0336
        L_0x0331:
            com.instagram.api.schemas.NotePogVideoDict r13 = r14.A01
            r14 = 1
            if (r13 != 0) goto L_0x0337
        L_0x0336:
            r14 = 0
        L_0x0337:
            com.instagram.api.schemas.GIFNoteResponseInfo r13 = r15.A02
            if (r13 == 0) goto L_0x034c
            com.instagram.api.schemas.CommentGiphyMediaInfoIntf r13 = r13.B9E()
            if (r13 == 0) goto L_0x034c
        L_0x0341:
            if (r9 == 0) goto L_0x0346
            r9.setVisibility(r7)
        L_0x0346:
            if (r11 == 0) goto L_0x034b
            r11.setVisibility(r7)
        L_0x034b:
            return
        L_0x034c:
            if (r17 != 0) goto L_0x0341
            if (r14 == 0) goto L_0x0356
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x0341
        L_0x0356:
            if (r9 == 0) goto L_0x034b
            if (r45 == 0) goto L_0x07f6
            com.instagram.common.ui.base.IgTextView r3 = r9.getTextView()
            r20 = 2
            r2 = r20
            r3.setMaxLines(r2)
            X.3jK r2 = X.C249223jK.A00
            boolean r11 = r2.A07(r1)
            r2 = 36326713131153346(0x810ef4000a37c2, double:3.0364978878496764E-306)
            boolean r14 = X.182.A06(r5, r1, r2)
            boolean r13 = X.C249223jK.A05(r1)
            r2 = 36330084679827900(0x811205000041bc, double:3.038630068807601E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            r9.A0I(r11, r14, r13, r2)
            X.913 r11 = X.C378179Ou.A00(r16)
            if (r11 == 0) goto L_0x0576
            r2 = 36328461182188907(0x81108b00003d6b, double:3.037603362363402E-306)
            X.182.A06(r5, r1, r2)
            r2 = 36328461182319981(0x81108b00023d6d, double:3.0376033624462934E-306)
            X.182.A06(r5, r1, r2)
            r2 = 36328461182188907(0x81108b00003d6b, double:3.037603362363402E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x03ad
            r2 = 36328461182254444(0x81108b00013d6c, double:3.0376033624048476E-306)
            X.182.A06(r5, r1, r2)
        L_0x03ad:
            X.4zZ r13 = r11.BWY()
            com.instagram.api.schemas.NoteCustomThemeImpl r2 = r13.A06
            r14 = 0
            if (r2 == 0) goto L_0x07f3
            com.instagram.api.schemas.NoteActivationType r2 = r2.A00
            if (r2 == 0) goto L_0x07f3
            java.lang.String r3 = r2.name()
        L_0x03be:
            java.lang.String r2 = "WNBA_NOTES"
            r17 = 0
            if (r3 == 0) goto L_0x07ec
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x07ec
            if (r10 == 0) goto L_0x03d7
            X.MlN r2 = new X.MlN
            r2.<init>()
            r10.setBackground(r2)
            r10.setVisibility(r6)
        L_0x03d7:
            boolean r2 = r11 instanceof X.AnonymousClass91B
            r19 = r2
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x0622
            r2 = r11
            X.91B r2 = (X.AnonymousClass91B) r2
            X.4zZ r10 = r2.A00
            java.lang.String r3 = r10.A0J
            java.lang.CharSequence r17 = X.C66889MeU.A04(r1, r3)
            X.5y4 r2 = r10.A07
            if (r2 == 0) goto L_0x03fc
            java.util.List r2 = r2.A01
            if (r2 == 0) goto L_0x03fc
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.api.schemas.NoteEmojiReactionInfo r2 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r2
            if (r2 == 0) goto L_0x03fc
            java.lang.String r14 = r2.A02
        L_0x03fc:
            boolean r2 = r10.A0Q
            if (r2 == 0) goto L_0x0408
            int r3 = X.0mp.A00(r3)
            r2 = 3
            r15 = 1
            if (r3 <= r2) goto L_0x0409
        L_0x0408:
            r15 = 0
        L_0x0409:
            com.instagram.api.schemas.NoteCustomThemeImpl r10 = r10.A06
            r2 = 20
            X.MJ4 r3 = new X.MJ4
            r3.<init>(r2, r12, r9)
            r2 = r17
            r9.setText(r2, r15, r7, r3)
            r9.setCustomTheme(r10)
            r10 = 0
            r2 = r22
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentLayout$default(r9, r6, r2, r0)
            X.6qj r2 = new X.6qj
            r2.<init>(r9, r6)
            r9.post(r2)
            int r3 = r17.length()
            r2 = 0
            if (r3 != 0) goto L_0x0431
            r2 = 8
        L_0x0431:
            r9.setVisibility(r2)
            if (r8 == 0) goto L_0x044f
            int r2 = r17.length()
            if (r2 == 0) goto L_0x06bf
            if (r14 == 0) goto L_0x06bf
            int r2 = r14.length()
            if (r2 == 0) goto L_0x06bf
            r2 = r21
            boolean r2 = X.C378179Ou.A02(r1, r2)
            if (r2 == 0) goto L_0x06bf
        L_0x044c:
            r8.setVisibility(r10)
        L_0x044f:
            if (r4 == 0) goto L_0x04d3
            X.OGN r12 = new X.OGN
            r12.<init>(r4)
            if (r23 == 0) goto L_0x04d3
            X.5y2 r2 = r13.A0A
            if (r2 == 0) goto L_0x04d3
            X.60C r2 = r2.A09
            if (r2 == 0) goto L_0x04d3
            com.instagram.api.schemas.NotePogVideoDict r4 = r2.A01
            if (r4 == 0) goto L_0x04d3
            java.util.List r2 = r4.A03
            java.lang.Object r2 = X.00k.A0O(r2, r6)
            com.instagram.model.mediasize.VideoVersion r2 = (com.instagram.model.mediasize.VideoVersion) r2
            r3 = 0
            if (r2 == 0) goto L_0x061f
            java.lang.String r14 = r2.A06
        L_0x0471:
            com.instagram.model.mediasize.ImageInfo r2 = r4.A00
            java.util.List r2 = r2.Al9()
            if (r2 == 0) goto L_0x04bd
            java.lang.Object r2 = X.00k.A0O(r2, r6)
            com.instagram.model.mediasize.ExtendedImageUrl r2 = (com.instagram.model.mediasize.ExtendedImageUrl) r2
            if (r2 == 0) goto L_0x04bd
            java.lang.String r2 = r2.A0A
            if (r2 == 0) goto L_0x04bd
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl
            r7.<init>(r2)
            androidx.cardview.widget.CardView r10 = r12.A01
            r10.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r12.A03
            r4.setVisibility(r6)
            r2 = r43
            r4.setUrl(r7, r2)
            com.instagram.common.ui.base.IgFrameLayout r15 = r12.A02
            r2 = 4
            r15.setVisibility(r2)
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            android.content.res.Resources r4 = r10.getResources()
            X.0qQ.A0A(r4)
            int r2 = X.AnonymousClass70I.A01(r4, r15, r1)
            r7.height = r2
            int r2 = X.AnonymousClass70I.A01(r4, r15, r1)
            r7.width = r2
            r2 = 0
            r10.setCardElevation(r2)
            r10.requestLayout()
        L_0x04bd:
            android.widget.VideoView r4 = r12.A00
            r4.setAudioFocusRequest(r6)
            if (r14 == 0) goto L_0x04c8
            android.net.Uri r3 = X.0cp.A03(r14)
        L_0x04c8:
            r4.setVideoURI(r3)
            X.OgT r2 = new X.OgT
            r2.<init>(r4, r12)
            r4.setOnPreparedListener(r2)
        L_0x04d3:
            X.60k r2 = X.C3018660j.A01(r1)
            r2.A0K(r11)
            X.71s r3 = X.C3252571r.A00(r1)
            java.util.HashSet r4 = r3.A02
            boolean r2 = r4.contains(r11)
            if (r2 != 0) goto L_0x0576
            r4.add(r11)
            if (r19 != 0) goto L_0x061b
            boolean r2 = r11 instanceof X.AnonymousClass912
            if (r2 == 0) goto L_0x05f3
            X.Mfg r2 = X.C66947Mfg.MUSIC_NOTE
        L_0x04f1:
            X.Mfg[] r2 = new X.C66947Mfg[]{r2}
            java.util.ArrayList r10 = X.0sr.A1M(r2)
            com.instagram.common.session.UserSession r2 = r3.A00
            X.60k r6 = X.C3018660j.A01(r2)
            java.lang.String r4 = "profile"
            X.0wc r7 = r6.A05
            java.lang.String r3 = "ig_direct_inbox_v2_item_impression"
            X.0kJ r2 = r7.A00
            X.0Aj r3 = r7.A00(r2, r3)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x0576
            java.lang.String r7 = X.C3018760k.A02()
            java.lang.String r2 = "nav_chain"
            r3.AAJ(r2, r7)
            com.instagram.user.model.User r2 = r13.A0D
            java.lang.String r7 = r2.getId()
            java.lang.String r2 = "target_user_id"
            r3.AAJ(r2, r7)
            java.lang.String r2 = "content"
            r3.AAe(r2, r10)
            java.lang.String r2 = "direct_session_id"
            r3.AAJ(r2, r0)
            java.lang.String r2 = "position"
            r3.A9F(r2, r0)
            java.lang.String r2 = "note_inventory_count"
            r3.A9F(r2, r0)
            java.lang.String r2 = "dwell_time_ms"
            r3.A8D(r2, r0)
            java.lang.String r2 = r13.A0H
            java.lang.String r0 = "note_id"
            r3.AAJ(r0, r2)
            int r0 = r13.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = X.AnonymousClass916.A00(r0)
            X.GT1 r2 = X.C3018660j.A00(r0)
            java.lang.String r0 = "target_note_audience"
            r3.A8M(r2, r0)
            java.lang.String r0 = "container_module"
            r3.AAJ(r0, r4)
            com.instagram.direct.inbox.notes.NotesRepository r0 = r6.A08
            X.0Ud r0 = r0.A0s
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "ranking_session_id"
            r3.AAJ(r0, r2)
            java.lang.String r2 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r3.AAJ(r0, r2)
            r3.Cgf()
        L_0x0576:
            java.lang.Class<X.91B> r0 = X.AnonymousClass91B.class
            X.0Yh r3 = new X.0Yh
            r3.<init>(r0)
            java.lang.Class<X.912> r2 = X.AnonymousClass912.class
            X.0Yh r0 = new X.0Yh
            r0.<init>(r2)
            X.0ry[] r0 = new X.C62230ry[]{r3, r0}
            java.util.List r2 = X.0sr.A1P(r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x05a3
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x05a3
        L_0x0596:
            X.Mfh r2 = new X.Mfh
            r1 = r16
            r0 = r42
            r2.<init>(r1, r0)
        L_0x059f:
            X.AnonymousClass0fU.A00(r2, r9)
            return
        L_0x05a3:
            java.util.Iterator r3 = r2.iterator()
        L_0x05a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0596
            java.lang.Object r0 = r3.next()
            X.0ry r0 = (X.C62230ry) r0
            X.913 r2 = X.C378179Ou.A00(r16)
            X.0Yh r0 = (X.0Yh) r0
            java.lang.Class r0 = r0.A00
            boolean r0 = X.0q1.A02(r0, r2)
            if (r0 == 0) goto L_0x05a7
            r0 = r21
            boolean r0 = X.C378179Ou.A02(r1, r0)
            if (r0 == 0) goto L_0x0596
            r2 = 36328461182188907(0x81108b00003d6b, double:3.037603362363402E-306)
            boolean r0 = X.182.A06(r5, r1, r2)
            if (r0 == 0) goto L_0x0596
            r2 = 36328461182254444(0x81108b00013d6c, double:3.0376033624048476E-306)
            boolean r0 = X.182.A06(r5, r1, r2)
            if (r0 == 0) goto L_0x0596
            android.content.Context r3 = r9.getContext()
            X.0qQ.A07(r3)
            X.OkU r2 = new X.OkU
            r1 = r16
            r0 = r42
            r2.<init>(r3, r1, r8, r0)
            r9.setOnTouchListener(r2)
            return
        L_0x05f3:
            r2 = r22
            boolean r2 = X.C382039cz.A00(r2, r11)
            if (r2 == 0) goto L_0x05ff
            X.Mfg r2 = X.C66947Mfg.LOCATION_NOTE
            goto L_0x04f1
        L_0x05ff:
            r2 = r20
            boolean r2 = X.AnonymousClass9IJ.A00(r2, r11)
            if (r2 == 0) goto L_0x060b
            X.Mfg r2 = X.C66947Mfg.PROMPT_NOTE
            goto L_0x04f1
        L_0x060b:
            X.5y2 r2 = r13.A0A
            if (r2 == 0) goto L_0x061b
            X.60C r2 = r2.A09
            if (r2 == 0) goto L_0x061b
            com.instagram.api.schemas.NotePogVideoDict r2 = r2.A01
            if (r2 == 0) goto L_0x061b
            X.Mfg r2 = X.C66947Mfg.POG_VIDEO
            goto L_0x04f1
        L_0x061b:
            X.Mfg r2 = X.C66947Mfg.NOTE
            goto L_0x04f1
        L_0x061f:
            r14 = r0
            goto L_0x0471
        L_0x0622:
            boolean r2 = r11 instanceof X.AnonymousClass912
            if (r2 == 0) goto L_0x06c3
            r2 = r11
            X.912 r2 = (X.AnonymousClass912) r2
            X.4zZ r10 = r2.A00
            X.5y2 r2 = r10.A0A
            if (r2 == 0) goto L_0x044f
            com.instagram.api.schemas.MusicNoteResponseInfo r2 = r2.A07
            if (r2 == 0) goto L_0x044f
            com.instagram.api.schemas.MusicInfo r2 = r2.A00
            r18 = r2
            if (r2 == 0) goto L_0x044f
            X.5y4 r2 = r10.A07
            if (r2 == 0) goto L_0x064b
            java.util.List r2 = r2.A01
            if (r2 == 0) goto L_0x064b
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.api.schemas.NoteEmojiReactionInfo r2 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r2
            if (r2 == 0) goto L_0x064b
            java.lang.String r14 = r2.A02
        L_0x064b:
            com.instagram.api.schemas.TrackData r2 = r18.BUk()
            java.lang.String r15 = r2.getDisplayArtist()
            if (r15 != 0) goto L_0x0656
            r15 = r7
        L_0x0656:
            com.instagram.api.schemas.TrackData r2 = r18.BUk()
            java.lang.String r12 = r2.getTitle()
            if (r12 != 0) goto L_0x0661
            r12 = r7
        L_0x0661:
            r2 = 36328461182319981(0x81108b00023d6d, double:3.0376033624462934E-306)
            boolean r17 = X.182.A06(r5, r1, r2)
            if (r17 == 0) goto L_0x066e
            java.lang.String r7 = r10.A0J
        L_0x066e:
            com.instagram.api.schemas.TrackData r17 = r18.BUk()
            boolean r17 = r17.isExplicit()
            com.instagram.api.schemas.NoteCustomThemeImpl r10 = r10.A06
            r18 = r10
            r10 = 6
            X.0qQ.A0B(r7, r10)
            r10 = r24
            r9.setMusicContentLayout(r10)
            r10 = r18
            r9.setCustomTheme(r10)
            r10 = r17
            r9.A0F(r7, r15, r12, r10)
            int r12 = r15.length()
            r10 = 0
            if (r12 <= 0) goto L_0x06a1
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x06a1
            boolean r2 = X.182.A06(r5, r1, r2)
            r3 = 1
            if (r2 != 0) goto L_0x06a2
        L_0x06a1:
            r3 = 0
        L_0x06a2:
            X.6qj r2 = new X.6qj
            r2.<init>(r9, r3)
            r9.post(r2)
            r9.setVisibility(r6)
            if (r8 == 0) goto L_0x044f
            if (r14 == 0) goto L_0x06bf
            int r2 = r14.length()
            if (r2 == 0) goto L_0x06bf
            r2 = r21
            boolean r2 = X.C378179Ou.A02(r1, r2)
            if (r2 != 0) goto L_0x044c
        L_0x06bf:
            r10 = 8
            goto L_0x044c
        L_0x06c3:
            r2 = r22
            boolean r2 = X.C382039cz.A00(r2, r11)
            if (r2 == 0) goto L_0x06fc
            r2 = r11
            X.9cz r2 = (X.C382039cz) r2
            java.lang.Object r3 = r2.A01
            X.4zZ r3 = (X.C279864zZ) r3
            X.5y2 r2 = r3.A0A
            if (r2 == 0) goto L_0x044f
            com.instagram.api.schemas.LocationNoteResponseInfo r2 = r2.A06
            if (r2 == 0) goto L_0x044f
            java.lang.String r10 = r2.BNl()
            java.lang.String r2 = r3.A0J
            java.lang.CharSequence r3 = X.C66889MeU.A04(r1, r2)
            r2 = r22
            X.0qQ.A0B(r10, r2)
            r9.A0D()
            r9.setLocationContent(r10, r3, r7)
        L_0x06ef:
            X.6qj r2 = new X.6qj
            r2.<init>(r9, r6)
            r9.post(r2)
            r9.setVisibility(r6)
            goto L_0x044f
        L_0x06fc:
            boolean r2 = X.AnonymousClass9IJ.A00(r6, r11)
            if (r2 == 0) goto L_0x0796
            r2 = r11
            X.9IJ r2 = (X.AnonymousClass9IJ) r2
            java.lang.Object r12 = r2.A01
            X.4zZ r12 = (X.C279864zZ) r12
            X.5y2 r2 = r12.A0A
            if (r2 == 0) goto L_0x044f
            com.instagram.api.schemas.ListeningNowResponseInfo r10 = r2.A04
            if (r10 == 0) goto L_0x044f
            r2 = 36328461182319981(0x81108b00023d6d, double:3.0376033624462934E-306)
            boolean r2 = X.182.A06(r5, r1, r2)
            if (r2 == 0) goto L_0x0794
            java.lang.String r14 = r12.A0J
        L_0x071e:
            com.instagram.api.schemas.MusicInfo r15 = r10.A01
            if (r15 == 0) goto L_0x0792
            com.instagram.api.schemas.TrackData r2 = r15.BUk()
            if (r2 == 0) goto L_0x0792
            boolean r3 = r2.isExplicit()
        L_0x072c:
            X.5y4 r2 = r12.A07
            if (r2 == 0) goto L_0x074e
            java.util.List r2 = r2.A01
            if (r2 == 0) goto L_0x074e
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.api.schemas.NoteEmojiReactionInfo r2 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r2
            if (r2 == 0) goto L_0x074e
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L_0x074e
            int r2 = r2.length()
            if (r2 == 0) goto L_0x074e
            r2 = r21
            boolean r2 = X.C378179Ou.A02(r1, r2)
            if (r2 != 0) goto L_0x0750
        L_0x074e:
            r17 = 1
        L_0x0750:
            if (r15 == 0) goto L_0x07bd
            com.instagram.api.schemas.TrackData r2 = r15.BUk()
            if (r2 == 0) goto L_0x075e
            java.lang.String r2 = r2.getDisplayArtist()
            if (r2 != 0) goto L_0x075f
        L_0x075e:
            r2 = r7
        L_0x075f:
            com.instagram.api.schemas.TrackData r10 = r15.BUk()
            if (r10 == 0) goto L_0x076c
            java.lang.String r10 = r10.getTitle()
            if (r10 == 0) goto L_0x076c
            r7 = r10
        L_0x076c:
            com.instagram.api.schemas.NoteCustomThemeImpl r12 = r12.A06
            r10 = 4
            X.0qQ.A0B(r14, r10)
            r9.A0E()
            r9.A0G(r14, r2, r7, r3)
            r9.setCustomTheme(r12)
            r3 = 0
            X.6qj r2 = new X.6qj
            r2.<init>(r9, r6)
            r9.post(r2)
            r9.setVisibility(r6)
            if (r8 == 0) goto L_0x044f
            if (r17 == 0) goto L_0x078d
            r3 = 8
        L_0x078d:
            r8.setVisibility(r3)
            goto L_0x044f
        L_0x0792:
            r3 = 0
            goto L_0x072c
        L_0x0794:
            r14 = r7
            goto L_0x071e
        L_0x0796:
            r2 = 4
            boolean r2 = X.AnonymousClass9IJ.A00(r2, r11)
            if (r2 == 0) goto L_0x044f
            r2 = r11
            X.9IJ r2 = (X.AnonymousClass9IJ) r2
            java.lang.Object r2 = r2.A01
            X.4zZ r2 = (X.C279864zZ) r2
            java.lang.String r3 = r2.A0J
            r2 = r22
            X.0qQ.A0B(r3, r2)
            android.content.Context r2 = r9.getContext()
            int r2 = X.2Yu.A08(r2)
            r9.setContentLayout(r2)
            X.DJa r2 = X.C46017DJa.A00
            r9.setText(r3, r6, r7, r2)
            goto L_0x06ef
        L_0x07bd:
            com.instagram.api.schemas.ListeningNowState r10 = r10.A00
            com.instagram.api.schemas.ListeningNowState r2 = com.instagram.api.schemas.ListeningNowState.NOT_LISTENING
            com.instagram.api.schemas.NoteCustomThemeImpl r7 = r12.A06
            r3 = 0
            if (r10 != r2) goto L_0x07c7
            r3 = 1
        L_0x07c7:
            r2 = r20
            X.0qQ.A0B(r14, r2)
            r9.A0E()
            r9.setCustomTheme(r7)
            r9.A0H(r14, r3)
            r3 = 0
            X.6qj r2 = new X.6qj
            r2.<init>(r9, r6)
            r9.post(r2)
            r9.setVisibility(r6)
            if (r8 == 0) goto L_0x044f
            if (r17 == 0) goto L_0x07e7
            r3 = 8
        L_0x07e7:
            r8.setVisibility(r3)
            goto L_0x044f
        L_0x07ec:
            if (r10 == 0) goto L_0x03d7
            r10.setVisibility(r7)
            goto L_0x03d7
        L_0x07f3:
            r3 = r0
            goto L_0x03be
        L_0x07f6:
            if (r21 == 0) goto L_0x0846
            X.60k r2 = X.C3018660j.A01(r1)
            r2.A0K(r0)
            android.content.Context r3 = r9.getContext()
            X.0qQ.A07(r3)
            r13 = r3
            r14 = r1
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            java.lang.String r2 = X.AnonymousClass4A2.A03(r13, r14, r15, r16, r17, r18, r19)
            if (r2 != 0) goto L_0x0819
            java.lang.String r2 = ""
        L_0x0819:
            X.6qi r1 = X.C319506qi.A00
            java.lang.String r0 = ""
            r9.setText(r2, r6, r0, r1)
            X.C319756rA.A00(r9)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r0 = X.2Yu.A0H(r3, r0)
            r9.setContentLayout(r0)
            X.6qj r0 = new X.6qj
            r0.<init>(r9, r6)
            r9.post(r0)
            r9.setVisibility(r6)
            if (r4 == 0) goto L_0x083d
            r4.A03(r7)
        L_0x083d:
            X.6qk r2 = new X.6qk
            r0 = r42
            r2.<init>(r12, r9, r0)
            goto L_0x059f
        L_0x0846:
            r9.setVisibility(r7)
            if (r11 == 0) goto L_0x084e
            r11.setVisibility(r7)
        L_0x084e:
            if (r4 == 0) goto L_0x034b
            r4.A03(r7)
            return
        L_0x0854:
            r4 = r41
            boolean r4 = A03(r1, r3, r4, r6)
            if (r4 == 0) goto L_0x0887
            android.content.Context r4 = r44.requireContext()
            r9 = 0
            android.graphics.drawable.Drawable r8 = X.1QE.A0D(r4, r9)
            X.2eb r7 = r0.A0O
            android.view.View r5 = r7.A01()
            r4 = 2131439408(0x7f0b2f30, float:1.850077E38)
            android.view.View r4 = r5.requireViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4.setImageDrawable(r8)
            r7.A03(r9)
            android.view.View r8 = r7.A01()
            X.6qg r7 = new X.6qg
            r4 = r42
            r7.<init>(r4, r3)
            goto L_0x021f
        L_0x0887:
            X.2eb r4 = r0.A0O
            r7 = 8
            r4.A03(r7)
            goto L_0x0224
        L_0x0890:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r4 = r4.A01
            int r5 = r4.intValue()
            r4 = 0
            if (r5 != r6) goto L_0x08a0
            r4 = 1119092736(0x42b40000, float:90.0)
        L_0x08a0:
            r7.setRotation(r4)
            if (r51 == 0) goto L_0x01d6
            goto L_0x01cc
        L_0x08a7:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r4 = r4.A01
            if (r4 == r8) goto L_0x0187
            if (r51 == 0) goto L_0x0187
            com.instagram.model.reels.Reel r4 = r2.A00()
            com.instagram.api.schemas.RingSpec r4 = X.AnonymousClass3NW.A00(r1, r4)
            r7.setGradientColors((com.instagram.api.schemas.RingSpec) r4)
            goto L_0x0187
        L_0x08bf:
            r7.A02()
            goto L_0x0172
        L_0x08c4:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r6 = r4.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            if (r6 == r4) goto L_0x0143
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r6 = r4.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r6 != r4) goto L_0x08e7
            X.2eb r6 = r0.A0S
            android.view.View r4 = r6.A01()
            if (r4 == 0) goto L_0x0143
        L_0x08e2:
            r6.A03(r5)
            goto L_0x0143
        L_0x08e7:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r6 = r4.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r6 != r4) goto L_0x0901
            X.2eb r6 = r0.A0U
            X.2eb r4 = r0.A0S
            android.view.View r4 = r4.A01()
            if (r4 == 0) goto L_0x0143
            boolean r4 = r0.A0I
            if (r4 != 0) goto L_0x0143
            goto L_0x08e2
        L_0x0901:
            X.70M r4 = r0.A0D
            r4.getClass()
            java.lang.Integer r6 = r4.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            if (r6 != r4) goto L_0x0913
            boolean r4 = r0.A0I
            if (r4 != 0) goto L_0x0913
            X.2eb r6 = r0.A0T
            goto L_0x08e2
        L_0x0913:
            X.2eb r4 = r0.A09
            if (r4 == 0) goto L_0x091a
            r4.A03(r5)
        L_0x091a:
            X.2eb r7 = r0.A0Q
            r7.A03(r5)
            android.view.View r4 = r0.A00
            if (r4 != 0) goto L_0x0930
            android.view.View r6 = r7.A01()
            r4 = 2131428564(0x7f0b04d4, float:1.8478776E38)
            android.view.View r4 = r6.requireViewById(r4)
            r0.A00 = r4
        L_0x0930:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A08
            if (r4 != 0) goto L_0x0943
            android.view.View r6 = r7.A01()
            r4 = 2131428569(0x7f0b04d9, float:1.8478786E38)
            android.view.View r4 = r6.requireViewById(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = (com.instagram.common.ui.widget.imageview.IgImageView) r4
            r0.A08 = r4
        L_0x0943:
            com.instagram.common.ui.base.IgTextView r4 = r0.A05
            if (r4 != 0) goto L_0x0956
            android.view.View r6 = r7.A01()
            r4 = 2131428571(0x7f0b04db, float:1.847879E38)
            android.view.View r4 = r6.requireViewById(r4)
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            r0.A05 = r4
        L_0x0956:
            if (r51 == 0) goto L_0x0143
            boolean r4 = r2.A04()
            if (r4 == 0) goto L_0x0143
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.3NV r7 = r4.A0E()
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            boolean r4 = r4.A0j()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            if (r4 == 0) goto L_0x0995
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            X.4w0 r4 = r4.A02
            if (r4 == 0) goto L_0x0995
            com.instagram.model.reels.Reel r4 = r2.A01(r1)
            X.4gL r4 = r4.A0H
            X.4w0 r4 = r4.A02
            X.4vt r4 = r4.A0A
            boolean r4 = r4.CVs()
            if (r4 == 0) goto L_0x0995
            r5 = 1
        L_0x0995:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            android.view.View r4 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r0.A08
            com.instagram.common.ui.base.IgTextView r6 = r0.A05
            X.C278194wQ.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0143
        L_0x09a4:
            if (r46 == 0) goto L_0x0c60
            boolean r4 = X.2R8.A04(r1, r3)
            boolean r4 = X.DcE.A06(r1, r4)
            if (r4 == 0) goto L_0x0c60
            boolean r4 = r7.A08
            if (r4 == 0) goto L_0x0c60
            r6 = 0
            X.0Tu r11 = X.0Tu.A05
            r4 = 36325351626322839(0x810db700073397, double:3.035636866712524E-306)
            boolean r4 = X.182.A06(r11, r1, r4)
            r5 = 0
            if (r4 == 0) goto L_0x0c5d
            X.6iw r4 = new X.6iw
            r4.<init>(r1)
            X.2YN r8 = new X.2YN
            r8.<init>(r4, r13)
            java.lang.Class<X.6i2> r4 = X.C314336i2.class
            X.2YL r10 = r8.A00(r4)
            X.6i2 r10 = (X.C314336i2) r10
        L_0x09d5:
            X.2eb r4 = r0.A0R
            r40 = r4
            r8 = 4
            android.view.View r4 = r40.A01()
            X.72n r4 = (X.C3254672n) r4
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r4.A03
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 != 0) goto L_0x0ba1
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A0N
            if (r4 == 0) goto L_0x09ef
            r4.setVisibility(r8)
        L_0x09ef:
            android.view.View r8 = r40.A01()
            com.instagram.avatars.coinflip.ProfileCoinFlipView r8 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r8
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.content.res.Resources r14 = r13.getResources()
            X.0qQ.A0B(r14, r12)
            r4 = 36327795462781643(0x810ff000083acb, double:3.037182358729611E-306)
            boolean r17 = X.182.A06(r11, r1, r4)
            r9 = 2131165702(0x7f070206, float:1.7945629E38)
            if (r17 == 0) goto L_0x0a11
            r9 = 2131165281(0x7f070061, float:1.7944775E38)
        L_0x0a11:
            int r9 = r14.getDimensionPixelSize(r9)
            r15.height = r9
            r15.width = r9
            android.content.Context r9 = r8.getContext()
            boolean r4 = X.182.A06(r11, r1, r4)
            r5 = 2131165702(0x7f070206, float:1.7945629E38)
            if (r4 == 0) goto L_0x0a29
            r5 = 2131165281(0x7f070061, float:1.7944775E38)
        L_0x0a29:
            r4 = 2131165196(0x7f07000c, float:1.7944602E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            X.C320966tM.A03(r9, r8, r1, r4, r5)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.2eS.A04(r8, r4)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = r7.A06
            X.6tQ r5 = A00(r9, r4, r1)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = r7.A05
            X.6tQ r4 = A00(r9, r4, r1)
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r5, r4)
            r8.setAvatarDrawables(r4)
            com.instagram.common.typedurl.ImageUrl r5 = r3.Bh3()
            r4 = r43
            r8.setProfilePicUrl(r5, r4)
            boolean r4 = X.2R8.A04(r1, r3)
            if (r4 != 0) goto L_0x0a67
            r4 = 36325343035995016(0x810db500013388, double:3.035631434154618E-306)
            boolean r4 = X.182.A06(r11, r1, r4)
            r30 = 1
            if (r4 != 0) goto L_0x0a69
        L_0x0a67:
            r30 = 0
        L_0x0a69:
            android.view.ViewGroup r14 = r0.A0J
            r4 = r41
            java.util.ArrayList r23 = r0.A01(r1, r2, r3, r4)
            boolean r28 = X.DcE.A01(r1)
            X.6tJ r21 = X.C320946tJ.PROFILE_PICTURE
            X.6tm r24 = new X.6tm
            r31 = r24
            r32 = r13
            r33 = r8
            r34 = r10
            r35 = r43
            r36 = r1
            r37 = r0
            r38 = r3
            r39 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            X.6tn r25 = new X.6tn
            r31 = r25
            r32 = r7
            r33 = r1
            r34 = r0
            r35 = r3
            r36 = r30
            r31.<init>(r32, r33, r34, r35, r36)
            X.6to r26 = new X.6to
            r31 = r26
            r32 = r13
            r33 = r8
            r34 = r43
            r35 = r1
            r36 = r0
            r37 = r42
            r38 = r2
            r39 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            X.6tp r5 = new X.6tp
            r4 = r42
            r5.<init>(r0, r4, r2, r3)
            X.6tq r4 = new X.6tq
            r27 = r5
            r29 = r12
            r20 = r14
            r22 = r8
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A03 = r4
            r4 = r43
            X.C320966tM.A01(r9, r7, r8, r4, r1)
            r8.setVisibility(r6)
            boolean r4 = X.2R8.A04(r1, r3)
            if (r4 != 0) goto L_0x0af4
            boolean r4 = r7.A09
            if (r4 == 0) goto L_0x0af4
            r4 = 2000(0x7d0, double:9.88E-321)
            boolean r8 = r0.A0H
            if (r8 == 0) goto L_0x0af4
            r0.A0H = r6
            android.view.View r9 = r0.AeY()
            X.Ddo r8 = new X.Ddo
            r8.<init>(r7, r1, r0, r3)
            r9.postDelayed(r8, r4)
        L_0x0af4:
            android.view.View r4 = r40.A01()
            X.72n r4 = (X.C3254672n) r4
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r4.A03
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0b2a
            android.view.View r8 = r40.A01()
            X.72n r8 = (X.C3254672n) r8
            X.0qQ.A0B(r8, r12)
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r4 = r7.A04
            if (r4 == 0) goto L_0x0b1b
            java.lang.String r5 = r4.A01
            if (r5 == 0) goto L_0x0b1b
            java.lang.String r4 = r8.A04
            boolean r4 = X.0qQ.A0K(r4, r5)
            if (r4 != 0) goto L_0x0b2a
        L_0x0b1b:
            android.view.View r8 = r40.A01()
            com.instagram.avatars.coinflip.ProfileCoinFlipView r8 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r8
            android.content.Context r5 = r8.getContext()
            r4 = r43
            X.C320966tM.A01(r5, r7, r8, r4, r1)
        L_0x0b2a:
            boolean r4 = X.2R8.A04(r1, r3)
            if (r4 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x0b8b
            X.6o5 r5 = r10.A01
            com.instagram.avatars.store.AvatarStore r4 = r5.A01
            boolean r4 = X.C317936o5.A02(r4)
            if (r4 != 0) goto L_0x0b8b
            com.instagram.common.session.UserSession r9 = r5.A02
            boolean r4 = X.C314866iy.A00(r9)
            if (r4 != 0) goto L_0x0b8b
            X.6o6 r4 = r5.A00
            X.26t r4 = r4.A00
            X.0xa r4 = r4.A00
            java.lang.String r8 = "key_has_seen_avatar_convergence_flip_animation"
            boolean r4 = r4.getBoolean(r8, r6)
            if (r4 != 0) goto L_0x0b8b
            boolean r4 = X.C317936o5.A00(r5)
            if (r4 != 0) goto L_0x0b8b
            X.0qQ.A0B(r9, r6)
            r4 = 36325351626322839(0x810db700073397, double:3.035636866712524E-306)
            boolean r4 = X.182.A06(r11, r9, r4)
            if (r4 == 0) goto L_0x0b8b
            r4 = 500(0x1f4, double:2.47E-321)
            android.view.ViewGroup r9 = r0.A0J
            r9.setEnabled(r6)
            X.6o6 r6 = r10.A00
            X.26t r6 = r6.A00
            X.0xa r6 = r6.A00
            X.0xY r6 = r6.AR4()
            r6.E5T(r8, r12)
            r6.apply()
            android.view.View r8 = r0.AeY()
            X.FvS r6 = new X.FvS
            r6.<init>(r7, r1, r0, r3)
        L_0x0b86:
            r8.postDelayed(r6, r4)
            goto L_0x010e
        L_0x0b8b:
            boolean r4 = r7.A0A
            if (r4 == 0) goto L_0x010e
            r4 = 500(0x1f4, double:2.47E-321)
            boolean r8 = r0.A0H
            if (r8 == 0) goto L_0x010e
            r0.A0H = r6
            android.view.View r8 = r0.AeY()
            X.Ddo r6 = new X.Ddo
            r6.<init>(r7, r1, r0, r3)
            goto L_0x0b86
        L_0x0ba1:
            android.view.View r4 = r40.A01()
            X.72n r4 = (X.C3254672n) r4
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r4.A03
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0bfb
            android.view.View r9 = r40.A01()
            com.instagram.avatars.coinflip.ProfileCoinFlipView r9 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r9
            java.util.List r4 = r9.A02
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0bd1
            java.util.List r4 = r9.A02
            java.lang.Object r4 = r4.get(r6)
            X.6tR r4 = (X.C321016tR) r4
            java.lang.String r9 = r4.A0l
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = r7.A06
            java.lang.String r4 = r4.A03
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x0bfb
        L_0x0bd1:
            android.view.View r8 = r40.A01()
            com.instagram.avatars.coinflip.ProfileCoinFlipView r8 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r8
            android.view.ViewGroup r4 = r0.A0J
            android.content.Context r9 = r4.getContext()
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = r7.A06
            X.6tQ r5 = A00(r9, r4, r1)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r4 = r7.A05
            X.6tQ r4 = A00(r9, r4, r1)
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r5, r4)
            r8.setAvatarDrawables(r4)
            X.6tJ r5 = r8.A01
            X.6tJ r4 = X.C320946tJ.AVATAR
            if (r5 != r4) goto L_0x0af4
            com.instagram.avatars.coinflip.ProfileCoinFlipView.A00(r8)
            goto L_0x0af4
        L_0x0bfb:
            android.view.View r4 = r40.A01()
            X.72n r4 = (X.C3254672n) r4
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r4.A03
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0af4
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A0N
            if (r4 == 0) goto L_0x0c10
            r4.setVisibility(r8)
        L_0x0c10:
            android.view.View r8 = r40.A01()
            com.instagram.avatars.coinflip.ProfileCoinFlipView r8 = (com.instagram.avatars.coinflip.ProfileCoinFlipView) r8
            r8.setVisibility(r6)
            com.instagram.common.typedurl.ImageUrl r9 = r3.Bh3()
            r4 = r43
            r8.setProfilePicUrl(r9, r4)
            X.6tJ r9 = r7.A00
            if (r9 == 0) goto L_0x0c36
            X.6tq r4 = r0.A03
            if (r4 == 0) goto L_0x0c36
            r8.A0F(r9)
            X.6tq r9 = r0.A03
            X.6tJ r4 = r7.A00
            r9.A04(r4)
            r7.A00 = r5
        L_0x0c36:
            X.6tq r5 = r0.A03
            if (r5 == 0) goto L_0x0af4
            X.6tx r4 = new X.6tx
            r19 = r4
            r20 = r13
            r21 = r8
            r22 = r43
            r23 = r1
            r24 = r0
            r25 = r42
            r26 = r2
            r27 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r5.A02 = r4
            r4 = r41
            java.util.ArrayList r4 = r0.A01(r1, r2, r3, r4)
            r5.A01 = r4
            goto L_0x0af4
        L_0x0c5d:
            r10 = r5
            goto L_0x09d5
        L_0x0c60:
            android.view.View r4 = r0.AeY()
            boolean r4 = r4 instanceof com.instagram.avatars.coinflip.ProfileCoinFlipView
            r7 = 0
            if (r4 == 0) goto L_0x0c77
            android.view.View r5 = r0.AeY()
            r4 = 8
            r5.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r0.A0N
            r4.setVisibility(r7)
        L_0x0c77:
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r3.A0E()
            if (r4 == 0) goto L_0x0d5c
            X.0Tu r8 = X.0Tu.A06
            r4 = 36324668726194392(0x810d18000230d8, double:3.035204997921476E-306)
            boolean r4 = X.182.A06(r8, r1, r4)
            if (r4 != 0) goto L_0x0d5c
            X.0Tu r8 = X.0Tu.A05
            r4 = 36324668726259929(0x810d18000330d9, double:3.035204997962922E-306)
            boolean r4 = X.182.A06(r8, r1, r4)
            if (r4 == 0) goto L_0x0d5c
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r0.A0N
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r3.A0E()
        L_0x0c9d:
            r4 = r43
            r8.setUrl(r5, r4)
            X.70N r5 = new X.70N
            r4 = r42
            r5.<init>(r0, r4, r2, r3)
            X.AnonymousClass0fU.A00(r5, r8)
            X.70O r5 = new X.70O
            r5.<init>(r4, r2, r3)
            r8.setOnLongClickListener(r5)
            boolean r4 = r8.A0N
            if (r4 == 0) goto L_0x0cca
            X.0Tu r9 = X.0Tu.A05
            r4 = 36325274316649268(0x810da500033334, double:3.0355879757636565E-306)
            boolean r4 = X.182.A06(r9, r1, r4)
            if (r4 == 0) goto L_0x0cca
            r4 = r42
            r4.DaA(r7)
        L_0x0cca:
            X.70P r5 = new X.70P
            r4 = r42
            r5.<init>(r4)
            r8.A0E = r5
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r4.A01(r1)
            boolean r9 = r3.equals(r4)
            if (r9 == 0) goto L_0x0d27
            if (r51 == 0) goto L_0x0d1c
            r4 = 2131970085(0x7f134825, float:1.9577111E38)
            java.lang.String r7 = r6.getString(r4)
            java.util.List r4 = r2.A01
            java.util.Iterator r5 = r4.iterator()
        L_0x0cee:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0d18
            java.lang.Object r4 = r5.next()
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            boolean r4 = r4.A16(r1)
            if (r4 != 0) goto L_0x0cee
            r4 = 2131969124(0x7f134464, float:1.9575162E38)
        L_0x0d03:
            java.lang.String r5 = r6.getString(r4)
        L_0x0d07:
            if (r7 == 0) goto L_0x0113
            if (r5 == 0) goto L_0x0113
            X.6qf r4 = new X.6qf
            r4.<init>(r6, r7, r9)
            X.03v.A0B(r8, r4)
            r8.setContentDescription(r5)
            goto L_0x0113
        L_0x0d18:
            r4 = 2131969123(0x7f134463, float:1.957516E38)
            goto L_0x0d03
        L_0x0d1c:
            r4 = 2131969886(0x7f13475e, float:1.9576708E38)
            java.lang.String r7 = r6.getString(r4)
            r4 = 2131969122(0x7f134462, float:1.9575158E38)
            goto L_0x0d03
        L_0x0d27:
            if (r51 == 0) goto L_0x0d67
            r4 = 2131970085(0x7f134825, float:1.9577111E38)
            java.lang.String r7 = r6.getString(r4)
            java.util.List r4 = r2.A01
            java.util.Iterator r5 = r4.iterator()
        L_0x0d36:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0d58
            java.lang.Object r4 = r5.next()
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            boolean r4 = r4.A16(r1)
            if (r4 != 0) goto L_0x0d36
            r5 = 2131970074(0x7f13481a, float:1.9577089E38)
        L_0x0d4b:
            java.lang.String r4 = r3.getUsername()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = r6.getString(r5, r4)
            goto L_0x0d07
        L_0x0d58:
            r5 = 2131970065(0x7f134811, float:1.957707E38)
            goto L_0x0d4b
        L_0x0d5c:
            r3.Bh3()
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r0.A0N
            com.instagram.common.typedurl.ImageUrl r5 = r3.Bh3()
            goto L_0x0c9d
        L_0x0d67:
            r4 = 2
            r8.setImportantForAccessibility(r4)
            goto L_0x0113
        L_0x0d6d:
            boolean r4 = r2.A04()
            if (r4 == 0) goto L_0x0d77
            X.70M r6 = X.AnonymousClass70M.A05
            goto L_0x0057
        L_0x0d77:
            r5 = 0
            r11 = 0
            r10 = 0
            boolean r4 = r2.A05(r1)
            if (r4 != 0) goto L_0x0ded
            boolean r4 = r2.A04()
            if (r4 != 0) goto L_0x0ded
            java.util.ArrayList r4 = r2.A02(r1)
            java.util.Iterator r9 = r4.iterator()
        L_0x0d8e:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0dc9
            java.lang.Object r8 = r9.next()
            com.instagram.model.reels.Reel r8 = (com.instagram.model.reels.Reel) r8
            boolean r4 = r8.A15(r1)
            r4 = r4 ^ 1
            X.17k.A0F(r4)
            boolean r4 = r8.A0d()
            r4 = r4 ^ 1
            X.17k.A0F(r4)
            boolean r4 = r8.A16(r1)
            if (r4 != 0) goto L_0x0db3
            r10 = 1
        L_0x0db3:
            r6 = 0
            if (r5 != 0) goto L_0x0dbd
            boolean r4 = r8.A0x(r1)
            r5 = 0
            if (r4 == 0) goto L_0x0dbe
        L_0x0dbd:
            r5 = 1
        L_0x0dbe:
            if (r11 != 0) goto L_0x0dc6
            boolean r4 = r8.A11(r1)
            if (r4 == 0) goto L_0x0dc7
        L_0x0dc6:
            r6 = 1
        L_0x0dc7:
            r11 = r6
            goto L_0x0d8e
        L_0x0dc9:
            if (r10 == 0) goto L_0x0ded
            if (r5 == 0) goto L_0x0dd7
            if (r12 == 0) goto L_0x0dd3
            X.70M r6 = X.AnonymousClass70M.A0D
            goto L_0x0057
        L_0x0dd3:
            X.70M r6 = X.AnonymousClass70M.A0C
            goto L_0x0057
        L_0x0dd7:
            if (r11 == 0) goto L_0x0de3
            if (r12 == 0) goto L_0x0ddf
            X.70M r6 = X.AnonymousClass70M.A0F
            goto L_0x0057
        L_0x0ddf:
            X.70M r6 = X.AnonymousClass70M.A0E
            goto L_0x0057
        L_0x0de3:
            if (r12 == 0) goto L_0x0de9
            X.70M r6 = X.AnonymousClass70M.A0H
            goto L_0x0057
        L_0x0de9:
            X.70M r6 = X.AnonymousClass70M.A0G
            goto L_0x0057
        L_0x0ded:
            if (r12 == 0) goto L_0x0e49
            X.70M r6 = X.AnonymousClass70M.A0B
            goto L_0x0057
        L_0x0df3:
            if (r4 != 0) goto L_0x0dfd
            boolean r4 = r3.A1Y()
            if (r4 == 0) goto L_0x0dfd
            goto L_0x0055
        L_0x0dfd:
            boolean r4 = r3.A1n()
            if (r4 == 0) goto L_0x0057
            boolean r4 = r3.A1a()
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = r3.getId()
            boolean r4 = X.2R8.A05(r1, r4)
            if (r4 == 0) goto L_0x0057
            X.0Tu r8 = X.0Tu.A05
            r4 = 36599611057901151(0x82072700060e5f, double:3.2090796355967375E-306)
            long r4 = X.182.A01(r8, r1, r4)
            int r9 = (int) r4
            if (r9 == r10) goto L_0x0e28
            r4 = 2
            if (r9 != r4) goto L_0x0057
            X.70M r6 = X.AnonymousClass70M.A08
            goto L_0x0057
        L_0x0e28:
            if (r45 == 0) goto L_0x0e45
            r4 = r16
            X.5y2 r4 = r4.A0A
            if (r4 == 0) goto L_0x0e45
            X.60C r4 = r4.A09
            if (r4 == 0) goto L_0x0e45
            com.instagram.api.schemas.NotePogVideoDict r4 = r4.A01
            if (r4 == 0) goto L_0x0e45
            r4 = 36322207710062595(0x810adb00042803, double:3.033648641410011E-306)
            boolean r4 = X.182.A06(r8, r1, r4)
            if (r4 == 0) goto L_0x0e45
            goto L_0x0057
        L_0x0e45:
            X.70M r6 = X.AnonymousClass70M.A09
            goto L_0x0057
        L_0x0e49:
            X.70M r6 = X.AnonymousClass70M.A0A
            goto L_0x0057
        L_0x0e4d:
            r7 = 8
            r12 = 1
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r0.A0N
            int r2 = r5.getVisibility()
            if (r2 != 0) goto L_0x0e66
            android.content.Context r4 = r44.requireContext()
            r2 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            r5.setImageDrawable(r2)
        L_0x0e66:
            X.AnonymousClass70F.A00(r0)
            r0.A02()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = r0.A0V
            r2 = 4
            r4.setVisibility(r2)
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70L.A02(androidx.fragment.app.Fragment, X.4zZ, com.instagram.avatars.coinflip.AvatarCoinFlipConfig, X.0iw, com.instagram.common.session.UserSession, X.70F, X.6xF, X.6rP, X.2bv, X.2qT, com.instagram.user.model.User, boolean, boolean, boolean):void");
    }
}
