package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cme  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44888Cme {
    public static Map A00(AnonymousClass3UK r5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.getAlgorithm() != null) {
            A1H.put("algorithm", r5.getAlgorithm());
        }
        if (r5.Aeo() != null) {
            A1H.put("background_image_url", r5.Aeo());
        }
        if (r5.AlL() != null) {
            A1H.put("caption", r5.AlL());
        }
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (r5.Aux() != null) {
            C241273Oo Aux = r5.Aux();
            if (Aux != null) {
                treeUpdaterJNI3 = Aux.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("custom_profile_pic_url", treeUpdaterJNI3);
        }
        if (r5.B6t() != null) {
            A1H.put("followed_by", r5.B6t());
        }
        if (r5.BCB() != null) {
            A1H.put("has_stories", r5.BCB());
        }
        if (r5.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, r5.BE9());
        }
        if (r5.BIN() != null) {
            A1H.put("interest_topic", r5.BIN());
        }
        if (r5.CYE() != null) {
            A1H.put("is_new_suggestion", r5.CYE());
        }
        if (r5.BKX() != null) {
            A1H.put("large_urls", r5.BKX());
        }
        if (r5.BPt() != null) {
            A1H.put("media_count", r5.BPt());
        }
        if (r5.BQJ() != null) {
            A1H.put("media_ids", r5.BQJ());
        }
        List BQO = r5.BQO();
        if (BQO != null) {
            ArrayList A0p = AnonymousClass7TF.A0p(BQO);
            Iterator it = BQO.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0p, it);
            }
            A1H.put("media_infos", A0p);
        }
        if (r5.Bf3() != null) {
            C270824hM Bf3 = r5.Bf3();
            if (Bf3 != null) {
                treeUpdaterJNI2 = Bf3.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("preview_media", treeUpdaterJNI2);
        }
        if (r5.Bkl() != null) {
            A1H.put("reel_media_id", r5.Bkl());
        }
        if (r5.Bpp() != null) {
            A1H.put("score", AnonymousClass7TH.A0D(r5.Bpp()));
        }
        if (r5.BxN() != null) {
            A1H.put("social_context", r5.BxN());
        }
        List BxQ = r5.BxQ();
        if (BxQ != null) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(BxQ);
            Iterator it2 = BxQ.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1T(A0p2, it2);
            }
            A1H.put("social_context_facepile_users", A0p2);
        }
        if (r5.C76() != null) {
            A1H.put("thumbnail_urls", r5.C76());
        }
        if (r5.CCD() != null) {
            C266554Zl CCD = r5.CCD();
            if (CCD != null) {
                treeUpdaterJNI = CCD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("upsell_invite_card", treeUpdaterJNI);
        }
        C41846B3n.A1J(r5.CCd(), A1H);
        if (r5.CCz() != null) {
            C270844hO CCz = r5.CCz();
            if (CCz != null) {
                treeUpdaterJNI4 = CCz.FHC();
            }
            A1H.put("user_story", treeUpdaterJNI4);
        }
        if (r5.CDC() != null) {
            A1H.put("uuid", r5.CDC());
        }
        if (r5.CDL() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, AnonymousClass7TH.A0D(r5.CDL()));
        }
        return 0Yt.A0B(A1H);
    }
}
