package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class SVO implements ServiceConnection {
    public final /* synthetic */ SOT A00;

    public /* synthetic */ SVO(SOT sot) {
        this.A00 = sot;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SOT sot = this.A00;
        sot.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        sot.A01().post(new C8619QyD(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SOT sot = this.A00;
        sot.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        sot.A01().post(new C8617QyB(this));
    }
}
