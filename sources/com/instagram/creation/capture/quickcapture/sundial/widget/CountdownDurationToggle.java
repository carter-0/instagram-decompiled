package com.instagram.creation.capture.quickcapture.sundial.widget;

import X.03v;
import X.0mp;
import X.0qQ;
import X.AnonymousClass8JF;
import X.C273014lo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.regex.Pattern;

public final class CountdownDurationToggle extends IgdsButton {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass8JF A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void getCountdownDurationMs$annotations() {
    }

    public static final void A00(CountdownDurationToggle countdownDurationToggle) {
        Resources resources;
        int i;
        Object[] objArr;
        int i2;
        String string;
        Resources resources2;
        int i3;
        Object[] objArr2;
        int i4;
        String string2;
        int i5 = countdownDurationToggle.A00;
        if (i5 == 3000) {
            resources = countdownDurationToggle.getResources();
            i = 2131955428;
            objArr = new Object[1];
            i2 = 3;
            objArr[0] = Integer.valueOf(i2);
            string = resources.getString(i, objArr);
            0qQ.A07(string);
        } else if (i5 != 10000) {
            string = "";
        } else {
            resources = countdownDurationToggle.getResources();
            i = 2131955428;
            objArr = new Object[1];
            i2 = 10;
            objArr[0] = Integer.valueOf(i2);
            string = resources.getString(i, objArr);
            0qQ.A07(string);
        }
        countdownDurationToggle.setText(string);
        int i6 = countdownDurationToggle.A00;
        if (i6 == 3000) {
            resources2 = countdownDurationToggle.getResources();
            i3 = 2131955427;
            objArr2 = new Object[1];
            i4 = 3;
            objArr2[0] = Integer.valueOf(i4);
            string2 = resources2.getString(i3, objArr2);
            0qQ.A07(string2);
        } else if (i6 != 10000) {
            string2 = "";
        } else {
            resources2 = countdownDurationToggle.getResources();
            i3 = 2131955427;
            objArr2 = new Object[1];
            i4 = 10;
            objArr2[0] = Integer.valueOf(i4);
            string2 = resources2.getString(i3, objArr2);
            0qQ.A07(string2);
        }
        03v.A0G(countdownDurationToggle, string2);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.A0A;
        measureChild(textView, i, i2);
        int measuredWidth = textView.getMeasuredWidth() + this.A02;
        if (View.MeasureSpec.getMode(measuredWidth) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            if (size < measuredWidth) {
                size = measuredWidth;
            }
            measuredWidth = size;
        }
        this.A01.A02(measuredWidth, this.A01);
        setMeasuredDimension(measuredWidth, this.A01);
    }

    public final void setOnCountdownDurationChangedListener(AnonymousClass8JF r1) {
        this.A03 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 3000;
        setStyle(C273014lo.SECONDARY);
        TextView textView = this.A0A;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Rect rect = new Rect();
        String string = getResources().getString(2131955428, new Object[]{10});
        0qQ.A07(string);
        TextPaint paint = textView.getPaint();
        Pattern pattern = 0mp.A03;
        paint.getTextBounds(string, 0, string.length(), rect);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width() + this.A02, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        A00(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownDurationToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
