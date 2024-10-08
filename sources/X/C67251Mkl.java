package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* renamed from: X.Mkl  reason: case insensitive filesystem */
public final class C67251Mkl implements C74395PuB {
    public final UserSession A00;
    public final C67106MiQ A01;
    public final C67247Mkh A02;

    public final void Cqe(C67058MhZ mhZ, C254743sy r9, Integer num, Integer num2, String str, List list) {
        0qQ.A0B(r9, 0);
        this.A01.Cqe(mhZ, r9, (Integer) null, (Integer) null, str, list);
    }

    public final void Cqi(C67058MhZ mhZ, C254743sy r8, Integer num, String str, int i) {
        C67106MiQ miQ;
        C254743sy r2 = r8;
        C67058MhZ mhZ2 = mhZ;
        Integer num2 = num;
        int i2 = i;
        if (r8 instanceof DirectThreadKey) {
            miQ = this.A01;
        } else if (r8 instanceof MsysThreadId) {
            C67247Mkh.A00(mhZ, this.A02, r8, num);
            return;
        } else if (r8 instanceof DirectMsysMixedThreadKey) {
            miQ = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miQ.Cqi(mhZ2, r2, num2, "inbox", i2);
    }

    public C67251Mkl(UserSession userSession, C67106MiQ miQ, C67247Mkh mkh) {
        AnonymousClass7TG.A1O(miQ, mkh);
        this.A01 = miQ;
        this.A02 = mkh;
        this.A00 = userSession;
    }
}
