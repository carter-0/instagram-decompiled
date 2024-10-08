package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

public final class HFB extends C253513qu {
    public final long A00;
    public final C230472pg A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final long A00() {
        return this.A00;
    }

    public final ParcelableSignalData A01() {
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        String str4 = this.A05;
        C230472pg r10 = this.A01;
        List list = this.A08;
        long j = this.A00;
        return new ParcelableSignalData(r10, (Boolean) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, Long.valueOf(j), (Long) null, (Long) null, str4, (String) null, (String) null, str, str2, str3, (String) null, this.A07, this.A06, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, (Map) null);
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

    public HFB(C230472pg r1, String str, String str2, String str3, String str4, String str5, String str6, List list, long j) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A01 = r1;
        this.A08 = list;
        this.A00 = j;
        this.A07 = str5;
        this.A06 = str6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("XoutSignalData(containerModule=");
        G9w.A1W(A1A, this.A03);
        G9w.A1S(A1A, this.A04);
        G9w.A1R(A1A, this.A02);
        G9w.A1U(A1A, this.A05);
        G9w.A1P(A1A, this.A01);
        A1A.append(this.A08);
        A1A.append(", xoutTimestamp=");
        A1A.append(this.A00);
        A1A.append(", xoutMediaId=");
        A1A.append(this.A07);
        A1A.append(", reason=");
        return C51975G9x.A0i(this.A06, A1A);
    }
}
