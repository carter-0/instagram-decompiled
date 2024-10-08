package X;

import android.content.Context;

public final class IVJ implements C66491MTu {
    public final /* synthetic */ AnonymousClass41T A00;
    public final /* synthetic */ 215 A01;

    public IVJ(AnonymousClass41T r1, 215 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void D1x(Context context) {
        215 r1 = this.A01;
        AnonymousClass41T r0 = this.A00;
        215.A04(r1, r0.A05, r0.A08, "In App Notification open button clicked", (String) null, r0.A07);
        215.A03(r0, r1);
    }

    public final void onDismiss() {
        215 r1 = this.A01;
        AnonymousClass41T r0 = this.A00;
        215.A04(r1, r0.A05, r0.A08, "Dismiss In App Notification", (String) null, r0.A07);
    }
}
