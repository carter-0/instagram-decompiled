package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class SVN implements ServiceConnection {
    public final /* synthetic */ SOS A00;

    public /* synthetic */ SVN(SOS sos) {
        this.A00 = sos;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SOS sos = this.A00;
        sos.A06.A01("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        sos.A01().post(new Qy0(iBinder, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        SOS sos = this.A00;
        sos.A06.A01("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        sos.A01().post(new C8613Qxy(this));
    }
}
