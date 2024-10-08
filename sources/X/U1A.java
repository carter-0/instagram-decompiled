package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import java.util.Arrays;

public final class U1A extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public Bitmap A05;
    public Canvas A06;
    public Paint A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public final int A0B;
    public final int A0C;
    public final Rect A0D;
    public final RoundRectShape A0E;
    public final View A0F;
    public final String A0G;
    public final Bitmap[] A0H;
    public final Rect[] A0I;
    public final View[] A0J;
    public final int A0K;
    public final Paint A0L = new Paint(7);
    public final Paint A0M = new Paint(5);
    public final PorterDuffXfermode A0N = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public final Rect A0O = new Rect();
    public final Rect A0P = new Rect();
    public final Rect A0Q = new Rect();
    public final RectF A0R = new RectF();
    public final Choreographer.FrameCallback A0S = new W81(this, 5);
    public final Choreographer A0T = Choreographer.getInstance();
    public final W8G A0U = new W8G(this);
    public final int[] A0V = new int[2];

    public final void A06() {
        int i = 0;
        int i2 = 0;
        while (true) {
            View[] viewArr = this.A0J;
            if (i2 >= viewArr.length) {
                break;
            }
            A03(viewArr[i2], this);
            i2++;
        }
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            bitmap.recycle();
            this.A04 = null;
        }
        while (true) {
            Bitmap[] bitmapArr = this.A0H;
            if (i < bitmapArr.length) {
                Bitmap bitmap2 = bitmapArr[i];
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmapArr[i].recycle();
                    bitmapArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    private int A00() {
        int i = this.A02;
        return C51973G9u.A01(i, AnonymousClass7TE.A05((float) Color.alpha(i), ((float) this.A0L.getAlpha()) / 255.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r2 = (android.view.TextureView) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.view.View r2, X.U1A r3) {
        /*
            boolean r0 = r2 instanceof com.instagram.common.ui.widget.textureview.MultiListenerTextureView
            if (r0 == 0) goto L_0x0014
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r2 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r2
            X.W8G r1 = r3.A0U
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.4X6 r0 = r2.A00
            java.util.Set r0 = r0.A00
            r0.remove(r1)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r2 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x0013
            android.view.TextureView r2 = (android.view.TextureView) r2
            android.view.TextureView$SurfaceTextureListener r1 = r2.getSurfaceTextureListener()
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1 instanceof X.W8H
            if (r0 == 0) goto L_0x0013
            X.W8H r1 = (X.W8H) r1
            android.view.TextureView$SurfaceTextureListener r0 = r1.A00
            r2.setSurfaceTextureListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1A.A03(android.view.View, X.U1A):void");
    }

    public static void A04(View view, U1A u1a) {
        if (view instanceof MultiListenerTextureView) {
            ((MultiListenerTextureView) view).A02(u1a.A0U);
        } else if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.setSurfaceTextureListener(new W8H(textureView.getSurfaceTextureListener(), u1a));
        }
    }

    public static void A05(U1A u1a) {
        if (!u1a.A08 && u1a.isVisible()) {
            u1a.A08 = true;
            u1a.A0T.postFrameCallback(u1a.A0S);
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.A04;
        if (bitmap != null && !bitmap.isRecycled()) {
            View view = this.A0F;
            int[] iArr = this.A0V;
            view.getLocationOnScreen(iArr);
            Rect rect = this.A0O;
            int i = iArr[0];
            rect.set(i, iArr[1], Math.round(((float) i) + (((float) view.getWidth()) * view.getScaleX())), Math.round(((float) iArr[1]) + (((float) view.getHeight()) * view.getScaleY())));
            Bitmap bitmap2 = this.A05;
            if (bitmap2 != null) {
                bitmap2.eraseColor(0);
                Paint paint = this.A07;
                paint.getClass();
                paint.setXfermode((Xfermode) null);
                RoundRectShape roundRectShape = this.A0E;
                roundRectShape.getClass();
                Canvas canvas2 = this.A06;
                canvas2.getClass();
                roundRectShape.draw(canvas2, this.A07);
                Rect rect2 = this.A0Q;
                int i2 = rect.left;
                int i3 = rect.top;
                rect2.set(i2, i3, rect.right, bitmap2.getHeight() + i3);
                Rect rect3 = this.A0D;
                if (rect2.intersect(rect3)) {
                    RectF rectF = this.A0R;
                    A01(rect3, rect2, rectF);
                    Rect rect4 = this.A0P;
                    rect4.set(0, 0, this.A04.getWidth(), this.A04.getHeight());
                    A02(rect4, rectF);
                    rect2.offset(-rect.left, -rect.top);
                    this.A07.setXfermode(this.A0N);
                    this.A06.drawBitmap(this.A04, rect4, rect2, this.A07);
                    if (this.A02 != -1) {
                        this.A06.drawColor(A00(), PorterDuff.Mode.SRC_ATOP);
                    }
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.A0L);
                }
            }
            Bitmap bitmap3 = this.A05;
            int i4 = rect.top;
            if (bitmap3 != null) {
                i4 += bitmap3.getHeight();
            }
            Rect rect5 = this.A0Q;
            rect5.set(rect.left, i4, rect.right, rect.bottom);
            Rect rect6 = this.A0D;
            if (rect5.intersect(rect6)) {
                RectF rectF2 = this.A0R;
                A01(rect6, rect5, rectF2);
                Rect rect7 = this.A0P;
                rect7.set(0, 0, this.A04.getWidth(), this.A04.getHeight());
                A02(rect7, rectF2);
                rect5.offset(-rect.left, -rect.top);
                int i5 = this.A0K;
                if (i5 != 0) {
                    float[] fArr = new float[8];
                    Arrays.fill(fArr, (float) i5);
                    Path path = new Path();
                    path.addRoundRect(new RectF(rect5), fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    canvas.drawBitmap(this.A04, rect7, rect5, this.A0L);
                    if (this.A02 != -1) {
                        Paint paint2 = this.A0M;
                        paint2.setColor(A00());
                        canvas.drawPath(path, paint2);
                        return;
                    }
                    return;
                }
                canvas.drawBitmap(this.A04, rect7, rect5, this.A0L);
                if (this.A02 != -1) {
                    Paint paint3 = this.A0M;
                    paint3.setColor(A00());
                    canvas.drawRect(rect5, paint3);
                }
            }
        }
    }

    public final void setAlpha(int i) {
        this.A0L.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0L.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public U1A(C17669Vc0 vc0) {
        this.A0G = vc0.A07;
        this.A0F = vc0.A06;
        View[] viewArr = vc0.A08;
        this.A0J = viewArr;
        this.A0I = new Rect[viewArr.length];
        int i = 0;
        while (true) {
            Rect[] rectArr = this.A0I;
            if (i >= rectArr.length) {
                break;
            }
            rectArr[i] = new Rect();
            i++;
        }
        this.A0H = new Bitmap[this.A0J.length];
        this.A0C = vc0.A02;
        this.A0B = vc0.A00;
        this.A02 = vc0.A03;
        int i2 = vc0.A04;
        this.A0K = vc0.A01;
        if (i2 > 0) {
            float f = (float) i2;
            this.A0E = new RoundRectShape(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, (RectF) null, (float[]) null);
        }
        for (View view : this.A0J) {
            view.addOnAttachStateChangeListener(new W8J(this, 3));
            A04(view, this);
        }
        Rect rect = vc0.A05;
        this.A0D = rect == null ? new Rect() : rect;
    }

    public static void A01(Rect rect, Rect rect2, RectF rectF) {
        int width = rect.width();
        int height = rect.height();
        int i = rect2.left;
        int i2 = rect.left;
        float f = (float) width;
        rectF.left = ((float) (i - i2)) / f;
        int i3 = rect2.top;
        int i4 = rect.top;
        float f2 = (float) height;
        rectF.top = ((float) (i3 - i4)) / f2;
        rectF.right = ((float) (rect2.right - i2)) / f;
        rectF.bottom = ((float) (rect2.bottom - i4)) / f2;
    }

    public static void A02(Rect rect, RectF rectF) {
        int width = rect.width();
        int height = rect.height();
        int i = rect.left;
        int i2 = rect.top;
        float f = (float) width;
        rect.left = ((int) (rectF.left * f)) + i;
        float f2 = (float) height;
        rect.top = ((int) (rectF.top * f2)) + i2;
        rect.right = i + ((int) (f * rectF.right));
        rect.bottom = i2 + ((int) (f2 * rectF.bottom));
    }

    public final void onBoundsChange(Rect rect) {
        this.A03 = rect.width();
        this.A01 = rect.height();
        A05(this);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible && z) {
            A05(this);
        }
        return visible;
    }
}
