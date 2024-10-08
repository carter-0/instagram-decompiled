package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B48 {
    public static Map A00(ImageInfo imageInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = null;
        if (imageInfo.AZb() != null) {
            AdditionalCandidates AZb = imageInfo.AZb();
            if (AZb != null) {
                treeUpdaterJNI3 = AZb.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("additional_candidates", treeUpdaterJNI3);
        }
        if (imageInfo.Abg() != null) {
            SpriteSheetInfoCandidates Abg = imageInfo.Abg();
            if (Abg != null) {
                treeUpdaterJNI2 = Abg.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("animated_thumbnail_spritesheet_info_candidates", treeUpdaterJNI2);
        }
        if (imageInfo.Al9() != null) {
            List<ExtendedImageUrl> Al9 = imageInfo.Al9();
            if (Al9 != null) {
                arrayList = new ArrayList();
                for (ExtendedImageUrl extendedImageUrl : Al9) {
                    if (extendedImageUrl != null) {
                        arrayList.add(extendedImageUrl.A00());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("candidates", arrayList);
        }
        if (imageInfo.BqD() != null) {
            SpriteSheetInfoCandidates BqD = imageInfo.BqD();
            if (BqD != null) {
                treeUpdaterJNI = BqD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("scrubber_spritesheet_info_candidates", treeUpdaterJNI);
        }
        if (imageInfo.ByG() != null) {
            List<ExtendedImageUrl> ByG = imageInfo.ByG();
            if (ByG != null) {
                arrayList2 = new ArrayList();
                for (ExtendedImageUrl extendedImageUrl2 : ByG) {
                    if (extendedImageUrl2 != null) {
                        arrayList2.add(extendedImageUrl2.A00());
                    }
                }
            }
            linkedHashMap.put("spins_underlying_media_candidates", arrayList2);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
