package X;

import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import java.io.IOException;

/* renamed from: X.Cg9  reason: case insensitive filesystem */
public abstract class C44513Cg9 {
    public static GSY parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str2 = null;
            TemplatesBrowserSectionSize templatesBrowserSectionSize = null;
            String str3 = null;
            C276104sZ r4 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("paging_info".equals(A17)) {
                    r4 = C276094sY.parseFromJson(r11);
                } else if ("section_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("section_size".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    templatesBrowserSectionSize = (TemplatesBrowserSectionSize) TemplatesBrowserSectionSize.A01.get(str);
                    if (templatesBrowserSectionSize == null) {
                        templatesBrowserSectionSize = TemplatesBrowserSectionSize.UNRECOGNIZED;
                    }
                } else if ("title_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("section_id", r11, "TemplatesBrowserSectionInfo");
            } else if (templatesBrowserSectionSize == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("section_size", r11, "TemplatesBrowserSectionInfo");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new GSY((C276114sa) r4, templatesBrowserSectionSize, str2, str3);
            } else {
                AnonymousClass7TF.A1L("title_text", r11, "TemplatesBrowserSectionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
