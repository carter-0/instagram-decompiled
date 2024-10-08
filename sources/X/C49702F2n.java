package X;

import android.app.Activity;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.F2n  reason: case insensitive filesystem */
public final class C49702F2n {
    public Activity A00;
    public EditText A01;
    public TextView A02;
    public 0lg A03;
    public CountryCodeData A04;
    public C46634DiE A05;
    public PhoneNumberFormattingTextWatcher A06;

    public final void A01() {
        EditText editText = this.A01;
        editText.removeTextChangedListener(this.A06);
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(this.A04.A00);
        this.A06 = phoneNumberFormattingTextWatcher;
        editText.addTextChangedListener(phoneNumberFormattingTextWatcher);
    }

    public static void A00(C49702F2n f2n, Integer num, String str, String str2, String str3, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        Activity activity = f2n.A00;
        CountryCodeData countryCodeData = f2n.A04;
        0lg r3 = f2n.A03;
        C46634DiE diE = f2n.A05;
        AnonymousClass7TG.A1U(activity, r3, diE);
        String A012 = C49897FCa.A01(activity, countryCodeData, str3, (String) null, FH2.A04(activity, r3, diE, FH2.A05(num)), C49898FCb.A02(activity, r3, num));
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3), "prefill_phone_number");
        double d = (double) currentTimeMillis;
        DbY.A1D(A0e, d, DbS.A00());
        DbZ.A1J(A0e, diE.A01);
        DbW.A13(A0e, d);
        A0e.A7p("is_valid", Boolean.valueOf(z));
        A0e.AAJ("phone_num_source", str2);
        0qQ.A0B(activity, 0);
        A0e.A7p("found_contacts_me_phone", Boolean.valueOf(AnonymousClass7TF.A1V(FH2.A03(activity))));
        A0e.AAJ("available_prefills", A012);
        A0e.AAJ("error", str);
        A0e.Cgf();
    }
}
