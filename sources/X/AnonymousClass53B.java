package X;

import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.53B  reason: invalid class name */
public abstract class AnonymousClass53B {
    public static AnonymousClass9IE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            GifUrlImpl gifUrlImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("fixed_height".equals(A0q)) {
                    gifUrlImpl = AnonymousClass53C.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (gifUrlImpl != null || !(r5 instanceof 0c9)) {
                return new AnonymousClass9IE(gifUrlImpl);
            }
            ((0c9) r5).A03.A00("fixed_height", "DirectAnimatedMediaResponseItemImageBundle");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
