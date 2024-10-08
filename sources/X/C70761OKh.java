package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.OKh  reason: case insensitive filesystem */
public final class C70761OKh {
    public 0hq A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public C70761OKh(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    public final void A00(Fragment fragment, C70814OMj oMj, String str, String str2) {
        String str3;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        if (!(oMj == null || (str3 = oMj.A01) == null)) {
            A0a.putString("DirectEditIceBreakerFragment.icebreaker_id", str3);
        }
        if (!(str2 == null || str2.length() == 0)) {
            A0a.putString("DirectEditIceBreakerFragment.prefill_answer", str2);
        }
        UserSession userSession = this.A02;
        Class<ModalActivity> cls = ModalActivity.class;
        FragmentActivity fragmentActivity = this.A01;
        String A002 = C273654mx.A00(651);
        if (fragment != null) {
            DbS.A0b(fragmentActivity, A0a, userSession, cls, A002).A0D(fragment, 17465);
        } else {
            DbU.A0w(fragmentActivity, A0a, userSession, cls, A002);
        }
    }
}
