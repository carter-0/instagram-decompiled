package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

public final class GA8 extends C253513qu {
    public final long A00;
    public final C230472pg A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final long A00() {
        return this.A00;
    }

    public final ParcelableSignalData A01() {
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A02;
        String str4 = this.A06;
        C230472pg r9 = this.A01;
        List list = this.A07;
        long j = this.A00;
        return new ParcelableSignalData(r9, (Boolean) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, Long.valueOf(j), (Long) null, (Long) null, (Long) null, str4, (String) null, (String) null, str, str2, str3, this.A03, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, (Map) null);
    }

    public final String A02() {
        return this.A04;
    }

    public final String A03() {
        return this.A05;
    }

    public final String A04() {
        return this.A06;
    }

    public GA8(C230472pg r1, String str, String str2, String str3, String str4, String str5, List list, long j) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A01 = r1;
        this.A07 = list;
        this.A00 = j;
        this.A03 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LikeClickSignalData(containerModule=");
        G9w.A1W(A1A, this.A04);
        G9w.A1S(A1A, this.A05);
        G9w.A1R(A1A, this.A02);
        G9w.A1U(A1A, this.A06);
        G9w.A1P(A1A, this.A01);
        G9w.A1Q(A1A, this.A07);
        G9w.A0y(this.A00, A1A);
        return C51975G9x.A0i(this.A03, A1A);
    }
}
