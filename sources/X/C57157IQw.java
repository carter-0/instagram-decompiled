package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* renamed from: X.IQw  reason: case insensitive filesystem */
public final class C57157IQw implements DeveloperOptionsSection {
    public static final C57157IQw A00 = new Object();

    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r12, AnonymousClass07i r13) {
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, fragmentActivity);
        0qQ.A0B(r12, 2);
        return 0sr.A1P(new C74278Ps6[]{new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new C71399Ojy(38, r12.requireArguments(), userSession, fragmentActivity), 2131958195), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ID3(A1U ? 1 : 0, (Object) fragmentActivity, (Object) userSession), 2131958339), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ID3(2, (Object) fragmentActivity, (Object) userSession), 2131958340), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new LY2(24, fragmentActivity, userSession), 2131958217), new PR9((CompoundButton.OnCheckedChangeListener) new IEB(userSession, 6), 2131958325, AnonymousClass7TE.A0q(userSession).getBoolean("show_suggestion_netego_unit_type_in_header", false))});
    }

    public final int getTitleRes() {
        return 2131957935;
    }
}
