package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UD3 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final X3N A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UD3(View view, X3N x3n) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = DbU.A0G(view, R.id.location_typeahead_display_name);
        this.A01 = DbU.A0G(view, R.id.location_typeahead_type_label);
        this.A02 = x3n;
    }
}
