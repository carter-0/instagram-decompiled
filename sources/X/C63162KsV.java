package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;

/* renamed from: X.KsV  reason: case insensitive filesystem */
public abstract class C63162KsV {
    public static final ClipsStackedTimelineFragment A00(UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C390839rv r7, C390919s3 r8, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C2801950r r10, String str, String str2, boolean z, boolean z2) {
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        1QP r4 = A01.A0J;
        long j = A01.A0A;
        AE4 ae4 = new AE4(r4);
        ae4.A01 = j;
        ae4.A04("launch_stacked_timeline");
        Bundle A0A = DbV.A0A(userSession);
        A0A.putSerializable("ARG_CLIPS_CREATION_TYPE", r10);
        A0A.putSerializable("ARG_EDITOR_TRANSITION_SOURCE", r7);
        A0A.putSerializable("ARG_EDITOR_CONFIG", clipsTimelineEditorConfig);
        A0A.putString("ARG_SELECTED_STICKER_ID", (String) null);
        A0A.putString("ARG_SELECTED_AUDIO_ID", str);
        A0A.putBoolean("ARG_SWIPE_TO_ENTER_TIMELINE", z);
        A0A.putParcelable("ARG_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        A0A.putSerializable("ARG_OPEN_TIMELINE_STATE", r8);
        A0A.putString("ARG_CLIPS_DRAFT_SESSION_ID", str2);
        A0A.putBoolean("ARG_IS_BASEL", z2);
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = new ClipsStackedTimelineFragment();
        clipsStackedTimelineFragment.setArguments(A0A);
        return clipsStackedTimelineFragment;
    }
}
