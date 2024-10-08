package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgT  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44533CgT {
    public static Map A00(TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (textWithEntitiesBlockDictIntf.getBlockType() != null) {
            A1H.put("block_type", textWithEntitiesBlockDictIntf.getBlockType());
        }
        if (textWithEntitiesBlockDictIntf.AwO() != null) {
            A1H.put("depth", textWithEntitiesBlockDictIntf.AwO());
        }
        if (textWithEntitiesBlockDictIntf.C5k() != null) {
            TextWithEntitiesIntf C5k = textWithEntitiesBlockDictIntf.C5k();
            if (C5k != null) {
                treeUpdaterJNI = C5k.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("text_with_entities", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
