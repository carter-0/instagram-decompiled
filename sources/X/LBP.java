package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;

public final class LBP {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final EditText A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final ActionButton A0D;
    public final View A0E;
    public final LinearLayout A0F;

    public LBP(View view) {
        this.A03 = view;
        this.A0F = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.upcoming_event_layout);
        View A0G = AnonymousClass7TF.A0G(view, R.id.upcoming_event_action_bar);
        this.A0E = A0G;
        this.A09 = AnonymousClass7TG.A0R(A0G, R.id.action_bar_title);
        this.A0D = AnonymousClass7TF.A0F(A0G, R.id.action_bar_button_done);
        this.A05 = DbX.A0J(A0G, R.id.action_bar_button_cancel);
        this.A04 = (EditText) AnonymousClass7TF.A0F(view, R.id.event_name);
        this.A07 = DbX.A0J(view, R.id.event_name_icon);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.start_time_row);
        this.A0C = AnonymousClass7TG.A0R(view, R.id.start_time);
        this.A08 = DbX.A0J(view, R.id.start_time_icon);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.end_time_row);
        this.A0A = AnonymousClass7TG.A0R(view, R.id.end_time);
        this.A06 = DbX.A0J(view, R.id.end_time_icon);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.delete_upcoming_event);
        this.A0B = AnonymousClass7TG.A0R(view, R.id.upcoming_event_footer);
    }
}
