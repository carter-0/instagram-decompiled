package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Van  reason: case insensitive filesystem */
public final class C17595Van {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final IgImageView A05;

    public C17595Van(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A05 = DbX.A0b(view, R.id.brand_image);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.brand_username);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.brand_subtitle);
        this.A04 = DbX.A0Y(view, R.id.info_icon);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.chevron);
    }
}
