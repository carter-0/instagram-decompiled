package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hwu  reason: case insensitive filesystem */
public final class C56343Hwu {
    public static HE9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            HE9 he9 = new HE9();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("tabs".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C55525Hj7 parseFromJson = C55121HcU.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    he9.A05 = arrayList;
                } else if ("save_media_response".equals(A17)) {
                    he9.A03 = C56342Hwt.parseFromJson(r4);
                } else if ("save_igtv_response".equals(A17)) {
                    he9.A02 = LJ4.parseFromJson(r4);
                } else if ("save_clips_response".equals(A17)) {
                    he9.A00 = AnonymousClass93W.parseFromJson(r4);
                } else if (AnonymousClass000.A00(2820).equals(A17)) {
                    he9.A04 = C18689Vwn.parseFromJson(r4);
                } else if ("story_sticker_media".equals(A17)) {
                    he9.A01 = 1Xj.A00(r4);
                } else {
                    C55111HcK.A00(r4, he9, A17);
                }
                r4.A0z();
            }
            return he9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
