package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.OEc  reason: case insensitive filesystem */
public final class C70631OEc {
    public final View A00;
    public final RadioButton A01;
    public final TextView A02;

    public C70631OEc(View view) {
        this.A00 = view;
        this.A02 = DbU.A0G(view, R.id.report_tag_title);
        this.A01 = (RadioButton) view.requireViewById(R.id.report_tag_radio_button);
    }
}
