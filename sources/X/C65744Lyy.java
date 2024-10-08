package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lyy  reason: case insensitive filesystem */
public final class C65744Lyy implements C273414mX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MSE A03;
    public final /* synthetic */ AnonymousClass5w8 A04;
    public final /* synthetic */ String A05;

    public final void Cyf() {
    }

    public C65744Lyy(Context context, FragmentActivity fragmentActivity, UserSession userSession, MSE mse, AnonymousClass5w8 r5, String str) {
        this.A02 = userSession;
        this.A04 = r5;
        this.A05 = str;
        this.A03 = mse;
        this.A01 = fragmentActivity;
        this.A00 = context;
    }

    public final void Cyc() {
        String str;
        String str2;
        boolean z;
        C295095nZ A042;
        C295065nW r0;
        UserSession userSession = this.A02;
        AnonymousClass5w8 r2 = this.A04;
        C295095nZ A043 = r2.A04();
        C295085nY r1 = null;
        if (A043 == null || A043.A02 == null) {
            str = "";
        } else {
            C295095nZ A044 = r2.A04();
            if (A044 != null) {
                r0 = A044.A02;
            } else {
                r0 = null;
            }
            str = String.valueOf(r0);
        }
        C295095nZ A045 = r2.A04();
        if (A045 != null) {
            str2 = A045.A04;
        } else {
            str2 = null;
        }
        String str3 = this.A05;
        boolean A002 = C363558jv.A00(userSession);
        C295095nZ A046 = r2.A04();
        if (A046 != null) {
            z = A046.A05;
        } else {
            z = false;
        }
        C295095nZ A047 = r2.A04();
        if (A047 != null) {
            r1 = A047.A01;
        }
        C295105na.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", str, str2, str3, String.valueOf(r1), false, A002, z);
        C295095nZ A048 = r2.A04();
        if (A048 != null) {
            if (!A048.A00 && AnonymousClass5w9.A02(A048) && (A042 = r2.A04()) != null) {
                A042.A00 = true;
            }
            r2.A07(this.A00, str3);
        }
    }
}
