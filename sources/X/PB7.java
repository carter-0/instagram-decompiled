package X;

import android.widget.FrameLayout;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class PB7 implements AnonymousClass7DY {
    public final /* synthetic */ C332767Wh A00;

    public PB7(C332767Wh r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        C328667Fr r6 = (C328667Fr) obj2;
        if (r6 != null) {
            DirectMessageIdentifier directMessageIdentifier = r6.A0L;
            String str = directMessageIdentifier.A01;
            String str2 = r6.A0Y;
            if (str2 == null && (str2 = r6.A0T) == null) {
                2FW Aqm = r6.Aqm();
                if (Aqm != null) {
                    str2 = Aqm.toString();
                } else {
                    return;
                }
            }
            if (str2 != null) {
                C66582MXn.A1J(r6, this.A00, directMessageIdentifier, str, str2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
        FrameLayout frameLayout;
        C3257073v r3 = (C3257073v) obj;
        if (r3 != null && (frameLayout = r3.A0A) != null) {
            C66581MXm.A1A(frameLayout, 330);
        }
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
    }
}
