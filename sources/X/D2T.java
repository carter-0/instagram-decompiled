package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;
import java.util.ArrayList;

public final class D2T {
    public static CGV parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGV cgv = new CGV();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("suggested_hashtags".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            HashtagImpl parseFromJson = C279594yt.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cgv.A00 = arrayList;
                } else {
                    1XY.A01(r4, cgv, A17);
                }
                r4.A0z();
            }
            return cgv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
