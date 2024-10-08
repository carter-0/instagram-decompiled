package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.GjL  reason: case insensitive filesystem */
public final class C53149GjL extends C249703kE {
    public View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final IgLinearLayout A05;
    public final IgSimpleImageView A06;
    public final IgSimpleImageView A07;
    public final RoundedCornerFrameLayout A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53149GjL(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A08 = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.cta_container);
        this.A05 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.texts_container);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.cta_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A07 = DbX.A0Y(view, R.id.icon);
        this.A06 = DbX.A0Y(view, R.id.cta_chevron);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.top_divider);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.bottom_divider);
    }
}
