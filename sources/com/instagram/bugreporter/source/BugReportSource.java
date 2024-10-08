package com.instagram.bugreporter.source;

import X.08f;
import X.0Yv;
import X.0oU;
import X.0se;
import X.DbS;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BugReportSource {
    USER_OPTIONS("user_options"),
    RAGE_SHAKE("ig_rage_shake"),
    DIRECT_APP_PROFILE_SETTINGS("direct_app_profile_settings"),
    DIRECT_SEND_FAILURE("direct_send_failure"),
    DIRECT_THREAD_DETAIL("thread_details"),
    DIRECT_VISUAL_MESSAGE_REPORT_FLOW("direct_visual_message_report_flow"),
    IGTV_UPLOAD_REPORT_FLOW("igtv_upload_report_flow"),
    APPIRATER_FEEDBACK("appirater_feedback"),
    VIDEO_CALL_FAILED("video_call_failed"),
    VIDEO_CALL_FULL("video_call_is_full"),
    VIDEO_CALL_NO_ANSWER("video_call_no_answer"),
    UI_QUALITY_REVIEW("ui_quality_review"),
    BLOKS("bloks"),
    COWATCH("cowatch"),
    MEDIA_DELETED("media_deleted"),
    BARCELONA_RAGE_SHAKE("barcelona_rage_shake"),
    BARCELONA_APP_SETTING("barcelona_app_setting"),
    BARCELONA_FEED_TAB("barcelona_feed_tab"),
    NEWSFEED_STORY("activity_feed_notification_bug_report"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        BugReportSource[] bugReportSourceArr;
        08f A002 = 0oU.A00(bugReportSourceArr);
        A02 = A002;
        int A0L = 0se.A0L(0Yv.A1E(A002, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (Object next : A002) {
            A0x.put(((BugReportSource) next).A00, next);
        }
        A01 = A0x;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BugReportSource(String str) {
        this.A00 = str;
    }
}
