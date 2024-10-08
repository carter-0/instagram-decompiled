package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.Mrd  reason: case insensitive filesystem */
public final class C67650Mrd extends Drawable implements AnonymousClass1MK {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C70558OBg A08;
    public Bitmap A09;
    public final int A0A;
    public final int A0B;
    public final ValueAnimator A0C;
    public final Context A0D;
    public final Paint A0E = AnonymousClass7TE.A0V(3);
    public final Paint A0F = AnonymousClass7TE.A0V(3);
    public final Paint A0G = AnonymousClass7TE.A0V(3);
    public final Paint A0H = AnonymousClass7TE.A0V(1);
    public final RectF A0I;
    public final C70557OBf A0J;
    public final C62320sa A0K;
    public final int[] A0L;
    public final Matrix A0M;
    public final RectF A0N;
    public final UserSession A0O;

    public C67650Mrd(Context context, UserSession userSession, C70557OBf oBf, C70558OBg oBg, C62320sa r11) {
        int A022 = DbW.A02(1, context, userSession);
        AnonymousClass7TF.A1D(oBf, 3, oBg);
        this.A0D = context;
        this.A0O = userSession;
        this.A0J = oBf;
        this.A08 = oBg;
        this.A0K = r11;
        float[] fArr = new float[A022];
        // fill-array-data instruction
        fArr[0] = 0;
        fArr[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        0qQ.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0L = new int[]{0, 0, context.getColor(2Yu.A0B(context))};
        this.A0B = AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_highlight_background);
        this.A0A = AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_separator);
        this.A0I = AnonymousClass7TE.A0Y();
        this.A0N = AnonymousClass7TE.A0Y();
        this.A0M = new Matrix();
        Context context2 = this.A0D;
        0qQ.A0B(context2, 0);
        this.A07 = AnonymousClass7TF.A02(context2, R.dimen.album_preview_add_item_margin);
        Context context3 = this.A0D;
        int i = this.A08.A00;
        0qQ.A0B(context3, 0);
        this.A01 = AnonymousClass7TF.A02(context3, i);
        int A023 = AnonymousClass7TF.A02(context3, R.dimen.account_recs_header_image_margin);
        this.A04 = A023;
        this.A03 = AnonymousClass1GB.A01((((float) this.A07) - (((float) this.A01) * 2.0f)) - (((float) A023) * 2.0f));
        this.A05 = AnonymousClass7TF.A02(context3, R.dimen.afi_margin_top);
        int A024 = AnonymousClass7TF.A02(context3, R.dimen.annotation_hidden_location_pill_nub_padding);
        this.A06 = A024;
        this.A02 = this.A07 + (this.A05 - A024);
        this.A00 = (float) AnonymousClass7TF.A02(context3, R.dimen.abc_edit_text_inset_top_material);
        setBounds(new Rect(0, 0, this.A07, this.A02));
        A00();
        invalidateSelf();
        this.A0K.invoke();
        Paint paint = this.A0G;
        paint.setColor(this.A0A);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.A0F;
        int i2 = this.A0B;
        paint2.setColor(i2);
        paint2.setStyle(style);
        Paint paint3 = this.A0H;
        paint3.setColor(i2);
        paint3.setStyle(style);
        float f = this.A00;
        Context context4 = this.A0D;
        0qQ.A0B(context4, 0);
        paint3.setShadowLayer(f, 0.0f, 0.0f, context4.getColor(R.color.black_30_transparent));
        Paint paint4 = this.A0E;
        RectF rectF = this.A0I;
        paint4.setShader(new SweepGradient(rectF.centerX(), rectF.centerY(), this.A0L, (float[]) null));
        1OO A0J2 = 1NK.A00().A0J(DbS.A0V(oBf.A01), "media_note_stack");
        A0J2.A02(this);
        A0J2.A01();
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        Bitmap bitmap = r3.A01;
        if (bitmap != null) {
            this.A09 = bitmap;
            A00();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float centerX = this.A0I.centerX();
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        canvas.drawCircle(centerX, centerX, centerX, this.A0H);
        int i = this.A01;
        float f = centerX - ((float) i);
        canvas.drawCircle(centerX, centerX, f, this.A0G);
        if (this.A09 != null) {
            int i2 = this.A04;
            float f2 = f - ((float) i2);
            canvas.save();
            float f3 = (float) (i + i2);
            canvas.translate(f3, f3);
            canvas.drawCircle(f2, f2, f2, this.A0F);
            canvas.restore();
        }
        if (this.A08.A01) {
            C14504TxQ.A00(canvas, this.A0N, this.A0B);
        }
        canvas.restore();
    }

    @Deprecated(message = "This method is no longer used in graphics optimizations", replaceWith = @ReplaceWith(expression = "Not Applicable", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0I;
        int i = this.A07;
        rectF.set(new Rect(0, 0, i, i));
        float width = C14504TxQ.A00.width() * 3.0f;
        float centerX = rectF.centerX() - (width / 2.0f);
        float f = rectF.bottom - ((float) this.A06);
        this.A0N.set(centerX, f, width + centerX, ((float) this.A05) + f);
    }

    private final void A00() {
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A09;
            if (bitmap2 != null) {
                Rect rect = new Rect(0, 0, width, bitmap2.getHeight());
                int i = this.A03;
                Rect rect2 = new Rect(0, 0, i, i);
                Matrix matrix = this.A0M;
                AnonymousClass3JT.A0A(matrix, rect, rect2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                0qQ.A07(createBitmap);
                Canvas canvas = new Canvas(createBitmap);
                Bitmap bitmap3 = this.A09;
                if (bitmap3 != null) {
                    Paint paint = this.A0F;
                    canvas.drawBitmap(bitmap3, matrix, paint);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    invalidateSelf();
                    this.A0K.invoke();
                    return;
                }
            }
            0qQ.A0F("bitmap");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
