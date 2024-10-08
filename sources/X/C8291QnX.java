package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QnX  reason: case insensitive filesystem */
public final class C8291QnX extends C2818659w {
    public final C11246SHg A00;
    public final AnonymousClass5A3 A01;
    public final C11214SFo A02;
    public final AtomicReference A03 = new AtomicReference();

    public final void A9U(AnonymousClass5A7 r2) {
        0qQ.A0B(r2, 0);
        super.A9U(r2);
        Object obj = this.A03.get();
        if (obj != null) {
            r2.DvN(obj);
        }
    }

    public C8291QnX(C11246SHg sHg, AnonymousClass5A3 r12, C11214SFo sFo) {
        String A0R;
        this.A01 = r12;
        this.A02 = sFo;
        this.A00 = sHg;
        C11246SHg sHg2 = this.A00;
        C11214SFo sFo2 = this.A02;
        Object obj = sFo2.A01;
        String str = sFo2.A02;
        Set<C11330SNj> set = sFo2.A09;
        HashSet A1F = AnonymousClass7TE.A1F();
        for (C11330SNj sNj : set) {
            if (sNj.A00 == AnonymousClass05K.A00) {
                A0R = sNj.A05;
            } else {
                A0R = 002.A0R("RSA::", sNj.A05);
            }
            A1F.add(A0R);
        }
        sHg2.A01(new C12488SvK(this), obj, str, A1F, this.A01.A00.A02);
    }
}
