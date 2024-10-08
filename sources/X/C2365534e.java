package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.34e  reason: invalid class name and case insensitive filesystem */
public final class C2365534e {
    public Integer A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final int A0a;
    public final int A0b;
    public final Drawable A0c;
    public final UserSession A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final int A0q;
    public final int A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final int A0v;
    public final int A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final int A11;
    public final int A12;
    public final int A13;
    public final int A14;
    public final int A15;
    public final int A16;
    public final int A17;
    public final int A18;
    public final int A19;
    public final int A1A;
    public final int A1B;
    public final C2365734g A1C = new C2365634f(this);

    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r9, X.AnonymousClass3BT r10, X.C2365534e r11, X.AnonymousClass3N0 r12) {
        /*
            X.0eM r6 = r12.A03
            java.lang.Object r0 = r6.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            X.3NU r0 = r0.A09
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r6.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            r11.A07(r0)
        L_0x0019:
            X.0eM r0 = r12.A09
            java.lang.Object r1 = r0.getValue()
            X.3oV r1 = (X.C252063oV) r1
            int r0 = r1.CFV()
            r5 = 8
            if (r0 == r5) goto L_0x00a2
            android.view.View r4 = r1.getView()
            com.instagram.common.session.UserSession r3 = r11.A0d
            r8 = 0
            X.0qQ.A0B(r3, r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322044501108637(0x810ab50001279d, double:3.033545427410338E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            X.1NN r0 = X.1NM.A00(r3)
            boolean r0 = X.1NN.A00(r0)
            r7 = 1
            if (r0 == 0) goto L_0x015b
            if (r1 == 0) goto L_0x0051
            boolean r0 = X.AnonymousClass3NF.A01(r3, r10)
            if (r0 == 0) goto L_0x017b
        L_0x0051:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x005b:
            r7 = 0
        L_0x005c:
            X.0nA.A0g(r4, r0, r0)
            if (r7 == 0) goto L_0x0074
            r0 = 36326726015399881(0x810ef7000037c9, double:3.036506035899066E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0148
            int r0 = r11.A05
        L_0x006e:
            X.0nA.A0U(r4, r0)
            X.0nA.A0T(r4, r0)
        L_0x0074:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.getHitRect(r2)
            int r0 = r2.top
            int r1 = r11.A0b
            int r0 = r0 - r1
            r2.top = r0
            int r0 = r2.bottom
            int r0 = r0 + r1
            r2.bottom = r0
            int r0 = r2.left
            int r0 = r0 - r1
            r2.left = r0
            int r0 = r2.right
            int r0 = r0 + r1
            r2.right = r0
            android.view.ViewParent r1 = r4.getParent()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x00a2
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r2, r4)
            r1.setTouchDelegate(r0)
        L_0x00a2:
            java.lang.Object r0 = r6.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            android.view.View r2 = r0.A02
            if (r2 == 0) goto L_0x00c9
            int r0 = r2.getVisibility()
            if (r0 == r5) goto L_0x00c9
            java.lang.Integer r0 = r11.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x013b
            r0 = 1
            if (r1 == r0) goto L_0x0138
            r0 = 2
            if (r1 == r0) goto L_0x0135
            r0 = 3
            if (r1 != r0) goto L_0x00c9
            int r0 = r11.A07
        L_0x00c6:
            X.0nA.A0g(r2, r0, r0)
        L_0x00c9:
            X.0eM r0 = r12.A0A
            java.lang.Object r1 = r0.getValue()
            X.3oV r1 = (X.C252063oV) r1
            int r0 = r1.CFV()
            if (r0 == r5) goto L_0x00f2
            android.view.View r2 = r1.getView()
            java.lang.Integer r0 = r11.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0132
            r0 = 1
            if (r1 == r0) goto L_0x012f
            r0 = 2
            if (r1 == r0) goto L_0x012c
            r0 = 3
            if (r1 != r0) goto L_0x00f2
            int r0 = r11.A0N
        L_0x00ef:
            X.0nA.A0g(r2, r0, r0)
        L_0x00f2:
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r2 = r12.A01()
            if (r2 == 0) goto L_0x010f
            java.lang.Integer r0 = r11.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0129
            r0 = 1
            if (r1 == r0) goto L_0x0126
            r0 = 2
            if (r1 == r0) goto L_0x0123
            r0 = 3
            if (r1 != r0) goto L_0x010f
            int r0 = r11.A0J
        L_0x010c:
            X.0nA.A0g(r2, r0, r0)
        L_0x010f:
            java.lang.Object r0 = r6.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r0.A06
            if (r1 == 0) goto L_0x0122
            int r0 = r1.getVisibility()
            if (r0 == r5) goto L_0x0122
            r11.A01(r1)
        L_0x0122:
            return
        L_0x0123:
            int r0 = r11.A0L
            goto L_0x010c
        L_0x0126:
            int r0 = r11.A0K
            goto L_0x010c
        L_0x0129:
            int r0 = r11.A0M
            goto L_0x010c
        L_0x012c:
            int r0 = r11.A0P
            goto L_0x00ef
        L_0x012f:
            int r0 = r11.A0O
            goto L_0x00ef
        L_0x0132:
            int r0 = r11.A0Q
            goto L_0x00ef
        L_0x0135:
            int r0 = r11.A09
            goto L_0x00c6
        L_0x0138:
            int r0 = r11.A08
            goto L_0x013d
        L_0x013b:
            int r0 = r11.A0A
        L_0x013d:
            X.0nA.A0g(r2, r0, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r0 = r11.A0c
            r2.setImageDrawable(r0)
            goto L_0x00c9
        L_0x0148:
            r0 = 36326726015530955(0x810ef7000237cb, double:3.0365060359819576E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0157
            int r0 = r11.A03
            goto L_0x006e
        L_0x0157:
            int r0 = r11.A04
            goto L_0x006e
        L_0x015b:
            if (r1 != 0) goto L_0x017b
            r0 = 36326726015399881(0x810ef7000037c9, double:3.036506035899066E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x016c
            int r0 = r11.A0I
            goto L_0x005c
        L_0x016c:
            r0 = 36326726015530955(0x810ef7000237cb, double:3.0365060359819576E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x019d
            int r0 = r11.A0D
            goto L_0x005c
        L_0x017b:
            java.lang.Integer r0 = r11.A00
            int r1 = r0.intValue()
            if (r1 == r8) goto L_0x019d
            if (r1 == r7) goto L_0x0199
            r0 = 2
            if (r1 == r0) goto L_0x0195
            r0 = 3
            if (r1 != r0) goto L_0x00a2
            int r0 = r11.A0E
            X.0nA.A0U(r4, r8)
            X.0nA.A0T(r4, r8)
            goto L_0x005b
        L_0x0195:
            int r0 = r11.A0G
            goto L_0x005b
        L_0x0199:
            int r0 = r11.A0F
            goto L_0x005c
        L_0x019d:
            int r0 = r11.A0H
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365534e.A00(android.content.Context, X.3BT, X.34e, X.3N0):void");
    }

    private void A01(View view) {
        int i;
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            i = this.A0h;
        } else if (intValue == 1) {
            i = this.A0f;
        } else if (intValue == 2) {
            i = this.A0g;
        } else if (intValue == 3) {
            i = this.A0e;
        } else {
            return;
        }
        0nA.A0g(view, i, i);
    }

    public static void A02(View view, C2365534e r4) {
        int i = r4.A12;
        if (i != -1) {
            view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public static void A03(C2365534e r5, AnonymousClass5BD r6) {
        int i;
        int i2;
        int i3;
        int i4;
        int intValue = r5.A00.intValue();
        if (intValue == 0) {
            i = r5.A0l;
            i2 = r5.A0p;
            i3 = r5.A0t;
            i4 = r5.A0x;
        } else if (intValue == 1) {
            i = r5.A0j;
            i2 = r5.A0n;
            i3 = r5.A0r;
            i4 = r5.A0v;
        } else if (intValue == 2) {
            i = r5.A0k;
            i2 = r5.A0o;
            i3 = r5.A0s;
            i4 = r5.A0w;
        } else if (intValue == 3) {
            i = r5.A0i;
            i2 = r5.A0m;
            i3 = r5.A0q;
            i4 = r5.A0u;
        } else {
            return;
        }
        0nA.A0g(r6.A03, i, i);
        0nA.A0g(r6.A06, i2, i2);
        0nA.A0g(r6.A07, i2, i2);
        0nA.A0g(r6.A08, i3, i3);
        0nA.A0g(r6.A09, i3, i3);
        0nA.A0g(r6.A0C, i4, i4);
        0nA.A0g(r6.A0D, i4, i4);
    }

    public static void A04(C2365534e r5, AnonymousClass5BD r6) {
        int i;
        int i2;
        int i3;
        int intValue = r5.A00.intValue();
        if (intValue == 0) {
            i = r5.A11;
            i2 = r5.A0S;
            i3 = r5.A0V;
        } else if (intValue == 1) {
            i = r5.A0z;
            i2 = r5.A0S;
            i3 = r5.A0V;
        } else if (intValue == 2) {
            i = r5.A10;
            i2 = r5.A0T;
            i3 = r5.A0W;
        } else if (intValue == 3) {
            i = r5.A0y;
            i2 = r5.A0R;
            i3 = r5.A0U;
        } else {
            return;
        }
        GradientSpinner gradientSpinner = r6.A0A;
        0nA.A0g(gradientSpinner, i, i);
        GradientSpinner gradientSpinner2 = r6.A0B;
        0nA.A0g(gradientSpinner2, i, i);
        float f = (float) i2;
        gradientSpinner.setActiveStrokeWidth(f);
        gradientSpinner2.setActiveStrokeWidth(f);
        float f2 = (float) i3;
        gradientSpinner.setInactiveStrokeWidth(f2);
        gradientSpinner2.setInactiveStrokeWidth(f2);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != null) goto L_0x002d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(X.AnonymousClass3N9 r7) {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x004d
            r0 = 1
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 == r0) goto L_0x0043
            r0 = 3
            if (r1 != r0) goto L_0x003f
            int r5 = r6.A14
            int r4 = r6.A18
        L_0x0016:
            com.instagram.ui.widget.emitter.PulseEmitter r3 = r7.A0A
            android.widget.FrameLayout r1 = r7.A0K
            r0 = 2131438488(0x7f0b2b98, float:1.8498904E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.ui.widget.imageview.PulsingMultiImageView r1 = r7.A0B
            X.3NU r0 = r7.A09
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0040
        L_0x002d:
            X.0nA.A0g(r1, r4, r4)
            if (r3 == 0) goto L_0x0035
            X.0nA.A0g(r3, r5, r5)
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            X.0nA.A0g(r2, r5, r5)
        L_0x003a:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0L
            X.0nA.A0g(r0, r5, r5)
        L_0x003f:
            return
        L_0x0040:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r7.A0L
            goto L_0x002d
        L_0x0043:
            int r5 = r6.A16
            int r4 = r6.A1A
            goto L_0x0016
        L_0x0048:
            int r5 = r6.A15
            int r4 = r6.A19
            goto L_0x0016
        L_0x004d:
            int r5 = r6.A17
            int r4 = r6.A1B
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365534e.A07(X.3N9):void");
    }

    public final void A08(C241103Nw r4) {
        A06(this, r4.A0I.getHolder(), false);
        A05(this, r4.A0F);
        AnonymousClass3N6 r2 = r4.A0G;
        0nA.A0X(r2.A05, this.A0B);
        A02(r2.A00(), this);
    }

    public final void A09(C60710Jpv jpv) {
        A06(this, jpv.A0D.getHolder(), false);
        A05(this, jpv.A0B);
        AnonymousClass3N6 r2 = jpv.A0C;
        0nA.A0X(r2.A05, this.A0B);
        A02(r2.A00(), this);
    }

    public C2365534e(C2365434d r7) {
        int round;
        int round2;
        int i;
        int i2;
        UserSession userSession = r7.A07;
        this.A0d = userSession;
        Context context = r7.A05;
        Resources resources = context.getResources();
        this.A01 = r7.A00;
        this.A00 = r7.A06;
        this.A06 = r7.A01;
        this.A0B = r7.A03;
        this.A13 = r7.A04;
        this.A12 = r7.A02;
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0b = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material)) * this.A01);
        this.A0C = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A0h = Math.round(((float) resources.getDimensionPixelSize(R.dimen.action_button_min_width)) * this.A01);
        this.A0I = Math.round(((float) resources.getDimensionPixelSize(R.dimen.own_reel_badge_updated_size)) * this.A01);
        this.A0D = Math.round(((float) resources.getDimensionPixelSize(R.dimen.own_reel_badge_boundary_test_size)) * this.A01);
        this.A0a = Math.round(((float) resources.getDimensionPixelSize(R.dimen.avatar_reel_ring_size_xxxxlarge)) * this.A01);
        this.A0H = Math.round(((float) resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin)) * this.A01);
        this.A0A = Math.round(((float) resources.getDimensionPixelSize(R.dimen.failed_upload_indicator_size_xlarge)) * this.A01);
        this.A0Q = Math.round(((float) resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin)) * this.A01);
        this.A0M = Math.round(((float) resources.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius)) * this.A01);
        this.A1B = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_pulsing_avatar_size_xlarge)) * this.A01);
        this.A17 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.action_button_min_width)) * this.A01);
        this.A0l = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_container_size_xlarge)) * this.A01);
        this.A11 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_spinner_size_xlarge)) * this.A01);
        this.A0p = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_bg_circle_size_xlarge)) * this.A01);
        this.A0t = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_bg_pulsing_circle_size_xlarge)) * this.A01);
        this.A0x = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_pulsing_avatar_size_xlarge)) * this.A01);
        this.A0e = resources.getDimensionPixelSize(R.dimen.preview_tray_item_avatar_size_fbv);
        this.A0X = resources.getDimensionPixelSize(R.dimen.preview_tray_item_ring_size_fbv);
        this.A0R = resources.getDimensionPixelSize(R.dimen.audio_waveform_amplitude_height_minimum_short);
        this.A0U = resources.getDimensionPixelSize(R.dimen.audio_waveform_amplitude_height_minimum_short);
        this.A0E = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material)) * this.A01);
        this.A07 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.failed_upload_indicator_size_fbv)) * this.A01);
        this.A0N = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material)) * this.A01);
        this.A0J = Math.round(((float) resources.getDimensionPixelSize(R.dimen.reel_branding_badge_size_fbv)) * this.A01);
        this.A18 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.failed_upload_indicator_size_small)) * this.A01);
        this.A14 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_container_size_fbv)) * this.A01);
        this.A0i = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_container_size_fbv)) * this.A01);
        this.A0y = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_spinner_size_fbv)) * this.A01);
        this.A0m = Math.round(((float) resources.getDimensionPixelSize(R.dimen.editing_disclaimer_top_margin)) * this.A01);
        this.A0q = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_bg_pulsing_circle_size_fbv)) * this.A01);
        this.A0u = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_pulsing_avatar_size_fbv)) * this.A01);
        if (C61670oa.A02()) {
            int A052 = 0nA.A05(context);
            if (A052 < 667 || A052 >= 1000) {
                this.A0f = resources.getDimensionPixelSize(R.dimen.activation_card_icon_container_width);
                this.A0Y = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
                i2 = R.dimen.prism_avatar_story_ring_width_large_device;
            } else {
                this.A0f = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
                this.A0Y = resources.getDimensionPixelSize(R.dimen.prism_avatar_story_ring_size_medium_device);
                i2 = R.dimen.prism_avatar_story_ring_width_medium_device;
            }
            this.A0S = resources.getDimensionPixelSize(i2);
            round = resources.getDimensionPixelSize(i2);
        } else {
            this.A0f = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material)) * this.A01);
            this.A0Y = Math.round(((float) resources.getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size)) * this.A01);
            this.A0S = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_control_corner_material)) * this.A01);
            round = Math.round(((float) resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin)) * this.A01);
        }
        this.A0V = round;
        this.A0F = Math.round(((float) resources.getDimensionPixelSize(R.dimen.own_reel_badge_size_large)) * this.A01);
        this.A08 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin)) * this.A01);
        this.A0O = Math.round(((float) resources.getDimensionPixelSize(R.dimen.own_reel_badge_size_large)) * this.A01);
        this.A0K = Math.round(((float) resources.getDimensionPixelSize(R.dimen.reel_branding_badge_size_large)) * this.A01);
        this.A04 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.accent_edge_thickness)) * this.A01);
        this.A05 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_control_corner_material)) * this.A01);
        this.A03 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin)) * this.A01);
        this.A19 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.promote_double_thumbnail_size)) * this.A01);
        this.A15 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material)) * this.A01);
        this.A0r = Math.round(((float) resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset)) * this.A01);
        this.A0v = Math.round(((float) resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_4_winner4_submission_offsetX)) * this.A01);
        this.A0j = Math.round(((float) resources.getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size)) * this.A01);
        this.A0z = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material)) * this.A01);
        this.A0n = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_live_cobroadcast_bg_circle_size_large)) * this.A01);
        this.A0c = resources.getDrawable(R.drawable.tray_error_large);
        if (1NN.A00(1NM.A00(userSession))) {
            this.A0g = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            i = R.dimen.preview_tray_item_ring_size;
        } else if (C61670oa.A02()) {
            this.A0g = resources.getDimensionPixelSize(R.dimen.prism_avatar_size_small_device);
            i = R.dimen.audition_flow_footer_text_button_min_width;
        } else {
            this.A0g = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)) * this.A01);
            this.A0Z = Math.round(((float) resources.getDimensionPixelSize(R.dimen.action_button_settings_height)) * this.A01);
            this.A0T = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_control_corner_material)) * this.A01);
            round2 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top)) * this.A01);
            this.A0W = round2;
            this.A0G = Math.round(((float) resources.getDimensionPixelSize(R.dimen.bottom_button_divider_margin_medium)) * this.A01);
            this.A09 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.failed_upload_indicator_size_small)) * this.A01);
            this.A0P = Math.round(((float) resources.getDimensionPixelSize(R.dimen.bottom_button_divider_margin_medium)) * this.A01);
            this.A0L = Math.round(((float) resources.getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding)) * this.A01);
            this.A1A = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_pulsing_avatar_size_small)) * this.A01);
            this.A16 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)) * this.A01);
            this.A0k = Math.round(((float) resources.getDimensionPixelSize(R.dimen.action_button_settings_height)) * this.A01);
            this.A10 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding)) * this.A01);
            this.A0o = Math.round(((float) resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin)) * this.A01);
            this.A0s = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_bg_pulsing_circle_size_small)) * this.A01);
            this.A0w = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_pulsing_avatar_size_small)) * this.A01);
        }
        this.A0Z = resources.getDimensionPixelSize(i);
        this.A0T = resources.getDimensionPixelSize(R.dimen.prism_avatar_story_ring_width_small_device);
        round2 = resources.getDimensionPixelSize(R.dimen.prism_avatar_story_ring_width_small_device);
        this.A0W = round2;
        this.A0G = Math.round(((float) resources.getDimensionPixelSize(R.dimen.bottom_button_divider_margin_medium)) * this.A01);
        this.A09 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.failed_upload_indicator_size_small)) * this.A01);
        this.A0P = Math.round(((float) resources.getDimensionPixelSize(R.dimen.bottom_button_divider_margin_medium)) * this.A01);
        this.A0L = Math.round(((float) resources.getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding)) * this.A01);
        this.A1A = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_pulsing_avatar_size_small)) * this.A01);
        this.A16 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)) * this.A01);
        this.A0k = Math.round(((float) resources.getDimensionPixelSize(R.dimen.action_button_settings_height)) * this.A01);
        this.A10 = Math.round(((float) resources.getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding)) * this.A01);
        this.A0o = Math.round(((float) resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin)) * this.A01);
        this.A0s = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_bg_pulsing_circle_size_small)) * this.A01);
        this.A0w = Math.round(((float) resources.getDimensionPixelSize(R.dimen.tray_double_avatar_pulsing_avatar_size_small)) * this.A01);
    }

    public static void A05(C2365534e r5, AnonymousClass3N8 r6) {
        View A012 = r6.A01();
        int i = r5.A0C;
        int max = Math.max(0, (r5.A06 - r5.A02) - (i / 4));
        if (max > 0) {
            0nA.A0c(A012, max);
        }
        int i2 = r5.A13;
        0nA.A0Y(A012, i2);
        0nA.A0a(A012, i2);
        r6.A04().setTextSize(0, (float) i);
        C252063oV A062 = r6.A06();
        if (A062 != null) {
            A062.EeU(r5.A1C);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C2365534e r3, X.AnonymousClass3N0 r4, java.lang.Boolean r5) {
        /*
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x001a
            X.0eM r1 = r4.A03
            java.lang.Object r0 = r1.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            r0.A00()
            java.lang.Object r0 = r1.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            r3.A07(r0)
        L_0x001a:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r4.A02()
            java.lang.Integer r0 = r3.A00
            int r2 = r0.intValue()
            r0 = 0
            if (r2 == r0) goto L_0x0071
            r0 = 1
            if (r2 == r0) goto L_0x006e
            r0 = 2
            if (r2 == r0) goto L_0x0060
            r0 = 3
            if (r2 != r0) goto L_0x0041
            int r0 = r3.A0X
            X.0nA.A0g(r1, r0, r0)
            int r0 = r3.A0R
            float r0 = (float) r0
            r1.setActiveStrokeWidth(r0)
            int r0 = r3.A0U
        L_0x003d:
            float r0 = (float) r0
            r1.setInactiveStrokeWidth(r0)
        L_0x0041:
            android.view.View r0 = r4.A00()
            r3.A01(r0)
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            X.3N9 r0 = (X.AnonymousClass3N9) r0
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A06
            if (r2 == 0) goto L_0x005f
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x005f
            r3.A01(r2)
        L_0x005f:
            return
        L_0x0060:
            int r0 = r3.A0Z
            X.0nA.A0g(r1, r0, r0)
            int r0 = r3.A0T
            float r0 = (float) r0
            r1.setActiveStrokeWidth(r0)
            int r0 = r3.A0W
            goto L_0x003d
        L_0x006e:
            int r0 = r3.A0Y
            goto L_0x0073
        L_0x0071:
            int r0 = r3.A0a
        L_0x0073:
            X.0nA.A0g(r1, r0, r0)
            int r0 = r3.A0S
            float r0 = (float) r0
            r1.setActiveStrokeWidth(r0)
            int r0 = r3.A0V
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365534e.A06(X.34e, X.3N0, java.lang.Boolean):void");
    }
}
