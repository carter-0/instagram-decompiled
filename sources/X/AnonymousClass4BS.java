package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.4BS  reason: invalid class name */
public final class AnonymousClass4BS implements ServiceConnection {
    public final /* synthetic */ AnonymousClass2S6 A00;

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        27B.A01("HeroKeepAliveService.Client", "Service Connected", new Object[0]);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        27B.A01("HeroKeepAliveService.Client", "Service Disconnected", new Object[0]);
    }

    public AnonymousClass4BS(AnonymousClass2S6 r1) {
        this.A00 = r1;
    }
}
