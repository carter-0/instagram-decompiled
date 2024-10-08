package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class L8P {
    public final C252063oV A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public L8P(View view) {
        this.A01 = AnonymousClass7TF.A0G(view, R.id.row_fb_user_container);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.fb_label);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.options_label);
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.selectable_user_row_checkbox_view_stub), false, false);
        this.A00 = A012;
        A012.EeU(C64888Ljo.A00);
        A012.setVisibility(0);
    }
}
