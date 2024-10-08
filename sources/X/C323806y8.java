package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6y8  reason: invalid class name and case insensitive filesystem */
public final class C323806y8 extends AnonymousClass3NK {
    public final /* synthetic */ UserDetailTabController A00;

    public C323806y8(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    public final boolean Dqe(View view) {
        UserDetailTabController userDetailTabController = this.A00;
        UserSession userSession = userDetailTabController.A0M;
        FragmentActivity fragmentActivity = userDetailTabController.A0I;
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(fragmentActivity, C250563lf.A0C(28D.A41).A00(), userSession, TransparentModalActivity.class, "clips_camera");
        A02.A07();
        A02.A0C(fragmentActivity);
        return true;
    }
}
