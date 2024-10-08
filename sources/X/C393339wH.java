package X;

import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9wH  reason: invalid class name and case insensitive filesystem */
public abstract class C393339wH {
    public static C381839cd parseFromJson(16F r35) {
        String str;
        16F r13 = r35;
        0qQ.A0B(r13, 0);
        try {
            Float f = null;
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            Integer num = null;
            String str2 = null;
            ClipsTemplatesStickerType clipsTemplatesStickerType = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("end_time_ms".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r13);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r13);
                } else if ("offset_x".equals(A17)) {
                    f3 = AnonymousClass7TF.A0V(r13);
                } else if ("offset_y".equals(A17)) {
                    f4 = AnonymousClass7TF.A0V(r13);
                } else if ("rotation_degree".equals(A17)) {
                    f5 = AnonymousClass7TF.A0V(r13);
                } else if ("scale".equals(A17)) {
                    f6 = AnonymousClass7TF.A0V(r13);
                } else if ("start_time_ms".equals(A17)) {
                    f7 = AnonymousClass7TF.A0V(r13);
                } else if ("sticker_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("sticker_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    clipsTemplatesStickerType = (ClipsTemplatesStickerType) ClipsTemplatesStickerType.A01.get(str);
                    if (clipsTemplatesStickerType == null) {
                        clipsTemplatesStickerType = ClipsTemplatesStickerType.UNRECOGNIZED;
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    f8 = AnonymousClass7TF.A0V(r13);
                } else if ("z_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                }
                r13.A0z();
            }
            if (f == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_time_ms", r13, "ClipsStickerInfoImpl");
            } else if (f2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.HEIGHT, r13, "ClipsStickerInfoImpl");
            } else if (f3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("offset_x", r13, "ClipsStickerInfoImpl");
            } else if (f4 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("offset_y", r13, "ClipsStickerInfoImpl");
            } else if (f5 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("rotation_degree", r13, "ClipsStickerInfoImpl");
            } else if (f6 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("scale", r13, "ClipsStickerInfoImpl");
            } else if (f7 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start_time_ms", r13, "ClipsStickerInfoImpl");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_id", r13, "ClipsStickerInfoImpl");
            } else if (clipsTemplatesStickerType == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_type", r13, "ClipsStickerInfoImpl");
            } else if (f8 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.WIDTH, r13, "ClipsStickerInfoImpl");
            } else if (num != null || !(r13 instanceof 0c9)) {
                return new C381839cd(clipsTemplatesStickerType, str2, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), f6.floatValue(), f7.floatValue(), f8.floatValue(), num.intValue());
            } else {
                AnonymousClass7TF.A1L("z_index", r13, "ClipsStickerInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
