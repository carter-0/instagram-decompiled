package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Random;

/* renamed from: X.Jcz  reason: case insensitive filesystem */
public final class C59990Jcz extends Drawable {
    public static File A09;
    public static final AnonymousClass4D6 A0A = new 1ET(JTP.A0W(C61610nw.A00(), "StaticAnimationDrawable"));
    public Bitmap A00;
    public Shader A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final Paint A06;
    public final Matrix A07 = AnonymousClass7TE.A0U();
    public final RectF A08 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public C59990Jcz(Context context) {
        this.A05 = context;
        Paint A0V = AnonymousClass7TE.A0V(2);
        this.A06 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        A0V.setColor(-65536);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        System.currentTimeMillis();
        Canvas canvas2 = canvas;
        canvas2.drawColor(-16777216);
        if (!this.A04) {
            Rect bounds = getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            int width = bounds.width();
            int height = bounds.height();
            if (!this.A03 && !this.A02 && this.A00 == null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A03 = true;
                Context context = this.A05;
                if (A09 == null) {
                    File A0s = JTO.A0s(context.getExternalFilesDir((String) null), "StaticAnimationDrawable");
                    A09 = A0s;
                    A0s.mkdirs();
                }
                File A0s2 = JTO.A0s(A09, "static_tile_1");
                if (A0s2.exists()) {
                    1OO A0J = 1NK.A00().A0J(C253833rU.A01(A0s2), (String) null);
                    A0J.A02(new Lf0(this, currentTimeMillis));
                    A0J.A01();
                } else {
                    C290815g0 r1 = new C290815g0(new C66090MAx(context, currentTimeMillis), 454);
                    KH1.A01(r1, this, 5);
                    A0A.schedule(r1);
                }
            }
            if (!(this.A01 == null || (bitmap = this.A00) == null)) {
                int A042 = JTO.A04(JTO.A02(bitmap), 1.5f);
                Random random = new Random();
                float f = (float) (-random.nextInt(A042));
                float f2 = (float) (-random.nextInt(A042));
                int i5 = -A042;
                int i6 = width + A042;
                int i7 = height + A042;
                int width2 = this.A00.getWidth();
                int height2 = this.A00.getHeight();
                int i8 = i5;
                while (i5 < i7) {
                    for (int i9 = i8; i9 < i6; i9 += this.A00.getWidth()) {
                        float A022 = 0mi.A02(random.nextFloat(), 0.0f, 1.0f, 0.0f, 360.0f);
                        Matrix matrix = this.A07;
                        RectF rectF = this.A08;
                        matrix.setRotate(A022, rectF.centerX(), rectF.centerY());
                        this.A01.setLocalMatrix(matrix);
                        float f3 = ((float) i9) + f;
                        float f4 = ((float) i5) + f2;
                        rectF.set(Math.max(f3, (float) i), Math.max(f4, (float) i2), Math.min(((float) width2) + f3, (float) i3), Math.min(((float) height2) + f4, (float) i4));
                        canvas2.save();
                        if (random.nextBoolean()) {
                            canvas2.scale(-1.0f, -1.0f, rectF.centerX(), rectF.centerY());
                        }
                        canvas2.restore();
                        canvas2.drawRect(rectF, this.A06);
                    }
                    i5 += this.A00.getHeight();
                }
                System.currentTimeMillis();
                if (this.A04) {
                    return;
                }
            }
            invalidateSelf();
        }
    }
}
