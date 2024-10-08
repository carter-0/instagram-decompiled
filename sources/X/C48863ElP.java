package X;

import java.io.IOException;

/* renamed from: X.ElP  reason: case insensitive filesystem */
public abstract class C48863ElP {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.FbI, java.lang.Object] */
    public static C50409FbI parseFromJson(16F r4) {
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread".equals(A17)) {
                    obj.A00 = C370528wc.parseFromJson(r4);
                } else if (C41845B3m.A1B(A17)) {
                    obj.A01 = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            if (obj.A00 != null) {
                num = AnonymousClass05K.A00;
            } else if (obj.A01 != null) {
                num = AnonymousClass05K.A01;
            } else {
                0wb.A03("Invalid DirectShareSheetRecipientType", "DirectShareSheetRecipientType is neither thread nor user");
                return obj;
            }
            obj.A02 = num;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
