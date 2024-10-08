package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.UDj  reason: case insensitive filesystem */
public final class C14881UDj extends C249703kE {
    public final VNL A00;
    public final IgdsButton A01;
    public final StackedAvatarView A02;
    public final UserSession A03;
    public final User A04;

    public C14881UDj(View view, UserSession userSession, VNL vnl, User user) {
        super(view);
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = vnl;
        this.A02 = (StackedAvatarView) AnonymousClass7TF.A0F(view, R.id.find_more_card_avatar_view);
        this.A01 = JTR.A0n(view, R.id.find_more_card_see_all_button);
    }
}
