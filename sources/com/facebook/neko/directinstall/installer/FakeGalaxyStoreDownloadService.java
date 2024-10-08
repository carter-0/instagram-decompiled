package com.facebook.neko.directinstall.installer;

import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.Pxj;
import X.QQW;
import X.RRF;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

public final class FakeGalaxyStoreDownloadService extends Binder implements IGalaxyStoreDownloadService {
    public IGalaxyStoreDownloadCallback A00;
    public String A01;
    public final RRF A02 = new QQW(this);

    public FakeGalaxyStoreDownloadService() {
        int A03 = AnonymousClass0fD.A03(-76534373);
        attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
        AnonymousClass0fD.A0A(566013934, A03);
        int A032 = AnonymousClass0fD.A03(1270021089);
        AnonymousClass0fD.A0A(310584470, A032);
    }

    public final void AGF(String str) {
        int A03 = AnonymousClass0fD.A03(-1829436563);
        int A032 = AnonymousClass0fD.A03(1965328464);
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A0A(-1466418374, A032);
        AnonymousClass0fD.A0A(-222412958, A03);
    }

    public final void AQ7(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = AnonymousClass0fD.A03(-937945433);
        AnonymousClass7TG.A1N(bundle, iGalaxyStoreDownloadCallback);
        this.A01 = bundle.getString("packageName");
        this.A00 = iGalaxyStoreDownloadCallback;
        this.A02.A00();
        AnonymousClass0fD.A0A(1218973145, A03);
    }

    public final void CM1(Bundle bundle) {
        AnonymousClass0fD.A0A(-1050939114, AnonymousClass0fD.A03(1014484981));
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(911817834, AnonymousClass0fD.A03(1129977348));
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback$Stub$Proxy, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback;
        int A03 = AnonymousClass0fD.A03(-316135644);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                if (i == 1) {
                    Bundle bundle = (Bundle) Pxj.A0i(parcel, Bundle.CREATOR);
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iGalaxyStoreDownloadCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IGalaxyStoreDownloadCallback)) {
                            ? obj = new Object();
                            int A032 = AnonymousClass0fD.A03(486272370);
                            obj.A00 = readStrongBinder;
                            AnonymousClass0fD.A0A(606119398, A032);
                            iGalaxyStoreDownloadCallback = obj;
                        } else {
                            iGalaxyStoreDownloadCallback = (IGalaxyStoreDownloadCallback) queryLocalInterface;
                        }
                    }
                    AQ7(bundle, iGalaxyStoreDownloadCallback);
                } else if (i == 2) {
                    AGF(parcel.readString());
                } else if (i == 3) {
                    CM1((Bundle) Pxj.A0i(parcel, Bundle.CREATOR));
                }
                parcel2.writeNoException();
                i3 = -1060520117;
            } else if (i == 1598968902) {
                parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                i3 = 1440508335;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(449848808, A03);
        return onTransact;
    }
}
