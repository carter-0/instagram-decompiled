package X;

import java.io.IOException;
import java.util.ArrayList;

public final class AAR {
    public static C384649hf parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C384649hf r1 = new C384649hf();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("parent_comment".equals(A17)) {
                    r1.A02 = AnonymousClass1Zw.parseFromJson(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("child_comments".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                1bK parseFromJson = AnonymousClass1Zw.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r1.A05 = arrayList;
                    } else if (AnonymousClass000.A00(1617).equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l, 0);
                        r1.A04 = A0l;
                    } else if (AnonymousClass000.A00(1616).equals(A17)) {
                        String A0l2 = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l2, 0);
                        r1.A03 = A0l2;
                    } else if (AnonymousClass000.A00(1399).equals(A17)) {
                        r1.A07 = r5.A0d();
                    } else if (AnonymousClass000.A00(1398).equals(A17)) {
                        r1.A06 = r5.A0d();
                    } else if ("is_ranked_replies".equals(A17)) {
                        r5.A0d();
                    } else if (AnonymousClass000.A00(1645).equals(A17)) {
                        r1.A00 = r5.A1D();
                    } else if (AnonymousClass000.A00(1647).equals(A17)) {
                        r1.A01 = r5.A1D();
                    } else {
                        1XY.A01(r5, r1, A17);
                    }
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
