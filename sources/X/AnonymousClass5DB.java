package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.5DB  reason: invalid class name */
public final class AnonymousClass5DB implements AnonymousClass1cS {
    public final 1Ng A00;

    public AnonymousClass5DB(1Ng r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void DTJ(1OS r1, C74248Prc prc) {
    }

    public final void DTN(1OS r1, C74248Prc prc) {
    }

    public final void DTO(1OS r5, C74248Prc prc, C74248Prc prc2) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(prc2, 2);
        C66656MaP maP = (C66656MaP) prc2;
        String str = maP.A02;
        if ("upload_failed_transient".equals(str) || "upload_failed_permanent".equals(str)) {
            C270214gN r0 = maP.A01;
            if (r0 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (!r0.A0A) {
            } else {
                if (r5 instanceof 1bp) {
                    List<DirectThreadKey> C6L = ((1bp) r5).C6L();
                    0qQ.A07(C6L);
                    for (DirectThreadKey directThreadKey : C6L) {
                        1Ng r1 = this.A00;
                        0qQ.A0A(directThreadKey);
                        r1.A00(new C330827Ok(directThreadKey));
                    }
                } else if (r5 instanceof AnonymousClass1c5) {
                    1Ng r2 = this.A00;
                    DirectThreadKey C6K = ((AnonymousClass1c5) r5).C6K();
                    0qQ.A07(C6K);
                    r2.A00(new C330827Ok(C6K));
                }
            }
        }
    }
}
