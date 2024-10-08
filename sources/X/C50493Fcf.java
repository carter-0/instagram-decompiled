package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Fcf  reason: case insensitive filesystem */
public final class C50493Fcf implements C51907G7b {
    public final Drawable A00;

    public final void E3y(IgdsHeadline igdsHeadline) {
        igdsHeadline.setCircularImageDrawable(this.A00);
    }

    public final void E3z(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageDrawable(this.A00);
        ImageView A0G = DbS.A0G(igdsHeadline, R.id.igds_headline_image);
        if (A0G != null) {
            A0G.setAdjustViewBounds(true);
        }
    }

    public final void E46(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageDrawable(this.A00);
        C48945Emj.A00(igdsHeadline, R.id.igds_headline_image, i);
    }

    public C50493Fcf(Drawable drawable) {
        this.A00 = drawable;
    }
}
