package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class L8B {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final C64162LRd A03;

    public L8B(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = DbU.A0F(view, R.id.add_to_fb_dating_story_icon);
        this.A02 = DbU.A0G(view, R.id.add_to_fb_dating_story_label);
        JTR.A1C(view, R.id.one_tap_button_view_stub);
        this.A03 = new C64162LRd(view, userSession, AnonymousClass05K.A01);
    }
}
