package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.android.R;

/* renamed from: X.8R4  reason: invalid class name */
public final class AnonymousClass8R4 extends Drawable implements View.OnTouchListener, C317516nO {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final Context A04;
    public final int A05;
    public final TimeInterpolator A06;
    public final Drawable A07;
    public final Drawable A08;
    public final GestureDetector A09;
    public final AnonymousClass8QN A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass8R4(Context context, AnonymousClass8QN r5) {
        Drawable drawable;
        this.A04 = context;
        Drawable drawable2 = context.getDrawable(R.drawable.reel_viewer_shadow_left);
        Drawable drawable3 = null;
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        this.A07 = drawable;
        Drawable drawable4 = context.getDrawable(R.drawable.reel_viewer_shadow_right);
        this.A08 = drawable4 != null ? drawable4.mutate() : drawable3;
        this.A0A = r5;
        this.A09 = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
        this.A06 = new AccelerateDecelerateInterpolator();
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0B = true;
        this.A0C = true;
        this.A02 = -1;
        this.A03 = -1;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A0B) {
            long j = this.A02;
            if (j != -1) {
                int round = Math.round((1.0f - Math.min(Math.max(this.A06.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - j)) / 200.0f)), 0.0f), 1.0f)) * 255.0f);
                this.A00 = round;
                if (round > 0) {
                    invalidateSelf();
                } else {
                    this.A02 = -1;
                }
            }
            Drawable drawable = this.A07;
            if (drawable != null) {
                drawable.setAlpha(this.A00);
                drawable.draw(canvas);
            }
        }
        if (this.A0C) {
            long j2 = this.A03;
            if (j2 != -1) {
                int round2 = Math.round((1.0f - Math.min(Math.max(this.A06.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - j2)) / 200.0f)), 0.0f), 1.0f)) * 255.0f);
                this.A01 = round2;
                if (round2 > 0) {
                    invalidateSelf();
                } else {
                    this.A03 = -1;
                }
            }
            Drawable drawable2 = this.A08;
            if (drawable2 != null) {
                drawable2.setAlpha(this.A01);
                drawable2.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        Drawable drawable = this.A07;
        if (drawable != null) {
            int i = rect.left;
            drawable.setBounds(i, rect.top, i + this.A05, rect.bottom);
        }
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            int i2 = rect.right;
            drawable2.setBounds(i2 - this.A05, rect.top, i2, rect.bottom);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getX() > ((float) getBounds().width()) * 0.1f) {
            float x = motionEvent.getX();
            float width = (float) getBounds().width();
            if (x < width - (0.1f * width)) {
                return false;
            }
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (X.0mk.A02(r6.A04) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r3 = r6.A0A.A0c;
        r0 = r3.A0R.Brp() - 1;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (0 >= r0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (X.0mk.A02(r6.A04) != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (r1 > r0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        X.AnonymousClass8QZ.A05(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2 = 0
            X.0qQ.A0B(r7, r2)
            float r1 = r7.getX()
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.width()
            float r0 = (float) r0
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r5
            r4 = 1
            r3 = 255(0xff, float:3.57E-43)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0042
            r6.A00 = r3
            r6.invalidateSelf()
            android.content.Context r0 = r6.A04
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x0062
        L_0x0029:
            X.8QN r0 = r6.A0A
            X.8QZ r3 = r0.A0c
            X.7Gf r2 = r3.A0R
            int r0 = r2.getCount()
            int r1 = r0 + -1
            int r0 = r2.Brp()
            int r0 = r0 + 1
            if (r1 <= r0) goto L_0x003e
        L_0x003d:
            r1 = r0
        L_0x003e:
            X.AnonymousClass8QZ.A05(r3, r1)
            return r4
        L_0x0042:
            float r1 = r7.getX()
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.width()
            float r0 = (float) r0
            float r5 = r5 * r0
            float r0 = r0 - r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            r6.A01 = r3
            r6.invalidateSelf()
            android.content.Context r0 = r6.A04
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x0029
        L_0x0062:
            X.8QN r0 = r6.A0A
            X.8QZ r3 = r0.A0c
            X.7Gf r0 = r3.A0R
            int r0 = r0.Brp()
            int r0 = r0 + -1
            r1 = 0
            if (r2 >= r0) goto L_0x003e
            goto L_0x003d
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8R4.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A09.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        A00();
        return onTouchEvent;
    }

    public final void A00() {
        if (this.A00 > 0 && this.A02 == -1) {
            this.A02 = SystemClock.elapsedRealtime();
            invalidateSelf();
        }
        if (this.A01 > 0 && this.A03 == -1) {
            this.A03 = SystemClock.elapsedRealtime();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }
}
