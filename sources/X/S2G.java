package X;

import android.app.Activity;
import android.widget.TextView;
import java.util.LinkedList;

public final class S2G {
    public static S2G A03;
    public static boolean A04;
    public TextView A00;
    public StringBuilder A01 = AnonymousClass7TE.A1A();
    public LinkedList A02 = Pxe.A1A();

    public final void A00(String str) {
        if (A04 && this.A00 != null) {
            int i = 0;
            for (String add : 002.A0R(str, "\n").split("\n")) {
                this.A02.add(add);
            }
            StringBuilder sb = this.A01;
            sb.setLength(0);
            while (true) {
                LinkedList linkedList = this.A02;
                if (i < linkedList.size()) {
                    sb.append((String) linkedList.get(i));
                    sb.append("\n");
                    i++;
                } else {
                    ((Activity) this.A00.getContext()).runOnUiThread(new C12945TFe(this, sb.toString()));
                    return;
                }
            }
        }
    }
}
