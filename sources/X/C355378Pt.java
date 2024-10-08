package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.8Pt  reason: invalid class name and case insensitive filesystem */
public class C355378Pt extends Drawable {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public C355398Pv A05;
    public C355408Pw A06;
    public C355408Pw A07;
    public boolean A08;
    public Paint A09;
    public Paint A0A;
    public Integer A0B = AnonymousClass05K.A0N;
    public final int A0C;
    public final int A0D;
    public final RectF A0E = new RectF();
    public final int A0F;
    public final int A0G = 5;

    public C355378Pt(int i, int i2, int i3, int i4) {
        this.A0C = i2;
        this.A0D = i3;
        this.A0F = i4;
        Paint paint = new Paint(1);
        this.A0A = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A0A.setStrokeWidth((float) i3);
        this.A0A.setColor(i);
        Paint paint2 = new Paint();
        this.A09 = paint2;
        paint2.setColor(Color.argb(155, 0, 0, 0));
    }

    public void draw(Canvas canvas) {
        Path path;
        float f;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        C355398Pv r0 = this.A05;
        if (r0 != null) {
            r0.draw(canvas);
        }
        int intValue = this.A0B.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                path = new Path();
                RectF rectF = this.A0E;
                float f2 = rectF.bottom;
                float f3 = rectF.top;
                float f4 = rectF.right + ((float) this.A0G);
                f = f4 - rectF.left;
                float f5 = (float) this.A0C;
                path.moveTo(f4 + f5, f3);
                path.rLineTo(-f, 0.0f);
                float f6 = -f5;
                path.rQuadTo(f6, 0.0f, f6, f5);
                path.rLineTo(0.0f, (f2 - f3) - (2.0f * f5));
                path.rQuadTo(0.0f, f5, f5, f5);
            } else if (intValue == 2) {
                path = new Path();
                RectF rectF2 = this.A0E;
                float f7 = rectF2.bottom;
                float f8 = f7 - rectF2.top;
                float f9 = rectF2.right;
                float f10 = rectF2.left;
                float f11 = f9 - f10;
                float f12 = (float) this.A0C;
                path.moveTo(f10 - ((float) this.A0G), f7);
                path.rLineTo(f11 - f12, 0.0f);
                float f13 = -f12;
                path.rQuadTo(f12, 0.0f, f12, f13);
                path.rLineTo(0.0f, -(f8 - (2.0f * f12)));
                path.rQuadTo(0.0f, f13, f13, f13);
                f = -f11;
            } else if (intValue == 3) {
                RectF rectF3 = this.A0E;
                float f14 = (float) this.A0C;
                canvas.drawRoundRect(rectF3, f14, f14, this.A0A);
            } else {
                throw new RuntimeException();
            }
            path.rLineTo(f, 0.0f);
            canvas.drawPath(path, this.A0A);
        } else {
            RectF rectF4 = this.A0E;
            float f15 = rectF4.left;
            float f16 = (float) this.A0G;
            float f17 = rectF4.top;
            Paint paint = this.A0A;
            canvas2.drawLine(f15 - f16, f17, rectF4.right + f16, f17, paint);
            float f18 = rectF4.bottom;
            canvas2.drawLine(rectF4.left - f16, f18, rectF4.right + f16, f18, paint);
        }
        if (!this.A08) {
            C355408Pw r02 = this.A06;
            if (r02 != null) {
                r02.draw(canvas);
            }
            C355408Pw r03 = this.A07;
            if (r03 != null) {
                r03.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A04();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A00() {
        int i;
        if ((this instanceof C355418Px) || (this instanceof C355388Pu)) {
            return getBounds().width();
        }
        int width = getBounds().width() - (this.A0D * 2);
        C355408Pw r1 = this.A06;
        int i2 = 0;
        if (r1 != null) {
            i = r1.A02;
        } else {
            i = 0;
        }
        int i3 = width - i;
        C355408Pw r12 = this.A07;
        if (r12 != null) {
            i2 = r12.A02;
        }
        return i3 - i2;
    }

    public final int A01() {
        Rect bounds;
        C355408Pw r0 = this.A06;
        if (r0 == null || (bounds = r0.getBounds()) == null) {
            return (int) Math.floor((double) (this.A0E.left + (((float) this.A0D) / 2.0f)));
        }
        return bounds.right + this.A0F;
    }

    public final int A02() {
        Rect bounds;
        C355408Pw r0 = this.A07;
        if (r0 == null || (bounds = r0.getBounds()) == null) {
            return (int) Math.ceil((double) (this.A0E.right - (((float) this.A0D) / 2.0f)));
        }
        return bounds.left + this.A0F;
    }

    public final void A03() {
        int i;
        if (this instanceof C355388Pu) {
            C355398Pv r4 = this.A05;
            if (r4 != null) {
                r4.A00 = (float) this.A0C;
                r4.setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
                r4.A01 = this.A03;
                C355398Pv.A00(r4);
                r4.A02 = this.A02;
                C355398Pv.A00(r4);
                r4.invalidateSelf();
            }
        } else if (this.A05 != null) {
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            C355398Pv r42 = this.A05;
            if (r42 != null) {
                r42.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
            }
            C355408Pw r0 = this.A06;
            int i2 = 0;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            C355408Pw r02 = this.A07;
            if (r02 != null) {
                i2 = r02.A02;
            }
            C355398Pv r2 = this.A05;
            if (r2 != null) {
                r2.A01 = ((int) (((float) A00()) * this.A00)) + i;
                C355398Pv.A00(r2);
            }
            C355398Pv r3 = this.A05;
            if (r3 != null) {
                r3.A02 = ((int) (((float) A00()) * (1.0f - this.A01))) + i2;
                C355398Pv.A00(r3);
            }
            invalidateSelf();
        }
    }

    public final void A04() {
        if (this instanceof C355388Pu) {
            A05();
            C355408Pw r6 = this.A06;
            if (r6 != null) {
                Rect bounds = r6.getBounds();
                RectF rectF = this.A0E;
                float f = rectF.left;
                bounds.set((int) f, (int) rectF.top, (int) (f + ((float) r6.A02)), (int) rectF.bottom);
            }
            C355408Pw r0 = this.A07;
            if (r0 != null) {
                Rect bounds2 = r0.getBounds();
                RectF rectF2 = this.A0E;
                float f2 = rectF2.right;
                bounds2.set((int) (f2 - ((float) r0.A02)), (int) rectF2.top, (int) f2, (int) rectF2.bottom);
            }
        } else if (this instanceof C355418Px) {
            A05();
            C355408Pw r02 = this.A06;
            if (r02 != null) {
                Rect bounds3 = r02.getBounds();
                RectF rectF3 = this.A0E;
                float f3 = rectF3.left;
                float f4 = (float) (r02.A02 / 2);
                bounds3.set((int) (f3 - f4), (int) (rectF3.centerY() - (rectF3.height() / 6.0f)), (int) (rectF3.left + f4), (int) (rectF3.centerY() + (rectF3.height() / 6.0f)));
            }
            C355408Pw r03 = this.A07;
            if (r03 != null) {
                Rect bounds4 = r03.getBounds();
                RectF rectF4 = this.A0E;
                float f5 = rectF4.right;
                float f6 = (float) (r03.A02 / 2);
                bounds4.set((int) (f5 - f6), (int) (rectF4.centerY() - (rectF4.height() / 6.0f)), (int) (rectF4.right + f6), (int) (rectF4.centerY() + (rectF4.height() / 6.0f)));
            }
            invalidateSelf();
        } else {
            A05();
            float f7 = ((float) this.A0D) / 2.0f;
            C355408Pw r8 = this.A06;
            if (r8 != null) {
                RectF rectF5 = this.A0E;
                float f8 = rectF5.left + f7;
                r8.setBounds((int) Math.floor((double) f8), (int) Math.floor((double) (rectF5.top + f7)), (int) Math.floor((double) (f8 + ((float) r8.A02))), (int) Math.ceil((double) (rectF5.bottom - f7)));
            }
            C355408Pw r62 = this.A07;
            if (r62 != null) {
                RectF rectF6 = this.A0E;
                float f9 = rectF6.right - f7;
                r62.setBounds((int) Math.ceil((double) (f9 - ((float) r62.A02))), (int) Math.floor((double) (rectF6.top + f7)), (int) Math.floor((double) f9), (int) Math.ceil((double) (rectF6.bottom - f7)));
            }
        }
        A03();
        invalidateSelf();
    }

    public final void A06(int i) {
        C355398Pv r0;
        C355398Pv r2;
        if (this instanceof C355388Pu) {
            C355388Pu r3 = (C355388Pu) this;
            if (i == 0) {
                r2 = null;
            } else {
                r2 = r3.A05;
                if (r2 == null) {
                    r2 = new C386369kU(i, r3.A0C, r3.A0D);
                }
            }
            r3.A05 = r2;
            r3.A00 = i;
            return;
        }
        if (i == 0) {
            r0 = null;
        } else {
            r0 = new C355398Pv(i, this.A0C);
        }
        this.A05 = r0;
        this.A04 = this.A04;
        A03();
    }

    public final void A07(Shader shader) {
        this.A0A.setShader(shader);
        C355408Pw r1 = this.A06;
        if (r1 != null) {
            r1.A03.setShader(shader);
            r1.invalidateSelf();
        }
        C355408Pw r12 = this.A07;
        if (r12 != null) {
            r12.A03.setShader(shader);
            r12.invalidateSelf();
        }
        invalidateSelf();
    }

    public final void A08(C355408Pw r2) {
        this.A06 = r2;
        A07(this.A0A.getShader());
    }

    public final void A09(C355408Pw r2) {
        this.A07 = r2;
        A07(this.A0A.getShader());
    }

    public final boolean A0A(float f, int i) {
        Rect bounds;
        C355408Pw r0 = this.A06;
        if (!(r0 == null || (bounds = r0.getBounds()) == null)) {
            int width = bounds.left + (bounds.width() / 2);
            if (Integer.valueOf(width) != null) {
                float abs = Math.abs(f - ((float) width));
                int i2 = i + this.A0F;
                int A022 = A02() - A01();
                if (A022 < i2 * 2) {
                    i2 = A022 / 2;
                }
                if (abs > ((float) i2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A0B(float f, int i) {
        Rect bounds;
        C355408Pw r0 = this.A07;
        if (!(r0 == null || (bounds = r0.getBounds()) == null)) {
            int width = bounds.left + (bounds.width() / 2);
            if (Integer.valueOf(width) != null) {
                float abs = Math.abs(f - ((float) width));
                int i2 = i + this.A0F;
                int A022 = A02() - A01();
                if (A022 < i2 * 2) {
                    i2 = A022 / 2;
                }
                if (abs > ((float) i2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void A05() {
        int i;
        int i2;
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        int A002 = A00();
        float f = ((float) this.A0D) / 2.0f;
        float f2 = (float) A002;
        float f3 = this.A00 * f2;
        float f4 = (1.0f - this.A01) * f2;
        if (this.A08) {
            i = this.A03;
            i2 = this.A02;
        } else {
            i = 0;
            i2 = this.A0F * 2;
        }
        float f5 = ((float) bounds.left) + f3 + f + ((float) i);
        float f6 = ((((float) bounds.right) - f4) - f) - ((float) i2);
        this.A0E.set(f5, ((float) bounds.top) + f, f6, ((float) bounds.bottom) - f);
    }
}
