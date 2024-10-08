package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final /* synthetic */ class PE8 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ PE8(AnonymousClass7Z6 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        List list = this.A01;
        C66665MaY A02 = C66669Mac.A02(r0.A00, oDs, C66231l1.class);
        long A0H = AnonymousClass7TG.A0H();
        0qQ.A0B(list, 5);
        1bp r3 = new 1bp(A02, directThreadKey, l, A0H);
        r3.A00 = list;
        return r3;
    }
}
