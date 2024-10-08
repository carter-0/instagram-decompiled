package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class P09 implements DeveloperOptionsSection {
    public static final P09 A00 = new Object();

    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r7, AnonymousClass07i r8) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return 0sr.A1P(new C50989Fmc[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new C71408Ok7(41, (Object) userSession, (Object) fragmentActivity), (CharSequence) "[msys] Armadillo entry point"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new C71408Ok7(42, (Object) userSession, (Object) fragmentActivity), (CharSequence) "[msys] ICDC")});
    }

    public final int getTitleRes() {
        return 2131957716;
    }
}
