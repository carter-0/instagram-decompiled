package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.LruCache;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class GAM extends Drawable {
    public float A00;
    public int A01;
    public C306386Ly A02;
    public boolean A03;
    public C306386Ly A04;
    public Integer A05;
    public final int A06;
    public final int A07;
    public final ValueAnimator A08;
    public final Context A09;
    public final Drawable A0A;
    public final C66805Mcr A0B;

    public final void draw(Canvas canvas) {
        String str;
        0qQ.A0B(canvas, 0);
        canvas.save();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        int i = bounds.left;
        int i2 = this.A07;
        canvas.clipRect(i + i2, bounds.top, bounds.right, bounds.bottom);
        canvas.translate((-this.A00) + ((float) i2), 0.0f);
        C306386Ly r1 = this.A02;
        if (r1 == null) {
            str = "textDrawableStart";
        } else {
            r1.draw(canvas);
            if (this.A03) {
                canvas.translate((float) (r1.A0A + this.A06), 0.0f);
                C306386Ly r0 = this.A04;
                if (r0 == null) {
                    str = "textDrawableEnd";
                } else {
                    r0.draw(canvas);
                }
            }
            canvas.restore();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void A00() {
        C306386Ly r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("textDrawableStart");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = r0.A0A + this.A06;
        this.A01 = i;
        ValueAnimator valueAnimator = this.A08;
        valueAnimator.setDuration((long) (i * 15));
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        C51969G9p.A10(valueAnimator);
        C56678I7i.A00(valueAnimator, this, 5);
        I84.A01(valueAnimator, this, 22);
    }

    public final void A01() {
        ValueAnimator valueAnimator = this.A08;
        if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2 > r4.intValue()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Integer r4, java.lang.Integer r5) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            r3.A05 = r4
            if (r4 == 0) goto L_0x0037
            if (r5 == 0) goto L_0x001d
            int r1 = r5.intValue()
            int r0 = r4.intValue()
            if (r1 > r0) goto L_0x0037
        L_0x001d:
            int r2 = r3.A07
            X.6Ly r0 = r3.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "textDrawableStart"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            int r0 = r0.A0A
            int r2 = r2 + r0
            int r1 = r4.intValue()
            r0 = 0
            if (r2 <= r1) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAM.A02(java.lang.Integer, java.lang.Integer):void");
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A0A;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            C306386Ly r0 = this.A02;
            if (r0 != null) {
                return Math.max(intrinsicHeight, r0.A06);
            }
        } else {
            C306386Ly r02 = this.A02;
            if (r02 != null) {
                return r02.A06;
            }
        }
        0qQ.A0F("textDrawableStart");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setAlpha(int i) {
        String str;
        C306386Ly r0 = this.A02;
        if (r0 == null) {
            str = "textDrawableStart";
        } else {
            r0.setAlpha(i);
            C306386Ly r02 = this.A04;
            if (r02 == null) {
                str = "textDrawableEnd";
            } else {
                r02.setAlpha(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        String str;
        C306386Ly r0 = this.A02;
        if (r0 == null) {
            str = "textDrawableStart";
        } else {
            r0.setColorFilter(colorFilter);
            C306386Ly r02 = this.A04;
            if (r02 == null) {
                str = "textDrawableEnd";
            } else {
                r02.setColorFilter(colorFilter);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public GAM(Context context, Typeface typeface, Drawable drawable, Spannable spannable, UserSession userSession, int i, int i2) {
        C306386Ly A012;
        int i3;
        boolean A1Z = DbW.A1Z(spannable);
        this.A09 = context;
        this.A0A = drawable;
        C66805Mcr mcr = new C66805Mcr(typeface, spannable, i, i2);
        this.A0B = mcr;
        this.A03 = A1Z;
        if (userSession != null) {
            Context A052 = DbT.A05(context);
            LruCache lruCache = ((C52227GJs) userSession.A01(C52227GJs.class, C52226GJr.A00)).A00;
            A012 = (C306386Ly) lruCache.get(AnonymousClass7TF.A0h(mcr));
            if (A012 == null) {
                A012 = GIX.A01(A052, mcr, GIX.A00(A052, mcr));
                lruCache.put(AnonymousClass7TF.A0h(mcr), A012);
            }
            this.A02 = A012;
        } else {
            int A002 = GIX.A00(context, mcr);
            this.A02 = GIX.A01(this.A09, this.A0B, A002);
            A012 = GIX.A01(this.A09, this.A0B, A002);
        }
        this.A04 = A012;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
        this.A08 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth() + dimensionPixelSize;
        } else {
            i3 = 0;
        }
        this.A07 = i3;
        this.A06 = AnonymousClass1GB.A01(0nA.A04(context, 12));
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        String str;
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            int i5 = (i4 - i2) / 2;
            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            drawable.setBounds(i, i5 - intrinsicHeight, drawable.getIntrinsicWidth() + i, i5 + intrinsicHeight);
        }
        C306386Ly r0 = this.A02;
        if (r0 == null) {
            str = "textDrawableStart";
        } else {
            r0.setBounds(i, i2, i3, i4);
            C306386Ly r02 = this.A04;
            if (r02 == null) {
                str = "textDrawableEnd";
            } else {
                r02.setBounds(i, i2, i3, i4);
                A00();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
