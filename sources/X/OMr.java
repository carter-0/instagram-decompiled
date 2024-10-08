package X;

import android.content.Context;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class OMr {
    public C70398O5a A00;
    public final Context A01;
    public final UserSession A02;
    public final C18663VwL A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C73905Plg.A00(this, 4));
    public final C62320sa A05;

    public OMr(Context context, UserSession userSession, C18663VwL vwL, C62320sa r5) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = vwL;
        this.A05 = r5;
    }

    public final boolean A01(List list, float f, boolean z) {
        List<LatLng> list2 = list;
        0qQ.A0B(list2, 0);
        if (!z && this.A03.A01() >= 19.0f) {
            return false;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (LatLng latLng : list2) {
            A0r.add(new C17367VSu(latLng.A00, latLng.A01));
        }
        if (list2.size() == 1) {
            LatLng latLng2 = (LatLng) 00k.A0J(list2);
            if (latLng2 == null) {
                return true;
            }
            A00(latLng2.A00, latLng2.A01, 17.5f, true);
            return true;
        }
        C18663VwL vwL = this.A03;
        Context context = this.A01;
        vwL.A0F(A0r, C61380mr.A00(context, f), C67587MqL.A02(context), C67587MqL.A01(context), AnonymousClass3HF.A00(this.A02), true);
        return true;
    }

    public final void A00(double d, double d2, float f, boolean z) {
        C18663VwL vwL = this.A03;
        vwL.A0C(d, d2, f, (int) (((float) AnonymousClass3HF.A00(this.A02)) * AnonymousClass7TE.A04(C229632nm.A09(Float.valueOf((vwL.A01() - f) / 10.0f), new C52395GQu(0.4f, 1.0f)))), z);
    }
}
