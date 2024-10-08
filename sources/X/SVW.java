package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;
import java.util.concurrent.atomic.AtomicReference;

public final class SVW implements ServiceConnection {
    public final /* synthetic */ QQU A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ boolean A02;

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        0qQ.A0B(iBinder, 1);
        AtomicReference atomicReference = this.A01;
        QQU qqu = this.A00;
        C13771Tgk tgk = qqu.A03;
        atomicReference.set(tgk.ADs(iBinder));
        SOJ soj = qqu.A04;
        soj.A01("IPC_SERVICE_CONNECTED");
        if (this.A02) {
            qqu.A04();
            return;
        }
        ((IGalaxyStoreDownloadService) atomicReference.get()).CM1(QQU.A00(qqu, false));
        soj.A01("IPC_SERVICE_UNBIND_REQUESTED");
        Context context = qqu.A01;
        0qQ.A06(context);
        tgk.FIS(context, this);
        qqu.A06.set((Object) null);
    }

    public SVW(QQU qqu, AtomicReference atomicReference, boolean z) {
        this.A01 = atomicReference;
        this.A00 = qqu;
        this.A02 = z;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        QQU qqu = this.A00;
        qqu.A04.A01("IPC_SERVICE_DISCONNECTED");
        qqu.A05(RE5.UNKNOWN, C8896REo.FAILED_INSTALL, "FAILED_INSTALL", C8951RIq.ERROR_SERVICE_UNAVAILABLE.toString());
        this.A01.set((Object) null);
    }
}
