package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Aoq  reason: case insensitive filesystem */
public final class C41130Aoq implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C380519Ym A01;
    public final /* synthetic */ C317876nz A02;

    public C41130Aoq(Drawable drawable, C380519Ym r2, C317876nz r3) {
        this.A01 = r2;
        this.A00 = drawable;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void run() {
        C380519Ym r4 = this.A01;
        ? r1 = r4.A03;
        int width = r1.getWidth();
        int height = r1.getHeight();
        r1.setScaleType(ImageView.ScaleType.MATRIX);
        AIM.A01(this.A00, r4, this.A02, width, height);
    }
}
