package X;

import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.41U  reason: invalid class name */
public abstract class AnonymousClass41U {
    public static AppstoreMetadataDictImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("average_rating".equals(A0q)) {
                    f = new Float(r8.A0U());
                } else if ("install_count".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("num_reviews".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("num_reviews_human_readable".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("screenshots".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            IGAdScreenshotURLDataDictImpl parseFromJson = C44170CYj.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            return new AppstoreMetadataDictImpl(f, num, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, AppstoreMetadataDictImpl appstoreMetadataDictImpl) {
        r5.A0c();
        Float f = appstoreMetadataDictImpl.A00;
        if (f != null) {
            r5.A0O("average_rating", f.floatValue());
        }
        String str = appstoreMetadataDictImpl.A02;
        if (str != null) {
            r5.A0R("install_count", str);
        }
        Integer num = appstoreMetadataDictImpl.A01;
        if (num != null) {
            r5.A0P("num_reviews", num.intValue());
        }
        String str2 = appstoreMetadataDictImpl.A03;
        if (str2 != null) {
            r5.A0R("num_reviews_human_readable", str2);
        }
        List<IGAdScreenshotURLDataDict> list = appstoreMetadataDictImpl.A04;
        if (list != null) {
            16P.A03(r5, "screenshots");
            for (IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict : list) {
                if (iGAdScreenshotURLDataDict != null) {
                    IGAdScreenshotURLDataDictImpl F3t = iGAdScreenshotURLDataDict.F3t();
                    r5.A0c();
                    String str3 = F3t.A03;
                    if (str3 != null) {
                        r5.A0R("dominant_color", str3);
                    }
                    Integer num2 = F3t.A01;
                    if (num2 != null) {
                        r5.A0P(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
                    }
                    IGProjectPortalInfoDict iGProjectPortalInfoDict = F3t.A00;
                    if (iGProjectPortalInfoDict != null) {
                        r5.A0q("media_background");
                        IGProjectPortalInfoDictImpl F4w = iGProjectPortalInfoDict.F4w();
                        r5.A0c();
                        String str4 = F4w.A00;
                        if (str4 != null) {
                            r5.A0R("bottomColor", str4);
                        }
                        String str5 = F4w.A01;
                        if (str5 != null) {
                            r5.A0R("captionBackgroundColor", str5);
                        }
                        String str6 = F4w.A02;
                        if (str6 != null) {
                            r5.A0R("captionBackgroundColorAlpha", str6);
                        }
                        String str7 = F4w.A03;
                        if (str7 != null) {
                            r5.A0R("captionColor", str7);
                        }
                        String str8 = F4w.A04;
                        if (str8 != null) {
                            r5.A0R("templateId", str8);
                        }
                        String str9 = F4w.A05;
                        if (str9 != null) {
                            r5.A0R("topColor", str9);
                        }
                        r5.A0Z();
                    }
                    String str10 = F3t.A04;
                    if (str10 != null) {
                        r5.A0R("url", str10);
                    }
                    Integer num3 = F3t.A02;
                    if (num3 != null) {
                        r5.A0P(IgReactMediaPickerNativeModule.WIDTH, num3.intValue());
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        r5.A0Z();
    }
}
