package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8X7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8X7 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ AnonymousClass8X7(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass80R r1 = this.A00;
        AnonymousClass88X r2 = (AnonymousClass88X) obj;
        List list = r2.A04;
        if (!list.isEmpty()) {
            r1.A20.A00();
            C3499482o r0 = r1.A0o.A02;
            ACRType aCRType = r2.A00;
            r0.A01.A01 = aCRType;
            AnonymousClass8XA A002 = r1.A1N.A00();
            UserSession userSession = A002.A0F;
            CameraSpec A003 = A002.A0h.A00();
            String AoA = A002.A0a.AoA();
            if (AoA != null) {
                String str = A002.A0N.A02.A01.A0F;
                0qQ.A07(str);
                28D r11 = A002.A0P.A00.A01;
                String str2 = r2.A03;
                AudioOverlayTrack audioOverlayTrack = r2.A01;
                boolean z = r2.A09;
                boolean z2 = r2.A08;
                boolean z3 = r2.A06;
                List list2 = r2.A05;
                Integer num = r2.A02;
                0qQ.A0B(r11, 5);
                if (!list.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                    bundle.putParcelableArrayList("selected_media", new ArrayList(list));
                    bundle.putParcelable("camera_spec", A003);
                    bundle.putString("clips_session_id", AoA);
                    bundle.putString("music_browse_session_id", str);
                    bundle.putBoolean("should_use_max_duration", z);
                    bundle.putBoolean("is_from_gallery_selection_entry_point", z3);
                    bundle.putSerializable("camera_entry_point", r11);
                    if (str2 != null) {
                        bundle.putString("auto_created_collection_id", str2);
                    }
                    if (aCRType != null) {
                        bundle.putString("auto_created_source_acr_type", aCRType.A00);
                    }
                    if (audioOverlayTrack != null) {
                        bundle.putParcelable(C66579MXk.A00(389), audioOverlayTrack);
                    }
                    bundle.putBoolean("should_close_camera_on_exit", z2);
                    if (list2 != null && (!list2.isEmpty())) {
                        bundle.putIntegerArrayList("predefined_video_highlights_start_time_in_ms", new ArrayList(list2));
                    }
                    if (num != null) {
                        bundle.putInt("prefilled_reels_duration_in_ms", num.intValue());
                    }
                    boolean A06 = 182.A06(0Tu.A05, userSession, 36316207640481889L);
                    Fragment fragment = A002.A0B;
                    if (A06) {
                        AnonymousClass6W8.A03(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "clips_audition").A0C(fragment.requireContext());
                    } else {
                        C54144H0o h0o = new C54144H0o();
                        h0o.setArguments(bundle);
                        new 2YN(fragment).A00(C356988Vz.class).A01.A0B(new AnonymousClass88W(h0o));
                    }
                    27r A01 = 27p.A01(userSession);
                    C279294yP r5 = C279294yP.CLIPS;
                    29Z r3 = A01.A0F;
                    0wc r22 = r3.A01;
                    0Aj A004 = r22.A00(r22.A00, "ig_camera_ui_tool_click");
                    if (A004.isSampled()) {
                        AnonymousClass80P r4 = AnonymousClass80P.SOUND_SYNC;
                        A004.A8M(r4, "tool_type");
                        A004.AAJ("legacy_falco_event_name", "IG_CAMERA_SELECT_TOOL");
                        AnonymousClass283 r32 = r3.A04;
                        String str3 = r32.A0L;
                        if (str3 == null) {
                            str3 = "";
                        }
                        A004.AAJ("camera_session_id", str3);
                        A004.A8M(r32.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A004.A8k("event_type", 2);
                        A004.AAJ("module", 27x.A08.getModuleName());
                        A004.A8M(r32.A0C, "surface");
                        A004.A8M(r5, "camera_destination");
                        A004.A8M(r4, "camera_tool");
                        A004.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                        C342197oC r12 = r32.A06;
                        if (r12 != null) {
                            A004.A8M(r12, "folding_state");
                        }
                        A004.Cgf();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
