package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.54g  reason: invalid class name */
public abstract class AnonymousClass54g {
    public static AnonymousClass54h parseFromJson(16F r6) {
        String A1P;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("label".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("options".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (!(r6.A11() == 16L.A0G || (A1P = r6.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question_type".equals(A0q)) {
                    num = Integer.valueOf(r6.A1D());
                }
                r6.A0z();
            }
            return new AnonymousClass54h(num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
