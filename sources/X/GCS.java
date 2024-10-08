package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GCS {
    public final String A00;
    public final String A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final JU5 A06;
    public final AnonymousClass93U A07;
    public final GIN A08;
    public final JR1 A09;
    public final C55684Hlh A0A;
    public final GF2 A0B;
    public final C52016GBn A0C;

    public GCS(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r5, JU5 ju5, AnonymousClass93U r7, GIN gin, JR1 jr1, C55684Hlh hlh, GF2 gf2, C52016GBn gBn, String str, String str2) {
        DbW.A1O(r5, 3, r7);
        C51974G9v.A1Q(gf2, ju5, gin, hlh);
        DbW.A1P(userSession, 11, gBn);
        0qQ.A0B(clipsViewerConfig, 13);
        this.A02 = fragmentActivity;
        this.A09 = jr1;
        this.A05 = r5;
        this.A00 = str;
        this.A01 = str2;
        this.A07 = r7;
        this.A0B = gf2;
        this.A06 = ju5;
        this.A08 = gin;
        this.A0A = hlh;
        this.A04 = userSession;
        this.A0C = gBn;
        this.A03 = clipsViewerConfig;
    }

    public final void A00(C267324bN r35, C52058GDe gDe) {
        C67091rt r7;
        String str;
        C267324bN r1 = r35;
        C52058GDe gDe2 = gDe;
        AnonymousClass7TG.A1N(r1, gDe2);
        1Xj r2 = r1.A02;
        if (r2 != null) {
            GIN gin = this.A08;
            UserSession userSession = this.A04;
            if (!C55256Hel.A00(userSession, r2, gin)) {
                C67231sQ A0n = C51966G9m.A0n(r2);
                String A0j = AnonymousClass7TG.A0j();
                String A0j2 = AnonymousClass7TG.A0j();
                String str2 = null;
                if (A0n != null) {
                    r7 = A0n.Adl();
                    Long A042 = C291335gz.A04(A0n);
                    if (A042 != null) {
                        AnonymousClass4DU r10 = this.A05;
                        C54689HOu hOu = C54689HOu.A0G;
                        long longValue = A042.longValue();
                        1Xj r12 = r1.A02;
                        long A092 = (long) gDe2.A09();
                        String CFD = this.A07.CFD();
                        String str3 = this.A0A.A00;
                        AnonymousClass8ZN r9 = AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE;
                        if (r7 != null) {
                            str = r7.getBestAudioClusterId();
                        } else {
                            str = null;
                        }
                        C52086GEg.A0K(hOu, r9, r10, userSession, r12, this.A03.A0S, (Boolean) null, Boolean.valueOf(AnonymousClass3ZJ.A0G(r2)), Boolean.valueOf(C51971G9r.A1Y(r2)), (Long) null, A0j, CFD, str3, A0j2, str, (String) null, longValue, A092);
                    }
                } else {
                    r7 = null;
                }
                GF2.A00(this.A0B, AnonymousClass05K.A01);
                JU5 ju5 = this.A06;
                C51971G9r.A1P(ju5, ju5.A0N, 3);
                boolean z = !this.A0C.A0X(r1);
                String str4 = r1.A0Q;
                FragmentActivity fragmentActivity = this.A02;
                String str5 = this.A00;
                if (str5 == null) {
                    str5 = r1.A0C();
                }
                String str6 = this.A01;
                if (str6 == null) {
                    str6 = str4;
                }
                if (r7 != null) {
                    str2 = r7.getBestAudioClusterId();
                }
                C52273GLp.A00(fragmentActivity, (AnonymousClass8ZN) null, r1, userSession, r2, A0j, str5, str6, str4, str2, A0j2, z);
                this.A09.AGC(r1, C52318GNk.ITEM_INTERACTION_NEW_PAGE, C52317GNj.A04);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
