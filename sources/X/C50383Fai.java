package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fai  reason: case insensitive filesystem */
public final class C50383Fai implements C51901G6v {
    public final Bundle A00;
    public final UserSession A01;

    public C50383Fai(Bundle bundle, UserSession userSession) {
        0qQ.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final boolean CWt() {
        1Av A002 = 1Au.A00(this.A01);
        return !AnonymousClass7TG.A1a(A002, A002.A2Y, 1Av.A8a, 392);
    }

    public final void CfS(FragmentActivity fragmentActivity) {
        Dbb.A1R(fragmentActivity);
        F9T.A00(this.A00, fragmentActivity, new E5E(), this.A01, C273654mx.A00(2150));
    }
}
