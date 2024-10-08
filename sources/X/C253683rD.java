package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3rD  reason: invalid class name and case insensitive filesystem */
public abstract class C253683rD {
    public static C253693rE parseFromJson(16F r7) {
        String A1P;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("days".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            if (!(r7.A11() == 16L.A0G || (A1P = r7.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_time".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("label".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if (TraceFieldType.StartTime.equals(A0q)) {
                    num2 = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
            return new C253693rE(num, num2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
