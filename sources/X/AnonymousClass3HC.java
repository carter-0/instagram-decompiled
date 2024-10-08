package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3HC  reason: invalid class name */
public final class AnonymousClass3HC extends 0ng {
    public final /* synthetic */ 0rJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HC(0rJ r4) {
        super(407, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        if (C61970qY.A0F(context)) {
            Iterator it = new ArrayList(this.A00.A04.values()).iterator();
            while (it.hasNext()) {
                ((0px) it.next()).A08();
            }
        }
    }
}
