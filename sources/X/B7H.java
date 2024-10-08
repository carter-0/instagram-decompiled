package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class B7H {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cuz] */
    public static C45357Cuz parseFromJson(16F r4) {
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
                if ("header".equals(A0q)) {
                    obj.A00 = C44958Cns.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("action_items".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C68170N3l parseFromJson = C44957Cnr.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A01 = arrayList;
                    } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass3UL parseFromJson2 = B7G.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
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
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
