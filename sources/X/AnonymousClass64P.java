package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.64P  reason: invalid class name */
public final class AnonymousClass64P implements AnonymousClass64Q, AnonymousClass64R {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final AnonymousClass647 A03;
    public final AnonymousClass63Q A04;
    public final /* synthetic */ AnonymousClass63T A05;

    public AnonymousClass64P(AnonymousClass647 r2, AnonymousClass63Q r3, AnonymousClass63T r4) {
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void De8(ConnectionResult connectionResult) {
        this.A05.A06.post(new C301125yX(connectionResult, this));
    }

    public final void FOV(ConnectionResult connectionResult) {
        AnonymousClass63w r0 = (AnonymousClass63w) this.A05.A09.get(this.A04);
        if (r0 != null) {
            r0.A0B(connectionResult);
        }
    }
}
