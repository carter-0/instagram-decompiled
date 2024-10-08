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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Upx  reason: case insensitive filesystem */
public final class C16172Upx extends C369528uu implements Drawable.Callback, AnonymousClass1MK {
    public static final CharSequence A0Q = "…";
    public int A00 = -1;
    public Bitmap A01;
    public int A02;
    public Product A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final Paint A07 = new Paint(3);
    public final Runnable A08 = new C20060WkK(this);
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final Paint A0H = new Paint(1);
    public final Paint A0I = new Paint(1);
    public final Paint A0J = new Paint(1);
    public final Path A0K = new Path();
    public final Path A0L = new Path();
    public final Drawable A0M;
    public final C306386Ly A0N;
    public final C306386Ly A0O;
    public final boolean A0P;

    public final String A03() {
        return C273654mx.A00(3157);
    }

    public final String C4F() {
        String str = null;
        str.getClass();
        return str;
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A01() {
        return this.A00;
    }

    public final Product A02() {
        Product product = this.A03;
        product.getClass();
        return product;
    }

    public final String A04() {
        String str = this.A04;
        str.getClass();
        return str;
    }

    public final void A05(Product product, String str, int i, boolean z) {
        String str2;
        ImageInfo imageInfo;
        this.A03 = product;
        if (str == null) {
            str = product.A0J;
        }
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        if (z) {
            this.A0L.reset();
            this.A0K.reset();
        }
        Paint paint = this.A0J;
        Context context = this.A0G;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
        AnonymousClass7TE.A1Q(paint);
        Path path = this.A0L;
        float f = (float) this.A06;
        RectF rectF = new RectF(0.0f, 0.0f, f, f);
        float f2 = (float) this.A0B;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f2, f2, direction);
        String str3 = this.A04;
        if (str3 != null) {
            this.A0O.A0M(str3);
        }
        C306386Ly r7 = this.A0O;
        int color = context.getColor(R.color.grey_9);
        int i2 = -1;
        int i3 = this.A00;
        if (i3 != -1) {
            color = 0nH.A08(i3, 1.0f);
        }
        r7.A0F(color);
        C306386Ly r6 = this.A0N;
        boolean z2 = this.A0P;
        Product product2 = this.A03;
        if (z2) {
            User user = product2.A0B;
            user.getClass();
            str2 = C13988Tno.A0b(user);
        } else {
            str2 = product2.A0L;
        }
        str2.getClass();
        r6.A0M(str2);
        int color2 = context.getColor(R.color.grey_5);
        int i4 = this.A00;
        if (i4 != -1) {
            color2 = 0nH.A08(i4, 1.0f);
        }
        r6.A0F(color2);
        this.A02 = this.A0F + Math.max(r7.A0A, r6.A0A);
        this.A0I.setColor(-1);
        Paint paint2 = this.A0H;
        int i5 = this.A00;
        if (i5 != -1) {
            i2 = i5;
        }
        paint2.setColor(i2);
        Path path2 = this.A0K;
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) this.A02, (float) this.A0A);
        float f3 = (float) this.A09;
        path2.addRoundRect(rectF2, f3, f3, direction);
        if (this.A01 == null && (imageInfo = this.A03.A08) != null) {
            1NK A002 = 1NK.A00();
            ExtendedImageUrl A032 = 1iI.A03(imageInfo);
            A032.getClass();
            C13989Tnp.A1P(this, A002, A032, (String) null);
        }
        invalidateSelf();
    }

    public final boolean A06() {
        return this.A05;
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        Bitmap bitmap = r6.A01;
        if (bitmap != null) {
            int i = this.A06;
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, i);
            this.A01 = extractThumbnail;
            if (extractThumbnail != null) {
                Paint paint = this.A07;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(extractThumbnail, tileMode, tileMode));
            }
            11Z.A02(this.A08);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public C16172Upx(Context context, boolean z) {
        this.A0G = context;
        this.A0P = z;
        int A092 = 0nA.A09(context);
        this.A0A = Dbb.A01(context);
        this.A09 = AnonymousClass7TG.A07(context);
        int A052 = JTR.A05(context);
        this.A0C = A052;
        int A012 = AnonymousClass7TH.A01(context);
        int A082 = C51972G9s.A08(context);
        this.A0D = A082;
        this.A0E = AnonymousClass7TG.A03(context);
        int A013 = C66582MXn.A01(context);
        this.A06 = A013;
        int A032 = AnonymousClass7TG.A03(context);
        this.A0B = A032;
        int A053 = JTR.A05(context);
        int i = A052 + A013 + (A082 * 2);
        this.A0F = i;
        int i2 = A092 - i;
        float f = (float) A053;
        GVQ A002 = GVQ.A00(context, f, (float) A032);
        this.A0M = A002;
        int round = Math.round(f);
        int i3 = -round;
        int i4 = round + A013;
        A002.setBounds(i3, i3, i4, i4);
        C306386Ly r2 = new C306386Ly(context, i2);
        this.A0O = r2;
        r2.setCallback(this);
        float f2 = (float) A012;
        r2.A0A(f2);
        r2.A0J(Typeface.SANS_SERIF, 1);
        r2.A0G(1, "…");
        C306386Ly r22 = new C306386Ly(context, i2);
        this.A0N = r22;
        r22.setCallback(this);
        r22.A0A(f2);
        r22.A0J(Typeface.SANS_SERIF, 0);
        r22.A0G(1, "…");
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Rect bounds = getBounds();
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.drawPath(this.A0K, this.A0H);
        canvas.save();
        int i = this.A0C;
        float f = (float) i;
        canvas.translate(f, f);
        this.A0M.draw(canvas);
        Bitmap bitmap = this.A01;
        Path path = this.A0L;
        if (bitmap != null) {
            canvas.drawPath(path, this.A0I);
            paint = this.A07;
        } else {
            paint = this.A0J;
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f2 = (float) (i + this.A06 + this.A0D);
        int i2 = this.A0A;
        C306386Ly r4 = this.A0O;
        int i3 = r4.A06;
        int i4 = this.A0E;
        C306386Ly r2 = this.A0N;
        canvas.translate(f2, C13988Tno.A01(i2 - ((i3 + i4) + r2.A06)));
        r4.draw(canvas);
        canvas.translate(0.0f, (float) (r4.A06 + i4));
        r2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
