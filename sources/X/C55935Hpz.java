package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hpz  reason: case insensitive filesystem */
public final class C55935Hpz {
    public final UserSession A00;
    public final C56040Hrn A01;

    public final C53378Gn8 A00(C61081JwJ jwJ, C53395GnS gnS, String str, List list) {
        C59498JLw gpy;
        String str2;
        Integer num;
        C59496JLu jLu;
        Integer num2;
        C61084JwM jwM;
        C59496JLu jLu2;
        C59496JLu jLu3;
        C53395GnS gnS2 = gnS;
        List list2 = list;
        int A02 = DbW.A02(0, gnS2, list2);
        HMG hmg = gnS2.A06;
        boolean z = true;
        if (hmg != HMG.ENTER_PROMPT || !AnonymousClass7TE.A1b(gnS2.A08)) {
            z = false;
        }
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36325317266125669L) && (hmg == HMG.GENERATED_IMAGE_SELECTION_4UP || hmg == HMG.GENERATED_IMAGE_SELECTION)) {
            gpy = new C53526Gpw(gnS2.A08);
        } else if (hmg == HMG.GENERATED_IMAGE_SELECTION_4UP) {
            I12 i12 = gnS2.A04;
            if (i12 != null) {
                str2 = i12.A05;
            } else {
                str2 = null;
            }
            gpy = new C53527Gpx(gnS2.A07, str2, gnS2.A00, gnS2.A0G);
        } else {
            gpy = new C53528Gpy(this.A01.A00(jwJ, list2), gnS2.A05, hmg, z, gnS2.A0E, gnS2.A0F, gnS2.A0B, gnS2.A0A);
        }
        C59498JLw jLw = gpy;
        int ordinal = hmg.ordinal();
        String str3 = str;
        if (ordinal == 5) {
            if (182.A06(r3, userSession, 36319918495833864L) || !(str == null || str3.length() == 0)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            if (str == null || str3.length() == 0) {
                jLu2 = IQN.A00;
            } else {
                jLu2 = new C53524Gpu(new C52255GKw(str3), DbS.A0Q(new Object[0], 2131965751));
            }
            jLu = jLu2;
            num2 = AnonymousClass05K.A00;
            jwM = new C61084JwM(jLu, num, num2);
        } else if (ordinal == 6) {
            if (str != null) {
                jLu3 = new C53524Gpu(new C52255GKw(str3), DbS.A0Q(new Object[0], 2131965751));
            } else {
                jLu3 = IQN.A00;
            }
            jwM = new C61084JwM(jLu3, AnonymousClass05K.A01, (Integer) null, 4);
        } else if (ordinal != 4) {
            if (ordinal == 3) {
                boolean z2 = gnS2.A0C;
                if (str != null && str3.length() != 0) {
                    num = AnonymousClass05K.A01;
                    jLu = IQN.A00;
                    num2 = AnonymousClass05K.A0N;
                    jwM = new C61084JwM(jLu, num, num2);
                } else if (z && !z2) {
                    jwM = new C61084JwM((C59496JLu) null, (Integer) null, AnonymousClass05K.A0C, 3);
                }
            } else if (ordinal == A02 && gnS2.A0E && gnS2.A09) {
                jwM = new C61084JwM((C59496JLu) null, (Integer) null, AnonymousClass05K.A0C, 3);
            }
            jwM = new C61084JwM((C59496JLu) null, AnonymousClass05K.A00, (Integer) null, 6);
        } else {
            jwM = new C61084JwM((C59496JLu) null, (Integer) null, (Integer) null, 7);
        }
        I12 i122 = gnS2.A04;
        return new C53378Gn8(gnS2.A01, jwM, gnS2.A03, i122, jLw, str3, gnS2.A08, 182.A06(r3, userSession, 36319918495833864L));
    }

    public C55935Hpz(UserSession userSession, C56040Hrn hrn) {
        this.A00 = userSession;
        this.A01 = hrn;
    }
}
