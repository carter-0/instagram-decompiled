package X;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import java.util.concurrent.CopyOnWriteArrayList;

public final class W3V {
    public static int A00 = 250;
    public static boolean A01;
    public static final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public static final int A01(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 3005871) {
                if (hashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals(C273654mx.A00(232))) {
            return 0;
        }
        C13989Tnp.A1T("wrong overScrollMode: ", str);
        return 1;
    }

    public static final int A02(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        C13989Tnp.A1T("wrong snap alignment value: ", str);
        return 0;
    }

    public static final Point A03(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        C17556VaA reactScrollViewScrollState = ((C20878X2f) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.A00);
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int A0F = C13989Tnp.A0F(viewGroup) - viewGroup.getPaddingTop();
        Point point = reactScrollViewScrollState.A04;
        overScroller.fling(A00(viewGroup, viewGroup.getScrollX(), point.x, i), A00(viewGroup, viewGroup.getScrollY(), point.y, i2), i, i2, 0, i3, 0, i4, width / 2, A0F / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void A05(ViewGroup viewGroup, int i, int i2) {
        X63 x63 = (X63) viewGroup;
        ValueAnimator flingAnimator = x63.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            flingAnimator.addListener(new W3z(viewGroup, 0));
        }
        ((C20878X2f) viewGroup).getReactScrollViewScrollState().A04.set(i, i2);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i) {
            x63.Ewz(scrollX, i);
        }
        if (scrollY != i2) {
            x63.Ewz(scrollY, i2);
        }
    }

    public static final int A00(ViewGroup viewGroup, int i, int i2, int i3) {
        int i4;
        C17556VaA reactScrollViewScrollState = ((C20878X2f) viewGroup).getReactScrollViewScrollState();
        boolean z = false;
        if (i3 != 0) {
            i4 = i3 / Math.abs(i3);
        } else {
            i4 = 0;
        }
        if (i4 * (i2 - i) > 0) {
            z = true;
        }
        if (!reactScrollViewScrollState.A02 || (reactScrollViewScrollState.A01 && z)) {
            return i2;
        }
        return i;
    }

    public static final void A04(ViewGroup viewGroup) {
        A06(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    public static final void A06(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup.getId() % 2 == 0) {
            C17556VaA reactScrollViewScrollState = ((C20878X2f) viewGroup).getReactScrollViewScrollState();
            Point point = reactScrollViewScrollState.A05;
            if (!point.equals(i, i2)) {
                point.set(i, i2);
                if (reactScrollViewScrollState.A03 == 1) {
                    View A0G = C13988Tno.A0G(viewGroup);
                    if (A0G != null) {
                        A0G.getWidth();
                    }
                    viewGroup.getWidth();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [X.W0S] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(android.view.ViewGroup r12, java.lang.Integer r13, float r14, float r15) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r8 = r12
            X.X7Z r8 = (X.X7Z) r8
            int r2 = r8.getScrollEventThrottle()
            long r6 = (long) r2
            long r2 = r8.getLastScrollDispatchTime()
            long r4 = r0 - r2
            r2 = 17
            long r3 = java.lang.Math.max(r2, r4)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0099
            android.view.View r4 = X.C13988Tno.A0G(r12)
            if (r4 == 0) goto L_0x0099
            java.util.concurrent.CopyOnWriteArrayList r2 = A02
            java.util.Iterator r3 = r2.iterator()
        L_0x0028:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r3.next()
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            r2.get()
            goto L_0x0028
        L_0x0038:
            android.content.Context r3 = r12.getContext()
            r2 = 248(0xf8, float:3.48E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            X.0qQ.A0C(r3, r2)
            X.Q6H r3 = (X.Q6H) r3
            int r11 = com.facebook.react.uimanager.UIManagerHelper.A00(r3)
            X.X2e r10 = X.C13990Tnq.A0K(r12, r3)
            if (r10 == 0) goto L_0x0099
            int r9 = r12.getId()
            int r2 = r12.getScrollX()
            float r7 = (float) r2
            int r2 = r12.getScrollY()
            float r6 = (float) r2
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            int r3 = r12.getWidth()
            int r12 = r12.getHeight()
            X.0l2 r2 = X.UTN.A09
            java.lang.Object r2 = r2.A7A()
            X.UTN r2 = (X.UTN) r2
            if (r2 != 0) goto L_0x007e
            X.UTN r2 = new X.UTN
            r2.<init>()
        L_0x007e:
            r2.A0A(r11, r9)
            r2.A08 = r13
            r2.A00 = r7
            r2.A01 = r6
            r2.A02 = r14
            r2.A03 = r15
            r2.A05 = r5
            r2.A04 = r4
            r2.A07 = r3
            r2.A06 = r12
            r10.APe(r2)
            r8.setLastScrollDispatchTime(r0)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3V.A07(android.view.ViewGroup, java.lang.Integer, float, float):void");
    }
}
