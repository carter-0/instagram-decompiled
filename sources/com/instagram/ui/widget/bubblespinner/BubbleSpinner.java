package com.instagram.ui.widget.bubblespinner;

import X.AnonymousClass05K;
import X.AnonymousClass8Y9;
import X.AnonymousClass8YA;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

public class BubbleSpinner extends View {
    public static final int[] A0D = {-4652876, -2947736, -652286, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public static final float[] A0E = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.0f};
    public static final float[] A0F = {0.7f, 0.75f, 0.8f, 0.85f, 0.9f, 0.95f, 1.0f};
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass8Y9[] A07;
    public long A08;
    public Paint A09;
    public AnonymousClass8YA A0A;
    public float[] A0B;
    public int[] A0C;

    public BubbleSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.8Y9[]} */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.8Y9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r9 = this;
            java.lang.Integer r0 = r9.A04
            int r0 = r0.intValue()
            r6 = 1
            if (r0 == r6) goto L_0x0055
            int r0 = r9.A01
            int[] r2 = new int[]{r0}
            r9.A0C = r2
        L_0x0011:
            int r1 = r9.A02
            X.8Y9[] r0 = new X.AnonymousClass8Y9[r1]
            r9.A07 = r0
            int r0 = r2.length
            int r1 = r1 / r0
            int r7 = java.lang.Math.max(r1, r6)
            r5 = 0
            r8 = 0
            r4 = 0
        L_0x0020:
            int r0 = r9.A02
            if (r5 >= r0) goto L_0x005e
            if (r8 < r7) goto L_0x0031
            int[] r0 = r9.A0C
            int r1 = r0.length
            int r1 = r1 - r6
            r0 = r4
            int r4 = r4 + 1
            if (r0 < r1) goto L_0x0030
            r4 = 0
        L_0x0030:
            r8 = 0
        L_0x0031:
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r9.A09 = r1
            int[] r0 = r9.A0C
            r0 = r0[r4]
            r1.setColor(r0)
            X.8Y9[] r3 = r9.A07
            float r2 = r9.A00
            android.graphics.Paint r1 = r9.A09
            X.8Y9 r0 = new X.8Y9
            r0.<init>()
            r0.A00 = r2
            r0.A03 = r1
            r3[r5] = r0
            int r8 = r8 + 1
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0055:
            int[] r2 = A0D
            r9.A0C = r2
            float[] r0 = A0F
            r9.A0B = r0
            goto L_0x0011
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.bubblespinner.BubbleSpinner.A00():void");
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0A == AnonymousClass8YA.LOADING) {
            Canvas canvas2 = canvas;
            if (!this.A06) {
                int width = canvas2.getWidth() / 2;
                float height = (float) canvas2.getHeight();
                float f = 0.416f;
                if (this.A05) {
                    f = 0.5f;
                }
                int i = (int) (height * f);
                AnonymousClass8Y9[] r10 = this.A07;
                float length = (float) (6.283185307179586d / ((double) r10.length));
                float f2 = ((float) ((int) (((float) width) * 0.875f))) + r10[0].A00;
                for (int i2 = 0; i2 < this.A02; i2++) {
                    double d = (double) (((float) i2) * length);
                    double d2 = (double) f2;
                    int cos = (int) (((double) width) + (Math.cos(d) * d2));
                    int sin = (int) (((double) i) + (Math.sin(d) * d2));
                    AnonymousClass8Y9 r0 = r10[i2];
                    r0.A01 = cos;
                    r0.A02 = sin;
                }
                this.A06 = true;
            }
            int pivotIndex = getPivotIndex();
            int i3 = pivotIndex;
            while (true) {
                float[] fArr = this.A0B;
                if (i3 < fArr.length + pivotIndex) {
                    int i4 = this.A02;
                    int i5 = i3 - i4;
                    if (i3 < i4) {
                        i5 = i3;
                    }
                    AnonymousClass8Y9 r4 = this.A07[i5];
                    canvas2.drawCircle((float) r4.A01, (float) r4.A02, (float) ((int) (r4.A00 * fArr[i3 - pivotIndex])), r4.A03);
                    i3++;
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }

    public void setBubbleCount(int i) {
        this.A02 = i;
        A00();
    }

    public void setBubbleRadius(float f) {
        this.A00 = f;
        A00();
    }

    public void setLoadingStatus(AnonymousClass8YA r4) {
        if (this.A0A != r4) {
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                this.A06 = false;
                this.A0A = AnonymousClass8YA.LOADING;
                this.A08 = SystemClock.elapsedRealtime();
                setVisibility(0);
                invalidate();
            } else if (ordinal == 1) {
                this.A0A = AnonymousClass8YA.DONE;
                setVisibility(8);
            }
        }
    }

    private int getPivotIndex() {
        long j = this.A03;
        return (int) ((((float) ((SystemClock.elapsedRealtime() - this.A08) % j)) / ((float) j)) * ((float) this.A02));
    }

    public BubbleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = AnonymousClass05K.A00;
        this.A0B = A0E;
        this.A02 = 40;
        this.A03 = 1000;
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, C71382cm.A07, 0, i);
            this.A02 = typedArray.getInteger(5, 40);
            this.A00 = typedArray.getFloat(1, 12.0f);
            this.A03 = (long) typedArray.getInteger(4, IgNetworkConsentStorage.MAX_ENTRIES);
            this.A05 = typedArray.getBoolean(3, true);
            this.A04 = AnonymousClass05K.A00(2)[typedArray.getInteger(2, 0)];
            this.A01 = typedArray.getColor(0, -1);
            typedArray.recycle();
            A00();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public BubbleSpinner(Context context) {
        this(context, (AttributeSet) null);
    }
}
