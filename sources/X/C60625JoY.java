package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.JoY  reason: case insensitive filesystem */
public final class C60625JoY extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final C65601Lwb A02;

    public C60625JoY(View view) {
        super(view);
        this.A02 = new C65601Lwb(DbT.A0b(view, R.id.attribution_icon_image), (GradientSpinner) view.requireViewById(R.id.attribution_icon_reel_ring));
        this.A01 = DbU.A0G(view, R.id.attribution_title);
        this.A00 = DbU.A0G(view, R.id.attribution_subtitle);
    }
}
