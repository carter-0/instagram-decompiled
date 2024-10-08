package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.VFb  reason: case insensitive filesystem */
public abstract class C17027VFb {
    /* JADX WARNING: type inference failed for: r1v3, types: [X.A5d, java.lang.Object] */
    public static C39687A5d parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (TraceFieldType.StartTime.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else {
                    num2 = C41847B3o.A13(r4, num2, A17, "end_time");
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 == null) {
                return obj;
            }
            obj.A00 = num2.intValue();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
