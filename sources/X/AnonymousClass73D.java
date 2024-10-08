package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.73D  reason: invalid class name */
public final class AnonymousClass73D {
    public static final AnonymousClass73D A00 = new Object();

    public final 1GP A04(UserSession userSession, Integer num, String str, String str2, boolean z) {
        0qQ.A0B(num, 3);
        1FZ A02 = AnonymousClass93V.A02(userSession, 173651701);
        A02.A9m("should_stream_response", "true");
        A02.A9m("should_have_max_id_in_last_chunk_only", "true");
        A02.A0C("no_of_medias_in_each_chunk", 6);
        A02(A02, userSession, num, str, str2, (String) null, z);
        return A02.A0M();
    }

    public static final XEI A00(UserSession userSession, AnonymousClass3JC r6) {
        C250663lr requiredTreeField;
        B5i b5i;
        C250663lr r4 = (C250663lr) r6.A01;
        if (r4 != null && (requiredTreeField = r4.getRequiredTreeField(0, "xdt_user_clips_graphql(data:$data)", C41887B5g.class, 352468645)) != null && (b5i = (B5i) requiredTreeField.reinterpretRequired(0, B5i.class, -2107973840)) != null) {
            return new XEI(b5i.A0E(1E4.A00(userSession)).A0q(), b5i, userSession, 1E4.A00(userSession));
        }
        throw new RuntimeException("Expected profile clips to be available");
    }

    public static final 1OC A01(UserSession userSession, String str, String str2) {
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("usertags/review/");
        r2.A9m(str, str2);
        r2.A9m("container_module", "feed_contextual_self_profile");
        r2.A0Q(1XP.class, 1XY.class);
        r2.A0R = true;
        return r2.A0M();
    }

    public static final void A02(1Fa r5, UserSession userSession, Integer num, String str, String str2, String str3, boolean z) {
        Integer num2 = AnonymousClass05K.A01;
        r5.A08(num2);
        String str4 = "clips/user/";
        r5.A0A(str4);
        r5.A9m("include_feed_video", "true");
        r5.A0G("target_user_id", str);
        r5.A0G("max_id", str2);
        r5.A0G("audience", str3);
        if (str != null) {
            str4 = 002.A0R(str4, str);
        }
        if (str2 != null) {
            str4 = 002.A0R(str4, str2);
        }
        r5.A0A = str4;
        if (z || 2R8.A05(userSession, str)) {
            r5.A07(num2);
        } else {
            r5.A07(AnonymousClass05K.A0N);
            r5.A01 = TimeUnit.MINUTES.toMillis(60);
        }
        if (num == num2) {
            r5.A9m("is_request_from_viewer", "true");
        }
    }

    public final PandoGraphQLRequest A03(UserSession userSession, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        0qQ.A0B(num, 3);
        0Df A02 = GraphQlCallInput.A02.A02();
        0Df.A00(A02, true, "include_feed_video");
        String str4 = str;
        0Df.A00(A02, str4, "target_user_id");
        0Df.A00(A02, str2, "max_id");
        0Df.A00(A02, str3, "audience");
        0Df.A00(A02, 6, "no_of_medias_in_each_chunk");
        0Df.A00(A02, true, "should_stream_response");
        0Df.A00(A02, 12, "page_size");
        2IS r19 = new 2IS();
        2IS r5 = new 2IS();
        r5.A02("use_defer", false);
        r5.A02("use_stream", false);
        r5.A03("initial_stream_count", 0);
        r5.A02("stream_use_customized_batch", true);
        r5.A02("enable_likers_in_full_media", false);
        r5.A02("enable_clips_metadata_in_light_media", false);
        r5.A02("enable_thumbnails_in_light_media", false);
        r5.A02("enable_video_versions_in_light_media", false);
        r5.A02("enable_audience_in_light_media", false);
        r5.A02("exclude_main_user_field", false);
        r5.A02("exclude_caption_user_field", false);
        r19.A00.A02().A0E(A02, "data");
        r5.A02("use_defer", true);
        if (z2) {
            r5.A02("enable_audience_in_light_media", true);
        }
        0Tu r9 = 0Tu.A05;
        UserSession userSession2 = userSession;
        r5.A02("exclude_caption_user_field", Boolean.valueOf(182.A06(r9, userSession2, 36324737447506238L)));
        r5.A02("exclude_main_user_field", Boolean.valueOf(182.A06(r9, userSession2, 36324737447440701L)));
        r5.A02("use_stream", true);
        r5.A02("enable_video_versions_in_light_media", true);
        r5.A02("stream_use_customized_batch", true);
        r5.A03("initial_stream_count", 6);
        r5.A02("enable_likers_in_full_media", false);
        r5.A02("enable_clips_metadata_in_light_media", false);
        r5.A02("enable_thumbnails_in_light_media", false);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ClipsProfileQuery", r19.getParamsCopy(), r5.getParamsCopy(), AnonymousClass73E.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_user_clips_graphql", new ArrayList());
        if (!z && !2R8.A05(userSession2, str4)) {
            long millis = TimeUnit.MINUTES.toMillis(60);
            pandoGraphQLRequest.setFreshCacheAgeMs(millis);
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(millis);
        }
        return pandoGraphQLRequest;
    }
}
