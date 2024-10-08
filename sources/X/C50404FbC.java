package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FbC  reason: case insensitive filesystem */
public final class C50404FbC implements C74404PuK {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333517Zg A03;

    public final N4H BWk() {
        User user = (User) 00k.A0J(this.A03.C6l().C6Q().A0b);
        String str = null;
        if (user != null) {
            str = user.A03.AaU();
        }
        UserSession userSession = this.A02;
        return new N4H((View.OnClickListener) new C50104FOu((Object) new LTH(userSession), (Object) this, (Object) AnonymousClass7TM.A00(userSession), str, 4), (int) R.drawable.instagram_direct_pano_outline_24, 2131968700);
    }

    public final boolean isEnabled() {
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus;
        AnonymousClass7SD C6Q = this.A03.C6l().C6Q();
        List list = C6Q.A0b;
        if (list.size() != 1) {
            return false;
        }
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36330479816819343L)) {
            return false;
        }
        int i = C6Q.A08;
        if (i == 1012) {
            return AnonymousClass9B8.A05(userSession);
        }
        if (i != 1014) {
            return false;
        }
        User user = (User) 00k.A0J(list);
        if (user != null) {
            iGAIAgentVisibilityStatus = user.A03.AaY();
        } else {
            iGAIAgentVisibilityStatus = null;
        }
        if (iGAIAgentVisibilityStatus != IGAIAgentVisibilityStatus.PUBLIC || !AnonymousClass9B8.A05(userSession)) {
            return false;
        }
        return true;
    }

    public C50404FbC(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, C333517Zg r4) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }
}
