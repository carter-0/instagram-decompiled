package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8bp  reason: invalid class name and case insensitive filesystem */
public final class C359008bp extends C299875vz implements C268684dp, C321026tS, C268714ds, C359018bq {
    public long A00;
    public Path A01 = new Path();
    public C369908vW A02;
    public boolean A03;
    public boolean A04;
    public RectF A05;
    public final int A06;
    public final Matrix A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final Interpolator A0F;
    public final AnonymousClass6M4 A0G;
    public final C40608Aew A0H;
    public final Integer A0I;
    public final List A0J;
    public final float A0K;
    public final float A0L;
    public final int A0M;
    public final Resources A0N;
    public final C40608Aew A0O;

    public C359008bp(Context context, C40608Aew aew, Integer num, float f, float f2) {
        Drawable mutate;
        0qQ.A0B(context, 1);
        0qQ.A0B(aew, 5);
        this.A0L = f;
        this.A0K = f2;
        this.A0I = num;
        this.A0O = aew;
        Drawable drawable = null;
        this.A0H = aew;
        Resources resources = context.getResources();
        0qQ.A07(resources);
        this.A0N = resources;
        this.A05 = new RectF(0.0f, 0.0f, f, f2);
        this.A0M = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        RectF rectF = new RectF();
        this.A0D = rectF;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.black_50_transparent));
        paint.setStyle(Paint.Style.FILL);
        this.A0A = paint;
        this.A08 = C63407KwT.A00();
        Integer num2 = AnonymousClass05K.A00;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_photo_add_pano_filled_24);
        if (!(drawable2 == null || (mutate = drawable2.mutate()) == null)) {
            mutate.setTint(context.getColor(R.color.design_dark_default_color_on_background));
            drawable = mutate;
        }
        this.A0E = drawable;
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0G = C321156tf.A01(context, this, AnonymousClass05K.A0C, num2);
        int color = context.getColor(R.color.cds_white_a20);
        Paint paint2 = new Paint(1);
        paint2.setColor(color);
        this.A0B = paint2;
        this.A0J = new ArrayList();
        this.A0C = new Path(this.A01);
        this.A09 = new Paint();
        this.A0F = new AccelerateInterpolator();
        this.A07 = new Matrix();
        this.A03 = true;
        C354668Mx A002 = aew.A00();
        if (A002 != null) {
            Path A022 = C39898AIf.A02(A002, AnonymousClass1GB.A01(f), AnonymousClass1GB.A01(f2));
            if (A022 != null) {
                this.A01 = A022;
            } else {
                Path path = this.A01;
                RectF rectF2 = this.A05;
                float f3 = (float) this.A0M;
                path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            }
        }
        this.A01.computeBounds(rectF, false);
        this.A0G.A01();
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        C369908vW r0 = this.A02;
        if (r0 != null) {
            r0.A9D(b1v);
        }
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final boolean Cdq() {
        return true;
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        C369908vW r0 = this.A02;
        if (r0 != null) {
            r0.EE1(b1v);
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        if (this.A04) {
            canvas.save();
            canvas.drawPath(this.A01, this.A0B);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        Paint paint = this.A09;
        Paint paint2 = this.A08;
        paint.set(paint2);
        if (!this.A03 || currentTimeMillis < this.A00 + 2000 + 500) {
            float f = (float) (currentTimeMillis - this.A00);
            float f2 = 2500.0f - 2000.0f;
            float f3 = 0.0f - 1.0f;
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                f4 = (f - 2000.0f) / f2;
            }
            paint.setAlpha(AnonymousClass1GB.A01(this.A0F.getInterpolation((f4 * f3) + 1.0f) * 255.0f));
            RectF rectF = this.A0D;
            Matrix matrix = this.A07;
            matrix.reset();
            matrix.setScale((rectF.width() + 32.0f) / rectF.width(), (rectF.height() + 32.0f) / rectF.height(), rectF.centerX(), rectF.centerY());
            Path path = this.A0C;
            path.set(this.A01);
            path.transform(matrix);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
        if (this.A04 || this.A02 == null) {
            RectF rectF2 = this.A0D;
            canvas.translate(((float) getBounds().centerX()) - rectF2.centerX(), ((float) getBounds().centerY()) - rectF2.centerY());
            canvas.save();
            canvas.drawPath(this.A01, this.A0A);
            canvas.drawPath(this.A01, paint2);
            float centerX = rectF2.centerX();
            float f5 = ((float) this.A06) / 2.0f;
            canvas.translate(centerX - f5, rectF2.centerY() - f5);
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        } else {
            canvas.translate(((float) getBounds().centerX()) - ((float) (getIntrinsicWidth() / 2)), ((float) getBounds().centerY()) - ((float) (getIntrinsicHeight() / 2)));
            C369908vW r0 = this.A02;
            if (r0 != null) {
                r0.draw(canvas);
            }
        }
        canvas.restore();
        this.A0G.draw(canvas);
    }

    public final List A07() {
        return this.A0J;
    }

    public final void A0B() {
        if (this.A0I == AnonymousClass05K.A00 && this.A02 != null && this.A0O.A01) {
            this.A00 = System.currentTimeMillis();
            invalidateSelf();
        }
    }

    public final void AHg() {
        C369908vW r0 = this.A02;
        if (r0 != null) {
            r0.AHg();
        }
    }

    public final C2802350v BzV() {
        return this.A0O;
    }

    public final AnonymousClass6M4 C49() {
        return this.A0G;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A04 = z;
        if (z) {
            this.A00 = 0;
            this.A03 = true;
            invalidateSelf();
        } else {
            A0B();
        }
        this.A0G.A01();
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        C369908vW r0;
        if (this.A0I.intValue() != 0 || (r0 = this.A02) == null) {
            return AnonymousClass1GB.A01(this.A0K);
        }
        return r0.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        C369908vW r0;
        if (this.A0I.intValue() != 0 || (r0 = this.A02) == null) {
            return AnonymousClass1GB.A01(this.A0L);
        }
        return r0.getIntrinsicWidth();
    }

    public final boolean isLoading() {
        C369908vW r0 = this.A02;
        if (r0 == null || r0.A01 != null) {
            return false;
        }
        return true;
    }

    public final String A09() {
        C273914nO A0C2 = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A0m, A0C2);
        String A002 = A0C2.A00();
        0qQ.A07(A002);
        return A002;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            int i5 = this.A06;
            drawable.setBounds(0, 0, i5, i5);
        }
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return true;
    }
}
