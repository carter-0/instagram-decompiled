package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class IXC implements JQJ {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C324356z9 A02;
    public final JPW A03;
    public final List A04;
    public final List A05;
    public final Map A06;

    private final void A00(boolean z, boolean z2) {
        String str = null;
        try {
            C324356z9 r5 = this.A02;
            if (!z) {
                str = r5.A03.A07;
            }
            UserSession userSession = this.A01;
            C54665HMw[] values = C54665HMw.values();
            0qQ.A0B(values, 0);
            ArrayList A1D = AnonymousClass7TE.A1D(new 0sv(values, false));
            A1D.remove(C54665HMw.SAVED_ENTRYPOINT_COLLECTION);
            r5.A03(C56641I5w.A01(userSession, str, A1D, this.A06), new C54380HAv(this, 0, z2, z));
        } catch (IOException unused) {
            this.A03.DFE(z);
        }
    }

    public final void AAU(SavedCollection savedCollection) {
    }

    public final void EDU(String str) {
    }

    public final void A01() {
        if (this.A02.A06()) {
            A00(false, true);
        }
    }

    public final void A02(boolean z, boolean z2) {
        C57096IOk A002 = C55124HcX.A00(this.A01);
        if (!A002.A07() || !z) {
            A00(true, z2);
        } else {
            this.A03.DFO(A002.A02(this.A04, this.A05), true);
        }
    }

    public final void EB9(C62320sa r3) {
        if (this.A02.A03.A03 != AnonymousClass05K.A00) {
            A00(true, true);
        }
    }

    public IXC(Context context, AnonymousClass07i r3, AnonymousClass0iw r4, UserSession userSession, JPW jpw, List list, List list2, Map map) {
        C51974G9v.A1L(context, userSession, jpw);
        AnonymousClass7TF.A1F(list, 5, list2);
        this.A01 = userSession;
        this.A03 = jpw;
        this.A04 = list;
        this.A06 = map;
        this.A05 = list2;
        this.A00 = r4;
        this.A02 = new C324356z9(context, r3, userSession);
    }
}
