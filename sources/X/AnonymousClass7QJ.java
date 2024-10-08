package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.7QJ  reason: invalid class name */
public final class AnonymousClass7QJ {
    public final /* synthetic */ AnonymousClass7QH A00;

    public final void A00(String str, String str2, long j, long j2, long j3, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 6);
        AnonymousClass7QL r0 = this.A00.A00;
        if (r0 != null) {
            for (AnonymousClass7QV r02 : r0.A06) {
                C333637Zs r2 = r02.A00;
                AnonymousClass7I3 r1 = r2.A02;
                String str3 = (String) r2.A04.invoke();
                String A002 = r2.A00();
                0qQ.A0B(A002, 2);
                0wc r22 = r1.A01;
                1Ln r23 = new 1Ln(r22.A00(r22.A00, "ai_agent_embodiment_download"), 1);
                if (r23.A00.isSampled()) {
                    r23.A0R("video_id", str);
                    r23.A0P("fetched_time", Double.valueOf((double) j));
                    r23.A0Q(C66579MXk.A00(71), 0L);
                    r23.A0Q(Pxd.A00(77), Long.valueOf(j2));
                    r23.A0Q("total_media_bytes", Long.valueOf(j3));
                    r23.A0O("is_prefetch", Boolean.valueOf(z));
                    r23.A0R("download_error", str2);
                    r23.A0R("agent_id", "");
                    r23.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                    r23.A0R("thread_session_id", A002);
                    r23.Cgf();
                }
            }
        }
    }

    public AnonymousClass7QJ(AnonymousClass7QH r1) {
        this.A00 = r1;
    }
}
