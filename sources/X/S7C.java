package X;

import android.util.SparseArray;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.fbpay.w3c.security.SecurityProviderEphemeral;

public final class S7C {
    public C270254gR A00;
    public final AnonymousClass0eK A01;

    public S7C(AnonymousClass0eK r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final AnonymousClass5A6 A02(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        C8288QnU ADV = ((S3M) this.A01.get()).A04.ADV(str, str2, str3);
        0qQ.A0B(ADV, 0);
        return new AnonymousClass5A6(ADV);
    }

    public final AnonymousClass5A6 A03(String str, String str2, String str3, boolean z) {
        0sP twr;
        String str4 = str;
        String str5 = str2;
        AnonymousClass7TF.A1H(str, str2);
        SFB sfb = new SFB(str, str2);
        AnonymousClass0eK r5 = this.A01;
        C11010S5h s5h = new C11010S5h(((S3M) r5.get()).A00((String) null, (String) null), new C66308MMr(sfb, 12));
        C12512Svp svp = (C12512Svp) ((S3M) r5.get()).A04;
        C2818659w r7 = new C2818659w();
        2Mg A012 = svp.A01(str3);
        OMB omb = (OMB) SecurityProviderEphemeral.A00.invoke();
        if (z) {
            twr = new C73963Pmh(A012, svp, omb, r7, str4, 16);
        } else {
            twr = new TWR(A012, svp, omb, r7, str4, str5, 2);
        }
        omb.A01(twr);
        C11010S5h[] s5hArr = {s5h, new C11010S5h(r7, new C66308MMr(sfb, 13))};
        C2818659w r52 = new C2818659w();
        int i = 0;
        do {
            C11010S5h s5h2 = s5hArr[i];
            s5h2.A00.A9U(new C12510Svg(0, s5h2, r52));
            i++;
        } while (i < 2);
        return new AnonymousClass5A6(r52);
    }

    public final AnonymousClass2gB A00() {
        String str;
        S3M s3m = (S3M) this.A01.get();
        C270254gR r1 = this.A00;
        String str2 = null;
        if (r1 != null) {
            C61038Jvc jvc = r1.A00.A0P;
            str = jvc.A02;
            str2 = jvc.A01;
        } else {
            str = null;
        }
        C8293QnZ A002 = s3m.A00(str, str2);
        0qQ.A0B(A002, 0);
        return AnonymousClass72Y.A01(new AnonymousClass5A6(A002), TXX.A00);
    }

    public final AnonymousClass5A6 A01(CardDetails cardDetails) {
        Integer num;
        S3M s3m = (S3M) this.A01.get();
        W3CCardDetail w3CCardDetail = new W3CCardDetail(cardDetails, (Boolean) null, "", (String) null, (String) null, false);
        C12485SvH svH = new C12485SvH(s3m.A05.A00, "IAB_AUTOFILL");
        SparseArray A0L = Pxe.A0L();
        CardDetails cardDetails2 = w3CCardDetail.A00;
        Integer num2 = cardDetails2.A03;
        Integer num3 = cardDetails2.A04;
        if (num3 != null) {
            num = Integer.valueOf(num3.intValue() % 100);
        } else {
            num = null;
        }
        String format = String.format("%02d%02d", Pxf.A1X(num2, num, 2));
        0qQ.A07(format);
        A0L.append(14, format);
        A0L.append(15, cardDetails2.A09);
        A0L.append(13, cardDetails2.A07);
        Address address = cardDetails2.A00;
        if (address != null) {
            String str = address.A00;
            if (str != null && C51966G9m.A1X(str)) {
                A0L.append(2, str);
            }
            String str2 = address.A05;
            if (str2 != null && C51966G9m.A1X(str2)) {
                A0L.append(5, str2);
            }
            String str3 = address.A06;
            if (str3 != null && C51966G9m.A1X(str3)) {
                A0L.append(6, str3);
            }
            String str4 = address.A01;
            if (str4 != null && C51966G9m.A1X(str4)) {
                A0L.append(7, str4);
            }
            String str5 = address.A04;
            if (str5 != null && C51966G9m.A1X(str5)) {
                A0L.append(8, str5);
            }
            String str6 = address.A02;
            if (str6 != null && C51966G9m.A1X(str6)) {
                A0L.append(21, str6);
            }
            String str7 = address.A07;
            if (str7 != null && C51966G9m.A1X(str7)) {
                A0L.append(9, str7);
            }
        }
        C12506Svc svc = new C12506Svc(svH.EM7(A0L, (S4g) null), TY2.A00(new C66308MMr(s3m, 4), 49));
        0qQ.A0B(svc, 0);
        return new AnonymousClass5A6(svc);
    }

    public final String A04() {
        return Pxf.A0k(((C12512Svp) ((S3M) this.A01.get()).A04).A01.A06);
    }
}
