package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cnl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44951Cnl {
    public static Map A00(UpcomingEventMedia upcomingEventMedia) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (upcomingEventMedia.AXm() != null) {
            A1H.put("accessibility_caption", upcomingEventMedia.AXm());
        }
        if (upcomingEventMedia.B2w() != null) {
            A1H.put("explore_pivot_grid", upcomingEventMedia.B2w());
        }
        if (upcomingEventMedia.BAZ() != null) {
            A1H.put("has_audio", upcomingEventMedia.BAZ());
        }
        if (upcomingEventMedia.getId() != null) {
            C41845B3m.A0x(upcomingEventMedia.getId(), A1H);
        }
        ArrayList arrayList = null;
        if (upcomingEventMedia.BFw() != null) {
            ProductImageContainer BFw = upcomingEventMedia.BFw();
            if (BFw != null) {
                treeUpdaterJNI2 = BFw.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("image", treeUpdaterJNI2);
        }
        if (upcomingEventMedia.BGO() != null) {
            ImageInfo BGO = upcomingEventMedia.BGO();
            if (BGO != null) {
                treeUpdaterJNI = BGO.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("image_versions2", treeUpdaterJNI);
        }
        if (upcomingEventMedia.getProductType() != null) {
            A1H.put("product_type", upcomingEventMedia.getProductType());
        }
        if (upcomingEventMedia.CDz() != null) {
            A1H.put("video_duration", upcomingEventMedia.CDz());
        }
        if (upcomingEventMedia.CEY() != null) {
            List CEY = upcomingEventMedia.CEY();
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
