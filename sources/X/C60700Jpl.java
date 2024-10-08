package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Jpl  reason: case insensitive filesystem */
public final class C60700Jpl extends C249703kE implements C348257y9 {
    public C348267yA A00;
    public Medium A01;
    public IgImageButton A02;
    public final C355618Qr A03;
    public final C60444Jlc A04;
    public final Matrix A05 = AnonymousClass7TE.A0U();
    public final View A06;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60700Jpl(View view, C355618Qr r4, C60444Jlc jlc, float f) {
        super(view);
        0qQ.A0B(view, 1);
        this.A06 = view;
        this.A03 = r4;
        this.A04 = jlc;
        ? r1 = (IgImageButton) view.requireViewById(R.id.gallery_image);
        this.A02 = r1;
        r1.A00 = f;
        LYD.A02(r1, 2, this);
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return medium.equals(this.A01);
    }

    public final void DLY(Medium medium, String str) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton] */
    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        AnonymousClass7TF.A1B(medium, 0, bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        View view = this.A06;
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        int i = medium.A07;
        Matrix matrix = this.A05;
        1MF.A0J(matrix, width, height, width2, height2, i, false);
        ? r1 = this.A02;
        r1.setScaleType(ImageView.ScaleType.MATRIX);
        r1.setImageMatrix(matrix);
        r1.setImageBitmap(bitmap);
    }
}
