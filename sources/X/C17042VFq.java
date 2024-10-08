package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VFq  reason: case insensitive filesystem */
public abstract class C17042VFq {
    public static C19474WaM parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C19474WaM waM = new C19474WaM();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("poll_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    waM.A03 = A0l;
                } else if ("question".equals(A17)) {
                    waM.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("viewer_vote".equals(A17)) {
                    waM.A01 = AnonymousClass7TF.A0X(r5);
                } else if ("viewer_can_vote".equals(A17)) {
                    waM.A07 = r5.A0d();
                } else if ("is_shared_result".equals(A17)) {
                    waM.A08 = r5.A0d();
                } else if ("tallies".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C272004jw parseFromJson = C271994jv.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    waM.A06 = arrayList;
                } else if ("option_tally_ratios".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r5);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    waM.A05 = arrayList;
                } else if ("color".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    waM.A02 = A0l2;
                }
                r5.A0z();
            }
            return waM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
