package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GAc  reason: case insensitive filesystem */
public final class C51979GAc implements C232682uF {
    public static final String __redex_internal_original_name = "ClipsViewerAnalyticsModule";
    public ClipsViewerConfig A00;
    public C228412ld A01;
    public String A02;
    public final AnonymousClass93T A03;
    public final String A04;
    public final C51990GAn A05;
    public final String A06;

    public final 0jB E4l(1Xj r7) {
        AnonymousClass3W1 r3;
        long j;
        0qQ.A0B(r7, 0);
        0jB E4k = E4k();
        C228412ld r0 = this.A01;
        if (r0 != null) {
            r3 = r0.BQr(r7);
        } else {
            r3 = null;
        }
        0j9 r2 = C271774jZ.A1A;
        if (r3 == null || !r3.A0p()) {
            j = -1;
        } else {
            j = (long) r3.getPosition();
        }
        E4k.A04(r2, Long.valueOf(j));
        E4k.A05(C271774jZ.A5g, r7.A0C.getMezqlToken());
        if (r3 != null && !r3.A0p()) {
            0wb.A03(this.A06, 002.A0u("Position unset for media with id: ", r7.getId(), ". in container module: ", getModuleName()));
        }
        return E4k;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public static AnonymousClass93T A00(0Aj r3, C51979GAc gAc, String str) {
        r3.AAJ("organic_tap_action", str);
        r3.AAJ("organic_tap_action_source", "clips_immersive_midcard");
        r3.AAJ("containermodule", gAc.getModuleName());
        r3.A8k("media_index", 0);
        AnonymousClass93T r2 = gAc.A03;
        r3.AAJ("viewer_session_id", r2.A01);
        return r2;
    }

    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        ClipsViewerConfig clipsViewerConfig = this.A00;
        String str2 = clipsViewerConfig.A00;
        if (str2 == null || str2.length() == 0) {
            str2 = clipsViewerConfig.A0J.A00;
        }
        String A0R = 002.A0R("clips_viewer_", str2);
        this.A02 = A0R;
        return A0R;
    }

    public final boolean isSponsoredEligible() {
        return this.A05.A00(getModuleName());
    }

    public C51979GAc(C51990GAn gAn, ClipsViewerConfig clipsViewerConfig, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1P(userSession, clipsViewerConfig);
        this.A06 = str;
        this.A00 = clipsViewerConfig;
        this.A04 = str2;
        this.A05 = gAn;
        this.A03 = AnonymousClass93S.A00(userSession);
    }

    public static void A01(0Aj r2, C51979GAc gAc) {
        r2.AAJ("containermodule", gAc.getModuleName());
    }

    public final 0jB E4k() {
        0jB A0k = C51965G9l.A0k();
        0j9 r1 = C271774jZ.A9i;
        AnonymousClass93T r3 = this.A03;
        A0k.A04(r1, r3.A01);
        A0k.A04(C271774jZ.A1C, r3.A00);
        A0k.A04(C271774jZ.A6S, this.A04);
        A0k.A04(C271774jZ.A8J, String.valueOf(this.A00.A0g));
        A0k.A04(C271774jZ.A8K, this.A00.A0p);
        A0k.A04(C271774jZ.A0c, this.A00.A0m);
        return A0k;
    }
}
