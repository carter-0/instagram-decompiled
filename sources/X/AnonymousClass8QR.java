package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8QR  reason: invalid class name */
public final class AnonymousClass8QR implements Runnable {
    public final /* synthetic */ AnonymousClass8QN A00;

    public AnonymousClass8QR(AnonymousClass8QN r1) {
        this.A00 = r1;
    }

    public final void run() {
        View A01;
        AnonymousClass8QN r2 = this.A00;
        IgImageView igImageView = r2.A03;
        if (igImageView != null) {
            igImageView.A09();
            r2.A03.setVisibility(8);
        }
        C71662eb r1 = r2.A0I;
        if (r1.A04() && (A01 = r1.A01()) != null) {
            A01.setVisibility(0);
        }
    }
}
