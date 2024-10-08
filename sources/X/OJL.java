package X;

import java.util.concurrent.atomic.AtomicReference;

public final class OJL {
    public final AtomicReference A00 = new AtomicReference();

    public final Object A00(C74293PsL psL) {
        AtomicReference atomicReference = this.A00;
        Object obj = atomicReference.get();
        if (obj != null) {
            return obj;
        }
        Object ALD = psL.ALD();
        if (1FH.A00((Object) null, ALD, atomicReference)) {
            return ALD;
        }
        Object obj2 = atomicReference.get();
        obj2.getClass();
        return obj2;
    }
}
