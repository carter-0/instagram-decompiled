package com.instagram.ui.widget.inlineerror;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C50120FPk;
import X.C71382cm;
import X.C71622eP;
import X.DbV;
import X.DbW;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class InlineErrorMessageView extends LinearLayout {
    public static final TimeInterpolator A09 = new DecelerateInterpolator();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public TextView A06;
    public String A07;
    public boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        setOrientation(1);
    }

    private final void A02(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1b);
            0qQ.A07(obtainStyledAttributes);
            this.A03 = obtainStyledAttributes.getResourceId(0, 0);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            this.A07 = C71622eP.A00(context, obtainStyledAttributes, 3);
            Context context2 = getContext();
            this.A02 = obtainStyledAttributes.getColor(4, context2.getColor(2Yu.A08(context)));
            this.A01 = obtainStyledAttributes.getColor(2, context2.getColor(2Yu.A03(context)));
            obtainStyledAttributes.recycle();
        }
    }

    private final void A00() {
        if (this.A06 == null) {
            View inflate = DbV.A0D(this).inflate(R.layout.inline_error_text_view, this, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            this.A06 = (TextView) inflate;
            View childAt = getChildAt(0);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                TextView textView = this.A06;
                0qQ.A0A(textView);
                ViewGroup.MarginLayoutParams A0A = DbW.A0A(textView, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                A0A.leftMargin = marginLayoutParams.leftMargin;
                A0A.rightMargin = marginLayoutParams.rightMargin;
                addView(this.A06);
                return;
            }
            throw AnonymousClass7TE.A0z("InlineErrorMessageView has no children; it has to wrap at least one view.");
        }
    }

    private final void A01() {
        String str = this.A07;
        if (str != null && !this.A08) {
            A00();
            TextView textView = this.A06;
            0qQ.A0A(textView);
            textView.setVisibility(0);
            TextView textView2 = this.A06;
            0qQ.A0A(textView2);
            textView2.setText(str);
            TextView textView3 = this.A06;
            0qQ.A0A(textView3);
            textView3.setTextColor(this.A02);
        }
    }

    public final void A03() {
        View view;
        TextView textView = this.A06;
        if (textView != null) {
            boolean z = this.A08;
            this.A08 = false;
            textView.setVisibility(8);
            if (z && (view = this.A05) != null) {
                view.setBackgroundDrawable(this.A04);
                Drawable drawable = this.A04;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0.getVisibility() != 0) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x008a
            int r3 = r7.length()
            r5 = 1
            int r3 = r3 - r5
            r4 = 0
            r2 = 0
            r1 = 0
        L_0x000b:
            if (r2 > r3) goto L_0x0023
            r0 = r3
            if (r1 != 0) goto L_0x0011
            r0 = r2
        L_0x0011:
            boolean r0 = X.Dbc.A13(r7, r0)
            if (r1 != 0) goto L_0x001e
            if (r0 != 0) goto L_0x001b
            r1 = 1
            goto L_0x000b
        L_0x001b:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            int r3 = r3 + -1
            goto L_0x000b
        L_0x0023:
            java.lang.String r0 = X.Dba.A0c(r7, r3, r2)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008a
            boolean r3 = r6.A08
            android.widget.TextView r0 = r6.A06
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            r6.A08 = r5
            r6.A00()
            android.widget.TextView r0 = r6.A06
            X.0qQ.A0A(r0)
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.A06
            X.0qQ.A0A(r0)
            r0.setText(r7)
            android.widget.TextView r1 = r6.A06
            X.0qQ.A0A(r1)
            int r0 = r6.A01
            r1.setTextColor(r0)
            if (r3 != 0) goto L_0x0067
            android.view.View r1 = r6.A05
            if (r1 == 0) goto L_0x0067
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0067
            r1.setBackgroundResource(r0)
        L_0x0067:
            if (r2 != 0) goto L_0x008a
            android.widget.TextView r1 = r6.A06
            X.0qQ.A0A(r1)
            r0 = 0
            r1.setAlpha(r0)
            android.widget.TextView r0 = r6.A06
            X.0qQ.A0A(r0)
            android.view.ViewPropertyAnimator r2 = X.DbY.A0G(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.animation.TimeInterpolator r0 = A09
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r0.start()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A04(java.lang.String):void");
    }

    public final void setHint(String str) {
        this.A07 = str;
        A01();
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(883834395);
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new C50120FPk(this, 3));
        A01();
        AnonymousClass0fD.A0D(-1027431541, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A02(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A02(context, attributeSet);
    }
}
