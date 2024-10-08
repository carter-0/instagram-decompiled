package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* renamed from: X.8uy  reason: invalid class name and case insensitive filesystem */
public final class C369568uy extends Drawable implements AnonymousClass1MK, C300645xY {
    public Bitmap A00;
    public Bitmap A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Paint A05 = new Paint(3);
    public final Paint A06 = new Paint(3);
    public final Product A07;
    public final Runnable A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Path A0J;
    public final Path A0K;
    public final Path A0L;
    public final Path A0M;
    public final Path A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Layout A0Q;
    public final TextPaint A0R;
    public final TextPaint A0S;
    public final String A0T;

    public final String C4F() {
        return C273654mx.A00(89);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public C369568uy(Context context, ImageUrl imageUrl, Product product, float f) {
        String str;
        int i;
        int i2;
        CharSequence ellipsize;
        float f2 = f;
        TextPaint textPaint = new TextPaint(1);
        this.A0S = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A0R = textPaint2;
        Paint paint = new Paint(3);
        this.A0E = paint;
        Paint paint2 = new Paint(3);
        this.A0I = paint2;
        Paint paint3 = new Paint(3);
        this.A0G = paint3;
        Paint paint4 = new Paint(3);
        this.A0H = paint4;
        Paint paint5 = new Paint(3);
        this.A0F = paint5;
        Rect rect = new Rect();
        this.A0P = rect;
        Rect rect2 = new Rect();
        this.A0O = rect2;
        Path path = new Path();
        this.A0K = path;
        Path path2 = new Path();
        this.A0M = path2;
        Path path3 = new Path();
        this.A0L = path3;
        Path path4 = new Path();
        this.A0J = path4;
        Path path5 = new Path();
        this.A0N = path5;
        this.A08 = new C40765Aiv(this);
        Product product2 = product;
        Product product3 = product2;
        this.A07 = product3;
        String str2 = product3.A0J;
        str2 = str2 == null ? "" : str2;
        User user = product3.A0B;
        User user2 = user;
        if (user != null) {
            str = user.A03.getUsername();
        } else {
            str = null;
        }
        Context context2 = context;
        String string = context2.getString(2131969826, new Object[]{str});
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-1);
        paint2.setShadowLayer(14.0f, 0.0f, 0.0f, context2.getColor(R.color.black_15_transparent));
        textPaint.setTextSize(0nA.A04(context2, 14));
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AnonymousClass0qo.A00(context2).A02(0qm.A13));
        textPaint2.setTextSize(0nA.A04(context2, 14));
        textPaint2.setColor(context2.getColor(R.color.grey_5));
        paint3.setColor(-16777216);
        paint4.setColor(context2.getColor(2Yu.A04(context2)));
        paint4.setStyle(style);
        paint5.setColor(context2.getColor(R.color.grey_2));
        paint5.setStyle(style);
        Pattern pattern = 0mp.A00;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        textPaint.getTextBounds(str2, 0, i, rect);
        if (string != null) {
            i2 = string.length();
        } else {
            i2 = 0;
        }
        textPaint2.getTextBounds(string, 0, i2, rect2);
        this.A03 = f2;
        this.A02 = f2;
        int A032 = (int) 0nA.A03(context2, 2.0f);
        float A042 = 0nA.A04(context2, 12);
        this.A0B = A042;
        float A043 = 0nA.A04(context2, 6);
        this.A0C = A043;
        float A044 = 0nA.A04(context2, 12);
        float A045 = 0nA.A04(context2, 34);
        this.A04 = A045;
        float height = ((float) (rect.height() + rect2.height())) + (A042 * 2.0f) + A043;
        this.A0A = height;
        float A002 = 0nA.A00(context2, 0.5f);
        this.A09 = A002;
        float f3 = (A002 * 2.0f) + A045;
        this.A0D = f3;
        float f4 = f3 / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(new RectF(0.0f, 0.0f, f2, f2), new float[]{A044, A044, A044, A044, 0.0f, 0.0f, 0.0f, 0.0f}, direction);
        float f5 = A045 / 2.0f;
        path2.addCircle(f5, f5, f5, direction);
        path3.addCircle(f4, f4, f4, direction);
        path4.addRoundRect(new RectF(0.0f, 0.0f, f2, height), new float[]{0.0f, 0.0f, 0.0f, 0.0f, A044, A044, A044, A044}, direction);
        path5.addRoundRect(new RectF(0.0f, 0.0f, f2, f + height), A044, A044, direction);
        float f6 = (f - A045) - (A042 * 3.0f);
        0rN r11 = new 0rN(Layout.Alignment.ALIGN_NORMAL, textPaint, (String) null, 0.0f, 1.0f, (int) f6, false);
        if (product2.A04()) {
            ellipsize = W2t.A04(context2, r11, str2, A032, 1);
        } else {
            ellipsize = TextUtils.ellipsize(str2, textPaint, f6, TextUtils.TruncateAt.END);
        }
        this.A0T = TextUtils.ellipsize(string, textPaint2, f6, TextUtils.TruncateAt.END).toString();
        this.A0Q = r11.A00(ellipsize);
        1NK A003 = 1NK.A00();
        ImageUrl imageUrl2 = imageUrl;
        imageUrl2.getClass();
        1OO A0J2 = A003.A0J(imageUrl2, (String) null);
        A0J2.A08 = "product_image";
        A0J2.A02(this);
        A0J2.A01();
        1NK A004 = 1NK.A00();
        user2.getClass();
        ImageUrl Bh3 = user2.A03.Bh3();
        Bh3.getClass();
        1OO A0J3 = A004.A0J(Bh3, (String) null);
        A0J3.A08 = "profile_pic";
        A0J3.A02(this);
        A0J3.A01();
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A02 + this.A0A);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0S.setAlpha(i);
        this.A0R.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A0S.setColorFilter(colorFilter);
        this.A0R.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        Bitmap A002;
        Paint paint;
        Object C3s = r5.C3s();
        if ("product_image".equals(C3s)) {
            Bitmap bitmap = r6.A01;
            bitmap.getClass();
            A002 = 0fO.A00(bitmap, Math.round(this.A03), Math.round(this.A02), true);
            this.A00 = A002;
            paint = this.A05;
        } else if ("profile_pic".equals(C3s)) {
            Bitmap bitmap2 = r6.A01;
            bitmap2.getClass();
            int round = Math.round(this.A04);
            A002 = 0fO.A00(bitmap2, round, round, true);
            this.A01 = A002;
            paint = this.A06;
        } else {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(A002, tileMode, tileMode));
        11Z.A02(this.A08);
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.drawPath(this.A0N, this.A0I);
        Path path = this.A0K;
        if (this.A00 != null) {
            paint = this.A05;
        } else {
            paint = this.A0H;
        }
        canvas.drawPath(path, paint);
        float f = this.A02;
        float f2 = this.A09;
        float f3 = this.A03;
        Paint paint3 = this.A0F;
        canvas2.drawRect(0.0f, f - f2, f3, f, paint3);
        canvas.translate(0.0f, f);
        canvas.drawPath(this.A0J, this.A0E);
        canvas.save();
        float f4 = this.A0B;
        float f5 = this.A0A / 2.0f;
        canvas.translate(f4 - f2, f5 - (this.A0D / 2.0f));
        canvas.drawPath(this.A0L, paint3);
        canvas.restore();
        canvas.save();
        float f6 = this.A04;
        canvas.translate(f4, f5 - (f6 / 2.0f));
        Path path2 = this.A0M;
        if (this.A01 != null) {
            paint2 = this.A06;
        } else {
            paint2 = this.A0H;
        }
        canvas.drawPath(path2, paint2);
        canvas.restore();
        canvas.save();
        float f7 = f6 + (f4 * 2.0f);
        Rect rect = this.A0P;
        float f8 = this.A0C;
        canvas.translate(f7, (f4 - ((float) rect.bottom)) - (0.5f * f8));
        this.A0Q.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f7, ((f4 + ((float) rect.height())) + f8) - ((float) this.A0O.top));
        canvas.drawText(this.A0T, 0.0f, 0.0f, this.A0R);
        canvas.restore();
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
