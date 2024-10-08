package X;

import android.util.LongSparseArray;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.systrace.Systrace;
import java.util.Map;

public final class OKD {
    public final LongSparseArray A00 = new LongSparseArray();
    public final Map A01;

    public OKD(Map map) {
        0qQ.A0B(map, 1);
        this.A01 = map;
    }

    public final Object A00(2LV r6) {
        long j;
        Object obj;
        if (Systrace.A0E(32)) {
            0fh.A01(002.A0R(r6.BTf().getSimpleName(), ".getTypeId"), -545611888);
            try {
                j = r6.CAr();
            } finally {
                0fh.A00(995584626);
            }
        } else {
            j = r6.CAr();
        }
        LongSparseArray longSparseArray = this.A00;
        synchronized (longSparseArray) {
            obj = longSparseArray.get(j);
        }
        if (obj != null) {
            C69727NrB.A00(r6, obj);
            return obj;
        }
        McfReference mcfReference = (McfReference) this.A01.get(Long.valueOf(j));
        if (mcfReference == null) {
            return null;
        }
        Object AJq = r6.AJq(mcfReference);
        0qQ.A07(AJq);
        C69727NrB.A00(r6, AJq);
        synchronized (longSparseArray) {
            longSparseArray.put(j, AJq);
        }
        return AJq;
    }
}
