package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HJy  reason: case insensitive filesystem */
public final class C54589HJy extends C54590HJz {
    public int A00;
    public int A01;
    public final float A02 = 16.0f;
    public final float A03;
    public final Paint A04;
    public final Path A05;

    public C54589HJy(Context context) {
        super(context);
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        this.A03 = C61380mr.A00(context, 1.0f);
        this.A05 = C51965G9l.A0C();
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        A0V.setColor(color);
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setStrokeCap(Paint.Cap.ROUND);
        A0V.setStrokeWidth(this.A03);
    }

    public final void A0H() {
        this.A01 = 0;
        this.A00 = 0;
        super.A0H();
    }

    public final void A0I(AnonymousClass0iw r2, ImageUrl imageUrl, GFO gfo, int i) {
        DbZ.A0t(0, imageUrl, r2, gfo);
        super.A0I(r2, imageUrl, gfo, i);
        this.A01 = i;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A01 == this.A00) {
            canvas.drawPath(this.A05, this.A04);
        }
    }

    public final Paint getActiveProgressBarPaint() {
        return this.A04;
    }

    public final int getCurrentIndex() {
        return this.A00;
    }

    public final float getProgressBarWidth() {
        return this.A03;
    }

    public final Path getStaticProgressBarPath() {
        return this.A05;
    }

    public final int getThumbnailIndex() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Gao, com.instagram.common.ui.widget.imageview.IgImageView, android.view.View, X.HJy] */
    public void setImageBitmap(Bitmap bitmap) {
        C379729Vb r0;
        if (bitmap != null) {
            r0 = new C379729Vb(AnonymousClass7TE.A0S(this), bitmap, this.A02, (int) (this.A03 + this.A03 + this.A02));
        } else {
            r0 = null;
        }
        this.A00 = r0;
        C54589HJy.super.setImageDrawable(r0);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(1750541693);
        float f = this.A02;
        float f2 = this.A03;
        float f3 = (((float) i) - f) - f2;
        float f4 = (((float) i2) - f) - f2;
        Path path = this.A05;
        float f5 = f + f2;
        float f6 = this.A02 + this.A03 + f2;
        path.moveTo(f3 / 2.0f, f5);
        float f7 = f3 - f6;
        path.lineTo(f7, f5);
        float f8 = f5;
        path.cubicTo(f7, f5, f3, f8, f3, f6);
        float f9 = f4 - f6;
        path.lineTo(f3, f9);
        path.cubicTo(f3, f9, f3, f4, f7, f4);
        path.lineTo(f6, f4);
        path.cubicTo(f6, f4, f5, f4, f5, f9);
        path.lineTo(f5, f6);
        path.cubicTo(f5, f6, f8, f5, f6, f5);
        path.close();
        AnonymousClass0fD.A0D(-322390283, A06);
    }

    public final void setCurrentIndex(int i) {
        this.A00 = i;
    }

    public final void setThumbnailIndex(int i) {
        this.A01 = i;
    }
}
