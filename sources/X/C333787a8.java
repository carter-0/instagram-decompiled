package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14Impl;

/* renamed from: X.7a8  reason: invalid class name and case insensitive filesystem */
public final class C333787a8 {
    public final 1QP A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final UserSession A04;

    public C333787a8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public final void A02(AnonymousClass5OB r11, 1iA r12, String str, String str2, int i, long j, boolean z) {
        String A002;
        int ordinal;
        0qQ.A0B(str2, 7);
        1QP r4 = this.A00;
        Integer num = AnonymousClass05K.A0Y;
        if (r11 == AnonymousClass5OB.VIEW_ALL_COMMENTS) {
            A002 = "post_comment_from_view_all_comments";
        } else {
            A002 = AnonymousClass000.A00(3758);
        }
        long A003 = r4.A00(num, A002, "comment_post_click");
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap.contains(str2)) {
            0f9 AEf = 0wj.A01.AEf("comment_user_flow_logging", 817896325);
            AEf.ABQ("post_comment_flow", "Attempting to start a marker that has already started.");
            AEf.report();
            return;
        }
        concurrentHashMap.put(str2, Long.valueOf(A003));
        r4.flowAnnotate(A003, "analytics_module", str);
        r4.flowAnnotate(A003, "is_reply", z);
        r4.flowAnnotate(A003, "delay_internal", TimeUnit.MILLISECONDS.toSeconds(j));
        r4.flowAnnotate(A003, "comment_count", i);
        r4.flowAnnotate(A003, "media_type", r12.name());
        r4.flowAnnotate(A003, "mvvm_comments", true);
        if (r11 == null) {
            ordinal = -1;
        } else {
            ordinal = r11.ordinal();
        }
        String str3 = "carousel_slide_mention";
        switch (ordinal) {
            case -1:
            case 10:
                str3 = "unknown";
                break;
            case 0:
                str3 = "feed_comment_button";
                break;
            case 1:
                str3 = "view_all_comments";
                break;
            case 2:
                str3 = "notification";
                break;
            case 3:
                str3 = "feed_caption";
                break;
            case 4:
                str3 = C273654mx.A00(364);
                break;
            case 5:
                str3 = "direct_comment_share";
                break;
            case 6:
                str3 = "reels_video_comment_button";
                break;
            case 7:
                str3 = "peek_comments";
                break;
            case 8:
                str3 = AnonymousClass000.A00(239);
                break;
            case 9:
                str3 = C273654mx.A00(3488);
                break;
            case 11:
                str3 = "deep_link";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str3 = "broadcast_channel";
                break;
            case 13:
            case 14:
                break;
            case 15:
                str3 = "story_comment_share_sticker";
                break;
            case 16:
                str3 = "comment_view_replies";
                break;
            case 17:
                str3 = "social_share_tab";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str3 = "reels_preview_comment";
                break;
            case 19:
                str3 = "reels_social_context";
                break;
            case 20:
                str3 = "reels_social_context_bubble";
                break;
            case 21:
                str3 = "poll_indicator";
                break;
            case 22:
                str3 = "content_notes_overflow_preview";
                break;
            case 23:
                str3 = "content_notes_production_nux";
                break;
            case 24:
                str3 = "feed_social_context_bubble";
                break;
            case 25:
                str3 = "reels_inline_comment";
                break;
            case 26:
                str3 = "testimonial";
                break;
            default:
                throw new RuntimeException();
        }
        r4.flowAnnotate(A003, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        Number number = (Number) this.A03.get(str);
        if (number != null) {
            this.A00.flowMarkPoint(number.longValue(), C273654mx.A00(942));
        }
    }

    public final void A04(String str, boolean z) {
        1QP r4 = this.A00;
        long A002 = r4.A00(AnonymousClass05K.A0Y, AnonymousClass000.A00(2986), "comment_post_click");
        ConcurrentHashMap concurrentHashMap = this.A01;
        if (concurrentHashMap.contains(str)) {
            0f9 AEf = 0wj.A01.AEf("comment_user_flow_logging", 817896325);
            AEf.ABQ("delete_comment_flow", "Attempting to start a marker that has already started.");
            AEf.report();
            return;
        }
        r4.flowAnnotate(A002, "mvvm_comments", z);
        concurrentHashMap.put(str, Long.valueOf(A002));
    }

    public static final void A00(C333787a8 r5, String str, String str2, String str3, String str4, Map map) {
        Number number = (Number) map.get(str);
        if (number == null) {
            0f9 AEf = 0wj.A01.AEf("comment_user_flow_logging", 817896325);
            AEf.ABQ(str2, "Attempted to fail marker that was never started.");
            AEf.report();
            return;
        }
        if (!(str3 == null || str3.length() == 0)) {
            r5.A00.flowAnnotate(number.longValue(), AnonymousClass000.A00(2901), str3);
        }
        if (!(str4 == null || str4.length() == 0)) {
            r5.A00.flowAnnotate(number.longValue(), "comment_error_code", str3);
        }
        r5.A00.flowEndFail(number.longValue(), str2, (String) null);
        map.remove(str);
    }

    public static final void A01(C333787a8 r2, String str, String str2, Map map) {
        Number number = (Number) map.get(str);
        if (number == null) {
            0f9 AEf = 0wj.A01.AEf("comment_user_flow_logging", 817896325);
            AEf.ABQ(str2, "Attempted to end marker that was never started.");
            AEf.report();
            return;
        }
        r2.A00.flowEndSuccess(number.longValue());
        map.remove(str);
    }
}
