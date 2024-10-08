package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDc  reason: case insensitive filesystem */
public final class C14874UDc extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final RoundedCornerImageView A03;
    public final IgdsButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14874UDc(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(viewGroup, R.id.messaging_ad_suggested_post_thumbnail);
        this.A01 = DbX.A0Z(viewGroup, R.id.messaging_ad_suggested_post_caption);
        this.A00 = AnonymousClass7TF.A0G(viewGroup, R.id.promote_ad_messaging_post_selector_card);
        this.A02 = DbX.A0b(viewGroup, R.id.promote_ad_messaging_post_selector_thumbnail);
        this.A04 = JTR.A0n(viewGroup, R.id.promote_ad_tools_suggest_post_cta);
    }
}
