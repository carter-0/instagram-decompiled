package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CiR  reason: case insensitive filesystem */
public abstract class C44647CiR {
    public static C45376CvI parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45376CvI cvI = new C45376CvI();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("ig_thread_igid".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    cvI.A01 = A0l;
                } else if ("viewing_actor_igid".equals(A17)) {
                    cvI.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("viewed_item_ranges".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45409Cvp parseFromJson = C44646CiQ.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cvI.A03 = arrayList;
                } else if ("viewed_timestamp_ms".equals(A17)) {
                    cvI.A00 = r5.A0y();
                }
                r5.A0z();
            }
            return cvI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
