package X;

import com.instagram.api.schemas.CreationToolEnum;
import java.io.IOException;

/* renamed from: X.HTd  reason: case insensitive filesystem */
public abstract class C54796HTd {
    public static C53444Goc parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            CreationToolEnum creationToolEnum = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "tool")) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    creationToolEnum = (CreationToolEnum) CreationToolEnum.A01.get(str);
                    if (creationToolEnum == null) {
                        creationToolEnum = CreationToolEnum.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            if (creationToolEnum != null || !(r6 instanceof 0c9)) {
                return new C53444Goc(creationToolEnum);
            }
            AnonymousClass7TF.A1L("tool", r6, "HighlightedCreationToolInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
