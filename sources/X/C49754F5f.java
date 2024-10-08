package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import java.util.LinkedHashMap;

/* renamed from: X.F5f  reason: case insensitive filesystem */
public abstract class C49754F5f {
    public static final void A00(UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, String str) {
        0qQ.A0B(channelChallengeShareInfo, 1);
        if (str != null) {
            C72202OyR A00 = C69869NtX.A00(userSession);
            String C6C = channelChallengeShareInfo.C6C();
            String C6k = channelChallengeShareInfo.C6k();
            String BSE = channelChallengeShareInfo.BSE();
            String AnZ = channelChallengeShareInfo.AnZ();
            String Amd = channelChallengeShareInfo.Amd();
            String B23 = channelChallengeShareInfo.B23();
            Integer AdO = channelChallengeShareInfo.AdO();
            String CD1 = channelChallengeShareInfo.CD1();
            boolean z = channelChallengeShareInfo instanceof ChannelChallengeAllWinnersShareInfo;
            1Ln A0E = 1Ln.A0E(A00.A01);
            if (DbT.A1Y(A0E)) {
                String A01 = C72202OyR.A01(B23, z);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                A1H.put("share_type", A01);
                A1H.put("share_option", str);
                A1H.put("challenge_id", Amd);
                if (CD1 != null) {
                    A1H.put("user_type", CD1);
                }
                A0E.A0h(Long.valueOf(A00.A00));
                DbV.A1M(A0E, AnonymousClass000.A00(78));
                A0E.A0p("challenge_share_sheet");
                A0E.A0q(C72202OyR.A00(B23));
                A0E.A0o(C313746gw.A01(AdO));
                A0E.A0s(C6C);
                A0E.A0i(DbZ.A0d(C6k));
                A0E.A0R("item_id", BSE);
                A0E.A0R("client_context_id", AnZ);
                A0E.A0v(A00.A02);
                A0E.A0w(A1H);
                A0E.Cgf();
            }
        }
    }

    public static final void A01(UserSession userSession, InviteLinkShareInfo inviteLinkShareInfo, String str) {
        int i;
        0qQ.A0B(inviteLinkShareInfo, 1);
        if (inviteLinkShareInfo.A02 == 29 && str != null) {
            C313756gx A00 = C313746gw.A00(userSession);
            String str2 = inviteLinkShareInfo.A07;
            String str3 = inviteLinkShareInfo.A09;
            boolean z = inviteLinkShareInfo.A0C;
            int i2 = inviteLinkShareInfo.A00;
            String str4 = inviteLinkShareInfo.A0A;
            1Ln A0J = DbT.A0J(A00);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A00);
                DbV.A1M(A0J, AnonymousClass000.A00(78));
                A0J.A0p("send_invite_link_sheet");
                if (z) {
                    i = 117;
                } else {
                    i = 128;
                }
                A0J.A0i(DbZ.A0b(A0J, C66579MXk.A00(i), str2, str3, i2));
                A0J.A0v(A00.A01);
                A0J.A0w(DbY.A0q("share_option", str, AnonymousClass7TE.A1L("user_type", str4), AnonymousClass7TE.A1L("share_type", "invite_link")));
                A0J.Cgf();
            }
        }
    }
}
