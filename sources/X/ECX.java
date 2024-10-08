package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class ECX extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ De1 A02;
    public final /* synthetic */ C46394DeH A03;

    public ECX(Context context, UserSession userSession, De1 de1, C46394DeH deH) {
        this.A01 = userSession;
        this.A03 = deH;
        this.A00 = context;
        this.A02 = de1;
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(251608743);
        UserSession userSession = this.A01;
        FEF.A00(userSession, "badge_fetch_failed", "");
        02m.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_start");
        C46394DeH.A00(this.A00, userSession, this.A02, false);
        AnonymousClass0fD.A0A(1823575242, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(586338395);
        02m.A0p.markerPoint(962534132, "pro_dash_badge_api_end");
        AnonymousClass0fD.A0A(1109597575, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A032 = AnonymousClass0fD.A03(399463603);
        CDJ cdj = (CDJ) obj;
        int A0D = AnonymousClass7TG.A0D(cdj, -96742848);
        if (cdj.mFromDiskCache) {
            z = false;
        } else {
            C41882B5a b5a = cdj.A00;
            if (b5a == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            z = b5a.A00;
        }
        UserSession userSession = this.A01;
        02m.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_start");
        C46394DeH.A00(this.A00, userSession, this.A02, z);
        AnonymousClass0fD.A0A(-440336578, A0D);
        AnonymousClass0fD.A0A(-155141062, A032);
    }
}
