package X;

import java.io.IOException;

public abstract class VHN {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VYg, java.lang.Object] */
    public static VYg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_list_title_content".equals(A17)) {
                    obj.A03 = VHR.parseFromJson(r3);
                } else if ("product_list_item_content".equals(A17)) {
                    obj.A02 = VHQ.parseFromJson(r3);
                } else if ("product_list_group_content".equals(A17)) {
                    obj.A01 = VHP.parseFromJson(r3);
                } else if ("product_list_collection_content".equals(A17)) {
                    obj.A00 = VHO.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
