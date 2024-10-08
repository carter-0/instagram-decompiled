package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class LIN {
    public static KN4 parseFromJson(16F r39) {
        String str;
        16F r9 = r39;
        0qQ.A0B(r9, 0);
        try {
            16L A11 = r9.A11();
            16L r13 = 16L.A0D;
            Integer num = null;
            if (A11 != r13) {
                r9.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            Integer num4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num5 = null;
            C53401GnY gnY = null;
            0v6 r27 = null;
            C376429Hy r25 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r12 = 16L.A09;
                if (A1J == r12) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("file_path".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("duration_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r9);
                } else if ("rotation".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r9);
                } else if ("fill_screen".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("is_replaced".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else if ("auto_created_reels_segment_info".equals(A17)) {
                    gnY = JVK.parseFromJson(r9);
                } else if ("is_from_draft".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r9);
                } else if ("has_template_reusable_asset".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r9);
                } else if (C273654mx.A00(993).equals(A17)) {
                    r27 = C61660oX.parseFromJson(r9);
                } else if ("layout_transform".equals(A17)) {
                    r25 = JVY.parseFromJson(r9);
                } else if ("original_medium_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("exif_data".equals(A17)) {
                    if (r9.A11() == r13) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r9.A1J() != r12) {
                            String A1P = r9.A1P();
                            r9.A1J();
                            if (r9.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r9.A1P();
                                if (str == null) {
                                }
                            }
                            hashMap.put(A1P, str);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("exif_orientation".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r9);
                }
                r9.A0z();
            }
            if (str2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("file_path", r9, "IgPhotoSegment");
            } else if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("duration_ms", r9, "IgPhotoSegment");
            } else if (num2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.WIDTH, r9, "IgPhotoSegment");
            } else if (num3 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.HEIGHT, r9, "IgPhotoSegment");
            } else if (num4 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("rotation", r9, "IgPhotoSegment");
            } else if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fill_screen", r9, "IgPhotoSegment");
            } else if (bool2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_replaced", r9, "IgPhotoSegment");
            } else if (bool3 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_from_draft", r9, "IgPhotoSegment");
            } else if (bool4 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_template_reusable_asset", r9, "IgPhotoSegment");
            } else if (num5 != null || !(r9 instanceof 0c9)) {
                return new KN4(r25, gnY, r27, str2, str3, hashMap, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                AnonymousClass7TF.A1L("exif_orientation", r9, "IgPhotoSegment");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, KN4 kn4) {
        r2.A0c();
        r2.A0R("file_path", kn4.A0D);
        r2.A0P("duration_ms", kn4.A00);
        r2.A0P(IgReactMediaPickerNativeModule.WIDTH, kn4.A0C);
        r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, kn4.A0A);
        r2.A0P("rotation", kn4.A0B);
        r2.A0S("fill_screen", kn4.A05);
        r2.A0S("is_replaced", kn4.A08);
        C53401GnY gnY = kn4.A02;
        if (gnY != null) {
            r2.A0q("auto_created_reels_segment_info");
            JVK.A00(gnY, r2);
        }
        r2.A0S("is_from_draft", kn4.A07);
        r2.A0S("has_template_reusable_asset", kn4.A06);
        0v6 r1 = kn4.A03;
        if (r1 != null) {
            r2.A0q(C273654mx.A00(993));
            C61660oX.A00(r2, r1);
        }
        if (kn4.A01 != null) {
            r2.A0q("layout_transform");
            JVY.A00(kn4.A01, r2);
        }
        String str = kn4.A04;
        if (str != null) {
            r2.A0R("original_medium_id", str);
        }
        Map map = kn4.A0E;
        if (map != null) {
            r2.A0q("exif_data");
            r2.A0c();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                C41847B3o.A1K(r2, A0u);
            }
            r2.A0Z();
        }
        r2.A0P("exif_orientation", kn4.A09);
        r2.A0Z();
    }
}
