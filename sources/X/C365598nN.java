package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.8nN  reason: invalid class name and case insensitive filesystem */
public final class C365598nN implements ServiceConnection {
    public final /* synthetic */ C70082Jk A00;

    public /* synthetic */ C365598nN(C70082Jk r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C70082Jk r3 = this.A00;
        r3.A06.A03("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        r3.A01().post(new AnonymousClass9TS(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C70082Jk r3 = this.A00;
        r3.A06.A03(Pxd.A00(562), new Object[]{componentName});
        r3.A01().post(new C383849gM(this));
    }
}
