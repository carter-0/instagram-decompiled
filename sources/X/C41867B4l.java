package X;

import com.instagram.api.schemas.ProfilePicUrlInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4l  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41867B4l {
    public static Map A00(ProfilePicUrlInfo profilePicUrlInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        profilePicUrlInfo.getHeight();
        linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(profilePicUrlInfo.getHeight()));
        if (profilePicUrlInfo.getUrl() != null) {
            linkedHashMap.put("url", profilePicUrlInfo.getUrl());
        }
        profilePicUrlInfo.getWidth();
        linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(profilePicUrlInfo.getWidth()));
        return 0Yt.A0B(linkedHashMap);
    }
}
