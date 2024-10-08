package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.Ndu  reason: case insensitive filesystem */
public final class C69057Ndu extends C369528uu implements Drawable.Callback, AnonymousClass1MK {
    public int A00 = -1;
    public C59985Jcu A01;
    public Product A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06 = -3355444;
    public final int A07;
    public final Context A08;
    public final Paint A09 = AnonymousClass7TE.A0V(1);
    public final RectF A0A = AnonymousClass7TE.A0Y();
    public final String A0B;
    public final Resources A0C;
    public final C67647Mra A0D;

    public C69057Ndu(Context context, String str) {
        0qQ.A0B(context, 1);
        this.A08 = context;
        this.A0B = str;
        Resources resources = context.getResources();
        this.A0C = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.music_sticker_max_width);
        this.A03 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        this.A04 = AnonymousClass7TE.A0C(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.product_list_cell_sticker_stroke_width);
        this.A0D = new C67647Mra(context, this.A0B, dimensionPixelSize);
    }

    public final void CyF(C226952iF r4, AnonymousClass3LX r5) {
        0qQ.A0B(r5, 1);
        Bitmap bitmap = r5.A01;
        if (bitmap != null) {
            float f = (float) this.A03;
            int i = this.A05;
            C59985Jcu A002 = AES.A00(bitmap, f, i, i);
            A002.setCallback(this);
            this.A01 = A002;
            invalidateSelf();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A0D.draw(canvas);
        C59985Jcu jcu = this.A01;
        if (jcu != null) {
            canvas.save();
            float f = (float) this.A04;
            canvas.translate(f, f);
            int i = this.A00;
            if (i != -1) {
                Paint paint = this.A09;
                paint.setColor(i);
                RectF rectF = this.A0A;
                rectF.set(jcu.getBounds());
                float f2 = (float) this.A03;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            int i2 = this.A07;
            int i3 = this.A06;
            if (jcu.A02 == null) {
                Paint A0V = AnonymousClass7TE.A0V(1);
                jcu.A02 = A0V;
                A0V.setStyle(Paint.Style.STROKE);
            }
            Paint paint2 = jcu.A02;
            if (paint2 != null) {
                paint2.setColor(i3);
            }
            Paint paint3 = jcu.A02;
            if (paint3 != null) {
                paint3.setStrokeWidth((float) i2);
            }
            jcu.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A0D.onBoundsChange(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final int A01() {
        return -1;
    }

    public final Product A02() {
        Product product = this.A02;
        if (product != null) {
            return product;
        }
        0qQ.A0F("_product");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A03() {
        return this.A0B;
    }

    public final String A04() {
        Product product = this.A02;
        if (product == null) {
            0qQ.A0F("_product");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = product.A0J;
        0qQ.A0A(str);
        return str;
    }

    public final void A05(Product product, String str, int i, boolean z) {
        ExtendedImageUrl extendedImageUrl;
        this.A02 = product;
        C67647Mra mra = this.A0D;
        String str2 = product.A0J;
        ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
        String str3 = productDetailsProductItemDict.A0V;
        if (str3 == null) {
            str3 = productDetailsProductItemDict.A0T;
        }
        if (str2 != null) {
            mra.A0B.A0M(str2);
        }
        if (str3 != null) {
            mra.A0C.A0M(str3);
        }
        int i2 = mra.A0A;
        int i3 = mra.A0B.A0A;
        int i4 = mra.A09;
        if (i3 < i4) {
            i3 = i4;
        }
        int i5 = i2 + i3;
        mra.A00 = i5;
        mra.A02 = new RectF(0.0f, 0.0f, (float) i5, (float) mra.A05);
        mra.invalidateSelf();
        ImageInfo imageInfo = product.A08;
        if (imageInfo != null) {
            extendedImageUrl = 1iI.A03(imageInfo);
        } else {
            extendedImageUrl = null;
        }
        if (C253833rU.A02(extendedImageUrl)) {
            Context context = this.A08;
            this.A00 = context.getColor(2Yu.A04(context));
            int i6 = this.A05;
            Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            C59985Jcu A002 = AES.A00(createBitmap, (float) this.A03, i6, i6);
            A002.setCallback(this);
            this.A01 = A002;
            invalidateSelf();
        } else if (extendedImageUrl != null) {
            1OO A0J = 1NK.A00().A0J(extendedImageUrl, (String) null);
            A0J.A02(this);
            A0J.A01();
        }
    }

    public final boolean A06() {
        return false;
    }

    public final String C4F() {
        return this.A0B;
    }

    public final int getIntrinsicHeight() {
        return this.A0D.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A0D.A00;
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A0D.setBounds(i, i2, i3, i4);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
