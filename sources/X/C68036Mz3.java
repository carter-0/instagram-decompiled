package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mz3  reason: case insensitive filesystem */
public final class C68036Mz3 extends C249703kE {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final CircularImageView A06;
    public final IgdsButton A07;

    public C68036Mz3(View view) {
        super(view);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.suggested_upsell_card_title);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.suggested_user_card_subtitle);
        this.A05 = DbX.A0a(view, R.id.suggested_upsell_card_image);
        this.A06 = DbX.A0a(view, R.id.invite_upsell_card_image);
        this.A02 = DbX.A0J(view, R.id.facepiles_image);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.dismiss_button);
        this.A07 = JTR.A0n(view, R.id.suggested_upsell_card_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.suggested_upsell_card_container);
    }
}
