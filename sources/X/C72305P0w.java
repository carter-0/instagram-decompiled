package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.P0w  reason: case insensitive filesystem */
public final class C72305P0w implements C74445Pv0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OBN A01;
    public final /* synthetic */ NUW A02;

    public C72305P0w(Context context, OBN obn, NUW nuw) {
        this.A02 = nuw;
        this.A01 = obn;
        this.A00 = context;
    }

    public final void DUT() {
        this.A02.A0H(MessageAvailabilityResponseId$Companion.NOT_SUPPORTED);
    }

    public final void onFailure() {
        C66913Mex.A04(this.A02, "IMPLICIT_BACKUP_RETRY_RESULT", "FAILURE");
    }

    public final void onSuccess() {
        NUW nuw = this.A02;
        nuw.A0D("IMPLICIT_BACKUP_RETRY_RESULT", "SUCCESS");
        nuw.A08();
        C69902Nu4.A00(this.A01.A01, this.A00, "Created Block Store with Health Validator");
    }
}
