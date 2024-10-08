package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class ES7 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DataSaverOptionsFragment";
    public UserSession A00;
    public C70966OTn A01;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957400);
    }

    public final String getModuleName() {
        return "data_saver_options";
    }

    public static final void A06(ES7 es7, boolean z) {
        C70966OTn oTn = es7.A01;
        if (oTn != null) {
            oTn.A05 = z;
            2Rw AZK = es7.getScrollingViewProxy().AZK();
            if (AZK != null) {
                AZK.notifyDataSetChanged();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1623371727);
        super.onCreate(bundle);
        this.A00 = DbX.A0V(this);
        AnonymousClass0fD.A09(985407814, A02);
    }

    public final void onResume() {
        int i;
        int A02 = AnonymousClass0fD.A02(1601501263);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A00;
        if (userSession != null) {
            1Av A002 = 1Au.A00(userSession);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                boolean A012 = 1Q3.A00(userSession2).A01();
                C46448DfA.A02(A1C, 2131957407);
                C70966OTn oTn = new C70966OTn((CharSequence) getString(2131957406), (View.OnClickListener) FP4.A00(this, 4));
                this.A01 = oTn;
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    int A003 = 1Q3.A00(userSession3).A00();
                    if (A003 == 0) {
                        i = 2131957401;
                    } else if (A003 == 1) {
                        i = 2131957405;
                    } else if (A003 == 2) {
                        i = 2131957404;
                    } else {
                        throw AnonymousClass7TE.A0w("Unrecognized network setting");
                    }
                    oTn.A03 = getString(i);
                    A06(this, !A012);
                    A1C.add(DbS.A0f(new FQ1(14, A002, this), 2131957402, A012));
                    FGF.A00(this, A1C, 2131957403);
                    A1C.add(this.A01);
                    if (DbY.A1Y(0Tu.A05, this.A00, 36316108856233932L)) {
                        boolean A1z = A002.A1z();
                        C46448DfA.A02(A1C, 2131963402);
                        A1C.add(DbS.A0f(new FQ1(15, A002, this), 2131963401, A1z));
                        FGF.A01(A1C, 2131963400);
                    }
                    setItems(A1C);
                    AnonymousClass0fD.A09(1684619959, A02);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }
}
