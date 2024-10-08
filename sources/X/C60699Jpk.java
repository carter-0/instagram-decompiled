package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jpk  reason: case insensitive filesystem */
public final class C60699Jpk extends C249703kE implements C348257y9 {
    public C348267yA A00;
    public Medium A01;
    public final C355618Qr A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final C60443Jlb A05;
    public final Matrix A06 = AnonymousClass7TE.A0U();

    public C60699Jpk(View view, C355618Qr r7, C60443Jlb jlb) {
        super(view);
        this.A02 = r7;
        this.A05 = jlb;
        IgImageView requireViewById = view.requireViewById(R.id.gallery_grid_item_thumbnail);
        IgImageView igImageView = requireViewById;
        igImageView.setVisibility(0);
        0qQ.A07(requireViewById);
        this.A04 = igImageView;
        IgTextView requireViewById2 = view.requireViewById(R.id.gallery_grid_item_label);
        IgTextView igTextView = requireViewById2;
        igTextView.setVisibility(0);
        0qQ.A07(requireViewById2);
        this.A03 = igTextView;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(igImageView);
        A0m.A0C = true;
        A0m.A07 = true;
        A0m.A02 = 0.92f;
        A0m.A04 = new C64850LjC(this, 3);
        A0m.A00();
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return medium.equals(this.A01);
    }

    public final void DLY(Medium medium, String str) {
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        AnonymousClass7TF.A1B(medium, 0, bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = this.itemView.getWidth();
        int height2 = this.itemView.getHeight();
        int i = medium.A07;
        Matrix matrix = this.A06;
        1MF.A0J(matrix, width, height, width2, height2, i, false);
        IgImageView igImageView = this.A04;
        igImageView.setScaleType(ImageView.ScaleType.MATRIX);
        igImageView.setImageMatrix(matrix);
        igImageView.setImageBitmap(bitmap);
        this.A03.setText(medium.B8E());
    }
}
