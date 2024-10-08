package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.List;

public final class Q6Z extends Drawable implements Animatable, TZp {
    public int A00;
    public int A01 = -1;
    public Paint A02;
    public Rect A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final Q6X A09;

    public final int getOpacity() {
        return -2;
    }

    public final void start() {
        this.A07 = true;
        this.A00 = 0;
        if (this.A08) {
            A00();
        }
    }

    public final void stop() {
        this.A07 = false;
        this.A05 = false;
        C11271SIi sIi = this.A09.A00;
        List list = sIi.A0G;
        list.remove(this);
        if (list.isEmpty()) {
            sIi.A09 = false;
        }
    }

    private void A00() {
        if (!this.A04) {
            C11271SIi sIi = this.A09.A00;
            if (sIi.A0E.A07.A02 != 1) {
                if (!this.A05) {
                    this.A05 = true;
                    if (!sIi.A08) {
                        List list = sIi.A0G;
                        if (!list.contains(this)) {
                            boolean isEmpty = list.isEmpty();
                            list.add(this);
                            if (isEmpty && !sIi.A09) {
                                sIi.A09 = true;
                                sIi.A08 = false;
                                C11271SIi.A00(sIi);
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Cannot subscribe twice in a row");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Cannot subscribe to a cleared frame loader");
                    }
                } else {
                    return;
                }
            }
            invalidateSelf();
            return;
        }
        throw AnonymousClass7TE.A0w("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.A04) {
            if (this.A06) {
                C11271SIi sIi = this.A09.A00;
                int i = sIi.A02;
                int i2 = sIi.A01;
                Rect bounds = getBounds();
                Rect rect = this.A03;
                if (rect == null) {
                    rect = AnonymousClass7TE.A0W();
                    this.A03 = rect;
                }
                Gravity.apply(119, i, i2, bounds, rect);
                this.A06 = false;
            }
            C11271SIi sIi2 = this.A09.A00;
            QHP qhp = sIi2.A05;
            if (qhp != null) {
                bitmap = qhp.A00;
            } else {
                bitmap = sIi2.A03;
            }
            Rect rect2 = this.A03;
            if (rect2 == null) {
                rect2 = AnonymousClass7TE.A0W();
                this.A03 = rect2;
            }
            Paint paint = this.A02;
            if (paint == null) {
                paint = AnonymousClass7TE.A0V(2);
                this.A02 = paint;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A09;
    }

    public final int getIntrinsicHeight() {
        return this.A09.A00.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A09.A00.A02;
    }

    public final boolean isRunning() {
        return this.A05;
    }

    public final void setAlpha(int i) {
        Paint paint = this.A02;
        if (paint == null) {
            paint = AnonymousClass7TE.A0V(2);
            this.A02 = paint;
        }
        paint.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A02;
        if (paint == null) {
            paint = AnonymousClass7TE.A0V(2);
            this.A02 = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (!this.A04) {
            this.A08 = z;
            if (!z) {
                this.A05 = false;
                C11271SIi sIi = this.A09.A00;
                List list = sIi.A0G;
                list.remove(this);
                if (list.isEmpty()) {
                    sIi.A09 = false;
                }
            } else if (this.A07) {
                A00();
            }
            return super.setVisible(z, z2);
        }
        throw AnonymousClass7TE.A0w("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    public Q6Z(Q6X q6x) {
        this.A09 = q6x;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06 = true;
    }
}
