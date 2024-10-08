package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gao  reason: case insensitive filesystem */
public abstract class C52676Gao extends IgImageView {
    public C379729Vb A00;
    public GFO A01;
    public final float A02;
    public final float A03;
    public final C52677Gap A04 = new C52677Gap(this);

    public void A0H() {
        this.A00 = null;
        this.A01 = null;
        A09();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Gao, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView] */
    public void A0I(AnonymousClass0iw r2, ImageUrl imageUrl, GFO gfo, int i) {
        DbZ.A0t(0, imageUrl, r2, gfo);
        setUrl(imageUrl, r2);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A01 = gfo;
    }

    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A00 == null) {
            C52676Gao.super.onDraw(canvas);
        }
        C379729Vb r0 = this.A00;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public final C379729Vb getCarouselThumbnailDrawable() {
        return this.A00;
    }

    public final float getPadding() {
        return this.A02;
    }

    public final float getSpace() {
        return this.A03;
    }

    public final GFO getViewModel() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Gao, com.instagram.common.ui.widget.imageview.IgImageView, android.view.View] */
    public void setImageBitmap(Bitmap bitmap) {
        C379729Vb r0;
        if (bitmap != null) {
            r0 = new C379729Vb(AnonymousClass7TE.A0S(this), bitmap, 16.0f, (int) (this.A03 + this.A02));
        } else {
            r0 = null;
        }
        this.A00 = r0;
        C52676Gao.super.setImageDrawable(r0);
    }

    public C52676Gao(Context context) {
        super(context);
        this.A03 = C61380mr.A00(context, 2.0f);
        this.A02 = C61380mr.A00(context, 1.0f);
    }

    public final 1U1 A07(1Tx r3) {
        AnonymousClass1U3 r1 = new AnonymousClass1U3(C52676Gao.super.A07(r3));
        r1.A0I = this.A04;
        return new 1U1(r1);
    }

    public final void setCarouselThumbnailDrawable(C379729Vb r1) {
        this.A00 = r1;
    }

    public final void setViewModel(GFO gfo) {
        this.A01 = gfo;
    }
}
