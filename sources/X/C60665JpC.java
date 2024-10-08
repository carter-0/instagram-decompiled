package X;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.JpC  reason: case insensitive filesystem */
public final class C60665JpC extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final ComposeView A03;
    public final UserSession A04;
    public final IgImageView A05;
    public final IgdsButton A06;

    public C60665JpC(View view, UserSession userSession) {
        super(view);
        this.A04 = userSession;
        this.A01 = view;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.recommendation_container);
        this.A05 = DbX.A0b(view, R.id.recommendation_icon);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.recommendation_title);
        this.A06 = JTR.A0n(view, R.id.recommendation_btn);
        this.A03 = (ComposeView) AnonymousClass7TF.A0F(view, R.id.recommendation_container_compose);
    }
}
