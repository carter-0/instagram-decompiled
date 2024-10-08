package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.ui.animation.timeline.linear.AdvanceTargetTaskDisabledException;
import java.util.Locale;

/* renamed from: X.Heo  reason: case insensitive filesystem */
public abstract class C55259Heo {
    public static final void A00(C267324bN r13, UserSession userSession, AnonymousClass4DU r15, C52206GIx gIx, C52054GDa gDa, GJU gju, String str, String str2, boolean z) {
        long j;
        C52206GIx gIx2 = gIx;
        C51974G9v.A1L(gIx2, r15, r13);
        String str3 = str;
        String str4 = str2;
        GJU gju2 = gju;
        if (!gIx2.A01) {
            C52054GDa gDa2 = gDa;
            GFX.A00(gIx2, gDa2);
            if (z && 0qQ.A0K(gIx2.A00, AdvanceTargetTaskDisabledException.A00) && gju2 == GJU.MID_SCENE && 182.A06(0Tu.A05, userSession, 36320236320661634L)) {
                GJU gju3 = GJU.HIGHLIGHT_CTA;
                A00(r13, userSession, r15, ((C55944Hq8) gDa2.A04.getValue()).A00(gju3), gDa, gju3, str, str2, false);
            }
        } else if (r13.CcK()) {
            AnonymousClass3OA A06 = r13.A06();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r15, userSession), "instagram_ad_reels_cta_advance_impression");
            if (A0e.isSampled()) {
                0eP r5 = GFX.A02;
                if (r5 == null || !0qQ.A0K(r13.getId(), r5.A00)) {
                    j = 0;
                } else {
                    j = AnonymousClass7TE.A0R(r5.A01);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                GFX.A01 = AnonymousClass7TF.A0y(r13.getId(), elapsedRealtime);
                long j2 = elapsedRealtime - j;
                0bb r52 = new 0bb();
                String name = gju2.name();
                Locale locale = Locale.ROOT;
                r52.A06(AnonymousClass000.A00(2959), DbT.A12(locale, name));
                r52.A06(AnonymousClass000.A00(2960), str3);
                r52.A06(AnonymousClass000.A00(2961), str4);
                Long valueOf = Long.valueOf(j2);
                r52.A05(AnonymousClass000.A00(2962), valueOf);
                String id = r13.getId();
                0jB A0k = C51965G9l.A0k();
                A0k.A04(C271774jZ.A6x, DbT.A12(locale, name));
                A0k.A04(C271774jZ.A6z, str3);
                A0k.A04(C271774jZ.A70, str4);
                A0k.A05(C271774jZ.A71, valueOf);
                GFX.A00 = AnonymousClass7TE.A1L(id, A0k);
                C51965G9l.A1D(A0e, C51971G9r.A0n(0, A06.A0S));
                C51965G9l.A1L(A0e, r13.ByO(userSession));
                A0e.AAK(r52, AnonymousClass000.A00(3863));
                A0e.Cgf();
            }
        }
    }
}
