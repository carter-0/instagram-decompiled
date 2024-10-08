package X;

import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cbq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44255Cbq {
    public static Map A00(ProductArtsLabelInformationDict productArtsLabelInformationDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productArtsLabelInformationDict.getLabelDisplayValue() != null) {
            A1H.put("label_display_value", productArtsLabelInformationDict.getLabelDisplayValue());
        }
        if (productArtsLabelInformationDict.getLabelType() != null) {
            A1H.put("label_type", productArtsLabelInformationDict.getLabelType());
        }
        return 0Yt.A0B(A1H);
    }
}
