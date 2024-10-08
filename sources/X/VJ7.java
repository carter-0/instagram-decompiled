package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

public abstract class VJ7 {
    public static final int A00(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        0qQ.A0B(serialDescriptorArr, 1);
        int A0O = AnonymousClass7TE.A0O(serialDescriptor.BsV()) + Arrays.hashCode(serialDescriptorArr);
        int B0a = serialDescriptor.B0a();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = B0a;
            if (B0a <= 0) {
                break;
            }
            int i4 = 0;
            B0a--;
            int i5 = i2 * 31;
            String BsV = serialDescriptor.B0R(serialDescriptor.B0a() - i3).BsV();
            if (BsV != null) {
                i4 = BsV.hashCode();
            }
            i2 = i5 + i4;
        }
        int B0a2 = serialDescriptor.B0a();
        while (true) {
            int i6 = B0a2;
            if (B0a2 <= 0) {
                return (((A0O * 31) + i2) * 31) + i;
            }
            B0a2--;
            i = (i * 31) + C51971G9r.A0E(serialDescriptor.B0R(serialDescriptor.B0a() - i6).BKK());
        }
    }
}
