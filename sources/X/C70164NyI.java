package X;

import com.instagram.model.direct.HighlightRange;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyI  reason: case insensitive filesystem */
public abstract class C70164NyI {
    public static OGD parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            OGD ogd = new OGD();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("sender_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    ogd.A03 = A0l;
                } else if ("item_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    ogd.A01 = A0l2;
                } else if ("message_text".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l3, 0);
                    ogd.A02 = A0l3;
                } else if ("timestamp".equals(A17)) {
                    ogd.A00 = r5.A0y();
                } else if ("matched_message_range_data".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            HighlightRange parseFromJson = O18.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ogd.A04 = arrayList;
                }
                r5.A0z();
            }
            return ogd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
