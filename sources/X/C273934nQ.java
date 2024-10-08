package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.4nQ  reason: invalid class name and case insensitive filesystem */
public abstract class C273934nQ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v65 */
    /* JADX WARNING: type inference failed for: r4v66 */
    /* JADX WARNING: type inference failed for: r4v67 */
    /* JADX WARNING: type inference failed for: r4v68 */
    /* JADX WARNING: type inference failed for: r4v69 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r4v71 */
    /* JADX WARNING: type inference failed for: r4v72 */
    /* JADX WARNING: type inference failed for: r4v73 */
    /* JADX WARNING: type inference failed for: r4v74 */
    /* JADX WARNING: type inference failed for: r4v75 */
    /* JADX WARNING: type inference failed for: r4v76 */
    /* JADX WARNING: type inference failed for: r4v77 */
    /* JADX WARNING: type inference failed for: r4v78 */
    /* JADX WARNING: type inference failed for: r4v79 */
    /* JADX WARNING: type inference failed for: r4v80 */
    /* JADX WARNING: type inference failed for: r4v81 */
    /* JADX WARNING: type inference failed for: r4v82 */
    /* JADX WARNING: type inference failed for: r4v83 */
    /* JADX WARNING: type inference failed for: r4v84 */
    /* JADX WARNING: type inference failed for: r4v85 */
    /* JADX WARNING: type inference failed for: r4v86 */
    /* JADX WARNING: type inference failed for: r4v87 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: type inference failed for: r4v92 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C255783ui parseFromJson(X.16F r18) {
        /*
            r15 = 0
            r3 = r18
            X.0qQ.A0B(r3, r15)
            X.3ui r2 = new X.3ui     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.<init>()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0018
            r3.A0z()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x099a
        L_0x0018:
            X.16L r1 = r3.A1J()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x07e4
            java.lang.String r1 = r3.A0q()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r3.A1J()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0045
            java.lang.String r1 = r3.A1Q()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.util.Map r0 = X.AnonymousClass3WT.A01     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.3WT r0 = (X.AnonymousClass3WT) r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x003f
            X.3WT r0 = X.AnonymousClass3WT.UNKNOWN     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x003f:
            r2.A11 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0041:
            r3.A0z()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0018
        L_0x0045:
            java.lang.String r0 = "template_sticker_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r4 = 0
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x005a
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x005a:
            r2.A1l = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x005d:
            java.lang.String r0 = "fillable_element_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0074
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0071
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0071:
            r2.A1T = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0074:
            java.lang.String r0 = "gallery_fillable_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x008b
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0088
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0088:
            r2.A1U = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x008b:
            java.lang.String r0 = "color_string"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00a2
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x009f
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x009f:
            r2.A1P = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00a2:
            java.lang.String r0 = "x"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00b2
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            float r0 = (float) r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A03 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00b2:
            java.lang.String r0 = "y"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00c2
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            float r0 = (float) r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A04 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00c2:
            java.lang.String r0 = "z"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00d2
            int r0 = r3.A1D()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A09 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00d2:
            java.lang.String r0 = "width"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00e3
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            float r0 = (float) r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A02 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00e3:
            java.lang.String r0 = "height"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x00f4
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            float r0 = (float) r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A00 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x00f4:
            java.lang.String r0 = "rotation"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0105
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            float r0 = (float) r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A01 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0105:
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x011a
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r0.<init>(r4)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1K = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x011a:
            java.lang.String r0 = "end_time_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x012f
            double r4 = r3.A0U()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r0.<init>(r4)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1J = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x012f:
            java.lang.String r0 = "is_consumption_disabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x013f
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1q = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x013f:
            java.lang.String r0 = "consumption_disabled_reason"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0157
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0153
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0153:
            r2.A1Q = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0157:
            java.lang.String r0 = "accessibility_label"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x016f
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x016b
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x016b:
            r2.A1M = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x016f:
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0181
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            com.instagram.user.model.User r0 = X.1aC.A00(r3, r15)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1B = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0181:
            java.lang.String r0 = "location"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0191
            com.instagram.model.venue.LocationDict r0 = X.AnonymousClass41Q.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0t = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0191:
            java.lang.String r0 = "hashtag"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01a1
            com.instagram.model.hashtag.HashtagImpl r0 = X.C279594yt.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0k = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01a1:
            java.lang.String r0 = "product_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01b1
            com.instagram.model.shopping.reels.ProductSticker r0 = X.C45688D1n.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0q = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01b1:
            java.lang.String r0 = "multi_product_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01c1
            com.instagram.model.shopping.reels.MultiProductSticker r0 = X.C45685D1k.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0n = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01c1:
            java.lang.String r0 = "seller_collection_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01d1
            X.BIk r0 = X.C45687D1m.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0o = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01d1:
            java.lang.String r0 = "storefront_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01e1
            X.BIn r0 = X.C45692D1r.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0r = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01e1:
            java.lang.String r0 = "product_share_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x01f1
            X.BIl r0 = X.C44935CnV.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0p = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x01f1:
            java.lang.String r0 = "countdown_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0201
            X.BGi r0 = X.C45635Czl.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0R = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0201:
            java.lang.String r0 = "fundraiser_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0211
            X.8YF r0 = X.AB9.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0y = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0211:
            java.lang.String r0 = "fb_fundraiser_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0229
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0225
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0225:
            r2.A1S = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0229:
            java.lang.String r0 = "fb_community_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0239
            X.BGm r0 = X.C45637Czn.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0S = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0239:
            java.lang.String r0 = "fb_tag_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0249
            X.BGp r0 = X.C45638Czo.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0T = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0249:
            java.lang.String r0 = "smb_support_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0259
            com.instagram.api.schemas.SMBSupportStickerDict r0 = X.C45621CzX.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0P = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0259:
            java.lang.String r0 = "support_personalized_ads_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0269
            X.BBV r0 = X.C69757Nrg.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0A = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0269:
            java.lang.String r0 = "poll_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0279
            X.4jy r0 = X.C271984ju.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A14 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0279:
            java.lang.String r0 = "question_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0289
            X.UNR r0 = X.C18119Vln.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0O = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0289:
            java.lang.String r0 = "question_response_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0299
            X.A7J r0 = X.ABD.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A15 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0299:
            java.lang.String r0 = "prompt_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02a9
            com.instagram.api.schemas.StoryPromptTappableData r0 = X.C281985Ai.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0Z = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02a9:
            java.lang.String r0 = "karaoke_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02b9
            X.BFH r0 = X.C45585Cyx.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0J = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02b9:
            java.lang.String r0 = "clips_text_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02c9
            X.BHv r0 = X.D0D.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0g = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02c9:
            java.lang.String r0 = "music_pick_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02d9
            com.instagram.api.schemas.StoryMusicPickTappableData r0 = X.C45643Czt.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0X = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02d9:
            java.lang.String r0 = "before_and_after_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02e9
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = X.D01.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0d = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02e9:
            java.lang.String r0 = "photo_credit_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x02f9
            X.BFl r0 = X.CbR.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0L = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x02f9:
            java.lang.String r0 = "caption"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0311
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x030d
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x030d:
            r2.A1e = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0311:
            java.lang.String r0 = "notify_me_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0321
            X.BH4 r0 = X.C45644Czu.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0Y = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0321:
            java.lang.String r0 = "achievement_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0331
            X.BGY r0 = X.C45630Czg.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0Q = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0331:
            java.lang.String r0 = "group_mention_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0341
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = X.C45641Czr.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0V = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0341:
            java.lang.String r0 = "join_chat_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0351
            X.UOB r0 = X.C18235Vo2.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0x = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0351:
            java.lang.String r0 = "quiz_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0361
            X.UNZ r0 = X.C18125Vlt.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0a = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0361:
            java.lang.String r0 = "slider_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0371
            X.BHJ r0 = X.C45648Czy.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0b = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0371:
            java.lang.String r0 = "music_asset_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0381
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C255673uX.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0u = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0381:
            java.lang.String r0 = "original_sound_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0391
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C255673uX.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0v = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0391:
            java.lang.String r0 = "should_render_soundwave"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03a5
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1I = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03a5:
            java.lang.String r0 = "election_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03b5
            X.BIZ r0 = X.C44856Cm7.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0j = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03b5:
            java.lang.String r0 = "anti_bully_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03c5
            X.DDv r0 = X.D33.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1C = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03c5:
            java.lang.String r0 = "anti_bully_global_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03d5
            X.DDv r0 = X.D33.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1D = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03d5:
            java.lang.String r0 = "voter_registration_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03e5
            X.DDv r0 = X.D33.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1G = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03e5:
            java.lang.String r0 = "bloks_tappable_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x03f5
            X.DDv r0 = X.D33.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1F = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x03f5:
            java.lang.String r0 = "bloks_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0405
            X.DDv r0 = X.D33.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1E = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0405:
            java.lang.String r0 = "upcoming_event"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0415
            com.instagram.user.model.UpcomingEventImpl r0 = X.C45712D2l.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1A = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0415:
            java.lang.String r0 = "upcoming_event_media"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0425
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r0 = X.C45694D1t.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0s = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0425:
            java.lang.String r0 = "upcoming_event_sticker_source"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0449
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0439
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0439:
            java.util.Map r0 = com.instagram.api.schemas.UpcomingEventStickerSource.A01     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            com.instagram.api.schemas.UpcomingEventStickerSource r0 = (com.instagram.api.schemas.UpcomingEventStickerSource) r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x0445
            com.instagram.api.schemas.UpcomingEventStickerSource r0 = com.instagram.api.schemas.UpcomingEventStickerSource.UNRECOGNIZED     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0445:
            r2.A0h = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0449:
            java.lang.String r0 = "story_link"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0459
            com.instagram.api.schemas.StoryLinkInfoDict r0 = X.AnonymousClass5Ig.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0W = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0459:
            java.lang.String r0 = "reaction_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0469
            X.5Hn r0 = X.AnonymousClass6LG.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A16 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0469:
            java.lang.String r0 = "viewer_avatar_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0479
            X.ToH r0 = X.C14014ToG.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0D = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0479:
            java.lang.String r0 = "author_avatar_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0489
            X.ToH r0 = X.C14014ToG.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0C = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0489:
            java.lang.String r0 = "surface"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04a1
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x049d
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x049d:
            r2.A1j = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04a1:
            java.lang.String r0 = "user_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04b9
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x04b5
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x04b5:
            r2.A1n = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04b9:
            java.lang.String r0 = "feature_linking_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04c9
            X.BGs r0 = X.C44395CeF.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0U = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04c9:
            java.lang.String r0 = "subscription_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04d9
            com.instagram.api.schemas.SubscriptionStickerDict r0 = X.D06.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0e = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04d9:
            java.lang.String r0 = "subscription_shoutout_mention_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04e9
            X.BHP r0 = X.C45649Czz.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0c = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04e9:
            java.lang.String r0 = "vcr_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x04f9
            com.instagram.api.schemas.MediaVCRTappableData r0 = X.C45594Cz6.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0K = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x04f9:
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0511
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x050d
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x050d:
            r2.A1X = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0511:
            java.lang.String r0 = "media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0529
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0525
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0525:
            r2.A1a = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0529:
            java.lang.String r0 = "media_compound_str"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0541
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x053d
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x053d:
            r2.A1Z = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0541:
            java.lang.String r0 = "carousel_share_child_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0559
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0555
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0555:
            r2.A1O = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0559:
            java.lang.String r0 = "media_owner_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0571
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x056d
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x056d:
            r2.A1b = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0571:
            java.lang.String r0 = "product_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0589
            java.lang.String r1 = r3.A1Q()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.util.Map r0 = com.instagram.model.mediatype.ProductType.A01     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            com.instagram.model.mediatype.ProductType r0 = (com.instagram.model.mediatype.ProductType) r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0m = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0589:
            java.lang.String r0 = "media_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x05a1
            int r0 = r3.A1D()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.1iA r0 = X.1i9.A00(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0l = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x05a1:
            java.lang.String r0 = "clips_creation_entry_point"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x05c5
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x05b5
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x05b5:
            java.util.Map r0 = com.instagram.api.schemas.ClipsCreationEntryPoint.A01     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            com.instagram.api.schemas.ClipsCreationEntryPoint r0 = (com.instagram.api.schemas.ClipsCreationEntryPoint) r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x05c1
            com.instagram.api.schemas.ClipsCreationEntryPoint r0 = com.instagram.api.schemas.ClipsCreationEntryPoint.A06     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x05c1:
            r2.A0E = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x05c5:
            java.lang.String r0 = "collection_ad_thumbnail_position"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x05d5
            int r0 = r3.A1D()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A05 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x05d5:
            java.lang.String r0 = "upcoming_event_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x05ed
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x05e9
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x05e9:
            r2.A1m = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x05ed:
            java.lang.String r0 = "merchant_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0605
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0601
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0601:
            r2.A1c = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0605:
            java.lang.String r0 = "product_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0638
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 != r0) goto L_0x0634
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r4.<init>()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x061a:
            X.16L r1 = r3.A1J()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0634
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x061a
            java.lang.String r0 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x061a
            r4.add(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x061a
        L_0x0634:
            r2.A1o = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0638:
            java.lang.String r0 = "server_sticker_burn_in_params"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0648
            X.ADJ r0 = X.ABB.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A12 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0648:
            java.lang.String r0 = "text_post_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0658
            X.BHu r0 = X.D0C.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0f = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0658:
            java.lang.String r0 = "story_explore_shareable_grid"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0668
            X.BEg r0 = X.C45544CyI.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0H = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0668:
            java.lang.String r0 = "explore_shareable_grid_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0678
            X.BEf r0 = X.C45543CyH.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0G = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0678:
            java.lang.String r0 = "ig_bio_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0688
            X.9bm r0 = X.C393379wL.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0I = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0688:
            java.lang.String r0 = "attribution"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x06a0
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x069c
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x069c:
            r2.A1N = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x06a0:
            java.lang.String r0 = "is_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x06b0
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1t = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x06b0:
            java.lang.String r0 = "use_custom_title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x06c0
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1u = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x06c0:
            java.lang.String r0 = "custom_title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x06d8
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x06d4
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x06d4:
            r2.A1R = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x06d8:
            java.lang.String r0 = "display_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x06f0
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x06ec
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x06ec:
            r2.A1g = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x06f0:
            java.lang.String r0 = "highlighted_media_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0708
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0704
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0704:
            r2.A1W = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0708:
            java.lang.String r0 = "is_hidden"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0718
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1s = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0718:
            java.lang.String r0 = "is_fb_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0728
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A1r = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0728:
            java.lang.String r0 = "tap_state"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0738
            int r0 = r3.A1D()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A07 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0738:
            java.lang.String r0 = "tap_state_str_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0750
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x074c
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x074c:
            r2.A1k = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0750:
            java.lang.String r0 = "str_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0768
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x0764
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0764:
            r2.A1i = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0768:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0780
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x077c
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x077c:
            r2.A1h = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x0780:
            java.lang.String r0 = "object_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x079c
            java.lang.String r1 = r3.A1Q()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.util.Map r0 = X.AnonymousClass3WT.A01     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.3WT r0 = (X.AnonymousClass3WT) r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x0798
            X.3WT r0 = X.AnonymousClass3WT.UNKNOWN     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x0798:
            r2.A10 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x079c:
            java.lang.String r0 = "image_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x07b4
            X.16L r1 = r3.A11()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x07b0
            java.lang.String r4 = r3.A1P()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x07b0:
            r2.A1Y = r4     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x07b4:
            java.lang.String r0 = "ring_glyph"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x07c4
            X.3ID r0 = X.D2M.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A17 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x07c4:
            java.lang.String r0 = "story_public_collection"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x07d4
            X.BG6 r0 = X.C45612CzO.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0N = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x07d4:
            java.lang.String r0 = "public_collection_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0041
            X.BG5 r0 = X.C44292Cca.parseFromJson(r3)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A0M = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0041
        L_0x07e4:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r2.A0u     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x0994
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r2.A0v     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 != 0) goto L_0x0994
            com.instagram.user.model.User r0 = r2.A1B     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x07f6
            X.3WT r0 = X.AnonymousClass3WT.MENTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x07f2:
            r2.A11 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0998
        L_0x07f6:
            com.instagram.model.venue.LocationDict r0 = r2.A0t     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x07fd
            X.3WT r0 = X.AnonymousClass3WT.LOCATION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x07fd:
            com.instagram.model.hashtag.HashtagImpl r0 = r2.A0k     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0804
            X.3WT r0 = X.AnonymousClass3WT.HASHTAG     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0804:
            X.BGs r0 = r2.A0U     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x080b
            X.3WT r0 = X.AnonymousClass3WT.FEATURE_LINKING_STICKER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x080b:
            com.instagram.model.shopping.reels.ProductSticker r0 = r2.A0q     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0812
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0812:
            com.instagram.model.shopping.reels.MultiProductSticker r0 = r2.A0n     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0819
            X.3WT r0 = X.AnonymousClass3WT.MULTI_PRODUCT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0819:
            X.BIk r0 = r2.A0o     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0820
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_COLLECTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0820:
            X.BIn r0 = r2.A0r     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0827
            X.3WT r0 = X.AnonymousClass3WT.STOREFRONT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0827:
            X.BIl r0 = r2.A0p     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x082e
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_SHARE     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x082e:
            X.BGi r0 = r2.A0R     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0835
            X.3WT r0 = X.AnonymousClass3WT.COUNTDOWN     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0835:
            X.8YF r0 = r2.A0y     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x083c
            X.3WT r0 = X.AnonymousClass3WT.FUNDRAISER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x083c:
            java.lang.String r0 = r2.A1S     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0843
            X.3WT r0 = X.AnonymousClass3WT.FB_FUNDRAISER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0843:
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r2.A0P     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x084a
            X.3WT r0 = X.AnonymousClass3WT.SMB_SUPPORT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x084a:
            X.4jy r0 = r2.A14     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0851
            X.3WT r0 = X.AnonymousClass3WT.POLLING     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0851:
            X.UNR r0 = r2.A0O     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0858
            X.3WT r0 = X.AnonymousClass3WT.QUESTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0858:
            X.A7J r0 = r2.A15     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x085f
            X.3WT r0 = X.AnonymousClass3WT.QUESTION_RESPONSE     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x085f:
            com.instagram.api.schemas.StoryPromptTappableData r0 = r2.A0Z     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0873
            java.lang.Boolean r0 = r0.A0B     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0870
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0870
            X.3WT r0 = X.AnonymousClass3WT.CLIPS_PROMPT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0870:
            X.3WT r0 = X.AnonymousClass3WT.PROMPT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0873:
            X.UOB r9 = r2.A0x     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r9 == 0) goto L_0x089f
            com.instagram.reels.chat.model.ChatStickerStickerType r1 = r9.A04     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            com.instagram.reels.chat.model.ChatStickerStickerType r0 = com.instagram.reels.chat.model.ChatStickerStickerType.MESSAGE_STICKER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 != r0) goto L_0x089b
            X.3WT r0 = X.AnonymousClass3WT.MESSAGE_SHARE     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A11 = r0     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r4 = 0
            java.lang.String r10 = ""
            X.8D7 r3 = new X.8D7     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r15
            r17 = r15
            r18 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            r2.A13 = r3     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x0999
        L_0x089b:
            X.3WT r0 = X.AnonymousClass3WT.JOIN_CHAT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x089f:
            X.UNZ r0 = r2.A0a     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08a7
            X.3WT r0 = X.AnonymousClass3WT.QUIZ     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08a7:
            X.BHJ r0 = r2.A0b     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08af
            X.3WT r0 = X.AnonymousClass3WT.SLIDER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08af:
            com.instagram.user.model.UpcomingEventImpl r0 = r2.A1A     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08b6
            java.lang.String r0 = r0.A0B     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x08b8
        L_0x08b6:
            java.lang.String r0 = r2.A1m     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
        L_0x08b8:
            if (r0 == 0) goto L_0x08be
            X.3WT r0 = X.AnonymousClass3WT.UPCOMING_EVENT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08be:
            java.lang.String r0 = r2.A1a     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08c6
            X.3WT r0 = X.AnonymousClass3WT.MEDIA     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08c6:
            java.lang.String r1 = r2.A1X     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == 0) goto L_0x08e2
            java.lang.String r0 = "sound_on_sticker"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08d6
            X.3WT r0 = X.AnonymousClass3WT.SOUND_ON     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08d6:
            java.lang.String r0 = "ar_effect_sticker"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08e2
            X.3WT r0 = X.AnonymousClass3WT.AREFFECT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08e2:
            X.BIZ r0 = r2.A0j     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08ea
            X.3WT r0 = X.AnonymousClass3WT.ELECTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08ea:
            X.DDv r0 = r2.A1C     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08f2
            X.3WT r0 = X.AnonymousClass3WT.ANTI_BULLY_ENG_ONLY     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08f2:
            X.DDv r0 = r2.A1D     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x08fa
            X.3WT r0 = X.AnonymousClass3WT.ANTI_BULLY_GLOBAL     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x08fa:
            X.DDv r0 = r2.A1G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0902
            X.3WT r0 = X.AnonymousClass3WT.VOTER_REGISTRATION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0902:
            com.instagram.api.schemas.StoryLinkInfoDict r0 = r2.A0W     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x090a
            X.3WT r0 = X.AnonymousClass3WT.LINK     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x090a:
            X.DDv r0 = r2.A1E     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0912
            X.3WT r0 = X.AnonymousClass3WT.BLOKS     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0912:
            X.DDv r0 = r2.A1F     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x091a
            X.3WT r0 = X.AnonymousClass3WT.BLOKS_TAPPABLE     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x091a:
            X.5Hn r0 = r2.A16     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0922
            X.3WT r0 = X.AnonymousClass3WT.REACTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0922:
            X.JzL r0 = r2.A18     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x092a
            X.3WT r0 = X.AnonymousClass3WT.BADGES_SUPPORTER_THANKS     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x092a:
            X.ToH r0 = r2.A0C     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0932
            X.3WT r0 = X.AnonymousClass3WT.AVATAR     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0932:
            com.instagram.api.schemas.SubscriptionStickerDict r0 = r2.A0e     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x093a
            X.3WT r0 = X.AnonymousClass3WT.SUBSCRIPTIONS     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x093a:
            X.BHP r0 = r2.A0c     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0942
            X.3WT r0 = X.AnonymousClass3WT.SUBSCRIPTION_SHOUTOUT     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0942:
            X.BGm r0 = r2.A0S     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x094a
            X.3WT r0 = X.AnonymousClass3WT.FB_COMMUNITY     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x094a:
            X.BGp r0 = r2.A0T     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0952
            X.3WT r0 = X.AnonymousClass3WT.FB_TAG     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0952:
            com.instagram.api.schemas.MediaVCRTappableData r0 = r2.A0K     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x095a
            X.3WT r0 = X.AnonymousClass3WT.REELS_VISUAL_REPLIES     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x095a:
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r2.A0V     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0962
            X.3WT r0 = X.AnonymousClass3WT.GROUP_MENTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0962:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r2.A0d     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x096a
            X.3WT r0 = X.AnonymousClass3WT.BEFORE_AND_AFTER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x096a:
            X.BHu r0 = r2.A0f     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0972
            X.3WT r0 = X.AnonymousClass3WT.TEXT_POST_STICKER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0972:
            X.3WT r1 = r2.A11     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_LYRICS     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r1 == r0) goto L_0x099b
            X.BEf r0 = r2.A0G     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0980
            X.3WT r0 = X.AnonymousClass3WT.EXPLORE_SHAREABLE_GRID     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0980:
            com.instagram.api.schemas.StoryMusicPickTappableData r0 = r2.A0X     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0988
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_PICK_STICKER     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0988:
            X.BG5 r0 = r2.A0M     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            if (r0 == 0) goto L_0x0990
            X.3WT r0 = X.AnonymousClass3WT.PUBLIC_COLLECTION     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0990:
            X.3WT r0 = X.AnonymousClass3WT.UNKNOWN     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0994:
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY     // Catch:{ IOException -> 0x09a3, Exception -> 0x099c }
            goto L_0x07f2
        L_0x0998:
            return r2
        L_0x0999:
            return r2
        L_0x099a:
            r2 = 0
        L_0x099b:
            return r2
        L_0x099c:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x09a3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273934nQ.parseFromJson(X.16F):X.3ui");
    }

    public static void A00(17Z r4, C255783ui r5) {
        r4.A0c();
        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A11.A00);
        String str = r5.A1l;
        if (str != null) {
            r4.A0R("template_sticker_id", str);
        }
        String str2 = r5.A1T;
        if (str2 != null) {
            r4.A0R("fillable_element_type", str2);
        }
        String str3 = r5.A1U;
        if (str3 != null) {
            r4.A0R("gallery_fillable_type", str3);
        }
        String str4 = r5.A1P;
        if (str4 != null) {
            r4.A0R("color_string", str4);
        }
        r4.A0O("x", r5.A03);
        r4.A0O("y", r5.A04);
        r4.A0P("z", r5.A09);
        r4.A0O(IgReactMediaPickerNativeModule.WIDTH, r5.A02);
        r4.A0O(IgReactMediaPickerNativeModule.HEIGHT, r5.A00);
        r4.A0O("rotation", r5.A01);
        Float f = r5.A1K;
        if (f != null) {
            r4.A0O("start_time_ms", f.floatValue());
        }
        Float f2 = r5.A1J;
        if (f2 != null) {
            r4.A0O("end_time_ms", f2.floatValue());
        }
        r4.A0S("is_consumption_disabled", r5.A1q);
        String str5 = r5.A1Q;
        if (str5 != null) {
            r4.A0R("consumption_disabled_reason", str5);
        }
        String str6 = r5.A1M;
        if (str6 != null) {
            r4.A0R("accessibility_label", str6);
        }
        if (r5.A1B != null) {
            r4.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = r5.A1B;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r4, user);
        }
        if (r5.A0t != null) {
            r4.A0q("location");
            AnonymousClass41Q.A00(r4, r5.A0t);
        }
        if (r5.A0k != null) {
            r4.A0q("hashtag");
            C279594yt.A00(r4, r5.A0k);
        }
        if (r5.A0q != null) {
            r4.A0q("product_sticker");
            C45688D1n.A00(r4, r5.A0q);
        }
        if (r5.A0n != null) {
            r4.A0q("multi_product_sticker");
            C45685D1k.A00(r4, r5.A0n);
        }
        if (r5.A0o != null) {
            r4.A0q("seller_collection_sticker");
            C45687D1m.A00(r4, r5.A0o);
        }
        if (r5.A0r != null) {
            r4.A0q("storefront_sticker");
            C45692D1r.A00(r4, r5.A0r);
        }
        if (r5.A0p != null) {
            r4.A0q("product_share_sticker");
            C42132BIl bIl = r5.A0p;
            r4.A0c();
            ProductDetailsProductItemDict productDetailsProductItemDict = bIl.A00;
            if (productDetailsProductItemDict != null) {
                r4.A0q("product");
                C275404q6.A00(r4, productDetailsProductItemDict);
            }
            r4.A0Z();
        }
        if (r5.A0R != null) {
            r4.A0q("countdown_sticker");
            C45635Czl.A00(r4, r5.A0R, true);
        }
        if (r5.A0y != null) {
            r4.A0q("fundraiser_sticker");
            AB9.A00(r4, r5.A0y, true);
        }
        String str7 = r5.A1S;
        if (str7 != null) {
            r4.A0R("fb_fundraiser_id", str7);
        }
        if (r5.A0S != null) {
            r4.A0q("fb_community_sticker");
            C45637Czn.A00(r4, r5.A0S, true);
        }
        if (r5.A0T != null) {
            r4.A0q("fb_tag_sticker");
            C45638Czo.A00(r4, r5.A0T);
        }
        if (r5.A0P != null) {
            r4.A0q("smb_support_sticker");
            C45621CzX.A00(r4, r5.A0P, true);
        }
        if (r5.A0A != null) {
            r4.A0q("support_personalized_ads_sticker");
            BBV bbv = r5.A0A;
            r4.A0c();
            String str8 = bbv.A00;
            if (str8 != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
            }
            r4.A0Z();
        }
        if (r5.A14 != null) {
            r4.A0q("poll_sticker");
            C271984ju.A00(r4, r5.A14, true);
        }
        if (r5.A0O != null) {
            r4.A0q("question_sticker");
            C18119Vln.A00(r4, r5.A0O, true);
        }
        if (r5.A15 != null) {
            r4.A0q("question_response_metadata");
            ABD.A00(r4, r5.A15);
        }
        if (r5.A0Z != null) {
            r4.A0q("prompt_sticker");
            C281985Ai.A00(r4, r5.A0Z, true);
        }
        if (r5.A0J != null) {
            r4.A0q("karaoke_sticker");
            C45585Cyx.A00(r4, r5.A0J);
        }
        if (r5.A0g != null) {
            r4.A0q("clips_text_sticker");
            D0D.A00(r4, r5.A0g);
        }
        if (r5.A0X != null) {
            r4.A0q("music_pick_sticker");
            C45643Czt.A00(r4, r5.A0X);
        }
        if (r5.A0d != null) {
            r4.A0q("before_and_after_sticker");
            D01.A00(r4, r5.A0d, true);
        }
        if (r5.A0L != null) {
            r4.A0q("photo_credit_sticker");
            C42058BFl bFl = r5.A0L;
            r4.A0c();
            User user2 = bFl.A00;
            if (user2 != null) {
                r4.A0q("producer");
                Parcelable.Creator creator2 = User.CREATOR;
                1aC.A08(r4, user2);
            }
            r4.A0Z();
        }
        String str9 = r5.A1e;
        if (str9 != null) {
            r4.A0R("caption", str9);
        }
        if (r5.A0Y != null) {
            r4.A0q("notify_me_sticker");
            C45644Czu.A00(r4, r5.A0Y, true);
        }
        if (r5.A0Q != null) {
            r4.A0q("achievement_sticker");
            C45630Czg.A00(r4, r5.A0Q, true);
        }
        if (r5.A0V != null) {
            r4.A0q("group_mention_sticker");
            C45641Czr.A00(r4, r5.A0V);
        }
        if (r5.A0x != null) {
            r4.A0q("join_chat_sticker");
            C18235Vo2.A00(r4, r5.A0x, true);
        }
        if (r5.A0a != null) {
            r4.A0q("quiz_sticker");
            C18125Vlt.A00(r4, r5.A0a, true);
        }
        if (r5.A0b != null) {
            r4.A0q("slider_sticker");
            C45648Czy.A00(r4, r5.A0b, true);
        }
        if (r5.A0u != null) {
            r4.A0q("music_asset_info");
            C255673uX.A00(r4, r5.A0u, true);
        }
        if (r5.A0v != null) {
            r4.A0q("original_sound_info");
            C255673uX.A00(r4, r5.A0v, true);
        }
        Boolean bool = r5.A1I;
        if (bool != null) {
            r4.A0S("should_render_soundwave", bool.booleanValue());
        }
        if (r5.A0j != null) {
            r4.A0q("election_sticker");
            BIZ biz = r5.A0j;
            r4.A0c();
            String str10 = biz.A00;
            if (str10 != null) {
                r4.A0R("find_location_text", str10);
            }
            String str11 = biz.A01;
            if (str11 != null) {
                r4.A0R("link", str11);
            }
            r4.A0Z();
        }
        if (r5.A1C != null) {
            r4.A0q("anti_bully_sticker");
            D33.A00(r4, r5.A1C);
        }
        if (r5.A1D != null) {
            r4.A0q("anti_bully_global_sticker");
            D33.A00(r4, r5.A1D);
        }
        if (r5.A1G != null) {
            r4.A0q("voter_registration_sticker");
            D33.A00(r4, r5.A1G);
        }
        if (r5.A1F != null) {
            r4.A0q("bloks_tappable_sticker");
            D33.A00(r4, r5.A1F);
        }
        if (r5.A1E != null) {
            r4.A0q("bloks_sticker");
            D33.A00(r4, r5.A1E);
        }
        if (r5.A1A != null) {
            r4.A0q("upcoming_event");
            C45712D2l.A00(r4, r5.A1A);
        }
        if (r5.A0s != null) {
            r4.A0q("upcoming_event_media");
            C45694D1t.A00(r4, r5.A0s);
        }
        UpcomingEventStickerSource upcomingEventStickerSource = r5.A0h;
        if (upcomingEventStickerSource != null) {
            r4.A0R("upcoming_event_sticker_source", upcomingEventStickerSource.A00);
        }
        if (r5.A0W != null) {
            r4.A0q("story_link");
            AnonymousClass5Ig.A00(r4, r5.A0W, true);
        }
        if (r5.A16 != null) {
            r4.A0q("reaction_sticker");
            AnonymousClass6LG.A00(r4, r5.A16);
        }
        if (r5.A0D != null) {
            r4.A0q("viewer_avatar_sticker");
            C14014ToG.A00(r4, r5.A0D);
        }
        if (r5.A0C != null) {
            r4.A0q("author_avatar_sticker");
            C14014ToG.A00(r4, r5.A0C);
        }
        String str12 = r5.A1j;
        if (str12 != null) {
            r4.A0R("surface", str12);
        }
        String str13 = r5.A1n;
        if (str13 != null) {
            r4.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str13);
        }
        if (r5.A0U != null) {
            r4.A0q("feature_linking_sticker");
            C42089BGs bGs = r5.A0U;
            r4.A0c();
            r4.A0P("tap_state", bGs.A00);
            String str14 = bGs.A01;
            if (str14 != null) {
                r4.A0R("tap_state_str_id", str14);
            }
            r4.A0Z();
        }
        if (r5.A0e != null) {
            r4.A0q("subscription_sticker");
            D06.A00(r4, r5.A0e);
        }
        if (r5.A0c != null) {
            r4.A0q("subscription_shoutout_mention_sticker");
            C45649Czz.A00(r4, r5.A0c);
        }
        if (r5.A0K != null) {
            r4.A0q("vcr_sticker");
            C45594Cz6.A00(r4, r5.A0K, true);
        }
        String str15 = r5.A1X;
        if (str15 != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str15);
        }
        String str16 = r5.A1a;
        if (str16 != null) {
            r4.A0R("media_id", str16);
        }
        String str17 = r5.A1Z;
        if (str17 != null) {
            r4.A0R("media_compound_str", str17);
        }
        String str18 = r5.A1O;
        if (str18 != null) {
            r4.A0R("carousel_share_child_media_id", str18);
        }
        String str19 = r5.A1b;
        if (str19 != null) {
            r4.A0R("media_owner_id", str19);
        }
        ProductType productType = r5.A0m;
        if (productType != null) {
            r4.A0R("product_type", productType.A00);
        }
        1iA r0 = r5.A0l;
        if (r0 != null) {
            r4.A0P("media_type", r0.A00);
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = r5.A0E;
        if (clipsCreationEntryPoint != null) {
            r4.A0R("clips_creation_entry_point", clipsCreationEntryPoint.A00);
        }
        r4.A0P("collection_ad_thumbnail_position", r5.A05);
        String str20 = r5.A1m;
        if (str20 != null) {
            r4.A0R("upcoming_event_id", str20);
        }
        String str21 = r5.A1c;
        if (str21 != null) {
            r4.A0R("merchant_id", str21);
        }
        if (r5.A1o != null) {
            16P.A03(r4, "product_ids");
            for (String str22 : r5.A1o) {
                if (str22 != null) {
                    r4.A0t(str22);
                }
            }
            r4.A0Y();
        }
        if (r5.A12 != null) {
            r4.A0q("server_sticker_burn_in_params");
            ABB.A00(r4, r5.A12);
        }
        if (r5.A0f != null) {
            r4.A0q("text_post_sticker");
            D0C.A00(r4, r5.A0f, true);
        }
        if (r5.A0H != null) {
            r4.A0q("story_explore_shareable_grid");
            C45544CyI.A00(r4, r5.A0H);
        }
        if (r5.A0G != null) {
            r4.A0q("explore_shareable_grid_metadata");
            C45543CyH.A00(r4, r5.A0G);
        }
        if (r5.A0I != null) {
            r4.A0q("ig_bio_sticker");
            C381449bm r02 = r5.A0I;
            r4.A0c();
            1ea r1 = r02.A00;
            if (r1 != null) {
                r4.A0q("bio_product");
                C65591eY.A00(r4, r1);
            }
            r4.A0Z();
        }
        String str23 = r5.A1N;
        if (str23 != null) {
            r4.A0R("attribution", str23);
        }
        r4.A0S("is_sticker", r5.A1t);
        r4.A0S("use_custom_title", r5.A1u);
        String str24 = r5.A1R;
        if (str24 != null) {
            r4.A0R("custom_title", str24);
        }
        String str25 = r5.A1g;
        if (str25 != null) {
            r4.A0R("display_type", str25);
        }
        String str26 = r5.A1W;
        if (str26 != null) {
            r4.A0R("highlighted_media_ids", str26);
        }
        r4.A0S("is_hidden", r5.A1s);
        r4.A0S("is_fb_sticker", r5.A1r);
        r4.A0P("tap_state", r5.A07);
        String str27 = r5.A1k;
        if (str27 != null) {
            r4.A0R("tap_state_str_id", str27);
        }
        String str28 = r5.A1i;
        if (str28 != null) {
            r4.A0R("str_id", str28);
        }
        String str29 = r5.A1h;
        if (str29 != null) {
            r4.A0R("sticker_type", str29);
        }
        AnonymousClass3WT r03 = r5.A10;
        if (r03 != null) {
            r4.A0R("object_type", r03.A00);
        }
        String str30 = r5.A1Y;
        if (str30 != null) {
            r4.A0R("image_id", str30);
        }
        if (r5.A17 != null) {
            r4.A0q("ring_glyph");
            D2M.A00(r4, r5.A17, true);
        }
        if (r5.A0N != null) {
            r4.A0q("story_public_collection");
            C45612CzO.A00(r4, r5.A0N);
        }
        if (r5.A0M != null) {
            r4.A0q("public_collection_metadata");
            BG5 bg5 = r5.A0M;
            r4.A0c();
            String str31 = bg5.A00;
            if (str31 != null) {
                r4.A0R("collection_id", str31);
            }
            r4.A0Z();
        }
        r4.A0Z();
    }
}
