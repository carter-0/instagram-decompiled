package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCj  reason: case insensitive filesystem */
public abstract class C16957VCj {
    public static C17632VbO parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17632VbO vbO = new C17632VbO();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C273654mx.A00(780).equals(A17)) {
                    vbO.A05 = r4.A0d();
                } else if (AnonymousClass000.A00(3469).equals(A17)) {
                    r4.A0d();
                } else if (C273654mx.A00(3472).equals(A17)) {
                    vbO.A06 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A17(A17)) {
                        vbO.A01 = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(5023).equals(A17)) {
                        vbO.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("packaged_file".equals(A17)) {
                        vbO.A00 = C16956VCi.parseFromJson(r4);
                    } else if (C273654mx.A00(2137).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VSF parseFromJson = C16952VCe.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vbO.A03 = arrayList;
                    } else if (C273654mx.A00(2303).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17436VVp parseFromJson2 = C16954VCg.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        vbO.A04 = arrayList;
                    }
                }
                r4.A0z();
            }
            return vbO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
