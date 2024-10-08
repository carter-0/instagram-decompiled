package com.meta.arfx.engine.interfaces;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class IARAnalyticsLoggerHost$Stub$Proxy implements IARAnalyticsLoggerHost {
    public IBinder A00;

    public final void Ci0(List list) {
        int A03 = AnonymousClass0fD.A03(1643940163);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
            int size = list.size();
            obtain.writeInt(size);
            for (int i = 0; i < size; i++) {
                AnonymousClass7TH.A0Q(obtain, list, i);
            }
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(485314144, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1324125389);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-662730282, A03);
        return iBinder;
    }
}
