package X;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ONq  reason: case insensitive filesystem */
public abstract class C70839ONq {
    public final ConcurrentHashMap objects = new ConcurrentHashMap();

    public Object getAdaptedObject(int i, C62320sa r6) {
        0qQ.A0B(r6, 1);
        ConcurrentHashMap concurrentHashMap = this.objects;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            Object adaptedObject = toAdaptedObject(r6.invoke());
            0qQ.A0A(adaptedObject);
            OV2 ov2 = new OV2(adaptedObject);
            obj = concurrentHashMap.putIfAbsent(valueOf, ov2);
            if (obj == null) {
                obj = ov2;
            }
        }
        Object obj2 = ((OV2) obj).A00;
        if (obj2 != null) {
            return obj2;
        }
        throw new NoSuchElementException();
    }

    public Object getNullableAdaptedObject(int i, C62320sa r6) {
        OV2 ov2;
        0qQ.A0B(r6, 1);
        ConcurrentHashMap concurrentHashMap = this.objects;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            Object nullableAdaptedObject = toNullableAdaptedObject(r6.invoke());
            if (nullableAdaptedObject == null) {
                ov2 = OV2.A01;
            } else {
                ov2 = new OV2(nullableAdaptedObject);
            }
            obj = concurrentHashMap.putIfAbsent(valueOf, ov2);
            if (obj == null) {
                obj = ov2;
            }
        }
        return ((OV2) obj).A00;
    }

    public abstract Object toAdaptedObject(Object obj);

    public abstract Object toNullableAdaptedObject(Object obj);
}
