package X;

import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.BrandedContentTag;

public final class M3G implements Runnable {
    public final /* synthetic */ C61822KNl A00;

    public M3G(C61822KNl kNl) {
        this.A00 = kNl;
    }

    public final void run() {
        AnonymousClass3QO r0;
        C62518Kh9 kh9;
        String str;
        C61822KNl kNl = this.A00;
        LP7 A08 = kNl.A08();
        AnonymousClass3Q2 A01 = LP2.A01(kNl);
        A08.A07 = A01;
        if (A01.CJe()) {
            BrandedContentTag A082 = A01.A08();
            if (A082 != null) {
                str = A082.A01;
            } else {
                str = null;
            }
            A08.A0D.A04(str);
        }
        MediaCaptureConfig mediaCaptureConfig = ((JWE) kNl.A06()).A01.A09;
        if (mediaCaptureConfig == null || !mediaCaptureConfig.A04) {
            r0 = LP2.A01(kNl).A1F;
        } else {
            r0 = AnonymousClass3QO.FAN_CLUB;
        }
        C60259JiG jiG = kNl.A05;
        if (jiG != null) {
            0qQ.A0B(r0, 0);
            if (r0 == AnonymousClass3QO.CLOSE_FRIENDS) {
                kh9 = C62518Kh9.CLOSE_FRIENDS;
            } else if (r0 == AnonymousClass3QO.OPAL) {
                kh9 = C62518Kh9.OPAL;
            } else if (r0 == AnonymousClass3QO.FAN_CLUB) {
                kh9 = C62518Kh9.FAN_CLUB;
            } else if (jiG.A0A) {
                kh9 = C62518Kh9.PRIVATE_ACCOUNT_FOLLOWERS;
            } else {
                kh9 = C62518Kh9.EVERYONE;
            }
            jiG.A01(kh9, true);
            return;
        }
        0qQ.A0F("clipsAudienceControlViewModel");
        throw AnonymousClass00P.createAndThrow();
    }
}
