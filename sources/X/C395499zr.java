package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.9zr  reason: invalid class name and case insensitive filesystem */
public abstract class C395499zr {
    public static AnonymousClass1nX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1nX r0 = new AnonymousClass1nX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else if ("music_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A02 = A0l;
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A04 = A0l2;
                } else if ("subtitle".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r0.A03 = A0l3;
                } else if ("url".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r0.A05 = A0l4;
                } else if ("cover_thumbnail_url".equals(A17)) {
                    ExtendedImageUrl parseFromJson2 = 16W.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A01 = parseFromJson2;
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
