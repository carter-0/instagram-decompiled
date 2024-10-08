package X;

import com.instagram.model.mediasize.VideoVersion;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4yr  reason: invalid class name and case insensitive filesystem */
public abstract class C279574yr {
    public static BEI parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(1927);
                if (A1J == r3) {
                    break;
                }
                String A0q = r6.A0q();
                r6.A1J();
                if (A00.equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            VideoVersion parseFromJson = 1rY.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new BEI(arrayList);
            }
            ((0c9) r6).A03.A00(A00, "ClipsTemplatesReusableMediaAssetInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
