package X;

import java.util.Map;

public class NT7 extends C70759OKf {
    public final 1OS A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public NT7(1OS r3, C270214gN r4, Integer num, Long l, String str, String str2, String str3) {
        super(num, str3);
        String str4;
        this.A01 = l;
        this.A00 = r3;
        this.A04 = str;
        this.A05 = str2;
        String str5 = null;
        if (r4 != null) {
            str4 = r4.A03;
        } else {
            str4 = null;
        }
        this.A02 = str4;
        this.A03 = r4 != null ? r4.A04 : str5;
    }

    public String A00() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            A1A.append("threadJid=");
            A1A.append(longValue);
        }
        1OS r1 = this.A00;
        if (r1 != null) {
            A1A.append(" mutationId=");
            A1A.append(r1.A05);
            A1A.append(" mutation=");
            Class<?> cls = r1.getClass();
            Map map = 0Yh.A03;
            0qQ.A0B(cls, 1);
            A1A.append(0q1.A01(cls));
        }
        String str = this.A04;
        if (str != null) {
            A1A.append(" recipientIgId=");
            A1A.append(str);
        }
        String str2 = this.A05;
        if (str2 != null) {
            A1A.append(" threadIgId=");
            A1A.append(str2);
        }
        String str3 = this.A02;
        if (str3 != null) {
            A1A.append(" errorCode=");
            A1A.append(str3);
        }
        String str4 = this.A03;
        if (str4 != null) {
            A1A.append(" errorMessage=");
            A1A.append(str4);
        }
        String str5 = this.A02;
        if (str5 != null) {
            A1A.append(" oneTraceId=");
            A1A.append(str5);
        }
        return DbT.A10(A1A);
    }
}
