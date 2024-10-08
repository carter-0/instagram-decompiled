package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

public final class PFZ implements C51871G5i {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public PFZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj;
        this.A01 = obj2;
        this.A03 = obj5;
    }

    public final void D6I() {
        switch (this.A00) {
            case 0:
                RectF rectF = (RectF) this.A04;
                if (rectF != null) {
                    C66633Ma2.A0C(rectF, (C66633Ma2) this.A05, (AnonymousClass7SD) this.A01, (AnonymousClass2Ep) null, (DirectShareTarget) this.A02, (C254743sy) this.A03);
                    return;
                }
                return;
            case 1:
                C66633Ma2 ma2 = (C66633Ma2) this.A05;
                UserSession A0p = ma2.A0p();
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
                if (directShareTarget != null) {
                    C66633Ma2.A0A((RectF) this.A04, (28D) this.A01, ma2, C71046OaO.A03(A0p, directShareTarget), (C254743sy) this.A03);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                C67106MiQ.A00((C67058MhZ) this.A03, (C67106MiQ) this.A02, (DirectThreadKey) this.A01, (Integer) this.A05, (Integer) this.A04);
                return;
        }
    }
}
