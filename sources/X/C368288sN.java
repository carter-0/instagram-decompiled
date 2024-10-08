package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.share.facebook.logging.CrosspostUpsellsLogger$logEvent$1;
import java.util.Map;

/* renamed from: X.8sN  reason: invalid class name and case insensitive filesystem */
public abstract class C368288sN {
    public static final void A00(AnonymousClass818 r12, C368278sM r13, AnonymousClass819 r14, AnonymousClass81A r15, UserSession userSession) {
        C250663lr r2;
        Map map;
        AnonymousClass81A r6 = r15;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        if (r15 == null) {
            r6 = new 0bb();
        }
        0wc A02 = AnonymousClass0kN.A02(userSession2);
        0Aj A00 = A02.A00(A02.A00, "crosspost_upsells");
        C367338qa A002 = C367328qZ.A00(userSession2);
        AnonymousClass818 r8 = r12;
        String A003 = C368298sO.A00(r12);
        String str = null;
        if (!(A003 == null || ((r2 = (C250663lr) A002.A04.BEh(A003)) == null && ((map = A002.A03) == null || (r2 = (C250663lr) map.get(A003)) == null)))) {
            str = r2.getOptionalStringField(6, "client_session_id");
        }
        if (str != null) {
            r6.A06("eligibility_fetch_session_id", str);
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        r6.A06("radio_type", C61970qY.A09(context));
        C368278sM r9 = r13;
        AnonymousClass819 r10 = r14;
        if (A00.isSampled()) {
            A00.A8M(r8, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8M(r13, "event_type");
            A00.A8M(r14, "variant");
            A00.AAK(r6, "extra");
            A00.Cgf();
        }
        if (!00k.A0u(00l.A0R(182.A04(0Tu.A05, userSession2, 36881421043499384L), new String[]{","}, 0), C368298sO.A01(r14))) {
            0qQ.A0B(r13, 0);
            int ordinal = r13.ordinal();
            if (ordinal == 5 || ordinal == 0 || ordinal == 1) {
                AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(1732129082, 3));
                CrosspostUpsellsLogger$logEvent$1 crosspostUpsellsLogger$logEvent$1 = new CrosspostUpsellsLogger$logEvent$1(r8, r9, r10, userSession2, str, (AnonymousClass4D7) null);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, crosspostUpsellsLogger$logEvent$1, A022);
            }
        }
    }
}
