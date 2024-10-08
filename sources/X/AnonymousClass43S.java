package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.43S  reason: invalid class name */
public final class AnonymousClass43S extends AnonymousClass43M {
    public final AnonymousClass7BV A0E(UserSession userSession, ThreadFetchReason threadFetchReason, Long l, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        String str5 = str4;
        0qQ.A0B(str5, 9);
        AnonymousClass7BV A01 = A01(userSession, (Boolean) null, (Boolean) null, l, 20131826, z, z2, true);
        MarkerEditor withMarker = this.A00.withMarker(A01.A01, A01.A00);
        withMarker.annotate("use_recipient_as_eimu_id", z3);
        withMarker.annotate("fetch_by", str2);
        withMarker.annotate("fetch_type", threadFetchReason.getFetchType());
        withMarker.annotate("fetch_reason", threadFetchReason.toString());
        withMarker.annotate(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        withMarker.annotate("call_site", str3);
        withMarker.annotate("uuid", str5);
        withMarker.markerEditingCompleted();
        return A01;
    }

    public final void A0F(AnonymousClass7BV r8, Boolean bool, Integer num, Integer num2) {
        int i;
        if (r8 != null) {
            02m r6 = this.A00;
            int i2 = r8.A01;
            int i3 = r8.A00;
            MarkerEditor withMarker = r6.withMarker(i2, i3);
            int i4 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            withMarker.annotate("reverb_message_count", i);
            if (num2 != null) {
                i4 = num2.intValue();
            }
            withMarker.annotate("reverb_shh_msg_count", i4);
            if (bool != null) {
                withMarker.annotate("reverb_has_older", bool.booleanValue());
            }
            withMarker.markerEditingCompleted();
            r6.markerPoint(i2, i3, "reverb_post_process_end");
        }
    }

    public final void A0G(AnonymousClass7BV r6, List list, int i, int i2, long j, boolean z, boolean z2) {
        if (r6 != null) {
            02m r4 = this.A00;
            int i3 = r6.A01;
            int i4 = r6.A00;
            r4.withMarker(i3, i4).pointEditor("reverb_post_process_start").markerEditingCompleted();
            MarkerEditor withMarker = r4.withMarker(i3, i4);
            withMarker.annotate(DialogModule.KEY_MESSAGE, 00k.A0P(", ", "", "", list, (0sP) null));
            withMarker.annotate("server_response_encrypted_message_count", i2);
            withMarker.annotate("server_response_total_message_count", i);
            withMarker.annotate("thread_jid", j);
            withMarker.annotate("is_tlc_thread", z);
            withMarker.annotate("is_ttlc_thread", z2);
            withMarker.markerEditingCompleted();
        }
    }
}
