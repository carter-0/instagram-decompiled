package X;

import java.util.Map;

/* renamed from: X.Gkz  reason: case insensitive filesystem */
public final class C53251Gkz extends AnonymousClass0T0 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public C53251Gkz(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, long j) {
        C51974G9v.A1P(str, str2, map, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A08 = map;
        this.A04 = str3;
        this.A00 = j;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AFILoggingInfo(afiId=");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(1995));
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1066));
        A1A.append(this.A08);
        A1A.append(", afiType=");
        A1A.append(this.A04);
        A1A.append(C273654mx.A00(1071));
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(201));
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(1161));
        A1A.append(this.A07);
        A1A.append(", answerId=");
        A1A.append(this.A05);
        A1A.append(C273654mx.A00(1031));
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "RESPONSE";
        } else {
            str = "UNDO";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
