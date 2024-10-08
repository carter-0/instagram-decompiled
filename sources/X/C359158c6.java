package X;

import java.util.Arrays;
import kotlin.Deprecated;

/* renamed from: X.8c6  reason: invalid class name and case insensitive filesystem */
public abstract class C359158c6 {
    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    public static final void A00(C3498081w[] r1, boolean z) {
        A01((C3498081w[]) Arrays.copyOf(r1, 1), z, false);
    }

    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    public static final void A01(C3498081w[] r3, boolean z, boolean z2) {
        0qQ.A0B(r3, 2);
        for (C3498081w r0 : r3) {
            if (r0 != null) {
                r0.Eql(z, z2);
            }
        }
    }
}
