package com.instagram.ui.widget.qrcode;

import X.03t;
import X.0mq;
import X.0nA;
import X.0qQ;
import X.AnonymousClass0fD;
import X.JTT;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutosizingGradientTextView extends IgTextView {
    public int A00;
    public int A01;
    public int[] A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.widget.TextView, android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    private final void A00(int i, int i2) {
        int[] iArr = this.A02;
        if (iArr != null) {
            Integer num = null;
            Integer A04 = 03t.A04(iArr, 0);
            int[] iArr2 = this.A02;
            if (iArr2 != null) {
                num = 03t.A04(iArr2, 1);
            }
            if (A04 != null && num != null) {
                getPaint().setShader(new LinearGradient(0.0f, (float) i2, (float) i, 0.0f, A04.intValue(), num.intValue(), Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    public final void setGradient(int[] iArr) {
        this.A02 = iArr;
        A00(getWidth(), getHeight());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.widget.TextView, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    public final void onMeasure(int i, int i2) {
        int A06 = AnonymousClass0fD.A06(-1870505663);
        String obj = getText().toString();
        setTextSize(0, 0mq.A00(Layout.Alignment.ALIGN_CENTER, new TextPaint(getPaint()), obj, View.MeasureSpec.getSize(i), getMaxLines(), this.A01, this.A00));
        AutosizingGradientTextView.super.onMeasure(i, i2);
        AnonymousClass0fD.A0D(730941591, A06);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, com.instagram.ui.widget.qrcode.AutosizingGradientTextView] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(1668174876);
        AutosizingGradientTextView.super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0fD.A0D(-994157332, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = Math.round(0nA.A04(context, 40));
        this.A01 = Math.round(0nA.A04(context, 14));
    }

    public /* synthetic */ AutosizingGradientTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutosizingGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
