package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PC4 implements C74407PuN {
    public final AnonymousClass7L2 A00;
    public final C46539Dgg A01;
    public final UserSession A02;
    public final AnonymousClass9HC A03;
    public final OLP A04;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        String C4n;
        0qQ.A0B(pwl, 0);
        MutedWordsFilterManager A002 = AnonymousClass92E.A00(this.A02);
        if (!this.A01.A03 || OZ6.A00(pwa, pwl, i) != 2FW.A1g || !AnonymousClass7TF.A1Z(this.A03.A0J) || (C4n = pwl.C4n(i)) == null || A002 == null || !A002.A05(C4n, true).A00) {
            return false;
        }
        return true;
    }

    public final OTT AWh(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, Map map, Set set, int i, boolean z) {
        C3262275x r14;
        String C4n;
        Context context2 = context;
        OMF omf2 = omf;
        boolean A1U = AnonymousClass7TF.A1U(0, context2, omf2);
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        Set set2 = set;
        C51974G9v.A0d(2, pwl2, messagingUser2, set2, map);
        int i2 = i;
        boolean A0j = 00p.A0j(pwl2.BSF(i2), this.A01.A02, A1U);
        int A022 = DbU.A02(C67238MkY.A02(C66581MXm.A0o(omf2.A00.mResultSet, 0, 6)), 0);
        boolean z2 = true;
        if (A022 != A1U && A022 != 3) {
            z2 = false;
        } else if (!A0j) {
            r14 = new C3262275x((AnonymousClass9IV) null, (C327627Bo) null, (AnonymousClass7LQ) null, C66580MXl.A0i(pwl2.BSF(i2), DbX.A0t(pwl2.BNc(i2))), context2.getString(2131959757), (Integer) null, AnonymousClass05K.A0j, (Integer) null, (String) null, (String) null, (String) null, (String) null, (List) null, DbV.A01(context2), this.A00.A04.A04, 8388611, 5, false, false, false);
            OLP olp = this.A04;
            2FW r75 = 2FW.A1g;
            AnonymousClass7L2 r16 = this.A00;
            MessagingUser messagingUser3 = messagingUser2;
            C74541Pwa pwa2 = pwa;
            C328607Fl A002 = olp.A00(pwa2, r14, C70098NxE.A00(context2, r16, messagingUser3, omf2, pwl2, i2), messagingUser2, omf2, pwl2, r75, set2, i2);
            AnonymousClass9HC r7 = this.A03;
            AnonymousClass7FE A003 = C70101NxH.A00(pwa2, r7, r16, messagingUser3, pwl2, (Boolean) null, (Boolean) null, C73920Pm0.A01(this, 49), i2);
            if (z2 || A0j) {
                C4n = pwl2.C4n(i2);
                0qQ.A0C(C4n, C273654mx.A00(353));
            } else {
                C4n = C51967G9n.A0p(context2, 2131959758);
            }
            C68820NYe nYe = new C68820NYe(C70099NxF.A00(r7, new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), messagingUser2, pwl2, r75, i2, false, false), A003, C4n, AnonymousClass05K.A01);
            String A023 = C71095OcV.A02(pwl2, i2);
            return new OTT(AnonymousClass05K.A00, A023, new N6T(A002, nYe, A023), (Object) null);
        }
        r14 = null;
        OLP olp2 = this.A04;
        2FW r752 = 2FW.A1g;
        AnonymousClass7L2 r162 = this.A00;
        MessagingUser messagingUser32 = messagingUser2;
        C74541Pwa pwa22 = pwa;
        C328607Fl A0022 = olp2.A00(pwa22, r14, C70098NxE.A00(context2, r162, messagingUser32, omf2, pwl2, i2), messagingUser2, omf2, pwl2, r752, set2, i2);
        AnonymousClass9HC r72 = this.A03;
        AnonymousClass7FE A0032 = C70101NxH.A00(pwa22, r72, r162, messagingUser32, pwl2, (Boolean) null, (Boolean) null, C73920Pm0.A01(this, 49), i2);
        if (z2) {
        }
        C4n = pwl2.C4n(i2);
        0qQ.A0C(C4n, C273654mx.A00(353));
        C68820NYe nYe2 = new C68820NYe(C70099NxF.A00(r72, new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), messagingUser2, pwl2, r752, i2, false, false), A0032, C4n, AnonymousClass05K.A01);
        String A0232 = C71095OcV.A02(pwl2, i2);
        return new OTT(AnonymousClass05K.A00, A0232, new N6T(A0022, nYe2, A0232), (Object) null);
    }

    public PC4(Context context, C46539Dgg dgg, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7L2 r6) {
        this.A02 = userSession;
        this.A01 = dgg;
        this.A00 = r6;
        this.A03 = r5;
        this.A04 = C70095NxB.A00(context, userSession, r5, r6);
    }
}
