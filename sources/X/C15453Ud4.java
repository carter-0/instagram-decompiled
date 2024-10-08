package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Ud4  reason: case insensitive filesystem */
public final class C15453Ud4 extends C331047Ph {
    public List A00;
    public C15492Udh A01;
    public final E9R A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s0, java.lang.Object, X.Udh] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2s0, X.E9R, java.lang.Object] */
    public C15453Ud4(Context context, X38 x38, G6X g6x, List list) {
        this.A00 = list;
        ? obj = new Object();
        obj.A00 = context;
        obj.A01 = x38;
        this.A01 = obj;
        ? obj2 = new Object();
        obj2.A00 = g6x;
        this.A02 = obj2;
        A0B(obj, obj2);
        A00(this);
    }

    public static void A00(C15453Ud4 ud4) {
        ud4.A06();
        ud4.A08(ud4.A02, (Object) null);
        int i = 0;
        while (true) {
            List list = ud4.A00;
            if (i < list.size()) {
                ud4.A08(ud4.A01, list.get(DbT.A02(list, i) - 1));
                i++;
            } else {
                ud4.A07();
                return;
            }
        }
    }
}
