package X;

import java.util.Iterator;
import java.util.Map;

public final class R1L extends AnonymousClass5GD {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R1L(Iterator it, int i) {
        super(it);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object A00(Object obj) {
        switch (this.A00) {
            case 0:
                return ((Map.Entry) obj).getKey();
            case 1:
                return ((Map.Entry) obj).getValue();
            default:
                return ((S79) obj).A01();
        }
    }
}
