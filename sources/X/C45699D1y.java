package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D1y  reason: case insensitive filesystem */
public final class C45699D1y {
    public static CGO parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGO cgo = new CGO();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r5, A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            JZC parseFromJson = C44955Cnp.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgo.A05 = arrayList;
                } else if ("page_info".equals(A0q)) {
                    cgo.A02 = C44228Cap.parseFromJson(r5);
                } else if ("alacorn_session_id".equals(A0q)) {
                    cgo.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("licensed_music_eligibility_state".equals(A0q)) {
                    cgo.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("dark_banner_message".equals(A0q)) {
                    C41846B3n.A1A(r5);
                } else {
                    1XY.A01(r5, cgo, A0q);
                }
                r5.A0z();
            }
            String str = cgo.A04;
            if (str == null) {
                return cgo;
            }
            C63345KvS.A00(cgo.A05, str);
            return cgo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
