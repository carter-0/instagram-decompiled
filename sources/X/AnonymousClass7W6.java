package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.7W6  reason: invalid class name */
public final class AnonymousClass7W6 implements 27S {
    public final /* synthetic */ C332677Vy A00;

    public AnonymousClass7W6(C332677Vy r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        27U r3 = (27U) obj;
        0qQ.A0B(r3, 0);
        AnonymousClass7S7 C6l = ((C333517Zg) this.A00.A0W.get()).C6l();
        if (!C6l.CdE() || C6l.CUO() || !C6l.C6O().contains(r3.A00.getId())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1382960711);
        int A032 = AnonymousClass0fD.A03(-1429681485);
        C332677Vy r1 = this.A00;
        DirectThreadKey A002 = C332677Vy.A00(r1);
        if (r1.A0Q.A00) {
            C332677Vy.A01(r1);
        } else if (A002 != null) {
            AnonymousClass1Nd.A00(r1.A0J).A00(new 2Kb(A002, AnonymousClass05K.A0L, (List) null, (List) null, (List) null, false));
        }
        AnonymousClass0fD.A0A(-259087201, A032);
        AnonymousClass0fD.A0A(1713085716, A03);
    }
}
