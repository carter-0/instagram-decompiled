package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoY  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44995CoY {
    public static Map A00(QuestionMediaResponseModelIntf questionMediaResponseModelIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (questionMediaResponseModelIntf.BAZ() != null) {
            A1H.put("has_audio", questionMediaResponseModelIntf.BAZ());
        }
        if (questionMediaResponseModelIntf.getId() != null) {
            C41845B3m.A0x(questionMediaResponseModelIntf.getId(), A1H);
        }
        ArrayList arrayList = null;
        if (questionMediaResponseModelIntf.BGO() != null) {
            ImageInfo BGO = questionMediaResponseModelIntf.BGO();
            if (BGO != null) {
                treeUpdaterJNI2 = BGO.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("image_versions2", treeUpdaterJNI2);
        }
        if (questionMediaResponseModelIntf.CRC() != null) {
            A1H.put("is_dash_eligible", questionMediaResponseModelIntf.CRC());
        }
        if (questionMediaResponseModelIntf.BR8() != null) {
            A1H.put("media_type", questionMediaResponseModelIntf.BR8());
        }
        if (questionMediaResponseModelIntf.BZ3() != null) {
            A1H.put("original_height", questionMediaResponseModelIntf.BZ3());
        }
        if (questionMediaResponseModelIntf.BZH() != null) {
            A1H.put("original_width", questionMediaResponseModelIntf.BZH());
        }
        if (questionMediaResponseModelIntf.C78() != null) {
            SpritesheetInfo C78 = questionMediaResponseModelIntf.C78();
            if (C78 != null) {
                treeUpdaterJNI = C78.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("thumbnails", treeUpdaterJNI);
        }
        if (questionMediaResponseModelIntf.getVideoCodec() != null) {
            A1H.put("video_codec", questionMediaResponseModelIntf.getVideoCodec());
        }
        if (questionMediaResponseModelIntf.getVideoDashManifest() != null) {
            A1H.put("video_dash_manifest", questionMediaResponseModelIntf.getVideoDashManifest());
        }
        if (questionMediaResponseModelIntf.CEE() != null) {
            A1H.put("video_path", questionMediaResponseModelIntf.CEE());
        }
        if (questionMediaResponseModelIntf.CEY() != null) {
            List CEY = questionMediaResponseModelIntf.CEY();
            if (CEY != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = CEY.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1X(arrayList, it);
                }
            }
            A1H.put("video_versions", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
