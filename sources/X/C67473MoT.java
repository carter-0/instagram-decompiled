package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MoT  reason: case insensitive filesystem */
public final class C67473MoT extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67473MoT(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.header_wrapper);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.header_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.header_action_button);
        this.A01 = DbX.A0J(view, R.id.header_action_close_button);
        this.A02 = DbX.A0J(view, R.id.header_notification_settings_icon);
    }
}
