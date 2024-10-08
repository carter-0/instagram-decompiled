package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.gallery.Medium;

/* renamed from: X.9oJ  reason: invalid class name and case insensitive filesystem */
public final class C388739oJ extends C380599Yu implements C348257y9 {
    public C348267yA A00;
    public Medium A01;
    public final C355618Qr A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C388739oJ(View view, C355568Qm r3, C355618Qr r4, C355448Qa r5) {
        super(view, r3, r5);
        0qQ.A0B(r4, 2);
        this.A02 = r4;
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return medium.equals(this.A01);
    }

    public final void DLY(Medium medium, String str) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        0qQ.A0B(bitmap, 2);
        this.A0A.setImageBitmap(bitmap);
    }
}
