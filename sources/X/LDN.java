package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class LDN {
    public C64164LRf A00;
    public final UserSession A01;
    public final C262224Cq A02;
    public final VLB A03;

    public LDN(VLB vlb, UserSession userSession, C262224Cq r4) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = vlb;
        this.A02 = r4;
    }

    public final Object A00(Context context, String str, AnonymousClass4D7 r11, boolean z) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r6 = new 1IW(1, 1Ey.A02(r11));
        r6.A0I();
        C64164LRf lRf = this.A00;
        if (lRf == null) {
            lRf = new C64164LRf(context, (LGB) null, new C61042Jvg(3, 0, false), this.A02);
            this.A00 = lRf;
        }
        C64351LaT laT = new C64351LaT(r6);
        if (lRf == null) {
            0qQ.A0F("avatarRichMediaViewerProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession = this.A01;
        0qQ.A0B(str, 1);
        lRf.A07 = userSession;
        C63923LDe lDe = new C63923LDe(lRf.A0B, new C64352LaU(lRf), userSession, lRf.A0H);
        lDe.A00 = str;
        lDe.A00(laT);
        if (!z) {
            r6.resumeWith(true);
        }
        return r6.A0E();
    }
}
