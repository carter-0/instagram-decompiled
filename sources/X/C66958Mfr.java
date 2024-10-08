package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mfr  reason: case insensitive filesystem */
public final class C66958Mfr {
    public final View A00;
    public final TextView A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final IgdsButton A04;
    public final IgdsButton A05;

    public C66958Mfr(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A04 = JTR.A0n(view, R.id.profile_header_request_confirm_button);
        this.A05 = JTR.A0n(view, R.id.profile_header_request_deny_button);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.profile_header_request_text);
        this.A02 = DbU.A0Z(view, R.id.profile_header_request_icon_stub);
        this.A03 = C66581MXm.A0T(view, R.id.social_context_message);
    }
}
