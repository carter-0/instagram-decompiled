package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VGq  reason: case insensitive filesystem */
public abstract class C17068VGq {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.WWK] */
    public static WWK parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("more_available".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0S(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        obj.A01 = AnonymousClass7TG.A0l(r4);
                    } else if (C273654mx.A00(173).equals(A17)) {
                        r4.A1D();
                    } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C18043VkR parseFromJson = VHM.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    }
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
