package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class P08 implements DeveloperOptionsSection {
    public static final P08 A00 = new Object();

    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r6, AnonymousClass07i r7) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        if (AnonymousClass65D.A00(userSession).A00()) {
            return AnonymousClass7TE.A1I(new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new C71405Ok4(21, fragmentActivity, userSession), 2131958441));
        }
        return 0sn.A00;
    }

    public final int getTitleRes() {
        return 2131958440;
    }
}
