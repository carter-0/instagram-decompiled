package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCx  reason: case insensitive filesystem */
public abstract class C16971VCx {
    public static C17229VNh parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17229VNh vNh = new C17229VNh();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("edges".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17228VNg parseFromJson = C16970VCw.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vNh.A00 = arrayList;
                }
                r4.A0z();
            }
            return vNh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
