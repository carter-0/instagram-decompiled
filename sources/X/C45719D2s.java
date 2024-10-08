package X;

import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2s  reason: case insensitive filesystem */
public final class C45719D2s {
    public static CG4 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("has_more".equals(A17)) {
                    r0.A02 = r5.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        r0.A00 = AnonymousClass7TG.A0l(r5);
                    } else if ("upcoming_events".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                UpcomingEventImpl parseFromJson = C45712D2l.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A01 = arrayList;
                    } else {
                        1XY.A01(r5, r0, A17);
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
