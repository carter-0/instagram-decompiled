package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class GUF implements C46200DQc {
    public final Fragment A00;
    public final UserSession A01;

    public GUF(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final void Cvg(1Xj r6, AnonymousClass3W1 r7) {
        HashMap A1E = AnonymousClass7TE.A1E();
        String A2n = r6.A2n();
        if (A2n != null) {
            A1E.put("media_id", A2n);
            AppInstallCTAInfoIntf Ac6 = r6.A0C.Ac6();
            if (Ac6 != null) {
                String Abd = Ac6.Abd();
                A1E.put(AnonymousClass000.A00(505), Abd);
                if (DbV.A12(Abd).length() > 0) {
                    FH7.A03(this.A00.requireActivity(), 002.A0R(Pxd.A00(763), Ac6.Abd()));
                }
            }
            JVF.A05(this.A00, this.A01, AnonymousClass05K.A08, A1E);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
