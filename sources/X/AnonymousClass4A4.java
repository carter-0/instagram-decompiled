package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4A4  reason: invalid class name */
public final class AnonymousClass4A4 {
    public final FriendMapGraphQLImpl A00;

    public AnonymousClass4A4(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new FriendMapGraphQLImpl(userSession);
    }

    public final void A00(1P0 r19, User user, boolean z) {
        PandoGraphQLRequest pandoGraphQLRequest;
        1P0 cha;
        1vn r0 = this.A00.A00;
        2IS r6 = new 2IS();
        2IS r5 = new 2IS();
        AnonymousClass0K0 r4 = GraphQlCallInput.A02;
        User user2 = user;
        String id = user2.getId();
        0Df A02 = r4.A02();
        0Df.A00(A02, id, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        r6.A00.A02().A0E(A02, "data");
        AnonymousClass2IY r2 = PandoGraphQLRequest.Companion;
        1vR A002 = AnonymousClass1vS.A00();
        Map paramsCopy = r6.getParamsCopy();
        Map paramsCopy2 = r5.getParamsCopy();
        1P0 r22 = r19;
        if (z) {
            pandoGraphQLRequest = new PandoGraphQLRequest(A002, "FriendsMapUserMute", paramsCopy, paramsCopy2, C42905Blz.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_mute_friend_map_user", new ArrayList());
            cha = new CH9(r22, user2);
        } else {
            pandoGraphQLRequest = new PandoGraphQLRequest(A002, "FriendsMapUserUnmute", paramsCopy, paramsCopy2, Bm2.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_unmute_friend_map_user", new ArrayList());
            cha = new CHA(r22, user2);
        }
        r0.A06(pandoGraphQLRequest, cha);
    }
}
