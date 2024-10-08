package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4T {
    public static Map A00(UserTagInfoDictIntf userTagInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (userTagInfoDictIntf.AmF() != null) {
            linkedHashMap.put("categories", userTagInfoDictIntf.AmF());
        }
        if (userTagInfoDictIntf.AzK() != null) {
            linkedHashMap.put("duration_in_video_in_sec", 012.A0p(String.valueOf(userTagInfoDictIntf.AzK())));
        }
        ArrayList arrayList = null;
        if (userTagInfoDictIntf.Bdo() != null) {
            List<Number> Bdo = userTagInfoDictIntf.Bdo();
            if (Bdo != null) {
                arrayList = new ArrayList();
                for (Number floatValue : Bdo) {
                    Double A0p = 012.A0p(String.valueOf(floatValue.floatValue()));
                    if (A0p != null) {
                        arrayList.add(A0p);
                    }
                }
            }
            linkedHashMap.put("position", arrayList);
        }
        if (userTagInfoDictIntf.Bv9() != null) {
            linkedHashMap.put("show_category_of_user", userTagInfoDictIntf.Bv9());
        }
        if (userTagInfoDictIntf.Byq() != null) {
            linkedHashMap.put("start_time_in_video_in_sec", 012.A0p(String.valueOf(userTagInfoDictIntf.Byq())));
        }
        User CCd = userTagInfoDictIntf.CCd();
        if (CCd != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CCd.A08());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
