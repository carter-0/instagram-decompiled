package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4iY  reason: invalid class name */
public abstract class AnonymousClass4iY {
    public static IgShowreelCompositionImpl parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("assets_info".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            IgShowreelCompositionAssetInfo parseFromJson = C2805452g.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("content".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("template_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("client_name", "IgShowreelCompositionImpl");
            } else if (str2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("content", "IgShowreelCompositionImpl");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new IgShowreelCompositionImpl(str, str2, str3, arrayList);
            } else {
                ((0c9) r11).A03.A00("template_name", "IgShowreelCompositionImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, IgShowreelCompositionImpl igShowreelCompositionImpl) {
        r2.A0c();
        List<IgShowreelCompositionAssetInfo> list = igShowreelCompositionImpl.A03;
        if (list != null) {
            16P.A03(r2, "assets_info");
            for (IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo : list) {
                if (igShowreelCompositionAssetInfo != null) {
                    C2805452g.A00(r2, igShowreelCompositionAssetInfo);
                }
            }
            r2.A0Y();
        }
        String str = igShowreelCompositionImpl.A00;
        if (str != null) {
            r2.A0R("client_name", str);
        }
        String str2 = igShowreelCompositionImpl.A01;
        if (str2 != null) {
            r2.A0R("content", str2);
        }
        String str3 = igShowreelCompositionImpl.A02;
        if (str3 != null) {
            r2.A0R("template_name", str3);
        }
        r2.A0Z();
    }
}
