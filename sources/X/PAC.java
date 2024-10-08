package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class PAC implements C74404PuK {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C333517Zg A03;

    public PAC(FragmentActivity fragmentActivity, UserSession userSession, C333517Zg r3, int i) {
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A03 = r3;
        this.A00 = i;
    }

    public final N4H BWk() {
        return new N4H((View.OnClickListener) new C71397Ojw(this, 43), (int) R.drawable.instagram_new_story_pano_outline_24, 2131968706);
    }
}
