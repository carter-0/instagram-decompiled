package X;

import java.io.IOException;

/* renamed from: X.3tP  reason: invalid class name and case insensitive filesystem */
public abstract class C254993tP {
    public static C255003tQ parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("business_response_time_in_sec".equals(A0q)) {
                    f = new Float(r6.A0U());
                } else if ("business_responsiveness_time_text".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("welcome_message_text".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C255003tQ(f, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
