package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.SpinningGradientBorder;

/* renamed from: X.LRd  reason: case insensitive filesystem */
public final class C64162LRd {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final UserSession A03;
    public final SpinningGradientBorder A04;
    public final Integer A05;

    private void A01(ColorStateList colorStateList, Drawable drawable, View.OnClickListener onClickListener, String str, int i) {
        TextView textView = this.A02;
        textView.setText(str);
        textView.setTextColor(colorStateList);
        SpinningGradientBorder spinningGradientBorder = this.A04;
        spinningGradientBorder.setBackground(drawable);
        spinningGradientBorder.setSpinnerState(i);
        View view = this.A01;
        AnonymousClass0fU.A00(onClickListener, view);
        view.setOnLongClickListener((View.OnLongClickListener) null);
        2eS.A01(view);
    }

    public final void A03(LMN lmn, MV9 mv9) {
        A04(lmn, mv9, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        r9 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
        r6 = X.02K.A02(r2, X.2Yu.A07(r2));
        r10 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.LMN r12, X.MV9 r13, int r14) {
        /*
            r11 = this;
            r5 = r11
            java.lang.Integer r4 = r11.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r4 != r0) goto L_0x0019
            r0 = 1
            if (r14 > r0) goto L_0x0019
            java.lang.String r2 = "misconfigured holder. type="
            java.lang.String r1 = "BLAST"
            java.lang.String r0 = ", numTargets="
            java.lang.String r1 = X.002.A07(r14, r2, r1, r0)
            java.lang.String r0 = "OneTapSendButtonHolder"
            X.0wb.A03(r0, r1)
        L_0x0019:
            android.widget.TextView r3 = r11.A02
            int r2 = r13.BPM(r3)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            int r0 = r1.width
            if (r0 == r2) goto L_0x002c
            r1.width = r2
            r3.setLayoutParams(r1)
        L_0x002c:
            java.lang.Integer r0 = r12.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 2: goto L_0x0061;
                case 3: goto L_0x008b;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00bd;
                default: goto L_0x0035;
            }
        L_0x0035:
            r10 = 0
            java.lang.String r9 = r11.A00(r14)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            android.content.Context r2 = r11.A00
            X.0qQ.A0B(r2, r10)
            r1 = 0
            android.content.res.ColorStateList r0 = X.1QE.A0B(r2, r1)
            r7.setColor(r0)
            float r0 = X.JTR.A02(r2)
            r7.setCornerRadius(r0)
            android.content.res.ColorStateList r6 = X.1QE.A0C(r2, r1)
            r0 = 70
            X.LYG r8 = X.LYG.A01(r13, r11, r0)
            r5.A01(r6, r7, r8, r9, r10)
        L_0x0060:
            return
        L_0x0061:
            long r0 = r12.A00
            android.content.Context r3 = r11.A00
            r2 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r9 = r3.getString(r2)
            int r2 = X.2Yu.A07(r3)
            android.content.res.ColorStateList r6 = X.02K.A02(r3, r2)
            r2 = 0
            X.LY7 r8 = new X.LY7
            r8.<init>((int) r2, (java.lang.Object) r11, (java.lang.Object) r13)
            r10 = 1
            r7 = 0
            r5.A01(r6, r7, r8, r9, r10)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            com.instagram.ui.widget.gradientspinner.SpinningGradientBorder r2 = r11.A04
            r2.setCurrentPlayTime(r0)
            return
        L_0x008b:
            int r0 = r4.intValue()
            android.content.Context r2 = r11.A00
            android.content.res.Resources r1 = r2.getResources()
            switch(r0) {
                case 1: goto L_0x00b9;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00a9;
                case 8: goto L_0x00a9;
                default: goto L_0x0098;
            }
        L_0x0098:
            r0 = 2131960390(0x7f132246, float:1.9557447E38)
        L_0x009b:
            java.lang.String r9 = r1.getString(r0)
        L_0x009f:
            int r0 = X.2Yu.A07(r2)
            android.content.res.ColorStateList r6 = X.02K.A02(r2, r0)
            r10 = 2
            goto L_0x0105
        L_0x00a9:
            r0 = 2131964507(0x7f13325b, float:1.9565798E38)
            goto L_0x009b
        L_0x00ad:
            r0 = 2131952452(0x7f130344, float:1.9541347E38)
            goto L_0x009b
        L_0x00b1:
            r0 = 2131960311(0x7f1321f7, float:1.9557287E38)
            java.lang.String r9 = X.JTS.A0i(r1, r14, r0)
            goto L_0x009f
        L_0x00b9:
            r0 = 2131960141(0x7f13214d, float:1.9556942E38)
            goto L_0x009b
        L_0x00bd:
            java.lang.String r9 = r11.A00(r14)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            android.content.Context r1 = r11.A00
            r10 = 0
            X.0qQ.A0B(r1, r10)
            r0 = 0
            android.content.res.ColorStateList r0 = X.1QE.A0B(r1, r0)
            r7.setColor(r0)
            float r0 = X.JTR.A02(r1)
            r7.setCornerRadius(r0)
            int r0 = X.2Yu.A0E(r1)
            android.content.res.ColorStateList r6 = X.02K.A02(r1, r0)
            r0 = 1
            X.LY7 r8 = new X.LY7
            r8.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r13)
            r5.A01(r6, r7, r8, r9, r10)
            return
        L_0x00ed:
            android.view.View r0 = r11.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131960390(0x7f132246, float:1.9557447E38)
            java.lang.String r9 = r1.getString(r0)
            android.content.Context r1 = r11.A00
            int r0 = X.2Yu.A08(r1)
            android.content.res.ColorStateList r6 = X.02K.A02(r1, r0)
            r10 = 0
        L_0x0105:
            r7 = 0
            r8 = r7
            r5.A01(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64162LRd.A04(X.LMN, X.MV9, int):void");
    }

    private String A00(int i) {
        Resources resources;
        int i2;
        int intValue = this.A05.intValue();
        Context context = this.A00;
        switch (intValue) {
            case 1:
            case 2:
                resources = context.getResources();
                i2 = 2131973441;
                break;
            case 3:
                resources = context.getResources();
                i2 = 2131955157;
                break;
            case 4:
                return JTS.A0i(context.getResources(), i, 2131960307);
            case 5:
                resources = context.getResources();
                i2 = 2131954428;
                break;
            case 6:
                resources = context.getResources();
                i2 = 2131961425;
                break;
            case 7:
            case 8:
                resources = context.getResources();
                i2 = 2131964477;
                break;
            default:
                resources = context.getResources();
                i2 = 2131973082;
                break;
        }
        return resources.getString(i2);
    }

    public final void A02() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.A00.getSystemService("accessibility");
        View view = this.A01;
        if (view.isAccessibilityFocused() && accessibilityManager != null && 2eO.A02(accessibilityManager, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_PGO);
            obtain.setClassName(C64162LRd.class.toString());
            obtain.getText().add(view.getContentDescription());
            obtain.setSource(view);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public final void A05(String str, Integer num) {
        String str2;
        Resources resources;
        int i;
        if (num == AnonymousClass05K.A0C) {
            resources = this.A00.getResources();
            i = 2131960622;
        } else {
            Integer num2 = this.A05;
            Integer num3 = AnonymousClass05K.A0j;
            if (num2 != num3 && (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y)) {
                resources = this.A00.getResources();
                i = 2131960310;
            } else if (num2 == num3) {
                if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y) {
                    resources = this.A00.getResources();
                    i = 2131952459;
                    if (182.A05(0Tu.A05, this.A03)) {
                        i = 2131952460;
                    }
                } else {
                    resources = this.A00.getResources();
                    i = 2131952418;
                }
            } else if (num2 == AnonymousClass05K.A01) {
                resources = this.A00.getResources();
                i = 2131960341;
            } else if (num2 == AnonymousClass05K.A00) {
                resources = this.A00.getResources();
                i = 2131960306;
            } else {
                str2 = null;
                this.A01.setContentDescription(str2);
            }
        }
        str2 = AnonymousClass7TF.A0e(resources, str, i);
        this.A01.setContentDescription(str2);
    }

    public C64162LRd(View view, UserSession userSession, Integer num) {
        this.A01 = view.requireViewById(R.id.one_tap_send_button_container);
        SpinningGradientBorder spinningGradientBorder = (SpinningGradientBorder) view.requireViewById(R.id.one_tap_send_button_spinning_gradient_border);
        this.A04 = spinningGradientBorder;
        this.A02 = DbU.A0G(spinningGradientBorder, R.id.selectable_user_row_send_button_text_view);
        this.A05 = num;
        this.A00 = view.getContext();
        this.A03 = userSession;
    }
}
