package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.4n6  reason: invalid class name and case insensitive filesystem */
public abstract class C273734n6 {
    public static C273744n7 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C273744n7 r0 = new C273744n7();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("file_path".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A01 = str;
                } else if (TraceFieldType.Duration.equals(A0q)) {
                    r0.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
