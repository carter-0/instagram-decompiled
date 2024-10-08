package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Weo  reason: case insensitive filesystem */
public final class C19747Weo implements MT5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19747Weo(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D1Y(View view, boolean z) {
        U5O u5o;
        if (this.A00 == 0) {
            C15274UZc uZc = (C15274UZc) this.A03;
            PromoteData promoteData = uZc.A0A;
            if (promoteData != null) {
                boolean z2 = true;
                if ((promoteData.A2u || promoteData.A2o) && uZc.A0F) {
                    u5o = (U5O) this.A02;
                    u5o.A05(true);
                } else {
                    u5o = (U5O) this.A02;
                    u5o.A05(z);
                }
                PromoteData promoteData2 = uZc.A0A;
                if (promoteData2 != null) {
                    promoteData2.A2H = true;
                    if (!z || ((!promoteData2.A2o && !promoteData2.A2u) || uZc.A0F)) {
                        z2 = false;
                    }
                    u5o.A06(z2);
                    if (z) {
                        uZc.A04 = XIGIGBoostDestination.WHATSAPP_MESSAGE;
                        C15274UZc.A02(uZc);
                        C15274UZc.A00((View) this.A01, uZc);
                    }
                    if (182.A06(0Tu.A05, DbY.A0R(uZc.A0J), 36326880634222635L)) {
                        u5o.A03(z);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        } else if (z) {
            C15273UZb uZb = (C15273UZb) this.A03;
            uZb.A00 = (XIGIGBoostCallToAction) this.A01;
            C15273UZb.A00(uZb);
            C13989Tnp.A1A((View) this.A02, C13991Tnr.A07(uZb.requireContext()));
        }
    }
}
