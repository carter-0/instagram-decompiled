package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.PYT  reason: case insensitive filesystem */
public final class C73189PYT implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ List A01;

    public C73189PYT(TextView textView, List list) {
        this.A00 = textView;
        this.A01 = list;
    }

    public final void run() {
        List list;
        TextView textView = this.A00;
        int width = textView.getWidth();
        int i = 0;
        while (true) {
            list = this.A01;
            if (i < list.size() && Dbc.A00(textView, list, i) > ((float) width)) {
                i++;
            }
        }
        if (i >= list.size()) {
            i = DbT.A02(list, 1);
        }
        DbZ.A14(textView, list.get(i));
        textView.setVisibility(0);
    }
}
