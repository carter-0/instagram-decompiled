package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qh8  reason: case insensitive filesystem */
public final class C8116Qh8 extends QDP implements C13603TdV {
    public 2Fk A00;
    public C8115Qh7 A01;
    public LoggingData A02;
    public String A03;
    public List A04;
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final C319836rJ A06;

    public C8116Qh8(C319836rJ r4) {
        0qQ.A0B(r4, 1);
        this.A06 = r4;
        r4.A04.put("fe_selector_financial_entity", new C11759Sfv(this, 0));
    }

    public final void CMl(C8115Qh7 qh7) {
        this.A01 = qh7;
        C11426STk.A04();
        this.A00 = AnonymousClass72Y.A01(this.A05, new C58736Iwj(3, this, false));
    }

    public final void A0C(Bundle bundle) {
        Parcelable parcelable;
        Object A012;
        LoggingData loggingData;
        super.A0C(bundle);
        ArrayList A022 = C11405SSc.A02(bundle);
        if (A022 != null) {
            this.A04 = A022;
            Bundle bundle2 = (Bundle) this.A06.A00("fe_selector_financial_entity");
            if (bundle2 == null) {
                bundle2 = bundle;
            }
            AnonymousClass2Fj r1 = this.A05;
            if (bundle2 == null || (parcelable = bundle2.getParcelable("financial_entity")) == null || (A012 = C11405SSc.A01(parcelable)) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            r1.A0B(A012);
            if (bundle == null || (loggingData = (LoggingData) bundle.getParcelable("logging_data")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A02 = loggingData;
            String string = bundle.getString("parent_view_name");
            if (string != null) {
                this.A03 = string;
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
