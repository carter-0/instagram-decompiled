package androidx.room;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class MultiInstanceInvalidationClient$callback$1 extends Binder implements IMultiInstanceInvalidationCallback {
    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy, androidx.room.IMultiInstanceInvalidationCallback, java.lang.Object] */
    public static IMultiInstanceInvalidationCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.A00);
        if (queryLocalInterface != null && (queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
            return (IMultiInstanceInvalidationCallback) queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(-34603265);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(-1199259771, A03);
        return obj;
    }
}
