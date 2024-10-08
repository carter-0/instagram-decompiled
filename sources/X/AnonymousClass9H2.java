package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.9H2  reason: invalid class name */
public abstract class AnonymousClass9H2 {
    public static final AnonymousClass9H7 A00(Bundle bundle, AnonymousClass4DH r15, UserSession userSession, boolean z) {
        Integer num;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        0fh.A01("DirectThreadToggleController.create", 1598024782);
        Bundle bundle2 = bundle;
        try {
            Capabilities capabilities = (Capabilities) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (capabilities != null) {
                int i = bundle.getInt("DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION", -1);
                if (i == -1) {
                    num = null;
                } else {
                    num = Integer.valueOf(i);
                }
                18g A01 = C638918c.A01(C61170le.A00);
                AnonymousClass9H3 r13 = new AnonymousClass9H3(A01);
                A01.A0R(r13);
                AnonymousClass4DH r7 = r15;
                AnonymousClass9H5 r14 = new AnonymousClass9H5(r15, new 0xG("direct_thread_toggle"), userSession2);
                boolean z2 = z;
                return new AnonymousClass9H7(bundle2, r7, r7, userSession2, r7, capabilities, new AnonymousClass9H6(r7, userSession2, capabilities, num, z2), r13, r14, z2);
            }
            String string = bundle.getString("DirectFragment.ENTRY_POINT", "not_in_arguments");
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (String append : bundle.keySet()) {
                sb.append(append);
                sb.append(", ");
            }
            sb.append("]");
            String format = String.format(Locale.US, "Starting thread with no capabilities.  DeepLinkingEntryPoint: %s, Found %d keys: %s.", Arrays.copyOf(new Object[]{string, Integer.valueOf(bundle.size()), sb.toString()}, 3));
            0qQ.A07(format);
            throw new IllegalStateException(format);
        } finally {
            0fh.A00(2020206641);
        }
    }
}
