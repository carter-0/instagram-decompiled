package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ncu  reason: case insensitive filesystem */
public final class C69018Ncu extends OCP {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final CircularImageView A05;
    public final IgdsButton A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69018Ncu(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.suggested_upsell_card_image);
        this.A04 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.icon_badge);
        this.A03 = DbW.A0B(view, R.id.suggested_upsell_card_title);
        this.A02 = DbW.A0B(view, R.id.suggested_upsell_card_subtitle);
        this.A01 = DbW.A0B(view, R.id.suggested_upsell_card_extra_text);
        this.A06 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.suggested_upsell_card_primary_button);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.dismiss_button);
    }
}
