package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Fce  reason: case insensitive filesystem */
public final class C50492Fce implements C51907G7b {
    public final Bitmap A00;

    public final void E3y(IgdsHeadline igdsHeadline) {
        igdsHeadline.setCircularImageBitmap(this.A00);
    }

    public final void E3z(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageBitmap(this.A00, (C240963Ni) null);
        ImageView A0G = DbS.A0G(igdsHeadline, R.id.igds_headline_url_image);
        if (A0G != null) {
            A0G.setAdjustViewBounds(true);
        }
    }

    public final void E46(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageBitmap(this.A00, (C240963Ni) null);
        C48945Emj.A00(igdsHeadline, R.id.igds_headline_url_image, i);
    }

    public C50492Fce(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
