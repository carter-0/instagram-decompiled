package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.Mgb  reason: case insensitive filesystem */
public abstract class C67003Mgb {
    public static final Long A00(C254743sy r1) {
        MsysThreadId msysThreadId;
        if (r1 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) r1;
        } else if (!(r1 instanceof DirectMsysMixedThreadKey)) {
            return null;
        } else {
            msysThreadId = ((DirectMsysMixedThreadKey) r1).A01;
        }
        return msysThreadId.A02;
    }

    public static final String A01(C254743sy r1) {
        DirectThreadKey directThreadKey;
        if (r1 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) r1;
        } else if (!(r1 instanceof DirectMsysMixedThreadKey)) {
            return null;
        } else {
            directThreadKey = ((DirectMsysMixedThreadKey) r1).A00;
        }
        return directThreadKey.A00;
    }

    public static void A02(0Aj r2, C254743sy r3) {
        r2.AAJ("open_thread_id", A01(r3));
        r2.A9F("occamadillo_thread_id", A00(r3));
    }
}
