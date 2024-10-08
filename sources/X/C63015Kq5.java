package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.venue.LocationDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kq5  reason: case insensitive filesystem */
public abstract class C63015Kq5 {
    public static C61280K0r parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("rank_token".equals(A17)) {
                    r4.A01 = AnonymousClass7TG.A0l(r5);
                } else if (TraceFieldType.RequestID.equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("venues".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            LocationDict parseFromJson = AnonymousClass41Q.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r4.A03 = arrayList;
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            String str = r4.A01;
            0qQ.A0A(str);
            String str2 = r4.A02;
            0qQ.A0A(str2);
            List list = r4.A03;
            0qQ.A0A(list);
            r4.A00 = new C60916Jta(str, str2, list);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
