package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cz3  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45591Cz3 {
    public static C277994w4 A00(C277994w4 r2, C277994w4 r3) {
        C45462Cwt cwt = new C45462Cwt(r2);
        if (r3.Af8() != null) {
            cwt.A00 = r3.Af8();
        }
        C257593xe Af9 = r3.Af9();
        if (Af9 != null) {
            cwt.A02 = Af9;
        }
        C257593xe AgG = r3.AgG();
        if (AgG != null) {
            cwt.A03 = AgG;
        }
        if (r3.Aj1() != null) {
            cwt.A0D = r3.Aj1();
        }
        if (r3.getDescription() != null) {
            cwt.A08 = r3.getDescription();
        }
        if (r3.BE7() != null) {
            cwt.A01 = r3.BE7();
        }
        if (r3.BTS() != null) {
            cwt.A05 = r3.BTS();
        }
        if (r3.BZk() != null) {
            cwt.A06 = r3.BZk();
        }
        C257593xe BZl = r3.BZl();
        if (BZl != null) {
            cwt.A04 = BZl;
        }
        if (r3.BZn() != null) {
            cwt.A07 = r3.BZn();
        }
        if (r3.getOverlayType() != null) {
            cwt.A09 = r3.getOverlayType();
        }
        if (r3.getSessionId() != null) {
            cwt.A0A = r3.getSessionId();
        }
        if (r3.getSubCategory() != null) {
            cwt.A0B = r3.getSubCategory();
        }
        if (r3.getTitle() != null) {
            cwt.A0C = r3.getTitle();
        }
        return cwt.A01();
    }

    public static Map A01(C277994w4 r5) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r5.Af8() != null) {
            C278014w6 Af8 = r5.Af8();
            if (Af8 != null) {
                treeUpdaterJNI = Af8.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("banner", treeUpdaterJNI);
        }
        C257593xe Af9 = r5.Af9();
        if (Af9 != null) {
            A1H.put("banner_bloks_data", Af9.A00());
        }
        C257593xe AgG = r5.AgG();
        if (AgG != null) {
            A1H.put("bloks_data", AgG.A00());
        }
        if (r5.Aj1() != null) {
            List<C278014w6> Aj1 = r5.Aj1();
            if (Aj1 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C278014w6 r0 : Aj1) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("buttons", arrayList);
        }
        if (r5.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r5.getDescription());
        }
        if (r5.BE7() != null) {
            C278034w8 BE7 = r5.BE7();
            if (BE7 != null) {
                treeUpdaterJNI2 = BE7.FHC();
            }
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI2);
        }
        if (r5.BTS() != null) {
            A1H.put("misinformation_type", r5.BTS());
        }
        if (r5.BZk() != null) {
            A1H.put("overlay_applied_timestamp", r5.BZk());
        }
        C257593xe BZl = r5.BZl();
        if (BZl != null) {
            A1H.put("overlay_bloks_data", BZl.A00());
        }
        if (r5.BZn() != null) {
            A1H.put("overlay_layout", r5.BZn());
        }
        if (r5.getOverlayType() != null) {
            A1H.put("overlay_type", r5.getOverlayType());
        }
        if (r5.getSessionId() != null) {
            A1H.put(Dbh.A01(0, 10, 58), r5.getSessionId());
        }
        if (r5.getSubCategory() != null) {
            A1H.put("sub_category", r5.getSubCategory());
        }
        if (r5.getTitle() != null) {
            C41845B3m.A12(r5.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
