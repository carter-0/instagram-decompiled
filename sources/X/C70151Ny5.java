package X;

import android.os.Handler;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl;

/* renamed from: X.Ny5  reason: case insensitive filesystem */
public abstract class C70151Ny5 {
    /* JADX WARNING: type inference failed for: r22v1, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r21v1, types: [X.0r1, java.lang.Object] */
    public static final void A00(UserSession userSession, O7O o7o, String str, String str2) {
        O7O o7o2 = o7o;
        String str3 = str;
        AnonymousClass7TG.A1O(str3, o7o2);
        Handler A0D = AnonymousClass7TF.A0D();
        UserSession userSession2 = userSession;
        1vn A01 = 1vm.A01(userSession2);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("user_prompt", str3);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A04, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2), "IGDirectMessagingSearchMetaAISnippetQueryQuery", A04.getParamsCopy(), A042.getParamsCopy(), IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_messaging_search_genai_snippet", AnonymousClass7TE.A1C());
        O7O o7o3 = o7o2;
        String str4 = str3;
        A01.ATM(C71563Omy.A00, new C71574OnB(A0D, userSession2, o7o3, str4, new Object(), new Object()), pandoGraphQLRequest, new 0nX(428207724));
    }
}
