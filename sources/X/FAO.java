package X;

import android.app.Activity;
import android.widget.AutoCompleteTextView;
import com.instagram.phonenumber.model.CountryCodeData;

public final class FAO {
    public final Activity A00;
    public final AutoCompleteTextView A01;
    public final 0lg A02;
    public final C46634DiE A03;

    public FAO(Activity activity, AutoCompleteTextView autoCompleteTextView, 0lg r3, C46634DiE diE) {
        AnonymousClass7TG.A1U(r3, activity, autoCompleteTextView);
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = autoCompleteTextView;
        this.A03 = diE;
    }

    public static final void A00(FAO fao, Integer num, String str, String str2, String str3, int i, boolean z) {
        double A012 = DbS.A01();
        double A002 = DbS.A00();
        0lg r5 = fao.A02;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "email_field_prefilled");
        Dbc.A0Y(A0e, A012, A002);
        C46634DiE diE = fao.A03;
        Dbc.A0c(A0e, "step", "email", A002);
        DbW.A13(A0e, A012);
        A0e.A7p("is_valid", Boolean.valueOf(z));
        A0e.A9F("avail_emails", DbV.A0p(A0e, "source", str2, i));
        FH8.A05(A0e);
        Activity activity = fao.A00;
        CountryCodeData A003 = C3270479e.A00(activity);
        AnonymousClass7TG.A1U(activity, r5, diE);
        A0e.AAJ("available_prefills", C49897FCa.A01(activity, A003, (String) null, str3, FH2.A04(activity, r5, diE, FH2.A05(num)), C49898FCb.A02(activity, r5, num)));
        if (str.length() != 0) {
            A0e.AAJ("error", str);
        }
        A0e.Cgf();
    }
}
