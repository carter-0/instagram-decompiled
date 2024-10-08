package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LAN {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C64162LRd A06;

    public LAN(View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        View A0G = AnonymousClass7TF.A0G(view, R.id.row_add_to_story_favorites_container);
        this.A00 = A0G;
        this.A02 = DbX.A0J(view, R.id.icon);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.label);
        this.A05 = 2b1.A00(view.findViewById(R.id.edit_close_friends_label_stub));
        this.A04 = 2b1.A00(view.findViewById(R.id.edit_button));
        View A0F = DbY.A0F(view, R.id.one_tap_button_view_stub);
        0qQ.A07(A0F);
        this.A01 = A0F;
        Integer num = AnonymousClass05K.A01;
        0qQ.A0A(userSession);
        this.A06 = new C64162LRd(A0G, userSession, num);
    }
}
