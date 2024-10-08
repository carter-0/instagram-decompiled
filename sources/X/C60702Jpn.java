package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Jpn  reason: case insensitive filesystem */
public final class C60702Jpn extends C249703kE implements C348257y9 {
    public View.OnLayoutChangeListener A00;
    public C348267yA A01;
    public Medium A02;
    public final IgTextView A03;
    public final RoundedCornerImageView A04;
    public final Integer A05;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60702Jpn(View view, C66440MRu mRu, Integer num, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = num;
        ? r1 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.gallery_sticker_grid_item_thumbnail);
        this.A04 = r1;
        this.A03 = DbX.A0Z(view, R.id.gallery_sticker_grid_item_label);
        if (z) {
            r1.setRadius((float) AnonymousClass7TG.A05(view.getContext()));
        }
        r1.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(r1);
        A0m.A0C = true;
        A0m.A07 = true;
        A0m.A02 = 0.92f;
        C61686KHu.A00(A0m, this, mRu, 2);
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return medium.equals(this.A02);
    }

    public final void DLY(Medium medium, String str) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void A00(Bitmap bitmap, Medium medium) {
        Integer num;
        ? r2 = this.A04;
        r2.setImageBitmap(bitmap);
        if (!medium.CeS() || (num = this.A05) == null || medium.A03 >= num.intValue()) {
            r2.clearColorFilter();
        } else {
            DbU.A14(DbS.A07(this), r2, R.color.grey_10_80_transparent);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        DbY.A1S(medium, bitmap);
        ? r2 = this.A04;
        if (r2.getWidth() <= 0 || r2.getHeight() <= 0) {
            C71415OkE okE = new C71415OkE(1, medium, this, bitmap);
            this.A00 = okE;
            r2.addOnLayoutChangeListener(okE);
            return;
        }
        A00(bitmap, medium);
    }
}
