package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class EUC extends C243843aC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public EUC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = obj;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        int i;
        C391629tO r1;
        C267054as r0;
        float f;
        if (this.A00 != 0) {
            Object obj = this.A02;
            C50900Fkf fkf = (C50900Fkf) this.A03;
            FollowButton followButton = fkf.A0D;
            UserSession userSession = (UserSession) this.A04;
            FollowStatus A0i = DbV.A0i(userSession, user);
            FollowStatus followStatus2 = FollowStatus.A05;
            if (A0i.equals(followStatus2)) {
                r0 = C267054as.CONDENSED;
            } else {
                r0 = C267054as.FULL;
            }
            followButton.setFollowButtonSize(r0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) followButton.getLayoutParams();
            if (DbV.A0i(userSession, user).equals(followStatus2)) {
                layoutParams.width = ((Context) this.A01).getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
                f = 0.0f;
            } else {
                layoutParams.width = 0;
                f = 1.0f;
            }
            layoutParams.weight = f;
            if (DbV.A0i(userSession, user).equals(followStatus2)) {
                View view = fkf.A00;
                if (view == null) {
                    view = fkf.A04.inflate();
                    fkf.A00 = view;
                }
                view.setVisibility(0);
                View view2 = fkf.A00;
                if (view2 == null) {
                    view2 = fkf.A04.inflate();
                    fkf.A00 = view2;
                }
                FP7.A00(view2, 13, obj, user);
            } else {
                0nA.A0O(fkf.A00);
            }
            followButton.setLayoutParams(layoutParams);
            return;
        }
        0qQ.A0B(followStatus, 1);
        UserSession userSession2 = (UserSession) this.A03;
        String BZP = ((2Er) this.A02).BZP();
        int ordinal = followStatus.ordinal();
        if (ordinal != 4) {
            i = 22;
            if (ordinal != 5) {
                i = 21;
                r1 = C391629tO.A0Q;
            } else {
                r1 = C391629tO.A0O;
            }
        } else {
            i = 23;
            r1 = C391629tO.A0N;
        }
        AIh.A01(r1, (C391549tG) null, userSession2, BZP, i);
    }
}
