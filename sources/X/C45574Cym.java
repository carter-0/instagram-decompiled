package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cym  reason: case insensitive filesystem */
public final class C45574Cym {
    public static CEQ parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("beats".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C53291Gld parseFromJson = C393309wE.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A03 = arrayList;
                } else if ("template_clips_media_id".equals(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("track_start_time_ms".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0X(r6);
                } else if ("trimmed_results".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            BGU parseFromJson2 = C44364Cdk.parseFromJson(r6);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A03;
            0qQ.A0A(list);
            String str = r5.A02;
            Integer num = r5.A01;
            0qQ.A0A(num);
            int intValue = num.intValue();
            List list2 = r5.A04;
            0qQ.A0A(list2);
            r5.A00 = new C53272GlK(str, list, list2, intValue);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
