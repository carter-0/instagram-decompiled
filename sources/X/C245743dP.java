package X;

import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.3dP  reason: invalid class name and case insensitive filesystem */
public final class C245743dP {
    public C232612u4 A00;
    public C245753dQ A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final 01c A05 = new 01c(10);
    public final 2UL A06;
    public final C249753kJ A07;
    public final List A08 = new ArrayList();
    public final Set A09 = new HashSet();

    @Deprecated(message = "Only used for Litho's integration. Marked for removal.")
    public final void A07(C251323mv r7) {
        C251323mv r2;
        List list = this.A08;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = null;
                break;
            }
            r2 = ((C245753dQ) it.next()).A01;
            if (r2 == r7) {
                it.remove();
                break;
            }
        }
        if (r2 instanceof 2VZ) {
            this.A06.A00 = null;
            this.A01 = null;
        }
        if (r2 == null) {
            throw new IllegalStateException(new C13348TVv(r7, 46).toString());
        } else if (r2 instanceof C245643dF) {
            int i = 0;
            this.A03 = false;
            int size = list.size();
            while (i < size) {
                if (((C245753dQ) list.get(i)).A01 instanceof C245643dF) {
                    this.A03 = true;
                }
                if (!this.A03) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void A00(C245743dP r2, long j) {
        int intValue;
        if (r2.A03) {
            01c r22 = r2.A05;
            Number number = (Number) r22.A05(j);
            if (number == null || (intValue = number.intValue()) == 0) {
                throw new IllegalStateException("Trying to decrement reference count for an item you don't own.");
            }
            r22.A09(j, Integer.valueOf(intValue - 1));
        }
    }

    public static final void A01(C245743dP r1, long j) {
        if (r1.A03) {
            01c r12 = r1.A05;
            Number number = (Number) r12.A05(j);
            if (number == null) {
                number = 0;
            }
            r12.A09(j, Integer.valueOf(number.intValue() + 1));
        }
    }

    public final void A02() {
        if (this.A02) {
            int i = this.A04 - 1;
            this.A04 = i;
            if (i < 0) {
                throw new RuntimeException("notifyVisibleBoundsChangedNestCount should not be decremented below zero!");
            } else if (i == 0) {
                Set<Object> set = this.A09;
                for (Object A032 : set) {
                    C245863db.A03(this.A07, A032);
                }
                set.clear();
            }
        }
    }

    public final void A03() {
        if (this.A02) {
            this.A04++;
        }
    }

    public final boolean A08() {
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C245753dQ) list.get(i)).A01 instanceof C245643dF) {
                Object obj = list.get(i);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C245793dU r2 = (C245793dU) ((C245753dQ) obj).A02;
                2T4 r0 = r2.A02;
                if (r0 != null) {
                    int size2 = r0.A0W.size();
                    if (r2.A00 > 0 || r2.A01 < size2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public C245743dP(2UL r3, C249753kJ r4) {
        this.A06 = r3;
        this.A07 = r4;
    }

    public final void A04() {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C245753dQ r1 = (C245753dQ) list.get(i);
            r1.A01.A0D(r1);
        }
        A02();
    }

    public final void A05(Rect rect) {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
            C245753dQ r2 = (C245753dQ) obj;
            C251323mv r1 = r2.A01;
            if (r1 instanceof C245653dG) {
                ((C245653dG) r1).Dzc(rect, r2);
            }
        }
        A02();
    }

    public final void A06(RenderTreeNode renderTreeNode, C249753kJ r14, Object obj, boolean z) {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
            C245753dQ r8 = (C245753dQ) obj2;
            C251323mv r6 = r8.A01;
            if (r6 instanceof C251333mw) {
                boolean isTracing = r14.isTracing();
                if (isTracing) {
                    r14.ADG(002.A0R("Extension:onBoundsAppliedToItem ", r6.A09()));
                }
                ((C251333mw) r6).Cz0(renderTreeNode.A06, r8, obj, renderTreeNode.A07, z);
                if (isTracing) {
                    r14.ASS();
                }
            }
        }
        A02();
    }
}
