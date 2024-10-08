package X;

import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Fcg  reason: case insensitive filesystem */
public final class C50494Fcg implements C51907G7b {
    public final ImageUrl A00;

    public final void E3y(IgdsHeadline igdsHeadline) {
        ImageUrl imageUrl = this.A00;
        0qQ.A0B(imageUrl, 0);
        IgdsHeadline.A01(igdsHeadline, (Integer) null).setUrl(imageUrl, igdsHeadline);
    }

    public final void E3z(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageURL(this.A00, (AnonymousClass0iw) null, (C240963Ni) null);
        ImageView A0G = DbS.A0G(igdsHeadline, R.id.igds_headline_url_image);
        if (A0G != null) {
            A0G.setAdjustViewBounds(true);
        }
    }

    public final void E46(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageURL(this.A00, (AnonymousClass0iw) null, (C240963Ni) null);
        C48945Emj.A00(igdsHeadline, R.id.igds_headline_url_image, i);
    }

    public C50494Fcg(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
