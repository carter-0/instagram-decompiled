package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.Pbz  reason: case insensitive filesystem */
public final class C73402Pbz implements Runnable {
    public final /* synthetic */ C72521P9e A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ MessageIdentifier A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public C73402Pbz(C72521P9e p9e, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, String str, List list, boolean z) {
        this.A00 = p9e;
        this.A03 = str;
        this.A01 = directThreadKey;
        this.A04 = list;
        this.A02 = messageIdentifier;
        this.A05 = z;
    }

    public final void run() {
        C14068TpH tpH;
        C72521P9e p9e = this.A00;
        UserSession userSession = p9e.A02;
        Activity activity = p9e.A00;
        AnonymousClass0iw r7 = p9e.A01;
        String str = this.A03;
        if (str != null) {
            String str2 = this.A01.A00;
            if (str2 != null) {
                List list = this.A04;
                String str3 = this.A02.A01;
                boolean z = this.A05;
                C70453O7e o7e = (C70453O7e) p9e.A07.getValue();
                if (C71128OdR.A06(userSession, str2)) {
                    tpH = C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_INSTAMADILLO;
                } else {
                    tpH = C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_VANISH;
                }
                C71128OdR.A01(activity, r7, userSession, o7e, tpH, C16677UzD.ENCRYPTED_DIRECT_MESSAGE, new C69236Nhq(activity, o7e, 1), (Long) null, str, str3, "DUMMY", str2, (String) null, (String) null, (String) null, list, false, true, z);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
