package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.4hx  reason: invalid class name and case insensitive filesystem */
public final class C271134hx extends C255543uJ {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C271134hx) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (0qQ.A0K(BsV(), serialDescriptor.BsV()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C255543uJ) obj).A06.getValue()) && B0a() == serialDescriptor.B0a()) {
                int B0a = B0a();
                int i = 0;
                while (i < B0a) {
                    if (0qQ.A0K(B0R(i).BsV(), serialDescriptor.B0R(i).BsV()) && 0qQ.A0K(B0R(i).BKK(), serialDescriptor.B0R(i).BKK())) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
