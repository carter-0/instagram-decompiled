package com.instagram.ui.widget.drawing;

import X.17k;
import X.2cp;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass37Q;
import X.AnonymousClass8FW;
import X.C232922uf;
import X.C301555zW;
import X.C301565zX;
import X.C301575zY;
import X.C301585zZ;
import X.C40898Al6;
import X.C61340me;
import X.C71382cm;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;
import java.util.ArrayList;

public class EffectSlider extends View {
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
    public int A0B;
    public int A0C;
    public long A0D;
    public 2cs A0E;
    public AnonymousClass8FW A0F;
    public C301555zW A0G;
    public boolean A0H;
    public boolean A0I;
    public float A0J;
    public float A0K;
    public int A0L;
    public BitmapShader A0M;
    public LinearGradient A0N;
    public 2cs A0O;
    public boolean A0P;
    public int[] A0Q;
    public int A0R;
    public final float A0S;
    public final float A0T;
    public final float A0U;
    public final Paint A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final Path A0Y;
    public final RectF A0Z;
    public final ArrayList A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final float A0d;
    public final GestureDetector A0e;
    public final C232922uf A0f;
    public final C232922uf A0g;

    public EffectSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        this.A0P = true;
        this.A0A = ((float) getWidth()) / 2.0f;
        this.A0J = (((float) getHeight()) - this.A0A) - ((float) getPaddingBottom());
        this.A09 = this.A06 + ((float) getPaddingTop());
        float height = ((((float) (getHeight() - getWidth())) - this.A06) - this.A0S) - ((float) getPaddingBottom());
        this.A08 = height;
        int i5 = this.A0B;
        if (i5 == 2 || i5 == 1) {
            f = (height - this.A09) * 0.060606062f;
        } else {
            f = this.A0d;
        }
        this.A06 = f;
        A00();
        float f2 = this.A02;
        float f3 = this.A08;
        A03(this, f3 + ((this.A09 - f3) * f2));
        A01(this);
    }

    private void A00() {
        int[] iArr = this.A0Q;
        if (iArr != null) {
            float f = this.A09;
            float f2 = this.A08;
            if (f != f2) {
                float f3 = this.A0T;
                LinearGradient linearGradient = new LinearGradient(f3, f, f3, f2, iArr, (float[]) null, Shader.TileMode.CLAMP);
                this.A0N = linearGradient;
                this.A0X.setShader(linearGradient);
            }
        }
        BitmapShader bitmapShader = this.A0M;
        if (bitmapShader != null) {
            this.A0W.setShader(bitmapShader);
        } else {
            this.A0W.setShader((Shader) null);
        }
        invalidate();
    }

    public static void A01(EffectSlider effectSlider) {
        float f = (float) effectSlider.A0O.A09.A00;
        float f2 = effectSlider.A0J;
        float f3 = f2 + ((effectSlider.A09 - f2) * f);
        float f4 = f2 + ((effectSlider.A08 - f2) * f);
        ArrayList arrayList = effectSlider.A0a;
        float f5 = effectSlider.A0A;
        float f6 = effectSlider.A0T / 2.0f;
        ((PointF) arrayList.get(0)).set(f5 - f6, f4);
        ((PointF) arrayList.get(1)).set(effectSlider.A0A - f6, f3);
        ((PointF) arrayList.get(2)).set(effectSlider.A0A + f6, f3);
        ((PointF) arrayList.get(3)).set(effectSlider.A0A + f6, f4);
        ArrayList arrayList2 = effectSlider.A0c;
        ((PointF) arrayList2.get(0)).set(effectSlider.A0A, f4);
        float f7 = effectSlider.A0A;
        float f8 = effectSlider.A0U / 2.0f;
        ((PointF) arrayList2.get(1)).set(f7 - f8, f3);
        ((PointF) arrayList2.get(2)).set(effectSlider.A0A + f8, f3);
        ((PointF) arrayList2.get(3)).set(effectSlider.A0A, f4);
        float f9 = effectSlider.A0J - effectSlider.A07;
        effectSlider.A05 = f9 + ((0.0f - f9) * f);
    }

    public static void A02(EffectSlider effectSlider, float f) {
        ArrayList arrayList = effectSlider.A0a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) arrayList.get(i);
            PointF pointF2 = (PointF) effectSlider.A0c.get(i);
            float f2 = pointF.x;
            float f3 = pointF.y;
            ((PointF) effectSlider.A0b.get(i)).set(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
        }
    }

    public static void A03(EffectSlider effectSlider, float f) {
        if (effectSlider.A0P) {
            float f2 = effectSlider.A08;
            float f3 = effectSlider.A09;
            float min = Math.min(f2, Math.max(f3, f));
            float f4 = (min - f2) / (f3 - f2);
            effectSlider.A02 = f4;
            AnonymousClass8FW r0 = effectSlider.A0F;
            if (r0 != null) {
                r0.Dwy(f4);
            }
            effectSlider.A07 = min;
        }
    }

    private void setVisibility(C301555zW r4) {
        2cs r2;
        double d;
        if (this.A0G != r4) {
            this.A0G = r4;
            if (r4 == C301555zW.FULL) {
                r2 = this.A0O;
                d = 1.0d;
            } else {
                if (r4 == C301555zW.HIDDEN) {
                    r2 = this.A0O;
                    d = 0.0d;
                }
                invalidate();
            }
            r2.A06(d);
            invalidate();
        }
    }

    public final void A04(int i, int i2, float[] fArr, byte[] bArr) {
        int length;
        this.A0B = i;
        this.A0C = i2;
        this.A0N = null;
        this.A0Q = null;
        this.A0M = null;
        this.A0X.setShader((Shader) null);
        if (fArr != null) {
            int length2 = fArr.length / 4;
            int[] iArr = new int[length2];
            this.A0Q = iArr;
            for (int i3 = length2 - 1; i3 >= 0; i3--) {
                int i4 = i3 * 4;
                iArr[(length2 - i3) - 1] = ((Math.round(fArr[i4 + 3] * 255.0f) & 255) << 24) | ((Math.round(fArr[i4] * 255.0f) & 255) << 16) | ((Math.round(fArr[i4 + 1] * 255.0f) & 255) << 8) | (Math.round(fArr[i4 + 2] * 255.0f) & 255);
            }
        }
        if (bArr != null && (length = bArr.length) > 0) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length);
            17k.A07(decodeByteArray, "Image could not be decoded");
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A0M = new BitmapShader(decodeByteArray, tileMode, tileMode);
        }
        A00();
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0G == C301555zW.PARTIAL) {
            if (this.A0H) {
                float max = Math.max(0.0f, Math.min((((float) (System.currentTimeMillis() - this.A0D)) - 0.0f) / 300.0f, 1.0f));
                this.A0E.A05((double) (1.0f - max));
                if (max <= 0.0f || max >= 1.0f) {
                    this.A0H = false;
                } else {
                    invalidate();
                }
                this.A00 = (float) AnonymousClass37Q.A03((double) max, (double) this.A03, (double) this.A04);
            }
            setTranslationX(this.A00);
        } else {
            setTranslationX(0.0f);
        }
        if (this.A0G != C301555zW.HIDDEN || !this.A0O.A0C()) {
            Path path = this.A0Y;
            path.rewind();
            if (this.A0B == 0) {
                ArrayList arrayList = this.A0b;
                PointF pointF = (PointF) arrayList.get(0);
                path.moveTo(pointF.x, pointF.y);
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = (PointF) arrayList.get(i);
                    path.lineTo(pointF2.x, pointF2.y);
                }
                path.close();
                path.setFillType(Path.FillType.WINDING);
            } else {
                RectF rectF = this.A0Z;
                float f = this.A0A;
                float f2 = (this.A06 * 0.5f) / 2.0f;
                rectF.set(f - f2, this.A09, f + f2, this.A08);
                path.reset();
                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                path.close();
            }
            canvas.drawPath(path, this.A0V);
            canvas.drawPath(path, this.A0X);
        }
        int i2 = this.A0C;
        if (i2 > 0 && this.A0B == 1) {
            float f3 = ((this.A0T * 5.0f) / 2.0f) * 0.9f;
            if (i2 > 1) {
                Paint paint = this.A0W;
                canvas.drawCircle(this.A0A, this.A09 + f3, f3, paint);
                canvas.drawCircle(this.A0A, this.A08 - f3, f3, paint);
            }
            float f4 = (this.A08 - this.A09) / ((float) (this.A0C + 1));
            for (int i3 = 0; i3 < this.A0C; i3++) {
                canvas.drawCircle(this.A0A, this.A09 + f4, f3, this.A0W);
                f4 += f4;
            }
        }
        float f5 = this.A07;
        if (f5 > 0.0f) {
            canvas.drawCircle(this.A0A, f5 + this.A05, this.A06, this.A0V);
            canvas.drawCircle(this.A0A, this.A07 + this.A05, this.A06, this.A0W);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A0R, SN3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public void setProgress(float f) {
        this.A02 = f;
        float f2 = this.A08;
        A03(this, f2 + ((this.A09 - f2) * f));
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(733003340);
        ViewParent parent = getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.A0G = C301555zW.PARTIAL;
            this.A0H = false;
            this.A04 = this.A01;
            this.A03 = this.A00;
            this.A0D = System.currentTimeMillis();
            postDelayed(new C40898Al6(this), 0);
            this.A0E.A04();
            this.A0I = false;
            float f = this.A07;
            int i = this.A0C;
            if (i > 0) {
                float f2 = this.A08;
                float f3 = this.A09;
                float f4 = f2 - f3;
                float f5 = f4 / 15.0f;
                float f6 = f4 / ((float) (i + 1));
                int i2 = 0;
                while (true) {
                    if (Math.abs((f - f3) - f6) >= f5) {
                        f6 += f6;
                        i2++;
                        if (i2 >= i) {
                            break;
                        }
                    } else {
                        f = f3 + f6;
                        break;
                    }
                }
            }
            this.A07 = f;
        } else if (action == 0) {
            this.A0K = motionEvent.getY();
            this.A0G = C301555zW.FULL;
            this.A0H = true;
            this.A04 = 0.0f;
            this.A03 = this.A00;
            this.A0D = System.currentTimeMillis();
        } else {
            if (action == 2 && this.A0I) {
                float y = motionEvent.getY();
                float f7 = this.A0K - y;
                this.A0K = y;
                A03(this, this.A07 - f7);
            }
            boolean onTouchEvent = this.A0e.onTouchEvent(motionEvent);
            AnonymousClass0fD.A0C(1688480494, A052);
            return onTouchEvent;
        }
        invalidate();
        boolean onTouchEvent2 = this.A0e.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(1688480494, A052);
        return onTouchEvent2;
    }

    public void setOnValueChangedListener(AnonymousClass8FW r1) {
        this.A0F = r1;
    }

    public EffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0Y = new Path();
        this.A0Z = new RectF();
        int i2 = 0;
        this.A0P = false;
        this.A02 = 0.0f;
        this.A09 = 0.0f;
        this.A08 = 0.0f;
        this.A0b = new ArrayList();
        this.A0a = new ArrayList();
        this.A0c = new ArrayList();
        this.A0G = C301555zW.HIDDEN;
        this.A0H = false;
        this.A0Q = null;
        this.A0N = null;
        this.A0M = null;
        C301565zX r6 = new C301565zX(this);
        this.A0f = r6;
        C301575zY r5 = new C301575zY(this);
        this.A0g = r5;
        try {
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A2F);
            try {
                float max = Math.max(0.0f, Math.min(obtainStyledAttributes.getFloat(9, -1.0f), 1.0f));
                this.A0T = obtainStyledAttributes.getDimension(15, 10.0f);
                this.A0U = obtainStyledAttributes.getDimension(16, 60.0f);
                float dimension = obtainStyledAttributes.getDimension(12, 60.0f) / 2.0f;
                this.A0d = dimension;
                int color = obtainStyledAttributes.getColor(14, -1);
                this.A0L = obtainStyledAttributes.getColor(11, -1);
                this.A0S = obtainStyledAttributes.getDimension(13, 0.0f);
                float dimension2 = obtainStyledAttributes.getDimension(10, 0.0f);
                this.A06 = dimension;
                obtainStyledAttributes.recycle();
                int i3 = (int) (((float) getResources().getDisplayMetrics().widthPixels) * max);
                this.A0R = i3;
                this.A01 = (float) ((i3 / 2) - getPaddingLeft());
                Paint paint = new Paint(1);
                this.A0X = paint;
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                paint.setColor(color);
                Paint paint2 = new Paint(1);
                this.A0V = paint2;
                paint2.setStyle(style);
                paint2.setColor(context2.getColor(R.color.black_25_transparent));
                paint2.setMaskFilter(new BlurMaskFilter(dimension2, BlurMaskFilter.Blur.OUTER));
                Paint paint3 = new Paint(1);
                this.A0W = paint3;
                paint3.setStyle(style);
                paint3.setColor(this.A0L);
                setLayerType(1, (Paint) null);
                2cp A002 = C61340me.A00();
                2cs A022 = A002.A02();
                A022.A06 = true;
                A022.A0A(r6);
                this.A0O = A022;
                2cs A023 = A002.A02();
                A023.A06 = true;
                A023.A0A(r5);
                this.A0E = A023;
                this.A0e = new GestureDetector(context, new C301585zZ(this), new Handler(Looper.getMainLooper()));
                Rect rect = new Rect();
                getHitRect(rect);
                rect.left -= 4;
                rect.right += 4;
                setTouchDelegate(new TouchDelegate(rect, this));
                do {
                    this.A0a.add(new PointF());
                    this.A0c.add(new PointF());
                    this.A0b.add(new PointF());
                    i2++;
                } while (i2 < 4);
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

    public void setVisibility(int i) {
        super.setVisibility(i);
        setVisibility(C301555zW.FULL);
    }

    public EffectSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
