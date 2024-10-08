package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.user.model.User;

/* renamed from: X.Ef6  reason: case insensitive filesystem */
public abstract class C48473Ef6 {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        String str;
        C276544tV A0M = DbW.A0M(r16, 1);
        UserSession A0W = DbX.A0W(r15);
        FragmentActivity A04 = C308206Td.A04(r15);
        0qQ.A0C(A04, Pxd.A00(9));
        if (A0M != null) {
            str = A0M.A0D();
        } else {
            str = null;
        }
        User A0j = DbT.A0j(A0W);
        C45445CwY cwY = new C45445CwY(new FanClubInfoDictImpl((FanClubFanConsiderationPageFeatureEligibilityResponse) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null));
        cwY.A07 = str;
        cwY.A02 = true;
        A0j.A03.EVz(cwY.A00());
        DbT.A1S(A0W, A0j);
        ChannelCreationSource channelCreationSource = ChannelCreationSource.MESSAGING_LED;
        EV0 ev0 = EV0.Social;
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null);
        0qQ.A0B(A0W, 0);
        FC2.A01(A0W, channelCreationFlowExtraArgs, channelCreationSource, ev0, false).CfS(A04);
        AnonymousClass441.A02.A02(A0W, new C51020FnC(A0W, 0), A0W.A06);
        return null;
    }
}
