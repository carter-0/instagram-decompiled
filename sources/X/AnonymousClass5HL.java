package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.5HL  reason: invalid class name */
public abstract class AnonymousClass5HL {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5ER, java.lang.Object] */
    public static AnonymousClass5ER parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("di".equals(A0q)) {
                    obj.A00 = r3.A1D();
                } else if ("dt".equals(A0q)) {
                    obj.A02 = r3.A1D();
                } else if ("dt_open".equals(A0q)) {
                    obj.A05 = Integer.valueOf(r3.A1D());
                } else if ("dt_e2ee".equals(A0q)) {
                    obj.A04 = Integer.valueOf(r3.A1D());
                } else if ("ac".equals(A0q)) {
                    obj.A01 = r3.A1D();
                } else if ("ta_o".equals(A0q)) {
                    obj.A03 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(AnonymousClass5ER r4) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        A0A.A0P("di", r4.A00);
        A0A.A0P("dt", r4.A02);
        Integer num = r4.A05;
        if (num != null) {
            A0A.A0P("dt_open", num.intValue());
        }
        Integer num2 = r4.A04;
        if (num2 != null) {
            A0A.A0P("dt_e2ee", num2.intValue());
        }
        A0A.A0P("ac", r4.A01);
        A0A.A0P("ta_o", r4.A03);
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }
}
