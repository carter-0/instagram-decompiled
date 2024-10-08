package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public final class WHO implements XBU {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public VLV A04;
    public final Matrix A05;
    public final Paint A06;
    public final Path A07;
    public final X9F A08;
    public final X8H A09;
    public final C17876VhT A0A;
    public final boolean A0B;
    public final float[] A0C;
    public final Bitmap.Config A0D;
    public final X8G A0E;
    public final VZ6 A0F;
    public final AnonymousClass1TV A0G;

    public WHO(X8G x8g, X9F x9f, X8H x8h, VZ6 vz6, C17876VhT vhT, C226672hf r10, AnonymousClass1TV r11, boolean z) {
        float[] fArr;
        0qQ.A0B(r11, 1);
        this.A0G = r11;
        this.A08 = x9f;
        this.A0E = x8g;
        this.A0A = vhT;
        this.A0B = z;
        this.A09 = x8h;
        this.A0F = vz6;
        if (r10 != null) {
            float f = r10.A00;
            if (f == 0.0f) {
                fArr = r10.A03;
            } else {
                fArr = new float[8];
                Arrays.fill(fArr, 0, 8, f);
            }
        } else {
            fArr = null;
        }
        this.A0C = fArr;
        this.A0D = Bitmap.Config.ARGB_8888;
        this.A06 = new Paint(6);
        this.A07 = new Path();
        this.A05 = new Matrix();
        this.A02 = -1;
        A00();
    }

    private final boolean A02(Canvas canvas, int i, int i2) {
        C249903kY r2;
        C249903kY r3 = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.A0B) {
                X8H x8h = this.A09;
                if (x8h != null) {
                    r2 = x8h.Afx(i, canvas.getWidth(), canvas.getHeight());
                    if (r2 != null) {
                        try {
                            if (r2.A06()) {
                                A01((Bitmap) r2.A05(), canvas, i);
                                r2.close();
                                return true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r3 = r2;
                            C249903kY.A01(r3);
                            throw th;
                        }
                    }
                    x8h.E44((C62320sa) null, canvas.getWidth(), canvas.getHeight());
                } else {
                    r2 = null;
                }
                C249903kY.A01(r2);
                return false;
            }
            if (i2 == 0) {
                r3 = this.A08.AjM(i);
                z = A03(canvas, r3, i, 0);
            } else if (i2 == 1) {
                r3 = this.A08.Afy(i, this.A01, this.A00);
                if (r3 != null && r3.A06()) {
                    if (!this.A0A.A00((Bitmap) r3.A05(), i)) {
                        r3.close();
                    } else if (A03(canvas, r3, i, 1)) {
                        z = true;
                    }
                }
                i3 = 2;
            } else if (i2 != 2) {
                r3 = this.A08.B3s(i);
                z = A03(canvas, r3, i, 3);
                i3 = -1;
            } else {
                r3 = this.A0G.A00(this.A0D, this.A01, this.A00);
                if (r3.A06()) {
                    if (!this.A0A.A00((Bitmap) r3.A05(), i)) {
                        r3.close();
                    } else if (A03(canvas, r3, i, 2)) {
                        z = true;
                    }
                }
                i3 = 3;
            }
            C249903kY.A01(r3);
            if (z || i3 == -1) {
                return z;
            }
            return A02(canvas, i, i3);
        } catch (RuntimeException e) {
            Class<WHO> cls = WHO.class;
            0I2 r1 = 0I1.A00;
            if (!r1.isLoggable(5)) {
                return false;
            }
            r1.w(cls.getSimpleName(), "Failed to create frame bitmap", e);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean AQZ(Canvas canvas, Drawable drawable, int i) {
        VZ6 vz6;
        X8H x8h;
        0qQ.A0B(canvas, 1);
        int i2 = i;
        boolean A022 = A02(canvas, i, 0);
        if (!(this.A0B || (vz6 = this.A0F) == null || (x8h = this.A09) == null)) {
            x8h.E45(this, this.A08, vz6, (C62320sa) null, i2);
        }
        return A022;
    }

    private final void A00() {
        int i;
        C17876VhT vhT = this.A0A;
        int width = vhT.A00.A06.getWidth();
        this.A01 = width;
        int i2 = -1;
        if (width == -1) {
            Rect rect = this.A03;
            if (rect != null) {
                i = rect.width();
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        int height = vhT.A00.A06.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A03;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A00 = i2;
        }
    }

    private final void A01(Bitmap bitmap, Canvas canvas, int i) {
        Rect rect = this.A03;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A06);
            return;
        }
        float width = (float) rect.width();
        float height = (float) rect.height();
        float[] fArr = this.A0C;
        if (fArr == null) {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.A06);
            return;
        }
        if (i != this.A02) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            RectF rectF = new RectF(0.0f, 0.0f, (float) this.A01, (float) this.A00);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            Matrix matrix = this.A05;
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(matrix);
            this.A06.setShader(bitmapShader);
            this.A07.addRoundRect(new RectF(0.0f, 0.0f, width, height), fArr, Path.Direction.CW);
            this.A02 = i;
        }
        canvas.drawPath(this.A07, this.A06);
    }

    private final boolean A03(Canvas canvas, C249903kY r3, int i, int i2) {
        if (r3 == null || !C249903kY.A02(r3)) {
            return false;
        }
        A01((Bitmap) r3.A05(), canvas, i);
        if (i2 == 3 || this.A0B) {
            return true;
        }
        this.A08.DGy(r3, i, i2);
        return true;
    }

    public final int B84(int i) {
        return this.A0E.B84(i);
    }

    public final int BId() {
        return this.A00;
    }

    public final int BIg() {
        return this.A01;
    }

    public final int BOg() {
        return this.A0E.BOg();
    }

    public final void EOY(int i) {
        this.A06.setAlpha(i);
    }

    public final void EOf(VLV vlv) {
        this.A04 = vlv;
    }

    public final void EPy(Rect rect) {
        this.A03 = rect;
        C17876VhT vhT = this.A0A;
        W1P w1p = vhT.A00;
        if (!W1P.A01(rect, w1p.A06).equals(w1p.A05)) {
            w1p = new W1P(rect, w1p.A07, w1p.A08, w1p.A09);
        }
        if (w1p != vhT.A00) {
            vhT.A00 = w1p;
            vhT.A01 = new W19(vhT.A03, w1p, vhT.A04);
        }
        A00();
    }

    public final void ESG(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public final int getFrameCount() {
        return this.A0E.getFrameCount();
    }

    public final int getLoopCount() {
        return this.A0E.getLoopCount();
    }
}
