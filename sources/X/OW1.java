package X;

import java.util.Iterator;
import java.util.Map;

public final class OW1 {
    public Throwable A00;
    public final 0f9 A01;
    public final String A02;
    public final Map A03 = AnonymousClass7TE.A1H();

    public OW1(0fA r2, String str, int i) {
        0qQ.A0B(r2, 1);
        this.A02 = str;
        this.A01 = r2.AEf(str, i);
    }

    public final void A02(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A01.ABQ(str, str2);
        this.A03.put(str, str2);
    }

    public final void A01() {
        this.A01.report();
        0KC.A0C("RtcUnexpectedEvent", this.A02);
        Throwable th = this.A00;
        if (th != null) {
            0KC.A0C("RtcUnexpectedEvent", String.valueOf(2Og.A00(th)));
        }
        Iterator A0u = AnonymousClass7TF.A0u(this.A03);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            0KC.A0C("RtcUnexpectedEvent", 002.A0u("\t ", DbT.A13(A1J), " = ", (String) A1J.getValue()));
        }
    }

    public static void A00(0f9 r5, String str, Throwable th, Map map) {
        r5.report();
        0KC.A0C("RtcUnexpectedEvent", str);
        0KC.A0C("RtcUnexpectedEvent", String.valueOf(2Og.A00(th)));
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            0KC.A0C("RtcUnexpectedEvent", 002.A0u("\t ", DbT.A13(A1J), " = ", (String) A1J.getValue()));
        }
    }
}
