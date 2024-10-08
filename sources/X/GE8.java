package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up. We will later repurpose this to be solely used for overlay ads. See details here: https://fburl.com/gdoc/8ui5fuai")
public final class GE8 implements C250603lj {
    public boolean A00;
    public C267324bN A01;
    public final UserSession A02;
    public final C52012GBj A03;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        1iA r1;
        String str;
        String name;
        boolean A1U = AnonymousClass7TF.A1U(0, r11, r12);
        C267324bN r6 = (C267324bN) r11.A03;
        if (r6.CcK()) {
            0f9 AEf = 0wj.A01.AEf("ClipsAdViewpointAction", 630204974);
            AEf.ABQ("ItemType", r6.A01.name());
            1iA r0 = r6.A0J;
            String str2 = "";
            if (r0 == null || (str = r0.name()) == null) {
                str = str2;
            }
            AEf.ABQ("MediaType", str);
            AdFormatType adFormatType = r6.A0E;
            if (!(adFormatType == null || (name = adFormatType.name()) == null)) {
                str2 = name;
            }
            AEf.ABQ("FormatType", str2);
            AEf.report();
            return;
        }
        AnonymousClass71K r02 = GJ7.A00;
        Object obj = r11.A04;
        0qQ.A06(obj);
        C52058GDe gDe = (C52058GDe) obj;
        UserSession userSession = this.A02;
        long A0C = r02.A0C(r6, gDe, userSession);
        boolean A1R = AnonymousClass7TF.A1R((A0C > 0 ? 1 : (A0C == 0 ? 0 : -1)));
        int A0A = C51968G9o.A0A(r11, r12);
        if (A0A == 0) {
            C52012GBj gBj = this.A03;
            C267324bN A04 = C52012GBj.A04(gBj);
            this.A01 = A04;
            if (A04 != null && !A04.CcK()) {
                this.A01 = gBj.A0C(C52012GBj.A00(gBj, A1U ? 1 : 0));
            }
            AnonymousClass3W1 r3 = gDe.A0E;
            if (r3 != null && A1R) {
                C293415kh.A00(userSession).A01(r3, A0C);
            }
        } else if (A0A == 2) {
            AnonymousClass3W1 r62 = gDe.A0E;
            if (r62 == null || r62.A1m != A1U) {
                if (this.A00) {
                    if (r62 != null) {
                        r62.A0Z(AnonymousClass05K.A00);
                        if (A1R) {
                            C267324bN r2 = this.A01;
                            if (r2 == null || !r2.CcK() || (r1 = r2.A0J) == 1iA.A0Q || r1 == 1iA.A0V || r2.A0H() || !182.A06(0Tu.A05, userSession, 36315769555717648L)) {
                                r62.A0e(false);
                                if (r62.A1l) {
                                    r62.A1l = false;
                                }
                                r62.A2K = false;
                                r62.A1L = null;
                                C293415kh.A00(userSession).A00(r62);
                                return;
                            }
                            r62.A0e(A1U);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (r62 == null || !A1R || !r62.A2B) {
                    return;
                }
                r62.A2K = A1U;
            }
        }
    }

    public GE8(UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, gBj);
        this.A02 = userSession;
        this.A03 = gBj;
    }
}
