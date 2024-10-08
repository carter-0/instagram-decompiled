package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KiH  reason: case insensitive filesystem */
public enum C62584KiH {
    A0K("Unknown", "unknown"),
    A0A(ReactProgressBarViewManager.DEFAULT_STYLE, "normal"),
    A0C("Nux", "nux"),
    A0G("SingleUserJoined", "single_user_joined"),
    A08("MultipleUsersJoined", "multiple_users_joined"),
    A0D("SendJoinRequest", "r2j_prompt"),
    A0E("SentJoinRequest", "r2j_pending"),
    A0N("ViewJoinRequest", "guest_r2j"),
    A09("NewSupporter", "new_supporter"),
    A0M("UserPayRecognition", "user_pay_recognition"),
    A0B("Notify", "notify"),
    A05("Follow", "follow"),
    A0L("UserFollowed", "user_followed"),
    A0O("ViewerListDisclaimer", "viewer_list_disclaimer"),
    A0I("SocialContext", "social_context"),
    A0F("Share", "share"),
    A07("LiveModeratorUpsell", "live_moderator_upsell"),
    A06("InviteToFriendChat", "invite_to_friend_chat"),
    A0H("SingleUserLeft", "single_user_left"),
    A0J("SupActiveAttribution", "sup_active_attribution");
    
    public static final Map A02 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C62584KiH[] kiHArr;
        A03 = 0oU.A00(kiHArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (C62584KiH kiH : values()) {
            A0x.put(kiH.A01, kiH);
        }
        A02 = A0x;
    }

    /* access modifiers changed from: public */
    C62584KiH(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
