package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

public abstract class VGK {
    public static final void A00(IgImageView igImageView, C19277WSk wSk, User user) {
        if (user == null) {
            igImageView.setVisibility(8);
            return;
        }
        igImageView.setVisibility(0);
        ImageUrl Bh3 = user.A03.Bh3();
        if (Bh3 != null) {
            igImageView.setUrl(Bh3, wSk.A01);
        } else {
            igImageView.A09();
        }
        WBD.A00(igImageView, 55, wSk, user);
        DbU.A12(igImageView.getContext(), igImageView, 2131969795);
    }
}
