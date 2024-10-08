package X;

import com.meta.compose.component.swipeable.SwipeableState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.IkN  reason: case insensitive filesystem */
public final class C58030IkN implements 02o {
    public final /* synthetic */ float A00;
    public final /* synthetic */ SwipeableState A01;

    public C58030IkN(SwipeableState swipeableState, float f) {
        this.A01 = swipeableState;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r23) {
        List A1I;
        Object A002;
        Map map = (Map) obj;
        SwipeableState swipeableState = this.A01;
        Float A003 = C55213He4.A00(swipeableState.A07.getValue(), map);
        0qQ.A0A(A003);
        float floatValue = A003.floatValue();
        float A02 = C51971G9r.A02(swipeableState.A09);
        Set keySet = map.keySet();
        0sL r6 = (0sL) swipeableState.A0C.getValue();
        float f = this.A00;
        float A022 = C51971G9r.A02(swipeableState.A0D);
        float f2 = floatValue;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            if (((double) AnonymousClass7TE.A04(next)) <= ((double) A02) + 0.001d) {
                A1C.add(next);
            }
        }
        Float A07 = 00k.A07(A1C);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : keySet) {
            if (((double) AnonymousClass7TE.A04(next2)) >= ((double) A02) - 0.001d) {
                A1C2.add(next2);
            }
        }
        Float A08 = 00k.A08(A1C2);
        if (A07 == null) {
            A1I = 0sr.A1N(A08);
        } else if (A08 == null || 0qQ.A0J(A07, A08)) {
            A1I = AnonymousClass7TE.A1I(A07);
        } else {
            A1I = 0sr.A1P(new Float[]{A07, A08});
        }
        int size = A1I.size();
        if (size != 0) {
            if (size != 1) {
                float A004 = AnonymousClass7TG.A00(A1I, 0);
                f2 = AnonymousClass7TG.A00(A1I, 1);
                if (floatValue > A02 ? f <= (-A022) || A02 <= AnonymousClass7TE.A04(r6.invoke(Float.valueOf(f2), Float.valueOf(A004))) : f < A022 && A02 < AnonymousClass7TE.A04(r6.invoke(Float.valueOf(A004), Float.valueOf(f2)))) {
                    f2 = A004;
                }
            } else {
                f2 = AnonymousClass7TG.A00(A1I, 0);
            }
        }
        Object obj2 = map.get(C51965G9l.A0q(f2));
        AnonymousClass4D7 r5 = r23;
        if (obj2 == null || !C51971G9r.A1a(obj2, swipeableState.A0E)) {
            A002 = SwipeableState.A00(swipeableState.A02, swipeableState, r5, floatValue);
        } else {
            A002 = AnonymousClass7TG.A0i(r5, swipeableState.A0F, new C58034IkS(10, swipeableState.A02, swipeableState, obj2));
        }
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }
}
