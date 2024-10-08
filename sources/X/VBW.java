package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VBW {
    public static C298795u2 parseFromJson(16F r8) {
        C296865qm r2;
        Integer num;
        0qQ.A0B(r8, 0);
        try {
            C298795u2 r0 = new C298795u2();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("keyword".equals(A17)) {
                    Keyword parseFromJson = C67385Mn1.parseFromJson(r8);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A17(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r8);
                        0qQ.A0B(A0l, 0);
                        r0.A03 = A0l;
                    } else if ("medias".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r8.A1J() != 16L.A08) {
                                C41846B3n.A1D(r8, arrayList);
                            }
                        }
                        r0.A05 = arrayList;
                    } else if ("style".equals(A17)) {
                        String A1Q = r8.A1Q();
                        0qQ.A0B(A1Q, 0);
                        Integer[] A00 = AnonymousClass05K.A00(3);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                num = AnonymousClass05K.A01;
                                break;
                            }
                            num = A00[i];
                            if (0qQ.A0K(VBV.A00(num), A1Q)) {
                                break;
                            }
                            i++;
                        }
                        0qQ.A0B(num, 0);
                        r0.A02 = num;
                    } else if ("topic_status".equals(A17)) {
                        int A1D = r8.A1D();
                        C296865qm[] values = C296865qm.values();
                        int length2 = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                r2 = C296865qm.NOT_A_TOPIC;
                                break;
                            }
                            r2 = values[i2];
                            if (r2.A00 == A1D) {
                                break;
                            }
                            i2++;
                        }
                        r0.A00 = r2;
                    }
                }
                r8.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
