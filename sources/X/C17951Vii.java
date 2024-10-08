package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Vii  reason: case insensitive filesystem */
public abstract class C17951Vii {
    public final Set A00 = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void A00(C13550TcM tcM) {
        if (this instanceof C15094UOn) {
            C15094UOn uOn = (C15094UOn) this;
            uOn.A00.BtW((C13920TlM) tcM, uOn.A00);
            return;
        }
        C15093UOm uOm = (C15093UOm) this;
        uOm.A00.AYi((C18983WFk) tcM, uOm.A00);
    }

    public void A01(C13550TcM tcM) {
        this.A00.remove(tcM);
    }
}
