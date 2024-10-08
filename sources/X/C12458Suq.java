package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.auth.models.PttPayload;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.Suq  reason: case insensitive filesystem */
public final class C12458Suq implements C13735Tg7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C12458Suq(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj;
    }

    public final void Cwz(Throwable th) {
        AnonymousClass2gB r1;
        int i = this.A00;
        QDE qde = (QDE) this.A01;
        if (i != 0) {
            r1 = qde.A04;
        } else {
            r1 = qde.A03;
        }
        r1.A0A(SUj.A0B(th));
    }

    public final void Cx0(C10586Rug rug) {
        String str;
        C10586Rug rug2 = rug;
        if (this.A00 != 0) {
            Bundle bundle = rug2.A00;
            if (bundle == null || !bundle.getBoolean("AUTH_FLOW_UTIL_HAVE_ASKED_FOR_BIO_SETUP", false)) {
                QDE qde = (QDE) this.A01;
                C11330SNj sNj = rug2.A01;
                String str2 = this.A03;
                String str3 = this.A04;
                Bundle bundle2 = (Bundle) this.A02;
                AnonymousClass2gB r3 = qde.A04;
                r3.A0A(SUj.A08((Object) null));
                int A032 = qde.A01.A03(15);
                if (A032 != 0) {
                    r3.A0A(SUj.A0A((Object) null, new C13223TQo(A032)));
                    return;
                }
                try {
                    C11330SNj A06 = qde.A08.A06("BIO", Collections.emptyList());
                    FBPayLoggerData A0J = Pxi.A0J(bundle2);
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("AUTH_METHOD_TYPE", "BIO");
                    A0a.putString("PAYMENT_TYPE", str3);
                    A0a.putParcelable("logger_data", A0J);
                    C10440RsH rsH = new C10440RsH(A0a);
                    Bundle bundle3 = rsH.A01;
                    SQ8.A02(str2, bundle3);
                    if ("SETUP_PIN_TO_CREATE_BIO_HUB".equals(str2)) {
                        str = "CREATE_BIO";
                    } else {
                        str = "VERIFY_BIO";
                    }
                    SQ8.A03(str, bundle3);
                    PttPayload byBio = PttPayload.byBio(AnonymousClass2E0.A0C().A01(), qde.A00.getPackageName(), A06.A07, Collections.emptyList());
                    SIS sis = qde.A07;
                    C11330SNj[] sNjArr = {sNj, A06};
                    HashSet A1F = AnonymousClass7TE.A1F();
                    Collections.addAll(A1F, sNjArr);
                    C12497SvT svT = new C12497SvT(0, qde, rsH);
                    String string = bundle3.getString("PAYMENT_ACCOUNT_ID");
                    Map A012 = S9s.A01(bundle3);
                    0qQ.A0B(A012, 5);
                    C12494SvQ A002 = C11095S9w.A00(svT, A1F);
                    0qQ.A0B(byBio, 1);
                    C11214SFo sFo = new C11214SFo(A002, byBio, "CREATE_AUTH_TICKET_BASED_FACTOR", string, (String) null, (String) null, (String) null, (String) null, A012, A1F);
                    AnonymousClass5A3 r4 = sis.A01;
                    C45906DEl dEl = new C45906DEl(sis, sFo, str3, 2);
                    SOC soc = sis.A00;
                    0qQ.A0B(r4, 0);
                    0qQ.A0B(soc, 2);
                    C7422QCn A033 = SSC.A03(new C8296Qnc(dEl, soc, r4, sFo));
                    SIS.A00(A033, soc);
                    C11652Sdu.A03(A033, r3, qde, 5);
                    AnonymousClass2E0.A03().A01.Cgl("create_biometric", S9s.A01(bundle3));
                } catch (Exception e) {
                    0KC.A0F("DefaultAuthTicketManager", "create AT Safe", e);
                    r3.A0A(SUj.A0A((Object) null, new C13223TQo("Unable create auth ticket", 103)));
                }
            } else {
                QDE qde2 = (QDE) this.A01;
                SQB.A02(qde2.A02, qde2.A04, C11652Sdu.A00(this, 4));
            }
        } else {
            2FO r2 = AnonymousClass2E0.A03().A01;
            Bundle bundle4 = ((C10440RsH) this.A02).A01;
            r2.Cgl("fbpay_remove_biometric", S9s.A01(bundle4));
            QDE qde3 = (QDE) this.A01;
            SIS sis2 = qde3.A07;
            String str4 = this.A04;
            String str5 = this.A03;
            SSZ ssz = qde3.A08;
            PttPayload deleteBio = PttPayload.deleteBio(str5);
            C11330SNj sNj2 = rug2.A01;
            sNj2.getClass();
            HashSet A0v = Pxj.A0v(sNj2);
            String string2 = bundle4.getString("PAYMENT_ACCOUNT_ID");
            Map A013 = S9s.A01(bundle4);
            DbW.A1N(deleteBio, 2, A013);
            C11214SFo sFo2 = new C11214SFo(C11095S9w.A00(new C12496SvS(ssz, 1), A0v), deleteBio, "REVOKE_AUTH_TICKET", string2, (String) null, (String) null, (String) null, (String) null, A013, A0v);
            C7422QCn A003 = SQA.A00(new C45897DEc(sis2, sFo2, str4, str5, 1), sis2, sis2.A01, sFo2);
            qde3.A03.A0E(A003, new C11648Sdq(13, (Object) A003, (Object) this));
        }
    }
}
