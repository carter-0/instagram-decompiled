package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up. We will later repurpose this to be solely used for overlay ads. See details here: https://fburl.com/gdoc/8ui5fuai")
public final class GE6 implements C250603lj {
    public boolean A00;
    public C267324bN A01;
    public final UserSession A02;
    public final C52012GBj A03;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        1iA r1;
        String str;
        String name;
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        C267324bN r5 = (C267324bN) r8.A03;
        if (r5.CcK()) {
            0f9 AEf = 0wj.A01.AEf("ClipsCTADwellViewpointAction", 630204974);
            AEf.ABQ("ItemType", r5.A01.name());
            1iA r0 = r5.A0J;
            String str2 = "";
            if (r0 == null || (str = r0.name()) == null) {
                str = str2;
            }
            AEf.ABQ("MediaType", str);
            AdFormatType adFormatType = r5.A0E;
            if (!(adFormatType == null || (name = adFormatType.name()) == null)) {
                str2 = name;
            }
            AEf.ABQ("FormatType", str2);
            AEf.report();
            return;
        }
        int A0A = C51968G9o.A0A(r8, r9);
        if (A0A == 0) {
            C52012GBj gBj = this.A03;
            this.A01 = gBj.A0C(C52012GBj.A00(gBj, A1U ? 1 : 0));
            Object obj = r8.A04;
            C52058GDe gDe = (C52058GDe) obj;
            AnonymousClass3W1 r3 = gDe.A0E;
            AnonymousClass71K r12 = GJ7.A00;
            0qQ.A06(obj);
            long A0D = r12.A0D(r5, gDe, this.A02);
            if (r3 != null) {
                AnonymousClass5F9.A00().A01(r3, A0D);
            }
        } else if (A0A == 2) {
            AnonymousClass3W1 r52 = ((C52058GDe) r8.A04).A0E;
            if (r52 == null || r52.A1m != A1U) {
                if (this.A00) {
                    if (r52 != null) {
                        C267324bN r2 = this.A01;
                        if (!(r2 == null || !r2.CcK() || (r1 = r2.A0J) == 1iA.A0Q || r1 == 1iA.A0V || r2.A0H())) {
                            if (182.A06(0Tu.A05, this.A02, 36315769555717648L)) {
                                r52.A0m(A1U, A1U);
                            }
                        }
                        r52.A0m(false, A1U);
                        r52.A2P = false;
                        r52.A2I = false;
                        r52.A1L = null;
                        AnonymousClass5F9.A00().A00(r52);
                        return;
                    }
                    return;
                } else if (r52 == null || !r52.A29) {
                    return;
                }
                r52.A2I = A1U;
            }
        }
    }

    public GE6(UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, gBj);
        this.A02 = userSession;
        this.A03 = gBj;
    }
}
