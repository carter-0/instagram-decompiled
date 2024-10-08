package X;

import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* renamed from: X.5kK  reason: invalid class name and case insensitive filesystem */
public final class C293195kK implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1AU A01;
    public final /* synthetic */ boolean A02;

    public C293195kK(1AU r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public final void onNetworkComplete(boolean z) {
        if (z) {
            this.A01.A00.A0D();
            return;
        }
        boolean z2 = this.A02;
        if (z2) {
            1AU r4 = this.A01;
            int i = this.A00 + 1;
            if (i >= 3) {
                0KC.A0P("MobileConfigFunctions", "fetchNames failed after max retry:%d. forceFetch:%s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z2)});
            } else {
                r4.A00.A0A().fetchNames(z2, new C293195kK(r4, i, z2));
            }
        }
    }
}
