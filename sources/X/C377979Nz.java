package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Nz  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C377979Nz {
    public static Map A00(C248923io r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Aah() != null) {
            ClipsTextAlignment Aah = r4.Aah();
            0qQ.A0B(Aah, 0);
            A1H.put("alignment", Aah.A00);
        }
        if (r4.Ap5() != null) {
            List<C248643iK> Ap5 = r4.Ap5();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C248643iK r0 : Ap5) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("colors", A1C);
        }
        r4.B1g();
        A1H.put("end_time_ms", AnonymousClass7TF.A0T(r4.B1g()));
        r4.B78();
        A1H.put("font_size", AnonymousClass7TF.A0T(r4.B78()));
        r4.BCs();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TF.A0T(r4.BCs()));
        if (r4.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.getId());
        }
        r4.isAnimated();
        A1H.put("is_animated", Integer.valueOf(r4.isAnimated()));
        r4.BXs();
        A1H.put("offset_x", AnonymousClass7TF.A0T(r4.BXs()));
        r4.BXu();
        A1H.put("offset_y", AnonymousClass7TF.A0T(r4.BXu()));
        r4.Bog();
        A1H.put("rotation_degree", AnonymousClass7TF.A0T(r4.Bog()));
        r4.BpU();
        A1H.put("scale", AnonymousClass7TF.A0T(r4.BpU()));
        r4.Byr();
        A1H.put("start_time_ms", AnonymousClass7TF.A0T(r4.Byr()));
        if (r4.getText() != null) {
            A1H.put("text", r4.getText());
        }
        if (r4.C56() != null) {
            ClipsTextEmphasisMode C56 = r4.C56();
            0qQ.A0B(C56, 0);
            A1H.put("text_emphasis_mode", C56.A00);
        }
        if (r4.C5D() != null) {
            ClipsTextFormatType C5D = r4.C5D();
            0qQ.A0B(C5D, 0);
            A1H.put("text_format_type", C5D.A00);
        }
        r4.CGW();
        A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TF.A0T(r4.CGW()));
        r4.getZIndex();
        return AnonymousClass7TG.A0s(A1H, r4.getZIndex());
    }
}
