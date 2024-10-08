package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

public final class HF8 extends C253513qu {
    public final long A00;
    public final C53251Gkz A01;
    public final C230472pg A02;
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
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A03;
        String str4 = this.A07;
        C230472pg r14 = this.A02;
        List list = this.A08;
        long j = this.A00;
        String str5 = this.A04;
        C53251Gkz gkz = this.A01;
        String str6 = gkz.A03;
        String str7 = gkz.A02;
        Map map = gkz.A08;
        String str8 = gkz.A04;
        long j2 = gkz.A00;
        String str9 = gkz.A06;
        String str10 = gkz.A07;
        String str11 = gkz.A05;
        return new ParcelableSignalData(r14, (Boolean) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, gkz.A01, (Long) null, (Long) null, Long.valueOf(j), (Long) null, (Long) null, Long.valueOf(j2), str4, (String) null, (String) null, str, str2, str3, str5, (String) null, (String) null, (String) null, (String) null, str7, str6, str8, str9, str10, str11, list, map);
    }

    public final String A02() {
        return this.A05;
    }

    public final String A03() {
        return this.A06;
    }

    public final String A04() {
        return this.A07;
    }

    public HF8(C53251Gkz gkz, C230472pg r3, String str, String str2, String str3, String str4, String str5, List list, long j) {
        C51974G9v.A1P(str, str2, str3, str4);
        AnonymousClass7TF.A1F(list, 6, str5);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A07 = str4;
        this.A02 = r3;
        this.A08 = list;
        this.A00 = j;
        this.A04 = str5;
        this.A01 = gkz;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AFISignalData(containerModule=");
        G9w.A1W(A1A, this.A05);
        G9w.A1S(A1A, this.A06);
        G9w.A1R(A1A, this.A03);
        G9w.A1U(A1A, this.A07);
        G9w.A1P(A1A, this.A02);
        G9w.A1Q(A1A, this.A08);
        G9w.A0y(this.A00, A1A);
        A1A.append(this.A04);
        A1A.append(", afiLoggingInfo=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
