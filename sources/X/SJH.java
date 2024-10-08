package X;

import java.util.List;

public final class SJH {
    public QSO A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public SJH(QSO qso, String str, String str2, List list, List list2, List list3, List list4, List list5, boolean z, boolean z2) {
        DbW.A1N(list, 1, qso);
        this.A02 = list;
        this.A04 = list2;
        this.A03 = list3;
        this.A01 = list4;
        this.A00 = qso;
        this.A05 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str2;
        this.A07 = list5;
    }

    public static /* synthetic */ SJH A00(SJH sjh, String str, List list, int i) {
        List list2;
        List list3;
        List list4;
        QSO qso;
        boolean z;
        boolean z2;
        String str2;
        String str3 = str;
        List list5 = list;
        List list6 = null;
        if ((i & 1) != 0) {
            list5 = sjh.A02;
        }
        if ((i & 2) != 0) {
            list2 = sjh.A04;
        } else {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = sjh.A03;
        } else {
            list3 = null;
        }
        if ((i & 8) != 0) {
            list4 = sjh.A01;
        } else {
            list4 = null;
        }
        if ((i & 16) != 0) {
            qso = sjh.A00;
        } else {
            qso = null;
        }
        if ((i & 32) != 0) {
            str3 = sjh.A05;
        }
        if ((i & 64) != 0) {
            z = sjh.A09;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = sjh.A08;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            str2 = sjh.A06;
        } else {
            str2 = null;
        }
        if ((i & 512) != 0) {
            list6 = sjh.A07;
        }
        0qQ.A0B(list5, 0);
        C51974G9v.A1P(list2, list3, list4, qso);
        0qQ.A0B(list6, 9);
        return new SJH(qso, str3, str2, list5, list2, list3, list4, list6, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SJH) {
                SJH sjh = (SJH) obj;
                if (!0qQ.A0K(this.A02, sjh.A02) || !0qQ.A0K(this.A04, sjh.A04) || !0qQ.A0K(this.A03, sjh.A03) || !0qQ.A0K(this.A01, sjh.A01) || !0qQ.A0K(this.A00, sjh.A00) || !0qQ.A0K(this.A05, sjh.A05) || this.A09 != sjh.A09 || this.A08 != sjh.A08 || !0qQ.A0K(this.A06, sjh.A06) || !0qQ.A0K(this.A07, sjh.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A02))));
        int A092 = AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A07(this.A00, A072) + AnonymousClass7TG.A0E(this.A05)) * 31);
        return AnonymousClass7TE.A0N(this.A07, (AnonymousClass7TF.A09(this.A08, A092) + C41845B3m.A00(this.A06)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PaymentMethodComponentData(availablePaymentMethods=");
        A1A.append(this.A02);
        A1A.append(", unsupportedPaymentMethods=");
        A1A.append(this.A04);
        A1A.append(", newCredentialOptions=");
        A1A.append(this.A03);
        A1A.append(", apmOptions=");
        A1A.append(this.A01);
        A1A.append(", paymentAddressFormConfig=");
        A1A.append(this.A00);
        A1A.append(", addedPaymentMethodId=");
        A1A.append(this.A05);
        A1A.append(", shouldOrderNewOptionsFirst=");
        A1A.append(this.A09);
        A1A.append(", shouldDeprioritizeCreditCard=");
        A1A.append(this.A08);
        A1A.append(", orderId=");
        A1A.append(this.A06);
        A1A.append(", cardFormFieldConfig=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }
}
