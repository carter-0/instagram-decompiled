package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDu  reason: case insensitive filesystem */
public final class C14892UDu extends C249703kE {
    public final IgImageView A00;
    public final IgdsButton A01;
    public final IgdsButton A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public C14892UDu(View view) {
        super(view);
        this.A00 = JTR.A0i(view, R.id.image);
        this.A02 = C13989Tnp.A0X(view, R.id.no_media_availability_button);
        this.A04 = C13989Tnp.A0X(view, R.id.yes_media_availability_button);
        this.A01 = C13989Tnp.A0X(view, R.id.no_product_appropriateness_button);
        this.A03 = C13989Tnp.A0X(view, R.id.yes_product_appropriateness_button);
    }
}
