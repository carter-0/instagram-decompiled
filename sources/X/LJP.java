package X;

import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.IOException;

public abstract class LJP {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    public static MusicBrowseCategory parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("category".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A02 = A0l;
                } else if (AnonymousClass000.A00(1856).equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("subcategory_title".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("is_top_level".equals(A17)) {
                    obj.A07 = r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, MusicBrowseCategory musicBrowseCategory) {
        r2.A0c();
        musicBrowseCategory.A00();
        r2.A0R("category", musicBrowseCategory.A00());
        String str = musicBrowseCategory.A04;
        if (str != null) {
            r2.A0R(AnonymousClass000.A00(1856), str);
        }
        String str2 = musicBrowseCategory.A06;
        if (str2 != null) {
            r2.A0R("subcategory_title", str2);
        }
        r2.A0S("is_top_level", musicBrowseCategory.A07);
        r2.A0Z();
    }
}
