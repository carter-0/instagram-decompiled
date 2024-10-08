package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ias  reason: case insensitive filesystem */
public final class C57448Ias implements C59555JOb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57448Ias(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DJA(AnonymousClass3WA r7) {
        UserSession userSession;
        1Xj BPf;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            userSession = ((C52033GCf) this.A02).A0A;
            BPf = (1Xj) this.A01;
            if (BPf.getId() != null) {
                z = false;
                z2 = true;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            userSession = ((I9I) this.A02).A02;
            MXT mxt = (MXT) this.A01;
            BPf = mxt.BPf();
            boolean A1V = AnonymousClass7TF.A1V(mxt.Ahy());
            String id = mxt.getId();
            if (id != null) {
                z = false;
                z2 = true;
                if (A1V) {
                    C278164wN.A00(userSession).A01(id, true);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        1sd.A00(userSession).A03(BPf, z2, z);
    }
}
