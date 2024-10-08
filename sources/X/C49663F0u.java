package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.F0u  reason: case insensitive filesystem */
public final class C49663F0u {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;

    public C49663F0u(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.link_option_text);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.link_option_sub_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.is_pinned_text);
        this.A07 = DbX.A0b(view, R.id.custom_link_icon);
        this.A04 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.preset_icon_frame);
        this.A08 = DbX.A0b(view, R.id.preset_icon);
        this.A05 = DbX.A0Y(view, R.id.link_option_icon);
        this.A06 = DbX.A0Y(view, R.id.link_option_overflow_icon);
    }
}
