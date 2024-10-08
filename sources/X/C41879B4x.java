package X;

import com.instagram.model.androidlink.AndroidLink;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4x  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41879B4x {
    public static Map A00(AndroidLink androidLink) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (androidLink.AbZ() != null) {
            A1H.put("androidClass", androidLink.AbZ());
        }
        if (androidLink.Ac5() != null) {
            A1H.put("appId", androidLink.Ac5());
        }
        if (androidLink.Ac8() != null) {
            A1H.put("appInstallObjectiveInvalidationBehavior", androidLink.Ac8());
        }
        if (androidLink.getAppName() != null) {
            A1H.put("appName", androidLink.getAppName());
        }
        if (androidLink.AjY() != null) {
            A1H.put("callToActionTitle", androidLink.AjY());
        }
        if (androidLink.AlA() != null) {
            A1H.put("canvasData", androidLink.AlA());
        }
        if (androidLink.AlB() != null) {
            A1H.put("canvasDocId", androidLink.AlB());
        }
        if (androidLink.Aqe() != null) {
            A1H.put("contentId", androidLink.Aqe());
        }
        if (androidLink.Avj() != null) {
            A1H.put("deeplinkUri", androidLink.Avj());
        }
        if (androidLink.Awc() != null) {
            A1H.put(AnonymousClass000.A00(4700), androidLink.Awc());
        }
        if (androidLink.B8i() != null) {
            A1H.put("funnelId", androidLink.B8i());
        }
        if (androidLink.B8j() != null) {
            A1H.put("funnelPurpose", androidLink.B8j());
        }
        if (androidLink.BFh() != null) {
            A1H.put("igUserId", androidLink.BFh());
        }
        if (androidLink.COj() != null) {
            A1H.put("isAndroidAppLink", androidLink.COj());
        }
        if (androidLink.Cb3() != null) {
            A1H.put("isSKOverlayEnabled", androidLink.Cb3());
        }
        if (androidLink.Cdp() != null) {
            A1H.put("isUniversalLink", androidLink.Cdp());
        }
        if (androidLink.Cev() != null) {
            A1H.put("isVtOdirEligible", androidLink.Cev());
        }
        if (androidLink.BM9() != null) {
            A1H.put("leadGenFormId", androidLink.BM9());
        }
        if (androidLink.BMu() != null) {
            A1H.put("linkType", androidLink.BMu());
        }
        if (androidLink.CHl() != null) {
            A1H.put("package", androidLink.CHl());
        }
        if (androidLink.Bd3() != null) {
            A1H.put("playableUri", androidLink.Bd3());
        }
        if (androidLink.BgP() != null) {
            A1H.put("productPageId", androidLink.BgP());
        }
        if (androidLink.Bji() != null) {
            A1H.put("rawWebUri", androidLink.Bji());
        }
        if (androidLink.BkT() != null) {
            A1H.put("redirectUri", androidLink.BkT());
        }
        if (androidLink.BlB() != null) {
            A1H.put("referrerData", androidLink.BlB());
        }
        if (androidLink.C4A() != null) {
            A1H.put("tapAndHoldContext", androidLink.C4A());
        }
        if (androidLink.CGH() != null) {
            A1H.put("webUri", androidLink.CGH());
        }
        return 0Yt.A0B(A1H);
    }
}
