package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.effect.AREffect;
import java.util.UUID;

/* renamed from: X.81q  reason: invalid class name and case insensitive filesystem */
public final class C3497581q implements C3497681r {
    public String A00;
    public final int A01;
    public final long A02;
    public final 29E A03;

    public final void Ewa(28D r31, C279284yO r32, AREffect aREffect, String str, String str2) {
        C279284yO r3 = r32;
        0qQ.A0B(r3, 2);
        28D r6 = r31;
        0qQ.A0B(r6, 3);
        String id = aREffect.getId();
        0qQ.A07(id);
        29E r8 = this.A03;
        int i = this.A01;
        int hashCode = id.hashCode();
        UserFlowLoggerImpl userFlowLoggerImpl = r8.A00;
        String str3 = str;
        String str4 = str2;
        if (!r8.A0E(i, userFlowLoggerImpl.generateFlowId(i, hashCode))) {
            String str5 = this.A00;
            if (str5 != null) {
                r8.A06(CancelReason.USER_CANCELLED, "new_effect_selected", i, userFlowLoggerImpl.generateFlowId(i, str5.hashCode()));
                this.A00 = null;
            }
            long A04 = r8.A04(Integer.valueOf(hashCode), (String) null, i, this.A02);
            this.A00 = id;
            29E r9 = r8;
            r9.A0B(A04, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r6.name(), true);
            r8.A0B(A04, "effect_id", id, true);
            r8.A0B(A04, "request_source", str4, true);
            r9.A0B(A04, "camera_destination", r3.A02, true);
            if (str != null) {
                r8.A0B(A04, "camera_session_id", str3, true);
                return;
            }
            return;
        }
        int hashCode2 = UUID.randomUUID().hashCode();
        long A042 = r8.A04(Integer.valueOf(hashCode2), (String) null, i, this.A02);
        29E r15 = r8;
        r15.A0B(A042, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r6.name(), true);
        29E r24 = r8;
        long j = A042;
        r24.A0B(j, "effect_id", id, true);
        r24.A0B(j, "request_source", str4, true);
        r15.A0B(A042, "camera_destination", r3.A02, true);
        if (str != null) {
            r8.A0B(A042, "camera_session_id", str3, true);
        }
        r8.A06(CancelReason.LOGIC_CONSTRAINT, "request_already_in_progress", i, A042);
        this.A00 = null;
    }

    private final void A01(String str, String str2, String str3, String str4) {
        if (this.A00 != null) {
            String str5 = str3;
            if (str == null || str.length() == 0) {
                A00("finishWithFailure", str5);
                return;
            }
            29E r3 = this.A03;
            int i = this.A01;
            long generateFlowId = r3.A00.generateFlowId(i, str.hashCode());
            r3.A0B(generateFlowId, AnonymousClass000.A00(34), str2, false);
            long j = generateFlowId;
            r3.A0B(j, TraceFieldType.ErrorCode, str5, false);
            String str6 = str4;
            if (str4 != null) {
                r3.A0B(generateFlowId, "error_details", 0mp.A04(str6, 200), false);
            }
            r3.A07(str5, "", i, j);
            this.A00 = null;
        }
    }

    public final void AVb(String str) {
        if (this.A00 == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            A00("finishSuccessfully", "");
            return;
        }
        29E r3 = this.A03;
        int i = this.A01;
        r3.A02(i, r3.A00.generateFlowId(i, str.hashCode()));
        this.A00 = null;
    }

    public final void AVc(C8993RKl rKl, String str) {
        String str2;
        Integer num = rKl.A00;
        if (num != null) {
            str2 = C9235RUm.A00(num);
        } else {
            str2 = "exception";
        }
        A01(str, "ard", str2, rKl.getMessage());
    }

    public final void AVd(String str, String str2, String str3) {
        A01(str, "are", str2, str3);
    }

    public final void AVe(String str, String str2) {
        A01(str, "ig", str2, (String) null);
    }

    public final void Cln(String str) {
        if (this.A00 == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            A00("markEffectLoadRequestComplete", "");
            return;
        }
        29E r3 = this.A03;
        r3.A0D("effect_load_request_complete", r3.A00.generateFlowId(this.A01, str.hashCode()), (String) null, (String) null, (String) null, (String) null);
    }

    public final void Clo(String str, String str2, String str3) {
        if (this.A00 == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            A00("markEffectLoadRequestSubmitted", "");
            return;
        }
        29E r3 = this.A03;
        long generateFlowId = r3.A00.generateFlowId(this.A01, str.hashCode());
        r3.A0D("effect_load_request_submitted", generateFlowId, (String) null, (String) null, (String) null, (String) null);
        29E r7 = r3;
        long j = generateFlowId;
        r7.A0B(j, "arfx_session_id", str2, false);
        r7.A0B(j, C273654mx.A00(174), str3, false);
    }

    public final void Clp(String str, boolean z) {
        if (this.A00 == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            A00("markEffectRenderEventSent", "");
            return;
        }
        29E r3 = this.A03;
        long generateFlowId = r3.A00.generateFlowId(this.A01, str.hashCode());
        r3.A0D("render_event_sent", generateFlowId, (String) null, (String) null, (String) null, (String) null);
        r3.A0B(generateFlowId, "is_from_camera_resume", String.valueOf(z), false);
    }

    public final void FMl(String str) {
        29E r4 = this.A03;
        int i = this.A01;
        C2593141f r0 = (C2593141f) r4.A08.get(Integer.valueOf(i));
        String str2 = str;
        if (r0 != null) {
            long j = r0.A00;
            UserFlowLoggerImpl userFlowLoggerImpl = r4.A00;
            userFlowLoggerImpl.flowAnnotate(j, "detailed_cancel_reason", str2, 29E.A00(r4, "", j, false));
            userFlowLoggerImpl.flowEndCancel(j, CancelReason.USER_CANCELLED, 29E.A00(r4, "", j, true));
            29E.A01(r4, i, j);
            r4.A06.remove(Long.valueOf(j));
        } else {
            for (Number longValue : 00k.A0k(r4.A07.keySet())) {
                long longValue2 = longValue.longValue();
                UserFlowLoggerImpl userFlowLoggerImpl2 = r4.A00;
                userFlowLoggerImpl2.flowAnnotate(longValue2, "detailed_cancel_reason", str2, 29E.A00(r4, "", longValue2, false));
                userFlowLoggerImpl2.flowEndCancel(longValue2, CancelReason.USER_CANCELLED, 29E.A00(r4, "", longValue2, true));
                29E.A01(r4, i, longValue2);
                r4.A06.remove(Long.valueOf(longValue2));
            }
        }
        this.A00 = null;
    }

    public final void FMm(String str, String str2) {
        if (this.A00 != null) {
            String str3 = str2;
            if (str == null || str.length() == 0) {
                A00("cancelIfNotFinished", str2);
                return;
            }
            29E r2 = this.A03;
            int i = this.A01;
            long generateFlowId = r2.A00.generateFlowId(i, str.hashCode());
            if (r2.A0E(i, generateFlowId)) {
                r2.A06(CancelReason.USER_CANCELLED, str3, i, generateFlowId);
                this.A00 = null;
            }
        }
    }

    public C3497581q(29E r1, int i, long j) {
        this.A03 = r1;
        this.A01 = i;
        this.A02 = j;
    }

    private final void A00(String str, String str2) {
        int hashCode = UUID.randomUUID().hashCode();
        29E r2 = this.A03;
        int i = this.A01;
        long A04 = r2.A04(Integer.valueOf(hashCode), (String) null, i, this.A02);
        r2.A09(A04, AnonymousClass000.A00(34), "logger");
        r2.A09(A04, TraceFieldType.ErrorCode, str);
        r2.A09(A04, "error_details", str2);
        r2.A07("null_effect_id", "", i, A04);
    }
}
