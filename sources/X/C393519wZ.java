package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wZ  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393519wZ {
    public static Map A00(StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateCaptionDictIntf.Aak() != null) {
            A1H.put("alignment", storyTemplateCaptionDictIntf.Aak());
        }
        if (storyTemplateCaptionDictIntf.Abi() != null) {
            A1H.put("animation", storyTemplateCaptionDictIntf.Abi());
        }
        if (storyTemplateCaptionDictIntf.Ap4() != null) {
            A1H.put("colors", storyTemplateCaptionDictIntf.Ap4());
        }
        if (storyTemplateCaptionDictIntf.B0J() != null) {
            A1H.put("effects", storyTemplateCaptionDictIntf.B0J());
        }
        storyTemplateCaptionDictIntf.B78();
        A1H.put("font_size", AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.B78()));
        if (storyTemplateCaptionDictIntf.B7W() != null) {
            ClipsTextFormatType B7W = storyTemplateCaptionDictIntf.B7W();
            0qQ.A0B(B7W, 0);
            A1H.put("format_type", B7W.A00);
        }
        storyTemplateCaptionDictIntf.BCs();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.BCs()));
        storyTemplateCaptionDictIntf.Bod();
        A1H.put("rotation", AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.Bod()));
        storyTemplateCaptionDictIntf.BpU();
        A1H.put("scale", AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.BpU()));
        if (storyTemplateCaptionDictIntf.Bqa() != null) {
            A1H.put("secondary_color", storyTemplateCaptionDictIntf.Bqa());
        }
        if (storyTemplateCaptionDictIntf.getText() != null) {
            A1H.put("text", storyTemplateCaptionDictIntf.getText());
        }
        storyTemplateCaptionDictIntf.CGW();
        A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.CGW()));
        storyTemplateCaptionDictIntf.CGs();
        A1H.put("x", AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.CGs()));
        storyTemplateCaptionDictIntf.CHR();
        A1H.put("y", AnonymousClass7TF.A0T(storyTemplateCaptionDictIntf.CHR()));
        storyTemplateCaptionDictIntf.getZIndex();
        return AnonymousClass7TG.A0s(A1H, storyTemplateCaptionDictIntf.getZIndex());
    }
}
