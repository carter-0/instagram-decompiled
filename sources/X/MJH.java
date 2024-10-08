package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import java.util.ArrayList;

public final class MJH extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJH(Object obj, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
        this.A02 = z4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            TrialUseCase trialUseCase = (TrialUseCase) this.A01;
            LSk lSk = trialUseCase.A02;
            boolean z = this.A05;
            boolean A1W = AnonymousClass7TF.A1W(C61075JwD.A0M(trialUseCase), AnonymousClass3QO.FAN_CLUB);
            boolean z2 = this.A02;
            boolean z3 = this.A04;
            boolean z4 = this.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (z) {
                A1C.add(C62664KkQ.AUDIENCE_CONTROL);
            }
            if (A1W) {
                A1C.add(C62664KkQ.SUBSCRIBER_ONLY);
            }
            if (z2) {
                A1C.add(C62664KkQ.ADD_COLLABORATORS);
            }
            if (z3) {
                A1C.add(C62664KkQ.SHARE_TO_FEED);
            }
            if (z4) {
                A1C.add(C62664KkQ.SCHEDULE_CONTENT);
            }
            LSk.A02(LSk.A00((C46327Dbv) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, A1C), lSk, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "share_sheet", "tap_override_conflicting_settings", (String) null);
            trialUseCase.A0C(true);
        } else {
            ((2BJ) this.A01).A01.add(new C61311K1y(this.A04, this.A03, this.A05, this.A02));
        }
        return C60340gF.A00;
    }
}
