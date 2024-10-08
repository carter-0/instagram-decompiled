package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8xR  reason: invalid class name and case insensitive filesystem */
public final class C371018xR implements C231672s5 {
    public final /* synthetic */ AnonymousClass875 A00;
    public final /* synthetic */ C370978xN A01;

    public C371018xR(AnonymousClass875 r1, C370978xN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        0qQ.A0B(bitmap, 1);
        igImageView.setImageDrawable(new AnonymousClass8DV(igImageView.getResources(), bitmap));
        C370978xN r0 = this.A01;
        r0.A00();
        AnonymousClass875 r1 = this.A00;
        if (r1 != null) {
            r1.D8f(r0.A00);
        } else {
            0kD.A07("DialElementViewHolder", "DialElementViewHolder.Listener is null", (Throwable) null);
        }
    }
}
