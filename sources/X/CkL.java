package X;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CkL {
    public static C45417Cvx parseFromJson(16F r4) {
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            C45417Cvx cvx = new C45417Cvx();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("survey_id".equals(A17)) {
                    cvx.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("survey_type".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if (C41845B3m.A1W(A17)) {
                    cvx.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("primer_message".equals(A17)) {
                    cvx.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("questions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            VZT parseFromJson = VC1.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cvx.A04 = arrayList;
                } else if ("is_demo".equals(A17)) {
                    r4.A0d();
                } else if ("show_primer".equals(A17)) {
                    cvx.A05 = r4.A0d();
                } else if ("show_results".equals(A17)) {
                    cvx.A06 = r4.A0d();
                }
                r4.A0z();
            }
            if (TextUtils.isEmpty(cvx.A03)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            cvx.A00 = num;
            return cvx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
