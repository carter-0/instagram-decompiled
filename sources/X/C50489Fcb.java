package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Fcb  reason: case insensitive filesystem */
public final class C50489Fcb implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C50489Fcb(Context context, C70742OJn oJn, C254783t2 r3, String str, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A04 = str;
        this.A02 = oJn;
        this.A03 = r3;
    }

    public final void onClick() {
        String str;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                0nC.A01(context, this.A04, Dbb.A0T());
                ((C70742OJn) this.A02).A00((C254783t2) this.A03, "COPY");
                C59689JTv.A07(context, 2131956742);
                return;
            case 1:
                Context context2 = (Context) this.A01;
                String str2 = this.A04;
                CountryCodeData A002 = C3270479e.A00(context2);
                PhoneNumberUtil A012 = PhoneNumberUtil.A01(context2);
                try {
                    str = 002.A0g("http://wa.me/", A012.A0I(A012.A0F(str2, A002.A00), AnonymousClass05K.A00), "?source_surface=7");
                } catch (C231962sh unused) {
                    str = 002.A0g("http://wa.me/", str2, "?source_surface=7");
                }
                if (0oI.A0G(context2)) {
                    FH7.A02(context2, str);
                } else {
                    0oI.A07(context2, "com.whatsapp", "ig%26utm_campaign%3Dig_thread_pn");
                }
                ((C70742OJn) this.A02).A00((C254783t2) this.A03, "WHATSAPP_MESSAGE");
                return;
            default:
                return;
        }
    }
}
