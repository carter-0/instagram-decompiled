package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

public final class UDV extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final CustomCTAButton A02;
    public final CustomCTAButton A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDV(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = (CustomCTAButton) view.requireViewById(R.id.button);
        this.A03 = (CustomCTAButton) view.requireViewById(R.id.secondary_button);
        this.A01 = DbU.A0G(view, R.id.message);
    }
}
