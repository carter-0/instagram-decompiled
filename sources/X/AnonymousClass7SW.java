package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.7SW  reason: invalid class name */
public final class AnonymousClass7SW implements AnonymousClass7SX {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public final void Csz() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D8D(C254743sy r2, Integer num, boolean z, boolean z2) {
        0qQ.A0B(num, 3);
        AnonymousClass9H7.A01(this.A00).A0L().D8D(r2, num, z, z2);
    }

    public final void DKM(C391629tO r12, 2Er r13) {
        String str;
        C391629tO r2 = r12;
        0qQ.A0B(r12, 1);
        User BSJ = r13.BSJ();
        if (BSJ != null) {
            str = BSJ.getId();
        } else {
            str = null;
        }
        AnonymousClass9H7 r1 = this.A00;
        boolean CUG = r13.CUG();
        AnonymousClass4DU r4 = r1.A1Q;
        0qQ.A0B(r4, 6);
        C3265677h.A05(r2, (C391549tG) null, r4, r1.A10, str, r13.C6C(), 1, r1.A0b instanceof MsysThreadId, CUG);
    }

    public AnonymousClass7SW(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final void Ct0(2Er r12) {
        String str;
        AnonymousClass9H7 r1 = this.A00;
        boolean z = r1.A0b instanceof MsysThreadId;
        User BSJ = r12.BSJ();
        String str2 = null;
        if (BSJ != null) {
            str = BSJ.getId();
        } else {
            str = null;
        }
        UserSession userSession = r1.A10;
        C391629tO r2 = C391629tO.A0I;
        if (!z) {
            str2 = r12.C6C();
        }
        boolean CUG = r12.CUG();
        AnonymousClass4DU r4 = r1.A1Q;
        0qQ.A0B(r4, 6);
        C3265677h.A05(r2, (C391549tG) null, r4, userSession, str, str2, 4, z, CUG);
        AnonymousClass9H7.A01(r1).A0L().Ct0(r12);
    }

    public final void CyM(User user) {
        AnonymousClass9H7.A01(this.A00).A0L().CyM(user);
    }

    public final void DNG(C254743sy r2) {
        AnonymousClass9H7.A01(this.A00).A0L().DNG(r2);
    }

    public final void De4(String str) {
        AnonymousClass9H7.A01(this.A00).A0L().De4(str);
    }
}
