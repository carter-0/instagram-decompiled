package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.KOo  reason: case insensitive filesystem */
public final class C61849KOo extends LSR {
    public LWf A00;
    public AnonymousClass3Q2 A01;
    public Runnable A02;
    public final UserSession A03;
    public final C13755TgR A04 = new C65167LoW(this);
    public final LO3 A05;
    public final KO2 A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final LFG A09;
    public final boolean A0A;

    public static final void A00(C61849KOo kOo, I22 i22, AnonymousClass3Q2 r16) {
        H9B h9b;
        if ((i22 instanceof H9B) && (h9b = (H9B) i22) != null && kOo.A0A) {
            AnonymousClass3Q2 r7 = r16;
            if (r7.A0r != null) {
                A02(kOo, true);
                ViewGroup viewGroup = h9b.A00;
                Context A0S = AnonymousClass7TE.A0S(viewGroup);
                UserSession userSession = kOo.A03;
                float f = 1.0f;
                if (182.A06(0Tu.A05, userSession, 36324746035867986L)) {
                    f = 0.0f;
                }
                kOo.A00 = new LWf(A0S, viewGroup, userSession, h9b.A04, r7, C66296MMf.A00(kOo, 24), f, A0S.getResources().getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge_plus), A0S.getResources().getDimensionPixelSize(R.dimen.before_and_after_media_card_width), true, true);
                A02(kOo, false);
                return;
            }
            A02(kOo, true);
        }
    }

    public static final void A01(C61849KOo kOo, String str) {
        if (str != null) {
            C61077JwF jwF = null;
            if (kOo.A06().A05 != null) {
                C61077JwF jwF2 = kOo.A06().A05;
                if (jwF2 != null) {
                    jwF = new C61077JwF(jwF2.A00, str, 6, jwF2.A02);
                }
            } else {
                jwF = new C61077JwF((Object) null, str, 6, true);
            }
            kOo.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, jwF, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, kOo.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -3, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
            Runnable runnable = kOo.A02;
            if (runnable != null) {
                runnable.run();
            }
            AnonymousClass3Q2 r0 = kOo.A01;
            if (r0 != null) {
                r0.A33 = str;
            }
            LFG lfg = kOo.A09;
            if (lfg != null) {
                lfg.A00();
            }
        }
    }

    public static final void A02(C61849KOo kOo, boolean z) {
        05G r1 = kOo.A08;
        C61028JvS jvS = (C61028JvS) r1.getValue();
        r1.Epw(new C61028JvS(jvS.A01, 2, jvS.A03, jvS.A02, z));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61849KOo(UserSession userSession, LO3 lo3, LFG lfg, KO2 ko2) {
        super(ko2);
        AnonymousClass7TG.A1O(lo3, userSession);
        this.A05 = lo3;
        this.A03 = userSession;
        this.A06 = ko2;
        this.A09 = lfg;
        this.A0A = 182.A06(0Tu.A05, userSession, 36324746035736913L);
        02z A10 = DbS.A10(new C61028JvS());
        this.A08 = A10;
        this.A07 = A10;
    }
}
