package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class Fd7 implements MVB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd7(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = str;
        this.A01 = userSession;
    }

    public final void onButtonClick(View view) {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            F3W A03 = IgFragmentFactoryImpl.A00().A03(this.A02);
            C309516Yo A0M = DbS.A0M(fragmentActivity, this.A01);
            A0M.A0D(A03.A01());
            A0M.A04();
        }
    }
}
