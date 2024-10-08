package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B7q  reason: case insensitive filesystem */
public abstract class C41939B7q {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v25, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v29, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r4v50 */
    /* JADX WARNING: type inference failed for: r4v51 */
    /* JADX WARNING: type inference failed for: r4v52 */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r4v54 */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r4v58 */
    /* JADX WARNING: type inference failed for: r4v59 */
    /* JADX WARNING: type inference failed for: r4v60 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C41938B7p parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.B7p r0 = new X.B7p     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x045f
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0460
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.String r1 = "ad_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x003a:
            r0.A0R = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x003c:
            r5.A0z()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "tracking_token"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x005a
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0054
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0054:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0c = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x005a:
            java.lang.String r1 = "label"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0074
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x006e
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x006e:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0X = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0074:
            java.lang.String r1 = "hide_reasons_v2"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x00a1
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x009b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0089:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x009b
            X.3lA r1 = X.C250253l9.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0089
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x0089
        L_0x009b:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0h = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x00a1:
            java.lang.String r1 = "ad_title"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x00bb
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x00b5
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x00b5:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0T = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x00bb:
            java.lang.String r1 = "ads_shopping_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x00cb
            X.3xc r1 = X.C45504Cxe.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A01 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x00cb:
            java.lang.String r1 = "cookies"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0101
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x00fa
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x00e0:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x00fa
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x00e0
            java.lang.String r1 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x00e0
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x00e0
        L_0x00fa:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0e = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0101:
            java.lang.String r1 = "client_gap_rules"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0111
            X.2vo r1 = X.C250043ko.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0H = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0111:
            java.lang.String r1 = "link_text"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0129
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0125
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0125:
            r0.A0Y = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0129:
            java.lang.String r1 = "android_links"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0157
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x0150
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x013e:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0150
            com.instagram.model.androidlink.AndroidLinkImpl r1 = X.C250113kv.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x013e
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x013e
        L_0x0150:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0d = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0157:
            java.lang.String r1 = "media_type"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x016b
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0O = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x016b:
            java.lang.String r1 = "media_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0183
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x017f
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x017f:
            r0.A0Z = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0183:
            java.lang.String r1 = "items"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x01b1
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x01aa
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0198:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x01aa
            X.1Xj r1 = X.1Xj.A00(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0198
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x0198
        L_0x01aa:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0i = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x01b1:
            java.lang.String r1 = "interaction_timestamp"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x01c9
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x01c5
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x01c5:
            r0.A0W = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x01c9:
            java.lang.String r1 = "media_background"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x01d9
            X.3xy r1 = X.C271234iU.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0B = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x01d9:
            java.lang.String r1 = "creative_transformations"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x01e9
            X.3xi r1 = X.C300545xN.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A05 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x01e9:
            java.lang.String r1 = "dominant_color"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0201
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x01fd
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x01fd:
            r0.A0V = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0201:
            java.lang.String r1 = "overlay_subtitle"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0219
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0215
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0215:
            r0.A0S = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0219:
            java.lang.String r1 = "music_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0229
            X.3y3 r1 = X.C45627Czd.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0C = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0229:
            java.lang.String r1 = "reels_mid_scene_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0239
            X.3y9 r1 = X.C56349Hx0.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0F = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0239:
            java.lang.String r1 = "reels_multi_ads_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0249
            X.3yB r1 = X.C45094CqC.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0G = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0249:
            java.lang.String r1 = "is_sensitive_vertical_ad"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x025d
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0M = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x025d:
            java.lang.String r1 = "overlay_ad_host_media_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0275
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0271
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0271:
            r0.A0b = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0275:
            java.lang.String r1 = "display_domain"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x028d
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0289
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0289:
            r0.A0U = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x028d:
            java.lang.String r1 = "dynamic_ads_links"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x02b8
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x02b4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x02a2:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x02b4
            X.BEd r1 = X.C45541CyF.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x02a2
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x02a2
        L_0x02b4:
            r0.A0g = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x02b8:
            java.lang.String r1 = "dynamic_product_ad_display_option"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x02dc
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x02cc
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x02cc:
            java.util.Map r1 = com.instagram.api.schemas.DynamicProductAdDisplayOption.A01     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            com.instagram.api.schemas.DynamicProductAdDisplayOption r1 = (com.instagram.api.schemas.DynamicProductAdDisplayOption) r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 != 0) goto L_0x02d8
            com.instagram.api.schemas.DynamicProductAdDisplayOption r1 = com.instagram.api.schemas.DynamicProductAdDisplayOption.UNRECOGNIZED     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x02d8:
            r0.A06 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x02dc:
            java.lang.String r1 = "cta_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x02ec
            X.3xk r1 = X.C45517Cxr.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A03 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x02ec:
            java.lang.String r1 = "enable_reels_end_scene"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0300
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0J = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0300:
            java.lang.String r1 = "cop_render_output"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x032b
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 != r1) goto L_0x0327
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r4.<init>()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0315:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0327
            X.3kq r1 = X.C250053kp.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0315
            r4.add(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x0315
        L_0x0327:
            r0.A0f = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x032b:
            java.lang.String r1 = "view_state_item_type"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x033f
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0P = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x033f:
            java.lang.String r1 = "brs_threshold"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0353
            long r3 = r5.A0y()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0Q = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0353:
            java.lang.String r1 = "multi_ads_data"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0363
            X.CtZ r1 = X.C44615Chn.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0D = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0363:
            java.lang.String r1 = "format_type"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0387
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x0377
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0377:
            java.util.Map r1 = com.instagram.api.schemas.AdFormatType.A01     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            com.instagram.api.schemas.AdFormatType r1 = (com.instagram.api.schemas.AdFormatType) r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 != 0) goto L_0x0383
            com.instagram.api.schemas.AdFormatType r1 = com.instagram.api.schemas.AdFormatType.UNRECOGNIZED     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x0383:
            r0.A00 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0387:
            java.lang.String r1 = "carousel_rendering_configuration"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0397
            X.493 r1 = X.CVR.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A04 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0397:
            java.lang.String r1 = "overlay_ads_format"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03a7
            X.4gF r1 = X.CbG.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0A = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03a7:
            java.lang.String r1 = "is_rev_share"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03bb
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0L = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03bb:
            java.lang.String r1 = "afi_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03cb
            X.3l1 r1 = X.C250163l0.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A02 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03cb:
            java.lang.String r1 = "gesture_to_action_info"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03db
            X.3xp r1 = X.C41941B7s.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A07 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03db:
            java.lang.String r1 = "on_impressions_control"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03eb
            X.3y5 r1 = X.C278574x8.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A09 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03eb:
            java.lang.String r1 = "research_survey"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x03fb
            X.Cw7 r1 = X.C44619Chr.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0E = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x03fb:
            java.lang.String r1 = "multi_ads_media_tap_destination"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0413
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r3 == r1) goto L_0x040f
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
        L_0x040f:
            r0.A0a = r4     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0413:
            java.lang.String r1 = "should_fetch_preview_comments"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x0427
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0N = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x0427:
            java.lang.String r1 = "enable_ads_follow_button"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x043b
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0I = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x043b:
            java.lang.String r1 = "is_delayed_skip_ad"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x044f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A0K = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x044f:
            java.lang.String r1 = "lead_gen_preclick_data"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            if (r1 == 0) goto L_0x003c
            X.4zJ r1 = X.C279764zH.parseFromJson(r5)     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            r0.A08 = r1     // Catch:{ IOException -> 0x0467, Exception -> 0x0461 }
            goto L_0x003c
        L_0x045f:
            r0 = 0
        L_0x0460:
            return r0
        L_0x0461:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0467:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41939B7q.parseFromJson(X.16F):X.B7p");
    }

    public static void A00(17Z r8, C41938B7p b7p) {
        String str;
        r8.A0c();
        String str2 = b7p.A0R;
        if (str2 != null) {
            r8.A0R("ad_id", str2);
        }
        String str3 = b7p.A0c;
        if (str3 != null) {
            r8.A0R("tracking_token", str3);
            String str4 = b7p.A0X;
            if (str4 != null) {
                r8.A0R("label", str4);
                if (b7p.A0h != null) {
                    16P.A03(r8, "hide_reasons_v2");
                    List<C250263lA> list = b7p.A0h;
                    if (list != null) {
                        for (C250263lA r3 : list) {
                            if (r3 != null) {
                                r8.A0c();
                                String str5 = r3.A00;
                                if (str5 != null) {
                                    r8.A0R("reason", str5);
                                }
                                C41846B3n.A0z(r8, r3.A01);
                                r8.A0Z();
                            }
                        }
                        r8.A0Y();
                        String str6 = b7p.A0T;
                        if (str6 != null) {
                            r8.A0R("ad_title", str6);
                            if (b7p.A01 != null) {
                                r8.A0q("ads_shopping_info");
                                C45504Cxe.A00(r8, b7p.A01);
                            }
                            str = "cookies";
                            if (b7p.A0e != null) {
                                16P.A03(r8, str);
                                List list2 = b7p.A0e;
                                if (list2 != null) {
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        C41846B3n.A18(r8, it);
                                    }
                                    r8.A0Y();
                                    if (b7p.A0H != null) {
                                        r8.A0q("client_gap_rules");
                                        C250043ko.A00(r8, b7p.A0H);
                                    }
                                    String str7 = b7p.A0Y;
                                    if (str7 != null) {
                                        r8.A0R("link_text", str7);
                                    }
                                    16P.A03(r8, "android_links");
                                    for (AndroidLinkImpl androidLinkImpl : b7p.A0d) {
                                        if (androidLinkImpl != null) {
                                            C250113kv.A00(r8, androidLinkImpl);
                                        }
                                    }
                                    r8.A0Y();
                                    Integer num = b7p.A0O;
                                    if (num != null) {
                                        r8.A0P("media_type", num.intValue());
                                    }
                                    C41846B3n.A11(r8, b7p.A0Z);
                                    b7p.A02();
                                    16P.A03(r8, DialogModule.KEY_ITEMS);
                                    Iterator it2 = b7p.A02().iterator();
                                    while (it2.hasNext()) {
                                        C41848B3p.A1O(r8, it2);
                                    }
                                    r8.A0Y();
                                    String str8 = b7p.A0W;
                                    if (str8 != null) {
                                        r8.A0R("interaction_timestamp", str8);
                                    }
                                    if (b7p.A0B != null) {
                                        r8.A0q("media_background");
                                        C271234iU.A00(r8, b7p.A0B);
                                    }
                                    if (b7p.A05 != null) {
                                        r8.A0q("creative_transformations");
                                        C300545xN.A00(r8, b7p.A05);
                                    }
                                    String str9 = b7p.A0V;
                                    if (str9 != null) {
                                        r8.A0R("dominant_color", str9);
                                    }
                                    String str10 = b7p.A0S;
                                    if (str10 != null) {
                                        r8.A0R("overlay_subtitle", str10);
                                    }
                                    if (b7p.A0C != null) {
                                        r8.A0q("music_info");
                                        C45627Czd.A00(r8, b7p.A0C);
                                    }
                                    if (b7p.A0F != null) {
                                        r8.A0q("reels_mid_scene_info");
                                        C56349Hx0.A00(r8, b7p.A0F);
                                    }
                                    if (b7p.A0G != null) {
                                        r8.A0q("reels_multi_ads_info");
                                        C257923yB r0 = b7p.A0G;
                                        r8.A0c();
                                        String str11 = r0.A00;
                                        if (str11 != null) {
                                            r8.A0R("ad_info_text", str11);
                                        }
                                        r8.A0Z();
                                    }
                                    Boolean bool = b7p.A0M;
                                    if (bool != null) {
                                        r8.A0S("is_sensitive_vertical_ad", bool.booleanValue());
                                    }
                                    String str12 = b7p.A0b;
                                    if (str12 != null) {
                                        r8.A0R("overlay_ad_host_media_id", str12);
                                    }
                                    String str13 = b7p.A0U;
                                    if (str13 != null) {
                                        r8.A0R("display_domain", str13);
                                    }
                                    if (b7p.A0g != null) {
                                        16P.A03(r8, "dynamic_ads_links");
                                        for (C42028BEd bEd : b7p.A0g) {
                                            if (bEd != null) {
                                                C45541CyF.A00(r8, bEd);
                                            }
                                        }
                                        r8.A0Y();
                                    }
                                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption = b7p.A06;
                                    if (dynamicProductAdDisplayOption != null) {
                                        r8.A0R("dynamic_product_ad_display_option", dynamicProductAdDisplayOption.A00);
                                    }
                                    if (b7p.A03 != null) {
                                        r8.A0q("cta_info");
                                        C45517Cxr.A00(r8, b7p.A03);
                                    }
                                    Boolean bool2 = b7p.A0J;
                                    if (bool2 != null) {
                                        r8.A0S("enable_reels_end_scene", bool2.booleanValue());
                                    }
                                    if (b7p.A0f != null) {
                                        16P.A03(r8, "cop_render_output");
                                        for (C250063kq r02 : b7p.A0f) {
                                            if (r02 != null) {
                                                C250053kp.A00(r8, r02);
                                            }
                                        }
                                        r8.A0Y();
                                    }
                                    Integer num2 = b7p.A0P;
                                    if (num2 != null) {
                                        r8.A0P("view_state_item_type", num2.intValue());
                                    }
                                    Long l = b7p.A0Q;
                                    if (l != null) {
                                        r8.A0Q("brs_threshold", l.longValue());
                                    }
                                    if (b7p.A0D != null) {
                                        r8.A0q("multi_ads_data");
                                        C45270CtZ ctZ = b7p.A0D;
                                        r8.A0c();
                                        16P.A03(r8, "multi_ads_media_items");
                                        for (C41938B7p b7p2 : ctZ.A01) {
                                            if (b7p2 != null) {
                                                A00(r8, b7p2);
                                            }
                                        }
                                        r8.A0Y();
                                        if (ctZ.A00 != null) {
                                            r8.A0q("intent_aware_ads_info");
                                            C56211Hue.A00(r8, ctZ.A00);
                                        }
                                        r8.A0Z();
                                    }
                                    AdFormatType adFormatType = b7p.A00;
                                    if (adFormatType != null) {
                                        r8.A0R("format_type", adFormatType.A00);
                                    }
                                    if (b7p.A04 != null) {
                                        r8.A0q("carousel_rendering_configuration");
                                        AnonymousClass493 r32 = b7p.A04;
                                        r8.A0c();
                                        Integer num3 = r32.A01;
                                        if (num3 != null) {
                                            r8.A0P("duration_in_ms", num3.intValue());
                                        }
                                        String str14 = r32.A03;
                                        if (str14 != null) {
                                            r8.A0R("indicator_style", str14);
                                        }
                                        Boolean bool3 = r32.A00;
                                        if (bool3 != null) {
                                            r8.A0S("should_enable_autoadvance", bool3.booleanValue());
                                        }
                                        List list3 = r32.A05;
                                        if (list3 != null) {
                                            Iterator A0s = C41845B3m.A0s(r8, "showcase_links", list3);
                                            while (A0s.hasNext()) {
                                                AndroidLink androidLink = (AndroidLink) A0s.next();
                                                if (androidLink != null) {
                                                    C250113kv.A00(r8, androidLink.FES());
                                                }
                                            }
                                            r8.A0Y();
                                        }
                                        String str15 = r32.A04;
                                        if (str15 != null) {
                                            r8.A0R("thumbnail_position", str15);
                                        }
                                        Integer num4 = r32.A02;
                                        if (num4 != null) {
                                            r8.A0P("thumbnail_width", num4.intValue());
                                        }
                                        r8.A0Z();
                                    }
                                    if (b7p.A0A != null) {
                                        r8.A0q("overlay_ads_format");
                                        C270134gF r33 = b7p.A0A;
                                        r8.A0c();
                                        Boolean bool4 = r33.A05;
                                        if (bool4 != null) {
                                            r8.A0S("apply_blur", bool4.booleanValue());
                                        }
                                        Boolean bool5 = r33.A06;
                                        if (bool5 != null) {
                                            r8.A0S("apply_full_bleed_thumbnail", bool5.booleanValue());
                                        }
                                        Boolean bool6 = r33.A07;
                                        if (bool6 != null) {
                                            r8.A0S("apply_partial_width", bool6.booleanValue());
                                        }
                                        Boolean bool7 = r33.A08;
                                        if (bool7 != null) {
                                            r8.A0S("apply_vertical_safezone", bool7.booleanValue());
                                        }
                                        Integer num5 = r33.A0F;
                                        if (num5 != null) {
                                            r8.A0P("delay_time_ms", num5.intValue());
                                        }
                                        C46254DSj dSj = r33.A02;
                                        if (dSj != null) {
                                            r8.A0q("description_text_style");
                                            C45605CzH.A00(r8, dSj.F7M());
                                        }
                                        Boolean bool8 = r33.A09;
                                        if (bool8 != null) {
                                            r8.A0S("enable_long_press", bool8.booleanValue());
                                        }
                                        Boolean bool9 = r33.A0A;
                                        if (bool9 != null) {
                                            r8.A0S("enable_swipe_left_to_dismiss", bool9.booleanValue());
                                        }
                                        String str16 = r33.A0K;
                                        if (str16 != null) {
                                            r8.A0R("end_color", str16);
                                        }
                                        OverlayAdsFormatEnum overlayAdsFormatEnum = r33.A01;
                                        if (overlayAdsFormatEnum != null) {
                                            r8.A0R("format", overlayAdsFormatEnum.A00);
                                        }
                                        Integer num6 = r33.A0G;
                                        if (num6 != null) {
                                            r8.A0P("highlight_time_ms", num6.intValue());
                                        }
                                        String str17 = r33.A0L;
                                        if (str17 != null) {
                                            r8.A0R("initial_color", str17);
                                        }
                                        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = r33.A00;
                                        if (overlayAdTapDestinationEnum != null) {
                                            r8.A0R("overlay_ad_tap_destination", overlayAdTapDestinationEnum.A00);
                                        }
                                        Integer num7 = r33.A0H;
                                        if (num7 != null) {
                                            r8.A0P("overlay_ads_height", num7.intValue());
                                        }
                                        Boolean bool10 = r33.A0B;
                                        if (bool10 != null) {
                                            r8.A0S("should_discard_overlay_ads", bool10.booleanValue());
                                        }
                                        Boolean bool11 = r33.A0C;
                                        if (bool11 != null) {
                                            r8.A0S("show_border", bool11.booleanValue());
                                        }
                                        Boolean bool12 = r33.A0D;
                                        if (bool12 != null) {
                                            r8.A0S("show_dismiss_button", bool12.booleanValue());
                                        }
                                        Boolean bool13 = r33.A0E;
                                        if (bool13 != null) {
                                            r8.A0S("show_tap_feedback", bool13.booleanValue());
                                        }
                                        C46254DSj dSj2 = r33.A03;
                                        if (dSj2 != null) {
                                            r8.A0q("sponsored_text_style");
                                            C45605CzH.A00(r8, dSj2.F7M());
                                        }
                                        Integer num8 = r33.A0I;
                                        if (num8 != null) {
                                            r8.A0P("text_spacing", num8.intValue());
                                        }
                                        Integer num9 = r33.A0J;
                                        if (num9 != null) {
                                            r8.A0P("thumbnail_size", num9.intValue());
                                        }
                                        C46254DSj dSj3 = r33.A04;
                                        if (dSj3 != null) {
                                            r8.A0q("title_text_style");
                                            C45605CzH.A00(r8, dSj3.F7M());
                                        }
                                        r8.A0Z();
                                    }
                                    Boolean bool14 = b7p.A0L;
                                    if (bool14 != null) {
                                        r8.A0S("is_rev_share", bool14.booleanValue());
                                    }
                                    if (b7p.A02 != null) {
                                        r8.A0q("afi_info");
                                        C250163l0.A00(r8, b7p.A02);
                                    }
                                    if (b7p.A07 != null) {
                                        r8.A0q("gesture_to_action_info");
                                        C257703xp r03 = b7p.A07;
                                        r8.A0c();
                                        Boolean bool15 = r03.A00;
                                        if (bool15 != null) {
                                            r8.A0S("enable_reels_ads_nudge", bool15.booleanValue());
                                        }
                                        r8.A0Z();
                                    }
                                    if (b7p.A09 != null) {
                                        r8.A0q("on_impressions_control");
                                        C278574x8.A00(r8, b7p.A09);
                                    }
                                    if (b7p.A0E != null) {
                                        r8.A0q("research_survey");
                                        C45427Cw7 cw7 = b7p.A0E;
                                        r8.A0c();
                                        String str18 = cw7.A04;
                                        if (str18 != null) {
                                            r8.A0R("ad_id", str18);
                                        }
                                        Boolean bool16 = cw7.A01;
                                        if (bool16 != null) {
                                            r8.A0S("is_demo", bool16.booleanValue());
                                        }
                                        if (cw7.A00 != null) {
                                            r8.A0q("learn_more");
                                            C45337Cuf cuf = cw7.A00;
                                            r8.A0c();
                                            r8.A0R("body", cuf.A01);
                                            if (cuf.A00 != null) {
                                                r8.A0q("call_to_action");
                                                C45272Ctb ctb = cuf.A00;
                                                r8.A0c();
                                                r8.A0R(DialogModule.KEY_TITLE, ctb.A00);
                                                r8.A0R("url", ctb.A01);
                                                r8.A0Z();
                                            }
                                            r8.A0R(DialogModule.KEY_TITLE, cuf.A02);
                                            r8.A0Z();
                                        }
                                        String str19 = cw7.A05;
                                        if (str19 != null) {
                                            r8.A0R("primer_message", str19);
                                        }
                                        if (cw7.A09 != null) {
                                            16P.A03(r8, "questions");
                                            for (C45397Cvd cvd : cw7.A09) {
                                                if (cvd != null) {
                                                    r8.A0c();
                                                    if (cvd.A04 != null) {
                                                        16P.A03(r8, "answers");
                                                        for (C45374CvG cvG : cvd.A04) {
                                                            if (cvG != null) {
                                                                r8.A0c();
                                                                Boolean bool17 = cvG.A00;
                                                                if (bool17 != null) {
                                                                    r8.A0S("is_exclusive", bool17.booleanValue());
                                                                }
                                                                Integer num10 = cvG.A01;
                                                                if (num10 != null) {
                                                                    r8.A0P("num_responders", num10.intValue());
                                                                }
                                                                r8.A0R("text", cvG.A02);
                                                                r8.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, cvG.A03);
                                                                r8.A0Z();
                                                            }
                                                        }
                                                        r8.A0Y();
                                                    }
                                                    r8.A0R("qid", cvd.A01);
                                                    r8.A0R(DialogModule.KEY_TITLE, cvd.A02);
                                                    Integer num11 = cvd.A00;
                                                    if (num11 != null) {
                                                        r8.A0P("total_resonders", num11.intValue());
                                                    }
                                                    r8.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, cvd.A03);
                                                    r8.A0Z();
                                                }
                                            }
                                            r8.A0Y();
                                        }
                                        Boolean bool18 = cw7.A02;
                                        if (bool18 != null) {
                                            r8.A0S("show_primer", bool18.booleanValue());
                                        }
                                        Boolean bool19 = cw7.A03;
                                        if (bool19 != null) {
                                            r8.A0S("show_results", bool19.booleanValue());
                                        }
                                        r8.A0R("survey_id", cw7.A06);
                                        r8.A0R("survey_type", cw7.A07);
                                        String str20 = cw7.A08;
                                        if (str20 != null) {
                                            r8.A0R("tracking_token", str20);
                                        }
                                        r8.A0Z();
                                    }
                                    String str21 = b7p.A0a;
                                    if (str21 != null) {
                                        r8.A0R("multi_ads_media_tap_destination", str21);
                                    }
                                    Boolean bool20 = b7p.A0N;
                                    if (bool20 != null) {
                                        r8.A0S("should_fetch_preview_comments", bool20.booleanValue());
                                    }
                                    Boolean bool21 = b7p.A0I;
                                    if (bool21 != null) {
                                        r8.A0S("enable_ads_follow_button", bool21.booleanValue());
                                    }
                                    Boolean bool22 = b7p.A0K;
                                    if (bool22 != null) {
                                        r8.A0S("is_delayed_skip_ad", bool22.booleanValue());
                                    }
                                    if (b7p.A08 != null) {
                                        r8.A0q("lead_gen_preclick_data");
                                        C279764zH.A00(r8, b7p.A08);
                                    }
                                    r8.A0Z();
                                    return;
                                }
                            }
                        } else {
                            str = "adTitle";
                        }
                    }
                }
                str = "hideReasons";
            } else {
                str = "label";
            }
        } else {
            str = "trackingToken";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
