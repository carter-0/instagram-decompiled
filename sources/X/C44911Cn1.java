package X;

import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Cn1  reason: case insensitive filesystem */
public abstract class C44911Cn1 {
    public static ProductArEffectMetadata parseFromJson(16F r11) {
        String str;
        String str2;
        0qQ.A0B(r11, 0);
        try {
            16L A11 = r11.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r11.A0z();
                return null;
            }
            ContainerEffectEnum containerEffectEnum = null;
            DynamicEffectState dynamicEffectState = null;
            String str3 = null;
            HashMap hashMap = null;
            String str4 = null;
            EffectThumbnailImageDict effectThumbnailImageDict = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    return new ProductArEffectMetadata(containerEffectEnum, dynamicEffectState, effectThumbnailImageDict, str3, str4, hashMap);
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("container_effect_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                    containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(str2);
                    if (containerEffectEnum == null) {
                        containerEffectEnum = ContainerEffectEnum.UNRECOGNIZED;
                    }
                } else if ("dynamic_effect_state".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    dynamicEffectState = (DynamicEffectState) DynamicEffectState.A01.get(str);
                    if (dynamicEffectState == null) {
                        dynamicEffectState = DynamicEffectState.UNRECOGNIZED;
                    }
                } else if ("effect_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("effect_parameters".equals(A17)) {
                    if (r11.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r11.A1J() != r3) {
                            C41847B3o.A1M(r11, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("effect_parameters_data".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("effect_thumbnail_image".equals(A17)) {
                    effectThumbnailImageDict = C263074Hk.parseFromJson(r11);
                }
                r11.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
