package X;

import androidx.compose.ui.Modifier;
import java.util.List;

public final class JJX extends 0Yg implements 0sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ 0sL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJX(List list, 0sL r3, float f) {
        super(4);
        this.A01 = list;
        this.A00 = f;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0M = AnonymousClass7TE.A0M(obj2);
        C286575Wy r4 = (C286575Wy) obj3;
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        if ((A0M2 & 6) == 0) {
            i = G9t.A0O(r4, obj) | A0M2;
        } else {
            i = A0M2;
        }
        if ((A0M2 & 48) == 0) {
            i |= G9t.A06(r4, A0M);
        }
        if ((i & 147) != 146 || !r4.Bwn()) {
            if (0fL.A02()) {
                C51965G9l.A17(713035017);
            }
            r4.ExS(-863809012);
            I6K.A03(r4, (Modifier) null, (C59478JLc) this.A01.get(A0M), this.A02, this.A00, ((i & 14) << 3) & 896, 1);
            if (C51970G9q.A1Z(r4)) {
                0fL.A00(-902241588);
            }
        } else {
            r4.Evl();
        }
        return C60340gF.A00;
    }
}
