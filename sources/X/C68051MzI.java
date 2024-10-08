package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.MzI  reason: case insensitive filesystem */
public final class C68051MzI extends C249703kE {
    public final C74380Ptv A00;
    public final IgdsPeopleCell A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68051MzI(C74380Ptv ptv, IgdsPeopleCell igdsPeopleCell) {
        super(igdsPeopleCell);
        0qQ.A0B(ptv, 2);
        this.A01 = igdsPeopleCell;
        this.A00 = ptv;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [X.3Z5, android.view.View, com.instagram.igds.components.button.IgdsButton] */
    public static final AnonymousClass3Z5 A00(Fragment fragment, C68051MzI mzI, AnonymousClass0iw r12, C266444Yx r13, UserSession userSession, C273014lo r15, User user, Integer num, Integer num2) {
        C73594PgU A14;
        FollowButtonBase followButtonBase;
        Context requireContext = fragment.requireContext();
        int intValue = num2.intValue();
        C74380Ptv ptv = mzI.A00;
        if (intValue != 0) {
            A14 = C66580MXl.A14(ptv, 2);
        } else {
            A14 = C66580MXl.A14(ptv, 1);
        }
        int intValue2 = num.intValue();
        User user2 = user;
        if (intValue2 == 0) {
            Integer num3 = AnonymousClass05K.A00;
            return new C47790EHb(requireContext, new C71405Ok4(0, A14, user2), num3, num3, 2Yu.A09(requireContext));
        } else if (intValue2 == 2) {
            return new C47790EHb(requireContext, new C71405Ok4(1, A14, user2), AnonymousClass05K.A01, AnonymousClass05K.A0C, 2Yu.A0B(requireContext));
        } else if (intValue2 == 1) {
            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.user_follow_button_medium, mzI.A01, false);
            if (!(inflate instanceof FollowButton) || (followButtonBase = (FollowButtonBase) inflate) == null) {
                return null;
            }
            followButtonBase.setBaseStyle(C243923aK.MEDIUM);
            user2.A0n(DbV.A0i(userSession, user2));
            if (user2.B6o() == FollowStatus.A08) {
                C294695ms.A00(userSession).A0G(user2, false);
            }
            followButtonBase.A0J.A03(r12, userSession, user2);
            return followButtonBase;
        } else if (intValue2 != 3) {
            return null;
        } else {
            String obj = C66909Mes.A00(requireContext, r13).toString();
            0qQ.A0B(obj, 2);
            ? igdsButton = new IgdsButton(requireContext, r15, C273024lp.MEDIUM, obj, 0, false);
            C71405Ok4.A01(igdsButton, 2, A14, user2);
            return igdsButton;
        }
    }
}
