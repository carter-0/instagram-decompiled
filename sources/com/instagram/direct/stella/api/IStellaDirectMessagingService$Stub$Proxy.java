package com.instagram.direct.stella.api;

import X.AnonymousClass0fD;
import android.os.IBinder;
import android.os.Parcel;

public final class IStellaDirectMessagingService$Stub$Proxy implements IStellaDirectMessagingService {
    public IBinder A00;

    public final void EBT(ISendDirectMessageCallback iSendDirectMessageCallback) {
        int A03 = AnonymousClass0fD.A03(860595062);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
            obtain.writeStrongInterface(iSendDirectMessageCallback);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-2084238884, A03);
        }
    }

    public final String EHH(String str) {
        int A03 = AnonymousClass0fD.A03(106142123);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
            obtain.writeString(str);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1408912335, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(1029052551);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(806264136, A03);
        return iBinder;
    }
}
