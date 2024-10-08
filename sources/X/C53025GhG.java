package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.GhG  reason: case insensitive filesystem */
public final class C53025GhG extends 2YL {
    public final UserSession A00;
    public final C55529HjB A01;
    public final KWX A02;
    public final C334007aW A03;
    public final Map A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final 1Ng A07;

    public C53025GhG(1Ng r7, UserSession userSession, KWX kwx, C334007aW r10) {
        0qQ.A0B(r7, 2);
        this.A03 = r10;
        this.A07 = r7;
        this.A00 = userSession;
        this.A02 = kwx;
        C55529HjB hjB = new C55529HjB(userSession);
        this.A01 = hjB;
        UserSession userSession2 = hjB.A00;
        boolean z = true;
        02z A10 = DbS.A10(new C53396GnT((AnonymousClass7TE.A0q(userSession2).getInt(AnonymousClass000.A00(3925), 0) >= 2 || AnonymousClass7TE.A0q(userSession2).getInt(AnonymousClass000.A00(3924), 0) >= 1) ? false : z));
        this.A05 = A10;
        this.A06 = 10b.A03(A10);
        this.A04 = AnonymousClass7TE.A1H();
        DbY.A19(this, new C66185MGw(this, (AnonymousClass4D7) null, 42), new AnonymousClass64X(r7).A00(AnonymousClass3KA.class));
        AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 4), C318116oQ.A00(this));
    }

    public static final void A00(C53025GhG ghG, FollowStatus followStatus, String str) {
        Object value;
        C46519DgM dgM;
        C53025GhG ghG2 = ghG;
        String str2 = str;
        User user = (User) ghG.A04.get(str2);
        FollowStatus followStatus2 = followStatus;
        if (user != null) {
            user.A0n(followStatus);
        }
        List<C53312Gly> list = (List) ((C53396GnT) ghG.A06.getValue()).A05;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C53312Gly gly : list) {
            String str3 = gly.A04;
            if (0qQ.A0K(str3, str2)) {
                int ordinal = followStatus2.ordinal();
                if (ordinal == 4) {
                    dgM = C46519DgM.MESSAGE;
                } else if (ordinal == 2) {
                    dgM = C46519DgM.LOADING;
                } else if (ordinal == 3) {
                    dgM = C46519DgM.FOLLOW;
                } else if (ordinal != 5) {
                    dgM = C46519DgM.UNKNOWN;
                } else {
                    dgM = C46519DgM.REQUESTED;
                }
                String str4 = gly.A05;
                ImageUrl imageUrl = gly.A00;
                String str5 = gly.A03;
                boolean z = gly.A08;
                boolean z2 = gly.A07;
                boolean z3 = gly.A06;
                Reel reel = gly.A02;
                C51974G9v.A1K(str4, imageUrl, str3);
                gly = new C53312Gly(imageUrl, dgM, reel, str4, str5, str3, z, z2, z3);
            }
            A0r.add(gly);
        }
        AnonymousClass62P A002 = AnonymousClass62Q.A00(A0r);
        05G r2 = ghG2.A05;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53396GnT.A00((C61076JwE) null, (C53396GnT) value, (C54636HLt) null, (String) null, A002, 123)));
    }

    public final void A01(int i) {
        AnonymousClass7TE.A1Z(new C66164MGb(this, (AnonymousClass4D7) null, i, 30), C318116oQ.A00(this));
    }
}
