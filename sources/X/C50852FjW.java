package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjW  reason: case insensitive filesystem */
public final class C50852FjW implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
        A0M.A0E = true;
        FC8.A00();
        E42 e42 = new E42();
        Bundle A0B = DbY.A0B("origin", "QP");
        C227642jf.A04(A0B, userSession);
        e42.setArguments(A0B);
        A0M.A0D(e42);
        A0M.A04();
    }

    public C50852FjW(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
