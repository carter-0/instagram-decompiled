package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDQ extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;

    public UDQ(View view) {
        super(view);
        this.A00 = view.requireViewById(R.id.state_selector_container);
        this.A01 = view.requireViewById(R.id.state_selector_loading_spinner);
        this.A02 = view.requireViewById(R.id.state_selector_text_container);
        this.A03 = DbU.A0G(view, R.id.state_selector_text);
        03v.A0B(view, new U7M(this, 8));
    }
}
