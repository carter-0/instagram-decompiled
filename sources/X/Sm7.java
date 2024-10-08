package X;

import android.os.IBinder;
import android.os.Parcel;

public final class Sm7 implements C13555TcR {
    public final IBinder A00;

    public Sm7(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void CfG(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
