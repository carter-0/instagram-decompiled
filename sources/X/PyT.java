package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzm;

public final class PyT {
    public final Messenger A00;
    public final zzm A01;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.firebase.iid.zzm, java.lang.Object] */
    public PyT(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.A00 = new Messenger(iBinder);
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            ? obj = new Object();
            obj.A00 = new Messenger(iBinder);
            this.A01 = obj;
        } else {
            Log.w("MessengerIpcClient", Pxh.A0l("Invalid interface descriptor: ", interfaceDescriptor));
            throw new RemoteException();
        }
    }
}
