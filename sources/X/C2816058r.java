package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.58r  reason: invalid class name and case insensitive filesystem */
public abstract class C2816058r {
    public static C2816158s parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("button_title".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("button_title", "LiveUserPayPinnedRowConfigImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new C2816158s(str, str2);
            } else {
                ((0c9) r8).A03.A00(DevServerEntity.COLUMN_DESCRIPTION, "LiveUserPayPinnedRowConfigImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
