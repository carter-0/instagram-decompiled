package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

public final class W1P {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final Rect A05;
    public final X9T A06;
    public final VLX A07;
    public final C16782V5p A08;
    public final boolean A09;
    public final int[] A0A;
    public final C17554Va8[] A0B;

    public static synchronized Bitmap A00(W1P w1p, int i, int i2) {
        Bitmap bitmap;
        synchronized (w1p) {
            Bitmap bitmap2 = w1p.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || w1p.A00.getHeight() < i2)) {
                Bitmap bitmap3 = w1p.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    w1p.A00 = null;
                }
            }
            Bitmap bitmap4 = w1p.A00;
            if (bitmap4 == null) {
                bitmap4 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                w1p.A00 = bitmap4;
            }
            bitmap4.eraseColor(0);
            bitmap = w1p.A00;
        }
        return bitmap;
    }

    public static Rect A01(Rect rect, X9T x9t) {
        int min;
        int min2;
        if (rect == null) {
            min = x9t.getWidth();
            min2 = x9t.getHeight();
        } else {
            min = Math.min(rect.width(), x9t.getWidth());
            min2 = Math.min(rect.height(), x9t.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public final void A03(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        X9T x9t = this.A06;
        X94 frame = x9t.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (x9t.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double width2 = ((double) rect.width()) / ((double) x9t.getWidth());
                    double height2 = ((double) rect.height()) / ((double) x9t.getHeight());
                    int round = (int) Math.round(((double) frame.getWidth()) * width2);
                    int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                    int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                    int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                    synchronized (this) {
                        try {
                            int width3 = rect.width();
                            int height3 = rect.height();
                            A00(this, width3, height3);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(round, round2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, width3, height3);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    if (this.A09) {
                        float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                        width = (int) (((float) frame.getWidth()) / max);
                        height = (int) (((float) frame.getHeight()) / max);
                        xOffset = (int) (((float) frame.getXOffset()) / max);
                        yOffset = (int) (((float) frame.getYOffset()) / max);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap A002 = A00(this, width, height);
                            this.A00 = A002;
                            frame.renderFrame(width, height, A002);
                            canvas.save();
                            canvas.translate((float) xOffset, (float) yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public static void A02(Canvas canvas, C17554Va8 va8, W1P w1p, float f, float f2) {
        if (va8.A04 == C16489Uvk.DISPOSE_TO_BACKGROUND) {
            int A022 = C13988Tno.A02((float) va8.A01, f);
            int A023 = C13988Tno.A02((float) va8.A00, f2);
            int A024 = C13988Tno.A02((float) va8.A02, f);
            int A025 = C13988Tno.A02((float) va8.A03, f2);
            canvas.drawRect(new Rect(A024, A025, A022 + A024, A023 + A025), w1p.A02);
        }
    }

    public W1P(Rect rect, VLX vlx, C16782V5p v5p, boolean z) {
        this.A08 = v5p;
        this.A07 = vlx;
        X9T x9t = vlx.A00;
        this.A06 = x9t;
        int[] frameDurations = x9t.getFrameDurations();
        this.A0A = frameDurations;
        0qQ.A0B(frameDurations, 0);
        for (int i = 0; i < r3; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < r3; i4++) {
        }
        this.A05 = A01(rect, x9t);
        this.A09 = z;
        this.A0B = new C17554Va8[x9t.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint paint = new Paint();
        this.A02 = paint;
        Pxi.A0v(paint, PorterDuff.Mode.CLEAR);
    }
}
