package X;

import java.io.IOException;

/* renamed from: X.Cdk  reason: case insensitive filesystem */
public abstract class C44364Cdk {
    public static BGU parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("end_time_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else {
                    num2 = C41847B3o.A13(r7, num2, A17, "start_time_ms");
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("end_time_ms", r7, "SoundSyncTrimTimeRangeImpl");
            } else if (num2 != null || !(r7 instanceof 0c9)) {
                return new BGU(num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("start_time_ms", r7, "SoundSyncTrimTimeRangeImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
