package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.4Dk  reason: invalid class name and case insensitive filesystem */
public final class C262364Dk extends Drawable {
    public C262374Dl A00;
    public boolean A01;
    public boolean A02;

    private void A00() {
        if (!this.A01) {
            this.A01 = true;
            C262384Dm r2 = this.A00.A01;
            r2.A00++;
            List list = r2.A04;
            if (r2.A06 == null && list != null) {
                list.add(new WeakReference(this));
                C226952iF r1 = r2.A02;
                if (r2.A06 == null && r1 != null && !r2.A07) {
                    r1.E5t();
                    r2.A07 = true;
                }
            }
        }
    }

    public final void A01(C262424Dq r4) {
        C262384Dm r2 = this.A00.A01;
        Bitmap bitmap = r2.A06;
        if (bitmap == null) {
            Queue queue = r2.A05;
            queue.add(r4);
            Set set = C262384Dm.A08;
            synchronized (set) {
                set.add(r2);
            }
            bitmap = r2.A06;
            if (bitmap == null) {
                C226952iF r1 = r2.A02;
                if (r2.A06 == null && r1 != null && !r2.A07) {
                    r1.E5t();
                    r2.A07 = true;
                    return;
                }
                return;
            } else if (queue.remove(r4)) {
                C262384Dm.A01(r2);
            } else {
                return;
            }
        }
        r4.CyE(bitmap);
    }

    public final void A02(C262424Dq r3) {
        C262384Dm r1 = this.A00.A01;
        if (r1.A05.remove(r3)) {
            C262384Dm.A01(r1);
            C262384Dm.A00(r1);
        }
    }

    public final int getAlpha() {
        return this.A00.A00.getAlpha();
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A01.A03.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.A01.A03.getWidth();
    }

    public final int getOpacity() {
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap == null || bitmap.hasAlpha() || getAlpha() < 255) {
            return -3;
        }
        return -1;
    }

    public final Drawable mutate() {
        if (!this.A02 && super.mutate() == this) {
            this.A00 = new C262374Dl(this.A00);
            this.A02 = true;
        }
        return this;
    }

    public final void setAlpha(int i) {
        this.A00.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A00.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            A00();
        } else if (this.A01) {
            C262384Dm r4 = this.A00.A01;
            int i = r4.A00 - 1;
            r4.A00 = i;
            if (i == 0) {
                r4.A06 = null;
            }
            List list = r4.A04;
            if (list != null) {
                int i2 = 0;
                int size = list.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (equals(((Reference) list.get(i2)).get())) {
                        list.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                C262384Dm.A00(r4);
            }
            this.A01 = false;
        }
        return super.setVisible(z, z2);
    }

    public final void draw(Canvas canvas) {
        A00();
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A00.A00);
        }
        if (this.A00.A01.A01 != null) {
            canvas.drawRect(getBounds(), this.A00.A01.A01);
        }
    }
}
