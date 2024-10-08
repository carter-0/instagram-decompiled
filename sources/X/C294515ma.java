package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5ma  reason: invalid class name and case insensitive filesystem */
public abstract class C294515ma {
    public static void A01(UserSession userSession, C255773uh r7, AnonymousClass3BT r8, C241103Nw r9, boolean z) {
        Resources resources = r9.A07.getResources();
        View view = r9.A08;
        0nA.A0V(view, resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height));
        view.setAlpha(0.5f);
        if (AnonymousClass3NF.A01(userSession, r8)) {
            view.setVisibility(4);
            r9.A09.setVisibility(4);
            return;
        }
        if (!z) {
            view.setVisibility(0);
            if (!182.A06(0Tu.A05, userSession, 36322044501108637L)) {
                return;
            }
        } else if (r8.A04 != AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY || r7 == null || !182.A06(0Tu.A05, userSession, 36325330151093112L)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        r9.A09.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x012d, code lost:
        if (r8.equals(r12) != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0166, code lost:
        if (X.182.A06(r11, r5, 36324286474235843L) != false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x033d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r26, X.AnonymousClass0iw r27, com.instagram.common.session.UserSession r28, X.AnonymousClass3O9 r29, X.C255773uh r30, X.AnonymousClass3BT r31, X.AnonymousClass3BT r32, X.C296845qj r33, X.C293245kP r34, X.C241103Nw r35, X.C230242pG r36, java.lang.Integer r37, java.lang.String r38, java.util.List r39, int r40) {
        /*
            r5 = r28
            X.5mc r1 = X.C294525mb.A00(r5)
            r9 = r31
            java.lang.String r0 = X.AnonymousClass3Mb.A01(r5, r9)
            r1.A0D(r9, r0)
            r3 = r35
            r3.A02 = r9
            r7 = 1
            X.0qQ.A0B(r5, r7)
            X.5mc r0 = X.C294525mb.A00(r5)
            com.instagram.model.reels.Reel r2 = r9.A03
            r0.A0B(r2)
            X.5md r11 = new X.5md
            r23 = r38
            r22 = r37
            r25 = r40
            r6 = r27
            r24 = r39
            r10 = r26
            r15 = r29
            r4 = r30
            r18 = r33
            r19 = r34
            r21 = r36
            r13 = r6
            r14 = r5
            r16 = r4
            r17 = r9
            r20 = r3
            r12 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.A04 = r11
            X.3BQ r8 = r9.A04
            android.content.Context r0 = r3.A07
            r22 = r0
            android.content.res.Resources r11 = r22.getResources()
            X.9I1 r0 = X.C294555me.A00(r0, r5, r8)
            if (r0 == 0) goto L_0x0061
            int r12 = r0.A01
            r3.A00 = r12
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r3.A0J
            int r0 = r0.A00
            X.0nA.A0g(r1, r12, r0)
        L_0x0061:
            X.3BQ r18 = X.AnonymousClass3BQ.MAIN_FEED_TRAY
            r0 = r18
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x04e8
            X.3N6 r0 = r3.A0G
            android.widget.LinearLayout r12 = r0.A05
            X.0Tu r13 = X.0Tu.A05
            r0 = 36322044501174174(0x810ab50002279e, double:3.033545427451784E-306)
            boolean r1 = X.182.A06(r13, r5, r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r1 == 0) goto L_0x0082
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L_0x0082:
            int r0 = r11.getDimensionPixelSize(r0)
            X.0nA.A0T(r12, r0)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x008c:
            int r12 = r11.getDimensionPixelSize(r0)
            X.3N8 r1 = r3.A0F
            android.view.View r0 = r1.A01()
            X.0nA.A0Y(r0, r12)
            android.view.View r0 = r1.A01()
            X.0nA.A0a(r0, r12)
            android.widget.TextView r0 = r1.A03()
            X.0nA.A0Y(r0, r12)
            android.widget.TextView r0 = r1.A03()
            X.0nA.A0a(r0, r12)
        L_0x00ae:
            boolean r0 = X.AnonymousClass3NF.A00(r5, r9)
            if (r0 == 0) goto L_0x00d7
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r14 = r11.getDimensionPixelSize(r0)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r13 = r11.getDimensionPixelSize(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r12 = r3.A0J
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r1 = r11.topMargin
            int r0 = r11.bottomMargin
            r11.setMargins(r13, r1, r13, r0)
            r12.setLayoutParams(r11)
            r12.setCornerRadius(r14)
        L_0x00d7:
            boolean r0 = X.AnonymousClass3NF.A00(r5, r9)
            if (r0 == 0) goto L_0x011a
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322044501174174(0x810ab50002279e, double:3.033545427451784E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x011a
            X.3N8 r0 = r3.A0F
            android.widget.TextView r0 = r0.A03()
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r7, r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0B
            r0.setTextSize(r7, r1)
            boolean r0 = r2.A0t()
            if (r0 != 0) goto L_0x04da
            boolean r0 = X.AnonymousClass3NF.A02(r5, r9)
            if (r0 != 0) goto L_0x04da
            X.3N6 r0 = r3.A0G
            android.view.View r11 = r0.A00()
            android.content.res.Resources r1 = r22.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
        L_0x0113:
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0X(r11, r0)
        L_0x011a:
            X.3N6 r13 = r3.A0G
            X.AnonymousClass3ND.A00(r5, r9, r13)
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x012f
            X.3BQ r12 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            boolean r0 = r8.equals(r12)
            if (r0 == 0) goto L_0x0178
        L_0x012f:
            X.3BQ r12 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            boolean r0 = r8.equals(r12)
            r14 = 0
            if (r0 != 0) goto L_0x0168
            X.0Tu r11 = X.0Tu.A05
            r0 = 36324286474301380(0x810cbf00052fc4, double:3.03496326028513E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x015d
            android.widget.LinearLayout r15 = r13.A05
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 17
            r1.gravity = r0
            X.0nA.A0T(r15, r14)
            X.AZO r1 = new X.AZO
            r1.<init>()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0C
            r0.A0I = r1
        L_0x015d:
            r0 = 36324286474235843(0x810cbf00042fc3, double:3.0349632602436844E-306)
            boolean r0 = X.182.A06(r11, r5, r0)
            if (r0 == 0) goto L_0x0178
        L_0x0168:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r11 = r3.A0J
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r11.setCornerRadius(r0)
        L_0x0178:
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A08(r2)
            X.3N8 r0 = r3.A0F
            r20 = r0
            r11 = 0
            X.AnonymousClass3NE.A00(r5, r4, r9, r0, r11)
            X.Ndv r1 = r3.A0H
            if (r1 == 0) goto L_0x047f
            A01(r5, r4, r9, r3, r7)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            com.instagram.user.model.User r0 = r2.A0D()
            X.0eM r14 = r1.A01
            java.lang.Object r15 = r14.getValue()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r15 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r15
            r1 = 0
            if (r0 == 0) goto L_0x047c
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
        L_0x01a5:
            r15.A0F(r1, r6, r0)
            java.lang.Object r1 = r14.getValue()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r1
            r0 = 0
            if (r8 == r12) goto L_0x01b2
            r0 = 1
        L_0x01b2:
            r1.setGradientSpinnerVisible(r0)
            java.lang.Object r1 = r14.getValue()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r1
            boolean r0 = r2.A16(r5)
            r0 = r0 ^ 1
            r1.setGradientSpinnerActivated(r0)
        L_0x01c4:
            X.0qq r1 = X.AnonymousClass0qo.A00(r10)
            X.0qm r0 = X.0qm.A13
            android.graphics.Typeface r14 = r1.A02(r0)
            android.widget.TextView r1 = r20.A04()
            r0 = -1
            r1.setTextColor(r0)
            android.widget.TextView r0 = r20.A04()
            r0.setTypeface(r14)
            android.widget.TextView r1 = r20.A05()
            if (r1 == 0) goto L_0x01f8
            android.content.res.Resources r15 = r10.getResources()
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r10, r0)
            int r0 = r15.getColor(r0)
            r1.setTextColor(r0)
            r1.setTypeface(r14)
        L_0x01f8:
            r0 = 2130970922(0x7f04092a, float:1.7550568E38)
            int r1 = X.2Yu.A0G(r10, r0)
            android.widget.LinearLayout r0 = r13.A05
            r0.setPadding(r11, r11, r11, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r14 = r3.A0C
            r14.A09()
            X.2eb r0 = r3.A0D
            r19 = r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0214
            r19.A02()
        L_0x0214:
            boolean r0 = X.AnonymousClass3NF.A00(r5, r9)
            if (r0 == 0) goto L_0x0293
            X.0Tu r15 = X.0Tu.A05
            r0 = 36322044501567393(0x810ab5000827a1, double:3.033545427700457E-306)
            boolean r0 = X.182.A06(r15, r5, r0)
            if (r0 == 0) goto L_0x0293
            r0 = 2131100246(0x7f060256, float:1.7812868E38)
            int r0 = r10.getColor(r0)
            r14.setBackgroundColor(r0)
        L_0x0231:
            if (r8 != r12) goto L_0x0272
            if (r4 == 0) goto L_0x0272
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325330151093112(0x810db200013378, double:3.035623285690771E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 == 0) goto L_0x0272
            X.6lK r12 = r3.A05
            if (r12 != 0) goto L_0x0268
            X.3oV r0 = r3.A0E
            android.view.View r1 = r0.getView()
            r0 = 2131443002(0x7f0b3d3a, float:1.850806E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r0
            X.0qQ.A0B(r0, r7)
            r13 = 0
            X.6lK r12 = new X.6lK
            r14 = r5
            r15 = r13
            r16 = r13
            r17 = r0
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.A05 = r12
        L_0x0268:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r12.A04
            X.IWt r0 = new X.IWt
            r0.<init>(r6, r5, r1)
            X.AnonymousClass6US.A00(r5, r2, r4, r12, r0)
        L_0x0272:
            X.5mc r3 = X.C294525mb.A00(r5)
            boolean r0 = X.C294535mc.A02(r3)
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = r2.getId()
            X.0qQ.A07(r0)
            java.lang.Long r0 = X.C294535mc.A01(r3, r0)
            if (r0 == 0) goto L_0x0292
            long r1 = r0.longValue()
            X.1QP r0 = r3.A00
            r0.flowEndSuccess(r1)
        L_0x0292:
            return
        L_0x0293:
            r14.setVisibility(r11)
            r1 = 2131435124(0x7f0b1e74, float:1.8492081E38)
            r0 = 0
            r14.setTag(r1, r0)
            X.5mc r15 = X.C294525mb.A00(r5)
            r15.A07(r2)
            boolean r15 = r2.A0t()
            if (r15 == 0) goto L_0x0379
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A05(r2)
            android.graphics.drawable.GradientDrawable$Orientation r16 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            java.lang.String r0 = "#FFD400"
            int r15 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#FF7000"
            int r13 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#FF0067"
            int r1 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#E700CB"
            int r0 = android.graphics.Color.parseColor(r0)
            int[] r13 = new int[]{r15, r13, r1, r0}
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r0 = r16
            r1.<init>(r0, r13)
            r14.setImageDrawable(r1)
        L_0x02d9:
            boolean r0 = X.AnonymousClass3NF.A00(r5, r9)
            if (r0 == 0) goto L_0x02f3
            X.0Tu r13 = X.0Tu.A05
            r0 = 36322044502222762(0x810ab5001227aa, double:3.033545428114915E-306)
            boolean r0 = X.182.A06(r13, r5, r0)
            if (r0 == 0) goto L_0x02f3
            X.AZP r0 = new X.AZP
            r0.<init>()
            r14.A0I = r0
        L_0x02f3:
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A0A(r2)
            android.widget.TextView r1 = r20.A04()
            r0 = r18
            if (r8 != r0) goto L_0x0375
            boolean r0 = X.AnonymousClass3NF.A01(r5, r9)
            if (r0 == 0) goto L_0x0361
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
        L_0x030b:
            int r0 = r10.getColor(r0)
            r1.setTextColor(r0)
        L_0x0312:
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A09(r2)
            boolean r0 = r2.A1Y
            if (r0 == 0) goto L_0x033d
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r3.A0J
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0321:
            r1.setAlpha(r0)
        L_0x0324:
            boolean r0 = X.AnonymousClass3NF.A00(r5, r9)
            if (r0 == 0) goto L_0x0231
            A01(r5, r4, r9, r3, r11)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r3.Bkt()
            r0 = 2131100261(0x7f060265, float:1.7812898E38)
            int r0 = r10.getColor(r0)
            r1.setInactiveColour(r0)
            goto L_0x0231
        L_0x033d:
            X.3BQ r0 = X.AnonymousClass3BQ.ADS_HISTORY
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r0) goto L_0x0349
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r14 = r3.A0J
        L_0x0345:
            r14.setAlpha(r1)
            goto L_0x0324
        L_0x0349:
            boolean r0 = r9.A04(r5)
            if (r0 == 0) goto L_0x035b
            r0 = r18
            if (r8 == r0) goto L_0x035b
            if (r8 == r12) goto L_0x035b
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r3.A0J
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            goto L_0x0321
        L_0x035b:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r3.A0J
            r0.setAlpha(r1)
            goto L_0x0345
        L_0x0361:
            boolean r0 = r9.A04(r5)
            if (r0 == 0) goto L_0x0375
            r0 = 2131100202(0x7f06022a, float:1.7812779E38)
            int r0 = r10.getColor(r0)
            r1.setTextColor(r0)
            r0 = 0
            r14.A0I = r0
            goto L_0x0312
        L_0x0375:
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            goto L_0x030b
        L_0x0379:
            boolean r15 = X.AnonymousClass3NF.A01(r5, r9)
            if (r15 == 0) goto L_0x0394
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A04(r2)
            r1 = 2131099948(0x7f06012c, float:1.7812264E38)
            r0 = r22
            int r0 = r0.getColor(r1)
            r14.setBackgroundColor(r0)
            goto L_0x02d9
        L_0x0394:
            boolean r15 = r9.A06(r5)
            if (r15 != 0) goto L_0x0434
            r4.getClass()
            X.5mc r15 = X.C294525mb.A00(r5)
            r15.A0C(r2, r4)
            X.1Xj r15 = r4.A0b
            if (r15 == 0) goto L_0x03ac
            java.lang.String r0 = r15.getId()
        L_0x03ac:
            r14.setTag(r1, r0)
            java.lang.String r1 = r13.A01
            r1.getClass()
            X.34n r0 = X.C2366334m.A00(r5)
            r0.A07(r1)
            X.5mf r0 = new X.5mf
            r0.<init>(r5, r1)
            r14.A0E = r0
            if (r15 == 0) goto L_0x0421
            boolean r0 = r15.A5f()
            if (r0 == 0) goto L_0x0414
            r0 = 6
            r14.A04 = r0
            long r16 = r4.A02()
            r0 = r16
            r14.A05 = r0
            java.lang.String r1 = r15.BTL()
            java.lang.String r0 = "preview:/"
            java.lang.String r1 = X.002.A0R(r0, r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r14.setUrl(r0, r6)
            r0 = r19
            r0.A03(r11)
            X.4w4 r0 = r15.BQf()
            if (r0 != 0) goto L_0x0407
            android.graphics.PorterDuff$Mode r0 = X.C52501GVd.A00
            r1 = 2131238269(0x7f081d7d, float:1.8092812E38)
        L_0x03f7:
            r0 = r22
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            android.widget.ImageView r0 = r3.A01
            r0.getClass()
            r0.setImageDrawable(r1)
            goto L_0x02d9
        L_0x0407:
            X.4w4 r0 = r15.BQf()
            X.4w8 r0 = r0.BE7()
            int r1 = X.C69760Nrj.A00(r0)
            goto L_0x03f7
        L_0x0414:
            X.3gz r0 = new X.3gz
            r0.<init>()
            r14.A0A = r0
            java.lang.String r0 = r15.BTL()
            r14.A0K = r0
        L_0x0421:
            int r0 = r3.A00
            com.instagram.common.typedurl.ImageUrl r13 = r4.A07(r0)
            if (r13 == 0) goto L_0x02d9
            long r0 = r4.A02()
            r14.A05 = r0
            r14.setUrl(r13, r6)
            goto L_0x02d9
        L_0x0434:
            X.PFz r0 = r2.A0E
            if (r0 == 0) goto L_0x02d9
            java.lang.String r13 = r13.A01
            r13.getClass()
            X.34n r0 = X.C2366334m.A00(r5)
            r0.A07(r13)
            X.WTK r0 = new X.WTK
            r0.<init>(r5, r13)
            r14.A0E = r0
            X.PFz r13 = r2.A0E
            r13.getClass()
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A03(r13, r2)
            X.3I4 r15 = r13.A00
            java.lang.String r0 = r15.getPreview()
            if (r0 == 0) goto L_0x046c
            X.3gz r0 = new X.3gz
            r0.<init>()
            r14.A0A = r0
            java.lang.String r0 = r15.getPreview()
            r14.A0K = r0
        L_0x046c:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r13.A00()
            r14.setUrl(r0, r6)
            java.lang.String r0 = r13.getId()
            r14.setTag(r1, r0)
            goto L_0x02d9
        L_0x047c:
            r0 = r1
            goto L_0x01a5
        L_0x047f:
            X.5mc r0 = X.C294525mb.A00(r5)
            r0.A06(r2)
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x04a0
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = r3.A0I
            X.3Md r0 = r0.A00
            if (r0 == 0) goto L_0x0497
            X.3N0 r0 = r0.A00
            X.AnonymousClass3NT.A00(r0)
        L_0x0497:
            X.5BD r0 = r3.A00()
            X.AnonymousClass5BG.A00(r6, r5, r9, r0)
            goto L_0x01c4
        L_0x04a0:
            X.5BD r0 = r3.A03
            if (r0 == 0) goto L_0x04ab
            android.widget.FrameLayout r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x04ab:
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r1 = r3.A0I
            r30 = r32
            r26 = r1
            r29 = r9
            r31 = r21
            r32 = r25
            r33 = r11
            r34 = r11
            r35 = r11
            r36 = r11
            r26.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.3N0 r0 = r1.getHolder()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = r0.A01()
            if (r0 == 0) goto L_0x01c4
            X.3N0 r0 = r1.getHolder()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = r0.A01()
            r0 = 0
            r1.setBorderWidth(r0)
            goto L_0x01c4
        L_0x04da:
            X.3N6 r0 = r3.A0G
            android.view.View r11 = r0.A00()
            android.content.res.Resources r1 = r22.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L_0x0113
        L_0x04e8:
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0500
            X.3BQ r0 = X.AnonymousClass3BQ.ADS_HISTORY
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0500
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00ae
        L_0x0500:
            X.3N6 r0 = r3.A0G
            android.widget.LinearLayout r1 = r0.A05
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r11.getDimensionPixelSize(r0)
            X.0nA.A0T(r1, r0)
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294515ma.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3O9, X.3uh, X.3BT, X.3BT, X.5qj, X.5kP, X.3Nw, X.2pG, java.lang.Integer, java.lang.String, java.util.List, int):void");
    }
}
