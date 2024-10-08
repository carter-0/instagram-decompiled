package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class GTD {
    public static final GTE A0A = new Object();
    public String A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final IgImageView A08;
    public final IgImageView A09;

    public GTD(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A03 = AnonymousClass7TF.A0G(view, R.id.universal_cta_description_layout);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.universal_cta_text);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.universal_cta_subtitle);
        this.A07 = A0R;
        this.A08 = DbX.A0b(view, R.id.universal_cta_icon_rounded);
        this.A04 = DbX.A0J(view, R.id.universal_cta_chevron);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.universal_cta_button_overlay);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.universal_cta_follow_cta_text);
        this.A09 = DbX.A0b(view, R.id.universal_cta_profile_pic);
        A0R.getPaint().setFakeBoldText(true);
    }
}
