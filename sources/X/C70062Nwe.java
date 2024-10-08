package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nwe  reason: case insensitive filesystem */
public abstract class C70062Nwe {
    public static OHQ parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            OHQ ohq = new OHQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                if (C41846B3n.A1Y(r6, A0q)) {
                    ohq.A01 = r6.A0y();
                } else {
                    ArrayList arrayList = null;
                    if (C273654mx.A00(64).equals(A0q)) {
                        C41846B3n.A1A(r6);
                    } else if ("is_voted".equals(A0q)) {
                        ohq.A06 = r6.A0d();
                    } else if (C41845B3m.A1A(A0q)) {
                        ohq.A02 = AnonymousClass7TG.A0l(r6);
                    } else if ("voter_igids".equals(A0q)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r6, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        ohq.A04 = arrayList;
                    } else if ("voters_accessibility_label".equals(A0q)) {
                        ohq.A03 = AnonymousClass7TG.A0l(r6);
                    } else if ("total_count".equals(A0q)) {
                        ohq.A00 = r6.A1D();
                    } else if ("voters".equals(A0q)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                C41846B3n.A1E(r6, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        ohq.A05 = arrayList;
                    }
                }
                r6.A0z();
            }
            return ohq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
