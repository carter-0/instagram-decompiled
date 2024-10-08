package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Txg  reason: case insensitive filesystem */
public abstract class C14520Txg {
    public static C14521Txh parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C14521Txh txh = new C14521Txh();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("visible_layers".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VY8 parseFromJson = C16994VDu.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    txh.A00 = arrayList;
                }
                r4.A0z();
            }
            return txh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
