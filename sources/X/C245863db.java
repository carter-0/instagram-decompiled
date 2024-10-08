package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3db  reason: invalid class name and case insensitive filesystem */
public abstract class C245863db {
    public static final void A00(C70682Ty r2, 2UL r3) {
        0qQ.A0B(r3, 0);
        C245743dP r1 = r3.A01;
        if (r1 != null) {
            Rect rect = new Rect();
            r2.getLocalVisibleRect(rect);
            r1.A05(rect);
        }
    }

    public static final void A01(2UL r7) {
        0qQ.A0B(r7, 0);
        C245743dP r0 = r7.A01;
        if (r0 != null) {
            List list = r0.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C251323mv r2 = ((C245753dQ) list.get(i)).A01;
                if (r2 instanceof C245643dF) {
                    Object obj = list.get(i);
                    0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                    C245753dQ r1 = (C245753dQ) obj;
                    if (((C245643dF) r2).A00) {
                        ((C245793dU) r1.A02).A03 = false;
                        C245873dc A00 = C245643dF.A00(r1);
                        ((Set) A00.A04.getValue()).remove(r1.A00);
                    }
                }
            }
        }
    }

    public static final void A02(2UL r10, Long l) {
        0qQ.A0B(r10, 0);
        C245743dP r0 = r10.A01;
        if (r0 != null) {
            List list = r0.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C251323mv r2 = ((C245753dQ) list.get(i)).A01;
                if (r2 instanceof C245643dF) {
                    Object obj = list.get(i);
                    0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                    C245753dQ r1 = (C245753dQ) obj;
                    if (((C245643dF) r2).A00) {
                        ((C245793dU) r1.A02).A03 = true;
                        C245873dc A00 = C245643dF.A00(r1);
                        C245743dP r12 = r1.A00;
                        AnonymousClass0eM r102 = A00.A04;
                        ((Set) r102.getValue()).add(r12);
                        if (l != null) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(l.longValue());
                            if (nanos > A00.A00) {
                                A00.A00 = nanos;
                            }
                        }
                        if (!A00.A01 && (!((Set) r102.getValue()).isEmpty())) {
                            A00.A01 = true;
                            A00.A02.post(A00);
                            Choreographer.getInstance().postFrameCallback(A00);
                        }
                    }
                }
            }
        }
    }

    public static final void A03(C249753kJ r4, Object obj) {
        if (r4 == null) {
            r4 = 1KZ.A01;
        }
        r4.ADG("recursivelyNotifyVisibleBoundsChanged");
        if (obj != null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(obj);
            while (!arrayDeque.isEmpty()) {
                Object pop = arrayDeque.pop();
                if (pop instanceof 2UA) {
                    ((2UA) pop).CsJ();
                } else if (pop instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) pop;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (-1 >= childCount) {
                            break;
                        }
                        arrayDeque.push(viewGroup.getChildAt(childCount));
                    }
                }
            }
        }
        r4.ASS();
    }
}
