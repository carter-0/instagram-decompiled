package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.WdY  reason: case insensitive filesystem */
public final class C19670WdY implements X77 {
    public final /* synthetic */ C18799W2m A00;

    public final void DK5(Drawable drawable) {
        C18799W2m w2m = this.A00;
        IgImageView igImageView = w2m.A00;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
            IgImageView igImageView2 = w2m.A00;
            if (igImageView2 != null) {
                igImageView2.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C19670WdY(C18799W2m w2m) {
        this.A00 = w2m;
    }

    public final void DCZ() {
        this.A00.A00 = null;
    }
}
