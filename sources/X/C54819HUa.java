package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* renamed from: X.HUa  reason: case insensitive filesystem */
public abstract class C54819HUa {
    public static final void A00(C286575Wy r31, Modifier modifier, C62320sa r33, C62320sa r34, 0sL r35, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r12 = r33;
        0qQ.A0B(r12, 0);
        C62320sa r11 = r34;
        0sL r10 = r35;
        AnonymousClass7TF.A1C(r11, 1, r10);
        C286575Wy r1 = r31;
        r1.ExV(98437094);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r1, r12) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r1, r11);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r1, modifier2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r1, r10);
        }
        if ((i3 & 1171) != 1170 || !r1.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(56822932, "com.instagram.barcelona.common.ui.toast.ToastDragDismissSurface (ToastDragDismissSurface.kt:35)");
            }
            C284945Oz A00 = C287175Zh.A00(r1, r12);
            C284945Oz A002 = C287175Zh.A00(r1, r11);
            C268024cd A0Y = C51968G9o.A0Y(r1);
            boolean A1Y = C51967G9n.A1Y(r1, A0Y, -1915759929);
            Object ECw = r1.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new ToastDragDismissState(A00, A002, A0Y);
                r1.FLL(ECw);
            }
            ToastDragDismissState toastDragDismissState = (ToastDragDismissState) ECw;
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            AnonymousClass5aQ.A02(r1);
            AnonymousClass5ZQ r18 = AnonymousClass5ZM.A01;
            long j = AnonymousClass5aQ.A00(r1).A11;
            long A0I = C51966G9m.A0I(r1);
            boolean A1Y2 = C51967G9n.A1Y(r1, toastDragDismissState, -1915749636);
            Object ECw2 = r1.ECw();
            if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C59099J6h.A00(r1, toastDragDismissState, 25);
            }
            Modifier A0D = C51973G9u.A0D(A0H, modifier2, ECw2);
            JNP jnp = toastDragDismissState.A01;
            AnonymousClass6Gj r29 = AnonymousClass6Gj.Horizontal;
            boolean z = !C51971G9r.A1X(toastDragDismissState.A06);
            boolean A1Y3 = C51967G9n.A1Y(r1, toastDragDismissState, -1915733618);
            Object ECw3 = r1.ECw();
            if (A1Y3 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C58109ImY(toastDragDismissState, (AnonymousClass4D7) null, 0);
                r1.FLL(ECw3);
            }
            C286565Wx.A0L(A0H, false);
            0sK r312 = GQV.A00;
            Modifier Ezh = A0D.Ezh(new DraggableElement(jnp, r29, (C287605aT) null, r312, (0sK) ECw3, z, false));
            JNP jnp2 = toastDragDismissState.A02;
            AnonymousClass6Gj r292 = AnonymousClass6Gj.Vertical;
            boolean z2 = !C51971G9r.A1X(toastDragDismissState.A05);
            boolean A1Y4 = C51967G9n.A1Y(r1, toastDragDismissState, -1915724498);
            Object ECw4 = r1.ECw();
            if (A1Y4 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = new C58109ImY(toastDragDismissState, (AnonymousClass4D7) null, 1);
                r1.FLL(ECw4);
            }
            C286565Wx.A0L(A0H, false);
            C304846Fl.A01((C304806Fh) null, r1, Ezh.Ezh(new DraggableElement(jnp2, r292, (C287605aT) null, r312, (0sK) ECw4, z2, false)), r18, AnonymousClass5PI.A01(r1, new C59111J6t(r10, 27), 1393444900), 0.0f, 1572864, 48, j, A0I);
            if (0fL.A02()) {
                0fL.A00(728787993);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r11, r12, modifier2, r10, i5, i4, 8);
        }
    }
}
