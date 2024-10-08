package X;

import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9wY  reason: invalid class name and case insensitive filesystem */
public abstract class C393509wY {
    public static StoryTemplateAvatarStickerOverlayDictImpl parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            String str3 = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("expression_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    f = AnonymousClass7TF.A0U(r12);
                } else if ("instruction_key_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("media_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("rotation".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r12);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r12);
                } else if ("x".equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r12);
                } else if ("y".equals(A17)) {
                    f5 = AnonymousClass7TF.A0U(r12);
                } else if ("z_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                }
                r12.A0z();
            }
            return new StoryTemplateAvatarStickerOverlayDictImpl(f, f2, f3, f4, f5, num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
