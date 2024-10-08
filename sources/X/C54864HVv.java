package X;

import android.view.View;
import android.view.ViewParent;
import java.util.List;

/* renamed from: X.HVv  reason: case insensitive filesystem */
public abstract class C54864HVv {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        View view;
        C3028165n r11;
        String str;
        Integer num;
        Integer num2;
        List list = r18.A00;
        C276544tV r1 = (C276544tV) list.get(0);
        C276544tV r8 = (C276544tV) list.get(1);
        Number number = (Number) list.get(2);
        Number number2 = (Number) list.get(3);
        Number number3 = (Number) list.get(4);
        if (r1 != null) {
            r11 = r1.A05(r17.A03);
            view = r11;
            while (true) {
                if (r11 != null) {
                    if (r11 instanceof C3028165n) {
                        break;
                    }
                    ViewParent parent = r11.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    r11 = (View) parent;
                } else {
                    break;
                }
            }
        } else {
            view = null;
        }
        r11 = null;
        C3028165n r112 = r11;
        if (r112 == null) {
            0wb.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteraction", "ShowreelCompositionView is null");
            return null;
        }
        if (r8 != null) {
            String A0F = r8.A0F();
            Integer[] A00 = AnonymousClass05K.A00(5);
            int length = A00.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = null;
                    break;
                }
                num = A00[i];
                if (0qQ.A0K(C54769HSb.A00(num), A0F)) {
                    break;
                }
                i++;
            }
            str = r8.A0D();
            num2 = Integer.valueOf(r8.A03(38, -1));
        } else {
            num2 = null;
            num = null;
            str = null;
        }
        if (view == null || num == null || str == null || number == null || number2 == null || number3 == null || num2 == null) {
            0wb.A03("BKBloksActionShowreelInvokeInteractionWithArgsImpl#InvokeInteraction", "The argument is null");
            return null;
        }
        r112.A03(view, num, str, number.intValue(), number2.intValue(), number3.intValue(), num2.intValue());
        return null;
    }
}
