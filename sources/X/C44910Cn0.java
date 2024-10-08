package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cn0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44910Cn0 {
    public static Map A00(ProductArEffectMetadataIntf productArEffectMetadataIntf) {
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (productArEffectMetadataIntf.AqK() != null) {
            ContainerEffectEnum AqK = productArEffectMetadataIntf.AqK();
            if (AqK != null) {
                str2 = AqK.A00;
            } else {
                str2 = null;
            }
            A1H.put("container_effect_type", str2);
        }
        if (productArEffectMetadataIntf.Azb() != null) {
            DynamicEffectState Azb = productArEffectMetadataIntf.Azb();
            if (Azb != null) {
                str = Azb.A00;
            } else {
                str = null;
            }
            A1H.put("dynamic_effect_state", str);
        }
        if (productArEffectMetadataIntf.getEffectId() != null) {
            A1H.put("effect_id", productArEffectMetadataIntf.getEffectId());
        }
        Map B06 = productArEffectMetadataIntf.B06();
        if (B06 != null) {
            A1H.put("effect_parameters", B06);
        }
        if (productArEffectMetadataIntf.B07() != null) {
            A1H.put("effect_parameters_data", productArEffectMetadataIntf.B07());
        }
        if (productArEffectMetadataIntf.B0G() != null) {
            EffectThumbnailImageDictIntf B0G = productArEffectMetadataIntf.B0G();
            if (B0G != null) {
                treeUpdaterJNI = B0G.FHC();
            }
            A1H.put("effect_thumbnail_image", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
