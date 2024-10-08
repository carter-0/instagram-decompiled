package X;

import android.view.View;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.PIx  reason: case insensitive filesystem */
public final class C72761PIx implements C71202bS {
    public final int A00;
    public final Object A01;

    public C72761PIx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void AHF() {
        switch (this.A00) {
            case 0:
                AnonymousClass7VP r2 = (AnonymousClass7VP) this.A01;
                AnonymousClass7FA r1 = (AnonymousClass7FA) r2.A0C.invoke();
                if (r1 != null) {
                    r1.A03((View) null);
                }
                r2.A06.A00();
                C322106vG.A00((C322106vG) r2.A09.getValue());
                return;
            case 1:
                C66633Ma2 ma2 = (C66633Ma2) this.A01;
                C66736Mbh A0U = C66581MXm.A0U(ma2);
                C67141Miz miz = A0U.A0E;
                AnonymousClass2bO.A00();
                miz.A02 = null;
                C66736Mbh.A03(A0U);
                C66633Ma2.A0b(ma2, ma2.A1C);
                return;
            default:
                C71874OsH A02 = ((DirectSearchInboxFragment) this.A01).A02();
                if (A02 != null) {
                    C72918PPc pPc = A02.A02;
                    AnonymousClass2bO.A00();
                    pPc.A00 = null;
                    C337257fy r0 = A02.A04;
                    if (r0 != null) {
                        pPc.Dam(r0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
