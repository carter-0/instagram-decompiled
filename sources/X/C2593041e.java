package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.41e  reason: invalid class name and case insensitive filesystem */
public abstract class C2593041e {
    public static String A00(AnonymousClass9I7 r4) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        A0A.A0P("sequence_number", r4.A01);
        A0A.A0P("impression_count", r4.A00);
        A0A.A0S("has_synced_with_server", r4.A04);
        A0A.A0P("last_impression_time_sec", r4.A03);
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public static AnonymousClass9I7 parseFromJson(16F r17) {
        16F r3 = r17;
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            Integer num3 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("sequence_number".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("impression_count".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if ("has_synced_with_server".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if ("last_impression_time_sec".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                }
                r3.A0z();
            }
            if (num == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("sequence_number", "CXPNoticeState");
            } else if (num2 == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("impression_count", "CXPNoticeState");
            } else if (bool == null && (r3 instanceof 0c9)) {
                ((0c9) r3).A03.A00("has_synced_with_server", "CXPNoticeState");
            } else if (num3 != null || !(r3 instanceof 0c9)) {
                return new AnonymousClass9I7(bool.booleanValue(), num2.intValue(), num.intValue(), num3.intValue(), 0);
            } else {
                ((0c9) r3).A03.A00("last_impression_time_sec", "CXPNoticeState");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
