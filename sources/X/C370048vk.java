package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8vk  reason: invalid class name and case insensitive filesystem */
public abstract class C370048vk {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.8vl, java.lang.Object] */
    public static C370058vl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("overlay_drawable_data".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            A6D parseFromJson = C379519Uf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("overlay_asset_data".equals(A0q)) {
                    obj.A02 = C370068vm.A00(r4);
                } else if ("karaoke_sticker_edits".equals(A0q)) {
                    obj.A01 = C394489yC.parseFromJson(r4);
                } else if ("drawables_max_z".equals(A0q)) {
                    obj.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
