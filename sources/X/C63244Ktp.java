package X;

import com.instagram.direct.model.textformatting.FormattedText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ktp  reason: case insensitive filesystem */
public abstract class C63244Ktp {
    public static C61081JwJ parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("formatted_text_list".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            FormattedText parseFromJson = C63245Ktq.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("draft_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("formatted_text_list", r8, "ComposerText");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C61081JwJ((List) arrayList, str, 46);
            } else {
                AnonymousClass7TF.A1L("draft_text", r8, "ComposerText");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
