package X;

import android.content.Context;
import java.util.List;

public final class XM0 extends XLw implements YCK {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C21390XZx ASh() {
        C21390XZx BHE = this.A00.BHE();
        BHE.A00.add(this.A00);
        BHE.A01.add(this);
        return BHE;
    }

    public final void ATZ(Object obj) {
        C21390XZx xZx = (C21390XZx) obj;
        List list = xZx.A01;
        17k.A0F(AnonymousClass7TE.A1b(list));
        list.remove(list.size() - 1);
        List list2 = xZx.A00;
        17k.A0F(AnonymousClass7TE.A1b(list2));
        list2.remove(list2.size() - 1);
    }

    public XM0(Context context, C22224Xxe xxe) {
        super(xxe);
        this.A00 = context;
    }
}
