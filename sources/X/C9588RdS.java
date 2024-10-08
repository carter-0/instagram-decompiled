package X;

import com.facebook.tigon.TigonErrorException;

/* renamed from: X.RdS  reason: case insensitive filesystem */
public abstract class C9588RdS {
    public static final int A00(Throwable th) {
        if (th instanceof TigonErrorException) {
            return ((TigonErrorException) th).tigonError.category.value;
        }
        if (!"GraphServicesException".equals(C66581MXm.A0y(th))) {
            return -1;
        }
        0KC.A0K("GraphServicesException", "Unhandled GraphServicesException detected.", new Exception("Unhandled GraphServicesException detected."));
        return -1;
    }
}
