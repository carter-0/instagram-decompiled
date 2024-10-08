package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashCodeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.InternetDomainNameDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.io.Serializable;

/* renamed from: X.4iH  reason: invalid class name */
public final class AnonymousClass4iH extends AnonymousClass4iI implements Serializable {
    public static void A00(Qlt qlt, String str) {
        Class cls = qlt.A00.A00;
        if (!Comparable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(002.A11("Can not handle ", str, " with elements that are not Comparable<?> (", cls.getName(), ")"));
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    public final JsonDeserializer AVC(C269454f9 r4, C268894eF r5, C269134ed r6) {
        Class<C11031S6j> cls = C11031S6j.class;
        Class<2RT> cls2 = r5.A00;
        if (cls2 == cls) {
            return new Object();
        }
        if (cls2 == Range.class) {
            return new RangeDeserializer(r5, (JsonDeserializer) null, SMm.A00, (BoundType) null);
        }
        if (cls2 == C12836T9i.class) {
            return HostAndPortDeserializer.A00;
        }
        if (cls2 == C11359SOv.class) {
            return InternetDomainNameDeserializer.A00;
        }
        if (cls2 == 2RT.class) {
            return HashCodeDeserializer.A00;
        }
        return null;
    }
}
