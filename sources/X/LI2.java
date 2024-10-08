package X;

import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import java.io.IOException;

public abstract class LI2 {
    public static GallerySuggestionsInfo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            GallerySuggestionsInfo gallerySuggestionsInfo = new GallerySuggestionsInfo();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("suggestion_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    gallerySuggestionsInfo.A02 = A0l;
                } else if ("suggestion_rule".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    gallerySuggestionsInfo.A01 = A0l2;
                } else if ("suggestion_index".equals(A17)) {
                    gallerySuggestionsInfo.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return gallerySuggestionsInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, GallerySuggestionsInfo gallerySuggestionsInfo) {
        r2.A0c();
        String str = gallerySuggestionsInfo.A02;
        if (str != null) {
            r2.A0R("suggestion_id", str);
        }
        String str2 = gallerySuggestionsInfo.A01;
        if (str2 != null) {
            r2.A0R("suggestion_rule", str2);
        }
        r2.A0P("suggestion_index", gallerySuggestionsInfo.A00);
        r2.A0Z();
    }
}
