package androidx.work.multiprocess;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C11460SVy;
import X.C2379539x;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.NoSuchElementException;

public final class RemoteCallback extends Binder implements IWorkManagerImplCallback {
    public IBinder A00 = null;
    public final IBinder.DeathRecipient A01 = new C11460SVy(this);
    public final C2379539x A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v5, types: [X.39x, java.lang.Object] */
    public RemoteCallback() {
        int A03 = AnonymousClass0fD.A03(-1814143413);
        attachInterface(this, IWorkManagerImplCallback.A00);
        AnonymousClass0fD.A0A(280964456, A03);
        int A032 = AnonymousClass0fD.A03(82497104);
        AnonymousClass0fD.A0A(-1621771810, A032);
    }

    public static void A00(RemoteCallback remoteCallback, Throwable th) {
        int A03 = AnonymousClass0fD.A03(433217085);
        remoteCallback.A02.A08(th);
        int A032 = AnonymousClass0fD.A03(2045377316);
        IBinder iBinder = remoteCallback.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(remoteCallback.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        AnonymousClass0fD.A0A(901301854, A032);
        AnonymousClass0fD.A0A(2104046337, AnonymousClass0fD.A03(1474174170));
        AnonymousClass0fD.A0A(-332758699, A03);
    }

    public final void DEc(String str) {
        int A03 = AnonymousClass0fD.A03(-533476537);
        A00(this, AnonymousClass7TE.A15(str));
        AnonymousClass0fD.A0A(-1795988118, A03);
    }

    public final void Doo(byte[] bArr) {
        int A03 = AnonymousClass0fD.A03(1096329657);
        this.A02.A07(bArr);
        int A032 = AnonymousClass0fD.A03(2045377316);
        IBinder iBinder = this.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        AnonymousClass0fD.A0A(901301854, A032);
        AnonymousClass0fD.A0A(2104046337, AnonymousClass0fD.A03(1474174170));
        AnonymousClass0fD.A0A(2141265685, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1332910552, AnonymousClass0fD.A03(2145957569));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-1152981776);
        String str = IWorkManagerImplCallback.A00;
        boolean z = true;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    Doo(parcel.createByteArray());
                } else if (i == 2) {
                    DEc(parcel.readString());
                }
                i3 = -1027841409;
                AnonymousClass0fD.A0A(i3, A03);
                return z;
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = 976685070;
                AnonymousClass0fD.A0A(i3, A03);
                return z;
            }
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = 2119956713;
        AnonymousClass0fD.A0A(i3, A03);
        return z;
    }
}
