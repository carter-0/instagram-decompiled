package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Loz  reason: case insensitive filesystem */
public final class C65196Loz implements MVS {
    public KHY A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C66576MXh A03;
    public final KOF A04;
    public final AnonymousClass80P A05 = AnonymousClass80P.FAN_CLUB_ON;
    public final C3499682q A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        KHY A012 = C64004LIk.A01(this.A01.requireContext(), (Boolean) null, (CharSequence) null, Integer.valueOf(R.drawable.instagram_crown_pano_outline_24), 2131961790);
        this.A00 = A012;
        KHY.A02(A012, this, 13);
        MediaCaptureConfig mediaCaptureConfig = ((JWE) this.A06).A01.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A04) {
            KOF kof = this.A04;
            C61075JwD A062 = kof.A06();
            if (((C61042Jvg) kof.A02.getValue()).A01) {
                kof.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A062, AnonymousClass3QO.FAN_CLUB, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -513, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            }
        }
        L1V l1v = new L1V(this.A02);
        0xa r2 = l1v.A00.A01;
        if (DbT.A00(r2, "exclusive_post_creation_tooltip_count") < 3 && System.currentTimeMillis() - DbW.A06(r2, "exclusive_post_creation_tooltip_timestamp") > JTR.A0N(TimeUnit.DAYS)) {
            KHY khy = this.A00;
            if (khy != null) {
                0nA.A0t(khy, new MB7(9, l1v, this));
            }
            0qQ.A0F("exclusivePostsRow");
            throw AnonymousClass00P.createAndThrow();
        }
        KHY khy2 = this.A00;
        if (khy2 != null) {
            return khy2;
        }
        0qQ.A0F("exclusivePostsRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65196Loz(AnonymousClass4DH r2, UserSession userSession, C3499682q r4, C66576MXh mXh, KOF kof) {
        AnonymousClass7TG.A1U(r2, userSession, r4);
        0qQ.A0B(mXh, 5);
        this.A01 = r2;
        this.A02 = userSession;
        this.A06 = r4;
        this.A04 = kof;
        this.A03 = mXh;
    }
}
