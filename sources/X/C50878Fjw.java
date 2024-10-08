package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fjw  reason: case insensitive filesystem */
public final class C50878Fjw implements G6H {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r0 = this.A01;
        C49857F9x.A00(new C49857F9x(r0, userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, "welcome_message_settings_qp_setup_button_click", "source_qp", (String) null);
        C48834Ekw.A00(r0, userSession).A00();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "inbox_qp");
        Fragment fragment = this.A00;
        DbT.A1L(fragment, DbS.A0b(fragment.requireActivity(), A0a, userSession, ModalActivity.class, "direct_greeting_setting_fragment"));
    }

    public C50878Fjw(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
