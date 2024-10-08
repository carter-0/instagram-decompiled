package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OWe  reason: case insensitive filesystem */
public final class C71005OWe {
    public final C58840Ae A00;

    public final void A01(AnonymousClass0iw r4, C254793t3 r5, Boolean bool, long j) {
        0Aj A0d = C51969G9p.A0d(this.A00, "direct_thread_mute_button");
        if (A0d.isSampled()) {
            A0d.A9F("mute_duration", Long.valueOf(j));
            A0d.A9F("armadillo_thread_id", A00(A0d, r5));
            C66584MXp.A0r(A0d, r5);
            DbW.A15(A0d, r4);
            A0d.A7p("is_e2ee", bool);
            A0d.Cgf();
        }
    }

    public final void A02(AnonymousClass0iw r4, C254793t3 r5, Boolean bool, long j) {
        0Aj A0d = C51969G9p.A0d(this.A00, "direct_thread_video_call_mute_button");
        if (A0d.isSampled()) {
            A0d.A9F("mute_duration", Long.valueOf(j));
            A0d.A9F("armadillo_thread_id", A00(A0d, r5));
            C66584MXp.A0r(A0d, r5);
            DbW.A15(A0d, r4);
            A0d.A7p("is_e2ee", bool);
            A0d.Cgf();
        }
    }

    public final void A03(AnonymousClass0iw r4, C254793t3 r5, Boolean bool, boolean z) {
        0Aj A0d = C51969G9p.A0d(this.A00, "direct_thread_mute_button");
        if (A0d.isSampled()) {
            A0d.A7p("to_mute", Boolean.valueOf(z));
            A0d.A9F("armadillo_thread_id", A00(A0d, r5));
            C66584MXp.A0r(A0d, r5);
            DbW.A15(A0d, r4);
            A0d.A7p("is_e2ee", bool);
            A0d.Cgf();
        }
    }

    public final void A04(AnonymousClass0iw r4, C254793t3 r5, Boolean bool, boolean z) {
        0Aj A0d = C51969G9p.A0d(this.A00, "direct_thread_mentions_mute_button");
        if (A0d.isSampled()) {
            A0d.A7p("to_mute", Boolean.valueOf(z));
            C66580MXl.A1J(A0d, C300965yF.A06(r5));
            DbW.A15(A0d, r4);
            A0d.A7p("is_e2ee", bool);
            A0d.Cgf();
        }
    }

    public final void A05(AnonymousClass0iw r4, C254793t3 r5, Boolean bool, boolean z) {
        0Aj A0d = C51969G9p.A0d(this.A00, "direct_thread_video_call_mute_button");
        if (A0d.isSampled()) {
            A0d.A7p("to_mute", Boolean.valueOf(z));
            A0d.A9F("armadillo_thread_id", A00(A0d, r5));
            C66584MXp.A0r(A0d, r5);
            DbW.A15(A0d, r4);
            A0d.A7p("is_e2ee", bool);
            A0d.Cgf();
        }
    }

    public C71005OWe(C58840Ae r1) {
        this.A00 = r1;
    }

    public static Long A00(0Aj r2, C254793t3 r3) {
        r2.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C300965yF.A06(r3));
        MsysThreadId A04 = C300965yF.A04(r3);
        if (A04 != null) {
            return Long.valueOf(A04.A00);
        }
        return null;
    }
}
