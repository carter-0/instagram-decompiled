package X;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.4Jj  reason: invalid class name and case insensitive filesystem */
public abstract class C263164Jj {
    public static final void A00(C256003v4 r1) {
        View A01;
        0qQ.A0B(r1, 0);
        C71662eb r12 = r1.A03;
        if (r12.A00 != null && (A01 = r12.A01()) != null) {
            A01.setVisibility(8);
        }
    }

    public static final void A01(C256003v4 r3) {
        View A01;
        0qQ.A0B(r3, 0);
        C71662eb r1 = r3.A03;
        if (r1.A00 != null && (A01 = r1.A01()) != null) {
            A01.setVisibility(0);
        }
    }

    public static final void A02(C256003v4 r5, List list, boolean z) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(list, 1);
        if (list.isEmpty() || !r5.A02) {
            A00(r5);
            return;
        }
        int i = r5.A00;
        if (i != 0) {
            r5.A00(i);
        }
        C71662eb r4 = r5.A03;
        TextView textView = (TextView) r4.A01();
        if (textView != null) {
            textView.setText(00k.A0P("\n", "", "", list, (0sP) null));
        }
        View A01 = r4.A01();
        if (A01 != null) {
            AnonymousClass0fU.A00(new I9z(r5), A01);
        }
        View A012 = r4.A01();
        if (A012 != null) {
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            A012.setVisibility(i2);
        }
    }
}
