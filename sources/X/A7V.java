package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class A7V {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;

    public A7V(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.universal_cta_description_layout);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.universal_cta_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.universal_cta_subtitle);
        this.A05 = AnonymousClass7TF.A0F(view, R.id.universal_cta_icon_rounded);
        this.A02 = (ImageView) AnonymousClass7TF.A0F(view, R.id.universal_cta_chevron);
    }
}
