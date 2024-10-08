package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fij  reason: case insensitive filesystem */
public final class C50803Fij implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50803Fij(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0A = DbY.A0A(uri);
        String queryParameter = uri.getQueryParameter("scroll_to_auto_save");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String A0j = AnonymousClass7TF.A0j(queryParameter);
        int length = A0j.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(A0j, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        A0A.putBoolean("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS", "true".equals(Dba.A0c(A0j, length, i)));
        DbU.A0w(this.A00, A0A, this.A01, ModalActivity.class, "reel_settings");
    }
}
