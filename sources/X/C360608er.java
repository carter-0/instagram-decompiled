package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8er  reason: invalid class name and case insensitive filesystem */
public abstract class C360608er {
    public static final SerialDescriptor[] A00 = new SerialDescriptor[0];

    public static final SerialDescriptor[] A02(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty() || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return A00;
        }
        return serialDescriptorArr;
    }

    public static final Set A00(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof C255553uK) {
            return ((C255553uK) serialDescriptor).BsW();
        }
        HashSet hashSet = new HashSet(serialDescriptor.B0a());
        int B0a = serialDescriptor.B0a();
        for (int i = 0; i < B0a; i++) {
            hashSet.add(serialDescriptor.B0V(i));
        }
        return hashSet;
    }

    public static final void A01(C62230ry r2) {
        String A01 = 0q1.A01(((0Yh) r2).A00);
        if (A01 == null) {
            A01 = "<local class name not available>";
        }
        throw new IllegalArgumentException(002.A0g("Serializer for class '", A01, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
