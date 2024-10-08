package X;

import android.content.Context;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.Lo2  reason: case insensitive filesystem */
public final class C65140Lo2 implements MSA {
    public final /* synthetic */ C61822KNl A00;

    public C65140Lo2(C61822KNl kNl) {
        this.A00 = kNl;
    }

    public final void DtB(AudioOverlayTrack audioOverlayTrack) {
        MediaCaptureConfig mediaCaptureConfig;
        C61822KNl kNl = this.A00;
        Context requireContext = kNl.A0G.requireContext();
        C267834cI r9 = kNl.A07().A03;
        AnonymousClass3Q2 r8 = kNl.A07().A00;
        UserSession userSession = kNl.A0I;
        List FN1 = kNl.A06().FN1();
        C3499582p r0 = kNl.A00;
        if (r0 != null) {
            C3499682q r02 = r0.A00;
            if (r02 != null) {
                mediaCaptureConfig = ((JWE) r02).A01.A09;
            } else {
                mediaCaptureConfig = null;
            }
            String str = kNl.A0M;
            C60102Jfi A04 = kNl.A04();
            0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
            C61075JwD A01 = C61828KNr.A01((C61828KNr) A04);
            boolean z = true;
            if (A01 == null || !C64187LSu.A04(A01)) {
                z = false;
            }
            C64132LPg.A00(requireContext, userSession, mediaCaptureConfig, audioOverlayTrack, r8, r9, str, FN1, !z, false);
            C60102Jfi A042 = kNl.A04();
            0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
            KOC koc = ((C61828KNr) A042).A06;
            koc.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, koc.A06(), (AnonymousClass3QO) null, (Venue) null, audioOverlayTrack, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -32769, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            return;
        }
        0qQ.A0F("cameraSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
