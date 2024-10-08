package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.55g  reason: invalid class name and case insensitive filesystem */
public abstract class C2809555g {
    public static C2809655h parseFromJson(16F r5) {
        String A1P;
        0qQ.A0B(r5, 0);
        try {
            C2809655h r0 = new C2809655h();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("ambient".equals(A0q) || "triggered".equals(A0q)) {
                    r5.A0d();
                } else if ("experimentalCameraInfo".equals(A0q)) {
                    r0.A01 = r5.A0d();
                } else if ("count".equals(A0q)) {
                    r5.A1D();
                } else if ("sub-capabilities".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
