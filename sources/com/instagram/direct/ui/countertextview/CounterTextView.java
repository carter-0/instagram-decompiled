package com.instagram.direct.ui.countertextview;

import X.0oh;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C16494Uvq;
import X.C16495Uvr;
import X.C17828Vgh;
import X.C18022Vjy;
import X.C20015Wjb;
import X.C71382cm;
import X.C71622eP;
import X.DbZ;
import X.JTQ;
import X.Pxi;
import X.U0N;
import X.VS1;
import X.W4Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class CounterTextView extends View {
    public Paint A00;
    public Shader A01;
    public String A02;
    public int[] A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public C16495Uvr A08 = C16495Uvr.SCROLL_THROUGH_DIGITS;
    public VS1 A09;
    public final C17828Vgh A0A;
    public final Runnable A0B;
    public final ValueAnimator A0C;
    public final Paint A0D;
    public final Rect A0E = new Rect();
    public final ArrayList A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C17828Vgh(textPaint);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        0qQ.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new C20015Wjb(this);
        this.A0F = new ArrayList();
        A01(context, attributeSet, i);
    }

    private final void A01(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0O, i, 0);
        0qQ.A07(obtainStyledAttributes);
        setTextColor(obtainStyledAttributes.getColor(1, AnonymousClass7TF.A03(context, R.attr.igds_color_primary_text)));
        setTextSize(obtainStyledAttributes.getDimension(0, context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material)));
        String A002 = C71622eP.A00(context, obtainStyledAttributes, 2);
        if (A002 != null) {
            setFontFamily(A002);
        }
        obtainStyledAttributes.recycle();
        ValueAnimator valueAnimator = this.A0C;
        W4Q.A00(valueAnimator, this, 14);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(500);
        U0N.A00(valueAnimator, this, 18);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        Rect rect = this.A0E;
        int width = rect.width();
        int height = rect.height();
        float currentWidth = ((float) rect.left) + ((((float) width) - getCurrentWidth()) / 2.0f);
        float f = (float) height;
        C17828Vgh vgh = this.A0A;
        canvas.translate(currentWidth, ((float) rect.top) + ((f - vgh.A00) / 2.0f));
        canvas.clipRect(0.0f, 0.0f, getCurrentWidth(), vgh.A00);
        Paint paint = this.A0D;
        canvas.translate(0.0f, -paint.getFontMetrics().top);
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C18022Vjy vjy = (C18022Vjy) DbZ.A0g(arrayList, i);
            char[] cArr = vjy.A0C;
            if (cArr != null) {
                int i2 = vjy.A08;
                float f2 = vjy.A02;
                if (i2 >= 0 && i2 < cArr.length) {
                    canvas2.drawText(cArr, i2, 1, 0.0f, f2, paint);
                    i2 = vjy.A08;
                    if (i2 >= 0) {
                        vjy.A00 = cArr[i2];
                    }
                    f2 = vjy.A02;
                    vjy.A03 = f2;
                }
                int i3 = i2 + 1;
                C17828Vgh vgh2 = vjy.A0D;
                float f3 = f2 - vgh2.A00;
                if (i3 >= 0 && i3 < cArr.length) {
                    canvas2.drawText(cArr, i3, 1, 0.0f, f3, paint);
                }
                int i4 = vjy.A08 - 1;
                float f4 = vjy.A02 + vgh2.A00;
                if (i4 >= 0 && i4 < cArr.length) {
                    canvas2.drawText(cArr, i4, 1, 0.0f, f4, paint);
                }
                vjy.A00();
                canvas.translate(vjy.A04, 0.0f);
                i++;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        canvas.restore();
        Paint paint2 = this.A00;
        if (paint2.getShader() != null) {
            canvas.drawPaint(paint2);
        }
    }

    public final void setAnimationStyle(C16495Uvr uvr) {
        0qQ.A0B(uvr, 0);
        this.A08 = uvr;
        Iterator A1G = AnonymousClass7TE.A1G(this.A0F);
        while (A1G.hasNext()) {
            ((C18022Vjy) AnonymousClass7TF.A0a(A1G)).A0B = uvr;
        }
    }

    public final void setFontFamily(String str) {
        0qQ.A0B(str, 0);
        Paint paint = this.A0D;
        Context context = getContext();
        Integer A052 = 0oh.A05(str, false);
        Typeface create = Typeface.create(str, 0);
        0qQ.A07(create);
        paint.setTypeface(0oh.A03(context, create, A052));
        A00();
    }

    private final void A00() {
        C17828Vgh vgh = this.A0A;
        Paint paint = vgh.A01;
        vgh.A00 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        vgh.A02.clear();
        A02(this);
        invalidate();
    }

    public static final void A02(CounterTextView counterTextView) {
        boolean z = true;
        boolean A1O = JTQ.A1O(counterTextView.A06, ((int) counterTextView.getCurrentWidth()) + counterTextView.getPaddingLeft() + counterTextView.getPaddingRight());
        if (counterTextView.A05 == ((int) counterTextView.A0A.A00) + counterTextView.getPaddingTop() + counterTextView.getPaddingBottom()) {
            z = false;
        }
        if (A1O || z) {
            counterTextView.requestLayout();
        }
    }

    public static final void A03(CounterTextView counterTextView) {
        VS1 vs1 = counterTextView.A09;
        if (vs1 != null && !0qQ.A0K(vs1.A01, counterTextView.A02)) {
            counterTextView.setTextInternal(vs1.A01, vs1.A00);
            counterTextView.A0C.start();
        }
    }

    public static final void A04(CounterTextView counterTextView) {
        Iterator A1G = AnonymousClass7TE.A1G(counterTextView.A0F);
        while (A1G.hasNext()) {
            C18022Vjy vjy = (C18022Vjy) AnonymousClass7TF.A0a(A1G);
            if (vjy.A00 == 0) {
                A1G.remove();
            } else {
                vjy.A00();
            }
        }
    }

    public static final void A05(CounterTextView counterTextView, float f) {
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        Iterator A1G = AnonymousClass7TE.A1G(counterTextView.A0F);
        while (A1G.hasNext()) {
            C18022Vjy vjy = (C18022Vjy) AnonymousClass7TF.A0a(A1G);
            int i2 = 1;
            if (f == 1.0f) {
                vjy.A00 = vjy.A01;
                vjy.A03 = 0.0f;
                vjy.A05 = 0.0f;
            }
            float f6 = vjy.A0D.A00;
            int i3 = vjy.A09;
            int i4 = vjy.A0A;
            float A062 = ((((float) C13988Tno.A06(i3, i4)) * f6) * f) / f6;
            int i5 = (int) A062;
            float f7 = A062 - ((float) i5);
            float f8 = vjy.A05 * (1.0f - f);
            if (i3 < i4) {
                i2 = -1;
            }
            vjy.A02 = (f7 * f6 * ((float) i2)) + f8;
            vjy.A08 = i4 + (i5 * i2);
            float f9 = vjy.A06;
            vjy.A04 = f9 + ((vjy.A07 - f9) * f);
        }
        Paint paint = counterTextView.A00;
        if (f <= 0.2f) {
            f2 = 0.0f;
            f3 = 0.2f;
            f4 = 200.0f;
            f5 = 255.0f;
        } else if (f >= 0.8f) {
            f2 = 0.8f;
            f3 = 1.0f;
            f4 = 255.0f;
            f5 = 200.0f;
        } else {
            i = 255;
            paint.setAlpha(i);
        }
        float f10 = f3 - f2;
        float f11 = f5 - f4;
        float f12 = 0.0f;
        if (f10 != 0.0f) {
            f12 = (f - f2) / f10;
        }
        i = (int) ((f12 * f11) + f4);
        paint.setAlpha(i);
    }

    private final float getCurrentWidth() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A0F);
        float f = 0.0f;
        while (A1G.hasNext()) {
            C18022Vjy vjy = (C18022Vjy) AnonymousClass7TF.A0a(A1G);
            vjy.A00();
            f += vjy.A04;
        }
        return f;
    }

    private final void setTextInternal(String str, C16494Uvq uvq) {
        String str2 = this.A02;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (str != null) {
            str3 = str;
        }
        this.A02 = str;
        int length = str2.length() - 1;
        int length2 = str3.length();
        while (true) {
            length2--;
            while (true) {
                if (length >= 0) {
                    C18022Vjy vjy = (C18022Vjy) this.A0F.get(length);
                    if (length2 >= 0) {
                        vjy.A01(uvq, str3.charAt(length2));
                        length--;
                        break;
                    }
                    vjy.A01(C16494Uvq.DOWN, 0);
                    length--;
                } else if (length2 >= 0) {
                    ArrayList arrayList = this.A0F;
                    arrayList.add(0, new C18022Vjy(this.A08, this.A0A));
                    ((C18022Vjy) arrayList.get(0)).A01(uvq, str3.charAt(length2));
                } else {
                    setContentDescription(str);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void setTextInternal$default(CounterTextView counterTextView, String str, C16494Uvq uvq, int i, Object obj) {
        if ((i & 2) != 0) {
            uvq = C16494Uvq.UP;
        }
        counterTextView.setTextInternal(str, uvq);
    }

    public final void A06(int i, String str, boolean z) {
        C16494Uvq uvq;
        if (!0qQ.A0K(this.A02, str)) {
            if (z) {
                if (i > this.A07) {
                    uvq = C16494Uvq.UP;
                } else {
                    uvq = C16494Uvq.DOWN;
                }
                this.A09 = new VS1(str, uvq);
                if (!this.A0C.isRunning()) {
                    A03(this);
                }
            } else {
                this.A0C.cancel();
                this.A09 = null;
                setTextInternal(str, C16494Uvq.UP);
                A05(this, 1.0f);
                A04(this);
                A02(this);
                invalidate();
            }
            this.A07 = i;
        }
    }

    public final String getText() {
        return this.A02;
    }

    public final void setAnimatingShaderColors(int[] iArr) {
        this.A03 = iArr;
    }

    public final void setAnimationDuration(long j) {
        this.A0C.setDuration(j);
    }

    public final void setTextColor(int i) {
        this.A0D.setColor(i);
        invalidate();
    }

    public final void setTextSize(float f) {
        if (this.A04 != f) {
            this.A04 = f;
            this.A0D.setTextSize(f);
            A00();
        }
    }

    public final void onMeasure(int i, int i2) {
        this.A06 = ((int) getCurrentWidth()) + getPaddingLeft() + getPaddingRight();
        this.A05 = ((int) this.A0A.A00) + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSize(this.A06, i), View.resolveSize(this.A05, i2));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-128270144);
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.A0E;
        rect.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        int[] iArr = this.A03;
        if (iArr != null) {
            this.A01 = new LinearGradient(0.0f, 0.0f, (float) rect.width(), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        AnonymousClass0fD.A0D(985235836, A062);
    }

    public final void setText(int i) {
        A06(i, String.valueOf(i), true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C17828Vgh(textPaint);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        0qQ.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new C20015Wjb(this);
        this.A0F = new ArrayList();
        A01(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C17828Vgh(textPaint);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        0qQ.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new C20015Wjb(this);
        this.A0F = new ArrayList();
        A01(context, (AttributeSet) null, 0);
    }
}
