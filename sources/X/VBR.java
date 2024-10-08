package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VBR {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VaX, java.lang.Object] */
    public static C17579VaX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C66579MXk.A00(1196).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("warning_url".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("warning_button_show_posts_title".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("warning_button_open_url_title".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("warning_contents".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    obj.A05 = arrayList;
                } else if ("category_id".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
