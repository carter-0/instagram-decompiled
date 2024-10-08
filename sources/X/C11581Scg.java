package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Scg  reason: case insensitive filesystem */
public final class C11581Scg implements 1MD {
    public static final C11581Scg A00 = new C11581Scg();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList;
        C250663lr A01;
        QVA A0E;
        QXZ A0E2 = ((C7789QXa) obj).A0E();
        ImmutableList immutableList = null;
        if (!(A0E2 == null || (A0E = A0E2.A0E()) == null)) {
            immutableList = A0E.getRequiredCompactedTreeListField(1, "edges", QV8.class, 1191615373);
        }
        ImmutableList.Builder A0Y = Pxe.A0Y();
        if (immutableList != null) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr A03 = C41845B3m.A0V(it).A03(QV7.class, "node", 1320777752);
                if (!(A03 == null || (A01 = A03.A01(C7793QXe.class, 1278893400)) == null)) {
                    arrayList.add(A01);
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        A0Y.addAll(arrayList);
        return A0Y.build();
    }
}
