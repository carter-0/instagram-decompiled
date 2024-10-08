package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V86 {
    public static Map A00(XAY xay) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xay.getProfilePicUrl() != null) {
            linkedHashMap.put("profile_pic_url", xay.getProfilePicUrl());
        }
        if (xay.CCq() != null) {
            linkedHashMap.put("user_igid", xay.CCq());
        }
        if (xay.getUsername() != null) {
            linkedHashMap.put(Dbh.A00(), xay.getUsername());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
