package com.instagram.ui.widget.colourwheel;

import X.0mi;
import X.0mk;
import X.0qQ;
import X.2cs;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C353808Jd;
import X.C355118Os;
import X.C355128Ot;
import X.C355138Ou;
import X.C61340me;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ColourWheelView extends FrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public Drawable A0F;
    public C355138Ou A0G;
    public boolean A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final 2cs A0K;
    public final C355118Os A0L;
    public final FloatingIndicator A0M;
    public final Set A0N;
    public final boolean A0O;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A0A) {
            A02();
            C355118Os r4 = this.A0L;
            r4.setAlpha(0mi.A03((int) (255.0f * this.A00), 0, 255));
            canvas.drawCircle((float) r4.A00, (float) r4.A01, ((float) r4.A02) + this.A04 + 2.0f, this.A0I);
            canvas.drawCircle((float) r4.A00, (float) r4.A01, ((float) r4.A02) + this.A04, this.A0J);
            Drawable drawable = this.A0F;
            if (drawable == null) {
                0qQ.A0F("baseDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
            drawable.draw(canvas);
            r4.draw(canvas);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (!this.A0H) {
            return false;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.A0H = false;
            setMode(C355138Ou.GRADIENT_BUTTON);
        } else if (this.A0H) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBaseDrawable(Drawable drawable) {
        Drawable newDrawable;
        0qQ.A0B(drawable, 0);
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
            this.A0F = newDrawable;
        }
    }

    private final void A00() {
        View view = this.A09;
        if (view != null) {
            int x = (int) view.getX();
            View view2 = this.A09;
            if (view2 != null) {
                this.A07 = x + (view2.getWidth() / 2);
                View view3 = this.A09;
                if (view3 != null) {
                    float y = view3.getY();
                    View view4 = this.A09;
                    if (view4 != null) {
                        this.A08 = (int) ((y + ((float) (view4.getHeight() / 2))) - getCursorOffset());
                        return;
                    }
                }
            }
        }
        0qQ.A0F("childButtonView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        int i = this.A07;
        int i2 = this.A08;
        float f = this.A02;
        float f2 = ((float) i) - f;
        float f3 = this.A03;
        float f4 = ((float) i2) - f3;
        float f5 = this.A05;
        if ((f2 * f2) + (f4 * f4) >= f5 * f5) {
            double atan2 = Math.atan2((double) f4, (double) f2);
            double d = (double) f5;
            i = (int) (((double) f) + (d * Math.cos(atan2)));
            this.A07 = i;
            i2 = (int) (((double) f3) + (d * Math.sin(atan2)));
            this.A08 = i2;
        }
        FloatingIndicator floatingIndicator = this.A0M;
        floatingIndicator.A01((float) i, ((float) i2) + getCursorOffset(), (float) this.A07, (float) (this.A08 - (floatingIndicator.getHeight() / 2)), this.A0D, getColourAtCursor(), 1, 0, false);
    }

    private final void A02() {
        float f;
        float f2 = this.A00;
        float f3 = this.A01;
        int i = (int) (f3 + ((this.A05 - f3) * f2));
        View view = this.A09;
        String str = "childButtonView";
        if (view != null) {
            float x = view.getX();
            View view2 = this.A09;
            if (view2 != null) {
                float width = x + ((float) (view2.getWidth() / 2));
                View view3 = this.A09;
                if (view3 != null) {
                    float y = view3.getY();
                    View view4 = this.A09;
                    if (view4 != null) {
                        float height = y + ((float) (view4.getHeight() / 2));
                        boolean z = this.A0O;
                        float f4 = this.A0B;
                        if (z) {
                            f = width - f4;
                        } else {
                            f = f4 + width;
                        }
                        this.A02 = f;
                        float f5 = this.A0C + height;
                        this.A03 = f5;
                        float f6 = this.A00;
                        int i2 = (int) (width + ((f - width) * f6));
                        int i3 = (int) (height + ((f5 - height) * f6));
                        C355118Os r3 = this.A0L;
                        Rect rect = r3.A05;
                        rect.set(i2 - i, i3 - i, i2 + i, i3 + i);
                        r3.setBounds(rect);
                        Drawable drawable = this.A0F;
                        if (drawable == null) {
                            str = "baseDrawable";
                        } else {
                            drawable.setBounds(r3.getBounds());
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(ColourWheelView colourWheelView, Integer num) {
        for (C353808Jd r2 : colourWheelView.A0N) {
            int intValue = num.intValue();
            if (intValue == 0) {
                r2.D4a(colourWheelView.A06);
            } else if (intValue == 2) {
                r2.D4c();
            } else if (intValue == 3) {
                r2.D4b();
            } else if (intValue == 1) {
                r2.D4d();
            } else if (intValue == 4) {
                r2.D4Z(colourWheelView.getColourAtCursor());
            } else {
                throw new RuntimeException();
            }
        }
    }

    private final int getColourAtCursor() {
        int i = this.A07 - ((int) this.A02);
        int i2 = this.A08 - ((int) this.A03);
        double sqrt = Math.sqrt((double) ((i * i) + (i2 * i2)));
        float[] fArr = {0.0f, 0.0f, 1.0f};
        fArr[0] = ((float) ((Math.atan2((double) i2, -((double) i)) / 3.141592653589793d) * 180.0d)) + 180.0f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / ((double) this.A05))));
        return Color.HSVToColor(fArr);
    }

    private final float getCursorOffset() {
        return this.A0E - ((float) (this.A0M.getHeight() / 2));
    }

    private final void setMode(C355138Ou r4) {
        2cs r2;
        double d;
        if (r4 != this.A0G) {
            this.A0G = r4;
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                A01();
                r2 = this.A0K;
                d = 1.0d;
            } else if (ordinal == 1) {
                this.A0M.A00();
                r2 = this.A0K;
                d = 0.0d;
            } else {
                throw new RuntimeException();
            }
            r2.A06(d);
            invalidate();
        }
    }

    public final void setColourWheelStrokeWidth(float f) {
        this.A04 = f;
        this.A0I.setMaskFilter(new BlurMaskFilter(f + 2.0f, BlurMaskFilter.Blur.OUTER));
    }

    public final void A04() {
        A02();
        A00();
        setMode(C355138Ou.COLOUR_WHEEL);
        this.A0H = true;
        View view = this.A09;
        if (view == null) {
            0qQ.A0F("childButtonView");
            throw AnonymousClass00P.createAndThrow();
        }
        view.setVisibility(4);
        this.A0A = true;
        A03(this, AnonymousClass05K.A01);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(549040525);
        super.onFinishInflate();
        if (getChildCount() == 2) {
            this.A09 = getChildAt(1);
            A00();
            AnonymousClass0fD.A0D(-1577259635, A062);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Check failed.");
        AnonymousClass0fD.A0D(-253341821, A062);
        throw illegalStateException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r1 != 3) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 400456560(0x17de7b70, float:1.4377574E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L_0x0054
            r0 = 2
            if (r1 == r3) goto L_0x0021
            if (r1 == r0) goto L_0x0054
            r0 = 3
            if (r1 == r0) goto L_0x0021
        L_0x001a:
            r0 = -1720092406(0xffffffff9979790a, float:-1.2897442E-23)
        L_0x001d:
            X.AnonymousClass0fD.A0C(r0, r2)
            return r3
        L_0x0021:
            r5.A0H = r4
            X.8Ou r0 = r5.A0G
            if (r0 == 0) goto L_0x001a
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x0036
            if (r0 != r3) goto L_0x001a
            r0 = 487866055(0x1d143ec7, float:1.9620092E-21)
            X.AnonymousClass0fD.A0C(r0, r2)
            return r4
        L_0x0036:
            X.2cs r0 = r5.A0K
            boolean r0 = r0.A0C()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004b
            int r0 = r5.getColourAtCursor()
            r5.A06 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            A03(r5, r0)
        L_0x004b:
            X.8Ou r0 = X.C355138Ou.GRADIENT_BUTTON
            r5.setMode(r0)
            r0 = -512509594(0xffffffffe173b966, float:-2.8099489E20)
            goto L_0x001d
        L_0x0054:
            X.8Ou r1 = r5.A0G
            X.8Ou r0 = X.C355138Ou.COLOUR_WHEEL
            if (r1 != r0) goto L_0x001a
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.A07 = r0
            float r1 = r6.getY()
            float r0 = r5.getCursorOffset()
            float r1 = r1 - r0
            int r0 = (int) r1
            r5.A08 = r0
            r5.A01()
            X.2cs r0 = r5.A0K
            boolean r0 = r0.A0C()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            A03(r5, r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.colourwheel.ColourWheelView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setButtonRadius(float f) {
        this.A01 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Paint paint = new Paint(1);
        this.A0J = paint;
        Paint paint2 = new Paint(1);
        this.A0I = paint2;
        this.A0O = 0mk.A02(context);
        setWillNotDraw(false);
        setClipChildren(false);
        FloatingIndicator floatingIndicator = new FloatingIndicator(context);
        this.A0M = floatingIndicator;
        floatingIndicator.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(floatingIndicator);
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, C71382cm.A0J);
            this.A05 = (float) (typedArray.getDimensionPixelSize(2, 140) / 2);
            this.A0E = typedArray.getDimension(1, 80.0f);
            this.A0B = typedArray.getDimension(3, 0.0f);
            this.A0C = typedArray.getDimension(4, 92.0f);
            this.A04 = typedArray.getDimension(5, 2.0f);
            this.A0D = typedArray.getDimension(0, 40.0f);
            typedArray.recycle();
            this.A0L = new C355118Os((int) this.A04);
            paint.setColor(-1);
            this.A0N = new HashSet();
            this.A06 = getColourAtCursor();
            this.A01 = 32.0f;
            paint2.setColor(context.getColor(R.color.black_15_transparent));
            paint2.setMaskFilter(new BlurMaskFilter(this.A04 + 2.0f, BlurMaskFilter.Blur.OUTER));
            C355128Ot r3 = new C355128Ot(this);
            2cs A022 = C61340me.A00().A02();
            A022.A06(0.0d);
            A022.A01();
            A022.A0A(r3);
            this.A0K = A022;
            setMode(C355138Ou.GRADIENT_BUTTON);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColourWheelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColourWheelView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
