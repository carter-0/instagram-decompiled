package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

public final class PHR implements C367608rH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public PHR(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onClick() {
        UserSession userSession = this.A02;
        AnonymousClass7I3 r0 = new AnonymousClass7I3(userSession);
        String str = this.A03;
        1Ln A0J = 1Ln.A0J(r0.A01);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(41);
            A0J.A0X(0);
            A0J.A0M(C69503Nml.A0G, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("agent_id", str);
            A0J.Cgf();
        }
        new AiAgentThreadLauncher(userSession).A08(this.A00, this.A01, str, (String) null, (String) null, (String) null, true);
    }
}
