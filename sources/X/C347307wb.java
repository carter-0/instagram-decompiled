package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7wb  reason: invalid class name and case insensitive filesystem */
public final class C347307wb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass89T A01;

    public C347307wb(AnonymousClass89T r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A00(Throwable th) {
        AnonymousClass89T r5 = this.A01;
        05G r2 = r5.A04;
        if (!(r2.getValue() instanceof C239793Ih)) {
            r2.Epw(new C297815sO(C60340gF.A00));
        }
        if (r5.A0A) {
            05G r22 = r5.A06;
            if (!(r22.getValue() instanceof C239793Ih)) {
                r22.Epw(new C297815sO(C60340gF.A00));
            }
        }
        UserSession userSession = r5.A03;
        int i = this.A00;
        String valueOf = String.valueOf(th);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(valueOf, 2);
        02m.A0p.markerAnnotate(383656871, i, "error_reason", valueOf);
        C347207wR.A02(i, 97);
        r5.A01 = false;
    }
}
