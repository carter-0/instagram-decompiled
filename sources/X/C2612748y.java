package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import java.io.IOException;

/* renamed from: X.48y  reason: invalid class name and case insensitive filesystem */
public abstract class C2612748y {
    public static AnonymousClass5AU parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            AppreciationUFIEntryActionType appreciationUFIEntryActionType = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("action_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    appreciationUFIEntryActionType = (AppreciationUFIEntryActionType) AppreciationUFIEntryActionType.A01.get(str);
                    if (appreciationUFIEntryActionType == null) {
                        appreciationUFIEntryActionType = AppreciationUFIEntryActionType.UNRECOGNIZED;
                    }
                } else if ("gift_count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                }
                r8.A0z();
            }
            if (appreciationUFIEntryActionType == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("action_type", "AppreciationUFIEntryObject");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new AnonymousClass5AU(appreciationUFIEntryActionType, num.intValue());
            } else {
                ((0c9) r8).A03.A00("gift_count", "AppreciationUFIEntryObject");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
