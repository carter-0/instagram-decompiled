package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public final class EFL extends C228042kh {
    public final Application A00;
    public final 0wc A01;
    public final boolean A02;

    public EFL(Application application, 0wc r2, boolean z) {
        this.A00 = application;
        this.A01 = r2;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        String A012 = AnonymousClass1Q2.A01();
        if (A012 == null || 00l.A0W(A012)) {
            Locale A03 = AnonymousClass1Q2.A03();
            A012 = 002.A0T(A03.getLanguage(), A03.getCountry(), '-');
        }
        Application application = this.A00;
        boolean z = this.A02;
        C51566FwC fwC = new C51566FwC((Object) application, 7);
        ArrayList A1D = AnonymousClass7TE.A1D(FEP.A01);
        if (z) {
            A1D.add(new C47271Dtz("fb-HA", AnonymousClass1Q2.A00, 2131968441, 2131964603));
        }
        Collections.sort(A1D, fwC);
        return new C46731DkK(application, this.A01, A012, A1D, AnonymousClass1Q2.A03());
    }
}
