package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.6Q6  reason: invalid class name */
public final class AnonymousClass6Q6 implements AnonymousClass6Q7 {
    public String A00;
    public String A01;

    public final String F01() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            String str = this.A00;
            if (str != null) {
                A0A.A0R("ad_id", str);
            }
            String str2 = this.A01;
            if (str2 != null) {
                A0A.A0R("tracking_id", str2);
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public AnonymousClass6Q6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public AnonymousClass6Q6() {
    }
}
