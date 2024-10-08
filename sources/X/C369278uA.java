package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.8uA  reason: invalid class name and case insensitive filesystem */
public abstract class C369278uA {
    public static StoryTemplateCaptionDict parseFromJson(16F r40) {
        0LH r1;
        String str;
        String str2;
        16F r2 = r40;
        0qQ.A0B(r2, 0);
        try {
            Float f = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Float f4 = null;
            ClipsTextFormatType clipsTextFormatType = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            String str7 = null;
            String str8 = null;
            Integer num = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("alignment".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("animation".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("colors".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("effects".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("font_size".equals(A0q)) {
                    f = Float.valueOf((float) r2.A0U());
                } else if ("format_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                    clipsTextFormatType = C248693iQ.A00(str2);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = Float.valueOf((float) r2.A0U());
                } else if ("rotation".equals(A0q)) {
                    f3 = Float.valueOf((float) r2.A0U());
                } else if ("scale".equals(A0q)) {
                    f4 = Float.valueOf((float) r2.A0U());
                } else if ("secondary_color".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f5 = Float.valueOf((float) r2.A0U());
                } else if ("x".equals(A0q)) {
                    f6 = Float.valueOf((float) r2.A0U());
                } else if ("y".equals(A0q)) {
                    f7 = Float.valueOf((float) r2.A0U());
                } else if ("z_index".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            if (str3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("alignment", "StoryTemplateCaptionDict");
            } else if (str4 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("animation", "StoryTemplateCaptionDict");
            } else if (str5 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("colors", "StoryTemplateCaptionDict");
            } else if (str6 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("effects", "StoryTemplateCaptionDict");
            } else if (f == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("font_size", "StoryTemplateCaptionDict");
            } else if (clipsTextFormatType == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("format_type", "StoryTemplateCaptionDict");
            } else if (f2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "StoryTemplateCaptionDict");
            } else if (f3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("rotation", "StoryTemplateCaptionDict");
            } else if (f4 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("scale", "StoryTemplateCaptionDict");
            } else if (str8 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("text", "StoryTemplateCaptionDict");
            } else if (f5 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "StoryTemplateCaptionDict");
            } else if (f6 != null || !(r2 instanceof 0c9)) {
                if (f7 == null && (r2 instanceof 0c9)) {
                    r1 = ((0c9) r2).A03;
                    str = "y";
                } else if (num != null || !(r2 instanceof 0c9)) {
                    return new StoryTemplateCaptionDict(clipsTextFormatType, str3, str4, str5, str6, str7, str8, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), f6.floatValue(), f7.floatValue(), num.intValue());
                } else {
                    r1 = ((0c9) r2).A03;
                    str = "z_index";
                }
                r1.A00(str, "StoryTemplateCaptionDict");
            } else {
                ((0c9) r2).A03.A00("x", "StoryTemplateCaptionDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
