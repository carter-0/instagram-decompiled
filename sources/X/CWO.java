package X;

import com.instagram.api.schemas.ContextualLinkCtaType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CWO {
    public static BER parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            1s1 r6 = null;
            ContextualLinkCtaType contextualLinkCtaType = null;
            1s8 r7 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C279584ys r8 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("content_appreciation_info".equals(A17)) {
                    r6 = C67131rz.parseFromJson(r11);
                } else if ("contextual_link_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    contextualLinkCtaType = (ContextualLinkCtaType) ContextualLinkCtaType.A01.get(str);
                    if (contextualLinkCtaType == null) {
                        contextualLinkCtaType = ContextualLinkCtaType.UNRECOGNIZED;
                    }
                } else if ("mashup_info".equals(A17)) {
                    r7 = AnonymousClass1s5.parseFromJson(r11);
                } else if ("prompt_stickers_info".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            AnonymousClass5B1 parseFromJson = C281975Ah.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reusable_text_info".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C248883ik parseFromJson2 = AnonymousClass3i0.parseFromJson(r11);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("template_info".equals(A17)) {
                    r8 = C67211sN.parseFromJson(r11);
                }
                r11.A0z();
            }
            if (contextualLinkCtaType != null || !(r11 instanceof 0c9)) {
                return new BER(contextualLinkCtaType, r6, r7, r8, arrayList, arrayList2);
            }
            AnonymousClass7TF.A1L("contextual_link_type", r11, "ContextualLinkCtaInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
