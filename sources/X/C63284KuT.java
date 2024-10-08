package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.KuT  reason: case insensitive filesystem */
public abstract class C63284KuT {
    public static final C358248ab A00(Context context, LAQ laq) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(laq.A01);
        CharSequence charSequence = laq.A06;
        if (charSequence == null || charSequence.length() == 0) {
            A0Y.A08(laq.A00);
        } else {
            A0Y.A0q(charSequence);
        }
        Boolean bool = laq.A05;
        if (bool != null) {
            A0Y.A0s(bool.booleanValue());
        }
        C63772L6e l6e = laq.A04;
        if (l6e != null) {
            C358278ae r2 = l6e.A02;
            int i = l6e.A00;
            DialogInterface.OnClickListener onClickListener = l6e.A01;
            if (r2 != null) {
                A0Y.A0Q(onClickListener, r2, i);
            } else {
                A0Y.A0I(onClickListener, i);
            }
        }
        C63772L6e l6e2 = laq.A02;
        if (l6e2 != null) {
            C358278ae r22 = l6e2.A02;
            int i2 = l6e2.A00;
            DialogInterface.OnClickListener onClickListener2 = l6e2.A01;
            if (r22 != null) {
                A0Y.A0O(onClickListener2, r22, i2);
            } else {
                A0Y.A0G(onClickListener2, i2);
            }
        }
        C63772L6e l6e3 = laq.A03;
        if (l6e3 != null) {
            C358278ae r23 = l6e3.A02;
            int i3 = l6e3.A00;
            DialogInterface.OnClickListener onClickListener3 = l6e3.A01;
            if (r23 != null) {
                A0Y.A0P(onClickListener3, r23, i3);
            } else {
                A0Y.A0H(onClickListener3, i3);
                return A0Y;
            }
        }
        return A0Y;
    }
}
