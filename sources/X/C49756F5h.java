package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F5h  reason: case insensitive filesystem */
public final class C49756F5h {
    public static C47366Dwc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("inform_module".equals(A17)) {
                    r1.A00 = C44725Cjt.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("ranked_recipients".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C50409FbI parseFromJson = C48863ElP.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r1.A05 = arrayList;
                    } else if ("filtered".equals(A17)) {
                        r1.A06 = r4.A0d();
                    } else if (TraceFieldType.RequestID.equals(A17)) {
                        r1.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("rank_token".equals(A17)) {
                        r1.A02 = AnonymousClass7TG.A0l(r4);
                    } else if (C66579MXk.A00(1108).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        r1.A04 = arrayList;
                    } else if ("remaining_message_request_count".equals(A17)) {
                        r1.A01 = AnonymousClass7TF.A0X(r4);
                    } else {
                        1XY.A01(r4, r1, A17);
                    }
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
