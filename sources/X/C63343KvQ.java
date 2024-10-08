package X;

import com.instagram.model.shopping.video.ShoppingCreationConfig;
import java.io.IOException;

/* renamed from: X.KvQ  reason: case insensitive filesystem */
public abstract class C63343KvQ {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.model.shopping.video.ShoppingCreationConfig] */
    public static ShoppingCreationConfig parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(3782).equals(A17)) {
                    obj.A01 = r3.A0d();
                } else if (C273654mx.A00(336).equals(A17)) {
                    obj.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
