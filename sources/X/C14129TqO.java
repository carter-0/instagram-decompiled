package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* renamed from: X.TqO  reason: case insensitive filesystem */
public final class C14129TqO {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07 = 15.0f;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K = 15.0f;
    public float A0L;
    public float A0M;
    public float A0N = 0.0f;
    public float A0O = 1.0f;
    public int A0P = 16;
    public int A0Q;
    public int A0R = 16;
    public int A0S = 1;
    public int A0T = 1;
    public TimeInterpolator A0U;
    public TimeInterpolator A0V;
    public ColorStateList A0W;
    public ColorStateList A0X;
    public ColorStateList A0Y;
    public ColorStateList A0Z;
    public Typeface A0a;
    public Typeface A0b;
    public StaticLayout A0c;
    public UWQ A0d;
    public UWQ A0e;
    public CharSequence A0f;
    public CharSequence A0g;
    public CharSequence A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k = true;
    public int[] A0l;
    public float A0m;
    public Typeface A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final Rect A0r;
    public final RectF A0s;
    public final TextPaint A0t;
    public final TextPaint A0u;
    public final View A0v;

    public static int A01(ColorStateList colorStateList, C14129TqO tqO) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = tqO.A0l;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void A07(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0E) {
            this.A0E = f;
            A02();
        }
    }

    public final void A0E(Canvas canvas) {
        float lineLeft;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        if (this.A0g != null && this.A0p) {
            int i = this.A0T;
            StaticLayout staticLayout = this.A0c;
            if (i > 1) {
                lineLeft = (float) staticLayout.getLineStart(0);
            } else {
                lineLeft = staticLayout.getLineLeft(0);
            }
            float f = (this.A08 + lineLeft) - (this.A0D * 2.0f);
            TextPaint textPaint = this.A0t;
            textPaint.setTextSize(this.A0A);
            float f2 = this.A08;
            float f3 = this.A09;
            float f4 = this.A0m;
            if (f4 != 1.0f && !this.A0i) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (this.A0T <= 1 || ((this.A0j && !this.A0i) || (this.A0i && this.A0E <= this.A0M))) {
                canvas.translate(f2, f3);
                this.A0c.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.translate(f, f3);
                float f5 = (float) alpha;
                C13988Tno.A0o(this.A0J, f5, textPaint);
                this.A0c.draw(canvas);
                C13988Tno.A0o(this.A06, f5, textPaint);
                int lineBaseline = this.A0c.getLineBaseline(0);
                CharSequence charSequence = this.A0h;
                float f6 = (float) lineBaseline;
                canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
                if (!this.A0i) {
                    String trim = this.A0h.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    textPaint.setAlpha(alpha);
                    canvas2.drawText(trim, 0, Math.min(this.A0c.getLineEnd(0), trim.length()), 0.0f, f6, textPaint);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public static int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private void A02() {
        View view;
        float f;
        int A012;
        float f2;
        float f3;
        float f4;
        float f5;
        Rect rect;
        float f6 = this.A0E;
        boolean z = this.A0i;
        RectF rectF = this.A0s;
        if (z) {
            if (f6 < this.A0M) {
                rect = this.A0r;
            } else {
                rect = this.A0q;
            }
            rectF.set(rect);
        } else {
            Rect rect2 = this.A0r;
            float f7 = (float) rect2.left;
            Rect rect3 = this.A0q;
            float f8 = (float) rect3.left;
            TimeInterpolator timeInterpolator = this.A0U;
            float f9 = f6;
            if (timeInterpolator != null) {
                f9 = timeInterpolator.getInterpolation(f6);
            }
            TimeInterpolator timeInterpolator2 = AnonymousClass6Y2.A00;
            rectF.left = C13988Tno.A00(f8, f7, f9);
            float f10 = this.A0C;
            float f11 = this.A01;
            TimeInterpolator timeInterpolator3 = this.A0U;
            float f12 = f6;
            if (timeInterpolator3 != null) {
                f12 = timeInterpolator3.getInterpolation(f6);
            }
            rectF.top = C13988Tno.A00(f11, f10, f12);
            float f13 = (float) rect2.right;
            float f14 = (float) rect3.right;
            TimeInterpolator timeInterpolator4 = this.A0U;
            float f15 = f6;
            if (timeInterpolator4 != null) {
                f15 = timeInterpolator4.getInterpolation(f6);
            }
            rectF.right = C13988Tno.A00(f14, f13, f15);
            float f16 = (float) rect2.bottom;
            float f17 = (float) rect3.bottom;
            TimeInterpolator timeInterpolator5 = this.A0U;
            float f18 = f6;
            if (timeInterpolator5 != null) {
                f18 = timeInterpolator5.getInterpolation(f6);
            }
            rectF.bottom = C13988Tno.A00(f17, f16, f18);
        }
        if (!this.A0i) {
            float f19 = this.A0B;
            float f20 = this.A00;
            TimeInterpolator timeInterpolator6 = this.A0U;
            float f21 = f6;
            if (timeInterpolator6 != null) {
                f21 = timeInterpolator6.getInterpolation(f6);
            }
            TimeInterpolator timeInterpolator7 = AnonymousClass6Y2.A00;
            this.A08 = C13988Tno.A00(f20, f19, f21);
            float f22 = this.A0C;
            float f23 = this.A01;
            TimeInterpolator timeInterpolator8 = this.A0U;
            float f24 = f6;
            if (timeInterpolator8 != null) {
                f24 = timeInterpolator8.getInterpolation(f6);
            }
            this.A09 = C13988Tno.A00(f23, f22, f24);
            float f25 = this.A0K;
            float f26 = this.A07;
            TimeInterpolator timeInterpolator9 = this.A0V;
            float f27 = f6;
            if (timeInterpolator9 != null) {
                f27 = timeInterpolator9.getInterpolation(f6);
            }
            A03(false, C13988Tno.A00(f26, f25, f27));
            view = this.A0v;
            view.postInvalidateOnAnimation();
            f = f6;
        } else if (f6 < this.A0M) {
            this.A08 = this.A0B;
            this.A09 = this.A0C;
            A03(false, this.A0K);
            view = this.A0v;
            view.postInvalidateOnAnimation();
            f = 0.0f;
        } else {
            this.A08 = this.A00;
            this.A09 = this.A01 - ((float) Math.max(0, this.A0Q));
            A03(false, this.A07);
            view = this.A0v;
            view.postInvalidateOnAnimation();
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator10 = AnonymousClass6Y2.A02;
        this.A06 = 1.0f - C13988Tno.A00(1.0f, 0.0f, timeInterpolator10.getInterpolation(1.0f - f6));
        view.postInvalidateOnAnimation();
        this.A0J = C13988Tno.A00(0.0f, 1.0f, timeInterpolator10.getInterpolation(f6));
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.A0X;
        ColorStateList colorStateList2 = this.A0Z;
        TextPaint textPaint = this.A0t;
        if (colorStateList != colorStateList2) {
            A012 = A00(f, A01(colorStateList2, this), A01(this.A0X, this));
        } else {
            A012 = A01(colorStateList, this);
        }
        textPaint.setColor(A012);
        float f28 = this.A02;
        float f29 = this.A0F;
        if (f28 != f29) {
            f28 = C13988Tno.A00(f28, f29, timeInterpolator10.getInterpolation(f6));
        }
        textPaint.setLetterSpacing(f28);
        textPaint.setShadowLayer(C13988Tno.A00(this.A05, this.A0I, f6), C13988Tno.A00(this.A03, this.A0G, f6), C13988Tno.A00(this.A04, this.A0H, f6), A00(f6, A01(this.A0Y, this), A01(this.A0W, this)));
        if (this.A0i) {
            float f30 = this.A0M;
            if (f6 <= f30) {
                float f31 = this.A0L;
                f4 = 1.0f;
                f5 = 0.0f;
                if (f6 >= f31) {
                    if (f6 > f30) {
                        f4 = 0.0f;
                    } else {
                        f3 = f6 - f31;
                        f2 = f30 - f31;
                        f4 = C13988Tno.A00(f5, f4, f3 / f2);
                    }
                }
            } else {
                f4 = 0.0f;
                f5 = 1.0f;
                if (f6 >= f30) {
                    if (f6 > 1.0f) {
                        f4 = 1.0f;
                    } else {
                        f3 = f6 - f30;
                        f2 = 1.0f - f30;
                        f4 = C13988Tno.A00(f5, f4, f3 / f2);
                    }
                }
            }
            C13988Tno.A0o(f4, 255.0f, textPaint);
        }
        view.postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(boolean r16, float r17) {
        /*
            r15 = this;
            r7 = r17
            java.lang.CharSequence r0 = r15.A0f
            if (r0 == 0) goto L_0x013f
            android.graphics.Rect r0 = r15.A0q
            int r0 = r0.width()
            float r2 = (float) r0
            android.graphics.Rect r0 = r15.A0r
            int r0 = r0.width()
            float r6 = (float) r0
            float r5 = r15.A07
            r3 = r5
            float r0 = X.AnonymousClass7TE.A00(r7, r5)
            r8 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r9 = 1
            if (r0 == 0) goto L_0x009a
            r15.A0m = r10
            android.graphics.Typeface r1 = r15.A0n
            android.graphics.Typeface r0 = r15.A0a
            if (r1 == r0) goto L_0x0098
            r15.A0n = r0
            r1 = 1
        L_0x0035:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            float r0 = r15.A0A
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
            boolean r0 = r15.A0o
            if (r0 != 0) goto L_0x0048
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r1 = 1
        L_0x0049:
            r15.A0A = r3
            r15.A0o = r4
        L_0x004d:
            java.lang.CharSequence r0 = r15.A0g
            if (r0 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x013f
        L_0x0053:
            android.text.TextPaint r14 = r15.A0t
            float r0 = r15.A0A
            r14.setTextSize(r0)
            android.graphics.Typeface r0 = r15.A0n
            r14.setTypeface(r0)
            float r0 = r15.A0m
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r4 = 1
        L_0x0066:
            r14.setLinearText(r4)
            java.lang.CharSequence r4 = r15.A0f
            android.view.View r0 = r15.A0v
            int r0 = r0.getLayoutDirection()
            boolean r13 = X.C66581MXm.A1V(r0)
            boolean r0 = r15.A0k
            if (r0 == 0) goto L_0x0086
            if (r13 == 0) goto L_0x0095
            X.3cZ r3 = X.C245223cW.A02
        L_0x007d:
            r1 = 0
            int r0 = r4.length()
            boolean r13 = r3.Cb2(r4, r1, r0)
        L_0x0086:
            r15.A0j = r13
            int r1 = r15.A0T
            r8 = 1
            if (r1 <= r9) goto L_0x00c9
            if (r13 == 0) goto L_0x0093
            boolean r0 = r15.A0i
            if (r0 == 0) goto L_0x00c9
        L_0x0093:
            r9 = r1
            goto L_0x00c9
        L_0x0095:
            X.3cZ r3 = X.C245223cW.A01
            goto L_0x007d
        L_0x0098:
            r1 = 0
            goto L_0x0035
        L_0x009a:
            float r3 = r15.A0K
            android.graphics.Typeface r1 = r15.A0n
            android.graphics.Typeface r0 = r15.A0b
            if (r1 == r0) goto L_0x00c4
            r15.A0n = r0
            r1 = 1
        L_0x00a5:
            float r0 = X.AnonymousClass7TE.A00(r7, r3)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            r15.A0m = r10
        L_0x00af:
            float r5 = r5 / r3
            float r0 = r6 * r5
            if (r16 != 0) goto L_0x00c6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            float r2 = r2 / r5
            float r2 = java.lang.Math.min(r2, r6)
            goto L_0x0035
        L_0x00bf:
            float r7 = r17 / r3
            r15.A0m = r7
            goto L_0x00af
        L_0x00c4:
            r1 = 0
            goto L_0x00a5
        L_0x00c6:
            r2 = r6
            goto L_0x0035
        L_0x00c9:
            java.lang.CharSequence r12 = r15.A0f     // Catch:{ V1k -> 0x0125 }
            int r0 = (int) r2     // Catch:{ V1k -> 0x0125 }
            int r2 = r12.length()     // Catch:{ V1k -> 0x0125 }
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ V1k -> 0x0125 }
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END     // Catch:{ V1k -> 0x0125 }
            float r6 = r15.A0N     // Catch:{ V1k -> 0x0125 }
            float r5 = r15.A0O     // Catch:{ V1k -> 0x0125 }
            int r4 = r15.A0S     // Catch:{ V1k -> 0x0125 }
            r3 = 0
            int r1 = java.lang.Math.max(r3, r0)     // Catch:{ V1k -> 0x0125 }
            if (r9 != r8) goto L_0x00e6
            float r0 = (float) r1     // Catch:{ V1k -> 0x0125 }
            java.lang.CharSequence r12 = android.text.TextUtils.ellipsize(r12, r14, r0, r7)     // Catch:{ V1k -> 0x0125 }
        L_0x00e6:
            int r0 = r12.length()     // Catch:{ V1k -> 0x0125 }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ V1k -> 0x0125 }
            r2 = 0
            if (r13 == 0) goto L_0x00f5
            if (r9 != r8) goto L_0x00f5
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ V1k -> 0x0125 }
        L_0x00f5:
            android.text.StaticLayout$Builder r1 = android.text.StaticLayout.Builder.obtain(r12, r3, r0, r14, r1)     // Catch:{ V1k -> 0x0125 }
            r1.setAlignment(r11)     // Catch:{ V1k -> 0x0125 }
            r1.setIncludePad(r3)     // Catch:{ V1k -> 0x0125 }
            if (r13 == 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR     // Catch:{ V1k -> 0x0125 }
            goto L_0x0107
        L_0x0105:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL     // Catch:{ V1k -> 0x0125 }
        L_0x0107:
            r1.setTextDirection(r0)     // Catch:{ V1k -> 0x0125 }
            r1.setEllipsize(r7)     // Catch:{ V1k -> 0x0125 }
            r1.setMaxLines(r9)     // Catch:{ V1k -> 0x0125 }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0118
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x011b
        L_0x0118:
            r1.setLineSpacing(r6, r5)     // Catch:{ V1k -> 0x0125 }
        L_0x011b:
            if (r9 <= r8) goto L_0x0120
            r1.setHyphenationFrequency(r4)     // Catch:{ V1k -> 0x0125 }
        L_0x0120:
            android.text.StaticLayout r0 = r1.build()     // Catch:{ V1k -> 0x0125 }
            goto L_0x0134
        L_0x0125:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r1, r2)
            r0 = 0
        L_0x0134:
            r0.getClass()
            r15.A0c = r0
            java.lang.CharSequence r0 = r0.getText()
            r15.A0g = r0
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14129TqO.A03(boolean, float):void");
    }

    public final float A04() {
        if (this.A0f == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.A0u;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0a);
        textPaint.setLetterSpacing(this.A02);
        CharSequence charSequence = this.A0f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float A05() {
        TextPaint textPaint = this.A0u;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0a);
        textPaint.setLetterSpacing(this.A02);
        return -textPaint.ascent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1.height() <= 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r2 = this;
            android.graphics.Rect r1 = r2.A0q
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x001d
            android.graphics.Rect r1 = r2.A0r
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r1 = r1.height()
            r0 = 1
            if (r1 > 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.A0p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14129TqO.A06():void");
    }

    public final void A08(int i) {
        Context context = this.A0v.getContext();
        W0Q w0q = new W0Q(context, i);
        ColorStateList colorStateList = w0q.A0A;
        if (colorStateList != null) {
            this.A0X = colorStateList;
        }
        float f = w0q.A00;
        if (f != 0.0f) {
            this.A07 = f;
        }
        ColorStateList colorStateList2 = w0q.A09;
        if (colorStateList2 != null) {
            this.A0W = colorStateList2;
        }
        this.A03 = w0q.A04;
        this.A04 = w0q.A05;
        this.A05 = w0q.A06;
        this.A02 = w0q.A03;
        UWQ uwq = this.A0d;
        if (uwq != null) {
            uwq.A00 = true;
        }
        C14306Ttg ttg = new C14306Ttg(this);
        W0Q.A00(w0q);
        UWQ uwq2 = new UWQ(w0q.A01, ttg);
        this.A0d = uwq2;
        w0q.A05(context, uwq2);
        A0G(false);
    }

    public final void A09(int i) {
        if (this.A0P != i) {
            this.A0P = i;
            A0G(false);
        }
    }

    public final void A0A(int i) {
        Context context = this.A0v.getContext();
        W0Q w0q = new W0Q(context, i);
        ColorStateList colorStateList = w0q.A0A;
        if (colorStateList != null) {
            this.A0Z = colorStateList;
        }
        float f = w0q.A00;
        if (f != 0.0f) {
            this.A0K = f;
        }
        ColorStateList colorStateList2 = w0q.A09;
        if (colorStateList2 != null) {
            this.A0Y = colorStateList2;
        }
        this.A0G = w0q.A04;
        this.A0H = w0q.A05;
        this.A0I = w0q.A06;
        this.A0F = w0q.A03;
        UWQ uwq = this.A0e;
        if (uwq != null) {
            uwq.A00 = true;
        }
        C14305Ttf ttf = new C14305Ttf(this);
        W0Q.A00(w0q);
        UWQ uwq2 = new UWQ(w0q.A01, ttf);
        this.A0e = uwq2;
        w0q.A05(context, uwq2);
        A0G(false);
    }

    public final void A0B(int i, int i2, int i3, int i4) {
        Rect rect = this.A0q;
        if (rect.left != i || rect.top != i2 || rect.right != i3 || rect.bottom != i4) {
            rect.set(i, i2, i3, i4);
            this.A0o = true;
            A06();
        }
    }

    public final void A0C(int i, int i2, int i3, int i4) {
        Rect rect = this.A0r;
        if (rect.left != i || rect.top != i2 || rect.right != i3 || rect.bottom != i4) {
            rect.set(i, i2, i3, i4);
            this.A0o = true;
            A06();
        }
    }

    public final void A0D(ColorStateList colorStateList) {
        if (this.A0X != colorStateList) {
            this.A0X = colorStateList;
            A0G(false);
        }
    }

    public final void A0F(Typeface typeface) {
        boolean z;
        boolean z2;
        UWQ uwq = this.A0d;
        if (uwq != null) {
            uwq.A00 = true;
        }
        if (this.A0a != typeface) {
            this.A0a = typeface;
            z = true;
        } else {
            z = false;
        }
        UWQ uwq2 = this.A0e;
        if (uwq2 != null) {
            uwq2.A00 = true;
        }
        if (this.A0b != typeface) {
            this.A0b = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            A0G(false);
        }
    }

    public final void A0G(boolean z) {
        float f;
        Rect rect;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Rect rect2;
        float f7;
        float f8;
        float f9;
        StaticLayout staticLayout;
        View view = this.A0v;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z) {
            float f10 = this.A0A;
            A03(z, this.A07);
            CharSequence charSequence = this.A0g;
            if (!(charSequence == null || (staticLayout = this.A0c) == null)) {
                this.A0h = TextUtils.ellipsize(charSequence, this.A0t, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.A0h;
            float f11 = 0.0f;
            if (charSequence2 != null) {
                f = this.A0t.measureText(charSequence2, 0, charSequence2.length());
            } else {
                f = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.A0P, this.A0j ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i == 48) {
                rect = this.A0q;
                f2 = (float) rect.top;
            } else if (i != 80) {
                TextPaint textPaint = this.A0t;
                rect = this.A0q;
                f2 = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                rect = this.A0q;
                f2 = ((float) rect.bottom) + this.A0t.ascent();
            }
            this.A01 = f2;
            int i2 = absoluteGravity & 8388615;
            if (i2 == 1) {
                f3 = (float) rect.centerX();
                f /= 2.0f;
                f4 = f3 - f;
            } else if (i2 != 5) {
                f4 = (float) rect.left;
            } else {
                f3 = (float) rect.right;
                f4 = f3 - f;
            }
            this.A00 = f4;
            A03(z, this.A0K);
            StaticLayout staticLayout2 = this.A0c;
            if (staticLayout2 != null) {
                f5 = (float) staticLayout2.getHeight();
            } else {
                f5 = 0.0f;
            }
            CharSequence charSequence3 = this.A0g;
            if (charSequence3 != null) {
                f6 = this.A0t.measureText(charSequence3, 0, charSequence3.length());
            } else {
                f6 = 0.0f;
            }
            StaticLayout staticLayout3 = this.A0c;
            if (staticLayout3 != null && this.A0T > 1) {
                f6 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.A0c;
            if (staticLayout4 != null) {
                if (this.A0T > 1) {
                    f11 = (float) staticLayout4.getLineStart(0);
                } else {
                    f11 = staticLayout4.getLineLeft(0);
                }
            }
            this.A0D = f11;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.A0R, this.A0j ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 == 48) {
                rect2 = this.A0r;
                f7 = (float) rect2.top;
            } else if (i3 != 80) {
                rect2 = this.A0r;
                f7 = ((float) rect2.centerY()) - (f5 / 2.0f);
            } else {
                rect2 = this.A0r;
                f7 = (((float) rect2.bottom) - f5) + this.A0t.descent();
            }
            this.A0C = f7;
            int i4 = absoluteGravity2 & 8388615;
            if (i4 == 1) {
                f8 = (float) rect2.centerX();
                f6 /= 2.0f;
                f9 = f8 - f6;
            } else if (i4 != 5) {
                f9 = (float) rect2.left;
            } else {
                f8 = (float) rect2.right;
                f9 = f8 - f6;
            }
            this.A0B = f9;
            A03(false, f10);
            view.postInvalidateOnAnimation();
            A02();
        }
    }

    public C14129TqO(View view) {
        this.A0v = view;
        TextPaint textPaint = new TextPaint(129);
        this.A0t = textPaint;
        this.A0u = new TextPaint(textPaint);
        this.A0q = new Rect();
        this.A0r = new Rect();
        this.A0s = new RectF();
        float f = this.A0L;
        this.A0M = f + ((1.0f - f) * 0.5f);
    }
}
