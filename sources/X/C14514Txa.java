package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Txa  reason: case insensitive filesystem */
public final class C14514Txa {
    public static C14515Txb parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C14515Txb txb = new C14515Txb();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("fps_override".equals(A0q)) {
                    r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("additional_parts".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VSY parseFromJson = C16990VDq.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        txb.A00 = arrayList;
                    } else if ("documents".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C14517Txd parseFromJson2 = C14516Txc.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        txb.A01 = arrayList;
                    } else if ("interactions".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C14525Txl parseFromJson3 = C14524Txk.parseFromJson(r4);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        txb.A02 = arrayList;
                    }
                }
                r4.A0z();
            }
            return txb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
