package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CnU  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44934CnU {
    public static Map A00(DV0 dv0) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (dv0.Aoo() != null) {
            ProductCollection Aoo = dv0.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI3 = Aoo.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI3);
        }
        if (dv0.AzD() != null) {
            DropsLaunchAnimationIntf AzD = dv0.AzD();
            if (AzD != null) {
                treeUpdaterJNI2 = AzD.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("drops_launch_animation", treeUpdaterJNI2);
        }
        if (dv0.B2L() != null) {
            DropsEventPageNavigationMetadata B2L = dv0.B2L();
            if (B2L != null) {
                treeUpdaterJNI = B2L.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("event_page_navigation_metadata", treeUpdaterJNI);
        }
        if (dv0.getId() != null) {
            C41845B3m.A0x(dv0.getId(), A1H);
        }
        if (dv0.getMediaId() != null) {
            C41845B3m.A13(dv0.getMediaId(), A1H);
        }
        if (dv0.BRr() != null) {
            A1H.put("merchant_id", dv0.BRr());
        }
        if (dv0.Bzq() != null) {
            List<DS8> Bzq = dv0.Bzq();
            if (Bzq != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DS8 ds8 : Bzq) {
                    if (ds8 != null) {
                        arrayList.add(ds8.FHC());
                    }
                }
            }
            A1H.put("stickers", arrayList);
        }
        if (dv0.getText() != null) {
            C41845B3m.A10(dv0.getText(), A1H);
        }
        if (dv0.C5C() != null) {
            A1H.put("text_format", dv0.C5C());
        }
        if (dv0.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dv0.getUserId());
        }
        if (dv0.CDo() != null) {
            A1H.put("vibrant_text_color", dv0.CDo());
        }
        return 0Yt.A0B(A1H);
    }
}
