package com.instagram.ui.widget.textview;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass1A9;
import X.AnonymousClass418;
import X.C17107VId;
import X.C2604145o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class IgTextLayoutView extends View {
    public Layout A00;
    public Integer A01;
    public AnonymousClass418 A02;
    public final int A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        this.A02 = new AnonymousClass418(this);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A02.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        Layout layout = this.A00;
        if (layout != null) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        0qQ.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getClass().getName());
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    public final void setTextLayout(Layout layout) {
        0qQ.A0B(layout, 0);
        if (layout.getText() instanceof Spanned) {
            if (C2604145o.A00()) {
                setLayerType(1, (Paint) null);
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            float f = (float) this.A03;
            int lineCount = layout.getLineCount();
            if (lineCount > 0) {
                f += ((float) (layout.getLineTop(lineCount) - layout.getLineTop(lineCount - 1))) * (layout.getSpacingMultiplier() - 1.0f);
            }
            setPadding(paddingLeft, paddingTop, paddingRight, (int) (f + layout.getSpacingAdd()));
            this.A00 = layout;
            if (AnonymousClass1A9.A00()) {
                setContentDescription(getTextForAccessibility());
            }
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("CommentText must be spanned text");
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A02.A00;
    }

    public final Integer getCarouselIndex() {
        return this.A01;
    }

    public final CharSequence getTextForAccessibility() {
        CharSequence text;
        Layout layout = this.A00;
        if (layout == null || (text = layout.getText()) == null) {
            return "";
        }
        return text;
    }

    public final Layout getTextLayout() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = this.A00;
        if (layout != null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + layout.getWidth(), getPaddingTop() + getPaddingBottom() + layout.getHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-1347815446);
        0qQ.A0B(motionEvent, 0);
        Layout layout = this.A00;
        boolean z = false;
        if (layout == null) {
            AnonymousClass0fD.A0C(-173329971, A05);
            return false;
        }
        if (C17107VId.A00(layout, motionEvent, this) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0fD.A0C(1681844219, A05);
        return z;
    }

    public final void setCarouselIndex(Integer num) {
        this.A01 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setFocusable(true);
        this.A03 = getPaddingBottom();
        this.A02 = new AnonymousClass418(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        0qQ.A0B(context, 1);
        this.A02 = new AnonymousClass418(this);
    }
}
