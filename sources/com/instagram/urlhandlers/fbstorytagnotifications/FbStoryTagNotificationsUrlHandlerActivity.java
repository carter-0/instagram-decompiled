package com.instagram.urlhandlers.fbstorytagnotifications;

import X.002;
import X.00l;
import X.0Tu;
import X.0qQ;
import X.0wj;
import X.182;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C10065Rm2;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class FbStoryTagNotificationsUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public static final String A00;
    public static final String A01;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "fb_story_tag_notifications";
    }

    static {
        String str = C10065Rm2.A01;
        A00 = 002.A0R(str, "storyviewer?bucketID=%s&storyID=%s");
        A01 = 002.A0R(str, "storyviewer?bucketID=%s&storyID=%s&mibextid=%s");
    }

    public static final String A01(FbStoryTagNotificationsUrlHandlerActivity fbStoryTagNotificationsUrlHandlerActivity, String str, String str2) {
        String formatStrLocaleSafe;
        String A04 = 182.A04(0Tu.A05, fbStoryTagNotificationsUrlHandlerActivity.A00, 36883160503878126L);
        if (00l.A0W(A04)) {
            A02(fbStoryTagNotificationsUrlHandlerActivity, "Story mention tracker mibextid is not available", (Throwable) null);
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/stories/%s/%s", str, str2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/stories/%s/%s?mibextid=%s", str, str2, A04);
        }
        0qQ.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static final void A02(FbStoryTagNotificationsUrlHandlerActivity fbStoryTagNotificationsUrlHandlerActivity, String str, Throwable th) {
        if (fbStoryTagNotificationsUrlHandlerActivity.A00 != null) {
            AnonymousClass7TG.A1I(0wj.A01, 002.A0R("FbStoryTagNotificationsUrlHandlerActivity - ", str), th, 20134884);
        }
    }
}
