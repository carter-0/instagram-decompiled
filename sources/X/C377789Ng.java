package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9Ng  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C377789Ng {
    public static Map A00(VideoVersionIntf videoVersionIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoVersionIntf.B3l() != null) {
            DirectMediaFallbackUrlIntf B3l = videoVersionIntf.B3l();
            if (B3l != null) {
                treeUpdaterJNI = B3l.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fallback", treeUpdaterJNI);
        }
        if (videoVersionIntf.BCu() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, videoVersionIntf.BCu());
        }
        if (videoVersionIntf.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, videoVersionIntf.getId());
        }
        if (videoVersionIntf.CAf() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, videoVersionIntf.CAf());
        }
        if (videoVersionIntf.getUrl() != null) {
            linkedHashMap.put("url", videoVersionIntf.getUrl());
        }
        if (videoVersionIntf.CCK() != null) {
            linkedHashMap.put("url_expiration_timestamp_us", videoVersionIntf.CCK());
        }
        if (videoVersionIntf.CGY() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, videoVersionIntf.CGY());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
