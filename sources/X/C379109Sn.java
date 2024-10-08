package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9Sn  reason: invalid class name and case insensitive filesystem */
public final class C379109Sn {
    public static C379119So parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C379119So r0 = new C379119So();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("beats".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            MusicAssetBeatInfo parseFromJson = A0Z.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                } else {
                    1XY.A01(r5, r0, A0q);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
