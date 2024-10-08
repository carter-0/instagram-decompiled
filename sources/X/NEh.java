package X;

import android.os.SystemClock;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class NEh extends N1L {
    public final ImmutableMap A00;
    public final List A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NEh(C68378NEe nEe, String str, String str2, String str3, String str4, List list, List list2, int i, int i2, long j) {
        super(nEe, Boolean.TYPE);
        JSONArray jSONArray;
        List list3 = list;
        this.A01 = list3;
        List list4 = list2;
        this.A02 = list4;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        0eP A1L = AnonymousClass7TE.A1L("target_provider", "instagram");
        0eP A1L2 = AnonymousClass7TE.A1L(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        0eP A1L3 = AnonymousClass7TE.A1L("caller_id", str2);
        0eP A1L4 = AnonymousClass7TE.A1L("caller_name", str3);
        0eP A1L5 = AnonymousClass7TE.A1L("group_name", str4);
        JSONArray jSONArray2 = null;
        if (list != null) {
            jSONArray = new JSONArray(list3);
        } else {
            jSONArray = null;
        }
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L("group_participant_id", jSONArray), AnonymousClass7TE.A1L("group_participant_name", list2 != null ? new JSONArray(list4) : jSONArray2), AnonymousClass7TE.A1L("call_state", Integer.valueOf(i)), AnonymousClass7TE.A1L("call_type", Integer.valueOf(i2)), AnonymousClass7TE.A1L("notification_time_ms", Long.valueOf(j)), AnonymousClass7TE.A1L("request_sent_timestamp", Long.valueOf(SystemClock.elapsedRealtime()))});
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0s = AnonymousClass7TF.A0s(A07);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (A1J.getValue() != null) {
                JTR.A1U(A1H, A1J);
            }
        }
        builder.putAll(A1H);
        this.A00 = builder.build();
    }
}
