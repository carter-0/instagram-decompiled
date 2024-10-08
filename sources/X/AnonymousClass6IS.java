package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import java.util.List;

/* renamed from: X.6IS  reason: invalid class name */
public final class AnonymousClass6IS extends DragGestureNode implements AnonymousClass5WC, C267954cW, AnonymousClass5VG, C267824cH, C268824e3 {
    public C305386Hs A00;
    public AnonymousClass6HS A01;
    public C305526Ik A02;
    public 0sL A03;
    public 0sL A04;
    public final AnonymousClass6IZ A05;
    public final AnonymousClass6IU A06;
    public final C305036Gf A07;
    public final ScrollableNestedScrollConnection A08;
    public final ScrollingLogic A09;
    public final NestedScrollDispatcher A0A;

    public final void A0E() {
        AnonymousClass6GW.A00(this, new AnonymousClass9L8(this, 7));
        this.A02 = C305516Ij.A00;
    }

    public final void AC1(AnonymousClass5Wa r2) {
        r2.EQj(false);
    }

    public final boolean DMm(KeyEvent keyEvent) {
        long A002;
        if (!this.A03) {
            return false;
        }
        if (((((long) keyEvent.getKeyCode()) << 32) != AE0.A0A && (((long) keyEvent.getKeyCode()) << 32) != AE0.A0B) || HRR.A00(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z = false;
        if (this.A09.A03 == AnonymousClass6Gj.Vertical) {
            z = true;
        }
        long j = this.A05.A00;
        if (z) {
            int A003 = C289005cr.A00(j);
            boolean z2 = false;
            if ((((long) keyEvent.getKeyCode()) << 32) == AE0.A0B) {
                z2 = true;
            }
            float f = (float) A003;
            if (!z2) {
                f = -f;
            }
            A002 = C289325dP.A00(0.0f, f);
        } else {
            int i = (int) (j >> 32);
            boolean z3 = false;
            if ((((long) keyEvent.getKeyCode()) << 32) == AE0.A0B) {
                z3 = true;
            }
            float f2 = (float) i;
            if (!z3) {
                f2 = -f2;
            }
            A002 = C289325dP.A00(f2, 0.0f);
        }
        C262224Cq A052 = A05();
        1Eo.A05(19B.A00, new MGA((Object) this, (AnonymousClass4D7) null, 0, A002), A052);
        return true;
    }

    public final void DUu() {
        AnonymousClass6GW.A00(this, new AnonymousClass9L8(this, 7));
    }

    public final boolean DYc(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.4cD, X.5zJ, X.4cE] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IS(C305386Hs r8, JS2 js2, AnonymousClass6HS r10, AnonymousClass6Gj r11, C305096Gn r12, C287605aT r13, boolean z, boolean z2) {
        super(r11, r13, ScrollableKt.A03, z);
        AnonymousClass6Gj r3 = r11;
        this.A00 = r8;
        this.A01 = r10;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0A = nestedScrollDispatcher;
        C305036Gf r0 = new C305036Gf(z);
        A0H(r0);
        this.A07 = r0;
        AnonymousClass6IU r02 = new AnonymousClass6IU(new AnonymousClass6HQ(new AnonymousClass6HM(ScrollableKt.A01)), ScrollableKt.A02);
        this.A06 = r02;
        C305386Hs r1 = this.A00;
        AnonymousClass6HS r2 = this.A01;
        ScrollingLogic scrollingLogic = new ScrollingLogic(r1, r2 == null ? r02 : r2, r3, r12, nestedScrollDispatcher, z2);
        this.A09 = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.A08 = scrollableNestedScrollConnection;
        AnonymousClass6IZ r14 = new AnonymousClass6IZ(js2, r11, scrollingLogic, z2);
        A0H(r14);
        this.A05 = r14;
        A0H(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        A0H(new C267794cD());
        ? r03 = new C267794cD();
        r03.A00 = r14;
        A0H(r03);
        A0H(new C305476Ie(new AnonymousClass9L6(this, 10)));
    }

    public final boolean A0G() {
        return false;
    }

    public final void AC5(AnonymousClass5SW r5) {
        if (this.A03 && (this.A03 == null || this.A04 == null)) {
            this.A03 = new AnonymousClass9LZ(this, 0);
            this.A04 = new C376919Jv(this, (AnonymousClass4D7) null);
        }
        0sL r3 = this.A03;
        if (r3 != null) {
            r5.ENH(C290125en.A0J, new C290145ep((String) null, r3));
        }
        0sL r1 = this.A04;
        if (r1 != null) {
            r5.ENH(C290125en.A0K, r1);
        }
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    public final void DXw(C304926Ft r10, GWN gwn, long j) {
        List list = r10.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.A01.invoke(list.get(i))).booleanValue()) {
                super.DXw(r10, gwn, j);
                break;
            }
            i++;
        }
        if (gwn == GWN.Main && r10.A00 == 6) {
            int size2 = list.size();
            int i2 = 0;
            while (i2 < size2) {
                if (!((GPU) list.get(i2)).A02()) {
                    i2++;
                } else {
                    return;
                }
            }
            0qQ.A0A(this.A02);
            C268024cd r8 = AnonymousClass5WH.A02(this).A0C;
            C289295dM r3 = new C289295dM(0);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                r3 = new C289295dM(C289295dM.A07(r3.A00, ((GPU) list.get(i3)).A09));
            }
            long A052 = C289295dM.A05(-r8.F06(64.0f), r3.A00);
            C262224Cq A053 = A05();
            1Eo.A05(19B.A00, new MGA((Object) this, (AnonymousClass4D7) null, 1, A052), A053);
            int size4 = list.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((GPU) list.get(i4)).A01();
            }
        }
    }
}
