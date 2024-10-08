package X;

import java.util.HashMap;

/* renamed from: X.OJs  reason: case insensitive filesystem */
public final class C70746OJs {
    public final HashMap A00 = AnonymousClass7TE.A1E();

    public final 1aU A00(C74337PtD ptD) {
        1aU r1;
        synchronized (ptD) {
            HashMap hashMap = this.A00;
            synchronized (hashMap) {
                Object obj = hashMap.get(ptD);
                if (obj == null) {
                    obj = ptD.ALA(this);
                    hashMap.put(ptD, obj);
                }
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.rx.Observable<T of com.instagram.direct.msys.observablelocator.ObservableLocator.getOrCreateScoped$lambda$2$lambda$1>");
                r1 = (1aU) obj;
            }
        }
        return r1;
    }
}
