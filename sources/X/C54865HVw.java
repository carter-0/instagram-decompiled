package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.HVw  reason: case insensitive filesystem */
public abstract class C54865HVw {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        View view;
        C3028165n r8;
        Integer num;
        C276544tV r1 = (C276544tV) r15.A01();
        Object A00 = r15.A00();
        0qQ.A0C(A00, C273654mx.A00(30));
        C276544tV r2 = (C276544tV) A00;
        if (r1 != null) {
            r8 = r1.A05(r14.A03);
            view = r8;
            while (true) {
                if (r8 != null) {
                    if (r8 instanceof C3028165n) {
                        break;
                    }
                    ViewParent parent = r8.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    r8 = (View) parent;
                } else {
                    break;
                }
            }
        } else {
            view = null;
        }
        r8 = null;
        C3028165n r82 = r8;
        if (r82 == null) {
            0wb.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteractionWithArgsV2", "ShowreelCompositionView is null");
            return null;
        }
        String A0H = r2.A0H();
        Integer[] A002 = AnonymousClass05K.A00(5);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = null;
                break;
            }
            num = A002[i];
            if (0qQ.A0K(C54769HSb.A00(num), A0H)) {
                break;
            }
            i++;
        }
        String A0K = r2.A0K(45);
        if (view == null || num == null || A0K == null) {
            0wb.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteractionWithArgsV2", "The argument is null");
            return null;
        }
        r82.A03(view, num, A0K, (int) r2.A02(51, 0.0f), (int) r2.A02(52, 0.0f), (int) r2.A02(46, 0.0f), r2.A03(35, -1));
        return null;
    }
}
