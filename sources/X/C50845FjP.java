package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjP  reason: case insensitive filesystem */
public final class C50845FjP implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("product");
        String queryParameter2 = uri.getQueryParameter("created_deal_id");
        String queryParameter3 = uri.getQueryParameter("fe_id");
        F6T.A01((Fragment) null, this.A00, C272504kq.A00(queryParameter), this.A01, "ResumePayoutOnboardingActionHandler", "QP", queryParameter2, queryParameter3, (String) null);
    }

    public C50845FjP(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
