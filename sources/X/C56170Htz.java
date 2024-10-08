package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Htz  reason: case insensitive filesystem */
public abstract class C56170Htz {
    public static final ArrayList A00(C268014cc r5) {
        List A0K;
        0qQ.A0C(r5, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        AnonymousClass5R6 BLv = ((C267994ca) r5).BLv();
        boolean A01 = A01(BLv);
        List A0G = BLv.A0G();
        ArrayList A0m = C51970G9q.A0m(A0G);
        int size = A0G.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass5R6 r0 = (AnonymousClass5R6) A0G.get(i);
            if (A01) {
                A0K = r0.A0E();
            } else {
                A0K = r0.A0U.A0J.A0K();
            }
            A0m.add(A0K);
        }
        return A0m;
    }

    public static final boolean A01(AnonymousClass5R6 r3) {
        int intValue = r3.A0U.A06.intValue();
        if (intValue == 1 || intValue == 3) {
            return true;
        }
        if (intValue == 0 || intValue == 2) {
            return false;
        }
        if (intValue == 4) {
            AnonymousClass5R6 A0B = r3.A0B();
            if (A0B != null) {
                return A01(A0B);
            }
            throw AnonymousClass7TE.A0w("no parent for idle node");
        }
        throw AnonymousClass7TE.A1K();
    }
}
