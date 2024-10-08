package com.instagram.direct.stella.api;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C41848B3p;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISendDirectMessageCallback extends IInterface {

    public abstract class Stub extends Binder implements ISendDirectMessageCallback {

        public final class Proxy implements ISendDirectMessageCallback {
            public IBinder A00;

            public final void DRm(String str, boolean z) {
                int A03 = AnonymousClass0fD.A03(-1360338813);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    obtain.writeString(str);
                    obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-1870667507, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(-360543626);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(-159436244, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0fD.A03(-2114044973);
            attachInterface(this, "com.instagram.direct.stella.api.ISendDirectMessageCallback");
            AnonymousClass0fD.A0A(179903892, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(1736290455, AnonymousClass0fD.A03(222844540));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(-1005476829);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    if (i == 1) {
                        DRm(parcel.readString(), C41848B3p.A1X(parcel));
                        parcel2.writeNoException();
                        i3 = 2081623580;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    i3 = -1535127674;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(668842400, A03);
            return onTransact;
        }
    }

    void DRm(String str, boolean z);
}
