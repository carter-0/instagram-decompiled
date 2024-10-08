package X;

import android.os.Bundle;
import android.view.View;

public final class HHB extends H08 {
    public static final String __redex_internal_original_name = "WallUserMediaPickerFragment";
    public final X41 A00 = IRR.A00;
    public final AnonymousClass0eM A01;
    public final C15812Uiv[] A02 = {new C14386TvF(C14411Tvf.ONE_BY_ONE)};

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.HHB, X.H08, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14227TsA tsA = this.A00;
        if (tsA != null) {
            tsA.A07 = this.A02;
            C14074TpO A012 = A01();
            A012.A05(view, false);
            C3251871j r0 = A012.A05;
            if (r0 != null) {
                r0.A05 = true;
            }
            A012.A06(new ISY(this, 3));
            A04(true);
            C51975G9x.A1E(this.A01.getValue(), this, DbW.A0E(this), 20);
            return;
        }
        0qQ.A0F("gridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public HHB() {
        C58686Ivv A002 = C58686Ivv.A00(this, 5);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C58686Ivv.A00(C58686Ivv.A00(this, 6), 7));
        this.A01 = DbS.A0I(C58686Ivv.A00(A003, 8), A002, C58687Ivw.A00((Object) null, A003, 5), DbS.A0z(HHE.class));
    }
}
