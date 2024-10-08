package X;

import com.facebook.rsys.state.gen.State;

/* renamed from: X.OqK  reason: case insensitive filesystem */
public final class C71758OqK implements C74560Px9 {
    public int A00;
    public final C73540PeW A01;

    public final void CNt(N4A n4a) {
        State A002;
        int i;
        0sP r1;
        Object obj;
        0qQ.A0B(n4a, 0);
        C69662Npk npk = n4a.A00;
        if (npk != null && (A002 = C69726Nr9.A00(npk)) != null && (i = A002.callState) != this.A00) {
            if (i != 0) {
                if (i == 4) {
                    r1 = this.A01.A00;
                    obj = C70912ORh.A00;
                }
                this.A00 = i;
            }
            r1 = this.A01.A00;
            obj = C70913ORi.A00;
            r1.invoke(obj);
            this.A00 = i;
        }
    }

    public C71758OqK(C73540PeW peW) {
        this.A01 = peW;
    }
}
