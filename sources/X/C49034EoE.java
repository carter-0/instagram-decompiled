package X;

import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.SignupContent;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EoE  reason: case insensitive filesystem */
public abstract class C49034EoE {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    public static SignupContent parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(1224).equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("content_text".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            ContentText parseFromJson = Eo8.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A07 = arrayList;
                } else if ("content_button_label1".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("content_button_label2".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("partial_screen_primary_button_label".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("partial_screen_toast_text".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("final_screen_toast_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("scroll_hint_text".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
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
