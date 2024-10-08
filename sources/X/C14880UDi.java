package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.UDi  reason: case insensitive filesystem */
public final class C14880UDi extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final RoundedCornerFrameLayout A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14880UDi(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.cta_container);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.cta_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A03 = DbX.A0Y(view, R.id.icon);
        this.A02 = DbX.A0Y(view, R.id.cta_chevron);
    }
}
