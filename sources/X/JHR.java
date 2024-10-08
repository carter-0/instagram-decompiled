package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1;
import com.meta.compose.component.swipeable.SwipeableState;
import java.util.Map;

public final class JHR extends 0Yg implements 0sK {
    public final /* synthetic */ AnonymousClass6Gj A00;
    public final /* synthetic */ C287605aT A01;
    public final /* synthetic */ C56059Hs8 A02;
    public final /* synthetic */ SwipeableState A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sL A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHR(AnonymousClass6Gj r2, C287605aT r3, C56059Hs8 hs8, SwipeableState swipeableState, Map map, 0sP r7, 0sL r8, 0sL r9, boolean z) {
        super(3);
        this.A04 = map;
        this.A03 = swipeableState;
        this.A02 = hs8;
        this.A07 = r8;
        this.A00 = r2;
        this.A08 = z;
        this.A01 = r3;
        this.A05 = r7;
        this.A06 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy A0R = C51966G9m.A0R(obj2, obj3);
        if (C51967G9n.A1U(A0R, -1201063724)) {
            0fL.A01(501583043, "com.meta.compose.component.swipeable.swipeable.<anonymous> (Swipeable.kt:546)");
        }
        Map map = this.A04;
        if (!(!map.isEmpty())) {
            throw AnonymousClass7TE.A0w("You must have at least one anchor.");
        } else if (00k.A0W(map.values()).size() == map.size()) {
            C268024cd A0a = C51970G9q.A0a(A0R);
            SwipeableState swipeableState = this.A03;
            if (((Map) swipeableState.A05.getValue()).isEmpty()) {
                Float A002 = C55213He4.A00(swipeableState.A07.getValue(), map);
                if (A002 != null) {
                    swipeableState.A09.Epw(A002);
                    swipeableState.A04.Epw(A002);
                } else {
                    throw AnonymousClass7TE.A0w("The initial value must have an associated anchor.");
                }
            }
            boolean A1Y = G9t.A1Y(A0R, swipeableState, map, 1768951867);
            C56059Hs8 hs8 = this.A02;
            boolean A1Z = C51965G9l.A1Z(A0R, hs8, A1Y);
            0sL r9 = this.A07;
            boolean A1S = C51966G9m.A1S(A0R, 125.0f, C51972G9s.A1X(A0R, r9, A0a, A1Z));
            Object ECw = A0R.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new SwipeableKt$swipeable$5$3$1(A0a, hs8, swipeableState, map, (AnonymousClass4D7) null, r9, 125.0f);
                A0R.FLL(ECw);
            }
            C286565Wx A0G = C51965G9l.A0G(A0R);
            C286645Xf.A02(A0R, map, swipeableState, (0sL) ECw);
            C285245Qk r2 = Modifier.A00;
            boolean A1W = C51971G9r.A1W(swipeableState.A08);
            JNP jnp = swipeableState.A03;
            AnonymousClass6Gj r8 = this.A00;
            boolean z = this.A08;
            C287605aT r92 = this.A01;
            A0R.ExS(1768976817);
            0sP r3 = this.A05;
            boolean AGu = A0R.AGu(r3);
            Object ECw2 = A0R.ECw();
            if (AGu || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58110ImZ(r3, (AnonymousClass4D7) null, 2);
                A0R.FLL(ECw2);
            }
            0sK r10 = (0sK) ECw2;
            C286565Wx.A0I(A0G);
            A0R.ExS(1768978911);
            0sL r32 = this.A06;
            boolean AGw = A0R.AGw(r32);
            Object ECw3 = A0R.ECw();
            if (AGw || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new MHZ(r32, (AnonymousClass4D7) null, 3);
                A0R.FLL(ECw3);
            }
            C286565Wx.A0I(A0G);
            0sK r0 = GQV.A00;
            Modifier Ezh = r2.Ezh(new DraggableElement(jnp, r8, r92, r10, (0sK) ECw3, z, A1W));
            if (0fL.A02()) {
                0fL.A00(1257141676);
            }
            C286565Wx.A0I(A0G);
            return Ezh;
        } else {
            throw AnonymousClass7TE.A0w("You cannot have two anchors mapped to the same state.");
        }
    }
}
