package com.instagram.ui.widget.drawing;

import X.0nH;
import X.0qQ;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.AnonymousClass37Q;
import X.AnonymousClass8O5;
import X.AnonymousClass9S0;
import X.C232922uf;
import X.C300715xi;
import X.C300785xp;
import X.SN3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;

public class StrokeWidthTool extends View {
    public static final int[] A0t = new int[2];
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public long A0E;
    public long A0F;
    public Drawable A0G;
    public Drawable A0H;
    public C300715xi A0I;
    public AnonymousClass8O5 A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public float A0Q;
    public float A0R;
    public boolean A0S;
    public final float A0T;
    public final float A0U;
    public final float A0V;
    public final float A0W;
    public final float A0X;
    public final Paint A0Y;
    public final Paint A0Z;
    public final Paint A0a;
    public final Paint A0b;
    public final Paint A0c;
    public final Paint A0d;
    public final Path A0e;
    public final C232922uf A0f;
    public final C232922uf A0g;
    public final C300785xp A0h;
    public final ArrayList A0i;
    public final ArrayList A0j;
    public final ArrayList A0k;
    public final AnonymousClass0eM A0l;
    public final AnonymousClass0eM A0m;
    public final AnonymousClass0eM A0n;
    public final float A0o;
    public final float A0p;
    public final float A0q;
    public final int A0r;
    public final GestureDetector A0s;

    public StrokeWidthTool(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0S = true;
        float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float f = (width - this.A0o) / width;
        this.A00 = f;
        this.A01 = f;
        this.A0D = ((float) getWidth()) / 2.0f;
        this.A02 = (((float) getHeight()) - this.A0D) - ((float) getPaddingBottom());
        float f2 = this.A0V;
        this.A0C = ((float) getPaddingTop()) + f2;
        this.A0B = ((((float) (getHeight() - getWidth())) - f2) - this.A0q) - ((float) getPaddingBottom());
        A04(this);
        if (this.A0O) {
            A05(this, 0.0f);
        }
        A03(this);
        Drawable drawable = this.A0G;
        if (drawable != null) {
            A01(drawable, getButtonRadius() * this.A00);
            drawable.setAlpha(255);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            A01(drawable2, getButtonRadius());
            drawable2.setAlpha(0);
        }
    }

    public void setCurrentRatio(float f) {
        this.A07 = (float) AnonymousClass37Q.A04((double) f, 0.0d, 1.0d, (double) this.A05, (double) this.A04);
        A03(this);
    }

    private void A00(int i) {
        this.A0K = AnonymousClass05K.A00;
        this.A0L = false;
        long j = (long) i;
        this.A0E = j;
        this.A08 = this.A0p;
        this.A06 = this.A03;
        this.A0F = System.currentTimeMillis();
        postDelayed(new AnonymousClass9S0(this), j);
    }

    private void A01(Drawable drawable, float f) {
        float f2 = f * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((f2 * f2) / 2.0f))) - this.A0Q, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f3 = this.A0D;
        float f4 = this.A02;
        drawable.setBounds((int) (f3 - min), (int) (f4 - min), (int) (f3 + min), (int) (f4 + min));
    }

    public static void A03(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.A0S) {
            float f = strokeWidthTool.A0B;
            float f2 = f - strokeWidthTool.A0C;
            float f3 = strokeWidthTool.A04;
            float f4 = strokeWidthTool.A05;
            strokeWidthTool.A0A = f - ((f2 / (f3 - f4)) * (strokeWidthTool.A07 - f4));
            strokeWidthTool.invalidate();
        }
    }

    public static void A04(StrokeWidthTool strokeWidthTool) {
        float f = (float) ((2cs) strokeWidthTool.A0l.getValue()).A09.A00;
        float f2 = strokeWidthTool.A02;
        float f3 = f2 + ((strokeWidthTool.A0C - f2) * f);
        float f4 = f2 + ((strokeWidthTool.A0B - f2) * f);
        ArrayList arrayList = strokeWidthTool.A0i;
        float f5 = strokeWidthTool.A0D;
        float f6 = strokeWidthTool.A0W / 2.0f;
        ((PointF) arrayList.get(0)).set(f5 - f6, f4);
        ((PointF) arrayList.get(1)).set(strokeWidthTool.A0D - f6, f3);
        ((PointF) arrayList.get(2)).set(strokeWidthTool.A0D + f6, f3);
        ((PointF) arrayList.get(3)).set(strokeWidthTool.A0D + f6, f4);
        ArrayList arrayList2 = strokeWidthTool.A0k;
        ((PointF) arrayList2.get(0)).set(strokeWidthTool.A0D, f4);
        float f7 = strokeWidthTool.A0D;
        float f8 = strokeWidthTool.A0X / 2.0f;
        ((PointF) arrayList2.get(1)).set(f7 - f8, f3);
        ((PointF) arrayList2.get(2)).set(strokeWidthTool.A0D + f8, f3);
        ((PointF) arrayList2.get(3)).set(strokeWidthTool.A0D, f4);
        float f9 = strokeWidthTool.A02 - strokeWidthTool.A0A;
        strokeWidthTool.A09 = f9 + ((0.0f - f9) * f);
    }

    public static void A05(StrokeWidthTool strokeWidthTool, float f) {
        ArrayList arrayList = strokeWidthTool.A0i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) arrayList.get(i);
            PointF pointF2 = (PointF) strokeWidthTool.A0k.get(i);
            float f2 = pointF.x;
            float f3 = pointF.y;
            ((PointF) strokeWidthTool.A0j.get(i)).set(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
        }
    }

    public static void A06(StrokeWidthTool strokeWidthTool, float f) {
        int i;
        int i2;
        float f2 = strokeWidthTool.A0B;
        float f3 = strokeWidthTool.A0C;
        float min = Math.min(f2, Math.max(f3, f));
        strokeWidthTool.A0A = min;
        float f4 = strokeWidthTool.A07;
        float f5 = strokeWidthTool.A04;
        float f6 = strokeWidthTool.A05;
        float f7 = f6 + (((f5 - f6) / (f2 - f3)) * (f2 - min));
        strokeWidthTool.A07 = f7;
        if (f7 != f4) {
            C300785xp r2 = strokeWidthTool.A0h;
            StrokeWidthTool strokeWidthTool2 = r2.A01;
            float currentRatio = strokeWidthTool2.getCurrentRatio() * 100.0f;
            if (0.0f > currentRatio || currentRatio > 1.0f) {
                if (24.0f <= currentRatio && currentRatio <= 26.0f) {
                    i2 = 25;
                } else if (49.0f <= currentRatio && currentRatio <= 51.0f) {
                    i2 = 50;
                } else if (74.0f <= currentRatio && currentRatio <= 76.0f) {
                    i2 = 75;
                } else if (99.0f > currentRatio || currentRatio > 100.0f) {
                    i = null;
                } else {
                    i = 100;
                }
                i = Integer.valueOf(i2);
            } else {
                i = 0;
            }
            if (!0qQ.A0K(r2.A00, i) && i != null) {
                strokeWidthTool2.announceForAccessibility(strokeWidthTool2.getContext().getString(2131974578, new Object[]{i}));
            }
            r2.A00 = i;
            AnonymousClass8O5 r0 = strokeWidthTool.A0J;
            if (r0 != null) {
                r0.Dwz(f4, f7);
            }
            AnonymousClass8O5 r3 = strokeWidthTool.A0J;
            if (r3 != null) {
                int[] iArr = A0t;
                strokeWidthTool.getLocationInWindow(iArr);
                r3.DrM(((float) iArr[0]) + strokeWidthTool.A0D, ((float) iArr[1]) + strokeWidthTool.A0A);
            }
            strokeWidthTool.invalidate();
        }
    }

    /* access modifiers changed from: private */
    public void setMode(C300715xi r4) {
        double d;
        if (this.A0I != r4) {
            this.A0I = r4;
            C300715xi r1 = C300715xi.COLLAPSED;
            2cs r2 = (2cs) this.A0l.getValue();
            if (r4 == r1) {
                d = 0.0d;
            } else {
                d = 1.0d;
            }
            r2.A06(d);
            invalidate();
        }
    }

    public final void A07() {
        this.A0K = AnonymousClass05K.A01;
        this.A0L = false;
        ((2cs) this.A0n.getValue()).A05(1.0d);
        this.A03 = 0.0f;
        invalidate();
        A00(IgNetworkConsentStorage.MAX_ENTRIES);
    }

    public float getCurrentRatio() {
        return (float) AnonymousClass37Q.A04((double) this.A07, (double) this.A05, (double) this.A04, 0.0d, 1.0d);
    }

    public float getStrokeWidthDp() {
        return this.A07;
    }

    public float getStrokeWidthPx() {
        return this.A07 * this.A0U;
    }

    public final void onDraw(Canvas canvas) {
        double d;
        if (!this.A0O) {
            if (this.A0L) {
                float max = Math.max(0.0f, Math.min((((float) (System.currentTimeMillis() - this.A0F)) - ((float) this.A0E)) / 300.0f, 1.0f));
                2cs r2 = (2cs) this.A0n.getValue();
                if (this.A0K == AnonymousClass05K.A01) {
                    d = (double) max;
                } else {
                    d = (double) (1.0f - max);
                }
                r2.A05(d);
                if (max <= 0.0f || max >= 1.0f) {
                    this.A0L = false;
                } else {
                    invalidate();
                }
                this.A03 = (float) AnonymousClass37Q.A04((double) max, 0.0d, 1.0d, (double) this.A06, (double) this.A08);
            }
            setTranslationX(this.A03);
        } else {
            setTranslationX(0.0f);
        }
        if (this.A0I == C300715xi.EXPANDED || !((2cs) this.A0l.getValue()).A0C()) {
            Path path = this.A0e;
            path.rewind();
            ArrayList arrayList = this.A0j;
            PointF pointF = (PointF) arrayList.get(0);
            path.moveTo(pointF.x, pointF.y);
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                path.lineTo(pointF2.x, pointF2.y);
            }
            path.close();
            path.setFillType(Path.FillType.WINDING);
            Paint paint = this.A0b;
            canvas.drawPath(path, paint);
            canvas.drawPath(path, this.A0d);
            float f = this.A0V;
            canvas.drawCircle(this.A0D, this.A0A + this.A09, f, paint);
            canvas.drawCircle(this.A0D, this.A0A + this.A09, f, this.A0c);
        }
        if (this.A0O) {
            float buttonRadius = getButtonRadius() * this.A01;
            canvas.drawCircle(this.A0D, this.A02, buttonRadius, this.A0b);
            Paint paint2 = this.A0Z;
            if (Color.alpha(paint2.getColor()) < 255) {
                canvas.drawCircle(this.A0D, this.A02, buttonRadius - (this.A0T / 2.0f), this.A0Y);
            }
            float f2 = this.A0D;
            float f3 = this.A02;
            float f4 = buttonRadius - (this.A0T / 2.0f);
            canvas.drawCircle(f2, f3, f4, paint2);
            canvas.drawCircle(this.A0D, this.A02, f4, this.A0a);
            float f5 = (float) ((2cs) this.A0l.getValue()).A09.A00;
            Drawable drawable = this.A0G;
            if (drawable != null) {
                canvas.save();
                canvas.rotate(-45.0f * f5, this.A0D, this.A02);
                drawable.setAlpha((int) ((1.0f - f5) * 255.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            Drawable drawable2 = this.A0H;
            if (drawable2 != null) {
                drawable2.setAlpha((int) (255.0f * f5));
                canvas.save();
                canvas.rotate((1.0f - f5) * 45.0f, this.A0D, this.A02);
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0r, SN3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setCollapsedIcon(Drawable drawable) {
        this.A0G = drawable;
        invalidate();
    }

    public void setColour(int i) {
        ColorFilter A002 = AnonymousClass37O.A00(0nH.A08(i, 1.0f));
        Drawable drawable = this.A0G;
        if (drawable != null) {
            drawable.setColorFilter(A002);
        }
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            drawable2.setColorFilter(A002);
        }
        this.A0Z.setColor(i);
        invalidate();
    }

    public void setStrokeWidthButtonShowing(boolean z) {
        C300715xi r0;
        this.A0O = z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = 8388627;
            if (z) {
                i = 8388691;
            }
            layoutParams2.gravity = i;
            setLayoutParams(layoutParams2);
        }
        if (this.A0O) {
            r0 = C300715xi.COLLAPSED;
        } else {
            r0 = C300715xi.EXPANDED;
        }
        setMode(r0);
    }

    public void setStrokeWidthDp(float f) {
        this.A07 = f;
        A03(this);
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + (this.A0T / 2.0f);
    }

    public final boolean A08(float f, float f2) {
        float buttonRadius = getButtonRadius();
        if (f >= 0.0f && f <= ((float) getWidth())) {
            float f3 = this.A02;
            if (f2 < f3 - buttonRadius || f2 > f3 + buttonRadius) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-1257615662);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (!this.A0O) {
                A00(0);
            }
            ((2cs) this.A0n.getValue()).A06(0.0d);
            this.A0N = false;
            this.A0P = false;
            if (this.A0O && this.A0M) {
                setMode(C300715xi.COLLAPSED);
                this.A0M = false;
            }
            AnonymousClass8O5 r0 = this.A0J;
            if (r0 != null) {
                r0.DrL();
            }
        } else {
            if (action == 0) {
                this.A0R = motionEvent.getY();
                if (!this.A0O) {
                    this.A0K = AnonymousClass05K.A01;
                    this.A0L = true;
                    this.A0E = 0;
                    this.A08 = 0.0f;
                    this.A06 = this.A03;
                    this.A0F = System.currentTimeMillis();
                }
            } else if (action == 2 && (this.A0P || this.A0M)) {
                float y = motionEvent.getY();
                float f = this.A0R - y;
                this.A0R = y;
                A06(this, this.A0A - f);
            }
            invalidate();
        }
        boolean onTouchEvent = this.A0s.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(1305702311, A052);
        return onTouchEvent;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (!this.A0O) {
            return;
        }
        if (i == 4 || i == 8) {
            setMode(C300715xi.COLLAPSED);
        }
    }

    public void setOnValueChangedListener(AnonymousClass8O5 r1) {
        this.A0J = r1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StrokeWidthTool(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r2 = r16
            r0 = r17
            r14.<init>(r15, r2, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r14.A0e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0k = r0
            X.5xi r0 = X.C300715xi.COLLAPSED
            r14.A0I = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r14.A0K = r0
            r4 = 0
            r14.A0S = r4
            r8 = 1
            r14.A0O = r8
            r14.A0L = r4
            X.5xj r0 = new X.5xj
            r0.<init>(r14)
            r14.A0f = r0
            X.5xk r0 = new X.5xk
            r0.<init>(r14)
            r14.A0g = r0
            r7 = 0
            android.content.Context r1 = r14.getContext()     // Catch:{ all -> 0x01d7 }
            int[] r0 = X.C71382cm.A2F     // Catch:{ all -> 0x01d7 }
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0)     // Catch:{ all -> 0x01d7 }
            r3 = 9
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r2.getFloat(r3, r0)     // Catch:{ all -> 0x01d0 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x01d0 }
            r12 = 0
            float r13 = java.lang.Math.max(r12, r0)     // Catch:{ all -> 0x01d0 }
            r3 = 6
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = r2.getDimension(r3, r0)     // Catch:{ all -> 0x01d0 }
            r14.A07 = r0     // Catch:{ all -> 0x01d0 }
            r0 = 8
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r2.getDimension(r0, r5)     // Catch:{ all -> 0x01d0 }
            r14.A05 = r0     // Catch:{ all -> 0x01d0 }
            r3 = 7
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r2.getDimension(r3, r0)     // Catch:{ all -> 0x01d0 }
            r14.A04 = r0     // Catch:{ all -> 0x01d0 }
            r3 = 15
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = r2.getDimension(r3, r0)     // Catch:{ all -> 0x01d0 }
            r14.A0W = r0     // Catch:{ all -> 0x01d0 }
            r0 = 16
            r3 = 1114636288(0x42700000, float:60.0)
            float r0 = r2.getDimension(r0, r3)     // Catch:{ all -> 0x01d0 }
            r14.A0X = r0     // Catch:{ all -> 0x01d0 }
            r0 = 12
            float r0 = r2.getDimension(r0, r3)     // Catch:{ all -> 0x01d0 }
            float r0 = r0 / r5
            r14.A0V = r0     // Catch:{ all -> 0x01d0 }
            r3 = 2
            r0 = 1077936128(0x40400000, float:3.0)
            float r5 = r2.getDimension(r3, r0)     // Catch:{ all -> 0x01d0 }
            r14.A0T = r5     // Catch:{ all -> 0x01d0 }
            r0 = 14
            r11 = -1
            int r10 = r2.getColor(r0, r11)     // Catch:{ all -> 0x01d0 }
            r0 = 11
            int r6 = r2.getColor(r0, r11)     // Catch:{ all -> 0x01d0 }
            r0 = 13
            float r0 = r2.getDimension(r0, r12)     // Catch:{ all -> 0x01d0 }
            r14.A0q = r0     // Catch:{ all -> 0x01d0 }
            r0 = 3
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch:{ all -> 0x01d0 }
            r14.setCollapsedIcon(r0)     // Catch:{ all -> 0x01d0 }
            r3 = 4
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r3)     // Catch:{ all -> 0x01d0 }
            r14.A0H = r0     // Catch:{ all -> 0x01d0 }
            r0 = 5
            float r0 = r2.getDimension(r0, r12)     // Catch:{ all -> 0x01d0 }
            r14.A0Q = r0     // Catch:{ all -> 0x01d0 }
            r0 = 10
            float r9 = r2.getDimension(r0, r12)     // Catch:{ all -> 0x01d0 }
            float r0 = r2.getDimension(r8, r12)     // Catch:{ all -> 0x01d0 }
            r14.A0o = r0     // Catch:{ all -> 0x01d0 }
            int r0 = r2.getResourceId(r4, r4)     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r15.getString(r0)     // Catch:{ all -> 0x01d0 }
            r14.setContentDescription(r0)     // Catch:{ all -> 0x01d0 }
        L_0x00e5:
            r2.recycle()
            android.content.res.Resources r2 = r14.getResources()
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            float r0 = r0.density
            r14.A0U = r0
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            r14.A0r = r0
            int r0 = r0 / 2
            int r2 = -r0
            int r0 = r14.getPaddingLeft()
            int r2 = r2 + r0
            float r0 = (float) r2
            r14.A0p = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r8)
            r14.A0a = r2
            r2.setColor(r11)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            r2.setStrokeWidth(r5)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r8)
            r14.A0Z = r0
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r0.setStyle(r5)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r8)
            r14.A0Y = r0
            r0.setStyle(r5)
            r0.setColor(r11)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r8)
            r14.A0d = r0
            r0.setStyle(r5)
            r0.setColor(r10)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r8)
            r14.A0b = r2
            r2.setStyle(r5)
            r0 = 2131099783(0x7f060087, float:1.7811929E38)
            int r0 = r1.getColor(r0)
            r2.setColor(r0)
            android.graphics.BlurMaskFilter$Blur r1 = android.graphics.BlurMaskFilter.Blur.OUTER
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r0.<init>(r9, r1)
            r2.setMaskFilter(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r8)
            r14.A0c = r0
            r0.setStyle(r5)
            r0.setColor(r6)
            r14.setLayerType(r8, r7)
            X.5xl r2 = new X.5xl
            r2.<init>(r14)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r15, r2, r1)
            r14.A0s = r0
        L_0x0185:
            java.util.ArrayList r1 = r14.A0i
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.add(r0)
            java.util.ArrayList r1 = r14.A0k
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.add(r0)
            java.util.ArrayList r1 = r14.A0j
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.add(r0)
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x0185
            X.5xm r0 = new X.5xm
            r0.<init>(r14)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A0m = r0
            X.5xn r0 = new X.5xn
            r0.<init>(r14)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A0l = r0
            X.5xo r0 = new X.5xo
            r0.<init>(r14)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A0n = r0
            X.5xp r0 = new X.5xp
            r0.<init>(r14)
            r14.A0h = r0
            return
        L_0x01d0:
            r0 = move-exception
            if (r2 == 0) goto L_0x01d8
            r2.recycle()
            throw r0
        L_0x01d7:
            r0 = move-exception
        L_0x01d8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.drawing.StrokeWidthTool.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public StrokeWidthTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
