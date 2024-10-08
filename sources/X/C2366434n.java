package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.Arrays;

/* renamed from: X.34n  reason: invalid class name and case insensitive filesystem */
public final class C2366434n {
    public final 02m A00 = 02m.A0p;
    public final C2366534o A01;
    public final UserSession A02;

    public final void A02(Reel reel, C255773uh r9, boolean z) {
        int i;
        int i2;
        0qQ.A0B(r9, 2);
        MarkerEditor withMarker = this.A00.withMarker(17301505, reel.getId().hashCode());
        if (r9.A0C() != null) {
            i = r9.A0C().A00;
        } else {
            i = -1;
        }
        withMarker.annotate("media_type", String.valueOf(i));
        withMarker.annotate("json_loaded_from_cache", String.valueOf(z));
        UserSession userSession = this.A02;
        withMarker.annotate("reel_item_count", reel.A0O(userSession).size());
        withMarker.point("REEL_JSON_RECEIVED");
        withMarker.markerEditingCompleted();
        C2366534o r2 = this.A01;
        if (r9.A0C() != null) {
            i2 = r9.A0C().A00;
        } else {
            i2 = -1;
        }
        int size = reel.A0O(userSession).size();
        r2.A0G("media_type", i2);
        r2.A0K("json_loaded_from_cache", z);
        r2.A0G("reel_item_count", size);
        C2366634p r0 = r2.A03;
        if (z) {
            r0.A02();
        } else {
            r0.A05();
        }
    }

    public final void A04(Reel reel, String str) {
        0qQ.A0B(reel, 0);
        02m r4 = this.A00;
        r4.markerAnnotate(17301505, reel.getId().hashCode(), "cancel_reason", str);
        r4.markerEnd(17301505, reel.getId().hashCode(), 4);
        C2366534o r0 = this.A01;
        r0.A0J("cancel_reason", str);
        r0.A08();
    }

    public final void A00() {
        C2366534o r2 = this.A01;
        r2.A0K("media_loaded_from_cache", false);
        r2.A04.A05();
    }

    public final void A01(Reel reel) {
        this.A00.markerEnd(17301505, reel.getId().hashCode(), 2);
        C2366534o r1 = this.A01;
        r1.A00 = true;
        r1.A0E("progress_bar_started");
        r1.A05.A05();
    }

    public final void A03(Reel reel, AnonymousClass3BQ r20, int i) {
        Reel reel2 = reel;
        String A0R = 002.A0R(AnonymousClass3PQ.A04(new C250973mM(this.A02, reel2, false, (String) null, (String) null, 0sl.A00, -1, System.currentTimeMillis(), false).A0H), r20.A00);
        02m r3 = this.A00;
        r3.markerStart(17301505, reel2.getId().hashCode());
        MarkerEditor withMarker = r3.withMarker(17301505, reel2.getId().hashCode());
        withMarker.annotate("reel_id", reel2.getId());
        int i2 = i;
        withMarker.annotate("reel_position", String.valueOf(i2));
        withMarker.annotate(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0R);
        withMarker.markerEditingCompleted();
        C2366534o r32 = this.A01;
        String id = reel2.getId();
        0qQ.A07(id);
        0qQ.A0B(A0R, 2);
        r32.A09(AwakeTimeSinceBootClock.INSTANCE.now());
        r32.A0J("reel_id", id);
        r32.A0G("reel_position", i2);
        r32.A0J(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0R);
    }

    public final void A05(String str) {
        this.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), 3);
    }

    public final void A06(String str) {
        this.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), 2);
    }

    public final void A07(String str) {
        this.A00.markerPoint(17323904, Arrays.hashCode(new Object[]{str}), "metadata_loaded");
    }

    public C2366434n(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = new C2366534o(userSession);
    }
}
