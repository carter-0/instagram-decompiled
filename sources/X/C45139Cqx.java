package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cqx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45139Cqx {
    public static Map A00(UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (upcomingDropCampaignEventMetadata.Aoo() != null) {
            ProductCollection Aoo = upcomingDropCampaignEventMetadata.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI = Aoo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI);
        }
        if (upcomingDropCampaignEventMetadata.As2() != null) {
            UpcomingEventMedia As2 = upcomingDropCampaignEventMetadata.As2();
            if (As2 != null) {
                treeUpdaterJNI2 = As2.FHC();
            }
            A1H.put("cover_media", treeUpdaterJNI2);
        }
        if (upcomingDropCampaignEventMetadata.Az9() != null) {
            A1H.put("drop_campaign_id", upcomingDropCampaignEventMetadata.Az9());
        }
        if (upcomingDropCampaignEventMetadata.BLi() != null) {
            A1H.put("launch_type_subtitle", upcomingDropCampaignEventMetadata.BLi());
        }
        if (upcomingDropCampaignEventMetadata.BRo() != null) {
            C41847B3o.A1S(upcomingDropCampaignEventMetadata.BRo(), A1H);
        }
        if (upcomingDropCampaignEventMetadata.Bga() != null) {
            List Bga = upcomingDropCampaignEventMetadata.Bga();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = Bga.iterator();
            while (it.hasNext()) {
                C41848B3p.A1W(A1C, it);
            }
            A1H.put("products", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
