package X;

import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6S7  reason: invalid class name */
public abstract class AnonymousClass6S7 {
    public static AnonymousClass6SE A00(C307786Rm r11, AnonymousClass6S3 r12, AnonymousClass6SE r13, Map map) {
        C307556Qo r0;
        C307436Qc r10 = C307436Qc.A00;
        C307786Rm r5 = r11;
        if (r11 == null) {
            r0 = null;
        } else {
            r0 = (C307556Qo) r11.A01.get(R.id.bk_context_key_performance_logger);
        }
        int andIncrement = AnonymousClass6S8.A00.getAndIncrement();
        if (r0 != null) {
            r0.AT5(4, andIncrement);
            r0.AT0(4, andIncrement, "instance", andIncrement);
        }
        1KZ.A01("Bloks Bind");
        AnonymousClass6SE A00 = AnonymousClass6S9.A00(r5, r12.A00.A06(map), r13, r12.A01, r11.A02.AgE().AgJ(), r10);
        C276614tc.A00.incrementAndGet();
        1KZ.A00();
        if (r0 != null) {
            r0.AT4(4, andIncrement);
        }
        return A00;
    }
}
