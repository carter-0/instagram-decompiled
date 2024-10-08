package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.6tA  reason: invalid class name and case insensitive filesystem */
public abstract class C320916tA {
    public static C320926tC parseFromJson(16F r18) {
        String str;
        16F r2 = r18;
        0qQ.A0B(r2, 0);
        try {
            Integer num = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            MediaType mediaType = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("cdn_url".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("instruction_key_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("margin_bottom".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("margin_left".equals(A0q)) {
                    num4 = Integer.valueOf(r2.A1D());
                } else if ("margin_right".equals(A0q)) {
                    num5 = Integer.valueOf(r2.A1D());
                } else if ("margin_top".equals(A0q)) {
                    num6 = Integer.valueOf(r2.A1D());
                } else if ("media_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    mediaType = (MediaType) MediaType.A01.get(str);
                    if (mediaType == null) {
                        mediaType = MediaType.UNRECOGNIZED;
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            if (str2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("cdn_url", "AvatarProfilePicImpl");
            } else if (num == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "AvatarProfilePicImpl");
            } else if (str3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("instruction_key_id", "AvatarProfilePicImpl");
            } else if (num2 != null || !(r2 instanceof 0c9)) {
                return new C320926tC(mediaType, num3, num4, num5, num6, str2, str3, num.intValue(), num2.intValue());
            } else {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "AvatarProfilePicImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
