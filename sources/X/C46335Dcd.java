package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dcd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C46335Dcd {
    public static Map A00(C253443qn r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.AnT() != null) {
            linkedHashMap.put("click_id", r3.AnT());
        }
        if (r3.B45() != null) {
            C282085Bj B45 = r3.B45();
            if (B45 != null) {
                treeUpdaterJNI = B45.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fb_biolink_social_context", treeUpdaterJNI);
        }
        if (r3.B9x() != null) {
            linkedHashMap.put("group_id", r3.B9x());
        }
        if (r3.BEP() != null) {
            linkedHashMap.put("icon_url", r3.BEP());
        }
        if (r3.BGL() != null) {
            linkedHashMap.put("image_url", r3.BGL());
        }
        r3.CZA();
        linkedHashMap.put("is_pinned", Boolean.valueOf(r3.CZA()));
        r3.isVerified();
        linkedHashMap.put("is_verified", Boolean.valueOf(r3.isVerified()));
        if (r3.BMn() != null) {
            linkedHashMap.put("link_id", r3.BMn());
        }
        if (r3.BMt() != null) {
            IgUserBioLinkTypeEnum BMt = r3.BMt();
            0qQ.A0B(BMt, 0);
            linkedHashMap.put("link_type", BMt.A00);
        }
        if (r3.BOm() != null) {
            linkedHashMap.put("lynx_url", r3.BOm());
        }
        if (r3.BYO() != null) {
            linkedHashMap.put("open_external_url_with_in_app_browser", r3.BYO());
        }
        if (r3.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        if (r3.getUrl() != null) {
            linkedHashMap.put("url", r3.getUrl());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
