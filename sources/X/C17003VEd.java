package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.VEd  reason: case insensitive filesystem */
public abstract class C17003VEd {
    public static void A00(C17522VZb vZb, boolean z) {
        View view;
        int i;
        TextView textView = vZb.A02;
        C17366VSt vSt = vZb.A04;
        if (z) {
            textView.setTextColor(-1);
            vZb.A03.setSelected(true);
            view = vZb.A01;
            i = vSt.A00;
        } else {
            textView.setTextColor(vSt.A01);
            vZb.A03.setSelected(false);
            view = vZb.A01;
            i = -1;
        }
        view.setBackgroundColor(i);
    }
}
