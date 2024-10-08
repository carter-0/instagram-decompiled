package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Oz0  reason: case insensitive filesystem */
public final class C72232Oz0 implements C231672s5 {
    public static final C72232Oz0 A00 = new C72232Oz0();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        AnonymousClass8DV r0 = new AnonymousClass8DV(igImageView.getResources(), bitmap);
        r0.A00();
        igImageView.setImageDrawable(r0);
    }
}
