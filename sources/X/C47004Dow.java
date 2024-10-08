package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Dow  reason: case insensitive filesystem */
public final class C47004Dow extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;

    public C47004Dow(View view) {
        super(view);
        this.A04 = DbX.A0Y(view, R.id.direct_private_share_warning_icon);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.direct_share_privacy_warning_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.direct_share_privacy_warning_subtitle);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.direct_private_share_warning_bottom_divider);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.direct_private_share_warning_top_divider);
    }
}
