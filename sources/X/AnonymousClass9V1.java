package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9V1  reason: invalid class name */
public abstract class AnonymousClass9V1 implements C337287g2 {
    public final C337287g2 A00;
    public final C337287g2 A01;

    public abstract ArrayList A00(List list);

    public final /* synthetic */ void A9x(C15050ULg uLg, String str, List list) {
        A9z(uLg.A01, (String) null, list);
    }

    public final void A9y(AnonymousClass9P5 r2, String str) {
        0qQ.A0B(str, 0);
        this.A00.A9y(r2, str);
    }

    public final void A9z(String str, String str2, List list) {
        boolean A1U = AnonymousClass7TF.A1U(0, str, list);
        A9y(new AnonymousClass9P5(AnonymousClass05K.A0C, (Integer) null, (Object) null, (String) null, (String) null, (String) null, list, (List) null, false, false, A1U), str);
    }

    public final AnonymousClass9P5 BiX(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass9P5 BiX = this.A00.BiX(str);
        if (BiX.A01 == AnonymousClass05K.A0C) {
            return BiX;
        }
        List list = this.A01.BiX(str).A06;
        if (list != null) {
            ArrayList A002 = A00(list);
            if (!A002.isEmpty()) {
                return new AnonymousClass9P5(AnonymousClass05K.A01, (Integer) null, (Object) null, (String) null, (String) null, (String) null, A002, (List) null, false, false, true);
            }
        }
        return AnonymousClass9PC.A00();
    }

    public final /* synthetic */ void A9v(C15050ULg uLg, AnonymousClass9P5 r3) {
        A9y(r3, uLg.A01);
    }

    public final /* synthetic */ AnonymousClass9P5 BiW(C15050ULg uLg) {
        return BiX(uLg.A01);
    }

    public final void clear() {
        this.A00.clear();
    }

    public AnonymousClass9V1(C337287g2 r1, C337287g2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
