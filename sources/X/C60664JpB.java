package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.JpB  reason: case insensitive filesystem */
public final class C60664JpB extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgdsButton A04;
    public final IgdsButton A05;
    public final IgdsButton A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60664JpB(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.branded_content_ad_code_container);
        this.A03 = DbX.A0Z(view, R.id.branded_content_ad_code_label);
        this.A05 = JTR.A0n(view, R.id.copy_button);
        View requireViewById = view.requireViewById(R.id.branded_content_ad_code);
        IgdsButton igdsButton = (IgdsButton) requireViewById;
        igdsButton.A02(C273084lx.START, R.drawable.instagram_copy_pano_outline_16);
        igdsButton.setIconPadding(AnonymousClass7TE.A0C(view.getResources()));
        0qQ.A07(requireViewById);
        this.A04 = igdsButton;
        this.A06 = JTR.A0n(view, R.id.share_button);
        this.A02 = DbX.A0Y(view, R.id.facepile);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.branded_content_ad_code_used);
    }
}
