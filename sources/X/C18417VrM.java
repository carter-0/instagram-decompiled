package X;

import android.os.Bundle;

/* renamed from: X.VrM  reason: case insensitive filesystem */
public final class C18417VrM {
    public final /* synthetic */ C15331Uag A00;

    public C18417VrM(C15331Uag uag) {
        this.A00 = uag;
    }

    public static final void A00(C18417VrM vrM, String str) {
        Bundle bundle;
        C15331Uag uag = vrM.A00;
        AnonymousClass0eM r5 = uag.A0M;
        0lg A0X = DbT.A0X(r5);
        0Tu r4 = 0Tu.A05;
        boolean A06 = 182.A06(r4, A0X, 36320678701638418L);
        boolean A062 = 182.A06(r4, DbT.A0X(r5), 36321189802550431L);
        if (A06 || A062) {
            String str2 = null;
            if (A062 && (bundle = uag.mArguments) != null) {
                str2 = bundle.getString("ad_impression_client_token");
            }
            VRF vrf = uag.A07;
            if (vrf != null) {
                0Aj A0e = AnonymousClass7TE.A0e(vrf.A00, "ar_ads_camera_event");
                if (A0e.isSampled()) {
                    A0e.AAJ("effect_id", str);
                    DbS.A1J(A0e, "end_capture");
                    A0e.AAJ(AnonymousClass000.A00(1094), str2);
                    A0e.Cgf();
                    return;
                }
                return;
            }
            0qQ.A0F("igArAdsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
