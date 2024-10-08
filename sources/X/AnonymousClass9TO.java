package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9TO  reason: invalid class name */
public final class AnonymousClass9TO {
    public final Context A00;
    public final AnonymousClass2NR A01;
    public final AnonymousClass454 A02;
    public final C353648In A03;
    public final 2Nn A04;
    public final C62995Kpl A05;

    public AnonymousClass9TO(Context context, C62995Kpl kpl, AnonymousClass2NR r4, AnonymousClass454 r5, C353648In r6, 2Nn r7) {
        AnonymousClass7TG.A1P(context, r4);
        0qQ.A0B(r7, 7);
        this.A01 = r4;
        this.A03 = r6;
        this.A05 = kpl;
        this.A02 = r5;
        this.A04 = r7;
        this.A00 = context.getApplicationContext();
    }

    public static final A79 A00(List list, int i) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            A79 a79 = (A79) obj;
            int i2 = a79.A01;
            if (i <= a79.A00 + i2 && i2 <= i) {
                break;
            }
        }
        return (A79) obj;
    }
}
