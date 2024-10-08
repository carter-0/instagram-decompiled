package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Fis  reason: case insensitive filesystem */
public final class C50812Fis implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public C50812Fis(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        HashMap A1E = AnonymousClass7TE.A1E();
        UserSession userSession = this.A01;
        A1E.put("target_user_id", userSession.A06);
        A1E.put("referer_type", "QuickPromotion");
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(45), A1E);
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbZ.A19(fragment, A0N, 2131952053);
        A0N.A0R = "account_transparency_bloks";
        C46649DiU.A07(requireActivity, A0N, A04);
    }
}
