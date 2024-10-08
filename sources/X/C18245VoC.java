package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VoC  reason: case insensitive filesystem */
public final class C18245VoC {
    public static UY6 parseFromJson(16F r7) {
        C296865qm r2;
        0qQ.A0B(r7, 0);
        try {
            UY6 uy6 = new UY6();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                ArrayList arrayList = null;
                if (C41845B3m.A1E(A17)) {
                    C41846B3n.A1A(r7);
                } else if ("rank_token".equals(A17)) {
                    uy6.A03 = AnonymousClass7TG.A0l(r7);
                } else if ("sections".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            C295745oq parseFromJson = C295735op.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    uy6.A04 = arrayList;
                } else if ("next_max_id".equals(A17)) {
                    uy6.A02 = AnonymousClass7TG.A0l(r7);
                } else if (AnonymousClass000.A00(44).equals(A17)) {
                    uy6.A05 = r7.A0d();
                } else if ("refinements".equals(A17)) {
                    uy6.A00 = C16935VBn.parseFromJson(r7);
                } else if ("topic_status".equals(A17)) {
                    int A1D = r7.A1D();
                    C296865qm[] values = C296865qm.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r2 = C296865qm.NOT_A_TOPIC;
                            break;
                        }
                        r2 = values[i];
                        if (r2.A00 == A1D) {
                            break;
                        }
                        i++;
                    }
                    uy6.A01 = r2;
                } else {
                    1XY.A01(r7, uy6, A17);
                }
                r7.A0z();
            }
            return uy6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
