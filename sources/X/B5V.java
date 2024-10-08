package X;

import com.instagram.api.schemas.NoteEmojiReactionInfo;
import java.io.IOException;
import java.util.ArrayList;

public abstract class B5V {
    public static C300865y4 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C276104sZ r5 = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("paging_info".equals(A0q)) {
                    r5 = C276094sY.parseFromJson(r8);
                } else if ("reactions".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            NoteEmojiReactionInfo parseFromJson = C45601CzD.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (r5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("paging_info", r8, "NoteEmojiReactionsResponse");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new C300865y4(r5, arrayList);
            } else {
                AnonymousClass7TF.A1L("reactions", r8, "NoteEmojiReactionsResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
