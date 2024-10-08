package com.instagram.realtimeclient;

import X.16F;
import X.16L;
import X.16P;
import X.AnonymousClass1FD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C254403sQ;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class DirectRealtimePayload__JsonHelper {
    public static DirectRealtimePayload parseFromJson(16F r1) {
        return (DirectRealtimePayload) 16P.A01(r1, new AnonymousClass1FD() {
            public DirectRealtimePayload invoke(16F r2) {
                return DirectRealtimePayload__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(DirectRealtimePayload directRealtimePayload, String str, 16F r5) {
        if ("client_request_id".equals(str)) {
            directRealtimePayload.clientRequestId = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("client_context".equals(str)) {
            directRealtimePayload.clientContext = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("item_id".equals(str)) {
            directRealtimePayload.itemId = AnonymousClass7TG.A0l(r5);
            return true;
        } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(str)) {
            directRealtimePayload.threadId = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("timestamp".equals(str)) {
            directRealtimePayload.timestamp = r5.A0y();
            return true;
        } else if ("count".equals(str)) {
            directRealtimePayload.count = AnonymousClass7TF.A0X(r5);
            return true;
        } else if (DialogModule.KEY_MESSAGE.equals(str)) {
            directRealtimePayload.message = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("client_facing_error_message".equals(str)) {
            directRealtimePayload.clientFacingErrorMessage = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("is_epd_error".equals(str)) {
            directRealtimePayload.isEpdError = r5.A0d();
            return true;
        } else if ("can_see_notes".equals(str)) {
            directRealtimePayload.canSeeNotes = r5.A0d();
            return true;
        } else if ("can_see_broadcast_chats".equals(str)) {
            directRealtimePayload.canSeeBroadcastChats = r5.A0d();
            return true;
        } else if ("biz_thread_throttling_state".equals(str)) {
            C254403sQ r0 = (C254403sQ) C254403sQ.A01.get(AnonymousClass7TG.A0l(r5));
            if (r0 == null) {
                r0 = C254403sQ.UNKNOWN;
            }
            directRealtimePayload.throttlingType = r0;
            return true;
        } else if (TraceFieldType.ErrorCode.equals(str)) {
            directRealtimePayload.errorCode = AnonymousClass7TG.A0l(r5);
            return true;
        } else if ("ttl".equals(str)) {
            directRealtimePayload.ttlMs = AnonymousClass7TF.A0Z(r5);
            return true;
        } else if (!"error".equals(str)) {
            return false;
        } else {
            directRealtimePayload.error = DirectApiError__JsonHelper.parseFromJson(r5);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.realtimeclient.DirectRealtimePayload, java.lang.Object] */
    public static DirectRealtimePayload unsafeParseFromJson(16F r3) {
        ? obj = new Object();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            String A0q = r3.A0q();
            r3.A1J();
            processSingleField(obj, A0q, r3);
            r3.A0z();
        }
        return obj;
    }

    public static DirectRealtimePayload parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
