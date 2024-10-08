package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PC7 implements C74407PuN {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final OLP A03;
    public final OLQ A04;
    public final Context A05;
    public final AnonymousClass9HO A06;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        Integer BmN;
        0qQ.A0B(pwl, 0);
        if (pwl.BmP(i) == null || (BmN = pwl.BmN(i)) == null || BmN.intValue() != 7) {
            return false;
        }
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342157589061831357L)) {
            return false;
        }
        if (OZ6.A00(pwa, pwl, i) == 2FW.A1g || OZ6.A00(pwa, pwl, i) == 2FW.A17) {
            return true;
        }
        if (OZ6.A00(pwa, pwl, i) != 2FW.A1b || !182.A06(r2, userSession, 2342157589062290115L)) {
            return false;
        }
        return true;
    }

    public final OTT AWh(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, Map map, Set set, int i, boolean z) {
        Object naC;
        AnonymousClass75J r2;
        String A022;
        Context context2 = context;
        OMF omf2 = omf;
        AnonymousClass7TF.A1H(context2, omf2);
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        Map map2 = map;
        Set set2 = set;
        C51974G9v.A0d(2, pwl2, messagingUser2, set2, map2);
        int i2 = i;
        boolean A023 = C74552Pwl.A02(messagingUser2, pwl2, i2);
        AnonymousClass7L2 r8 = this.A02;
        AnonymousClass7FB.A04(r8, A023);
        UserSession userSession = this.A00;
        AnonymousClass9HC r13 = this.A01;
        C74541Pwa pwa2 = pwa;
        AnonymousClass9HC r16 = r13;
        AnonymousClass7L2 r17 = r8;
        MessagingUser messagingUser3 = messagingUser2;
        C74552Pwl pwl3 = pwl2;
        AnonymousClass7FE A024 = C71136Ode.A02(pwa2, r16, r17, messagingUser3, pwl3, AnonymousClass0eN.A01(C73794Pjt.A00), i2);
        boolean A042 = C71095OcV.A04(userSession, omf2, map2);
        PC0 pc0 = new PC0(this.A06);
        PC0 pc02 = pc0;
        Context context3 = context2;
        C74541Pwa pwa3 = pwa2;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r44 = r13;
        AnonymousClass7L2 r45 = r8;
        MessagingUser messagingUser4 = messagingUser2;
        C74552Pwl pwl4 = pwl2;
        AnonymousClass79c r22 = (AnonymousClass79c) pc02.ALM(context3, pwa3, userSession2, A024, r44, r45, messagingUser4, pwl4, omf2.A00(), (String) null, (List) null, i2, A042, OPx.A01(omf2), false, false);
        AnonymousClass7FE A002 = C70101NxH.A00(pwa2, r16, r17, messagingUser3, pwl3, Boolean.valueOf(C71057Oaa.A00(pwa2, pwl2, i2)), Boolean.valueOf(C71057Oaa.A01(pwa2, pwl2, i2)), AnonymousClass0eN.A01(C73797Pjw.A00), i2);
        MessagingUser messagingUser5 = messagingUser2;
        C3266877t A032 = C71136Ode.A03(context2, pwa2, userSession, r13, r8, messagingUser5, omf2, pwl2, pwl2.Bmo(i2), set2, i2);
        if (pwl2.Bmj(i2)) {
            boolean A012 = OPx.A01(omf2);
            omf2.A00();
            String Bmq = pwl2.Bmq(i2);
            if (Bmq != null) {
                int i3 = r8.A00;
                2FW r18 = 2FW.A0p;
                C73795Pju pju = C73795Pju.A00;
                AnonymousClass9HC r15 = r13;
                MessagingUser messagingUser6 = messagingUser2;
                C74552Pwl pwl5 = pwl2;
                int i4 = i2;
                boolean z2 = A042;
                AnonymousClass7FT A003 = C71136Ode.A00(context2, r15, messagingUser6, pwl5, r18, pju, i4, z2, A012);
                SpannableStringBuilder A0C = C66582MXn.A0C(userSession, Bmq);
                0qQ.A07(A0C);
                C66838MdW mdW = new C66838MdW(A003, A002, (CharSequence) null, A0C, i3);
                if (r22 != null) {
                    naC = new C68222N6l(A032, mdW, r22, pwl2.BSF(i2));
                } else {
                    Long Acs = pwl2.Acs(i2);
                    String Acp = pwl2.Acp(i2);
                    if (Acs == null || Acp == null || (A022 = OXF.A02(Acp, (String) null, Acs.longValue())) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    naC = new C68221N6k(A032, mdW, new NYP(DbS.A0V(A022), C71136Ode.A00(context2, r15, messagingUser6, pwl5, 2FW.A0O, pju, i4, z2, A012)), pwl2.BSF(i2));
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            Integer Bmc = pwl2.Bmc(i2);
            if (Bmc != null && Bmc.intValue() == 1008) {
                omf2.A00();
                C3262275x A004 = this.A04.A00(context2, pwa2, messagingUser5, pwl2, i2);
                AnonymousClass779 A013 = OZ7.A00.A01(pwl2, i2, true);
                String BSF = pwl2.BSF(i2);
                C3259874y r10 = C3259874y.A00;
                AnonymousClass756 r6 = new AnonymousClass756((C68147N2n) null, (C44046CTp) null);
                DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier((2FW) null, pwl2.BSF(i2), (String) null);
                AnonymousClass777 A025 = C71134OdX.A02((Integer) null, pwl2.BmB(i2), pwl2.BmA(i2), (Integer) null, pwl2.Bm9(i2), pwl2.BmT(i2));
                String Bme = pwl2.Bme(i2);
                if (Bme == null) {
                    Bme = "";
                }
                AnonymousClass9J6 A0F = C66584MXp.A0F(messagingUser2, Bme);
                C254883tD r73 = C254883tD.SINGLE;
                2FW r30 = 2FW.A0s;
                Context context4 = context2;
                AnonymousClass9HC r27 = r13;
                MessagingUser messagingUser7 = messagingUser2;
                C74552Pwl pwl6 = pwl2;
                C328667Fr r56 = new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, A0F, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, C71136Ode.A01(context4, r27, messagingUser7, pwl6, r30, C73795Pju.A00, i2, false, false, A042, false, false, A042, OPx.A01(omf2), true), A002, (AnonymousClass74T) null, (AnonymousClass774) null, A025, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r73, (AnonymousClass779) null, directMessageIdentifier, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, C70102NxI.A00(A013).A00, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
                Long Acs2 = pwl2.Acs(i2);
                String Acp2 = pwl2.Acp(i2);
                String C4n = pwl2.C4n(i2);
                if (Acs2 != null && Acp2 != null) {
                    r2 = new AnonymousClass75I(DbS.A0V(DbT.A10(OXF.A00(Acp2, (String) null, Acs2.longValue()))));
                } else if (C4n != null) {
                    r2 = new AnonymousClass75K(C317486nL.A04.A04(C4n), C4n);
                } else {
                    r2 = null;
                }
                naC = new N6U(this.A03.A00(pwa2, A004, C71134OdX.A03(context2, r8, pwl2.Bmo(i2), A023), messagingUser2, omf2, pwl2, r30, set2, i2), r10.A0A(context2, r56, r6, r2), BSF);
            } else if (r22 == null) {
                return null;
            } else {
                boolean A014 = OPx.A01(omf2);
                omf2.A00();
                AnonymousClass779 A015 = OZ7.A00.A01(pwl2, i2, true);
                String BSF2 = pwl2.BSF(i2);
                C3259874y r7 = C3259874y.A00;
                AnonymousClass756 r3 = new AnonymousClass756((C68147N2n) null, (C44046CTp) null);
                DirectMessageIdentifier directMessageIdentifier2 = new DirectMessageIdentifier((2FW) null, pwl2.BSF(i2), (String) null);
                AnonymousClass777 A026 = C71134OdX.A02((Integer) null, pwl2.BmB(i2), pwl2.BmA(i2), (Integer) null, pwl2.Bm9(i2), pwl2.BmT(i2));
                String Bme2 = pwl2.Bme(i2);
                if (Bme2 == null) {
                    Bme2 = "";
                }
                naC = new C68875NaC(A032, r7.A0A(context2, new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, C66584MXp.A0F(messagingUser2, Bme2), (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, C71136Ode.A00(context2, r13, messagingUser2, pwl2, 2FW.A0s, C73795Pju.A00, i2, A042, A014), A002, (AnonymousClass74T) null, (AnonymousClass774) null, A026, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, C254883tD.SINGLE, (AnonymousClass779) null, directMessageIdentifier2, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, C70102NxI.A00(A015).A00, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), r3, (AnonymousClass75J) null), r22, BSF2);
            }
        }
        return new OTT(AnonymousClass05K.A00, C71095OcV.A02(pwl2, i2), naC, (Object) null);
    }

    public PC7(Context context, UserSession userSession, AnonymousClass9HO r4, AnonymousClass9HC r5, AnonymousClass7L2 r6, OLQ olq) {
        this.A05 = context;
        this.A02 = r6;
        this.A00 = userSession;
        this.A01 = r5;
        this.A04 = olq;
        this.A06 = r4;
        this.A03 = C70095NxB.A00(context, userSession, r5, r6);
    }
}
