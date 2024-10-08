package X;

import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MnS  reason: case insensitive filesystem */
public final class C67411MnS implements C250603lj {
    public final C66966Mfz A00;
    public final C67410MnR A01;
    public final C67405MnM A02;
    public final String A03;

    public C67411MnS(C67410MnR mnR, C67405MnM mnM, String str) {
        this.A01 = mnR;
        this.A02 = mnM;
        this.A03 = str;
        C66966Mfz mfz = new C66966Mfz();
        mfz.A09 = "server";
        mfz.A05 = "server_results";
        this.A00 = mfz;
    }

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum;
        AnonymousClass7TG.A1N(r11, r12);
        if (r12.CEk(r11) != AnonymousClass05K.A0C) {
            C67405MnM mnM = this.A02;
            C70826OMy oMy = (C70826OMy) r11.A03;
            AnonymousClass0eM r3 = oMy.A0A;
            if (mnM.AH0(DbS.A0t(r3))) {
                if (oMy.A01() == AnonymousClass05K.A0u) {
                    List list = oMy.A08;
                    if (list != null) {
                        this.A00.A02 = list.size();
                    }
                    C274584oc r0 = oMy.A00().A03;
                    if (!(r0 == null || (threadsInFeedUnitTypeEnum = r0.A06) == null)) {
                        C66966Mfz mfz = this.A00;
                        String obj = threadsInFeedUnitTypeEnum.toString();
                        0qQ.A0B(obj, 0);
                        mfz.A0A = obj;
                    }
                    this.A00.A07 = this.A03;
                }
                this.A01.A00(new C66967Mg0(this.A00), (User) null, (Integer) null, DbS.A0t(oMy.A0B), DbS.A0t(r3), DbS.A0t(r3), "", (String) null);
            }
        }
    }
}
