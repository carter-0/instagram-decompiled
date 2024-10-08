package X;

import java.util.Map;

public final /* synthetic */ class AYM implements 1DN {
    public final /* synthetic */ AnonymousClass8QG A00;

    public /* synthetic */ AYM(AnonymousClass8QG r1) {
        this.A00 = r1;
    }

    public final void DWm(Map map) {
        AnonymousClass8QG r3 = this.A00;
        Integer num = r3.A00;
        num.getClass();
        if (num.equals(AnonymousClass05K.A00)) {
            String A002 = AnonymousClass000.A00(10);
            if (C346927vz.DENIED_DONT_ASK_AGAIN.equals(map.get(A002))) {
                C59689JTv.A0F(r3.A0A.A05, AnonymousClass000.A00(3908), 2131972530);
            } else if (C346927vz.GRANTED.equals(map.get(A002))) {
                AnonymousClass8QG.A01(r3);
            }
        }
    }
}
