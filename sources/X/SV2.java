package X;

import android.content.DialogInterface;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public final class SV2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ 2IR A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;

    public SV2(2IR r1, UserSession userSession, 1Xj r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        UserSession userSession = this.A01;
        1Xj r0 = this.A02;
        if (r0 != null) {
            str = r0.A2n();
        } else {
            str = null;
        }
        2IR r3 = this.A00;
        if (str != null) {
            1vn A012 = 1vm.A01(userSession);
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            A04.A04("media_id", str);
            C12090Smk.A00(new C12093Smn(r3, 5), new PandoGraphQLRequest(C41845B3m.A05(), "DeleteCommentPromptMutation", A04.getParamsCopy(), A042.getParamsCopy(), C42473Bcs.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_delete_comment_prompt_parent_comment", AnonymousClass7TE.A1C()), A012, r3, 6);
        }
    }
}
