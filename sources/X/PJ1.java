package X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class PJ1 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Object obj;
        0qQ.A0B(uri, 0);
        if (bundle != null) {
            obj = bundle.get("target_thread_id");
        } else {
            obj = null;
        }
        String str = (String) obj;
        String queryParameter = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if ((str != null && str.length() != 0) || (queryParameter != null && queryParameter.length() != 0)) {
            UserSession userSession = this.A01;
            2Dm A002 = 2L2.A00(userSession);
            if (str == null) {
                if (queryParameter != null) {
                    str = queryParameter;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            AnonymousClass3U9 A0d = C66580MXl.A0d(A002, str);
            if (A0d != null) {
                String C6C = A0d.C6C();
                if (C6C != null) {
                    C66671Mae.A0I(userSession, C6C, A0d.C6a(), false);
                    A002.Efk(A0d, true);
                }
                C66581MXm.A1L(A0d, A002);
                Resources resources = this.A00.getResources();
                C310336ap A0a = DbS.A0a();
                DbT.A1D(resources, A0a, 2131958755);
                A0a.A02();
                A0a.A07(R.drawable.instagram_pin_pano_filled_24);
                DbY.A1N(A0a);
            }
        }
    }

    public PJ1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
