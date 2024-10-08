package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.Map;

/* renamed from: X.Lan  reason: case insensitive filesystem */
public final class C64371Lan implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C64371Lan.class);
    public static final String __redex_internal_original_name = "ReelFBShareUtil";

    public static 1OC A00(Context context, AnonymousClass0iw r15, UserSession userSession, C255773uh r17, C311336cW r18, Boolean bool, Integer num, String str, boolean z) {
        String A30;
        int i;
        C255773uh r5 = r17;
        1Xj r2 = r5.A0b;
        if (r2 == null) {
            A30 = "";
        } else {
            A30 = r2.A30();
        }
        if (r5.A0C() == null) {
            i = -1;
        } else {
            i = r5.A0C().A00;
        }
        AnonymousClass0iw r3 = r15;
        UserSession userSession2 = userSession;
        String str2 = str;
        UserSession userSession3 = userSession2;
        LT0.A02(userSession3, r15, str2, A30, "one_tap_share", i);
        C63394KwF.A00(userSession3, "request", "self_story", AnonymousClass7TF.A0g(userSession2), str2, (Map) null);
        int i2 = 2131973641;
        if (z) {
            i2 = 2131973682;
        }
        r2.getClass();
        1OC A002 = C63421Kwh.A00(userSession2, new ShareLaterMedia(r2), num, str2, "story_viewer");
        A002.A00 = new KAP(context, r3, userSession2, r5, r18, str2, i2, bool.booleanValue());
        return A002;
    }
}
