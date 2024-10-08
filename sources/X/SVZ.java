package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import com.xiaomi.market.IMarketDownloadService;

public final class SVZ implements ServiceConnection {
    public final int A00;
    public final Object A01;

    public SVZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onBindingDied(ComponentName componentName) {
        if (1 - this.A00 != 0) {
            super.onBindingDied(componentName);
            return;
        }
        SOJ.A00(C8951RIq.ERROR_BINDING_DIED, ((SJG) this.A01).A04, (Long) null, "FAILED_SERVICE_CONNECTION", (String) null);
    }

    public final void onNullBinding(ComponentName componentName) {
        if (1 - this.A00 != 0) {
            super.onNullBinding(componentName);
            return;
        }
        SOJ.A00(C8951RIq.ERROR_NULL_BINDING, ((SJG) this.A01).A04, (Long) null, "FAILED_SERVICE_CONNECTION", (String) null);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IAREngineServiceController$Stub$Proxy] */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IAREngineServiceController iAREngineServiceController;
        switch (this.A00) {
            case 0:
                if (iBinder != null) {
                    try {
                        QQT qqt = (QQT) this.A01;
                        qqt.A06.set(qqt.A05.ADs(iBinder));
                        qqt.A04();
                        return;
                    } catch (C318126oR unused) {
                        QQT.A00((QQT) this.A01);
                        return;
                    }
                } else {
                    QQT.A00((QQT) this.A01);
                    return;
                }
            case 1:
                QQV qqv = (QQV) this.A01;
                SOJ soj = qqv.A04;
                soj.A01("IPC_SERVICE_CONNECTED");
                IMarketDownloadService iMarketDownloadService = (IMarketDownloadService) qqv.A08.ADs(iBinder);
                qqv.A03 = iMarketDownloadService;
                try {
                    iMarketDownloadService.EBZ(qqv.A01);
                    qqv.A03.CQd();
                    if (!qqv.A06) {
                        qqv.A03.A00(C8896REo.WAITING_DOWNLOAD);
                        soj.A01("DOWNLOAD_WAITING");
                    }
                    if (qqv.A05) {
                        qqv.A04();
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    SOJ.A00(C8951RIq.ERROR_FAILED_DOWNLOAD_CALLBACK_REGISTER, soj, (Long) null, "FAILED_SERVICE_CONNECTION", (String) null);
                    e.getMessage();
                    return;
                }
            case 2:
                0qQ.A0B(iBinder, 1);
                AIb aIb = (AIb) this.A01;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.meta.arfx.engine.interfaces.IAREngineServiceController");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IAREngineServiceController)) {
                    ? obj = new Object();
                    int A03 = AnonymousClass0fD.A03(-2074703569);
                    obj.A00 = iBinder;
                    AnonymousClass0fD.A0A(-213430221, A03);
                    iAREngineServiceController = obj;
                } else {
                    iAREngineServiceController = (IAREngineServiceController) queryLocalInterface;
                }
                aIb.A0A = iAREngineServiceController;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.Ejz(aIb.A0a);
                        return;
                    } catch (RemoteException e2) {
                        0KC.A05(AIb.class, "setServiceCallback() failed: ", e2);
                        AIb.A00(aIb);
                        return;
                    }
                } else {
                    return;
                }
            default:
                0qQ.A0B(iBinder, 1);
                C10957S2p s2p = (C10957S2p) this.A01;
                s2p.A01 = iBinder;
                s2p.A02.A0B(C8884REb.CONNECTED);
                return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.A00) {
            case 0:
                QQT qqt = (QQT) this.A01;
                qqt.A04.A01("IPC_SERVICE_DISCONNECTED");
                QQT.A00(qqt);
                return;
            case 1:
                QQV qqv = (QQV) this.A01;
                SOJ soj = qqv.A04;
                soj.A01("IPC_SERVICE_DISCONNECTED");
                if (qqv.A00 < DbS.A04(0Tu.A05, qqv.A02.A00, 36598606035422444L)) {
                    qqv.A00++;
                    soj.A01("RECONNECT_ON_SERVICE_DISCONNECTED");
                    qqv.A03();
                    qqv.A06 = true;
                    QQV.A01(qqv);
                    return;
                }
                qqv.A05(RE5.UNKNOWN, C8896REo.FAILED_INSTALL, "FAILED_INSTALL", C8951RIq.ERROR_UNEXEPECTED_SERVICE_DISCONNECTION.toString());
                return;
            case 2:
                AIb aIb = (AIb) this.A01;
                synchronized (aIb.A0b) {
                    AIb.A00(aIb);
                    aIb.A0A = null;
                    aIb.A0V.bindService(aIb.A0W, this, 1);
                }
                return;
            default:
                C10957S2p s2p = (C10957S2p) this.A01;
                s2p.A01 = null;
                s2p.A00 = null;
                s2p.A02.A0B(C8884REb.UNKNOWN);
                return;
        }
    }
}
