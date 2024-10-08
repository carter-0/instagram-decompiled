package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.L9n  reason: case insensitive filesystem */
public final class C63858L9n {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final C252063oV A04;
    public final C64162LRd A05;

    public C63858L9n(View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        View A0G = AnonymousClass7TF.A0G(view, R.id.row_add_to_story_container);
        this.A00 = A0G;
        this.A03 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.row_add_to_story_profile_picture);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.sharing_preferences_label);
        this.A04 = 2b1.A00(view.findViewById(R.id.edit_button));
        View A0F = DbY.A0F(view, R.id.one_tap_button_view_stub);
        0qQ.A07(A0F);
        this.A01 = A0F;
        Integer num = AnonymousClass05K.A01;
        0qQ.A0A(userSession);
        this.A05 = new C64162LRd(A0G, userSession, num);
    }
}
