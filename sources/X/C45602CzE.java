package X;

import com.instagram.api.schemas.NoteEmojiReactionInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CzE  reason: case insensitive filesystem */
public final class C45602CzE {
    public static C43820CEm parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("paging_info".equals(A17)) {
                    r3.A01 = C276094sY.parseFromJson(r4);
                } else if ("reactions".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            NoteEmojiReactionInfo parseFromJson = C45601CzD.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            C276104sZ r2 = r3.A01;
            0qQ.A0A(r2);
            List list = r3.A02;
            0qQ.A0A(list);
            r3.A00 = new C300865y4(r2, list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
