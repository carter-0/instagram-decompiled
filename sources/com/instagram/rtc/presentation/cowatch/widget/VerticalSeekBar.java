package com.instagram.rtc.presentation.cowatch.widget;

import X.0qQ;
import X.AnonymousClass0fD;
import X.JTQ;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class VerticalSeekBar extends SeekBar {
    public SeekBar.OnSeekBarChangeListener A00;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.rotate(-90.0f);
        canvas.translate(-((float) getHeight()), 0.0f);
        super.onDraw(canvas);
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    public synchronized void setProgress(int i) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        boolean A1O = JTQ.A1O(i, getProgress());
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        if (A1O && (onSeekBarChangeListener = this.A00) != null) {
            onSeekBarChangeListener.onProgressChanged(this, getProgress(), false);
        }
    }

    public final SeekBar.OnSeekBarChangeListener getOnSeekBarChangeListener() {
        return this.A00;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(645228563);
        super.onSizeChanged(i2, i, i4, i3);
        AnonymousClass0fD.A0D(-1619226293, A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 != 3) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 473427052(0x1c37ec6c, float:6.085519E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            boolean r0 = r7.isEnabled()
            if (r0 != 0) goto L_0x0018
            r0 = -1086984234(0xffffffffbf35efd6, float:-0.71069086)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r5
        L_0x0018:
            int r1 = r8.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x007d
            if (r1 == r3) goto L_0x0072
            r0 = 2
            if (r1 == r0) goto L_0x002e
            r0 = 3
            if (r1 == r0) goto L_0x0072
        L_0x0027:
            r0 = 944410509(0x384a8f8d, float:4.8294245E-5)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r3
        L_0x002e:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x0037
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0037:
            int r6 = r7.getMax()
            int r0 = r7.getMax()
            float r1 = (float) r0
            float r0 = r8.getY()
            float r1 = r1 * r0
            float r0 = X.JTP.A00(r1, r7)
            int r0 = (int) r0
            int r6 = r6 - r0
            r2 = r7
            monitor-enter(r2)
            int r1 = r7.getProgress()     // Catch:{ all -> 0x0088 }
            super.setProgress(r6)     // Catch:{ all -> 0x0088 }
            int r0 = r7.getProgress()     // Catch:{ all -> 0x0088 }
            if (r1 == r0) goto L_0x0065
            int r1 = r7.getWidth()     // Catch:{ all -> 0x0088 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x0088 }
            r7.onSizeChanged(r1, r0, r5, r5)     // Catch:{ all -> 0x0088 }
        L_0x0065:
            monitor-exit(r2)
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r7.A00
            if (r1 == 0) goto L_0x0027
            int r0 = r7.getProgress()
            r1.onProgressChanged(r7, r0, r3)
            goto L_0x0027
        L_0x0072:
            android.widget.SeekBar$OnSeekBarChangeListener r0 = r7.A00
            if (r0 == 0) goto L_0x0079
            r0.onStopTrackingTouch(r7)
        L_0x0079:
            r7.setPressed(r5)
            goto L_0x0027
        L_0x007d:
            r7.setPressed(r3)
            android.widget.SeekBar$OnSeekBarChangeListener r0 = r7.A00
            if (r0 == 0) goto L_0x0027
            r0.onStartTrackingTouch(r7)
            goto L_0x0027
        L_0x0088:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.presentation.cowatch.widget.VerticalSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalSeekBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
