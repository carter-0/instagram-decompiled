package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.8HP  reason: invalid class name */
public final class AnonymousClass8HP implements C62320sa {
    public final /* synthetic */ AnonymousClass8HG A00;

    public AnonymousClass8HP(AnonymousClass8HG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass8HG r5 = this.A00;
        Context context = r5.A0D;
        C387669ma r2 = new C387669ma(context, r5.A06, r5, r5.A0I, true);
        ArrayList A01 = ABO.A01(context, r5.A0F);
        boolean isEmpty = A01.isEmpty();
        List list = A01;
        if (isEmpty) {
            List asList = Arrays.asList(AnonymousClass8HJ.values());
            asList.remove(AnonymousClass8HJ.NONE);
            list = asList;
        }
        r2.A04(list);
        return r2;
    }
}
