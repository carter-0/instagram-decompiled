package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.9Pb  reason: invalid class name and case insensitive filesystem */
public final class C378249Pb implements C351948Bb {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public ReshareTogglePickerView A09;
    public EphemeralMediaToggleView A0A;
    public AnonymousClass0eM A0B;
    public GradientSpinnerAvatarView A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final C252063oV A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final Context A0N;
    public final C3499582p A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r13 == 5) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C378249Pb(android.content.Context r7, android.view.View r8, android.view.View r9, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r10, X.C3499582p r11, int r12, int r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r6 = this;
            r0 = 1
            X.AnonymousClass7TF.A1F(r7, r0, r9)
            r6.<init>()
            r6.A0N = r7
            r6.A0O = r11
            r6.A00 = r12
            r6.A0D = r9
            r6.A01 = r13
            r0 = r17
            r6.A0I = r0
            r4 = 0
            r0 = 2
            if (r13 == r0) goto L_0x0020
            r0 = 4
            if (r13 == r0) goto L_0x0020
            r1 = 5
            r0 = 0
            if (r13 != r1) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r6.A0M = r0
            r0 = 6
            boolean r0 = X.AnonymousClass7TF.A1S(r13, r0)
            r6.A0J = r0
            r0 = 3
            boolean r0 = X.AnonymousClass7TF.A1S(r13, r0)
            r6.A0L = r0
            r0 = 7
            boolean r2 = X.AnonymousClass7TF.A1S(r13, r0)
            r6.A0K = r2
            java.lang.String r5 = "Required value was null."
            r1 = 0
            if (r8 == 0) goto L_0x0094
            if (r15 == 0) goto L_0x00f0
            r0 = 2131431844(0x7f0b11a4, float:1.8485429E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r8, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r3 = r0.inflate()
            r6.A04 = r3
            if (r3 == 0) goto L_0x00ed
            r0 = 2131442842(0x7f0b3c9a, float:1.8507735E38)
            android.view.View r0 = r3.findViewById(r0)
        L_0x0057:
            r6.A05 = r0
            android.view.View r3 = r6.A04
            if (r3 == 0) goto L_0x00ea
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r3, r0)
        L_0x0064:
            r6.A08 = r0
            android.view.View r3 = r6.A04
            if (r3 == 0) goto L_0x00e8
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r3, r0)
        L_0x0071:
            r6.A07 = r0
            android.view.View r3 = r6.A04
            if (r3 == 0) goto L_0x00e6
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
        L_0x0080:
            r6.A0C = r0
        L_0x0082:
            if (r16 == 0) goto L_0x0094
            r0 = 2131431533(0x7f0b106d, float:1.8484798E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            r0.setVisibility(r4)
        L_0x0094:
            r0 = 2131431731(0x7f0b1133, float:1.84852E38)
            android.view.View r0 = r9.requireViewById(r0)
            r6.A0F = r0
            r0 = 2131431734(0x7f0b1136, float:1.8485206E38)
            android.view.View r0 = r9.requireViewById(r0)
            r6.A0G = r0
            r0 = 2131431732(0x7f0b1134, float:1.8485202E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r9, r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r0 = 2131625075(0x7f0e0473, float:1.8877348E38)
            if (r14 == 0) goto L_0x00b7
            r0 = 2131625077(0x7f0e0475, float:1.8877352E38)
        L_0x00b7:
            r3.setLayoutResource(r0)
            X.3oV r0 = X.2b1.A01(r3, r4, r4)
            r6.A0H = r0
            r0 = 2131431667(0x7f0b10f3, float:1.848507E38)
            android.view.View r3 = r9.requireViewById(r0)
            r6.A0E = r3
            r4 = 2131960296(0x7f1321e8, float:1.9557257E38)
            java.lang.String r0 = r7.getString(r4)
            r3.setContentDescription(r0)
            r0 = 2131429468(0x7f0b085c, float:1.848061E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r9, r0)
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0129;
                case 2: goto L_0x0129;
                case 3: goto L_0x0129;
                case 4: goto L_0x0129;
                case 5: goto L_0x0129;
                case 6: goto L_0x0129;
                case 7: goto L_0x0129;
                case 8: goto L_0x0129;
                case 9: goto L_0x0121;
                default: goto L_0x00df;
            }
        L_0x00df:
            java.lang.String r0 = "Illegal direct camera state"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00e6:
            r0 = r1
            goto L_0x0080
        L_0x00e8:
            r0 = r1
            goto L_0x0071
        L_0x00ea:
            r0 = r1
            goto L_0x0064
        L_0x00ed:
            r0 = r1
            goto L_0x0057
        L_0x00f0:
            r0 = 2131439022(0x7f0b2dae, float:1.8499987E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r8, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r3 = r0.inflate()
            r6.A04 = r3
            if (r3 == 0) goto L_0x0157
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A08 = r0
            android.view.View r3 = r6.A04
            if (r3 == 0) goto L_0x0152
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A07 = r0
            android.widget.TextView r0 = r6.A08
            r6.A05 = r0
            goto L_0x0082
        L_0x0121:
            r0 = 2131954951(0x7f130d07, float:1.9546416E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x012d
        L_0x0129:
            java.lang.String r0 = r7.getString(r4)
        L_0x012d:
            X.0qQ.A0A(r0)
            r3.setText(r0)
            int r0 = r6.A01
            if (r0 == 0) goto L_0x014a
            if (r2 != 0) goto L_0x014a
            android.view.ViewParent r2 = r9.getParent()
            if (r2 == 0) goto L_0x014d
            r1 = 28
            X.AwZ r0 = new X.AwZ
            r0.<init>(r1, r2, r6, r10)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r0)
        L_0x014a:
            r6.A0B = r1
            return
        L_0x014d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0157:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378249Pb.<init>(android.content.Context, android.view.View, android.view.View, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, int, int, boolean, boolean, boolean, boolean):void");
    }

    public final void A00(AnonymousClass0iw r6, DirectCameraViewModel directCameraViewModel) {
        ImageUrl imageUrl;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0C;
        if (gradientSpinnerAvatarView != null && (imageUrl = directCameraViewModel.A02) != null) {
            if (directCameraViewModel.A07) {
                gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, r6, imageUrl, directCameraViewModel.A01);
            } else {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r6, imageUrl);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
    }

    public final void A01(AnonymousClass0iw r7, DirectCameraViewModel directCameraViewModel, boolean z) {
        ImageUrl imageUrl;
        0qQ.A0B(r7, 1);
        View view = this.A0H.getView();
        if (z) {
            TextView A0R = AnonymousClass7TG.A0R(this.A0D, R.id.direct_reply_avatar_button_text_toggle);
            A0R.setPadding(0, 0, 0, 0);
            A0R.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_arrow_right_pano_filled_24, 0);
        } else if (this.A0M || this.A0L) {
            View view2 = this.A0D;
            Context context = view2.getContext();
            TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.direct_reply_avatar_button_text_toggle);
            int i = this.A00;
            int i2 = 2131960296;
            if (i == 9) {
                i2 = 2131954951;
            }
            A0R2.setText(context.getString(i2));
            if (i != 9) {
                ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(view2, R.id.direct_reply_avatar_button_toggle_stub);
                View view3 = this.A0G;
                0nA.A0b(view3, view3.getPaddingStart());
                viewStub.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
                View inflate = viewStub.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
                StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
                boolean z2 = directCameraViewModel.A07;
                if (z2) {
                    stackedAvatarView.A04(context, R.dimen.abc_dialog_padding_top_material);
                    stackedAvatarView.setPadding(2, 6, 0, 0);
                } else {
                    stackedAvatarView.A04(context, R.dimen.abc_dialog_padding_material);
                }
                ImageUrl imageUrl2 = directCameraViewModel.A02;
                if (z2) {
                    imageUrl = directCameraViewModel.A01;
                } else {
                    imageUrl = null;
                }
                stackedAvatarView.setUrls(imageUrl2, imageUrl, r7);
                stackedAvatarView.setRingColor(AnonymousClass7TF.A03(context, R.attr.igds_color_primary_button_on_media));
            }
        } else if (directCameraViewModel.A07) {
            IgImageView A0F2 = AnonymousClass7TF.A0F(view, R.id.reply_button_double_avatar_back);
            IgImageView A0F3 = AnonymousClass7TF.A0F(view, R.id.reply_button_double_avatar_front);
            ImageUrl imageUrl3 = directCameraViewModel.A02;
            if (imageUrl3 != null) {
                A0F3.setUrl(imageUrl3, r7);
            }
            ImageUrl imageUrl4 = directCameraViewModel.A01;
            if (imageUrl4 != null) {
                A0F2.setUrl(imageUrl4, r7);
            }
            this.A02 = view.findViewById(R.id.reply_button_double_avatar_back_container);
            this.A03 = view.findViewById(R.id.reply_button_double_avatar_front_container);
        } else {
            boolean z3 = directCameraViewModel.A08;
            Context context2 = view.getContext();
            int i3 = R.drawable.direct_large_avatar_button_background;
            if (z3) {
                i3 = R.drawable.direct_large_avatar_button_background_shhmode;
            }
            view.setBackground(context2.getDrawable(i3));
            ImageUrl imageUrl5 = directCameraViewModel.A02;
            if (imageUrl5 != null) {
                AnonymousClass7TF.A0F(view, R.id.reply_button_single_avatar).setUrl(imageUrl5, r7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ejs(boolean r13) {
        /*
            r12 = this;
            r4 = 1
            r2 = 0
            android.view.View[] r1 = new android.view.View[r4]
            if (r13 == 0) goto L_0x0107
            X.3oV r0 = r12.A0H
            android.view.View r0 = r0.getView()
            r1[r2] = r0
            r3 = 0
            X.C294975nL.A04(r3, r1, r4)
            X.82p r0 = r12.A0O
            if (r0 == 0) goto L_0x00ff
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.Integer r1 = r0.A0B
            X.0qQ.A07(r1)
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r11 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r0 = r12.A0K
            r6 = 0
            r5 = 8
            if (r0 == 0) goto L_0x00d3
            android.view.View r1 = r12.A0E
            if (r11 != 0) goto L_0x0034
            boolean r0 = r12.A0I
            if (r0 == 0) goto L_0x0036
        L_0x0034:
            r6 = 8
        L_0x0036:
            r1.setVisibility(r6)
        L_0x0039:
            android.view.View r0 = r12.A0F
            r0.setVisibility(r5)
            android.view.View r0 = r12.A0G
            r0.setVisibility(r5)
        L_0x0043:
            boolean r7 = r12.A0M
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x0099
            java.lang.String r10 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            if (r11 == 0) goto L_0x0078
            android.view.View r0 = r12.A0D
            android.view.ViewParent r9 = r0.getParent()
            if (r9 == 0) goto L_0x0102
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            X.4gb r8 = new X.4gb
            r8.<init>()
            r8.A0I(r9)
            r6 = 2131429616(0x7f0b08f0, float:1.848091E38)
            r1 = 4
            r5 = 2131436600(0x7f0b2438, float:1.8495075E38)
            r0 = 3
            r8.A0D(r6, r1, r5, r0)
            r1 = 3
            r8.A0D(r6, r0, r2, r0)
            r0 = 4
            r8.A0D(r5, r1, r6, r0)
            r8.A0D(r5, r0, r2, r0)
            r8.A0G(r9)
        L_0x0078:
            android.view.View r6 = r12.A0D
            X.0qQ.A0C(r6, r10)
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            X.4gb r5 = new X.4gb
            r5.<init>()
            r5.A0I(r6)
            r1 = 2131439291(0x7f0b2ebb, float:1.8500533E38)
            r0 = 3
            r5.A0D(r1, r0, r2, r0)
            r0 = 4
            r5.A0D(r1, r0, r2, r0)
            r0 = 6
            r5.A0D(r1, r0, r2, r0)
            r5.A0G(r6)
        L_0x0099:
            android.view.View[] r1 = new android.view.View[r4]
            android.view.View r0 = r12.A0D
            r1[r2] = r0
            if (r11 == 0) goto L_0x00c4
            X.C294975nL.A04(r3, r1, r2)
            X.0eM r1 = r12.A0B
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            r0.setVisibility(r2)
            if (r7 != 0) goto L_0x00c3
            android.view.View r2 = X.AnonymousClass7TG.A0Q(r1)
            android.content.Context r1 = r12.A0N
            r0 = 2131099791(0x7f06008f, float:1.7811945E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
        L_0x00c3:
            return
        L_0x00c4:
            X.C294975nL.A04(r3, r1, r4)
            X.0eM r0 = r12.A0B
            if (r0 == 0) goto L_0x00c3
            android.view.View r0 = X.AnonymousClass7TG.A0Q(r0)
            r0.setBackground(r3)
            return
        L_0x00d3:
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x0039
            boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x00e7
            android.view.View r0 = r12.A0F
            r0.setVisibility(r5)
            android.view.View r1 = r12.A0G
        L_0x00e2:
            r1.setVisibility(r6)
            goto L_0x0043
        L_0x00e7:
            android.view.View r1 = r12.A0F
            if (r11 != 0) goto L_0x00f0
            boolean r0 = r12.A0M
            if (r0 != 0) goto L_0x00f0
            r5 = 0
        L_0x00f0:
            r1.setVisibility(r5)
            android.view.View r1 = r12.A0G
            boolean r0 = r12.A0M
            if (r0 == 0) goto L_0x00fc
            if (r11 != 0) goto L_0x00fc
            goto L_0x00e2
        L_0x00fc:
            r6 = 8
            goto L_0x00e2
        L_0x00ff:
            r1 = r3
            goto L_0x001f
        L_0x0102:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0107:
            android.view.View r0 = r12.A0D
            r1[r2] = r0
            X.C294975nL.A05(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378249Pb.Ejs(boolean):void");
    }

    public final void EQQ(boolean z) {
        View view = this.A04;
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }
}
