package X;

import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cgt  reason: case insensitive filesystem */
public abstract class C44559Cgt {
    public static BI5 parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            UrpRendererType urpRendererType = null;
            String str3 = null;
            String str4 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("asset_infos".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            IgShowreelCompositionAssetInfo parseFromJson = C2805452g.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("logging_info".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("renderer_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    urpRendererType = (UrpRendererType) UrpRendererType.A01.get(str);
                    if (urpRendererType == null) {
                        urpRendererType = UrpRendererType.UNRECOGNIZED;
                    }
                } else if ("rendering_spec".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("template_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (urpRendererType == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("renderer_type", r11, "UrpMediaComposition");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new BI5(urpRendererType, str2, str3, str4, arrayList);
            } else {
                AnonymousClass7TF.A1L("rendering_spec", r11, "UrpMediaComposition");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
