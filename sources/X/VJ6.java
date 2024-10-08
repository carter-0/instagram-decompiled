package X;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;

public abstract class VJ6 {
    public static final void A00(SerialDescriptor serialDescriptor, int i, int i2) {
        StringBuilder sb;
        String str;
        ArrayList A0q = AnonymousClass7TF.A0q(serialDescriptor, 2);
        int i3 = (i ^ -1) & i2;
        int i4 = 0;
        do {
            if ((i3 & 1) != 0) {
                A0q.add(serialDescriptor.B0V(i4));
            }
            i3 >>>= 1;
            i4++;
        } while (i4 < 32);
        String BsV = serialDescriptor.BsV();
        0qQ.A0B(BsV, 2);
        if (A0q.size() == 1) {
            sb.append("Field '");
            sb.append((String) A0q.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(BsV);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(A0q);
            sb.append(" are required for type with serial name '");
            sb.append(BsV);
            str = "', but they were missing";
        }
        throw new C2590440e(AnonymousClass7TF.A0l(str, sb), (Throwable) null, A0q);
    }
}
