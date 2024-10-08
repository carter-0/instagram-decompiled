package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ntc  reason: case insensitive filesystem */
public abstract class C69874Ntc {
    public static final boolean A00(Activity activity, UserSession userSession, C254743sy r10) {
        AnonymousClass3U9 A03;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, activity);
        if (r10 != null) {
            if (C66647MaG.A0F(r10)) {
                2Dr A00 = 1bJ.A00(userSession);
                DirectThreadKey A04 = C66647MaG.A04(r10);
                if (!(A04 == null || (A03 = 2Dr.A03(A00, A04)) == null)) {
                    if (A03.C6a() == 29 && !A03.COP()) {
                        String C6C = A03.C6C();
                        String C6k = A03.C6k();
                        int AdN = A03.AdN();
                        C47830EJc eJc = new C47830EJc();
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
                        A0a.putString("thread_v2_id", C6k);
                        A0a.putInt("audience_type", AdN);
                        eJc.setArguments(A0a);
                        Bundle A08 = DbY.A08(eJc);
                        DbU.A1D(A08, userSession);
                        C331127Pr A0V = DbV.A0V(A08, eJc, userSession);
                        A0V.A1G = A1U;
                        A0V.A03 = 0.75f;
                        A0V.A1O = A1U;
                        A0V.A17 = A1U;
                        DbU.A0y(activity, eJc, A0V);
                    }
                }
            }
            return A1U;
        }
        return false;
    }
}
