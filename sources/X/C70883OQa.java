package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.OQa  reason: case insensitive filesystem */
public abstract class C70883OQa {
    public static final void A00(C69451Nlv nlv, AnonymousClass0iw r5, 0lg r6, String str, String str2) {
        0qQ.A0B(r6, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, r6), "ig_wearable_share_from_glasses");
        A0e.AAJ(TraceFieldType.RequestID, str);
        A0e.A7p("is_success", JTP.A0g(A0e, "event_type", "IPC_REQUEST_RECEIVED", true));
        A0e.AAJ("ipc_action_type", str2);
        A0e.A8M(nlv, "media_type");
        A0e.Cgf();
    }

    public static final void A01(C69451Nlv nlv, AnonymousClass0iw r4, 0lg r5, String str, String str2, boolean z) {
        0qQ.A0B(r4, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, r5), "ig_wearable_share_from_glasses");
        A0e.AAJ(TraceFieldType.RequestID, str);
        A0e.A7p("is_success", JTP.A0g(A0e, "event_type", "STORY_PUBLISH", z));
        A0e.A8M(nlv, "media_type");
        A0e.AAJ(DevServerEntity.COLUMN_DESCRIPTION, str2);
        A0e.Cgf();
    }
}
