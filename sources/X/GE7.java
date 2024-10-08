package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This class is deprecated for reels ads use case, as it will be migrated to the new timeline framework and subject to clean up.See details here: https://fburl.com/gdoc/8ui5fuai")
public final class GE7 implements C250603lj {
    public boolean A00;
    public final UserSession A01;
    public final C52012GBj A02;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        C257913yA r0;
        String str;
        String name;
        boolean A1U = AnonymousClass7TF.A1U(0, r14, r15);
        Object obj = r14.A03;
        Object obj2 = obj;
        C267324bN r7 = (C267324bN) obj;
        if (r7.CcK()) {
            0f9 AEf = 0wj.A01.AEf("ClipsMidSceneViewpointAction", 630204974);
            AEf.ABQ("ItemType", r7.A01.name());
            1iA r02 = r7.A0J;
            String str2 = "";
            if (r02 == null || (str = r02.name()) == null) {
                str = str2;
            }
            AEf.ABQ("MediaType", str);
            AdFormatType adFormatType = r7.A0E;
            if (!(adFormatType == null || (name = adFormatType.name()) == null)) {
                str2 = name;
            }
            AEf.ABQ("FormatType", str2);
            AEf.report();
            return;
        }
        if (!r7.CcK()) {
            obj = null;
        }
        C267324bN r1 = (C267324bN) obj;
        if (r1 != null && (r0 = r1.A06().A0N) != null) {
            Object obj3 = r14.A04;
            C52058GDe gDe = (C52058GDe) obj3;
            AnonymousClass3W1 r9 = gDe.A0E;
            int A0A = C51968G9o.A0A(r14, r15);
            if (A0A == 0) {
                long A04 = (long) C51967G9n.A04(r0.Aw5(), 0);
                AnonymousClass71K r03 = GJ7.A00;
                0qQ.A06(obj3);
                UserSession userSession = this.A01;
                long A0D = A04 + r03.A0D(r7, gDe, userSession);
                if (r9 != null) {
                    0qQ.A06(obj2);
                    ((GJW) GJW.A03.getValue()).A00(r7, userSession, r9, A0D);
                }
            } else if (A0A != 2) {
            } else {
                if (r9 != null && r9.A1m == A1U) {
                    return;
                }
                if (this.A00) {
                    if (r9 != null) {
                        r9.A0j(false);
                        r9.A2J = false;
                        r9.A1L = null;
                        ((GJW) GJW.A03.getValue()).A01(r9);
                    }
                } else if (r9 != null && r9.A0n()) {
                    r9.A2J = A1U;
                }
            }
        }
    }

    public GE7(UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, gBj);
        this.A01 = userSession;
        this.A02 = gBj;
    }
}
