package X;

import android.os.Bundle;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteData;

public final class WOI implements C21049XBq {
    public final /* synthetic */ PromoteActivity A00;
    public final /* synthetic */ 0sP A01;

    public final void Dmn(LinkingAuthState linkingAuthState) {
        0qQ.A0B(linkingAuthState, 0);
        PromoteData promoteData = this.A00.A00;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        } else {
            promoteData.A0n = linkingAuthState;
        }
    }

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        WT9.A01(C15414UcQ.A00, C18137VmD.A00(this.A00), "fetch_buat_success");
        this.A01.invoke(str);
    }

    public WOI(PromoteActivity promoteActivity, 0sP r2) {
        this.A00 = promoteActivity;
        this.A01 = r2;
    }

    public final void DED() {
        PromoteActivity promoteActivity = this.A00;
        PromoteActivity.A03(promoteActivity);
        C13990Tnq.A0h();
        ErrorIdentifier errorIdentifier = ErrorIdentifier.ACCESS_TOKEN_NULL;
        Bundle A05 = C13991Tnr.A05();
        C15275UZd A0N = C13991Tnr.A0N(A05, errorIdentifier.toString());
        A0N.setArguments(A05);
        C309516Yo A0B = Dba.A0B(promoteActivity, AnonymousClass7TE.A0l(promoteActivity.A0A));
        A0B.A0D(A0N);
        A0B.A04();
    }
}
