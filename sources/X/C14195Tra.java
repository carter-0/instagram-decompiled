package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tra  reason: case insensitive filesystem */
public abstract /* synthetic */ class C14195Tra {
    public static Map A00(Hashtag hashtag) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hashtag.Ab5() != null) {
            linkedHashMap.put("allow_following", hashtag.Ab5());
        }
        if (hashtag.Ab8() != null) {
            linkedHashMap.put("allow_muting_story", hashtag.Ab8());
        }
        if (hashtag.B6q() != null) {
            linkedHashMap.put("follow_status", hashtag.B6q());
        }
        if (hashtag.B6z() != null) {
            linkedHashMap.put("following", hashtag.B6z());
        }
        if (hashtag.B7j() != null) {
            linkedHashMap.put("formatted_media_count", hashtag.B7j());
        }
        if (hashtag.BDK() != null) {
            linkedHashMap.put("hide_use_hashtag_button", hashtag.BDK());
        }
        if (hashtag.getId() != null) {
            C41845B3m.A0x(hashtag.getId(), linkedHashMap);
        }
        if (hashtag.CSN() != null) {
            linkedHashMap.put("is_eligible_for_survey", hashtag.CSN());
        }
        if (hashtag.CWZ() != null) {
            linkedHashMap.put("is_local", hashtag.CWZ());
        }
        if (hashtag.BPt() != null) {
            linkedHashMap.put("media_count", hashtag.BPt());
        }
        if (hashtag.getName() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, hashtag.getName());
        }
        if (hashtag.BWU() != null) {
            linkedHashMap.put("non_violating", hashtag.BWU());
        }
        if (hashtag.Bh3() != null) {
            ImageUrl Bh3 = hashtag.Bh3();
            if (Bh3 != null) {
                str = Bh3.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("profile_pic_url", str);
        }
        if (hashtag.BqG() != null) {
            linkedHashMap.put("search_result_subtitle", hashtag.BqG());
        }
        if (hashtag.BqN() != null) {
            linkedHashMap.put("search_subtitle", hashtag.BqN());
        }
        if (hashtag.CCV() != null) {
            linkedHashMap.put("use_default_avatar", hashtag.CCV());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
