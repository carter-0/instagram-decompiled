package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

public final class HF9 extends C253513qu {
    public final long A00;
    public final C230472pg A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public HF9(C230472pg r2, String str, String str2, String str3, String str4, String str5, List list, long j, boolean z) {
        C51973G9u.A0r(2, str, str2, str3);
        this.A08 = z;
        this.A05 = str;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = r2;
        this.A07 = list;
        this.A02 = str4;
        this.A06 = str5;
    }

    public final long A00() {
        return this.A00;
    }

    public final ParcelableSignalData A01() {
        boolean z = this.A08;
        String str = this.A05;
        long j = this.A00;
        String str2 = this.A03;
        String str3 = this.A04;
        C230472pg r9 = this.A01;
        List list = this.A07;
        String str4 = this.A02;
        String str5 = this.A06;
        return new ParcelableSignalData(r9, (Boolean) null, Boolean.valueOf(z), (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, Long.valueOf(j), (Long) null, (Long) null, (Long) null, str, (String) null, (String) null, str2, str3, (String) null, str4, (String) null, (String) null, (String) null, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, list, (Map) null);
    }

    public final String A02() {
        return this.A03;
    }

    public final String A03() {
        return this.A04;
    }

    public final String A04() {
        return this.A05;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AdClickSignalData(isAdClick=");
        A1A.append(this.A08);
        A1A.append(", itemId=");
        A1A.append(this.A05);
        A1A.append(", clickTimestamp=");
        A1A.append(this.A00);
        A1A.append(", containerModule=");
        G9w.A1W(A1A, this.A03);
        G9w.A1U(A1A, this.A04);
        G9w.A1P(A1A, this.A01);
        A1A.append(this.A07);
        A1A.append(", clickMediaId=");
        G9w.A1V(A1A, this.A02);
        return C51975G9x.A0i(this.A06, A1A);
    }
}
