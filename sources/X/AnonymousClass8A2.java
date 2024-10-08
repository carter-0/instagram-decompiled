package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.CameraCapturer;

/* renamed from: X.8A2  reason: invalid class name */
public final class AnonymousClass8A2 {
    public long A00 = 17636030;
    public long A01 = 42144080;
    public long A02 = 0;
    public long A03 = 42152557;
    public long A04 = 17643726;
    public long A05 = 17636574;
    public long A06 = 838604519;
    public long A07 = 0;
    public long A08 = 17630492;
    public long A09 = 0;
    public long A0A = 0;
    public long A0B = 613293953;
    public long A0C = 0;
    public long A0D = 17634094;
    public Long A0E;
    public AtomicLong A0F = new AtomicLong(838607486);
    public long A0G = 838613025;
    public long A0H = 838604618;
    public long A0I = 838609653;
    public final 1QP A0J;
    public final 29E A0K;
    public final 02m A0L;

    public AnonymousClass8A2(1QP r7, 29E r8, 02m r9) {
        0qQ.A0B(r9, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r8, 3);
        this.A0L = r9;
        this.A0J = r7;
        this.A0K = r8;
    }

    public final void A04(28D r19, C2801950r r20, String str, String str2, int i) {
        28D r5 = r19;
        0qQ.A0B(r5, 0);
        C2801950r r0 = r20;
        0qQ.A0B(r0, 3);
        if (r0 == C2801950r.CLIPS) {
            AtomicLong atomicLong = this.A0F;
            29E r6 = this.A0K;
            atomicLong.set(r6.A04((Integer) null, (String) null, 838607486, 12000));
            r6.A0B(atomicLong.get(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r5.name(), true);
            r6.A0B(atomicLong.get(), "num_segments", String.valueOf(i), false);
            r6.A0B(atomicLong.get(), "camera_destination", str, true);
            r6.A0B(atomicLong.get(), "clips_creation_type", r0.A00, true);
            String str3 = str2;
            if (str2 != null) {
                r6.A0B(atomicLong.get(), "camera_session_id", str3, false);
            }
        }
    }

    public final void A05(28D r13, C2801950r r14, String str, List list) {
        C2801950r r5 = r14;
        0qQ.A0B(r14, 0);
        if (r14 == C2801950r.CLIPS) {
            List list2 = list;
            if (list != null) {
                this.A0K.A0B(this.A0F.get(), "segments_sources", 00k.A0P(",", "", "", list2, C41722AzD.A00), false);
            }
            A00(r13, this, r5, str, "trans_post_cap_finish", "2");
        }
    }

    public final void A06(28D r8, String str, int i, boolean z, boolean z2) {
        0qQ.A0B(r8, 0);
        29E r0 = this.A0K;
        long A042 = r0.A04((Integer) null, (String) null, 838609653, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        this.A0I = A042;
        29E r1 = r0;
        r1.A0B(A042, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r8.name(), false);
        r1.A0B(this.A0I, "is_soundsync", String.valueOf(z), false);
        r0.A0B(this.A0I, "media_type", str, false);
        29E r12 = r0;
        r12.A0B(this.A0I, "duration_ms", String.valueOf(i), false);
        r12.A0B(this.A0I, "is_template", String.valueOf(z2), false);
    }

    public final void A08(AnonymousClass80X r19, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str;
        0qQ.A0B(str5, 0);
        String str6 = str2;
        0qQ.A0B(str6, 1);
        AnonymousClass80X r5 = r19;
        0qQ.A0B(r5, 3);
        29E r7 = this.A0K;
        long A042 = r7.A04((Integer) null, (String) null, 838604618, 12000);
        this.A0H = A042;
        29E r12 = r7;
        r12.A0B(A042, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5, false);
        String str7 = str3;
        if (str3 != null) {
            r12.A0B(this.A0H, "camera_session_id", str7, true);
        }
        r12.A0B(this.A0H, "capture_state", r5.name(), true);
        r12.A0B(this.A0H, "camera_destination", str6, false);
        if (0qQ.A0K(str4, "clips_use_audio_button") && !z) {
            r7.A0D("music_apply_started_during_use_audio", this.A0D, (String) null, (String) null, (String) null, (String) null);
        }
    }

    public final void A0G(String str) {
        29E r0 = this.A0K;
        long A042 = r0.A04((Integer) null, (String) null, 42144080, 12000);
        this.A01 = A042;
        r0.A0B(A042, "camera_session_id", str, false);
    }

    public final void A0J(String str) {
        0qQ.A0B(str, 0);
        29E r0 = this.A0K;
        long A042 = r0.A04((Integer) null, (String) null, 17634094, 12000);
        this.A0D = A042;
        r0.A0B(A042, "camera_destination", str, false);
    }

    public final void A0K(String str, long j) {
        0qQ.A0B(str, 0);
        this.A0K.A07(str, "", 42154153, j);
    }

    public final void A0L(String str, String str2) {
        String str3 = str2;
        0qQ.A0B(str2, 1);
        29E r0 = this.A0K;
        long A042 = r0.A04((Integer) null, (String) null, 838613025, 7000);
        this.A0G = A042;
        String str4 = str;
        if (str != null) {
            r0.A0B(A042, "camera_session_id", str4, true);
        }
        r0.A0B(this.A0G, "segment_source", str3, true);
    }

    public final void A0M(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        this.A05 = this.A0K.A07(str, str2, 17636574, this.A05);
    }

    public static final void A00(28D r11, AnonymousClass8A2 r12, C2801950r r13, String str, String str2, String str3) {
        String str4;
        AtomicLong atomicLong = r12.A0F;
        String str5 = str2;
        if (atomicLong.compareAndSet(838607486, 0)) {
            29E r5 = r12.A0K;
            atomicLong.set(r5.A04((Integer) null, (String) null, 838607486, 12000));
            r5.A0B(atomicLong.get(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r11.name(), false);
            r5.A0B(atomicLong.get(), "camera_destination", str, true);
            r5.A0B(atomicLong.get(), "clips_creation_type", r13.A00, true);
            r5.A0B(atomicLong.get(), "unknown_flow_start_point", str2, true);
            long j = atomicLong.get();
            String str6 = AnonymousClass1K6.A00;
            if (str6 != null) {
                int length = str6.length();
                int i = CameraCapturer.OPEN_CAMERA_DELAY_MS;
                if (500 > length) {
                    i = length;
                }
                str4 = str6.substring(length - i);
                0qQ.A07(str4);
            } else {
                str4 = "";
            }
            r5.A0B(j, "nav_chain", str4, false);
            return;
        }
        C2801950r r2 = C2801950r.CLIPS;
        29E r3 = r12.A0K;
        long j2 = atomicLong.get();
        if (r13 != r2) {
            str5 = 002.A0g(str3, "_wrong_cct_", r13.name());
        }
        r3.A0D(str5, j2, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A01() {
        this.A0G = this.A0K.A02(838613025, this.A0G);
    }

    public final void A02() {
        29E r3 = this.A0K;
        this.A0H = r3.A02(838604618, this.A0H);
        if (r3.A0E(17634094, this.A0D)) {
            this.A0D = r3.A02(17634094, this.A0D);
        }
    }

    public final void A03() {
        1QP r4 = this.A0J;
        long j = this.A02;
        AE4 ae4 = new AE4(r4);
        ae4.A01 = j;
        ae4.A04("AUDIO_TRACK_DOWNLOAD_FAIL");
        long j2 = this.A02;
        AE4 ae42 = new AE4(r4);
        ae42.A01 = j2;
        ae42.A02();
    }

    public final void A07(C279284yO r10, String str) {
        long j = this.A06;
        boolean z = r10 instanceof AnonymousClass80O;
        if (j != 838604519) {
            if (!z) {
                this.A06 = this.A0K.A02(838604519, j);
            }
        } else if (z) {
            29E r3 = this.A0K;
            long A042 = r3.A04((Integer) null, (String) null, 838604519, 1800000);
            this.A06 = A042;
            String obj = UUID.randomUUID().toString();
            0qQ.A07(obj);
            r3.A0B(A042, "reels_camera_session_id", obj, true);
            String str2 = str;
            if (str != null) {
                r3.A0B(this.A06, "camera_session_id", str2, true);
            }
        }
    }

    public final void A09(String str) {
        long j = this.A00;
        if (j != 17636030) {
            this.A0K.A0D(str, j, (String) null, (String) null, (String) null, (String) null);
        }
    }

    public final void A0A(String str) {
        this.A0G = this.A0K.A07(str, "", 838613025, this.A0G);
    }

    public final void A0B(String str) {
        29E r2 = this.A0K;
        String str2 = str;
        this.A0H = r2.A06(CancelReason.USER_CANCELLED, str2, 838604618, this.A0H);
        if (r2.A0E(17634094, this.A0D) && r2.A0E(17634094, this.A0D)) {
            this.A0D = r2.A06(CancelReason.USER_CANCELLED, str2, 17634094, this.A0D);
        }
    }

    public final void A0C(String str) {
        29E r2 = this.A0K;
        String str2 = str;
        this.A0H = r2.A07(str2, "", 838604618, this.A0H);
        if (r2.A0E(17634094, this.A0D)) {
            this.A0D = r2.A07(str2, "", 17634094, this.A0D);
        }
    }

    public final void A0D(String str) {
        this.A0K.A0D(str, this.A0H, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A0E(String str) {
        this.A0K.A0D(str, this.A05, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A0F(String str) {
        29E r3 = this.A0K;
        r3.A0B(this.A08, "result_action_name", str, true);
        this.A08 = r3.A02(17630492, this.A08);
    }

    public final void A0H(String str) {
        this.A0I = this.A0K.A07(str, "", 838609653, this.A0I);
    }

    public final void A0I(String str) {
        String str2;
        if (this.A0I == 838609653) {
            29E r7 = this.A0K;
            long A042 = r7.A04((Integer) null, (String) null, 838609653, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            this.A0I = A042;
            r7.A0D(str, A042, (String) null, (String) null, (String) null, (String) null);
            long j = this.A0I;
            String str3 = AnonymousClass1K6.A00;
            if (str3 != null) {
                int length = str3.length();
                int i = CameraCapturer.OPEN_CAMERA_DELAY_MS;
                if (500 > length) {
                    i = length;
                }
                str2 = str3.substring(length - i);
                0qQ.A07(str2);
            } else {
                str2 = "";
            }
            29E r16 = r7;
            r16.A0B(j, "nav_chain", str2, false);
            long j2 = this.A0I;
            String A002 = 0Jc.A00(new Exception());
            0qQ.A07(A002);
            r16.A0B(j2, "stack_trace", 00R.A03(A002, IgNetworkConsentStorage.MAX_ENTRIES), false);
        }
        this.A0I = this.A0K.A02(838609653, this.A0I);
    }

    public final void A0N(String str, String str2) {
        29E r4 = this.A0K;
        r4.A09(this.A01, "error", 002.A0T(str, str2, ' '));
        this.A01 = r4.A07(str, "", 42144080, this.A01);
    }

    public final void A0O(String str, String str2) {
        29E r4 = this.A0K;
        r4.A09(this.A03, "error", 002.A0R(str, str2));
        this.A03 = r4.A07(str, "", 42152557, this.A03);
    }

    public final void A0P(boolean z, boolean z2) {
        String str;
        29E r0 = this.A0K;
        long A042 = r0.A04((Integer) null, (String) null, 42152557, 12000);
        this.A03 = A042;
        if (z) {
            str = "saved-drafts";
        } else {
            str = "autosaved-drafts";
        }
        r0.A0B(A042, "draft_type", str, false);
        r0.A0B(this.A03, "is_duplicate", String.valueOf(z2), false);
    }
}
