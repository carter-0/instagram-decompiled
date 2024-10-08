package X;

import android.os.Bundle;
import android.util.Log;

public abstract class PyR {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C365498nD A03 = new C365498nD();

    public static void A00(Object obj, Object obj2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(obj2);
            String.valueOf(valueOf);
            String.valueOf(valueOf2);
        }
    }

    public final String toString() {
        boolean z;
        int i = this.A00;
        int i2 = this.A01;
        if (this instanceof R29) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder A14 = Pxe.A14(55);
        A14.append("Request { what=");
        A14.append(i);
        A14.append(" id=");
        A14.append(i2);
        A14.append(" oneWay=");
        return C66584MXp.A0b(A14, z);
    }

    public PyR(Bundle bundle, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }
}
