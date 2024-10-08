package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hws  reason: case insensitive filesystem */
public final class C56341Hws {
    public static C54074Gyy parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C54074Gyy gyy = new C54074Gyy();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (AnonymousClass000.A00(44).equals(A17)) {
                    gyy.A02 = r5.A0d();
                } else if ("more_available".equals(A17)) {
                    gyy.A03 = r5.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        gyy.A00 = AnonymousClass7TG.A0l(r5);
                    } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                SavedCollection parseFromJson = C18689Vwn.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        gyy.A01 = arrayList;
                    } else {
                        1XY.A01(r5, gyy, A17);
                    }
                }
                r5.A0z();
            }
            return gyy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
