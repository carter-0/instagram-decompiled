package X;

import com.instagram.api.schemas.TemplateTopic;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cg6  reason: case insensitive filesystem */
public abstract class C44510Cg6 {
    public static C42110BHo parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str2 = null;
            TemplateTopic templateTopic = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("body_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("category".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    templateTopic = (TemplateTopic) TemplateTopic.A01.get(str);
                    if (templateTopic == null) {
                        templateTopic = TemplateTopic.UNRECOGNIZED;
                    }
                } else if ("clips_items".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("subtype".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body_text", r13, "TemplateMidCardMetadata");
            } else if (templateTopic == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category", r13, "TemplateMidCardMetadata");
            } else if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_items", r13, "TemplateMidCardMetadata");
            } else if (str4 != null || !(r13 instanceof 0c9)) {
                return new C42110BHo(templateTopic, str2, str3, str4, arrayList);
            } else {
                AnonymousClass7TF.A1L("title_text", r13, "TemplateMidCardMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
