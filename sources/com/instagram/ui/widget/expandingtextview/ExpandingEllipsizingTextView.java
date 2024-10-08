package com.instagram.ui.widget.expandingtextview;

import X.AnonymousClass7TE;
import X.C257443xP;
import X.C2612848z;
import X.C69202Nh0;
import X.C69259NiL;
import X.C71170Oej;
import X.C71382cm;
import X.C71406Ok5;
import X.C74282PsA;
import X.JTQ;
import X.PRK;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;

public class ExpandingEllipsizingTextView extends EllipsizingTextView {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public C69259NiL A04;
    public C257443xP A05;
    public boolean A06;
    public final ValueAnimator.AnimatorUpdateListener A07 = new C71170Oej(this, 16);

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = 0;
        this.A02 = 0;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView, android.widget.TextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View] */
    private void A00() {
        if (this.A02 <= 0 || this.A01 <= 0) {
            StaticLayout staticLayout = new StaticLayout(this.A02, getPaint(), (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.A02 = staticLayout.getHeight() + getCompoundPaddingBottom() + getCompoundPaddingTop();
            this.A01 = staticLayout.getLineTop(Math.min(this.A00, staticLayout.getLineCount())) + getCompoundPaddingTop() + getCompoundPaddingBottom();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView, android.widget.TextView, java.lang.Object, com.instagram.common.ui.base.IgTextView] */
    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0X);
        this.A06 = obtainStyledAttributes.getBoolean(0, false);
        int integer = obtainStyledAttributes.getInteger(4, 0);
        this.A00 = integer;
        if (integer == 0) {
            this.A06 = false;
        }
        setIncludeFontPadding(false);
        obtainStyledAttributes.recycle();
        this.A04 = C69259NiL.COLLAPSED;
        this.A05 = C2612848z.A00;
        setMaxLines(this.A00);
        ExpandingEllipsizingTextView.super.setOnClickListener(new C71406Ok5((Object) this, 2));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View, java.lang.Object] */
    public final void A03(boolean z) {
        C257443xP r1;
        C69259NiL niL = this.A04;
        C69259NiL niL2 = C69259NiL.COLLAPSED;
        if (niL != niL2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A01;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.removeAllUpdateListeners();
                        valueAnimator.cancel();
                    }
                    ValueAnimator A052 = JTQ.A05(height, i);
                    this.A03 = A052;
                    A052.addUpdateListener(this.A07);
                    this.A03.addListener(new C69202Nh0(this, 4));
                    this.A03.start();
                    r1 = this.A05;
                    if (r1.A06() && z) {
                        ((PRK) ((C74282PsA) r1.A03())).A00.A01.A01.invoke();
                    }
                    this.A04 = niL2;
                }
            }
            super.setMaxLines(this.A00);
            r1 = this.A05;
            ((PRK) ((C74282PsA) r1.A03())).A00.A01.A01.invoke();
            this.A04 = niL2;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView, com.instagram.ui.widget.expandingtextview.EllipsizingTextView, android.view.View] */
    public final void A04(boolean z) {
        C257443xP r1;
        C69259NiL niL = this.A04;
        C69259NiL niL2 = C69259NiL.EXPANDED;
        if (niL != niL2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A02;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.removeAllUpdateListeners();
                        valueAnimator.cancel();
                    }
                    super.setMaxLines(Integer.MAX_VALUE);
                    ValueAnimator A052 = JTQ.A05(height, i);
                    this.A03 = A052;
                    A052.addUpdateListener(this.A07);
                    this.A03.start();
                    r1 = this.A05;
                    if (r1.A06() && z) {
                        ((PRK) ((C74282PsA) r1.A03())).A00.A01.A01.invoke();
                    }
                    this.A04 = niL2;
                }
            }
            super.setMaxLines(Integer.MAX_VALUE);
            r1 = this.A05;
            ((PRK) ((C74282PsA) r1.A03())).A00.A01.A01.invoke();
            this.A04 = niL2;
        }
    }

    public C69259NiL getExpandState() {
        return this.A04;
    }

    public void setExpandState(C69259NiL niL) {
        C69259NiL niL2 = this.A04;
        if (niL2 == niL) {
            return;
        }
        if (niL2 == C69259NiL.EXPANDED) {
            A03(false);
        } else {
            A04(false);
        }
    }

    public void setMaxLines(int i) {
        this.A00 = i;
        super.setMaxLines(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw AnonymousClass7TE.A1B("Can't override the onClickListener for this viewTry using EllipsizingTextView instead");
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    private int getCollapsedStateHeight() {
        A00();
        return this.A01;
    }

    private int getExpandedStateHeight() {
        A00();
        return this.A02;
    }

    public void setOnExpandedStateChangeListener(C74282PsA psA) {
        this.A05 = C257443xP.A00(psA);
    }

    private void setEllipsizedMaxLines(int i) {
        super.setMaxLines(i);
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public ExpandingEllipsizingTextView(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }
}
