package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Of4  reason: case insensitive filesystem */
public final class C71186Of4 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C71186Of4(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1aU EJG;
        1a8 r1;
        int i2;
        switch (this.A00) {
            case 0:
                String str = this.A03;
                C70860OOr.A01((1P0) this.A01, (UserSession) this.A02, str);
                return;
            case 1:
                Object obj = ((List) this.A01).get(i);
                C72536P9t p9t = (C72536P9t) this.A02;
                Activity activity = p9t.A00;
                if (JTT.A1Z(activity, obj, 2131960654)) {
                    EJG = C66580MXl.A0V(p9t.A08).BsD().AGK((C254743sy) C66580MXl.A0s(p9t.A09), this.A03);
                    r1 = p9t.A03;
                    i2 = 18;
                } else if (JTT.A1Z(activity, obj, 2131960256)) {
                    EJG = C66580MXl.A0V(p9t.A08).BsD().EJG((C254743sy) C66580MXl.A0s(p9t.A09), this.A03);
                    r1 = p9t.A03;
                    i2 = 19;
                } else if (JTT.A1Z(activity, obj, 2131971293)) {
                    FGP.A01(activity, BugReportSource.DIRECT_SEND_FAILURE, p9t.A04, AnonymousClass7TE.A16(activity, 2131971293), AnonymousClass7TE.A16(activity, 2131954333));
                    return;
                } else {
                    return;
                }
                PU8.A00(EJG, r1, p9t, i2);
                return;
            case 2:
                OVU ovu = (OVU) this.A02;
                UserSession userSession = ovu.A05;
                String str2 = this.A03;
                User user = (User) this.A01;
                C66671Mae.A0J(userSession, str2, user.getId());
                OLT olt = ovu.A01;
                if (olt != null) {
                    olt.A00(user);
                }
                ovu.A07.remove(user);
                OVU.A00(ovu);
                ovu.A01();
                ovu.A06.A02();
                0qQ.A07(Collections.singletonList(user.getId()));
                return;
            default:
                PA3 pa3 = (PA3) this.A02;
                C254743sy r12 = (C254743sy) pa3.A07.get();
                if (r12 instanceof DirectThreadKey) {
                    UserSession userSession2 = pa3.A01;
                    String A09 = C66647MaG.A09(r12);
                    if (A09 != null) {
                        1OC A0A = DirectThreadApi.A0A(userSession2, A09, String.valueOf(this.A01), this.A03);
                        1ES.A05(A0A, A0A.A04.runnableId, 2, false, false);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
        }
    }
}
