package X;

import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wG  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393329wG {
    public static Map A00(B39 b39) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        b39.B1g();
        A1H.put("end_time_ms", AnonymousClass7TF.A0T(b39.B1g()));
        b39.BCs();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TF.A0T(b39.BCs()));
        b39.BXs();
        A1H.put("offset_x", AnonymousClass7TF.A0T(b39.BXs()));
        b39.BXu();
        A1H.put("offset_y", AnonymousClass7TF.A0T(b39.BXu()));
        b39.Bog();
        A1H.put("rotation_degree", AnonymousClass7TF.A0T(b39.Bog()));
        b39.BpU();
        A1H.put("scale", AnonymousClass7TF.A0T(b39.BpU()));
        b39.Byr();
        A1H.put("start_time_ms", AnonymousClass7TF.A0T(b39.Byr()));
        if (b39.Bze() != null) {
            A1H.put("sticker_id", b39.Bze());
        }
        if (b39.Bzm() != null) {
            ClipsTemplatesStickerType Bzm = b39.Bzm();
            0qQ.A0B(Bzm, 0);
            A1H.put("sticker_type", Bzm.A00);
        }
        b39.CGW();
        A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TF.A0T(b39.CGW()));
        b39.getZIndex();
        return AnonymousClass7TG.A0s(A1H, b39.getZIndex());
    }
}
