package X;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import com.instagram.android.R;

/* renamed from: X.Ryu  reason: case insensitive filesystem */
public final class C10834Ryu {
    public final View A00;
    public final View A01;
    public final Button A02;
    public final EditText A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final Toolbar A09;
    public final Group A0A;

    public C10834Ryu(View view) {
        this.A09 = (Toolbar) view.requireViewById(R.id.toolbar);
        this.A08 = Dba.A06(view);
        this.A04 = DbU.A0G(view, R.id.description);
        this.A01 = view.requireViewById(R.id.progress_bar_layout);
        this.A05 = DbU.A0G(view, R.id.error_text_view);
        this.A03 = (EditText) view.requireViewById(R.id.cvv_text_field);
        this.A07 = DbU.A0G(view, R.id.text_field_hint);
        this.A02 = (Button) view.requireViewById(R.id.authorize_button);
        this.A06 = DbU.A0G(view, R.id.fb_payment_terms);
        this.A00 = view.requireViewById(R.id.paypal_login_webview_container);
        this.A0A = (Group) view.requireViewById(R.id.paypal_webview_hide_other_elements);
    }
}
