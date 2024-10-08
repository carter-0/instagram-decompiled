package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckj  reason: case insensitive filesystem */
public abstract class C44772Ckj {
    public static C45291Ctu parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45291Ctu ctu = new C45291Ctu();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("header".equals(A17)) {
                    ctu.A00 = AnonymousClass7TG.A0l(r4);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45380CvM parseFromJson = C44771Cki.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ctu.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
