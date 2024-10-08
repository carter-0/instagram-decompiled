package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.UUID;

/* renamed from: X.9Sc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C379019Sc implements Camera.ErrorCallback {
    public final /* synthetic */ AnonymousClass9RJ A00;

    public /* synthetic */ C379019Sc(AnonymousClass9RJ r1) {
        this.A00 = r1;
    }

    public final void onError(int i, Camera camera) {
        String A002;
        AnonymousClass9RJ r3 = this.A00;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                A002 = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
            } else if (i != 100) {
                A002 = 002.A0O(Pxd.A00(600), i);
            } else {
                A002 = "Camera server died. Camera resources will be released.";
            }
            z = true;
        } else {
            A002 = AnonymousClass000.A00(62);
        }
        List list = r3.A0O.A00;
        UUID uuid = r3.A0Q.A03;
        C341877nf r2 = r3.A0a;
        if (r2 != null && !r2.A00.isEmpty()) {
            C342057ny.A00(new C40746Aic(r2));
        }
        Log.e("Camera1Device", A002);
        r3.A0R.A05(new C41229AqR(new C41515AvI(i, A002), r3, list, uuid, z), uuid);
    }
}
