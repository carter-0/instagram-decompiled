package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fcs  reason: case insensitive filesystem */
public final class C50506Fcs implements C66491MTu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void onDismiss() {
    }

    public C50506Fcs(UserSession userSession, String str, String str2, String str3, String str4) {
        this.A00 = userSession;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    public final void D1x(Context context) {
        UserSession userSession = this.A00;
        FragmentActivity A06 = 2MD.A01().A06();
        if (A06 != null) {
            LTV.A0A(A06, userSession, this.A01, this.A03, this.A04, this.A02, false);
        }
    }
}
