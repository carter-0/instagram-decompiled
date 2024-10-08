package androidx.work.multiprocess;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.IBinder;
import android.os.Parcel;

public final class IWorkManagerImplCallback$Stub$Proxy implements IWorkManagerImplCallback {
    public IBinder A00;

    public final void DEc(String str) {
        int A03 = AnonymousClass0fD.A03(-789005235);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
            obtain.writeString(str);
            Pxi.A10(this.A00, obtain, 2);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(752696391, A03);
        }
    }

    public final void Doo(byte[] bArr) {
        int A03 = AnonymousClass0fD.A03(-244052650);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
            obtain.writeByteArray(bArr);
            Pxi.A0z(this.A00, obtain);
        } finally {
            obtain.recycle();
            AnonymousClass0fD.A0A(763151382, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-947407510);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-2047923711, A03);
        return iBinder;
    }
}
