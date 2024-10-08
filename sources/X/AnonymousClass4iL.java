package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.guava.ser.CacheSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.collect.Range;

/* renamed from: X.4iL  reason: invalid class name */
public class AnonymousClass4iL implements C269734fb {
    /* JADX WARNING: type inference failed for: r0v27, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    public JsonSerializer AVR(C268894eF r5, C269294et r6, C269134ed r7) {
        if (!(this instanceof AnonymousClass4iK)) {
            return null;
        }
        Class cls = r5.A00;
        if (C11031S6j.class.isAssignableFrom(cls)) {
            return new Object();
        }
        Class<Range> cls2 = Range.class;
        if (cls2.isAssignableFrom(cls)) {
            return new RangeSerializer(AnonymousClass4iK.A00(r5, cls2), (JsonSerializer) null, SMm.A00);
        }
        Class<C22532Y8d> cls3 = C22532Y8d.class;
        if (cls3.isAssignableFrom(cls)) {
            return new TableSerializer(AnonymousClass4iK.A00(r5, cls3));
        }
        if (C12836T9i.class.isAssignableFrom(cls) || C11359SOv.class.isAssignableFrom(cls) || C10845Rz5.class.isAssignableFrom(cls) || C367658rM.class.isAssignableFrom(cls) || 2RT.class.isAssignableFrom(cls)) {
            return ToStringSerializer.A00;
        }
        if (PzX.class.isAssignableFrom(cls)) {
            return new StdDelegatingSerializer(AnonymousClass4iK.A00(r5, Iterable.class), (JsonSerializer) null, Suh.A00);
        }
        if (C367968rr.class.isAssignableFrom(cls)) {
            return new CacheSerializer();
        }
        return null;
    }
}
