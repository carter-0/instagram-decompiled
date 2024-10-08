package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.SHn  reason: case insensitive filesystem */
public final class C11253SHn {
    public String A00;
    public Map A01;
    public final SOV A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C11253SHn(SOV sov, String str, String str2, List list, Map map) {
        this.A03 = str;
        this.A07 = list;
        this.A06 = null;
        this.A05 = null;
        this.A02 = sov;
        this.A04 = str2;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{clientIdentifier='");
        A1A.append(this.A03);
        A1A.append("', willTopic='");
        A1A.append(this.A06);
        A1A.append("', willMessage='");
        A1A.append(this.A05);
        A1A.append("', userName='");
        A1A.append(this.A02);
        A1A.append("', phpOverride='");
        A1A.append(this.A00);
        A1A.append("'");
        return Pxg.A0x(A1A);
    }

    public C11253SHn(SOV sov, String str, String str2, String str3, String str4, List list) {
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = sov;
        this.A04 = str4;
        this.A07 = list;
    }
}
