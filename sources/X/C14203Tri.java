package X;

import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tri  reason: case insensitive filesystem */
public abstract /* synthetic */ class C14203Tri {
    public static Map A00(StoryLinkInfoDictIntf storyLinkInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (storyLinkInfoDictIntf.AnT() != null) {
            linkedHashMap.put("click_id", storyLinkInfoDictIntf.AnT());
        }
        if (storyLinkInfoDictIntf.Auq() != null) {
            linkedHashMap.put("custom_cta", storyLinkInfoDictIntf.Auq());
        }
        if (storyLinkInfoDictIntf.AyG() != null) {
            linkedHashMap.put("display_url", storyLinkInfoDictIntf.AyG());
        }
        if (storyLinkInfoDictIntf.CRc() != null) {
            linkedHashMap.put("is_dynamic_dwell_enabled", storyLinkInfoDictIntf.CRc());
        }
        if (storyLinkInfoDictIntf.Cdp() != null) {
            linkedHashMap.put("is_universal_link", storyLinkInfoDictIntf.Cdp());
        }
        if (storyLinkInfoDictIntf.BMs() != null) {
            linkedHashMap.put("link_title", storyLinkInfoDictIntf.BMs());
        }
        if (storyLinkInfoDictIntf.BMv() != null) {
            linkedHashMap.put("link_type", storyLinkInfoDictIntf.BMv());
        }
        if (storyLinkInfoDictIntf.BYN() != null) {
            linkedHashMap.put("open_external_browser", storyLinkInfoDictIntf.BYN());
        }
        if (storyLinkInfoDictIntf.BuQ() != null) {
            linkedHashMap.put(C273654mx.A00(391), storyLinkInfoDictIntf.BuQ());
        }
        if (storyLinkInfoDictIntf.C4C() != null) {
            linkedHashMap.put(C273654mx.A00(409), storyLinkInfoDictIntf.C4C());
        }
        if (storyLinkInfoDictIntf.getUrl() != null) {
            linkedHashMap.put("url", storyLinkInfoDictIntf.getUrl());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
