package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.Sxg  reason: case insensitive filesystem */
public final class C12555Sxg implements AnonymousClass64Q {
    public final /* synthetic */ BaseGmsClient A00;

    public C12555Sxg(BaseGmsClient baseGmsClient) {
        this.A00 = baseGmsClient;
    }

    public final void De8(ConnectionResult connectionResult) {
        if (connectionResult.A01 == 0) {
            BaseGmsClient baseGmsClient = this.A00;
            baseGmsClient.Blb((IAccountAccessor) null, ((AnonymousClass645) baseGmsClient).A01);
            return;
        }
        AnonymousClass64H r0 = this.A00.A0I;
        if (r0 != null) {
            ((AnonymousClass64G) r0).A00.D5m(connectionResult);
        }
    }
}
