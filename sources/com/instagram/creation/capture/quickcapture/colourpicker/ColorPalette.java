package com.instagram.creation.capture.quickcapture.colourpicker;

import X.0f9;
import X.0mk;
import X.0qQ;
import X.0wj;
import X.2cs;
import X.A1X;
import X.A9X;
import X.AnonymousClass3Z0;
import X.AnonymousClass8BL;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8BZ;
import X.C61340me;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ColorPalette extends View {
    public static final int A0L = Color.rgb(230, 230, 230);
    public static final int A0M = Color.rgb(51, 51, 51);
    public static final int[] A0N = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public AnonymousClass8BL A05;
    public AnonymousClass8BW A06;
    public boolean A07;
    public float A08;
    public float A09;
    public UserSession A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final 2cs A0E;
    public final ArrayList A0F;
    public final GestureDetector A0G;
    public final AnonymousClass8BX A0H;
    public final AnonymousClass8BZ A0I;
    public final ArrayList A0J;
    public final boolean A0K;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A0I.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Iterator it = this.A0F.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            A9X a9x = (A9X) next;
            ColorPalette colorPalette = a9x.A0B;
            2cs r5 = colorPalette.A0E;
            if ((!r5.A0C()) || colorPalette.A06 == AnonymousClass8BW.LONG_PRESS_GRADIENT) {
                RectF rectF = a9x.A05;
                float f = a9x.A00;
                canvas.drawRoundRect(rectF, f, f, a9x.A03);
            }
            if (a9x.A08) {
                if (colorPalette.A03 > 0.0f && colorPalette.A06 == AnonymousClass8BW.SINGLE_COLOR && !(!r5.A0C())) {
                    RectF rectF2 = a9x.A05;
                    float f2 = a9x.A00;
                    canvas.drawRoundRect(rectF2, f2, f2, colorPalette.A0C);
                }
                RectF rectF3 = a9x.A05;
                float f3 = a9x.A00;
                canvas.drawRoundRect(rectF3, f3, f3, a9x.A02);
                float f4 = a9x.A00;
                canvas.drawRoundRect(rectF3, f4, f4, colorPalette.A0D);
            }
        }
    }

    public final void setColorStops(UserSession userSession, ArrayList arrayList) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(arrayList, 1);
        if (!arrayList.isEmpty()) {
            this.A0A = userSession;
            ArrayList arrayList2 = this.A0J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            this.A04 = ((AnonymousClass8BU) arrayList.get(0)).A00;
            invalidate();
            requestLayout();
        }
    }

    /* access modifiers changed from: private */
    public final void setMode(AnonymousClass8BW r4) {
        2cs r2;
        double d;
        if (this.A06 != r4) {
            this.A06 = r4;
            if (r4 == AnonymousClass8BW.SINGLE_COLOR) {
                AnonymousClass8BL r1 = this.A05;
                if (r1 != null) {
                    r1.DIC(false, this.A04);
                }
                r2 = this.A0E;
                d = 0.0d;
            } else {
                AnonymousClass8BL r12 = this.A05;
                if (r12 != null) {
                    r12.DIC(true, this.A04);
                }
                r2 = this.A0E;
                d = 1.0d;
            }
            r2.A06(d);
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A0I.A00;
    }

    public final List getColorStops() {
        return this.A0F;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        float f;
        ArrayList arrayList = this.A0F;
        arrayList.clear();
        ArrayList arrayList2 = this.A0J;
        int size = arrayList2.size();
        float width = ((float) getWidth()) / ((float) Math.max(size, 10));
        float height = (float) getHeight();
        if (this.A0A != null) {
            float f2 = height - 0.0f;
            if (((int) (width - 0.0f)) <= 0 || ((int) f2) <= 0) {
                0f9 AEf = 0wj.A01.AEf("ColorPalette#onLayout invalid bounds", 817900750);
                AEf.ABO("left", i);
                AEf.ABO("top", i2);
                AEf.ABO("right", i3);
                AEf.ABO("bottom", i4);
                AEf.ABO("numColors", size);
                AEf.report();
                return;
            }
        }
        float f3 = this.A09;
        float f4 = 0.0f + f3;
        float f5 = width - f3;
        float f6 = height - this.A08;
        float f7 = f6 - (f5 - f4);
        float f8 = width;
        float f9 = 0.0f;
        int i6 = 0;
        while (i6 < size) {
            if (this.A07 && i6 == size - 1) {
                f8 = (float) getWidth();
            }
            float f10 = f8;
            boolean z2 = this.A0K;
            int i7 = i6;
            if (z2) {
                i7 = (size - 1) - i6;
            }
            Object obj2 = arrayList2.get(i7);
            0qQ.A07(obj2);
            AnonymousClass8BU r1 = (AnonymousClass8BU) obj2;
            if (i7 == 0) {
                obj = arrayList2.get(i7);
            } else {
                obj = arrayList2.get(i7 - 1);
            }
            int i8 = ((AnonymousClass8BU) obj).A00;
            int i9 = i7 + 1;
            if (i9 < size) {
                i5 = ((AnonymousClass8BU) arrayList2.get(i9)).A00;
            } else {
                i5 = -1;
            }
            int i10 = r1.A00;
            int A002 = A1X.A00(0.5f, i8, i10);
            int A003 = A1X.A00(0.5f, i10, i5);
            boolean z3 = false;
            if (i7 != 0) {
                z3 = true;
            }
            boolean z4 = this.A0B;
            int i11 = A002;
            if (z2) {
                i11 = A003;
                A003 = A002;
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new A9X(r1, this, f9, f8, height, f4, f7, f5, f6, i11, A003, z3, z4));
            if (!this.A07 || i6 != 0) {
                f = f8 + width;
                f5 = f - f3;
                f4 = f8 + f3;
            } else {
                float width2 = (((float) getWidth()) - ((width * ((float) size)) / 2.0f)) + width;
                f = f8 + width2;
                f4 += width2;
                f5 += width2;
            }
            f8 = f;
            i6++;
            f9 = f10;
        }
        this.A01 = f7;
        this.A00 = f6;
    }

    public final void setIsItemRectangular(boolean z) {
        this.A0B = z;
        invalidate();
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1778195660(0x69fd1ccc, float:3.8249278E25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            r8 = 0
            X.0qQ.A0B(r11, r8)
            android.view.GestureDetector r0 = r10.A0G
            boolean r9 = r0.onTouchEvent(r11)
            int r1 = r11.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x0027
            r5 = 2
            if (r1 == r3) goto L_0x007f
            if (r1 == r5) goto L_0x0027
            r0 = 3
            if (r1 == r0) goto L_0x007f
        L_0x0020:
            r0 = -1260883478(0xffffffffb4d871ea, float:-4.031602E-7)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r9
        L_0x0027:
            X.8BW r1 = r10.A06
            X.8BW r0 = X.AnonymousClass8BW.LONG_PRESS_GRADIENT
            if (r1 != r0) goto L_0x0020
            float r6 = r11.getX()
            float r2 = r11.getY()
            r1 = 0
            int r0 = r10.getHeight()
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r0, r2)
            float r7 = java.lang.Math.max(r1, r0)
            java.util.ArrayList r0 = r10.A0F
            java.util.Iterator r2 = r0.iterator()
            X.0qQ.A07(r2)
        L_0x004c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r1 = r2.next()
            X.0qQ.A07(r1)
            X.A9X r1 = (X.A9X) r1
            boolean r0 = r1.A01(r6, r7)
            if (r0 == 0) goto L_0x004c
            int r5 = r1.A00(r6, r7)
            r10.A04 = r5
            X.8BL r2 = r10.A05
            if (r2 == 0) goto L_0x007b
            int[] r1 = A0N
            r10.getLocationInWindow(r1)
            r0 = r1[r8]
            float r0 = (float) r0
            float r6 = r6 + r0
            r0 = r1[r3]
            float r0 = (float) r0
            float r7 = r7 + r0
            r2.D4Y(r5, r6, r7)
        L_0x007b:
            r0 = -747853784(0xffffffffd36ca828, float:-1.01643348E12)
            goto L_0x00a4
        L_0x007f:
            X.8BX r0 = r10.A0H
            r0.A00 = r8
            X.8BW r1 = r10.A06
            X.8BW r0 = X.AnonymousClass8BW.LONG_PRESS_GRADIENT
            if (r1 != r0) goto L_0x0020
            X.8BW r0 = X.AnonymousClass8BW.SINGLE_COLOR
            r10.setMode(r0)
            int r0 = r10.A04
            X.8BU r2 = new X.8BU
            r2.<init>(r0)
            r1 = -1
            int r0 = r2.A00
            r10.A04 = r0
            X.8BL r0 = r10.A05
            if (r0 == 0) goto L_0x00a1
            r0.D4X(r2, r5, r1)
        L_0x00a1:
            r0 = 699235133(0x29ad7b3d, float:7.704122E-14)
        L_0x00a4:
            X.AnonymousClass0fD.A0C(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInteractionListener(AnonymousClass8BL r1) {
        this.A05 = r1;
    }

    public final void setShouldCenterColorStopList(boolean z) {
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.8BZ, X.3Z0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0J = new ArrayList();
        this.A0F = new ArrayList();
        this.A0K = 0mk.A02(context);
        this.A06 = AnonymousClass8BW.SINGLE_COLOR;
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0I);
            try {
                this.A02 = obtainStyledAttributes.getDimension(3, 5.0f);
                this.A09 = obtainStyledAttributes.getDimension(2, 0.0f);
                this.A08 = obtainStyledAttributes.getDimension(1, 0.0f);
                this.A03 = obtainStyledAttributes.getDimension(5, 0.0f);
                int color = obtainStyledAttributes.getColor(4, -16777216);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentDescription(context.getString(resourceId));
                }
                obtainStyledAttributes.recycle();
                Paint paint = new Paint(1);
                this.A0D = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A02);
                paint.setColor(-1);
                Paint paint2 = new Paint(1);
                this.A0C = paint2;
                paint2.setShadowLayer(this.A03, 0.0f, 0.0f, color);
                AnonymousClass8BX r2 = new AnonymousClass8BX(this);
                this.A0H = r2;
                this.A0G = new GestureDetector(context, r2, new Handler(Looper.getMainLooper()));
                AnonymousClass8BY r3 = new AnonymousClass8BY(this);
                2cs A022 = C61340me.A00().A02();
                A022.A06(0.0d);
                A022.A01();
                A022.A06 = true;
                A022.A0A(r3);
                this.A0E = A022;
                if (this.A03 > 0.0f) {
                    setLayerType(1, (Paint) null);
                }
                this.A0I = new AnonymousClass3Z0(this);
            } catch (Throwable th) {
                th = th;
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorPalette(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColorPalette(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
