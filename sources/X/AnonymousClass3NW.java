package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.3NW  reason: invalid class name */
public abstract class AnonymousClass3NW {
    public static final RingSpec A00(UserSession userSession, Reel reel) {
        AnonymousClass0eM r0;
        0qQ.A0B(reel, 0);
        0qQ.A0B(userSession, 1);
        RingSpec A05 = reel.A05(userSession);
        if (A05 != null) {
            return A05;
        }
        if (reel.A0y(userSession) || 00k.A0u(0sr.A1P(new HighlightReelTypeStr[]{HighlightReelTypeStr.FAN_CLUB, HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY}), reel.A09)) {
            r0 = AnonymousClass3Mk.A0D;
        } else {
            if (!reel.A0x(userSession)) {
                if (reel.A10(userSession)) {
                    if (AnonymousClass37B.A01(userSession, true)) {
                        r0 = AnonymousClass3Mk.A0G;
                    }
                } else if (!reel.A12(userSession)) {
                    if (reel.A11(userSession)) {
                        r0 = AnonymousClass3Mk.A0H;
                    } else if (reel.A0u()) {
                        r0 = AnonymousClass3Mk.A0I;
                    } else if (C61670oa.A02()) {
                        r0 = AnonymousClass3Mk.A0E;
                    }
                }
                r0 = AnonymousClass3Mk.A0C;
            }
            r0 = AnonymousClass3Mk.A0B;
        }
        return (RingSpec) r0.getValue();
    }

    public static final void A02(UserSession userSession, Reel reel, GradientSpinner gradientSpinner) {
        0qQ.A0B(gradientSpinner, 0);
        RingSpec A05 = reel.A05(userSession);
        if (A05 == null) {
            A05 = A00(userSession, reel);
        }
        gradientSpinner.setGradientColors(A05);
    }

    public static final void A03(GradientSpinner gradientSpinner, AnonymousClass3NV r2, boolean z) {
        0qQ.A0B(gradientSpinner, 0);
        gradientSpinner.setGradientColors(A01(r2, z));
    }

    public static final RingSpec A01(AnonymousClass3NV r1, boolean z) {
        AnonymousClass0eM r0;
        if (r1 == AnonymousClass3NV.A0A) {
            r0 = AnonymousClass3Mk.A0D;
        } else if (r1 != AnonymousClass3NV.A04 || z) {
            r0 = AnonymousClass3Mk.A0A;
        } else {
            r0 = AnonymousClass3Mk.A0B;
        }
        return (RingSpec) r0.getValue();
    }
}
