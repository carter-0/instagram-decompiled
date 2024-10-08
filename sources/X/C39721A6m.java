package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.A6m  reason: case insensitive filesystem */
public final class C39721A6m {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final A7D A03;

    public C39721A6m(Context context, View view, UserSession userSession) {
        0qQ.A0B(view, 3);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = view;
        A7D a7d = new A7D(view);
        this.A03 = a7d;
        View view2 = a7d.A04;
        a7d.A03 = (FollowButton) view2.requireViewById(R.id.reachability_follow_button);
        a7d.A01 = (IgView) view2.requireViewById(R.id.reachability_follow_button_divider);
        a7d.A00 = view2.requireViewById(R.id.reachability_footer_text);
        a7d.A02 = (IgdsBottomButtonLayout) view2.requireViewById(R.id.reachability_incoming_request_layout);
    }
}
