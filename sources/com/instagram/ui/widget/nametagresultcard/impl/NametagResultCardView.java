package com.instagram.ui.widget.nametagresultcard.impl;

import X.0nA;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass972;
import X.C13989Tnp;
import X.C16366Utj;
import X.C20093Wkr;
import X.C243853aD;
import X.C294975nL;
import X.C315596kB;
import X.C71392co;
import X.DbS;
import X.DbU;
import X.WB0;
import X.X5D;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.ui.widget.nametag.UsernameTextView;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;
import java.util.Locale;

public class NametagResultCardView extends FrameLayout {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public UsernameTextView A07;
    public X5D A08;
    public UpdatableButton A09;
    public FollowButton A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public View A0G;
    public final C243853aD A0H = new C16366Utj(this, 1);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static void A01(NametagResultCardView nametagResultCardView) {
        NametagResultCardView nametagResultCardView2 = nametagResultCardView;
        int i = (int) (((float) nametagResultCardView.A00) * 0.05f);
        nametagResultCardView.setPadding(i, i, i, i);
        int i2 = nametagResultCardView.A00 - (i * 2);
        nametagResultCardView.A0F = i2;
        0nA.A0g(nametagResultCardView.A02, i2, i2);
        ? r3 = nametagResultCardView.A06;
        int i3 = (int) (((float) nametagResultCardView.A00) * 0.25f);
        0nA.A0g(r3, i3, i3);
        Paint.FontMetrics fontMetrics = nametagResultCardView.A07.getPaint().getFontMetrics();
        UsernameTextView usernameTextView = nametagResultCardView.A07;
        float f = (float) nametagResultCardView.A00;
        float f2 = (f * 0.038f) - fontMetrics.ascent;
        int i4 = (int) (f * 0.83f);
        String str = usernameTextView.A00;
        if (str != null) {
            StringBuilder sb = new StringBuilder((str.length() + 3) - 1);
            String[] strArr = new String[3];
            UsernameTextView.A01(usernameTextView, str.toUpperCase(Locale.US), strArr, 3, i4);
            int i5 = 0;
            do {
                String str2 = strArr[i5];
                if (TextUtils.isEmpty(str2)) {
                    break;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(str2);
                i5++;
            } while (i5 < 3);
            usernameTextView.setText(sb.toString());
        }
        usernameTextView.setLineSpacing(f2, 0.0f);
        usernameTextView.measure(View.MeasureSpec.makeMeasureSpec(i4, AnonymousClass972.MUTABLE_FLAG_MASK), View.MeasureSpec.makeMeasureSpec(0, 0));
        usernameTextView.layout(usernameTextView.getLeft(), usernameTextView.getTop(), usernameTextView.getLeft() + usernameTextView.getMeasuredWidth(), usernameTextView.getTop() + usernameTextView.getMeasuredHeight());
        UsernameTextView usernameTextView2 = nametagResultCardView.A07;
        int i6 = (int) (((float) nametagResultCardView.A00) * 0.057f);
        ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(usernameTextView2);
        A0D2.topMargin = i6;
        usernameTextView2.setLayoutParams(A0D2);
        C13989Tnp.A19(nametagResultCardView.A04, (int) (((float) nametagResultCardView.A00) * 0.83f), AnonymousClass972.MUTABLE_FLAG_MASK);
        Paint.FontMetrics fontMetrics2 = nametagResultCardView.A04.getPaint().getFontMetrics();
        TextView textView = nametagResultCardView.A04;
        ViewGroup.MarginLayoutParams A0D3 = DbS.A0D(textView);
        A0D3.topMargin = (int) ((((((float) nametagResultCardView.A00) * 0.057f) - fontMetrics.bottom) + fontMetrics2.top) - fontMetrics2.ascent);
        textView.setLayoutParams(A0D3);
        nametagResultCardView.A02.setVisibility(0);
        int[] iArr = NametagCardView.A0F[2];
        nametagResultCardView2.A07.getPaint().setShader(new LinearGradient((float) nametagResultCardView.A07.getMeasuredWidth(), 0.0f, 0.0f, (float) nametagResultCardView.A07.getMeasuredHeight(), iArr[0], iArr[1], Shader.TileMode.CLAMP));
        nametagResultCardView2.post(new C20093Wkr(nametagResultCardView2));
    }

    private X5D getDelegate() {
        X5D x5d = this.A08;
        x5d.getClass();
        return x5d;
    }

    public void setDelegate(X5D x5d) {
        this.A08 = x5d;
        this.A0G.setOnClickListener(new WB0(this, 28));
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        View.inflate(getContext(), R.layout.nametag_result_card_view_layout, this);
        DbU.A0C(this, R.id.nametag_card_container).setLayoutTransition(new LayoutTransition());
        this.A0G = requireViewById(R.id.dismiss_button);
        this.A02 = requireViewById(R.id.user_container);
        this.A06 = DbU.A0X(this, R.id.profile_photo);
        this.A07 = (UsernameTextView) requireViewById(R.id.username_view);
        this.A04 = DbU.A0G(this, R.id.full_name_view);
        this.A01 = requireViewById(R.id.button_container);
        FollowButton followButton = (FollowButton) requireViewById(R.id.follow_button);
        this.A0A = followButton;
        followButton.A0J.A0H = AnonymousClass000.A00(708);
        UpdatableButton updatableButton = (UpdatableButton) requireViewById(R.id.deeplink_button);
        this.A09 = updatableButton;
        updatableButton.setIsBlueButton(true);
        this.A03 = DbU.A0G(this, R.id.follow_status_view);
        this.A05 = DbU.A0G(this, R.id.view_profile_button);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r9.A2A() == false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, com.instagram.user.model.User r9) {
        /*
            r6 = this;
            X.2f1 r0 = X.AnonymousClass2f1.A00(r8)
            com.instagram.user.model.FollowStatus r5 = r0.A0N(r9)
            com.instagram.user.model.FollowStatus r4 = com.instagram.user.model.FollowStatus.A05
            r3 = 0
            if (r5 != r4) goto L_0x0014
            boolean r1 = r9.A2A()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r6.A0D = r0
            boolean r0 = X.2R8.A04(r8, r9)
            r2 = 8
            if (r0 == 0) goto L_0x0074
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            r0.setVisibility(r2)
            android.widget.TextView r1 = r6.A03
            r0 = 2131962587(0x7f132adb, float:1.9561903E38)
            r1.setText(r0)
        L_0x002c:
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r3)
        L_0x0031:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x004f
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x006a
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x006a
            android.view.View r1 = r6.A02
            r0 = 0
            r1.setAlpha(r0)
            X.X5D r4 = r6.A08
            r4.getClass()
            int r1 = r6.A00
            int r0 = r6.A0E
            r4.DTR(r1, r0, r3)
        L_0x004f:
            android.widget.TextView r4 = r6.A05
            r1 = 29
            X.WBE r0 = new X.WBE
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r9)
            r4.setOnClickListener(r0)
            int r1 = r6.A0F
            if (r1 <= 0) goto L_0x00c8
            android.view.View r0 = r6.A01
            X.0nA.A0f(r0, r1)
            android.view.View r0 = r6.A01
            r0.setVisibility(r3)
            return
        L_0x006a:
            android.view.View r0 = r6.A02
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A09(r0, r3)
            goto L_0x004f
        L_0x0074:
            if (r5 != r4) goto L_0x009f
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            r0.setVisibility(r2)
            android.widget.TextView r5 = r6.A03
            android.content.res.Resources r4 = r6.getResources()
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0094
            r1 = 2131962585(0x7f132ad9, float:1.95619E38)
        L_0x0088:
            java.lang.String r0 = r9.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r4, r0, r1)
            r5.setText(r0)
            goto L_0x002c
        L_0x0094:
            boolean r0 = r6.A0D
            r1 = 2131962583(0x7f132ad7, float:1.9561895E38)
            if (r0 == 0) goto L_0x0088
            r1 = 2131962584(0x7f132ad8, float:1.9561897E38)
            goto L_0x0088
        L_0x009f:
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A07
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            if (r5 != r1) goto L_0x00b2
            r0.setVisibility(r2)
            android.widget.TextView r5 = r6.A03
            android.content.res.Resources r4 = r6.getResources()
            r1 = 2131962586(0x7f132ada, float:1.9561901E38)
            goto L_0x0088
        L_0x00b2:
            r0.setVisibility(r3)
            com.instagram.user.follow.FollowButton r0 = r6.A0A
            X.4at r1 = r0.A0J
            X.3aD r0 = r6.A0H
            r1.A07(r0)
            r1.A03(r7, r8, r9)
            android.widget.TextView r0 = r6.A03
            r0.setVisibility(r2)
            goto L_0x0031
        L_0x00c8:
            android.view.View r0 = r6.A02
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView.A02(X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):void");
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, Math.max(getMeasuredHeight(), measuredWidth));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1391801969);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = i;
        this.A0E = i2;
        if (i != i3) {
            A01(this);
        } else if (i < i2 && i3 == i4 && !this.A0B) {
            if (this.A0D) {
                X5D x5d = this.A08;
                x5d.getClass();
                x5d.DTR(i, i2, true);
                View view = this.A02;
                C71392co r0 = C315596kB.A02;
                C294975nL A002 = C294975nL.A00(view);
                A002.A0M(1.0f, 0.0f);
                A002.A0F(true).A0H();
            }
            this.A0B = true;
        }
        AnonymousClass0fD.A0D(-1913244077, A062);
    }

    public NametagResultCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public NametagResultCardView(Context context) {
        super(context);
        A00();
    }
}
