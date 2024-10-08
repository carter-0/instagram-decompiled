package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cmz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44909Cmz {
    public static Map A00(C250753m0 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (r4.AZ1() != null) {
            C257543xZ AZ1 = r4.AZ1();
            if (AZ1 != null) {
                treeUpdaterJNI4 = AZ1.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("ad_disclaimer_info", treeUpdaterJNI4);
        }
        if (r4.getBackgroundColor() != null) {
            A1H.put("background_color", r4.getBackgroundColor());
        }
        if (r4.Aei() != null) {
            A1H.put("background_color_alpha", r4.Aei());
        }
        if (r4.AlN() != null) {
            C269824fk AlN = r4.AlN();
            if (AlN != null) {
                treeUpdaterJNI3 = AlN.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("caption_area", treeUpdaterJNI3);
        }
        if (r4.Avm() != null) {
            A1H.put("default_caption", r4.Avm());
        }
        if (r4.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r4.getDescription());
        }
        if (r4.Axo() != null) {
            C257543xZ Axo = r4.Axo();
            if (Axo != null) {
                treeUpdaterJNI2 = Axo.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("disclaimer_context", treeUpdaterJNI2);
        }
        if (r4.BCp() != null) {
            C269824fk BCp = r4.BCp();
            if (BCp != null) {
                treeUpdaterJNI = BCp.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("headline_position", treeUpdaterJNI);
        }
        if (r4.BKG() != null) {
            C269854fn BKG = r4.BKG();
            if (BKG != null) {
                treeUpdaterJNI5 = BKG.FHC();
            }
            A1H.put("keyword_highlight_info_list", treeUpdaterJNI5);
        }
        Map BRh = r4.BRh();
        if (BRh != null) {
            A1H.put("mention_user_list", BRh);
        }
        List BRk = r4.BRk();
        if (BRk != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BRk);
            Iterator it = BRk.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("mentioned_users", A0r);
        }
        if (r4.BvW() != null) {
            A1H.put("show_headline", r4.BvW());
        }
        if (r4.getText() != null) {
            C41845B3m.A10(r4.getText(), A1H);
        }
        if (r4.getTextColor() != null) {
            A1H.put("text_color", r4.getTextColor());
        }
        if (r4.C5c() != null) {
            A1H.put("text_size", r4.C5c());
        }
        return 0Yt.A0B(A1H);
    }
}
