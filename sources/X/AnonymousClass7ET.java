package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.7ET  reason: invalid class name */
public final class AnonymousClass7ET implements C2365734g {
    public final /* synthetic */ AnonymousClass7ES A00;

    public AnonymousClass7ET(AnonymousClass7ES r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        String str;
        0qQ.A0B(view, 0);
        AnonymousClass7ES r2 = this.A00;
        r2.A04 = (IgSimpleImageView) view.requireViewById(R.id.thumbs_up);
        r2.A03 = (IgSimpleImageView) view.requireViewById(R.id.thumbs_down);
        IgSimpleImageView igSimpleImageView = r2.A04;
        if (igSimpleImageView == null) {
            str = "thumbsUpPill";
        } else {
            Drawable background = igSimpleImageView.getBackground();
            if (background != null) {
                r2.A01 = (LayerDrawable) background;
                IgSimpleImageView igSimpleImageView2 = r2.A03;
                if (igSimpleImageView2 == null) {
                    str = "thumbsDownPill";
                } else {
                    Drawable background2 = igSimpleImageView2.getBackground();
                    if (background2 != null) {
                        r2.A00 = (LayerDrawable) background2;
                        r2.A05 = (IgdsMediaButton) view.requireViewById(R.id.regenerate_button);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
