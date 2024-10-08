package X;

import android.graphics.Color;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

public final class OJZ {
    public final ArrayList A00 = AnonymousClass7TE.A1C();

    public final void A00(Iterable iterable) {
        int i;
        0qQ.A0B(iterable, 0);
        Iterator it = iterable.iterator();
        Iterator A1G = AnonymousClass7TE.A1G(this.A00);
        while (A1G.hasNext()) {
            TextView textView = (TextView) AnonymousClass7TF.A0a(A1G);
            if (!it.hasNext()) {
                DbS.A1C(textView);
            } else {
                MZH mzh = (MZH) it.next();
                textView.setText(mzh.A01);
                int i2 = mzh.A00;
                if (i2 == 0) {
                    i = -65536;
                } else if (i2 == 1) {
                    i = Color.rgb(0, 125, 0);
                } else if (i2 == 2) {
                    i = -16776961;
                } else if (i2 == 3) {
                    i = -65281;
                } else if (i2 != 4) {
                    i = -7829368;
                } else {
                    i = Color.rgb(255, 100, 0);
                }
                textView.setTextColor(i);
            }
        }
    }
}
