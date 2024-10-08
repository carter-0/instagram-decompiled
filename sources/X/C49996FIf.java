package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.FIf  reason: case insensitive filesystem */
public final class C49996FIf implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 0hq A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass6Z5 A03;
    public final /* synthetic */ String A04;

    public C49996FIf(Context context, 0hq r2, 1Xj r3, AnonymousClass6Z5 r4, String str) {
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass6Z5 r5 = this.A03;
        UserSession userSession = r5.A09;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A04;
        0hq r1 = this.A01;
        Context context = this.A00;
        MJ5 mj5 = new MJ5(0, this.A02, r5);
        2IS A042 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, str, "media_id"), A042, "input"), "DeleteFriendsStoryMutation", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43663C4l.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_ig_delete_friends_story", AnonymousClass7TE.A1C());
        1vn A012 = 1vm.A01(userSession);
        F3H f3h = new F3H((DialogInterface.OnDismissListener) null, r1, AnonymousClass05K.A00);
        f3h.A01();
        A012.ATL(new C50150FRi(1, context, f3h), new DFU(3, f3h, context, mj5), pandoGraphQLRequest);
    }
}
