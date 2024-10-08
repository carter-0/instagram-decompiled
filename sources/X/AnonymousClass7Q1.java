package X;

import android.telephony.PhoneNumberUtils;

/* renamed from: X.7Q1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q1 implements 0sP {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ AnonymousClass7Q1(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        C329067Hl r3 = this.A00;
        String str3 = (String) obj;
        C329857Km r2 = r3.A0L;
        if (r2 == null) {
            return null;
        }
        if (str3 != null) {
            str = new 11S("\\D").A00(str3, "");
        } else {
            str = null;
        }
        r2.A01 = str;
        C329857Km r1 = r3.A0L;
        if (str3 != null) {
            str2 = PhoneNumberUtils.formatNumber(str3, AnonymousClass1Q2.A02().getCountry());
        } else {
            str2 = null;
        }
        r1.A02 = str2;
        return null;
    }
}
