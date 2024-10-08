package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.IWa  reason: case insensitive filesystem */
public final class C57291IWa implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public C57291IWa(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "TEMPLATE_BROWSER_ENTRY_POINT_DEEPLINK");
        UserSession userSession = this.A01;
        AnonymousClass4DH r0 = this.A00;
        C55253Hei.A00(r0.requireActivity(), r0.requireContext(), A0a, userSession);
    }
}
