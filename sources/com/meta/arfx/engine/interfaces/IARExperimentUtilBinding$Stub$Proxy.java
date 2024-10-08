package com.meta.arfx.engine.interfaces;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import android.os.IBinder;
import android.os.Parcel;

public final class IARExperimentUtilBinding$Stub$Proxy implements IARExperimentUtilBinding {
    public IBinder A00;

    public final boolean Agr(int i, boolean z) {
        int A03 = AnonymousClass0fD.A03(1224967196);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
            obtain.writeInt(i);
            boolean z2 = true;
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1449092648, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-104302942);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-2033550756, A03);
        return iBinder;
    }
}
