package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.FjQ  reason: case insensitive filesystem */
public final class C50846FjQ implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        HashMap hashMap;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("bloks_app_id");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("params");
            AnonymousClass6ST r2 = null;
            if (queryParameter2 != null) {
                try {
                    hashMap = F5I.A00(0c9.A04.A01(this.A01, queryParameter2));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                hashMap = null;
            }
            AnonymousClass4DH r3 = this.A00;
            FragmentActivity activity = r3.getActivity();
            if (activity != null) {
                r2 = DbV.A0h(activity);
                DbX.A15(activity, r2);
                AnonymousClass0fN.A00(r2);
            }
            C360678ey A05 = C359988do.A05(this.A01, queryParameter, hashMap);
            E86.A01(A05, r2, this, 13);
            r3.schedule(A05);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50846FjQ(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = (AnonymousClass4DH) fragment;
    }
}
