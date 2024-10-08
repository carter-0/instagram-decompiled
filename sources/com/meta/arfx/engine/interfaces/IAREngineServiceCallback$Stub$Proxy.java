package com.meta.arfx.engine.interfaces;

import X.AnonymousClass0fD;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import java.util.List;

public final class IAREngineServiceCallback$Stub$Proxy implements IAREngineServiceCallback {
    public IBinder A00;

    public final void Crr(String str) {
        int A03 = AnonymousClass0fD.A03(1137807192);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            obtain.writeString(str);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 3);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(216794190, A03);
        }
    }

    public final void EZu(Surface surface, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(707967262);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1258104545, A03);
        }
    }

    public final void Ek0(List list) {
        int A03 = AnonymousClass0fD.A03(-1903919890);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int size = list.size();
                obtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    AnonymousClass7TH.A0Q(obtain, list, i);
                }
            }
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-990350110, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1232516727);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(726061391, A03);
        return iBinder;
    }
}
